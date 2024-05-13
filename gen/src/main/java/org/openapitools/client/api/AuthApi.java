package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AuthResponse;

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
public class AuthApi {
    private ApiClient apiClient;

    public AuthApi() {
        this(new ApiClient());
    }

    public AuthApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Authenticate
     * Authenticate to Gamestream Backup Service. This step is mandatory to acess backup management methods. Authentication is purely cookie based. The JWT Token returned is response body if purely informational.
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - authentication failed
     * @param username  (required)
     * @param password  (required)
     * @return AuthResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AuthResponse authPost(String username, String password) throws RestClientException {
        return authPostWithHttpInfo(username, password).getBody();
    }

    /**
     * Authenticate
     * Authenticate to Gamestream Backup Service. This step is mandatory to acess backup management methods. Authentication is purely cookie based. The JWT Token returned is response body if purely informational.
     * <p><b>200</b> - successful operation
     * <p><b>401</b> - authentication failed
     * @param username  (required)
     * @param password  (required)
     * @return ResponseEntity&lt;AuthResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AuthResponse> authPostWithHttpInfo(String username, String password) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling authPost");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'password' when calling authPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (username != null)
            localVarFormParams.add("username", username);
        if (password != null)
            localVarFormParams.add("password", password);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "sessionCookieAuth", "cookieAuth" };

        ParameterizedTypeReference<AuthResponse> localReturnType = new ParameterizedTypeReference<AuthResponse>() {};
        return apiClient.invokeAPI("/auth", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Logout
     * Logout from Gamestream Backup Service. When logout is successfull, the auuthorization cookie is automatically removed, and backup management methods are no longer accessible.
     * <p><b>200</b> - successful operation
     * @return String
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public String logoutPost() throws RestClientException {
        return logoutPostWithHttpInfo().getBody();
    }

    /**
     * Logout
     * Logout from Gamestream Backup Service. When logout is successfull, the auuthorization cookie is automatically removed, and backup management methods are no longer accessible.
     * <p><b>200</b> - successful operation
     * @return ResponseEntity&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<String> logoutPostWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/xhtml+xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "sessionCookieAuth", "cookieAuth" };

        ParameterizedTypeReference<String> localReturnType = new ParameterizedTypeReference<String>() {};
        return apiClient.invokeAPI("/logout", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
