package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetAccessTokenRequest;
import org.openapitools.client.model.SigninRequest;
import org.openapitools.client.model.Signuprequest;

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
public class AuthRoutesApi {
    private ApiClient apiClient;

    public AuthRoutesApi() {
        this(new ApiClient());
    }

    public AuthRoutesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * get-access-token
     * 
     * <p><b>200</b> - OK
     * @param userid  (required)
     * @param getAccessTokenRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getAccessToken(String userid, GetAccessTokenRequest getAccessTokenRequest) throws RestClientException {
        getAccessTokenWithHttpInfo(userid, getAccessTokenRequest);
    }

    /**
     * get-access-token
     * 
     * <p><b>200</b> - OK
     * @param userid  (required)
     * @param getAccessTokenRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getAccessTokenWithHttpInfo(String userid, GetAccessTokenRequest getAccessTokenRequest) throws RestClientException {
        Object localVarPostBody = getAccessTokenRequest;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling getAccessToken");
        }
        
        // verify the required parameter 'getAccessTokenRequest' is set
        if (getAccessTokenRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'getAccessTokenRequest' when calling getAccessToken");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/get-access-token/user/{userid}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * signin
     * 
     * <p><b>201</b> - Created
     * @param deviceID  (required)
     * @param signinRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void signin(String deviceID, SigninRequest signinRequest) throws RestClientException {
        signinWithHttpInfo(deviceID, signinRequest);
    }

    /**
     * signin
     * 
     * <p><b>201</b> - Created
     * @param deviceID  (required)
     * @param signinRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> signinWithHttpInfo(String deviceID, SigninRequest signinRequest) throws RestClientException {
        Object localVarPostBody = signinRequest;
        
        // verify the required parameter 'deviceID' is set
        if (deviceID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deviceID' when calling signin");
        }
        
        // verify the required parameter 'signinRequest' is set
        if (signinRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'signinRequest' when calling signin");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "deviceID", deviceID));
        

        final String[] localVarAccepts = { 
            "application/json; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/signin", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * signout
     * 
     * <p><b>200</b> - OK
     * @param deviceID  (required)
     * @param userid  (required)
     * @param authorization  (required)
     * @param contentType  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void signout(String deviceID, String userid, String authorization, String contentType) throws RestClientException {
        signoutWithHttpInfo(deviceID, userid, authorization, contentType);
    }

    /**
     * signout
     * 
     * <p><b>200</b> - OK
     * @param deviceID  (required)
     * @param userid  (required)
     * @param authorization  (required)
     * @param contentType  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> signoutWithHttpInfo(String deviceID, String userid, String authorization, String contentType) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'deviceID' is set
        if (deviceID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deviceID' when calling signout");
        }
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling signout");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling signout");
        }
        
        // verify the required parameter 'contentType' is set
        if (contentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contentType' when calling signout");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "deviceID", deviceID));
        

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
        return apiClient.invokeAPI("/signout/{userid}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * signup
     * 
     * <p><b>201</b> - Created
     * @param deviceID  (required)
     * @param signuprequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void signup(String deviceID, Signuprequest signuprequest) throws RestClientException {
        signupWithHttpInfo(deviceID, signuprequest);
    }

    /**
     * signup
     * 
     * <p><b>201</b> - Created
     * @param deviceID  (required)
     * @param signuprequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> signupWithHttpInfo(String deviceID, Signuprequest signuprequest) throws RestClientException {
        Object localVarPostBody = signuprequest;
        
        // verify the required parameter 'deviceID' is set
        if (deviceID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deviceID' when calling signup");
        }
        
        // verify the required parameter 'signuprequest' is set
        if (signuprequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'signuprequest' when calling signup");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "deviceID", deviceID));
        

        final String[] localVarAccepts = { 
            "application/json; charset=utf-8"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/signup", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * verify-access-token
     * 
     * <p><b>200</b> - OK
     * @param userid  (required)
     * @param authorization  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void verifyAccessToken(String userid, String authorization) throws RestClientException {
        verifyAccessTokenWithHttpInfo(userid, authorization);
    }

    /**
     * verify-access-token
     * 
     * <p><b>200</b> - OK
     * @param userid  (required)
     * @param authorization  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> verifyAccessTokenWithHttpInfo(String userid, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling verifyAccessToken");
        }
        
        // verify the required parameter 'authorization' is set
        if (authorization == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authorization' when calling verifyAccessToken");
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
        return apiClient.invokeAPI("/verify-access-token/user/{userid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
