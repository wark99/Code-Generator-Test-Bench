package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.PHPLoginUserPhpPostRequest;
import org.openapitools.client.model.PHPRegisterUserPhpPostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:33.856729607Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UserApi {
    private ApiClient apiClient;

    public UserApi() {
        this(new ApiClient());
    }

    public UserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete a user
     * This endpoint allows for the deletion of a user by providing the user&#39;s ID.
     * <p><b>200</b> - The user has been successfully deleted.
     * @param userid The ID of the user to be deleted. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void pHPDeleteUserPhpDelete(Integer userid) throws RestClientException {
        pHPDeleteUserPhpDeleteWithHttpInfo(userid);
    }

    /**
     * Delete a user
     * This endpoint allows for the deletion of a user by providing the user&#39;s ID.
     * <p><b>200</b> - The user has been successfully deleted.
     * @param userid The ID of the user to be deleted. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> pHPDeleteUserPhpDeleteWithHttpInfo(Integer userid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling pHPDeleteUserPhpDelete");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userid", userid));
        

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/PHP/deleteUser.php", HttpMethod.DELETE, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Log in a user
     * This endpoint allows users to log in by providing their login credentials.
     * <p><b>200</b> - The user has been successfully logged in.
     * @param phPLoginUserPhpPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void pHPLoginUserPhpPost(PHPLoginUserPhpPostRequest phPLoginUserPhpPostRequest) throws RestClientException {
        pHPLoginUserPhpPostWithHttpInfo(phPLoginUserPhpPostRequest);
    }

    /**
     * Log in a user
     * This endpoint allows users to log in by providing their login credentials.
     * <p><b>200</b> - The user has been successfully logged in.
     * @param phPLoginUserPhpPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> pHPLoginUserPhpPostWithHttpInfo(PHPLoginUserPhpPostRequest phPLoginUserPhpPostRequest) throws RestClientException {
        Object localVarPostBody = phPLoginUserPhpPostRequest;
        
        // verify the required parameter 'phPLoginUserPhpPostRequest' is set
        if (phPLoginUserPhpPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'phPLoginUserPhpPostRequest' when calling pHPLoginUserPhpPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/PHP/loginUser.php", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Register a new user
     * This endpoint allows for the registration of a new user by providing the necessary details.
     * <p><b>200</b> - The user has been successfully registered.
     * @param phPRegisterUserPhpPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void pHPRegisterUserPhpPost(PHPRegisterUserPhpPostRequest phPRegisterUserPhpPostRequest) throws RestClientException {
        pHPRegisterUserPhpPostWithHttpInfo(phPRegisterUserPhpPostRequest);
    }

    /**
     * Register a new user
     * This endpoint allows for the registration of a new user by providing the necessary details.
     * <p><b>200</b> - The user has been successfully registered.
     * @param phPRegisterUserPhpPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> pHPRegisterUserPhpPostWithHttpInfo(PHPRegisterUserPhpPostRequest phPRegisterUserPhpPostRequest) throws RestClientException {
        Object localVarPostBody = phPRegisterUserPhpPostRequest;
        
        // verify the required parameter 'phPRegisterUserPhpPostRequest' is set
        if (phPRegisterUserPhpPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'phPRegisterUserPhpPostRequest' when calling pHPRegisterUserPhpPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/PHP/registerUser.php", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
