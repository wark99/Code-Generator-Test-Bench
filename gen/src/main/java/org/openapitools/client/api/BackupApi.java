package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.RequestItemParameters;
import org.openapitools.client.model.RequestProfileParameters;
import org.openapitools.client.model.RequestUserSharedParameters;
import org.openapitools.client.model.RestoreDeleteParameters;
import org.openapitools.client.model.RestoreResponse;
import org.openapitools.client.model.UsersResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:22:32.669774675Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BackupApi {
    private ApiClient apiClient;

    public BackupApi() {
        this(new ApiClient());
    }

    public BackupApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete a save
     * Delete a save for a profile for a given user
     * <p><b>200</b> - successful operation
     * <p><b>500</b> - Request error
     * @param restoreDeleteParameters Request body to restore or delete a save of a profile for a given user (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object backupItemDeletePost(RestoreDeleteParameters restoreDeleteParameters) throws RestClientException {
        return backupItemDeletePostWithHttpInfo(restoreDeleteParameters).getBody();
    }

    /**
     * Delete a save
     * Delete a save for a profile for a given user
     * <p><b>200</b> - successful operation
     * <p><b>500</b> - Request error
     * @param restoreDeleteParameters Request body to restore or delete a save of a profile for a given user (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> backupItemDeletePostWithHttpInfo(RestoreDeleteParameters restoreDeleteParameters) throws RestClientException {
        Object localVarPostBody = restoreDeleteParameters;
        
        // verify the required parameter 'restoreDeleteParameters' is set
        if (restoreDeleteParameters == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'restoreDeleteParameters' when calling backupItemDeletePost");
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

        String[] localVarAuthNames = new String[] { "sessionCookieAuth", "cookieAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/backup/item/delete", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the list of saves
     * Get the list of saves for a profile for a given user
     * <p><b>200</b> - successful operation
     * <p><b>500</b> - Request error
     * @param requestItemParameters Request body to retrieve the list of saves of a profile for a given user (required)
     * @return UsersResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UsersResponse backupItemListPost(RequestItemParameters requestItemParameters) throws RestClientException {
        return backupItemListPostWithHttpInfo(requestItemParameters).getBody();
    }

    /**
     * Get the list of saves
     * Get the list of saves for a profile for a given user
     * <p><b>200</b> - successful operation
     * <p><b>500</b> - Request error
     * @param requestItemParameters Request body to retrieve the list of saves of a profile for a given user (required)
     * @return ResponseEntity&lt;UsersResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UsersResponse> backupItemListPostWithHttpInfo(RequestItemParameters requestItemParameters) throws RestClientException {
        Object localVarPostBody = requestItemParameters;
        
        // verify the required parameter 'requestItemParameters' is set
        if (requestItemParameters == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestItemParameters' when calling backupItemListPost");
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

        String[] localVarAuthNames = new String[] { "sessionCookieAuth", "cookieAuth" };

        ParameterizedTypeReference<UsersResponse> localReturnType = new ParameterizedTypeReference<UsersResponse>() {};
        return apiClient.invokeAPI("/backup/item/list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Restore a save
     * Restore a save for a profile for a given user
     * <p><b>200</b> - successful operation
     * <p><b>500</b> - Request error
     * @param restoreDeleteParameters Request body to restore or delete a save of a profile for a given user (required)
     * @return RestoreResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RestoreResponse backupItemRestorePost(RestoreDeleteParameters restoreDeleteParameters) throws RestClientException {
        return backupItemRestorePostWithHttpInfo(restoreDeleteParameters).getBody();
    }

    /**
     * Restore a save
     * Restore a save for a profile for a given user
     * <p><b>200</b> - successful operation
     * <p><b>500</b> - Request error
     * @param restoreDeleteParameters Request body to restore or delete a save of a profile for a given user (required)
     * @return ResponseEntity&lt;RestoreResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RestoreResponse> backupItemRestorePostWithHttpInfo(RestoreDeleteParameters restoreDeleteParameters) throws RestClientException {
        Object localVarPostBody = restoreDeleteParameters;
        
        // verify the required parameter 'restoreDeleteParameters' is set
        if (restoreDeleteParameters == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'restoreDeleteParameters' when calling backupItemRestorePost");
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

        String[] localVarAuthNames = new String[] { "sessionCookieAuth", "cookieAuth" };

        ParameterizedTypeReference<RestoreResponse> localReturnType = new ParameterizedTypeReference<RestoreResponse>() {};
        return apiClient.invokeAPI("/backup/item/restore", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the list of profiles
     * Get the list of profiles for a given user
     * <p><b>200</b> - successful operation
     * <p><b>500</b> - Request error
     * @param requestProfileParameters Request body to retrieve the list of profiles for a given user (required)
     * @return UsersResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UsersResponse backupProfileListPost(RequestProfileParameters requestProfileParameters) throws RestClientException {
        return backupProfileListPostWithHttpInfo(requestProfileParameters).getBody();
    }

    /**
     * Get the list of profiles
     * Get the list of profiles for a given user
     * <p><b>200</b> - successful operation
     * <p><b>500</b> - Request error
     * @param requestProfileParameters Request body to retrieve the list of profiles for a given user (required)
     * @return ResponseEntity&lt;UsersResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UsersResponse> backupProfileListPostWithHttpInfo(RequestProfileParameters requestProfileParameters) throws RestClientException {
        Object localVarPostBody = requestProfileParameters;
        
        // verify the required parameter 'requestProfileParameters' is set
        if (requestProfileParameters == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestProfileParameters' when calling backupProfileListPost");
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

        String[] localVarAuthNames = new String[] { "sessionCookieAuth", "cookieAuth" };

        ParameterizedTypeReference<UsersResponse> localReturnType = new ParameterizedTypeReference<UsersResponse>() {};
        return apiClient.invokeAPI("/backup/profile/list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the list of players
     * Get the list of players having at least one game save in the system.
     * <p><b>200</b> - successful operation
     * <p><b>500</b> - Request error
     * @param body Request body to retrieve the list of users (required)
     * @return UsersResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UsersResponse backupUserListPost(RequestUserSharedParameters body) throws RestClientException {
        return backupUserListPostWithHttpInfo(body).getBody();
    }

    /**
     * Get the list of players
     * Get the list of players having at least one game save in the system.
     * <p><b>200</b> - successful operation
     * <p><b>500</b> - Request error
     * @param body Request body to retrieve the list of users (required)
     * @return ResponseEntity&lt;UsersResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UsersResponse> backupUserListPostWithHttpInfo(RequestUserSharedParameters body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling backupUserListPost");
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

        String[] localVarAuthNames = new String[] { "sessionCookieAuth", "cookieAuth" };

        ParameterizedTypeReference<UsersResponse> localReturnType = new ParameterizedTypeReference<UsersResponse>() {};
        return apiClient.invokeAPI("/backup/user/list", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
