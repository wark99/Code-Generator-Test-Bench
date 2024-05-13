package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AccountDisplayResponse;
import org.openapitools.client.model.AccountResponse;
import org.openapitools.client.model.AccountsIdGet200Response;
import org.openapitools.client.model.AccountsRegisterPost200Response;
import org.openapitools.client.model.ErrorResponse;
import org.openapitools.client.model.LoginAccount;
import org.openapitools.client.model.PlaylistDisplayResponse;
import org.openapitools.client.model.RegistrationAccount;
import org.openapitools.client.model.TagResponse;
import org.openapitools.client.model.VideoDisplayResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:05.969984139Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * 
     * This endpoint retrieves all accounts. It requires a \&quot;secret\&quot; header with the value \&quot;meow\&quot;. &lt;br&gt; It responds with a list of all accounts in the system. (For debugging purposes)
     * <p><b>200</b> - OK
     * @param secret  (required)
     * @return List&lt;AccountResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AccountResponse> accountsGet(String secret) throws RestClientException {
        return accountsGetWithHttpInfo(secret).getBody();
    }

    /**
     * 
     * This endpoint retrieves all accounts. It requires a \&quot;secret\&quot; header with the value \&quot;meow\&quot;. &lt;br&gt; It responds with a list of all accounts in the system. (For debugging purposes)
     * <p><b>200</b> - OK
     * @param secret  (required)
     * @return ResponseEntity&lt;List&lt;AccountResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AccountResponse>> accountsGetWithHttpInfo(String secret) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'secret' is set
        if (secret == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'secret' when calling accountsGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (secret != null)
        localVarHeaderParams.add("secret", apiClient.parameterToString(secret));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<AccountResponse>> localReturnType = new ParameterizedTypeReference<List<AccountResponse>>() {};
        return apiClient.invokeAPI("/accounts", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * This endpoint retrieves a specific account&#39;s display details by ID. &lt;br&gt; It responds with the account&#39;s display details.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return AccountDisplayResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountDisplayResponse accountsIdCreatorGet(String id) throws RestClientException {
        return accountsIdCreatorGetWithHttpInfo(id).getBody();
    }

    /**
     * 
     * This endpoint retrieves a specific account&#39;s display details by ID. &lt;br&gt; It responds with the account&#39;s display details.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;AccountDisplayResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountDisplayResponse> accountsIdCreatorGetWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling accountsIdCreatorGet");
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

        ParameterizedTypeReference<AccountDisplayResponse> localReturnType = new ParameterizedTypeReference<AccountDisplayResponse>() {};
        return apiClient.invokeAPI("/accounts/{id}/creator", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * This endpoint deletes a specific account by ID. It requires a \&quot;token\&quot; header for authentication. &lt;br&gt; It responds with a NoContent response if the deletion is successful.
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * @param id  (required)
     * @param token  (required)
     * @return ErrorResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ErrorResponse accountsIdDelete(String id, String token) throws RestClientException {
        return accountsIdDeleteWithHttpInfo(id, token).getBody();
    }

    /**
     * 
     * This endpoint deletes a specific account by ID. It requires a \&quot;token\&quot; header for authentication. &lt;br&gt; It responds with a NoContent response if the deletion is successful.
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * @param id  (required)
     * @param token  (required)
     * @return ResponseEntity&lt;ErrorResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ErrorResponse> accountsIdDeleteWithHttpInfo(String id, String token) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling accountsIdDelete");
        }
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'token' when calling accountsIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (token != null)
        localVarHeaderParams.add("token", apiClient.parameterToString(token));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ErrorResponse> localReturnType = new ParameterizedTypeReference<ErrorResponse>() {};
        return apiClient.invokeAPI("/accounts/{id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * This endpoint allows a specific account to follow another account by ID. It requires \&quot;token\&quot; and \&quot;accountId\&quot; headers for authentication. &lt;br&gt; It responds with a success message if the follow action is successful.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param token  (required)
     * @param accountId  (required)
     * @return ErrorResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ErrorResponse accountsIdFollowPost(String id, String token, String accountId) throws RestClientException {
        return accountsIdFollowPostWithHttpInfo(id, token, accountId).getBody();
    }

    /**
     * 
     * This endpoint allows a specific account to follow another account by ID. It requires \&quot;token\&quot; and \&quot;accountId\&quot; headers for authentication. &lt;br&gt; It responds with a success message if the follow action is successful.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param token  (required)
     * @param accountId  (required)
     * @return ResponseEntity&lt;ErrorResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ErrorResponse> accountsIdFollowPostWithHttpInfo(String id, String token, String accountId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling accountsIdFollowPost");
        }
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'token' when calling accountsIdFollowPost");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling accountsIdFollowPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (token != null)
        localVarHeaderParams.add("token", apiClient.parameterToString(token));
        if (accountId != null)
        localVarHeaderParams.add("accountId", apiClient.parameterToString(accountId));

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ErrorResponse> localReturnType = new ParameterizedTypeReference<ErrorResponse>() {};
        return apiClient.invokeAPI("/accounts/{id}/follow", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * This endpoint retrieves a specific account&#39;s followed accounts by ID. It requires a \&quot;token\&quot; header for authentication. &lt;br&gt; It responds with the account&#39;s followed accounts.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param token  (required)
     * @return List&lt;AccountDisplayResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AccountDisplayResponse> accountsIdFollowingGet(String id, String token) throws RestClientException {
        return accountsIdFollowingGetWithHttpInfo(id, token).getBody();
    }

    /**
     * 
     * This endpoint retrieves a specific account&#39;s followed accounts by ID. It requires a \&quot;token\&quot; header for authentication. &lt;br&gt; It responds with the account&#39;s followed accounts.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param token  (required)
     * @return ResponseEntity&lt;List&lt;AccountDisplayResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AccountDisplayResponse>> accountsIdFollowingGetWithHttpInfo(String id, String token) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling accountsIdFollowingGet");
        }
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'token' when calling accountsIdFollowingGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (token != null)
        localVarHeaderParams.add("token", apiClient.parameterToString(token));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<AccountDisplayResponse>> localReturnType = new ParameterizedTypeReference<List<AccountDisplayResponse>>() {};
        return apiClient.invokeAPI("/accounts/{id}/following", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * This endpoint retrieves a specific account by ID. It requires a \&quot;token\&quot; header for authentication. &lt;br&gt; It responds with the account&#39;s details if the retrieval is successful.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param token  (required)
     * @return AccountsIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountsIdGet200Response accountsIdGet(String id, String token) throws RestClientException {
        return accountsIdGetWithHttpInfo(id, token).getBody();
    }

    /**
     * 
     * This endpoint retrieves a specific account by ID. It requires a \&quot;token\&quot; header for authentication. &lt;br&gt; It responds with the account&#39;s details if the retrieval is successful.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param token  (required)
     * @return ResponseEntity&lt;AccountsIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountsIdGet200Response> accountsIdGetWithHttpInfo(String id, String token) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling accountsIdGet");
        }
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'token' when calling accountsIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (token != null)
        localVarHeaderParams.add("token", apiClient.parameterToString(token));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AccountsIdGet200Response> localReturnType = new ParameterizedTypeReference<AccountsIdGet200Response>() {};
        return apiClient.invokeAPI("/accounts/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * This endpoint retrieves a specific account&#39;s playlists by ID. &lt;br&gt; It responds with the account&#39;s playlists.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return List&lt;PlaylistDisplayResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PlaylistDisplayResponse> accountsIdPlaylistsGet(String id) throws RestClientException {
        return accountsIdPlaylistsGetWithHttpInfo(id).getBody();
    }

    /**
     * 
     * This endpoint retrieves a specific account&#39;s playlists by ID. &lt;br&gt; It responds with the account&#39;s playlists.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;List&lt;PlaylistDisplayResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PlaylistDisplayResponse>> accountsIdPlaylistsGetWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling accountsIdPlaylistsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<PlaylistDisplayResponse>> localReturnType = new ParameterizedTypeReference<List<PlaylistDisplayResponse>>() {};
        return apiClient.invokeAPI("/accounts/{id}/playlists", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * This endpoint updates a specific account&#39;s details by ID. It requires a \&quot;token\&quot; header for authentication. &lt;br&gt; It responds with the updated account&#39;s details if the update is successful.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object accountsIdPost(String id) throws RestClientException {
        return accountsIdPostWithHttpInfo(id).getBody();
    }

    /**
     * 
     * This endpoint updates a specific account&#39;s details by ID. It requires a \&quot;token\&quot; header for authentication. &lt;br&gt; It responds with the updated account&#39;s details if the update is successful.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> accountsIdPostWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling accountsIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/accounts/{id}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * This endpoint retrieves recommended videos for a specific account by ID. It requires a \&quot;token\&quot; header for authentication and a \&quot;by\&quot; query parameter to specify the recommendation method. &lt;br&gt; It responds with a list of recommended videos.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param token  (required)
     * @param by  (required)
     * @return List&lt;VideoDisplayResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<VideoDisplayResponse> accountsIdRecommendedVideosGet(String id, String token, String by) throws RestClientException {
        return accountsIdRecommendedVideosGetWithHttpInfo(id, token, by).getBody();
    }

    /**
     * 
     * This endpoint retrieves recommended videos for a specific account by ID. It requires a \&quot;token\&quot; header for authentication and a \&quot;by\&quot; query parameter to specify the recommendation method. &lt;br&gt; It responds with a list of recommended videos.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param token  (required)
     * @param by  (required)
     * @return ResponseEntity&lt;List&lt;VideoDisplayResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<VideoDisplayResponse>> accountsIdRecommendedVideosGetWithHttpInfo(String id, String token, String by) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling accountsIdRecommendedVideosGet");
        }
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'token' when calling accountsIdRecommendedVideosGet");
        }
        
        // verify the required parameter 'by' is set
        if (by == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'by' when calling accountsIdRecommendedVideosGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "by", by));
        

        if (token != null)
        localVarHeaderParams.add("token", apiClient.parameterToString(token));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<VideoDisplayResponse>> localReturnType = new ParameterizedTypeReference<List<VideoDisplayResponse>>() {};
        return apiClient.invokeAPI("/accounts/{id}/recommended-videos", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * This endpoint retrieves a specific account&#39;s followed tags by ID. It requires a \&quot;token\&quot; header for authentication. &lt;br&gt; It responds with the account&#39;s followed tags.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param token  (required)
     * @return List&lt;TagResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TagResponse> accountsIdTagsGet(String id, String token) throws RestClientException {
        return accountsIdTagsGetWithHttpInfo(id, token).getBody();
    }

    /**
     * 
     * This endpoint retrieves a specific account&#39;s followed tags by ID. It requires a \&quot;token\&quot; header for authentication. &lt;br&gt; It responds with the account&#39;s followed tags.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param token  (required)
     * @return ResponseEntity&lt;List&lt;TagResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TagResponse>> accountsIdTagsGetWithHttpInfo(String id, String token) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling accountsIdTagsGet");
        }
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'token' when calling accountsIdTagsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (token != null)
        localVarHeaderParams.add("token", apiClient.parameterToString(token));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<TagResponse>> localReturnType = new ParameterizedTypeReference<List<TagResponse>>() {};
        return apiClient.invokeAPI("/accounts/{id}/tags", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * This endpoint allows a specific account to unfollow another account by ID. It requires \&quot;token\&quot; and \&quot;accountId\&quot; headers for authentication. &lt;br&gt; It responds with a success message if the unfollow action is successful.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param token  (required)
     * @param accountId  (required)
     * @return ErrorResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ErrorResponse accountsIdUnfollowPost(String id, String token, String accountId) throws RestClientException {
        return accountsIdUnfollowPostWithHttpInfo(id, token, accountId).getBody();
    }

    /**
     * 
     * This endpoint allows a specific account to unfollow another account by ID. It requires \&quot;token\&quot; and \&quot;accountId\&quot; headers for authentication. &lt;br&gt; It responds with a success message if the unfollow action is successful.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @param token  (required)
     * @param accountId  (required)
     * @return ResponseEntity&lt;ErrorResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ErrorResponse> accountsIdUnfollowPostWithHttpInfo(String id, String token, String accountId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling accountsIdUnfollowPost");
        }
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'token' when calling accountsIdUnfollowPost");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling accountsIdUnfollowPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (token != null)
        localVarHeaderParams.add("token", apiClient.parameterToString(token));
        if (accountId != null)
        localVarHeaderParams.add("accountId", apiClient.parameterToString(accountId));

        final String[] localVarAccepts = { 
            "*/*", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ErrorResponse> localReturnType = new ParameterizedTypeReference<ErrorResponse>() {};
        return apiClient.invokeAPI("/accounts/{id}/unfollow", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * This endpoint retrieves a specific account&#39;s videos by ID.&lt;br&gt; It responds with the account&#39;s videos.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return List&lt;VideoDisplayResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<VideoDisplayResponse> accountsIdVideosGet(String id) throws RestClientException {
        return accountsIdVideosGetWithHttpInfo(id).getBody();
    }

    /**
     * 
     * This endpoint retrieves a specific account&#39;s videos by ID.&lt;br&gt; It responds with the account&#39;s videos.
     * <p><b>200</b> - OK
     * @param id  (required)
     * @return ResponseEntity&lt;List&lt;VideoDisplayResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<VideoDisplayResponse>> accountsIdVideosGetWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling accountsIdVideosGet");
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

        ParameterizedTypeReference<List<VideoDisplayResponse>> localReturnType = new ParameterizedTypeReference<List<VideoDisplayResponse>>() {};
        return apiClient.invokeAPI("/accounts/{id}/videos", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * This endpoint allows an account to log in. It accepts a POST request with a body containing the account&#39;s email and password. &lt;br&gt; It responds with a token and account ID if the login is successful.
     * <p><b>200</b> - OK
     * @param loginAccount  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object accountsLoginPost(LoginAccount loginAccount) throws RestClientException {
        return accountsLoginPostWithHttpInfo(loginAccount).getBody();
    }

    /**
     * 
     * This endpoint allows an account to log in. It accepts a POST request with a body containing the account&#39;s email and password. &lt;br&gt; It responds with a token and account ID if the login is successful.
     * <p><b>200</b> - OK
     * @param loginAccount  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> accountsLoginPostWithHttpInfo(LoginAccount loginAccount) throws RestClientException {
        Object localVarPostBody = loginAccount;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/accounts/login", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * This endpoint allows a new account to register. It accepts a POST request with a body containing the account&#39;s username, email, and password. &lt;br&gt; It responds with the registered account&#39;s token and ID if the registration is successful.
     * <p><b>200</b> - OK
     * @param registrationAccount  (optional)
     * @return AccountsRegisterPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountsRegisterPost200Response accountsRegisterPost(RegistrationAccount registrationAccount) throws RestClientException {
        return accountsRegisterPostWithHttpInfo(registrationAccount).getBody();
    }

    /**
     * 
     * This endpoint allows a new account to register. It accepts a POST request with a body containing the account&#39;s username, email, and password. &lt;br&gt; It responds with the registered account&#39;s token and ID if the registration is successful.
     * <p><b>200</b> - OK
     * @param registrationAccount  (optional)
     * @return ResponseEntity&lt;AccountsRegisterPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountsRegisterPost200Response> accountsRegisterPostWithHttpInfo(RegistrationAccount registrationAccount) throws RestClientException {
        Object localVarPostBody = registrationAccount;
        

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

        ParameterizedTypeReference<AccountsRegisterPost200Response> localReturnType = new ParameterizedTypeReference<AccountsRegisterPost200Response>() {};
        return apiClient.invokeAPI("/accounts/register", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * This endpoint searches for accounts. It accepts a \&quot;q\&quot; query parameter for the search query and an optional \&quot;fuzzy\&quot; query parameter to enable fuzzy search. &lt;br&gt; It responds with a list of matching accounts.
     * <p><b>200</b> - OK
     * @param q  (required)
     * @param fuzzy  (optional)
     * @return List&lt;AccountDisplayResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AccountDisplayResponse> accountsSearchGet(String q, Boolean fuzzy) throws RestClientException {
        return accountsSearchGetWithHttpInfo(q, fuzzy).getBody();
    }

    /**
     * 
     * This endpoint searches for accounts. It accepts a \&quot;q\&quot; query parameter for the search query and an optional \&quot;fuzzy\&quot; query parameter to enable fuzzy search. &lt;br&gt; It responds with a list of matching accounts.
     * <p><b>200</b> - OK
     * @param q  (required)
     * @param fuzzy  (optional)
     * @return ResponseEntity&lt;List&lt;AccountDisplayResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AccountDisplayResponse>> accountsSearchGetWithHttpInfo(String q, Boolean fuzzy) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'q' when calling accountsSearchGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "q", q));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fuzzy", fuzzy));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<AccountDisplayResponse>> localReturnType = new ParameterizedTypeReference<List<AccountDisplayResponse>>() {};
        return apiClient.invokeAPI("/accounts/search", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
