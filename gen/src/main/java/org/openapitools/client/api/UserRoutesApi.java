package org.openapitools.client.api;

import org.openapitools.client.ApiClient;


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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:50.441407861Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UserRoutesApi {
    private ApiClient apiClient;

    public UserRoutesApi() {
        this(new ApiClient());
    }

    public UserRoutesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * deactivate-user
     * 
     * <p><b>200</b> - OK
     * @param userid  (required)
     * @param authorization  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deactivateUser(String userid, String authorization) throws RestClientException {
        deactivateUserWithHttpInfo(userid, authorization);
    }

    /**
     * deactivate-user
     * 
     * <p><b>200</b> - OK
     * @param userid  (required)
     * @param authorization  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deactivateUserWithHttpInfo(String userid, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling deactivateUser");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling deactivateUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/profile/deactivate-user/user/{userid}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * get-user-details
     * 
     * <p><b>200</b> - OK
     * @param userid  (required)
     * @param authorization  (required)
     * @param contentType  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getUserDetails(String userid, String authorization, String contentType) throws RestClientException {
        getUserDetailsWithHttpInfo(userid, authorization, contentType);
    }

    /**
     * get-user-details
     * 
     * <p><b>200</b> - OK
     * @param userid  (required)
     * @param authorization  (required)
     * @param contentType  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getUserDetailsWithHttpInfo(String userid, String authorization, String contentType) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling getUserDetails");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling getUserDetails");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contentType' when calling getUserDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));

        final String[] localVarAccepts = { 
            "application/json; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/profile/get-user-details/user/{userid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * get-user-profile-picture
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void profileGetUserProfilePictureUserUseridGet(String userid, String authorization) throws RestClientException {
        profileGetUserProfilePictureUserUseridGetWithHttpInfo(userid, authorization);
    }

    /**
     * get-user-profile-picture
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> profileGetUserProfilePictureUserUseridGetWithHttpInfo(String userid, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling profileGetUserProfilePictureUserUseridGet");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling profileGetUserProfilePictureUserUseridGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/profile/get-user-profile-picture/user/{userid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * get-user-status
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void profileGetUserStatusUserUseridGet(String userid, String authorization) throws RestClientException {
        profileGetUserStatusUserUseridGetWithHttpInfo(userid, authorization);
    }

    /**
     * get-user-status
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> profileGetUserStatusUserUseridGetWithHttpInfo(String userid, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling profileGetUserStatusUserUseridGet");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling profileGetUserStatusUserUseridGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/profile/get-user-status/user/{userid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * update-user-profile-picture
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (required)
     * @param body  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void profileUpdateUserProfilePictureUserUseridPut(String userid, String authorization, Object body) throws RestClientException {
        profileUpdateUserProfilePictureUserUseridPutWithHttpInfo(userid, authorization, body);
    }

    /**
     * update-user-profile-picture
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (required)
     * @param body  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> profileUpdateUserProfilePictureUserUseridPutWithHttpInfo(String userid, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling profileUpdateUserProfilePictureUserUseridPut");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling profileUpdateUserProfilePictureUserUseridPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/profile/update-user-profile-picture/user/{userid}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * update-user-status
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (required)
     * @param body  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void profileUpdateUserStatusUserUseridPut(String userid, String authorization, Object body) throws RestClientException {
        profileUpdateUserStatusUserUseridPutWithHttpInfo(userid, authorization, body);
    }

    /**
     * update-user-status
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (required)
     * @param body  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> profileUpdateUserStatusUserUseridPutWithHttpInfo(String userid, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling profileUpdateUserStatusUserUseridPut");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling profileUpdateUserStatusUserUseridPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/profile/update-user-status/user/{userid}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
