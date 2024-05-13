package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.io.File;
import org.openapitools.client.model.WsgPublicNabV1UserIdAbContactsContactIdPicturePutRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:14.227374673Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * Get account alias 52
     * 
     * <p><b>200</b> - Successful response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param manageStorage  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1AccountAliasesUserIdGet(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Boolean manageStorage) throws RestClientException {
        return wsgPublicNabV1AccountAliasesUserIdGetWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, manageStorage).getBody();
    }

    /**
     * Get account alias 52
     * 
     * <p><b>200</b> - Successful response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param manageStorage  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1AccountAliasesUserIdGetWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Boolean manageStorage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1AccountAliasesUserIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "manageStorage", manageStorage));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/account/aliases/{userId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post Create token account 51 pending
     * This method is used to generate a token and called by the tablet device
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Post Create token account response
     * <p><b>404</b> - Post Create token account response
     * <p><b>500</b> - Internal Server Error
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS      | ATTRIBUTES | DESCRIPTION                                       | REQUIRED | |---------------|------------|---------------------------------------------------|----------| | deviceaddress |            | the account alias for which token will be created | YES      |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1AccountCreatetokenPost(String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1AccountCreatetokenPostWithHttpInfo(xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Post Create token account 51 pending
     * This method is used to generate a token and called by the tablet device
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Post Create token account response
     * <p><b>404</b> - Post Create token account response
     * <p><b>500</b> - Internal Server Error
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS      | ATTRIBUTES | DESCRIPTION                                       | REQUIRED | |---------------|------------|---------------------------------------------------|----------| | deviceaddress |            | the account alias for which token will be created | YES      |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1AccountCreatetokenPostWithHttpInfo(String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/account/createtoken", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Account 5
     * This method is used to retrieve all the account aliases and its corresponding f1Username related to a MDN. Usually used by tablet client.
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param manageStorage  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1AccountUserIdGet(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Boolean manageStorage) throws RestClientException {
        return wsgPublicNabV1AccountUserIdGetWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, manageStorage).getBody();
    }

    /**
     * Get Account 5
     * This method is used to retrieve all the account aliases and its corresponding f1Username related to a MDN. Usually used by tablet client.
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param manageStorage  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1AccountUserIdGetWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Boolean manageStorage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1AccountUserIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "manageStorage", manageStorage));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/account/{userId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get accounts sync status 48 pending
     * 
     * <p><b>200</b> - Successful response
     * @param f1UserName  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1AccountsF1UserNameSyncStatusGet(String f1UserName, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1AccountsF1UserNameSyncStatusGetWithHttpInfo(f1UserName, xF1ClientAuthorization, authorizationDomain, content, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get accounts sync status 48 pending
     * 
     * <p><b>200</b> - Successful response
     * @param f1UserName  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1AccountsF1UserNameSyncStatusGetWithHttpInfo(String f1UserName, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'f1UserName' is set
        if (f1UserName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'f1UserName' when calling wsgPublicNabV1AccountsF1UserNameSyncStatusGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("f1UserName", f1UserName);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (content != null)
        localVarHeaderParams.add("Content", apiClient.parameterToString(content));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/accounts/{f1UserName}/syncStatus", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put Cloud Data internet access 107
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - OK
     * <p><b>422</b> - OK
     * @param userId  (required)
     * @param contentType  (optional)
     * @param accept  (optional)
     * @param authorizationDomain  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1CloudDataUserIdPut(String userId, String contentType, String accept, String authorizationDomain, String xF1ClientAuthorization, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1CloudDataUserIdPutWithHttpInfo(userId, contentType, accept, authorizationDomain, xF1ClientAuthorization, authorization, body).getBody();
    }

    /**
     * Put Cloud Data internet access 107
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b> - OK
     * <p><b>422</b> - OK
     * @param userId  (required)
     * @param contentType  (optional)
     * @param accept  (optional)
     * @param authorizationDomain  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1CloudDataUserIdPutWithHttpInfo(String userId, String contentType, String accept, String authorizationDomain, String xF1ClientAuthorization, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1CloudDataUserIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
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

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/cloud/data/{userId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * get device autoprovision 108 validation required
     * 
     * <p><b>200</b> - OK
     * @param userId  (required)
     * @param lang  (required)
     * @param channel  (required)
     * @param accept  (optional)
     * @param xSncrClientVersion  (optional)
     * @param xSncrClientPlatform  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param contentType  (optional)
     * @param authorizationDomain  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1DeviceUserIdAutoprovisionGet(String userId, String lang, String channel, String accept, String xSncrClientVersion, String xSncrClientPlatform, String xF1ClientAuthorization, String contentType, String authorizationDomain, String authorization) throws RestClientException {
        return wsgPublicNabV1DeviceUserIdAutoprovisionGetWithHttpInfo(userId, lang, channel, accept, xSncrClientVersion, xSncrClientPlatform, xF1ClientAuthorization, contentType, authorizationDomain, authorization).getBody();
    }

    /**
     * get device autoprovision 108 validation required
     * 
     * <p><b>200</b> - OK
     * @param userId  (required)
     * @param lang  (required)
     * @param channel  (required)
     * @param accept  (optional)
     * @param xSncrClientVersion  (optional)
     * @param xSncrClientPlatform  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param contentType  (optional)
     * @param authorizationDomain  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1DeviceUserIdAutoprovisionGetWithHttpInfo(String userId, String lang, String channel, String accept, String xSncrClientVersion, String xSncrClientPlatform, String xF1ClientAuthorization, String contentType, String authorizationDomain, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1DeviceUserIdAutoprovisionGet");
        }
        
        // verify the required parameter 'lang' is set
        if (lang == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lang' when calling wsgPublicNabV1DeviceUserIdAutoprovisionGet");
        }
        
        // verify the required parameter 'channel' is set
        if (channel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channel' when calling wsgPublicNabV1DeviceUserIdAutoprovisionGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "lang", lang));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "channel", channel));
        

        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));
        if (xSncrClientVersion != null)
        localVarHeaderParams.add("x-sncr-client-version", apiClient.parameterToString(xSncrClientVersion));
        if (xSncrClientPlatform != null)
        localVarHeaderParams.add("x-sncr-client-platform", apiClient.parameterToString(xSncrClientPlatform));
        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/device/{userId}/autoprovision", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get share link contacts 75 not executed pending
     * This method is used for retrieving shareLink contacts.
     * <p><b>200</b> - Post create Address Book response
     * <p><b>400</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>403</b> - Post create Address Book response
     * <p><b>500</b> - Post create Address Book response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1ExtsharesShareIdContactsContactItemGuidGet(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1ExtsharesShareIdContactsContactItemGuidGetWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get share link contacts 75 not executed pending
     * This method is used for retrieving shareLink contacts.
     * <p><b>200</b> - Post create Address Book response
     * <p><b>400</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>403</b> - Post create Address Book response
     * <p><b>500</b> - Post create Address Book response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1ExtsharesShareIdContactsContactItemGuidGetWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1ExtsharesShareIdContactsContactItemGuidGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/extshares/{shareId}/contacts/{contactItemGuid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get ext shares share id contacts picture 76 not executed pending
     * 
     * <p><b>200</b> - Get ext shares share id contacts picture response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1ExtsharesShareIdContactsContactItemGuidPictureGet(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1ExtsharesShareIdContactsContactItemGuidPictureGetWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get ext shares share id contacts picture 76 not executed pending
     * 
     * <p><b>200</b> - Get ext shares share id contacts picture response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1ExtsharesShareIdContactsContactItemGuidPictureGetWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1ExtsharesShareIdContactsContactItemGuidPictureGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/extshares/{shareId}/contacts/{contactItemGuid}/picture", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get ext shares share id contacts picture id 77 not executed pending
     * 
     * <p><b>200</b> - Get ext shares share id contacts picture id response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1ExtsharesShareIdContactsContactItemGuidPicturePictureIdGet(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1ExtsharesShareIdContactsContactItemGuidPicturePictureIdGetWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get ext shares share id contacts picture id 77 not executed pending
     * 
     * <p><b>200</b> - Get ext shares share id contacts picture id response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1ExtsharesShareIdContactsContactItemGuidPicturePictureIdGetWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1ExtsharesShareIdContactsContactItemGuidPicturePictureIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/extshares/{shareId}/contacts/{contactItemGuid}/picture/{pictureId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get share link contacts 74 not executed pending
     * This method is used for retrieving shareLink contacts.
     * <p><b>200</b> - Post create Address Book response
     * <p><b>400</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>403</b> - Post create Address Book response
     * <p><b>500</b> - Post create Address Book response
     * @param userId  (required)
     * @param rangebegin Specifies index of the starting contact item after sorting (optional)
     * @param maxnum Specifies maximum number of contact items to fetch after sorting.   NOTE:   1.Range Filtering is requested through the query parameters \&quot;rangebegin\&quot; and \&quot;maxnum\&quot; Example: rangebegin&#x3D;0&amp;maxnum&#x3D;20 (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1ExtsharesShareIdContactsGet(String userId, String rangebegin, String maxnum, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1ExtsharesShareIdContactsGetWithHttpInfo(userId, rangebegin, maxnum, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get share link contacts 74 not executed pending
     * This method is used for retrieving shareLink contacts.
     * <p><b>200</b> - Post create Address Book response
     * <p><b>400</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>403</b> - Post create Address Book response
     * <p><b>500</b> - Post create Address Book response
     * @param userId  (required)
     * @param rangebegin Specifies index of the starting contact item after sorting (optional)
     * @param maxnum Specifies maximum number of contact items to fetch after sorting.   NOTE:   1.Range Filtering is requested through the query parameters \&quot;rangebegin\&quot; and \&quot;maxnum\&quot; Example: rangebegin&#x3D;0&amp;maxnum&#x3D;20 (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1ExtsharesShareIdContactsGetWithHttpInfo(String userId, String rangebegin, String maxnum, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1ExtsharesShareIdContactsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "rangebegin", rangebegin));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxnum", maxnum));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/extshares/{shareId}/contacts", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get share link contacts 78 not executed pending
     * This method is used for retrieving the share link groups.
     * <p><b>200</b> - Post create Address Book response
     * <p><b>400</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>403</b> - Post create Address Book response
     * <p><b>500</b> - Post create Address Book response
     * @param userId  (required)
     * @param rangebegin Specifies index of the starting contact item after sorting (optional)
     * @param maxnum Specifies maximum number of contact items to fetch after sorting.   NOTE:   1.Range Filtering is requested through the query parameters \&quot;rangebegin\&quot; and \&quot;maxnum\&quot; Example: rangebegin&#x3D;0&amp;maxnum&#x3D;20 (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1ExtsharesShareIdGroupsGet(String userId, String rangebegin, String maxnum, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1ExtsharesShareIdGroupsGetWithHttpInfo(userId, rangebegin, maxnum, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get share link contacts 78 not executed pending
     * This method is used for retrieving the share link groups.
     * <p><b>200</b> - Post create Address Book response
     * <p><b>400</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>403</b> - Post create Address Book response
     * <p><b>500</b> - Post create Address Book response
     * @param userId  (required)
     * @param rangebegin Specifies index of the starting contact item after sorting (optional)
     * @param maxnum Specifies maximum number of contact items to fetch after sorting.   NOTE:   1.Range Filtering is requested through the query parameters \&quot;rangebegin\&quot; and \&quot;maxnum\&quot; Example: rangebegin&#x3D;0&amp;maxnum&#x3D;20 (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1ExtsharesShareIdGroupsGetWithHttpInfo(String userId, String rangebegin, String maxnum, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1ExtsharesShareIdGroupsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "rangebegin", rangebegin));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxnum", maxnum));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/extshares/{shareId}/groups", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get share link contacts 79 not executed pending
     * This method is used for retrieving a share link group.
     * <p><b>200</b> - Post create Address Book response
     * <p><b>400</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>403</b> - Post create Address Book response
     * <p><b>500</b> - Post create Address Book response
     * @param userId  (required)
     * @param groupItemGuid  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1ExtsharesShareIdGroupsGroupItemGuidGet(String userId, String groupItemGuid, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1ExtsharesShareIdGroupsGroupItemGuidGetWithHttpInfo(userId, groupItemGuid, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get share link contacts 79 not executed pending
     * This method is used for retrieving a share link group.
     * <p><b>200</b> - Post create Address Book response
     * <p><b>400</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>403</b> - Post create Address Book response
     * <p><b>500</b> - Post create Address Book response
     * @param userId  (required)
     * @param groupItemGuid  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1ExtsharesShareIdGroupsGroupItemGuidGetWithHttpInfo(String userId, String groupItemGuid, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1ExtsharesShareIdGroupsGroupItemGuidGet");
        }
        
        // verify the required parameter 'groupItemGuid' is set
        if (groupItemGuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupItemGuid' when calling wsgPublicNabV1ExtsharesShareIdGroupsGroupItemGuidGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("groupItemGuid", groupItemGuid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/extshares/{shareId}/groups/{groupItemGuid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get ext shares share id groups picture id 77 not executed pending
     * 
     * <p><b>200</b> - Get ext shares share id groups picture id response
     * @param userId  (required)
     * @param groupItemGuid  (required)
     * @param groupItemGuid2  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1ExtsharesShareIdGroupsGroupItemGuidIdPicturePictureIdGet(String userId, String groupItemGuid, String groupItemGuid2, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1ExtsharesShareIdGroupsGroupItemGuidIdPicturePictureIdGetWithHttpInfo(userId, groupItemGuid, groupItemGuid2, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get ext shares share id groups picture id 77 not executed pending
     * 
     * <p><b>200</b> - Get ext shares share id groups picture id response
     * @param userId  (required)
     * @param groupItemGuid  (required)
     * @param groupItemGuid2  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1ExtsharesShareIdGroupsGroupItemGuidIdPicturePictureIdGetWithHttpInfo(String userId, String groupItemGuid, String groupItemGuid2, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1ExtsharesShareIdGroupsGroupItemGuidIdPicturePictureIdGet");
        }
        
        // verify the required parameter 'groupItemGuid' is set
        if (groupItemGuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupItemGuid' when calling wsgPublicNabV1ExtsharesShareIdGroupsGroupItemGuidIdPicturePictureIdGet");
        }
        
        // verify the required parameter 'groupItemGuid2' is set
        if (groupItemGuid2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupItemGuid2' when calling wsgPublicNabV1ExtsharesShareIdGroupsGroupItemGuidIdPicturePictureIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("groupItemGuid", groupItemGuid);
        uriVariables.put("groupItemGuid", groupItemGuid2);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/extshares/{shareId}/groups/{groupItemGuidId}/picture/{pictureId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete Family Cloud Members 8 pending
     * The owner can remove FamilyCloudAccepted member/all members from the group. Deleted member/members will be available in the NotAccepted list after removing.   When Owner removes the member from the family cloud, member&#39;s media account will be archived and put into ContactsOnly mode and member entry will be removed from Media(Yet to decide API).   To dismantle all the members from the family, the client should not send the payload. If payload exists then the members from payload will only be considered.  
     * <p><b>200</b> - Successful response
     * <p><b>422</b> - 
     * @param userId Owner Mdn (required)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1FamilycloudUserIdMembersDelete(String userId, String authorizationDomain, String contentType, String xF1ClientAuthorization, String authorization, String body) throws RestClientException {
        return wsgPublicNabV1FamilycloudUserIdMembersDeleteWithHttpInfo(userId, authorizationDomain, contentType, xF1ClientAuthorization, authorization, body).getBody();
    }

    /**
     * Delete Family Cloud Members 8 pending
     * The owner can remove FamilyCloudAccepted member/all members from the group. Deleted member/members will be available in the NotAccepted list after removing.   When Owner removes the member from the family cloud, member&#39;s media account will be archived and put into ContactsOnly mode and member entry will be removed from Media(Yet to decide API).   To dismantle all the members from the family, the client should not send the payload. If payload exists then the members from payload will only be considered.  
     * <p><b>200</b> - Successful response
     * <p><b>422</b> - 
     * @param userId Owner Mdn (required)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1FamilycloudUserIdMembersDeleteWithHttpInfo(String userId, String authorizationDomain, String contentType, String xF1ClientAuthorization, String authorization, String body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1FamilycloudUserIdMembersDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
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

        String[] localVarAuthNames = new String[] { "familyCloudAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/familycloud/{userId}/members", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Family Cloud Members 6
     * 
     * <p><b>200</b> - Successful response
     * <p><b>422</b> - 
     * @param userId  (required)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1FamilycloudUserIdMembersGet(String userId, String authorizationDomain, String contentType, String xF1ClientAuthorization, String authorization) throws RestClientException {
        return wsgPublicNabV1FamilycloudUserIdMembersGetWithHttpInfo(userId, authorizationDomain, contentType, xF1ClientAuthorization, authorization).getBody();
    }

    /**
     * Get Family Cloud Members 6
     * 
     * <p><b>200</b> - Successful response
     * <p><b>422</b> - 
     * @param userId  (required)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1FamilycloudUserIdMembersGetWithHttpInfo(String userId, String authorizationDomain, String contentType, String xF1ClientAuthorization, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1FamilycloudUserIdMembersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "familyCloudAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/familycloud/{userId}/members", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put update Family Cloud Members 7
     * The only Owner can update member details from manage family screen and the details that can be updated are status/display name.   * The owner can update owners display name   * The owner can update the member display name/update status to Invite/Cancel Invite   * The owner can update the member plan type . In the request if plan.type &#x3D;Hexagon , then account gets updated with FH2 Feature code, else account will be updated in FC2.  
     * <p><b>200</b> - Successful response
     * <p><b>422</b> - 
     * @param userId Owner Mdn (required)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1FamilycloudUserIdMembersPut(String userId, String authorizationDomain, String contentType, String xF1ClientAuthorization, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1FamilycloudUserIdMembersPutWithHttpInfo(userId, authorizationDomain, contentType, xF1ClientAuthorization, authorization, body).getBody();
    }

    /**
     * Put update Family Cloud Members 7
     * The only Owner can update member details from manage family screen and the details that can be updated are status/display name.   * The owner can update owners display name   * The owner can update the member display name/update status to Invite/Cancel Invite   * The owner can update the member plan type . In the request if plan.type &#x3D;Hexagon , then account gets updated with FH2 Feature code, else account will be updated in FC2.  
     * <p><b>200</b> - Successful response
     * <p><b>422</b> - 
     * @param userId Owner Mdn (required)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1FamilycloudUserIdMembersPutWithHttpInfo(String userId, String authorizationDomain, String contentType, String xF1ClientAuthorization, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1FamilycloudUserIdMembersPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
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

        String[] localVarAuthNames = new String[] { "familyCloudAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/familycloud/{userId}/members", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete Group Members 4
     * The owner of a shared cloud can call this api to remove accepted members, and to cancel invites.   When a member is removed from a shared cloud, the group data are updated in NAB and GQM, then the cloud (media) account is archived, and the NAB account status changed to ContactsOnly (if wireless).   To remove specific members from a group, the client must call this api with a payload listing those members.   To dismantle the whole group, the client must call this api without any payload.   Note: this api usually removes members completely from the group data, but Family Cloud is a special case, because we cannot cancel their entitlement to a shared cloud in Verizon; hence if this api is used to removed a Family Cloud user from a group, they will remain in the group data with status \&quot;NotAccepted\&quot;    Remove one or more members from a group   Members who were enrolled, or who have accepted their invite, can be removed; unaccepted invites can be cancelled  
     * <p><b>200</b> - Successful response
     * @param cloudOwnerID  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorization userType can be MDN/CID/OTT (optional)
     * @param authorizationDomain  (optional)
     * @param accept  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param acceptEncoding Not required if its SSO access (optional)
     * @param xSncrClientVersion Not required if its SSO access (optional)
     * @param xSNCRAppId Can be guid (optional)
     * @param authorization2  (optional)
     * @param body These properties appear in the request body, to describe each group member being removed from a group  | Name       | Required | Allowed Values                                                 | Description                                                                                                                                                                                                                                                                                                         | |------------|----------|----------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | userId     | Y        | (any VZW MDN) (any VZT CID) (any OTT GUID) (any email address) | The customer ID                                                                                                                                                                                                                                                                                                     | | userType   | Y        | \&quot;MDN\&quot; \&quot;CID\&quot; \&quot;OTT\&quot; \&quot;EMAIL\&quot;                                      | The customer ID type                                                                                                                                                                                                                                                                                                | | type       | Y        | \&quot;owner\&quot; \&quot;manager\&quot; \&quot;member\&quot;                                     | ??                                                                                                                                                                                                                                                                                                                  | | status     | Y        | \&quot;cancelInvite\&quot; \&quot;remove\&quot;                                        | An instruction for how to remove this member \&quot;cancelInvite\&quot;: NAB will cancel the unaccepted invite(s); if an invitee tries to accept later, they will see an error \&quot;remove\&quot;: NAB will remove the accepted / enrolled member(s), instantly freeing up seat(s) in the group, and archiving the given cloud account(s) | | attributes | N        | \&quot;*\&quot;:\&quot;*\&quot;                                                        | Not used                                                                                                                                                                                                                                                                                                            |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1GroupCloudOwnerIDMembersDelete(String cloudOwnerID, String xF1ClientAuthorization, String authorization, String authorizationDomain, String accept, String content, String xClientSNCRPlatform, String acceptEncoding, String xSncrClientVersion, String xSNCRAppId, String authorization2, String body) throws RestClientException {
        return wsgPublicNabV1GroupCloudOwnerIDMembersDeleteWithHttpInfo(cloudOwnerID, xF1ClientAuthorization, authorization, authorizationDomain, accept, content, xClientSNCRPlatform, acceptEncoding, xSncrClientVersion, xSNCRAppId, authorization2, body).getBody();
    }

    /**
     * Delete Group Members 4
     * The owner of a shared cloud can call this api to remove accepted members, and to cancel invites.   When a member is removed from a shared cloud, the group data are updated in NAB and GQM, then the cloud (media) account is archived, and the NAB account status changed to ContactsOnly (if wireless).   To remove specific members from a group, the client must call this api with a payload listing those members.   To dismantle the whole group, the client must call this api without any payload.   Note: this api usually removes members completely from the group data, but Family Cloud is a special case, because we cannot cancel their entitlement to a shared cloud in Verizon; hence if this api is used to removed a Family Cloud user from a group, they will remain in the group data with status \&quot;NotAccepted\&quot;    Remove one or more members from a group   Members who were enrolled, or who have accepted their invite, can be removed; unaccepted invites can be cancelled  
     * <p><b>200</b> - Successful response
     * @param cloudOwnerID  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorization userType can be MDN/CID/OTT (optional)
     * @param authorizationDomain  (optional)
     * @param accept  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param acceptEncoding Not required if its SSO access (optional)
     * @param xSncrClientVersion Not required if its SSO access (optional)
     * @param xSNCRAppId Can be guid (optional)
     * @param authorization2  (optional)
     * @param body These properties appear in the request body, to describe each group member being removed from a group  | Name       | Required | Allowed Values                                                 | Description                                                                                                                                                                                                                                                                                                         | |------------|----------|----------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | userId     | Y        | (any VZW MDN) (any VZT CID) (any OTT GUID) (any email address) | The customer ID                                                                                                                                                                                                                                                                                                     | | userType   | Y        | \&quot;MDN\&quot; \&quot;CID\&quot; \&quot;OTT\&quot; \&quot;EMAIL\&quot;                                      | The customer ID type                                                                                                                                                                                                                                                                                                | | type       | Y        | \&quot;owner\&quot; \&quot;manager\&quot; \&quot;member\&quot;                                     | ??                                                                                                                                                                                                                                                                                                                  | | status     | Y        | \&quot;cancelInvite\&quot; \&quot;remove\&quot;                                        | An instruction for how to remove this member \&quot;cancelInvite\&quot;: NAB will cancel the unaccepted invite(s); if an invitee tries to accept later, they will see an error \&quot;remove\&quot;: NAB will remove the accepted / enrolled member(s), instantly freeing up seat(s) in the group, and archiving the given cloud account(s) | | attributes | N        | \&quot;*\&quot;:\&quot;*\&quot;                                                        | Not used                                                                                                                                                                                                                                                                                                            |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1GroupCloudOwnerIDMembersDeleteWithHttpInfo(String cloudOwnerID, String xF1ClientAuthorization, String authorization, String authorizationDomain, String accept, String content, String xClientSNCRPlatform, String acceptEncoding, String xSncrClientVersion, String xSNCRAppId, String authorization2, String body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'cloudOwnerID' is set
        if (cloudOwnerID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudOwnerID' when calling wsgPublicNabV1GroupCloudOwnerIDMembersDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cloudOwnerID", cloudOwnerID);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));
        if (content != null)
        localVarHeaderParams.add("Content", apiClient.parameterToString(content));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (acceptEncoding != null)
        localVarHeaderParams.add("accept-encoding", apiClient.parameterToString(acceptEncoding));
        if (xSncrClientVersion != null)
        localVarHeaderParams.add("x-sncr-client-version", apiClient.parameterToString(xSncrClientVersion));
        if (xSNCRAppId != null)
        localVarHeaderParams.add("X-SNCR-app-id", apiClient.parameterToString(xSNCRAppId));
        if (authorization2 != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization2));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/group/{cloudOwnerID}/members", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Group members 2
     * The owner of a shared cloud can call this api to list all its members.   The owner of a shared cloud can also call this api (with an extra query param) to list MDNs on their VZ account, which are eligible to be added as members.
     * <p><b>200</b> - These properties appear in the response body, to describe each member in the group  | Name       | Required | Allowed Values                                                 | Description                                                                                                                                                                                                                                 | |------------|----------|----------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | attributes | N        | \&quot;*\&quot;:\&quot;*\&quot;                                                        | If the member has a nickname, it should appear as an attribute \&quot;display.name\&quot;                                                                                                                                                               | | status     | Y        | \&quot;Invited\&quot; \&quot;Accepted\&quot; \&quot;NotAccepted\&quot;                             | The status of the membership \&quot;Invited\&quot;: NAB has sent an invite, but it has not yet been accepted \&quot;Accepted\&quot;: either the invite was accepted, or the member was enrolled instantly; either way the member now has access to the shared cloud | | type       | Y        | \&quot;owner\&quot; \&quot;manager\&quot; \&quot;member\&quot;                                     | ??                                                                                                                                                                                                                                          | | userId     | Y        | (any VZW MDN) (any VZT CID) (any OTT GUID) (any email address) | The customer ID                                                                                                                                                                                                                             | | userType   | Y        | \&quot;MDN\&quot; \&quot;CID\&quot; \&quot;OTT\&quot; \&quot;EMAIL\&quot;                                      | The customer ID type                                                                                                                                                                                                                        | 
     * <p><b>400</b> - 
     * <p><b>403</b> - 
     * <p><b>404</b> - 
     * <p><b>422</b> - 
     * <p><b>500</b> - 
     * @param cloudOwnerID  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorization userType can be MDN/CID/OTT (optional)
     * @param authorizationDomain  (optional)
     * @param accept  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param acceptEncoding Not required if its SSO access (optional)
     * @param xSncrClientVersion Not required if its SSO access (optional)
     * @param xSNCRAppId Can be guid (optional)
     * @param authorization2  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1GroupCloudOwnerIDMembersGet(String cloudOwnerID, String xF1ClientAuthorization, String authorization, String authorizationDomain, String accept, String content, String xClientSNCRPlatform, String acceptEncoding, String xSncrClientVersion, String xSNCRAppId, String authorization2) throws RestClientException {
        return wsgPublicNabV1GroupCloudOwnerIDMembersGetWithHttpInfo(cloudOwnerID, xF1ClientAuthorization, authorization, authorizationDomain, accept, content, xClientSNCRPlatform, acceptEncoding, xSncrClientVersion, xSNCRAppId, authorization2).getBody();
    }

    /**
     * Get Group members 2
     * The owner of a shared cloud can call this api to list all its members.   The owner of a shared cloud can also call this api (with an extra query param) to list MDNs on their VZ account, which are eligible to be added as members.
     * <p><b>200</b> - These properties appear in the response body, to describe each member in the group  | Name       | Required | Allowed Values                                                 | Description                                                                                                                                                                                                                                 | |------------|----------|----------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | attributes | N        | \&quot;*\&quot;:\&quot;*\&quot;                                                        | If the member has a nickname, it should appear as an attribute \&quot;display.name\&quot;                                                                                                                                                               | | status     | Y        | \&quot;Invited\&quot; \&quot;Accepted\&quot; \&quot;NotAccepted\&quot;                             | The status of the membership \&quot;Invited\&quot;: NAB has sent an invite, but it has not yet been accepted \&quot;Accepted\&quot;: either the invite was accepted, or the member was enrolled instantly; either way the member now has access to the shared cloud | | type       | Y        | \&quot;owner\&quot; \&quot;manager\&quot; \&quot;member\&quot;                                     | ??                                                                                                                                                                                                                                          | | userId     | Y        | (any VZW MDN) (any VZT CID) (any OTT GUID) (any email address) | The customer ID                                                                                                                                                                                                                             | | userType   | Y        | \&quot;MDN\&quot; \&quot;CID\&quot; \&quot;OTT\&quot; \&quot;EMAIL\&quot;                                      | The customer ID type                                                                                                                                                                                                                        | 
     * <p><b>400</b> - 
     * <p><b>403</b> - 
     * <p><b>404</b> - 
     * <p><b>422</b> - 
     * <p><b>500</b> - 
     * @param cloudOwnerID  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorization userType can be MDN/CID/OTT (optional)
     * @param authorizationDomain  (optional)
     * @param accept  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param acceptEncoding Not required if its SSO access (optional)
     * @param xSncrClientVersion Not required if its SSO access (optional)
     * @param xSNCRAppId Can be guid (optional)
     * @param authorization2  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1GroupCloudOwnerIDMembersGetWithHttpInfo(String cloudOwnerID, String xF1ClientAuthorization, String authorization, String authorizationDomain, String accept, String content, String xClientSNCRPlatform, String acceptEncoding, String xSncrClientVersion, String xSNCRAppId, String authorization2) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'cloudOwnerID' is set
        if (cloudOwnerID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudOwnerID' when calling wsgPublicNabV1GroupCloudOwnerIDMembersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cloudOwnerID", cloudOwnerID);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));
        if (content != null)
        localVarHeaderParams.add("Content", apiClient.parameterToString(content));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (acceptEncoding != null)
        localVarHeaderParams.add("accept-encoding", apiClient.parameterToString(acceptEncoding));
        if (xSncrClientVersion != null)
        localVarHeaderParams.add("x-sncr-client-version", apiClient.parameterToString(xSncrClientVersion));
        if (xSNCRAppId != null)
        localVarHeaderParams.add("X-SNCR-app-id", apiClient.parameterToString(xSNCRAppId));
        if (authorization2 != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization2));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/group/{cloudOwnerID}/members", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post Group Members 1
     * The owner of a shared cloud can call this api to add members instantly, if they are on the same VZ billing account; or to send invites to anyone, VZ customer or not. Add one or more members to a group. Members can be added instantly, or invited to join via email/SMS.
     * <p><b>200</b> - Successful response
     * <p><b>404</b> - 
     * <p><b>412</b> - 
     * <p><b>422</b> - 
     * <p><b>500</b> - 
     * @param cloudOwnerID  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorization userType can be MDN/CID/OTT (optional)
     * @param authorizationDomain  (optional)
     * @param accept  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param acceptEncoding Not required if its SSO access (optional)
     * @param xSncrClientVersion Not required if its SSO access (optional)
     * @param xSNCRAppId Can be guid (optional)
     * @param authorization2  (optional)
     * @param body These properties appear in the request body, to describe each group member being added to a group | Name       | Required | Allowed Values                    | Description                                                                                                                                                                                                                                                                                                                                                      | |------------|----------|-----------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | userType   | Y        | \&quot;MDN\&quot; \&quot;EMAIL\&quot;                     | The customer ID type                                                                                                                                                                                                                                                                                                                                             | | userId     | Y        | (any VZW MDN) (any email address) | The customer ID                                                                                                                                                                                                                                                                                                                                                  | | type       | Y        | \&quot;member\&quot;                          | ??                                                                                                                                                                                                                                                                                                                                                               | | status     | Y        | \&quot;invite\&quot; \&quot;enrollBillingMember\&quot;    | An instruction for how to add this member \&quot;invite\&quot;: NAB will send an invitation to the given MDN or email address, to join the shared cloud group \&quot;enrollBillingMember\&quot;: NAB will add the given MDN to the shared cloud group, instantly and without any invite or notification, provided they are in the same VZ billing account as the shared cloud subscriber | | attributes | N        | \&quot;*\&quot;:\&quot;*\&quot;                           | Technically any name/value pairs can be added using this field, but in practice, it is used to assign the member a nickname via attribute \&quot;display.name\&quot;                                                                                                                                                                                                         |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1GroupCloudOwnerIDMembersPost(String cloudOwnerID, String xF1ClientAuthorization, String authorization, String authorizationDomain, String accept, String content, String xClientSNCRPlatform, String acceptEncoding, String xSncrClientVersion, String xSNCRAppId, String authorization2, String body) throws RestClientException {
        return wsgPublicNabV1GroupCloudOwnerIDMembersPostWithHttpInfo(cloudOwnerID, xF1ClientAuthorization, authorization, authorizationDomain, accept, content, xClientSNCRPlatform, acceptEncoding, xSncrClientVersion, xSNCRAppId, authorization2, body).getBody();
    }

    /**
     * Post Group Members 1
     * The owner of a shared cloud can call this api to add members instantly, if they are on the same VZ billing account; or to send invites to anyone, VZ customer or not. Add one or more members to a group. Members can be added instantly, or invited to join via email/SMS.
     * <p><b>200</b> - Successful response
     * <p><b>404</b> - 
     * <p><b>412</b> - 
     * <p><b>422</b> - 
     * <p><b>500</b> - 
     * @param cloudOwnerID  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorization userType can be MDN/CID/OTT (optional)
     * @param authorizationDomain  (optional)
     * @param accept  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param acceptEncoding Not required if its SSO access (optional)
     * @param xSncrClientVersion Not required if its SSO access (optional)
     * @param xSNCRAppId Can be guid (optional)
     * @param authorization2  (optional)
     * @param body These properties appear in the request body, to describe each group member being added to a group | Name       | Required | Allowed Values                    | Description                                                                                                                                                                                                                                                                                                                                                      | |------------|----------|-----------------------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------| | userType   | Y        | \&quot;MDN\&quot; \&quot;EMAIL\&quot;                     | The customer ID type                                                                                                                                                                                                                                                                                                                                             | | userId     | Y        | (any VZW MDN) (any email address) | The customer ID                                                                                                                                                                                                                                                                                                                                                  | | type       | Y        | \&quot;member\&quot;                          | ??                                                                                                                                                                                                                                                                                                                                                               | | status     | Y        | \&quot;invite\&quot; \&quot;enrollBillingMember\&quot;    | An instruction for how to add this member \&quot;invite\&quot;: NAB will send an invitation to the given MDN or email address, to join the shared cloud group \&quot;enrollBillingMember\&quot;: NAB will add the given MDN to the shared cloud group, instantly and without any invite or notification, provided they are in the same VZ billing account as the shared cloud subscriber | | attributes | N        | \&quot;*\&quot;:\&quot;*\&quot;                           | Technically any name/value pairs can be added using this field, but in practice, it is used to assign the member a nickname via attribute \&quot;display.name\&quot;                                                                                                                                                                                                         |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1GroupCloudOwnerIDMembersPostWithHttpInfo(String cloudOwnerID, String xF1ClientAuthorization, String authorization, String authorizationDomain, String accept, String content, String xClientSNCRPlatform, String acceptEncoding, String xSncrClientVersion, String xSNCRAppId, String authorization2, String body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'cloudOwnerID' is set
        if (cloudOwnerID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudOwnerID' when calling wsgPublicNabV1GroupCloudOwnerIDMembersPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cloudOwnerID", cloudOwnerID);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));
        if (content != null)
        localVarHeaderParams.add("Content", apiClient.parameterToString(content));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (acceptEncoding != null)
        localVarHeaderParams.add("accept-encoding", apiClient.parameterToString(acceptEncoding));
        if (xSncrClientVersion != null)
        localVarHeaderParams.add("x-sncr-client-version", apiClient.parameterToString(xSncrClientVersion));
        if (xSNCRAppId != null)
        localVarHeaderParams.add("X-SNCR-app-id", apiClient.parameterToString(xSNCRAppId));
        if (authorization2 != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization2));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/group/{cloudOwnerID}/members", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put Group Members 3
     * The owner of a shared cloud can call this api to update one or more of its members. Update members in a group    The update can be one of:    * status&#x3D;ReInvite: resend the invite    * status&#x3D;Update: update the member&#39;s nickname (by setting attribute \&quot;display.name\&quot;)    * status&#x3D;Enroll: instantly enroll a new member (legacy logic for Family Cloud)
     * <p><b>200</b> - Successful response
     * <p><b>404</b> - 
     * <p><b>422</b> - 
     * <p><b>500</b> - 
     * @param cloudOwnerID  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorization userType can be MDN/CID/OTT (optional)
     * @param authorizationDomain  (optional)
     * @param accept  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param acceptEncoding Not required if its SSO access (optional)
     * @param xSncrClientVersion Not required if its SSO access (optional)
     * @param xSNCRAppId Can be guid (optional)
     * @param authorization2  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1GroupCloudOwnerIDMembersPut(String cloudOwnerID, String xF1ClientAuthorization, String authorization, String authorizationDomain, String accept, String content, String xClientSNCRPlatform, String acceptEncoding, String xSncrClientVersion, String xSNCRAppId, String authorization2, String body) throws RestClientException {
        return wsgPublicNabV1GroupCloudOwnerIDMembersPutWithHttpInfo(cloudOwnerID, xF1ClientAuthorization, authorization, authorizationDomain, accept, content, xClientSNCRPlatform, acceptEncoding, xSncrClientVersion, xSNCRAppId, authorization2, body).getBody();
    }

    /**
     * Put Group Members 3
     * The owner of a shared cloud can call this api to update one or more of its members. Update members in a group    The update can be one of:    * status&#x3D;ReInvite: resend the invite    * status&#x3D;Update: update the member&#39;s nickname (by setting attribute \&quot;display.name\&quot;)    * status&#x3D;Enroll: instantly enroll a new member (legacy logic for Family Cloud)
     * <p><b>200</b> - Successful response
     * <p><b>404</b> - 
     * <p><b>422</b> - 
     * <p><b>500</b> - 
     * @param cloudOwnerID  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorization userType can be MDN/CID/OTT (optional)
     * @param authorizationDomain  (optional)
     * @param accept  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param acceptEncoding Not required if its SSO access (optional)
     * @param xSncrClientVersion Not required if its SSO access (optional)
     * @param xSNCRAppId Can be guid (optional)
     * @param authorization2  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1GroupCloudOwnerIDMembersPutWithHttpInfo(String cloudOwnerID, String xF1ClientAuthorization, String authorization, String authorizationDomain, String accept, String content, String xClientSNCRPlatform, String acceptEncoding, String xSncrClientVersion, String xSNCRAppId, String authorization2, String body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'cloudOwnerID' is set
        if (cloudOwnerID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudOwnerID' when calling wsgPublicNabV1GroupCloudOwnerIDMembersPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cloudOwnerID", cloudOwnerID);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));
        if (content != null)
        localVarHeaderParams.add("Content", apiClient.parameterToString(content));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (acceptEncoding != null)
        localVarHeaderParams.add("accept-encoding", apiClient.parameterToString(acceptEncoding));
        if (xSncrClientVersion != null)
        localVarHeaderParams.add("x-sncr-client-version", apiClient.parameterToString(xSncrClientVersion));
        if (xSNCRAppId != null)
        localVarHeaderParams.add("X-SNCR-app-id", apiClient.parameterToString(xSNCRAppId));
        if (authorization2 != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization2));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/group/{cloudOwnerID}/members", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post link accounts user id 50 pending not excecuted
     * 
     * <p><b>200</b> - Successful response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1LinkaccountsUserIdPost(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1LinkaccountsUserIdPostWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Post link accounts user id 50 pending not excecuted
     * 
     * <p><b>200</b> - Successful response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1LinkaccountsUserIdPostWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1LinkaccountsUserIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/linkaccounts/{userId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * post notification register userId not executed pending 103
     * Notifications are used to inform endpoints of any changes on the NAB system. Notifications include, but are not limited to, Buddy Sync operations, NAB Share feature, Address Book changes, Sync operation completion (pass or fail), Account Merge operation completion, Dedupe process completion, et al. This method is used to register users from notifications for a given endpoint.   ADDITIONAL REQUEST HEADER: X-F1-Client-Authorization&#x3D;Contains decoded enpointId
     * <p><b>200</b> - multiend point response
     * <p><b>401</b> - multiend point response
     * <p><b>403</b> - multiend point response
     * <p><b>404</b> - Get snapshot response by snapshot id success response
     * <p><b>405</b> - multiend point response
     * <p><b>422</b> - multiend point response
     * <p><b>500</b> - multiend point response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1NotificationRegisterUserIdPost(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1NotificationRegisterUserIdPostWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * post notification register userId not executed pending 103
     * Notifications are used to inform endpoints of any changes on the NAB system. Notifications include, but are not limited to, Buddy Sync operations, NAB Share feature, Address Book changes, Sync operation completion (pass or fail), Account Merge operation completion, Dedupe process completion, et al. This method is used to register users from notifications for a given endpoint.   ADDITIONAL REQUEST HEADER: X-F1-Client-Authorization&#x3D;Contains decoded enpointId
     * <p><b>200</b> - multiend point response
     * <p><b>401</b> - multiend point response
     * <p><b>403</b> - multiend point response
     * <p><b>404</b> - Get snapshot response by snapshot id success response
     * <p><b>405</b> - multiend point response
     * <p><b>422</b> - multiend point response
     * <p><b>500</b> - multiend point response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1NotificationRegisterUserIdPostWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1NotificationRegisterUserIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/notification/register/{userId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * post notification unregister userId not executed pending 105
     * Notifications are used to inform endpoints of any changes on the NAB system. Notifications include, but are not limited to, Buddy Sync operations, NAB Share feature, Address Book changes, Sync operation completion (pass or fail), Account Merge operation completion, Dedupe process completion, et al. This method is used to register users from notifications for a given endpoint.   ADDITIONAL REQUEST HEADER: X-F1-Client-Authorization&#x3D;Contains decoded enpointId
     * <p><b>200</b> - Get snapshot response by snapshot id success response
     * <p><b>401</b> - multiend point response
     * <p><b>403</b> - multiend point response
     * <p><b>404</b> - multiend point response
     * <p><b>405</b> - multiend point response
     * <p><b>422</b> - multiend point response
     * <p><b>500</b> - multiend point response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1NotificationUnregisterUserIdPost(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1NotificationUnregisterUserIdPostWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * post notification unregister userId not executed pending 105
     * Notifications are used to inform endpoints of any changes on the NAB system. Notifications include, but are not limited to, Buddy Sync operations, NAB Share feature, Address Book changes, Sync operation completion (pass or fail), Account Merge operation completion, Dedupe process completion, et al. This method is used to register users from notifications for a given endpoint.   ADDITIONAL REQUEST HEADER: X-F1-Client-Authorization&#x3D;Contains decoded enpointId
     * <p><b>200</b> - Get snapshot response by snapshot id success response
     * <p><b>401</b> - multiend point response
     * <p><b>403</b> - multiend point response
     * <p><b>404</b> - multiend point response
     * <p><b>405</b> - multiend point response
     * <p><b>422</b> - multiend point response
     * <p><b>500</b> - multiend point response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1NotificationUnregisterUserIdPostWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1NotificationUnregisterUserIdPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/notification/unregister/{userId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post Raf Create Referral 17
     * API is used to create a referral code for a single referee at once.   Query params supported:   eligibilityCheck&#x3D;true - To perform DVS eligibility check to determine whether or not MDN is a Verizon customer
     * <p><b>200</b> - Successful response
     * <p><b>412</b> - 
     * <p><b>422</b> - 
     * @param referrerUserId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param contentType  (optional)
     * @param authorizationDomain  (optional)
     * @param accept  (optional)
     * @param authorization  (optional)
     * @param eligibilityCheck  (optional)
     * @param body Fields | Field Name     | Field type and value(s)       | Description | |----------------|-------------------------------|-------------| | refereeType    | String(MDN/CID/OTT)           |             | | refereeUserId  | String(valid UserId)          |             | | refereeName    | String(any)                   |             | | referralStatus | String(pending/sent/redeemed) |             | | referralLink   | String(Absolute link)         |             | | referralCode   | String(Encrypted code)        |             |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1RafReferrerUserIdReferralPost(String referrerUserId, String xF1ClientAuthorization, String contentType, String authorizationDomain, String accept, String authorization, String eligibilityCheck, String body) throws RestClientException {
        return wsgPublicNabV1RafReferrerUserIdReferralPostWithHttpInfo(referrerUserId, xF1ClientAuthorization, contentType, authorizationDomain, accept, authorization, eligibilityCheck, body).getBody();
    }

    /**
     * Post Raf Create Referral 17
     * API is used to create a referral code for a single referee at once.   Query params supported:   eligibilityCheck&#x3D;true - To perform DVS eligibility check to determine whether or not MDN is a Verizon customer
     * <p><b>200</b> - Successful response
     * <p><b>412</b> - 
     * <p><b>422</b> - 
     * @param referrerUserId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param contentType  (optional)
     * @param authorizationDomain  (optional)
     * @param accept  (optional)
     * @param authorization  (optional)
     * @param eligibilityCheck  (optional)
     * @param body Fields | Field Name     | Field type and value(s)       | Description | |----------------|-------------------------------|-------------| | refereeType    | String(MDN/CID/OTT)           |             | | refereeUserId  | String(valid UserId)          |             | | refereeName    | String(any)                   |             | | referralStatus | String(pending/sent/redeemed) |             | | referralLink   | String(Absolute link)         |             | | referralCode   | String(Encrypted code)        |             |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1RafReferrerUserIdReferralPostWithHttpInfo(String referrerUserId, String xF1ClientAuthorization, String contentType, String authorizationDomain, String accept, String authorization, String eligibilityCheck, String body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'referrerUserId' is set
        if (referrerUserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'referrerUserId' when calling wsgPublicNabV1RafReferrerUserIdReferralPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("referrerUserId", referrerUserId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "eligibilityCheck", eligibilityCheck));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));
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

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/raf/{referrerUserId}/referral", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put Raf Referral 18
     * API is used to update referral details for a single user at once.
     * <p><b>200</b> - Successful response
     * <p><b>412</b> - 
     * <p><b>422</b> - 
     * @param referrerUserId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param contentType  (optional)
     * @param authorizationDomain  (optional)
     * @param accept  (optional)
     * @param authorization  (optional)
     * @param body Fields | Field Name     | Field type and value(s)       | Description | |----------------|-------------------------------|-------------| | refereeType    | String(MDN/CID/OTT)           |             | | refereeUserId  | String(valid UserId)          |             | | refereeName    | String(any)                   |             | | referralStatus | String(pending/sent/redeemed) |             | | referralLink   | String(Absolute link)         |             | | referralCode   | String(Encrypted code)        |             |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1RafReferrerUserIdReferralPut(String referrerUserId, String xF1ClientAuthorization, String contentType, String authorizationDomain, String accept, String authorization, String body) throws RestClientException {
        return wsgPublicNabV1RafReferrerUserIdReferralPutWithHttpInfo(referrerUserId, xF1ClientAuthorization, contentType, authorizationDomain, accept, authorization, body).getBody();
    }

    /**
     * Put Raf Referral 18
     * API is used to update referral details for a single user at once.
     * <p><b>200</b> - Successful response
     * <p><b>412</b> - 
     * <p><b>422</b> - 
     * @param referrerUserId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param contentType  (optional)
     * @param authorizationDomain  (optional)
     * @param accept  (optional)
     * @param authorization  (optional)
     * @param body Fields | Field Name     | Field type and value(s)       | Description | |----------------|-------------------------------|-------------| | refereeType    | String(MDN/CID/OTT)           |             | | refereeUserId  | String(valid UserId)          |             | | refereeName    | String(any)                   |             | | referralStatus | String(pending/sent/redeemed) |             | | referralLink   | String(Absolute link)         |             | | referralCode   | String(Encrypted code)        |             |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1RafReferrerUserIdReferralPutWithHttpInfo(String referrerUserId, String xF1ClientAuthorization, String contentType, String authorizationDomain, String accept, String authorization, String body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'referrerUserId' is set
        if (referrerUserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'referrerUserId' when calling wsgPublicNabV1RafReferrerUserIdReferralPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("referrerUserId", referrerUserId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));
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

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/raf/{referrerUserId}/referral", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete Raf Referral 20
     * API is used to Delete a referral code for a single user if it is already there
     * <p><b>200</b> - Successful response   Fields   | Field Name     | Field type and value(s)       | Description |   |----------------|-------------------------------|-------------|   | refereeType    | String(MDN/CID/OTT)           |             |   | refereeUserId  | String(valid UserId)          |             |   | refereeName    | String(any)                   |             |   | referralStatus | String(pending/sent/redeemed) |             |   | referralLink   | String(Absolute link)         |             |   | referralCode   | String(Encrypted code)        |             | 
     * <p><b>412</b> - 
     * <p><b>422</b> - 
     * @param referrerUserId  (required)
     * @param refereeUserType  (required)
     * @param refereeUserId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param contentType  (optional)
     * @param authorizationDomain  (optional)
     * @param accept  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1RafReferrerUserIdReferralRefereeUserTypeRefereeUserIdDelete(String referrerUserId, String refereeUserType, String refereeUserId, String xF1ClientAuthorization, String contentType, String authorizationDomain, String accept, String authorization) throws RestClientException {
        return wsgPublicNabV1RafReferrerUserIdReferralRefereeUserTypeRefereeUserIdDeleteWithHttpInfo(referrerUserId, refereeUserType, refereeUserId, xF1ClientAuthorization, contentType, authorizationDomain, accept, authorization).getBody();
    }

    /**
     * Delete Raf Referral 20
     * API is used to Delete a referral code for a single user if it is already there
     * <p><b>200</b> - Successful response   Fields   | Field Name     | Field type and value(s)       | Description |   |----------------|-------------------------------|-------------|   | refereeType    | String(MDN/CID/OTT)           |             |   | refereeUserId  | String(valid UserId)          |             |   | refereeName    | String(any)                   |             |   | referralStatus | String(pending/sent/redeemed) |             |   | referralLink   | String(Absolute link)         |             |   | referralCode   | String(Encrypted code)        |             | 
     * <p><b>412</b> - 
     * <p><b>422</b> - 
     * @param referrerUserId  (required)
     * @param refereeUserType  (required)
     * @param refereeUserId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param contentType  (optional)
     * @param authorizationDomain  (optional)
     * @param accept  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1RafReferrerUserIdReferralRefereeUserTypeRefereeUserIdDeleteWithHttpInfo(String referrerUserId, String refereeUserType, String refereeUserId, String xF1ClientAuthorization, String contentType, String authorizationDomain, String accept, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'referrerUserId' is set
        if (referrerUserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'referrerUserId' when calling wsgPublicNabV1RafReferrerUserIdReferralRefereeUserTypeRefereeUserIdDelete");
        }
        
        // verify the required parameter 'refereeUserType' is set
        if (refereeUserType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'refereeUserType' when calling wsgPublicNabV1RafReferrerUserIdReferralRefereeUserTypeRefereeUserIdDelete");
        }
        
        // verify the required parameter 'refereeUserId' is set
        if (refereeUserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'refereeUserId' when calling wsgPublicNabV1RafReferrerUserIdReferralRefereeUserTypeRefereeUserIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("referrerUserId", referrerUserId);
        uriVariables.put("refereeUserType", refereeUserType);
        uriVariables.put("refereeUserId", refereeUserId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/raf/{referrerUserId}/referral/{refereeUserType}/{refereeUserId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Raf Referral 19
     * API is used to GET a referral code for a single user if it is already there
     * <p><b>200</b> - Successful response Fields | Field Name     | Field type and value(s)       | Description | |----------------|-------------------------------|-------------| | refereeType    | String(MDN/CID/OTT)           |             | | refereeUserId  | String(valid UserId)          |             | | refereeName    | String(any)                   |             | | referralStatus | String(pending/sent/redeemed) |             | | referralLink   | String(Absolute link)         |             | | referralCode   | String(Encrypted code)        |             | 
     * <p><b>412</b> - 
     * <p><b>422</b> - 
     * @param referrerUserId  (required)
     * @param refereeUserType  (required)
     * @param refereeUserId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param contentType  (optional)
     * @param authorizationDomain  (optional)
     * @param accept  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1RafReferrerUserIdReferralRefereeUserTypeRefereeUserIdGet(String referrerUserId, String refereeUserType, String refereeUserId, String xF1ClientAuthorization, String contentType, String authorizationDomain, String accept, String authorization) throws RestClientException {
        return wsgPublicNabV1RafReferrerUserIdReferralRefereeUserTypeRefereeUserIdGetWithHttpInfo(referrerUserId, refereeUserType, refereeUserId, xF1ClientAuthorization, contentType, authorizationDomain, accept, authorization).getBody();
    }

    /**
     * Get Raf Referral 19
     * API is used to GET a referral code for a single user if it is already there
     * <p><b>200</b> - Successful response Fields | Field Name     | Field type and value(s)       | Description | |----------------|-------------------------------|-------------| | refereeType    | String(MDN/CID/OTT)           |             | | refereeUserId  | String(valid UserId)          |             | | refereeName    | String(any)                   |             | | referralStatus | String(pending/sent/redeemed) |             | | referralLink   | String(Absolute link)         |             | | referralCode   | String(Encrypted code)        |             | 
     * <p><b>412</b> - 
     * <p><b>422</b> - 
     * @param referrerUserId  (required)
     * @param refereeUserType  (required)
     * @param refereeUserId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param contentType  (optional)
     * @param authorizationDomain  (optional)
     * @param accept  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1RafReferrerUserIdReferralRefereeUserTypeRefereeUserIdGetWithHttpInfo(String referrerUserId, String refereeUserType, String refereeUserId, String xF1ClientAuthorization, String contentType, String authorizationDomain, String accept, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'referrerUserId' is set
        if (referrerUserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'referrerUserId' when calling wsgPublicNabV1RafReferrerUserIdReferralRefereeUserTypeRefereeUserIdGet");
        }
        
        // verify the required parameter 'refereeUserType' is set
        if (refereeUserType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'refereeUserType' when calling wsgPublicNabV1RafReferrerUserIdReferralRefereeUserTypeRefereeUserIdGet");
        }
        
        // verify the required parameter 'refereeUserId' is set
        if (refereeUserId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'refereeUserId' when calling wsgPublicNabV1RafReferrerUserIdReferralRefereeUserTypeRefereeUserIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("referrerUserId", referrerUserId);
        uriVariables.put("refereeUserType", refereeUserType);
        uriVariables.put("refereeUserId", refereeUserId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/raf/{referrerUserId}/referral/{refereeUserType}/{refereeUserId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get registrar service urls 73 not executed pending
     * 
     * <p><b>200</b> - Get registrar service urls response
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1RegistrarServiceUrlsGet(String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1RegistrarServiceUrlsGetWithHttpInfo(xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get registrar service urls 73 not executed pending
     * 
     * <p><b>200</b> - Get registrar service urls response
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1RegistrarServiceUrlsGetWithHttpInfo(String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/registrar/service-urls", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post Create Address book Contact 54
     * This method is used for adding a contact  NOTIFICATIONS GENERATED | NOTIFICATION          | DESCRIPTION                                                          | |-----------------------|----------------------------------------------------------------------| | Address Book Modified | Triggered if the client is configured to generate this notification. | 
     * <p><b>200</b> - Successful response
     * <p><b>201</b> - Successful response
     * <p><b>301</b> - Successful response
     * <p><b>401</b> - Successful response
     * <p><b>403</b> - Successful response
     * <p><b>404</b> - Error: response status is 404
     * <p><b>415</b> - Error: response status is 404
     * <p><b>422</b> - Error: response status is 404
     * <p><b>500</b> - Successful response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS          | ATTRIBUTES  | DESCRIPTION                                                                                | REQUIRED | LENGTH           | |-------------------|-------------|--------------------------------------------------------------------------------------------|----------|------------------| | contact           | id          | Id of Contact                                                                              | OPTIONAL | RAW( 16 )        | | contact           | tempid      | Tempid of Contact                                                                          | OPTIONAL |                  | | contact           | version     | Version of contact                                                                         | OPTIONAL | NUMBER( 6)       | | firstname         |             | First Name of the contact                                                                  | NO       | VARCHAR2( 255 )  | | lastname          |             | Last Name of the contact                                                                   | NO       | VARCHAR2( 255 )  | | middlename        |             | Middle Name of the contact                                                                 | NO       | VARCHAR2( 255 )  | | nameprefix        |             | NamePrefix of contact                                                                      | NO       | VARCHAR2( 255 )  | | namesuffix        |             | NameSuffix of contact                                                                      | NO       | VARCHAR2( 255 )  | | nickname          |             | Nickname of contact                                                                        | NO       | VARCHAR2( 255 )  | | birthday          |             | Birthdate of contact                                                                       | NO       | Date             | | source            |             | The source from where the contact originated.                                              | NO       | VARCHAR2(255)    | | deletionsource    |             | Indicates the deletion source.                                                             | NO       | VARCHAR2(255)    | | endpointassoc     | type        | EndpointType of contact                                                                    | RO       | VARCHAR2(255)    | | endpointassoc     | id          | EndpoinId of contact                                                                       | RO       | VARCHAR2(1024)   | | endpointassoc     | name        | Endpoint name of contact                                                                   | NO       | VARCHAR2(1024)   | | endpointassoc     | state       | Contact state to the endpoint The values might be promoted, demoted, propmote_pending etc. | NO       | VARCHAR2(1024)   | | buddyassoc        | buddyuserid | Buddy UserId of contact                                                                    | RO       | NUMBER(20)       | | shareassoc        | id          | ShareId associated with contact                                                            | RO       | RAW(16)          | | shareassoc        | name        | ShareName associated with contact                                                          | RO       | VARCHAR2(1024)   | | prefmodeofcontact | type        | The type of preferred mode of communication for the contact                                | NO       | VARCHAR2( 64 )   | | prefmodeofcontact | value       | The preferred mode of communication for the contact                                        | NO       | VARCHAR2( 255 )  | | conflicttype      |             | Conflict Type of contact                                                                   | RO       | CHAR(1)          | | incaseofemergency |             | Specifies contact as ICE or not                                                            | NO       | CHAR(1)          | | favorite          |             | Specifies contact as favourite                                                             | NO       | CHAR(1)          | | photo             | ContentType | Photo of contact                                                                           | NO       | VARCHAR2(333)    | | photoreference    |             | Photo reference or the Picture Id                                                          | RO       | VARCHAR2(333)    | | anniversary       |             | Marriage anniversary date                                                                  | NO       | Date             | | spouse            |             | Spouse of contact                                                                          | NO       | VARCHAR2( 255 )  | | children          |             | Children Names of contact                                                                  | NO       | VARCHAR2( 255 )  | | note              |             | Note for the contact                                                                       | NO       | CLOB             | | orgname           |             | Company Name of contact                                                                    | NO       | VARCHAR2( 508 )  | | orgunit           |             | Company Department of contact                                                              | NO       | VARCHAR2( 255 )  | | jobtitle          |             | Job titile of contact                                                                      | NO       | VARCHAR2( 508 )  | | profession        |             | Profession of contact                                                                      | NO       | VARCHAR2( 255 )  | | assistant         |             | Assistant Name of contact                                                                  | NO       | VARCHAR2( 255 )  | | gender            |             | Gender of the contact                                                                      | NO       | CHAR(1)          | | relationship      |             | Relationship of the contact with the person                                                | NO       | VARCHAR2(255)    | | maritalstatus     |             | Marital status of the contact                                                              | NO       | VARCHAR2(255)    | | timezone          |             | Timezone of the contact                                                                    | NO       | NUMBER(4)        | | created           |             | Created date of contact                                                                    | NO       | Date             | | modified          |             | Modified date of contact                                                                   | NO       | Date             | | tel               | type        | Telephone type of contact                                                                  | YES      | NUMBER( 4 )      | | tel               | indx        | Telephone indx of contact                                                                  | NO       |                  | | number            |             | Telephone Number of contact                                                                | NO       | VARCHAR2( 255 )  | | carrier           |             | Telephone Carrier of contact                                                               | NO       | NUMBER(4)        | | preference        |             | Telephone Preference of contact                                                            | NO       | NUMBER(2)        | | email             | type        | Email Type of contact                                                                      | YES      | NUMBER( 4 )      | | email             | indx        | Email Indx of contact                                                                      | NO       |                  | | address           |             | Email Address of contact                                                                   | NO       | VARCHAR2( 255 )  | | preference        |             | Email Preference of contact                                                                | NO       | NUMBER(2)        | | im                | type        | IM type of contact                                                                         | YES      | NUMBER( 4 )      | | address           |             | IM address of contact                                                                      | NO       | VARCHAR2( 255 )  | | preference        |             | IM preference of contact                                                                   | NO       | NUMBER(2)        | | address           | type        | Address type of the contact                                                                | YES      | NUMBER( 4 )      | | address           | indx        | Address indx of the contact                                                                | NO       |                  | | pobox             |             | Post box number of the address                                                             | NO       | VARCHAR2( 508 )  | | street            |             | Street Number of the address                                                               | NO       | VARCHAR2( 508 )  | | apartment         |             | Apartment Number of the address                                                            | NO       | VARCHAR2( 508 )  | | city              |             | City of the address                                                                        | NO       | VARCHAR2( 508 )  | | state             |             | State of the address                                                                       | NO       | VARCHAR2( 508 )  | | zipcode           |             | Zipcode of the address                                                                     | NO       | VARCHAR2( 255 )  | | country           |             | Country of the address                                                                     | NO       | VARCHAR2( 508 )  | | preference        |             | Preference of the address                                                                  | NO       | NUMBER(2)        | | webpage           | type        | Webpage Type of contact                                                                    | YES      | NUMBER( 4 )      | | webpage           | indx        | Webpage Indx of contact                                                                    | NO       |                  | | url               |             | Webpage Url of contact                                                                     | NO       | VARCHAR2( 1000 ) | | preference        |             | Preference of the webpage                                                                  | NO       | VARCHAR2( 1000 ) | | groups            |             | Groups Type of contact                                                                     | YES      |                  | | groups            | group       | Group added to contact                                                                     | NO       |                  | | group             | id          | Group Id                                                                                   | YES      | RAW( 16 )        | | group             | name        | Name of the group                                                                          | YES      | VARCHAR2(50)     | | group             | version     | Version of the group                                                                       | YES      | NUMBER(6)        | | group             | type        | Group Type                                                                                 | YES      | char(1)          | | group             | itemGuid    | Group item guid                                                                            | NO       | RAW( 16 )        | | extfield          | name        | Name of the extensible field                                                               | YES      | VARCHAR2(256)    | | extfield          | value       | Value of the extensible field                                                              | YES      | VARCHAR2(256)    | | dedupe            |             | Dedupe status of the contact can be set to pending or completed                            | OPTIONAL | VARCHAR2( 2 )    |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbContactPost(String userId, String xF1ClientAuthorization, String authorizationDomain, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdAbContactPostWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Post Create Address book Contact 54
     * This method is used for adding a contact  NOTIFICATIONS GENERATED | NOTIFICATION          | DESCRIPTION                                                          | |-----------------------|----------------------------------------------------------------------| | Address Book Modified | Triggered if the client is configured to generate this notification. | 
     * <p><b>200</b> - Successful response
     * <p><b>201</b> - Successful response
     * <p><b>301</b> - Successful response
     * <p><b>401</b> - Successful response
     * <p><b>403</b> - Successful response
     * <p><b>404</b> - Error: response status is 404
     * <p><b>415</b> - Error: response status is 404
     * <p><b>422</b> - Error: response status is 404
     * <p><b>500</b> - Successful response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS          | ATTRIBUTES  | DESCRIPTION                                                                                | REQUIRED | LENGTH           | |-------------------|-------------|--------------------------------------------------------------------------------------------|----------|------------------| | contact           | id          | Id of Contact                                                                              | OPTIONAL | RAW( 16 )        | | contact           | tempid      | Tempid of Contact                                                                          | OPTIONAL |                  | | contact           | version     | Version of contact                                                                         | OPTIONAL | NUMBER( 6)       | | firstname         |             | First Name of the contact                                                                  | NO       | VARCHAR2( 255 )  | | lastname          |             | Last Name of the contact                                                                   | NO       | VARCHAR2( 255 )  | | middlename        |             | Middle Name of the contact                                                                 | NO       | VARCHAR2( 255 )  | | nameprefix        |             | NamePrefix of contact                                                                      | NO       | VARCHAR2( 255 )  | | namesuffix        |             | NameSuffix of contact                                                                      | NO       | VARCHAR2( 255 )  | | nickname          |             | Nickname of contact                                                                        | NO       | VARCHAR2( 255 )  | | birthday          |             | Birthdate of contact                                                                       | NO       | Date             | | source            |             | The source from where the contact originated.                                              | NO       | VARCHAR2(255)    | | deletionsource    |             | Indicates the deletion source.                                                             | NO       | VARCHAR2(255)    | | endpointassoc     | type        | EndpointType of contact                                                                    | RO       | VARCHAR2(255)    | | endpointassoc     | id          | EndpoinId of contact                                                                       | RO       | VARCHAR2(1024)   | | endpointassoc     | name        | Endpoint name of contact                                                                   | NO       | VARCHAR2(1024)   | | endpointassoc     | state       | Contact state to the endpoint The values might be promoted, demoted, propmote_pending etc. | NO       | VARCHAR2(1024)   | | buddyassoc        | buddyuserid | Buddy UserId of contact                                                                    | RO       | NUMBER(20)       | | shareassoc        | id          | ShareId associated with contact                                                            | RO       | RAW(16)          | | shareassoc        | name        | ShareName associated with contact                                                          | RO       | VARCHAR2(1024)   | | prefmodeofcontact | type        | The type of preferred mode of communication for the contact                                | NO       | VARCHAR2( 64 )   | | prefmodeofcontact | value       | The preferred mode of communication for the contact                                        | NO       | VARCHAR2( 255 )  | | conflicttype      |             | Conflict Type of contact                                                                   | RO       | CHAR(1)          | | incaseofemergency |             | Specifies contact as ICE or not                                                            | NO       | CHAR(1)          | | favorite          |             | Specifies contact as favourite                                                             | NO       | CHAR(1)          | | photo             | ContentType | Photo of contact                                                                           | NO       | VARCHAR2(333)    | | photoreference    |             | Photo reference or the Picture Id                                                          | RO       | VARCHAR2(333)    | | anniversary       |             | Marriage anniversary date                                                                  | NO       | Date             | | spouse            |             | Spouse of contact                                                                          | NO       | VARCHAR2( 255 )  | | children          |             | Children Names of contact                                                                  | NO       | VARCHAR2( 255 )  | | note              |             | Note for the contact                                                                       | NO       | CLOB             | | orgname           |             | Company Name of contact                                                                    | NO       | VARCHAR2( 508 )  | | orgunit           |             | Company Department of contact                                                              | NO       | VARCHAR2( 255 )  | | jobtitle          |             | Job titile of contact                                                                      | NO       | VARCHAR2( 508 )  | | profession        |             | Profession of contact                                                                      | NO       | VARCHAR2( 255 )  | | assistant         |             | Assistant Name of contact                                                                  | NO       | VARCHAR2( 255 )  | | gender            |             | Gender of the contact                                                                      | NO       | CHAR(1)          | | relationship      |             | Relationship of the contact with the person                                                | NO       | VARCHAR2(255)    | | maritalstatus     |             | Marital status of the contact                                                              | NO       | VARCHAR2(255)    | | timezone          |             | Timezone of the contact                                                                    | NO       | NUMBER(4)        | | created           |             | Created date of contact                                                                    | NO       | Date             | | modified          |             | Modified date of contact                                                                   | NO       | Date             | | tel               | type        | Telephone type of contact                                                                  | YES      | NUMBER( 4 )      | | tel               | indx        | Telephone indx of contact                                                                  | NO       |                  | | number            |             | Telephone Number of contact                                                                | NO       | VARCHAR2( 255 )  | | carrier           |             | Telephone Carrier of contact                                                               | NO       | NUMBER(4)        | | preference        |             | Telephone Preference of contact                                                            | NO       | NUMBER(2)        | | email             | type        | Email Type of contact                                                                      | YES      | NUMBER( 4 )      | | email             | indx        | Email Indx of contact                                                                      | NO       |                  | | address           |             | Email Address of contact                                                                   | NO       | VARCHAR2( 255 )  | | preference        |             | Email Preference of contact                                                                | NO       | NUMBER(2)        | | im                | type        | IM type of contact                                                                         | YES      | NUMBER( 4 )      | | address           |             | IM address of contact                                                                      | NO       | VARCHAR2( 255 )  | | preference        |             | IM preference of contact                                                                   | NO       | NUMBER(2)        | | address           | type        | Address type of the contact                                                                | YES      | NUMBER( 4 )      | | address           | indx        | Address indx of the contact                                                                | NO       |                  | | pobox             |             | Post box number of the address                                                             | NO       | VARCHAR2( 508 )  | | street            |             | Street Number of the address                                                               | NO       | VARCHAR2( 508 )  | | apartment         |             | Apartment Number of the address                                                            | NO       | VARCHAR2( 508 )  | | city              |             | City of the address                                                                        | NO       | VARCHAR2( 508 )  | | state             |             | State of the address                                                                       | NO       | VARCHAR2( 508 )  | | zipcode           |             | Zipcode of the address                                                                     | NO       | VARCHAR2( 255 )  | | country           |             | Country of the address                                                                     | NO       | VARCHAR2( 508 )  | | preference        |             | Preference of the address                                                                  | NO       | NUMBER(2)        | | webpage           | type        | Webpage Type of contact                                                                    | YES      | NUMBER( 4 )      | | webpage           | indx        | Webpage Indx of contact                                                                    | NO       |                  | | url               |             | Webpage Url of contact                                                                     | NO       | VARCHAR2( 1000 ) | | preference        |             | Preference of the webpage                                                                  | NO       | VARCHAR2( 1000 ) | | groups            |             | Groups Type of contact                                                                     | YES      |                  | | groups            | group       | Group added to contact                                                                     | NO       |                  | | group             | id          | Group Id                                                                                   | YES      | RAW( 16 )        | | group             | name        | Name of the group                                                                          | YES      | VARCHAR2(50)     | | group             | version     | Version of the group                                                                       | YES      | NUMBER(6)        | | group             | type        | Group Type                                                                                 | YES      | char(1)          | | group             | itemGuid    | Group item guid                                                                            | NO       | RAW( 16 )        | | extfield          | name        | Name of the extensible field                                                               | YES      | VARCHAR2(256)    | | extfield          | value       | Value of the extensible field                                                              | YES      | VARCHAR2(256)    | | dedupe            |             | Dedupe status of the contact can be set to pending or completed                            | OPTIONAL | VARCHAR2( 2 )    |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbContactPostWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbContactPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/contact", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete address book contacts by contact id 53
     * This method is used for deleting a contact
     * <p><b>200</b> - contact delete 200 response
     * <p><b>301</b> - contact delete 301 response
     * <p><b>401</b> - contact delete 401 response
     * <p><b>404</b> - contact delete 404 response
     * <p><b>409</b> - contact delete 409 response
     * <p><b>422</b> - contact delete 422 response
     * <p><b>500</b> - contact delete 500 response
     * @param userId  (required)
     * @param contactId  (required)
     * @param u Version for the contact (optional)
     * @param override flag to check for the contact version   Note: Override flag is used as a parameter which set will not consider the version of the contact while deleting. (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbContactsContactIdDelete(String userId, String contactId, String u, Boolean override, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAbContactsContactIdDeleteWithHttpInfo(userId, contactId, u, override, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Delete address book contacts by contact id 53
     * This method is used for deleting a contact
     * <p><b>200</b> - contact delete 200 response
     * <p><b>301</b> - contact delete 301 response
     * <p><b>401</b> - contact delete 401 response
     * <p><b>404</b> - contact delete 404 response
     * <p><b>409</b> - contact delete 409 response
     * <p><b>422</b> - contact delete 422 response
     * <p><b>500</b> - contact delete 500 response
     * @param userId  (required)
     * @param contactId  (required)
     * @param u Version for the contact (optional)
     * @param override flag to check for the contact version   Note: Override flag is used as a parameter which set will not consider the version of the contact while deleting. (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbContactsContactIdDeleteWithHttpInfo(String userId, String contactId, String u, Boolean override, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbContactsContactIdDelete");
        }
        
        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contactId' when calling wsgPublicNabV1UserIdAbContactsContactIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("contactId", contactId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "u", u));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "override", override));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/contacts/{contactId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get address book contacts by contact id 53
     * This method is used for retrieving a contact.If the contact&#39;s phone has an associated ICS account ,this information is displayed through the \&quot;account\&quot; element.The corresponding preference to show if the account is visible or not is retrieved from \&quot;useridhidden\&quot; attribute. The response also shows the dedupe type whether pending or completed through the \&quot;dedupe\&quot; attribute. 
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param contactId  (required)
     * @param fields Obtains the contact with fields specified (optional)
     * @param ff Specifies whether fields should be excluded or included. Values can be exclude or include. Default is include. (optional)
     * @param size Retrieves the contact&#39;s image with specified size (optional)
     * @param imagetype Retrieves the contact&#39;s image with specified type.Default is na. (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbContactsContactIdGet(String userId, String contactId, String fields, String ff, String size, String imagetype, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAbContactsContactIdGetWithHttpInfo(userId, contactId, fields, ff, size, imagetype, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get address book contacts by contact id 53
     * This method is used for retrieving a contact.If the contact&#39;s phone has an associated ICS account ,this information is displayed through the \&quot;account\&quot; element.The corresponding preference to show if the account is visible or not is retrieved from \&quot;useridhidden\&quot; attribute. The response also shows the dedupe type whether pending or completed through the \&quot;dedupe\&quot; attribute. 
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param contactId  (required)
     * @param fields Obtains the contact with fields specified (optional)
     * @param ff Specifies whether fields should be excluded or included. Values can be exclude or include. Default is include. (optional)
     * @param size Retrieves the contact&#39;s image with specified size (optional)
     * @param imagetype Retrieves the contact&#39;s image with specified type.Default is na. (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbContactsContactIdGetWithHttpInfo(String userId, String contactId, String fields, String ff, String size, String imagetype, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbContactsContactIdGet");
        }
        
        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contactId' when calling wsgPublicNabV1UserIdAbContactsContactIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("contactId", contactId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "ff", ff));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "imagetype", imagetype));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/contacts/{contactId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete address book contacts contactId picture 59
     * 
     * <p><b>200</b>
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param contactId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbContactsContactIdPictureDelete(String userId, String contactId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAbContactsContactIdPictureDeleteWithHttpInfo(userId, contactId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Delete address book contacts contactId picture 59
     * 
     * <p><b>200</b>
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param contactId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbContactsContactIdPictureDeleteWithHttpInfo(String userId, String contactId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbContactsContactIdPictureDelete");
        }
        
        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contactId' when calling wsgPublicNabV1UserIdAbContactsContactIdPictureDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("contactId", contactId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/contacts/{contactId}/picture", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get address book contacts contactId picture 56
     * This method is used for retrieving the picture for a contact in recycle bin. It should be noted that the picture id can be obtained from the contact itself which has the picture id as a photo reference field.  Users should specify the picture id in the URL. The browser will be able to cache the image based in this URL. Whenever the picture changes the picture id will also change. This should cause the browser to load the picture again.  Fetching the Contact Picture through the picture URL $UserId/ab/contacts/$ContactId/picture is now deprecated. A Photo Reference must be used with the URL as the PictureId. The photo reference is obtained as a part of the contact. 
     * <p><b>200</b> - Get snapshot response by snapshot id success response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param contactId  (required)
     * @param size Retrieves the picture with specified size (optional)
     * @param imagetype Retrieves the picture with specified type Default is na. (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbContactsContactIdPictureGet(String userId, String contactId, String size, String imagetype, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAbContactsContactIdPictureGetWithHttpInfo(userId, contactId, size, imagetype, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get address book contacts contactId picture 56
     * This method is used for retrieving the picture for a contact in recycle bin. It should be noted that the picture id can be obtained from the contact itself which has the picture id as a photo reference field.  Users should specify the picture id in the URL. The browser will be able to cache the image based in this URL. Whenever the picture changes the picture id will also change. This should cause the browser to load the picture again.  Fetching the Contact Picture through the picture URL $UserId/ab/contacts/$ContactId/picture is now deprecated. A Photo Reference must be used with the URL as the PictureId. The photo reference is obtained as a part of the contact. 
     * <p><b>200</b> - Get snapshot response by snapshot id success response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param contactId  (required)
     * @param size Retrieves the picture with specified size (optional)
     * @param imagetype Retrieves the picture with specified type Default is na. (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbContactsContactIdPictureGetWithHttpInfo(String userId, String contactId, String size, String imagetype, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbContactsContactIdPictureGet");
        }
        
        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contactId' when calling wsgPublicNabV1UserIdAbContactsContactIdPictureGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("contactId", contactId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "imagetype", imagetype));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "image/png"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/contacts/{contactId}/picture", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get address book contacts contactId picture 60
     * This method is used for retrieving the picture for a contact in recycle bin. It should be noted that the picture id can be obtained from the contact itself which has the picture id as a photo reference field.  Users should specify the picture id in the URL. The browser will be able to cache the image based in this URL. Whenever the picture changes the picture id will also change. This should cause the browser to load the picture again.  Fetching the Contact Picture through the picture URL $UserId/ab/contacts/$ContactId/picture is now deprecated. A Photo Reference must be used with the URL as the PictureId. The photo reference is obtained as a part of the contact. 
     * <p><b>200</b> - Get snapshot response by snapshot id success response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param contactId  (required)
     * @param pictureId  (required)
     * @param size Retrieves the picture with specified size (optional)
     * @param imagetype Retrieves the picture with specified type Default is na. (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbContactsContactIdPicturePictureIdGet(String userId, String contactId, String pictureId, String size, String imagetype, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAbContactsContactIdPicturePictureIdGetWithHttpInfo(userId, contactId, pictureId, size, imagetype, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get address book contacts contactId picture 60
     * This method is used for retrieving the picture for a contact in recycle bin. It should be noted that the picture id can be obtained from the contact itself which has the picture id as a photo reference field.  Users should specify the picture id in the URL. The browser will be able to cache the image based in this URL. Whenever the picture changes the picture id will also change. This should cause the browser to load the picture again.  Fetching the Contact Picture through the picture URL $UserId/ab/contacts/$ContactId/picture is now deprecated. A Photo Reference must be used with the URL as the PictureId. The photo reference is obtained as a part of the contact. 
     * <p><b>200</b> - Get snapshot response by snapshot id success response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param contactId  (required)
     * @param pictureId  (required)
     * @param size Retrieves the picture with specified size (optional)
     * @param imagetype Retrieves the picture with specified type Default is na. (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbContactsContactIdPicturePictureIdGetWithHttpInfo(String userId, String contactId, String pictureId, String size, String imagetype, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbContactsContactIdPicturePictureIdGet");
        }
        
        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contactId' when calling wsgPublicNabV1UserIdAbContactsContactIdPicturePictureIdGet");
        }
        
        // verify the required parameter 'pictureId' is set
        if (pictureId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pictureId' when calling wsgPublicNabV1UserIdAbContactsContactIdPicturePictureIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("contactId", contactId);
        uriVariables.put("pictureId", pictureId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "imagetype", imagetype));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "image/png"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/contacts/{contactId}/picture/{pictureId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post Create token account 58 pending
     * This method is used for adding the picture for the contact
     * <p><b>200</b> - contact picture add 200 response
     * <p><b>201</b> - contact picture add 201 response
     * <p><b>301</b> - contact picture add 301 response
     * <p><b>401</b> - contact picture add 401 response
     * <p><b>403</b> - contact picture add 403 response
     * <p><b>404</b> - contact picture add 404 response
     * <p><b>422</b> - contact picture add 422 response
     * <p><b>500</b> - contact picture add 500 response
     * @param userId  (required)
     * @param contactId  (required)
     * @param contentType  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param wsgPublicNabV1UserIdAbContactsContactIdPicturePutRequest  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbContactsContactIdPicturePost(String userId, String contactId, String contentType, String xF1ClientAuthorization, String authorizationDomain, String xClientSNCRPlatform, String authorization, WsgPublicNabV1UserIdAbContactsContactIdPicturePutRequest wsgPublicNabV1UserIdAbContactsContactIdPicturePutRequest) throws RestClientException {
        return wsgPublicNabV1UserIdAbContactsContactIdPicturePostWithHttpInfo(userId, contactId, contentType, xF1ClientAuthorization, authorizationDomain, xClientSNCRPlatform, authorization, wsgPublicNabV1UserIdAbContactsContactIdPicturePutRequest).getBody();
    }

    /**
     * Post Create token account 58 pending
     * This method is used for adding the picture for the contact
     * <p><b>200</b> - contact picture add 200 response
     * <p><b>201</b> - contact picture add 201 response
     * <p><b>301</b> - contact picture add 301 response
     * <p><b>401</b> - contact picture add 401 response
     * <p><b>403</b> - contact picture add 403 response
     * <p><b>404</b> - contact picture add 404 response
     * <p><b>422</b> - contact picture add 422 response
     * <p><b>500</b> - contact picture add 500 response
     * @param userId  (required)
     * @param contactId  (required)
     * @param contentType  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param wsgPublicNabV1UserIdAbContactsContactIdPicturePutRequest  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbContactsContactIdPicturePostWithHttpInfo(String userId, String contactId, String contentType, String xF1ClientAuthorization, String authorizationDomain, String xClientSNCRPlatform, String authorization, WsgPublicNabV1UserIdAbContactsContactIdPicturePutRequest wsgPublicNabV1UserIdAbContactsContactIdPicturePutRequest) throws RestClientException {
        Object localVarPostBody = wsgPublicNabV1UserIdAbContactsContactIdPicturePutRequest;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbContactsContactIdPicturePost");
        }
        
        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contactId' when calling wsgPublicNabV1UserIdAbContactsContactIdPicturePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("contactId", contactId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "image/gif"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/contacts/{contactId}/picture", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put modify address book contacts contact id picture 57 pending
     * This method is used for modifying the picture for the contact. When the contact picture is modified it gets a new photo reference or picture Id. This new photo reference or the picture id is returned in the imageid field.
     * <p><b>200</b> - contact picture modify 200 response
     * <p><b>301</b> - contact picture modify 301 response
     * <p><b>401</b> - contact picture modify 401 response
     * <p><b>403</b> - contact picture modify 403 response
     * <p><b>404</b> - contact picture modify 404 response
     * <p><b>409</b> - contact picture modify 409 response
     * <p><b>422</b> - contact picture modify 422 response
     * <p><b>500</b> - contact picture modify 500 response
     * @param userId  (required)
     * @param contactId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param myAttachment  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbContactsContactIdPicturePut(String userId, String contactId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, List<File> myAttachment) throws RestClientException {
        return wsgPublicNabV1UserIdAbContactsContactIdPicturePutWithHttpInfo(userId, contactId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, myAttachment).getBody();
    }

    /**
     * Put modify address book contacts contact id picture 57 pending
     * This method is used for modifying the picture for the contact. When the contact picture is modified it gets a new photo reference or picture Id. This new photo reference or the picture id is returned in the imageid field.
     * <p><b>200</b> - contact picture modify 200 response
     * <p><b>301</b> - contact picture modify 301 response
     * <p><b>401</b> - contact picture modify 401 response
     * <p><b>403</b> - contact picture modify 403 response
     * <p><b>404</b> - contact picture modify 404 response
     * <p><b>409</b> - contact picture modify 409 response
     * <p><b>422</b> - contact picture modify 422 response
     * <p><b>500</b> - contact picture modify 500 response
     * @param userId  (required)
     * @param contactId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param myAttachment  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbContactsContactIdPicturePutWithHttpInfo(String userId, String contactId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, List<File> myAttachment) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbContactsContactIdPicturePut");
        }
        
        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contactId' when calling wsgPublicNabV1UserIdAbContactsContactIdPicturePut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("contactId", contactId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        if (myAttachment != null)
            localVarFormParams.addAll("my-attachment", myAttachment.stream().map(FileSystemResource::new).collect(Collectors.toList()));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/contacts/{contactId}/picture", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put update address book contacts by contact id 53
     * This method is used for modifying a contact
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - contact modify 301 response
     * <p><b>401</b> - contact modify 401 response
     * <p><b>403</b> - contact modify 403 response
     * <p><b>404</b> - contact modify 404 response
     * <p><b>409</b> - contact modify 401 response
     * <p><b>415</b> - contact modify 415 response
     * <p><b>422</b> - contact modify 401 response
     * <p><b>500</b> - contact modify 500 response
     * @param userId  (required)
     * @param contactId  (required)
     * @param replace  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS          | ATTRIBUTES  | DESCRIPTION                                                                                | REQUIRED | |-------------------|-------------|--------------------------------------------------------------------------------------------|----------| | contact           | id          | Id of Contact                                                                              | YES      | | contact           | tempid      | Tempid of Contact                                                                          | OPTIONAL | | contact           | version     | Version of contact                                                                         | YES      | | firstname         |             | First Name of the contact                                                                  | NO       | | lastname          |             | Last Name of the contact                                                                   | NO       | | middlename        |             | Middle Name of the contact                                                                 | NO       | | nameprefix        |             | NamePrefix of contact                                                                      | NO       | | namesuffix        |             | NameSuffix of contact                                                                      | NO       | | nickname          |             | Nickname of contact                                                                        | NO       | | birthday          |             | Birthdate of contact                                                                       | NO       | | source            |             | The source from where the contact originated.                                              | RO       | | deletionsource    |             | Indicates the deletion source.                                                             | NO       | | endpointassoc     | type        | EndpoinType of contact                                                                     | RO       | | endpointassoc     | id          | EndpoinId of contact                                                                       | RO       | | endpointassoc     | name        | Endpoint name of contact                                                                   | NO       | | endpointassoc     | state       | Contact state to the endpoint The values might be promoted, demoted, propmote_pending etc. | NO       | | buddyassoc        | buddyuserid | Buddy UserId of contact                                                                    | RO       | | shareassoc        | id          | ShareId associated with contact                                                            | RO       | | shareassoc        | name        | ShareName associated with contact                                                          | RO       | | prefmodeofcontact | type        | The type of preferred mode of communication for the contact                                | NO       | | prefmodeofcontact | value       | The preferred mode of communication for the contact                                        | NO       | | conflicttype      |             | Conflict Type of contact                                                                   | RO       | | incaseofemergency |             | Specifies contact as ICE or not                                                            | NO       | | favorite          |             | Specifies contact as favourite                                                             | NO       | | photo             | ContentType | Photo of contact                                                                           | NO       | | photoreference    |             | Photo Reference or Picture ID                                                              | RO       | | anniversary       |             | Marriage anniversary date                                                                  | NO       | | spouse            |             | Spouse of contact                                                                          | NO       | | children          |             | Children Names of contact                                                                  | NO       | | note              |             | Note for the contact                                                                       | NO       | | orgname           |             | Company Name of contact                                                                    | NO       | | orgunit           |             | Company Department of contact                                                              | NO       | | jobtitle          |             | Job titile of contact                                                                      | NO       | | profession        |             | Profession of contact                                                                      | NO       | | assistant         |             | Assistant Name of contact                                                                  | NO       | | gender            |             | Gender of the contact                                                                      | NO       | | relationship      |             | Relationship of the contact with the person                                                | NO       | | maritalstatus     |             | Marital status of the contact                                                              | NO       | | timezone          |             | Timezone of the contact                                                                    | NO       | | created           |             | Created date of contact                                                                    | NO       | | modified          |             | Modified date of contact                                                                   | NO       | | tel               | type        | Telephone type of contact                                                                  | YES      | | tel               | indx        | Telephone indx of contact                                                                  | NO       | | number            |             | Telephone Number of contact                                                                | NO       | | carrier           |             | Telephone Carrier of contact                                                               | NO       | | preference        |             | Telephone Preference of contact                                                            | NO       | | email             | type        | Email Type of contact                                                                      | YES      | | email             | indx        | Email Indx of contact                                                                      | NO       | | address           |             | Email Address of contact                                                                   | NO       | | preference        |             | Email Preference of contact                                                                | NO       | | im                | type        | IM type of contact                                                                         | YES      | | address           |             | IM address of contact                                                                      | NO       | | preference        |             | IM preference of contact                                                                   | NO       | | address           | type        | Address type of the contact                                                                | YES      | | address           | indx        | Address indx of the contact                                                                | NO       | | pobox             |             | Post box number of the address                                                             | NO       | | street            |             | Street Number of the address                                                               | NO       | | apartment         |             | Apartment Number of the address                                                            | NO       | | city              |             | City of the address                                                                        | NO       | | state             |             | State of the address                                                                       | NO       | | zipcode           |             | Zipcode of the address                                                                     | NO       | | country           |             | Country of the address                                                                     | NO       | | preference        |             | Preference of the address                                                                  | NO       | | webpage           | type        | Webpage Type of contact                                                                    | YES      | | webpage           | indx        | Webpage Indx of contact                                                                    | NO       | | url               |             | Webpage Url of contact                                                                     | NO       | | groups            |             | Groups Type of contact                                                                     | YES      | | groups            | group       | Group added to contact                                                                     | NO       | | group             | id          | Group Id                                                                                   | YES      | | group             | name        | Name of the group                                                                          | YES      | | group             | version     | Version of the group                                                                       | YES      | | group             | type        | Group Type                                                                                 | YES      | | extfield          | name        | Name of the extensible field                                                               | YES      | | extfield          | value       | Value of the extensible field                                                              | YES      | | dedupe            |             | Dedupe status of the contact can be set to pending or completed                            | OPTIONAL |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbContactsContactIdPut(String userId, String contactId, Boolean replace, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdAbContactsContactIdPutWithHttpInfo(userId, contactId, replace, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Put update address book contacts by contact id 53
     * This method is used for modifying a contact
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - contact modify 301 response
     * <p><b>401</b> - contact modify 401 response
     * <p><b>403</b> - contact modify 403 response
     * <p><b>404</b> - contact modify 404 response
     * <p><b>409</b> - contact modify 401 response
     * <p><b>415</b> - contact modify 415 response
     * <p><b>422</b> - contact modify 401 response
     * <p><b>500</b> - contact modify 500 response
     * @param userId  (required)
     * @param contactId  (required)
     * @param replace  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS          | ATTRIBUTES  | DESCRIPTION                                                                                | REQUIRED | |-------------------|-------------|--------------------------------------------------------------------------------------------|----------| | contact           | id          | Id of Contact                                                                              | YES      | | contact           | tempid      | Tempid of Contact                                                                          | OPTIONAL | | contact           | version     | Version of contact                                                                         | YES      | | firstname         |             | First Name of the contact                                                                  | NO       | | lastname          |             | Last Name of the contact                                                                   | NO       | | middlename        |             | Middle Name of the contact                                                                 | NO       | | nameprefix        |             | NamePrefix of contact                                                                      | NO       | | namesuffix        |             | NameSuffix of contact                                                                      | NO       | | nickname          |             | Nickname of contact                                                                        | NO       | | birthday          |             | Birthdate of contact                                                                       | NO       | | source            |             | The source from where the contact originated.                                              | RO       | | deletionsource    |             | Indicates the deletion source.                                                             | NO       | | endpointassoc     | type        | EndpoinType of contact                                                                     | RO       | | endpointassoc     | id          | EndpoinId of contact                                                                       | RO       | | endpointassoc     | name        | Endpoint name of contact                                                                   | NO       | | endpointassoc     | state       | Contact state to the endpoint The values might be promoted, demoted, propmote_pending etc. | NO       | | buddyassoc        | buddyuserid | Buddy UserId of contact                                                                    | RO       | | shareassoc        | id          | ShareId associated with contact                                                            | RO       | | shareassoc        | name        | ShareName associated with contact                                                          | RO       | | prefmodeofcontact | type        | The type of preferred mode of communication for the contact                                | NO       | | prefmodeofcontact | value       | The preferred mode of communication for the contact                                        | NO       | | conflicttype      |             | Conflict Type of contact                                                                   | RO       | | incaseofemergency |             | Specifies contact as ICE or not                                                            | NO       | | favorite          |             | Specifies contact as favourite                                                             | NO       | | photo             | ContentType | Photo of contact                                                                           | NO       | | photoreference    |             | Photo Reference or Picture ID                                                              | RO       | | anniversary       |             | Marriage anniversary date                                                                  | NO       | | spouse            |             | Spouse of contact                                                                          | NO       | | children          |             | Children Names of contact                                                                  | NO       | | note              |             | Note for the contact                                                                       | NO       | | orgname           |             | Company Name of contact                                                                    | NO       | | orgunit           |             | Company Department of contact                                                              | NO       | | jobtitle          |             | Job titile of contact                                                                      | NO       | | profession        |             | Profession of contact                                                                      | NO       | | assistant         |             | Assistant Name of contact                                                                  | NO       | | gender            |             | Gender of the contact                                                                      | NO       | | relationship      |             | Relationship of the contact with the person                                                | NO       | | maritalstatus     |             | Marital status of the contact                                                              | NO       | | timezone          |             | Timezone of the contact                                                                    | NO       | | created           |             | Created date of contact                                                                    | NO       | | modified          |             | Modified date of contact                                                                   | NO       | | tel               | type        | Telephone type of contact                                                                  | YES      | | tel               | indx        | Telephone indx of contact                                                                  | NO       | | number            |             | Telephone Number of contact                                                                | NO       | | carrier           |             | Telephone Carrier of contact                                                               | NO       | | preference        |             | Telephone Preference of contact                                                            | NO       | | email             | type        | Email Type of contact                                                                      | YES      | | email             | indx        | Email Indx of contact                                                                      | NO       | | address           |             | Email Address of contact                                                                   | NO       | | preference        |             | Email Preference of contact                                                                | NO       | | im                | type        | IM type of contact                                                                         | YES      | | address           |             | IM address of contact                                                                      | NO       | | preference        |             | IM preference of contact                                                                   | NO       | | address           | type        | Address type of the contact                                                                | YES      | | address           | indx        | Address indx of the contact                                                                | NO       | | pobox             |             | Post box number of the address                                                             | NO       | | street            |             | Street Number of the address                                                               | NO       | | apartment         |             | Apartment Number of the address                                                            | NO       | | city              |             | City of the address                                                                        | NO       | | state             |             | State of the address                                                                       | NO       | | zipcode           |             | Zipcode of the address                                                                     | NO       | | country           |             | Country of the address                                                                     | NO       | | preference        |             | Preference of the address                                                                  | NO       | | webpage           | type        | Webpage Type of contact                                                                    | YES      | | webpage           | indx        | Webpage Indx of contact                                                                    | NO       | | url               |             | Webpage Url of contact                                                                     | NO       | | groups            |             | Groups Type of contact                                                                     | YES      | | groups            | group       | Group added to contact                                                                     | NO       | | group             | id          | Group Id                                                                                   | YES      | | group             | name        | Name of the group                                                                          | YES      | | group             | version     | Version of the group                                                                       | YES      | | group             | type        | Group Type                                                                                 | YES      | | extfield          | name        | Name of the extensible field                                                               | YES      | | extfield          | value       | Value of the extensible field                                                              | YES      | | dedupe            |             | Dedupe status of the contact can be set to pending or completed                            | OPTIONAL |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbContactsContactIdPutWithHttpInfo(String userId, String contactId, Boolean replace, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbContactsContactIdPut");
        }
        
        // verify the required parameter 'contactId' is set
        if (contactId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'contactId' when calling wsgPublicNabV1UserIdAbContactsContactIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("contactId", contactId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "replace", replace));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/contacts/{contactId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create address book contacts dedupe 64
     * Automatic dedupe. This method is used for posting contacts de-dupe job.
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - Successful response
     * <p><b>401</b> - Successful response
     * <p><b>403</b> - Successful response
     * <p><b>422</b> - Successful response
     * <p><b>500</b> - Successful response
     * @param userId  (required)
     * @param echo Contains the echo data recieved from the request (required)
     * @param dedupeAll Contains the information whether to trigger the de-dupe job for all the contacts in the userids default address book or not. (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbContactsDedupePost(String userId, String echo, Boolean dedupeAll, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdAbContactsDedupePostWithHttpInfo(userId, echo, dedupeAll, xF1ClientAuthorization, authorizationDomain, content, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Create address book contacts dedupe 64
     * Automatic dedupe. This method is used for posting contacts de-dupe job.
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - Successful response
     * <p><b>401</b> - Successful response
     * <p><b>403</b> - Successful response
     * <p><b>422</b> - Successful response
     * <p><b>500</b> - Successful response
     * @param userId  (required)
     * @param echo Contains the echo data recieved from the request (required)
     * @param dedupeAll Contains the information whether to trigger the de-dupe job for all the contacts in the userids default address book or not. (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbContactsDedupePostWithHttpInfo(String userId, String echo, Boolean dedupeAll, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbContactsDedupePost");
        }
        
        // verify the required parameter 'echo' is set
        if (echo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'echo' when calling wsgPublicNabV1UserIdAbContactsDedupePost");
        }
        
        // verify the required parameter 'dedupeAll' is set
        if (dedupeAll == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dedupeAll' when calling wsgPublicNabV1UserIdAbContactsDedupePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "echo", echo));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "dedupeAll", dedupeAll));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (content != null)
        localVarHeaderParams.add("Content", apiClient.parameterToString(content));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/contacts/dedupe", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Create Address book Contacts 55 pending
     * This method is used for retrieving the contacts.If the contact&#39;s phone has an associated ICS account ,this information is displayed through the \&quot;account\&quot; element.The corresponding preference to show if the account is visible or not is retrieved from \&quot;useridhidden\&quot; attribute. The response also shows the dedupe type whether pending or completed through the \&quot;dedupe\&quot; attribute.  NOTE : 1. Strings are compared case-insensitive. 2. For parameter field-tag.type any field name excluding the index can be specified. 3. Both the prefix and suffix wildcards are allowed as well, indicating substring match - e.g. *123*. 4. Date&amp;Time values are compared in full. That is, no substring matching for them. 5. A Boolean existential expression is supplied by omitting the value part - e.g. &amp;tel.mobile&amp; evaluates to true of mobile phone number exists. 6. A Boolean non-existential expression is supplied by appending a tilde (~) to the existential expression. E.g. &amp;~tel.mobile&amp; evaluates to true if a mobile phone number does not exist. 7. Only one of ascending or descending sort can be requested. 8. Range Filtering is requested through the query parameters \&quot;rangebegin\&quot; and \&quot;maxitems\&quot; 
     * <p><b>200</b> - Contact Photo Fetch Status  Synchronoss service can encounter issues while fetching the photo from the Image Server. If photo fetch fails the get contact call does not fail. This is specifically done to degrade the service rather than bringing it down. Applications must use the status attribute on the photo element to handle contact photo failures accordingly. The following table describes the contact photo fetch status codes. | status    | DESCRIPTION                                                  | |-----------|--------------------------------------------------------------| | success   | The contact photo was successfully retrieved.                | | client    | The contact photo was not fetched due to connection issues.  | | server    | The contact photo was not fetched due to server issues.      | | coding    | F1 coding issue. Please contact Synchronoss if you see this. | | transcode | Transcoding of the photo to the specified image type failed. | | notfound  | The contact photo was not found in the system.               | 
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param fields Obtains the contact with all fields (optional)
     * @param name Filter the contacts by a name field (optional)
     * @param email Filter the contacts by a email field (optional)
     * @param im Filter the contacts by a Im field (optional)
     * @param address Filter the contacts by a Address field (optional)
     * @param url Filter the contacts by a Url field (optional)
     * @param tel Filter the contacts by a Tel field (optional)
     * @param addressHome Filter the contacts by specified field type (optional)
     * @param addressHomeStreet Filter the contacts by subfield of the address fields (optional)
     * @param sortAsc Sort the contacts according to the field and ascending order specified (optional)
     * @param sortDesc Sort the contacts according to the field and descending order specified (optional)
     * @param rangebegin Specifies index of the starting contact item after sorting (optional)
     * @param maxnum Specifies maximum number of contact items to fetch after sorting (optional)
     * @param contactids Specifies a list of comma seperated contact ids (optional)
     * @param ff Specifies whether fields should be excluded or included. Values can be exclude or include. Default is include. (optional)
     * @param size Retrieves the contact&#39;s image with specified size (optional)
     * @param imagetype Retrieves the contact&#39;s image with specified type (optional)
     * @param conflicttype Retrieves the contacts with duplicates, conflicts or both. (optional)
     * @param groupId Retrieves the contacts using Group Id (optional)
     * @param groupIds Specifies a list of comma seperated Group Ids (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbContactsGet(String userId, String fields, String name, String email, String im, String address, String url, String tel, String addressHome, String addressHomeStreet, String sortAsc, String sortDesc, String rangebegin, String maxnum, String contactids, String ff, String size, String imagetype, String conflicttype, String groupId, String groupIds, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAbContactsGetWithHttpInfo(userId, fields, name, email, im, address, url, tel, addressHome, addressHomeStreet, sortAsc, sortDesc, rangebegin, maxnum, contactids, ff, size, imagetype, conflicttype, groupId, groupIds, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get Create Address book Contacts 55 pending
     * This method is used for retrieving the contacts.If the contact&#39;s phone has an associated ICS account ,this information is displayed through the \&quot;account\&quot; element.The corresponding preference to show if the account is visible or not is retrieved from \&quot;useridhidden\&quot; attribute. The response also shows the dedupe type whether pending or completed through the \&quot;dedupe\&quot; attribute.  NOTE : 1. Strings are compared case-insensitive. 2. For parameter field-tag.type any field name excluding the index can be specified. 3. Both the prefix and suffix wildcards are allowed as well, indicating substring match - e.g. *123*. 4. Date&amp;Time values are compared in full. That is, no substring matching for them. 5. A Boolean existential expression is supplied by omitting the value part - e.g. &amp;tel.mobile&amp; evaluates to true of mobile phone number exists. 6. A Boolean non-existential expression is supplied by appending a tilde (~) to the existential expression. E.g. &amp;~tel.mobile&amp; evaluates to true if a mobile phone number does not exist. 7. Only one of ascending or descending sort can be requested. 8. Range Filtering is requested through the query parameters \&quot;rangebegin\&quot; and \&quot;maxitems\&quot; 
     * <p><b>200</b> - Contact Photo Fetch Status  Synchronoss service can encounter issues while fetching the photo from the Image Server. If photo fetch fails the get contact call does not fail. This is specifically done to degrade the service rather than bringing it down. Applications must use the status attribute on the photo element to handle contact photo failures accordingly. The following table describes the contact photo fetch status codes. | status    | DESCRIPTION                                                  | |-----------|--------------------------------------------------------------| | success   | The contact photo was successfully retrieved.                | | client    | The contact photo was not fetched due to connection issues.  | | server    | The contact photo was not fetched due to server issues.      | | coding    | F1 coding issue. Please contact Synchronoss if you see this. | | transcode | Transcoding of the photo to the specified image type failed. | | notfound  | The contact photo was not found in the system.               | 
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param fields Obtains the contact with all fields (optional)
     * @param name Filter the contacts by a name field (optional)
     * @param email Filter the contacts by a email field (optional)
     * @param im Filter the contacts by a Im field (optional)
     * @param address Filter the contacts by a Address field (optional)
     * @param url Filter the contacts by a Url field (optional)
     * @param tel Filter the contacts by a Tel field (optional)
     * @param addressHome Filter the contacts by specified field type (optional)
     * @param addressHomeStreet Filter the contacts by subfield of the address fields (optional)
     * @param sortAsc Sort the contacts according to the field and ascending order specified (optional)
     * @param sortDesc Sort the contacts according to the field and descending order specified (optional)
     * @param rangebegin Specifies index of the starting contact item after sorting (optional)
     * @param maxnum Specifies maximum number of contact items to fetch after sorting (optional)
     * @param contactids Specifies a list of comma seperated contact ids (optional)
     * @param ff Specifies whether fields should be excluded or included. Values can be exclude or include. Default is include. (optional)
     * @param size Retrieves the contact&#39;s image with specified size (optional)
     * @param imagetype Retrieves the contact&#39;s image with specified type (optional)
     * @param conflicttype Retrieves the contacts with duplicates, conflicts or both. (optional)
     * @param groupId Retrieves the contacts using Group Id (optional)
     * @param groupIds Specifies a list of comma seperated Group Ids (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbContactsGetWithHttpInfo(String userId, String fields, String name, String email, String im, String address, String url, String tel, String addressHome, String addressHomeStreet, String sortAsc, String sortDesc, String rangebegin, String maxnum, String contactids, String ff, String size, String imagetype, String conflicttype, String groupId, String groupIds, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbContactsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "email", email));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "im", im));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "address", address));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "url", url));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "tel", tel));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "address.home", addressHome));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "address.home.street", addressHomeStreet));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort-asc", sortAsc));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort-desc", sortDesc));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "rangebegin", rangebegin));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxnum", maxnum));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "contactids", contactids));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "ff", ff));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "imagetype", imagetype));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "conflicttype", conflicttype));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "group.id", groupId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "group.ids", groupIds));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/contacts", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post Create Address book Contacts 55 pending
     * This method is used for adding the contacts 
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - Successful response
     * <p><b>401</b> - Successful response
     * <p><b>403</b> - Successful response
     * <p><b>422</b> - Successful response
     * <p><b>500</b> - Successful response
     * @param userId  (required)
     * @param dedupe flag to determine whether the contact will be added to default or import address book. default is false. (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES: |     ELEMENTS             |     ATTRIBUTES      |     DESCRIPTION                                                             |     REQUIRED    |     LENGTH                | |--------------------------|---------------------|-----------------------------------------------------------------------------|-----------------|---------------------------| |     contact              |     id              |     Id   of Contact                                                         |     OPTIONAL    |     RAW(   16 )           | |     contact              |     tempid          |     Tempid   of Contact                                                     |     OPTIONAL    |                           | |     contact              |     version         |     Version   of contact                                                    |     OPTIONAL    |     NUMBER(   6)          | |     firstname            |                     |     First   Name of the contact                                             |     NO          |     VARCHAR2(   255 )     | |     lastname             |                     |     Last   Name of the contact                                              |     NO          |     VARCHAR2(   255 )     | |     middlename           |                     |     Middle   Name of the contact                                            |     NO          |     VARCHAR2(   255 )     | |     nameprefix           |                     |     NamePrefix   of contact                                                 |     NO          |     VARCHAR2(   255 )     | |     namesuffix           |                     |     NameSuffix   of contact                                                 |     NO          |     VARCHAR2(   255 )     | |     nickname             |                     |     Nickname   of contact                                                   |     NO          |     VARCHAR2(   255 )     | |     birthday             |                     |     Birthdate   of contact                                                  |     NO          |     Date                  | |     source               |                     |     The   source from where the    contact originated.                      |     NO          |     VARCHAR2(255)         | |     deletionsource       |                     |     Indicates   the deletionsource                                          |     NO          |     VARCHAR2(255)         | |     endpointassoc        |     endpointtype    |     EndpoinType   of contact                                                |     RO          |     VARCHAR2(255)         | |     endpointassoc        |     endpointid      |     EndpoinId   of contact                                                  |     RO          |     VARCHAR2(1024)        | |     buddyassoc           |     buddyuserid     |     Buddy   UserId of contact                                               |     RO          |     NUMBER(20)            | |     shareassoc           |     id              |     ShareId   associated with contact                                       |     RO          |     RAW(16)               | |     shareassoc           |     name            |     ShareName   associated with contact                                     |     RO          |     VARCHAR2(1024)        | |     prefmodeofcontact    |     type            |     The   type of preferred mode of    communication for the contact        |     NO          |     VARCHAR2(   64 )      | |     prefmodeofcontact    |     value           |     The   preferred mode of    communication for the contact                |     NO          |     VARCHAR2(   255 )     | |     conflicttype         |                     |     Conflict   Type of contact                                              |     RO          |     CHAR(1)               | |     incaseofemergency    |                     |     Specifies   contact as ICE or not                                       |     NO          |     CHAR(1)               | |     favorite             |                     |     Specifies   contact as favourite                                        |     NO          |     CHAR(1)               | |     photo                |     ContentType     |     Photo   of contact                                                      |     NO          |     VARCHAR2(333)         | |     photoreference       |                     |     Photo   reference or the picture id                                     |     RO          |     VARCHAR2(333)         | |     anniversary          |                     |     Marriage   anniversary date                                             |     NO          |     Date                  | |     spouse               |                     |     Spouse   of contact                                                     |     NO          |     VARCHAR2(   255 )     | |     children             |                     |     Children   Names of contact                                             |     NO          |     VARCHAR2(   255 )     | |     note                 |                     |     Note   for the contact                                                  |     NO          |     CLOB                  | |     orgname              |                     |     Company   Name of contact                                               |     NO          |     VARCHAR2(   508 )     | |     orgunit              |                     |     Company   Department of contact                                         |     NO          |     VARCHAR2(   255 )     | |     jobtitle             |                     |     Job   titile of contact                                                 |     NO          |     VARCHAR2(   508 )     | |     profession           |                     |     Profession   of contact                                                 |     NO          |     VARCHAR2(   255 )     | |     assistant            |                     |     Assistant   Name of contact                                             |     NO          |     VARCHAR2(   255 )     | |     gender               |                     |     Gender   of the contact                                                 |     NO          |     CHAR(1)               | |     relationship         |                     |     Relationship   of the contact    with the person                        |     NO          |     VARCHAR2(255)         | |     maritalstatus        |                     |     Marital   status of the contact                                         |     NO          |     VARCHAR2(255)         | |     timezone             |                     |     Timezone   of the contact                                               |     NO          |     NUMBER(4)             | |     created              |                     |     Created   date of contact                                               |     NO          |     Date                  | |     modified             |                     |     Modified   date of contact                                              |     NO          |     Date                  | |     tel                  |     type            |     Telephone   type of contact                                             |     YES         |     NUMBER(   4 )         | |     tel                  |     indx            |     Telephone   indx of contact                                             |     NO          |                           | |     number               |                     |     Telephone   Number of contact                                           |     NO          |     VARCHAR2(   255 )     | |     carrier              |                     |     Telephone   Carrier of contact                                          |     NO          |     NUMBER(4)             | |     preference           |                     |     Telephone   Preference of contact                                       |     NO          |     NUMBER(2)             | |     email                |     type            |     Email   Type of contact                                                 |     YES         |     NUMBER(   4 )         | |     email                |     indx            |     Email   Indx of contact                                                 |     NO          |                           | |     address              |                     |     Email   Address of contact                                              |     NO          |     VARCHAR2(   255 )     | |     preference           |                     |     Email   Preference of contact                                           |     NO          |     NUMBER(2)             | |     im                   |     type            |     IM   type of contact                                                    |     YES         |     NUMBER(   4 )         | |     address              |                     |     IM   address of contact                                                 |     NO          |     VARCHAR2(   255 )     | |     preference           |                     |     IM   preference of contact                                              |     NO          |     NUMBER(2)             | |     address              |     type            |     Address   type of the contact                                           |     YES         |     NUMBER(   4 )         | |     address              |     indx            |     Address   indx of the contact                                           |     NO          |                           | |     pobox                |                     |     Post   box number of the address                                        |     NO          |     VARCHAR2(   508 )     | |     street               |                     |     Street   Number of the address                                          |     NO          |     VARCHAR2(   508 )     | |     apartment            |                     |     Apartment   Number of the address                                       |     NO          |     VARCHAR2(   508 )     | |     city                 |                     |     City   of the address                                                   |     NO          |     VARCHAR2(   508 )     | |     state                |                     |     State   of the address                                                  |     NO          |     VARCHAR2(   508 )     | |     zipcode              |                     |     Zipcode   of the address                                                |     NO          |     VARCHAR2(   255 )     | |     country              |                     |     Country   of the address                                                |     NO          |     VARCHAR2(   508 )     | |     preference           |                     |     Preference   of the address                                             |     NO          |     NUMBER(2)             | |     webpage              |     type            |     Webpage   Type of contact                                               |     YES         |     NUMBER(   4 )         | |     webpage              |     indx            |     Webpage   Indx of contact                                               |     NO          |                           | |     url                  |                     |     Webpage   Url of contact                                                |     NO          |     VARCHAR2(   1000 )    | |     groups               |                     |     Groups   type added to contact                                          |     YES         |                           | |     groups               |     group           |     Group   added to contact                                                |     NO          |                           | |     group                |     id              |     Group   Id                                                              |     YES         |     RAW(   16 )           | |     group                |     name            |     Name   of the group                                                     |     YES         |     VARCHAR2(50)          | |     group                |     version         |     Version   of the group                                                  |     YES         |     NUMBER(6)             | |     group                |     type            |     Group   Type                                                            |     YES         |     char(1)               | |     group                |     itemGuid        |     Group   item guid                                                       |     NO          |     RAW(   16 )           | |     extfield             |     name            |     Name   of the extensible field                                          |     YES         |     VARCHAR2(256)         | |     extfield             |     value           |     Value   of the extensible field                                         |     YES         |     VARCHAR2(256)         | |     dedupe               |                     |     Dedupe   status of the contact can    be set to pending or completed    |     OPTIONAL    |     VARCHAR2(   2 )       |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbContactsPost(String userId, Boolean dedupe, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdAbContactsPostWithHttpInfo(userId, dedupe, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Post Create Address book Contacts 55 pending
     * This method is used for adding the contacts 
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - Successful response
     * <p><b>401</b> - Successful response
     * <p><b>403</b> - Successful response
     * <p><b>422</b> - Successful response
     * <p><b>500</b> - Successful response
     * @param userId  (required)
     * @param dedupe flag to determine whether the contact will be added to default or import address book. default is false. (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES: |     ELEMENTS             |     ATTRIBUTES      |     DESCRIPTION                                                             |     REQUIRED    |     LENGTH                | |--------------------------|---------------------|-----------------------------------------------------------------------------|-----------------|---------------------------| |     contact              |     id              |     Id   of Contact                                                         |     OPTIONAL    |     RAW(   16 )           | |     contact              |     tempid          |     Tempid   of Contact                                                     |     OPTIONAL    |                           | |     contact              |     version         |     Version   of contact                                                    |     OPTIONAL    |     NUMBER(   6)          | |     firstname            |                     |     First   Name of the contact                                             |     NO          |     VARCHAR2(   255 )     | |     lastname             |                     |     Last   Name of the contact                                              |     NO          |     VARCHAR2(   255 )     | |     middlename           |                     |     Middle   Name of the contact                                            |     NO          |     VARCHAR2(   255 )     | |     nameprefix           |                     |     NamePrefix   of contact                                                 |     NO          |     VARCHAR2(   255 )     | |     namesuffix           |                     |     NameSuffix   of contact                                                 |     NO          |     VARCHAR2(   255 )     | |     nickname             |                     |     Nickname   of contact                                                   |     NO          |     VARCHAR2(   255 )     | |     birthday             |                     |     Birthdate   of contact                                                  |     NO          |     Date                  | |     source               |                     |     The   source from where the    contact originated.                      |     NO          |     VARCHAR2(255)         | |     deletionsource       |                     |     Indicates   the deletionsource                                          |     NO          |     VARCHAR2(255)         | |     endpointassoc        |     endpointtype    |     EndpoinType   of contact                                                |     RO          |     VARCHAR2(255)         | |     endpointassoc        |     endpointid      |     EndpoinId   of contact                                                  |     RO          |     VARCHAR2(1024)        | |     buddyassoc           |     buddyuserid     |     Buddy   UserId of contact                                               |     RO          |     NUMBER(20)            | |     shareassoc           |     id              |     ShareId   associated with contact                                       |     RO          |     RAW(16)               | |     shareassoc           |     name            |     ShareName   associated with contact                                     |     RO          |     VARCHAR2(1024)        | |     prefmodeofcontact    |     type            |     The   type of preferred mode of    communication for the contact        |     NO          |     VARCHAR2(   64 )      | |     prefmodeofcontact    |     value           |     The   preferred mode of    communication for the contact                |     NO          |     VARCHAR2(   255 )     | |     conflicttype         |                     |     Conflict   Type of contact                                              |     RO          |     CHAR(1)               | |     incaseofemergency    |                     |     Specifies   contact as ICE or not                                       |     NO          |     CHAR(1)               | |     favorite             |                     |     Specifies   contact as favourite                                        |     NO          |     CHAR(1)               | |     photo                |     ContentType     |     Photo   of contact                                                      |     NO          |     VARCHAR2(333)         | |     photoreference       |                     |     Photo   reference or the picture id                                     |     RO          |     VARCHAR2(333)         | |     anniversary          |                     |     Marriage   anniversary date                                             |     NO          |     Date                  | |     spouse               |                     |     Spouse   of contact                                                     |     NO          |     VARCHAR2(   255 )     | |     children             |                     |     Children   Names of contact                                             |     NO          |     VARCHAR2(   255 )     | |     note                 |                     |     Note   for the contact                                                  |     NO          |     CLOB                  | |     orgname              |                     |     Company   Name of contact                                               |     NO          |     VARCHAR2(   508 )     | |     orgunit              |                     |     Company   Department of contact                                         |     NO          |     VARCHAR2(   255 )     | |     jobtitle             |                     |     Job   titile of contact                                                 |     NO          |     VARCHAR2(   508 )     | |     profession           |                     |     Profession   of contact                                                 |     NO          |     VARCHAR2(   255 )     | |     assistant            |                     |     Assistant   Name of contact                                             |     NO          |     VARCHAR2(   255 )     | |     gender               |                     |     Gender   of the contact                                                 |     NO          |     CHAR(1)               | |     relationship         |                     |     Relationship   of the contact    with the person                        |     NO          |     VARCHAR2(255)         | |     maritalstatus        |                     |     Marital   status of the contact                                         |     NO          |     VARCHAR2(255)         | |     timezone             |                     |     Timezone   of the contact                                               |     NO          |     NUMBER(4)             | |     created              |                     |     Created   date of contact                                               |     NO          |     Date                  | |     modified             |                     |     Modified   date of contact                                              |     NO          |     Date                  | |     tel                  |     type            |     Telephone   type of contact                                             |     YES         |     NUMBER(   4 )         | |     tel                  |     indx            |     Telephone   indx of contact                                             |     NO          |                           | |     number               |                     |     Telephone   Number of contact                                           |     NO          |     VARCHAR2(   255 )     | |     carrier              |                     |     Telephone   Carrier of contact                                          |     NO          |     NUMBER(4)             | |     preference           |                     |     Telephone   Preference of contact                                       |     NO          |     NUMBER(2)             | |     email                |     type            |     Email   Type of contact                                                 |     YES         |     NUMBER(   4 )         | |     email                |     indx            |     Email   Indx of contact                                                 |     NO          |                           | |     address              |                     |     Email   Address of contact                                              |     NO          |     VARCHAR2(   255 )     | |     preference           |                     |     Email   Preference of contact                                           |     NO          |     NUMBER(2)             | |     im                   |     type            |     IM   type of contact                                                    |     YES         |     NUMBER(   4 )         | |     address              |                     |     IM   address of contact                                                 |     NO          |     VARCHAR2(   255 )     | |     preference           |                     |     IM   preference of contact                                              |     NO          |     NUMBER(2)             | |     address              |     type            |     Address   type of the contact                                           |     YES         |     NUMBER(   4 )         | |     address              |     indx            |     Address   indx of the contact                                           |     NO          |                           | |     pobox                |                     |     Post   box number of the address                                        |     NO          |     VARCHAR2(   508 )     | |     street               |                     |     Street   Number of the address                                          |     NO          |     VARCHAR2(   508 )     | |     apartment            |                     |     Apartment   Number of the address                                       |     NO          |     VARCHAR2(   508 )     | |     city                 |                     |     City   of the address                                                   |     NO          |     VARCHAR2(   508 )     | |     state                |                     |     State   of the address                                                  |     NO          |     VARCHAR2(   508 )     | |     zipcode              |                     |     Zipcode   of the address                                                |     NO          |     VARCHAR2(   255 )     | |     country              |                     |     Country   of the address                                                |     NO          |     VARCHAR2(   508 )     | |     preference           |                     |     Preference   of the address                                             |     NO          |     NUMBER(2)             | |     webpage              |     type            |     Webpage   Type of contact                                               |     YES         |     NUMBER(   4 )         | |     webpage              |     indx            |     Webpage   Indx of contact                                               |     NO          |                           | |     url                  |                     |     Webpage   Url of contact                                                |     NO          |     VARCHAR2(   1000 )    | |     groups               |                     |     Groups   type added to contact                                          |     YES         |                           | |     groups               |     group           |     Group   added to contact                                                |     NO          |                           | |     group                |     id              |     Group   Id                                                              |     YES         |     RAW(   16 )           | |     group                |     name            |     Name   of the group                                                     |     YES         |     VARCHAR2(50)          | |     group                |     version         |     Version   of the group                                                  |     YES         |     NUMBER(6)             | |     group                |     type            |     Group   Type                                                            |     YES         |     char(1)               | |     group                |     itemGuid        |     Group   item guid                                                       |     NO          |     RAW(   16 )           | |     extfield             |     name            |     Name   of the extensible field                                          |     YES         |     VARCHAR2(256)         | |     extfield             |     value           |     Value   of the extensible field                                         |     YES         |     VARCHAR2(256)         | |     dedupe               |                     |     Dedupe   status of the contact can    be set to pending or completed    |     OPTIONAL    |     VARCHAR2(   2 )       |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbContactsPostWithHttpInfo(String userId, Boolean dedupe, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbContactsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "dedupe", dedupe));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/contacts", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put Create Address book Contacts 55 pending
     * This method is used for modifying the contacts.The following operations are supported | OPERATION  | DESCRIPTION                    | |------------|--------------------------------| | DELETE     | Deletes contacts               | | PERMDELETE | Permanent Deletion of contacts | | MODIFY     | Modify contacts                | | PROMOTE    | Promote contacts               | | DEMOTE     | Demote contacts                | 
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - Successful response
     * <p><b>401</b> - Successful response
     * <p><b>403</b> - Successful response
     * <p><b>422</b> - Successful response
     * <p><b>500</b> - Successful response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES specific to the operations performed | ELEMENTS          | ATTRIBUTES  | DESCRIPTION                                                                                | REQUIRED               | |-------------------|-------------|--------------------------------------------------------------------------------------------|------------------------| | modify            | replace     | boolean value specifies the operation is modify or replace                                 | YES. Default is modify | | contact           | id          | Id of Contact                                                                              | YES                    | | contact           | tempid      | Tempid of Contact                                                                          | NOT NEEDED             | | contact           | version     | Version of contact                                                                         | YES                    | | firstname         |             | First Name of the contact                                                                  | NO                     | | lastname          |             | Last Name of the contact                                                                   | NO                     | | middlename        |             | Middle Name of the contact                                                                 | NO                     | | nameprefix        |             | NamePrefix of contact                                                                      | NO                     | | namesuffix        |             | NameSuffix of contact                                                                      | NO                     | | nickname          |             | Nickname of contact                                                                        | NO                     | | birthday          |             | Birthdate of contact                                                                       | NO                     | | source            |             | The source from where the contact originated.                                              | RO                     | | deletionsource    |             | Indicates the deletion source.                                                             | NO                     | | endpointassoc     | type        | EndpoinType of contact                                                                     | RO                     | | endpointassoc     | id          | EndpoinId of contact                                                                       | RO                     | | endpointassoc     | name        | Endpoint name of contact                                                                   | NO                     | | endpointassoc     | state       | Contact state to the endpoint The values might be promoted, demoted, propmote_pending etc. | NO                     | | buddyassoc        | buddyuserid | Buddy UserId of contact                                                                    | RO                     | | shareassoc        | id          | ShareId associated with contact                                                            | RO                     | | shareassoc        | name        | ShareName associated with contact                                                          | RO                     | | prefmodeofcontact | type        | The type of preferred mode of communication for the contact                                | NO                     | | prefmodeofcontact | value       | The preferred mode of communication for the contact                                        | NO                     | | conflicttype      |             | Conflict Type of contact                                                                   | RO                     | | incaseofemergency |             | Specifies contact as ICE or not                                                            | NO                     | | favorite          |             | Specifies contact as favourite                                                             | NO                     | | photo             | ContentType | Photo of contact                                                                           | NO                     | | photoreference    |             | Photo of contact                                                                           | RO                     | | anniversary       |             | Marriage anniversary date                                                                  | NO                     | | spouse            |             | Spouse of contact                                                                          | NO                     | | children          |             | Children Names of contact                                                                  | NO                     | | note              |             | Note for the contact                                                                       | NO                     | | orgname           |             | Company Name of contact                                                                    | NO                     | | orgunit           |             | Company Department of contact                                                              | NO                     | | jobtitle          |             | Job titile of contact                                                                      | NO                     | | profession        |             | Profession of contact                                                                      | NO                     | | assistant         |             | Assistant Name of contact                                                                  | NO                     | | gender            |             | Gender of the contact                                                                      | NO                     | | relationship      |             | Relationship of the contact with the person                                                | NO                     | | maritalstatus     |             | Marital status of the contact                                                              | NO                     | | timezone          |             | Timezone of the contact                                                                    | NO                     | | created           |             | Created date of contact                                                                    | NO                     | | modified          |             | Modified date of contact                                                                   | NO                     | | tel               | type        | Telephone type of contact                                                                  | YES                    | | tel               | indx        | Telephone indx of contact                                                                  | NO                     | | number            |             | Telephone Number of contact                                                                | NO                     | | carrier           |             | Telephone Carrier of contact                                                               | NO                     | | preference        |             | Telephone Preference of contact                                                            | NO                     | | email             | type        | Email Type of contact                                                                      | YES                    | | email             | indx        | Email Indx of contact                                                                      | NO                     | | address           |             | Email Address of contact                                                                   | NO                     | | preference        |             | Email Preference of contact                                                                | NO                     | | im                | type        | IM type of contact                                                                         | YES                    | | address           |             | IM address of contact                                                                      | NO                     | | preference        |             | IM preference of contact                                                                   | NO                     | | address           | type        | Address type of the contact                                                                | YES                    | | address           | indx        | Address indx of the contact                                                                | NO                     | | pobox             |             | Post box number of the address                                                             | NO                     | | street            |             | Street Number of the address                                                               | NO                     | | apartment         |             | Apartment Number of the address                                                            | NO                     | | city              |             | City of the address                                                                        | NO                     | | state             |             | State of the address                                                                       | NO                     | | zipcode           |             | Zipcode of the address                                                                     | NO                     | | country           |             | Country of the address                                                                     | NO                     | | preference        |             | Preference of the address                                                                  | NO                     | | webpage           | type        | Webpage Type of contact                                                                    | YES                    | | webpage           | indx        | Webpage Indx of contact                                                                    | NO                     | | url               |             | Webpage Url of contact                                                                     | NO                     | | groups            |             | Groups Type of contact                                                                     | YES                    | | groups            | group       | Group added to contact                                                                     | NO                     | | group             | id          | Group Id                                                                                   | YES                    | | group             | name        | Name of the group                                                                          | YES                    | | group             | version     | Version of the group                                                                       | YES                    | | group             | type        | Group Type                                                                                 | YES                    | | group             | itemGuid    | Group item guid                                                                            | NO                     | | extfield          | name        | Name of the extensible field                                                               | YES                    | | extfield          | value       | Value of the extensible field                                                              | YES                    | | DELETE            | override    | boolean value if set contact version is not considered while deleting contact              | YES.                   | | PROMOTE           | override    | boolean value if set contact version is not considered while promoting contact             | NO.                    | | DEMOTE            | override    | boolean value if set contact version is not considered while demoting contact              | NO.                    | | dedupe            |             | Dedupe status of the contact can be set to pending or completed                            | OPTIONAL               |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbContactsPut(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdAbContactsPutWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Put Create Address book Contacts 55 pending
     * This method is used for modifying the contacts.The following operations are supported | OPERATION  | DESCRIPTION                    | |------------|--------------------------------| | DELETE     | Deletes contacts               | | PERMDELETE | Permanent Deletion of contacts | | MODIFY     | Modify contacts                | | PROMOTE    | Promote contacts               | | DEMOTE     | Demote contacts                | 
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - Successful response
     * <p><b>401</b> - Successful response
     * <p><b>403</b> - Successful response
     * <p><b>422</b> - Successful response
     * <p><b>500</b> - Successful response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES specific to the operations performed | ELEMENTS          | ATTRIBUTES  | DESCRIPTION                                                                                | REQUIRED               | |-------------------|-------------|--------------------------------------------------------------------------------------------|------------------------| | modify            | replace     | boolean value specifies the operation is modify or replace                                 | YES. Default is modify | | contact           | id          | Id of Contact                                                                              | YES                    | | contact           | tempid      | Tempid of Contact                                                                          | NOT NEEDED             | | contact           | version     | Version of contact                                                                         | YES                    | | firstname         |             | First Name of the contact                                                                  | NO                     | | lastname          |             | Last Name of the contact                                                                   | NO                     | | middlename        |             | Middle Name of the contact                                                                 | NO                     | | nameprefix        |             | NamePrefix of contact                                                                      | NO                     | | namesuffix        |             | NameSuffix of contact                                                                      | NO                     | | nickname          |             | Nickname of contact                                                                        | NO                     | | birthday          |             | Birthdate of contact                                                                       | NO                     | | source            |             | The source from where the contact originated.                                              | RO                     | | deletionsource    |             | Indicates the deletion source.                                                             | NO                     | | endpointassoc     | type        | EndpoinType of contact                                                                     | RO                     | | endpointassoc     | id          | EndpoinId of contact                                                                       | RO                     | | endpointassoc     | name        | Endpoint name of contact                                                                   | NO                     | | endpointassoc     | state       | Contact state to the endpoint The values might be promoted, demoted, propmote_pending etc. | NO                     | | buddyassoc        | buddyuserid | Buddy UserId of contact                                                                    | RO                     | | shareassoc        | id          | ShareId associated with contact                                                            | RO                     | | shareassoc        | name        | ShareName associated with contact                                                          | RO                     | | prefmodeofcontact | type        | The type of preferred mode of communication for the contact                                | NO                     | | prefmodeofcontact | value       | The preferred mode of communication for the contact                                        | NO                     | | conflicttype      |             | Conflict Type of contact                                                                   | RO                     | | incaseofemergency |             | Specifies contact as ICE or not                                                            | NO                     | | favorite          |             | Specifies contact as favourite                                                             | NO                     | | photo             | ContentType | Photo of contact                                                                           | NO                     | | photoreference    |             | Photo of contact                                                                           | RO                     | | anniversary       |             | Marriage anniversary date                                                                  | NO                     | | spouse            |             | Spouse of contact                                                                          | NO                     | | children          |             | Children Names of contact                                                                  | NO                     | | note              |             | Note for the contact                                                                       | NO                     | | orgname           |             | Company Name of contact                                                                    | NO                     | | orgunit           |             | Company Department of contact                                                              | NO                     | | jobtitle          |             | Job titile of contact                                                                      | NO                     | | profession        |             | Profession of contact                                                                      | NO                     | | assistant         |             | Assistant Name of contact                                                                  | NO                     | | gender            |             | Gender of the contact                                                                      | NO                     | | relationship      |             | Relationship of the contact with the person                                                | NO                     | | maritalstatus     |             | Marital status of the contact                                                              | NO                     | | timezone          |             | Timezone of the contact                                                                    | NO                     | | created           |             | Created date of contact                                                                    | NO                     | | modified          |             | Modified date of contact                                                                   | NO                     | | tel               | type        | Telephone type of contact                                                                  | YES                    | | tel               | indx        | Telephone indx of contact                                                                  | NO                     | | number            |             | Telephone Number of contact                                                                | NO                     | | carrier           |             | Telephone Carrier of contact                                                               | NO                     | | preference        |             | Telephone Preference of contact                                                            | NO                     | | email             | type        | Email Type of contact                                                                      | YES                    | | email             | indx        | Email Indx of contact                                                                      | NO                     | | address           |             | Email Address of contact                                                                   | NO                     | | preference        |             | Email Preference of contact                                                                | NO                     | | im                | type        | IM type of contact                                                                         | YES                    | | address           |             | IM address of contact                                                                      | NO                     | | preference        |             | IM preference of contact                                                                   | NO                     | | address           | type        | Address type of the contact                                                                | YES                    | | address           | indx        | Address indx of the contact                                                                | NO                     | | pobox             |             | Post box number of the address                                                             | NO                     | | street            |             | Street Number of the address                                                               | NO                     | | apartment         |             | Apartment Number of the address                                                            | NO                     | | city              |             | City of the address                                                                        | NO                     | | state             |             | State of the address                                                                       | NO                     | | zipcode           |             | Zipcode of the address                                                                     | NO                     | | country           |             | Country of the address                                                                     | NO                     | | preference        |             | Preference of the address                                                                  | NO                     | | webpage           | type        | Webpage Type of contact                                                                    | YES                    | | webpage           | indx        | Webpage Indx of contact                                                                    | NO                     | | url               |             | Webpage Url of contact                                                                     | NO                     | | groups            |             | Groups Type of contact                                                                     | YES                    | | groups            | group       | Group added to contact                                                                     | NO                     | | group             | id          | Group Id                                                                                   | YES                    | | group             | name        | Name of the group                                                                          | YES                    | | group             | version     | Version of the group                                                                       | YES                    | | group             | type        | Group Type                                                                                 | YES                    | | group             | itemGuid    | Group item guid                                                                            | NO                     | | extfield          | name        | Name of the extensible field                                                               | YES                    | | extfield          | value       | Value of the extensible field                                                              | YES                    | | DELETE            | override    | boolean value if set contact version is not considered while deleting contact              | YES.                   | | PROMOTE           | override    | boolean value if set contact version is not considered while promoting contact             | NO.                    | | DEMOTE            | override    | boolean value if set contact version is not considered while demoting contact              | NO.                    | | dedupe            |             | Dedupe status of the contact can be set to pending or completed                            | OPTIONAL               |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbContactsPutWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbContactsPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/contacts", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Address Book 97
     * This method returns the address book object for NAB for a user. By default only the basic information about an address book is returned. However, changes in the address book from a specific date can be obtained by specifying a from date in the parameter and setting the changes parameter to true.
     * <p><b>200</b> - get address book response
     * <p><b>301</b> - get address book response
     * <p><b>400</b> - get address book response
     * <p><b>401</b> - get address book response
     * <p><b>403</b> - get address book response
     * <p><b>422</b> - get address book response
     * <p><b>500</b> - get address book response
     * @param userId  (required)
     * @param from Retrieves the addressbook changes from the specified date (optional)
     * @param changes This flag allows server to include all the addressbook changes. If this flag is set shown. Changes value is false specifies that show only contactcount,recycle count,created time and modifiedDateTime. (optional)
     * @param type This flag allows server to retrieve all or particular addressbook changes. If this flag is set to all means it will fetch all addressbooks changes , or type&#x3D;addr_name it will fetch particular addr changes , default it will fetch default addre book changes . (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbGet(String userId, String from, Boolean changes, String type, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAbGetWithHttpInfo(userId, from, changes, type, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get Address Book 97
     * This method returns the address book object for NAB for a user. By default only the basic information about an address book is returned. However, changes in the address book from a specific date can be obtained by specifying a from date in the parameter and setting the changes parameter to true.
     * <p><b>200</b> - get address book response
     * <p><b>301</b> - get address book response
     * <p><b>400</b> - get address book response
     * <p><b>401</b> - get address book response
     * <p><b>403</b> - get address book response
     * <p><b>422</b> - get address book response
     * <p><b>500</b> - get address book response
     * @param userId  (required)
     * @param from Retrieves the addressbook changes from the specified date (optional)
     * @param changes This flag allows server to include all the addressbook changes. If this flag is set shown. Changes value is false specifies that show only contactcount,recycle count,created time and modifiedDateTime. (optional)
     * @param type This flag allows server to retrieve all or particular addressbook changes. If this flag is set to all means it will fetch all addressbooks changes , or type&#x3D;addr_name it will fetch particular addr changes , default it will fetch default addre book changes . (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbGetWithHttpInfo(String userId, String from, Boolean changes, String type, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "changes", changes));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post Create Address Book Group 27
     * This method is used for adding a new group. You can also add this group to multiple contacts in the same call by specifying multiple contact references. If you specify contact references, the adding of new group and adding the group to multiple contacts will be performed as a single transaction.
     * <p><b>200</b> - Successful response
     * <p><b>422</b> - Groupname already exists
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES | DESCRIPTION                      | REQUIRED | |----------|------------|----------------------------------|----------| | group    | type       | group-data element,type of group | YES      | | group    | name       | name of group                    | YES      | | group    | tempid     | tempid of group                  | YES      | | group    | itemGuid   | Group item guid                  | NO       | | contact  | id         | contact-data element,contact-id  | NO       | | contact  | tempid     | tempid of contact                | NO       | | contact  | version    | contact version                  | NO       |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbGroupPost(String userId, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdAbGroupPostWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, content, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Post Create Address Book Group 27
     * This method is used for adding a new group. You can also add this group to multiple contacts in the same call by specifying multiple contact references. If you specify contact references, the adding of new group and adding the group to multiple contacts will be performed as a single transaction.
     * <p><b>200</b> - Successful response
     * <p><b>422</b> - Groupname already exists
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES | DESCRIPTION                      | REQUIRED | |----------|------------|----------------------------------|----------| | group    | type       | group-data element,type of group | YES      | | group    | name       | name of group                    | YES      | | group    | tempid     | tempid of group                  | YES      | | group    | itemGuid   | Group item guid                  | NO       | | contact  | id         | contact-data element,contact-id  | NO       | | contact  | tempid     | tempid of contact                | NO       | | contact  | version    | contact version                  | NO       |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbGroupPostWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbGroupPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (content != null)
        localVarHeaderParams.add("Content", apiClient.parameterToString(content));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/group", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Create Address Book Groups 26
     * This method is used for retrieving multiple groups.
     * <p><b>200</b> - Group element will hold two guids: a) id represent the nab guid b) itemGuid represents to the syncserver/middle guid   ItemGuid will be shown in the getGroup/s response after the sync to middle.
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param groupType Type of Group,type which can be specified as web or mobile Default is all. (optional)
     * @param type Addressbook name will be specified for retrieveing groups, Default is null or default addressbook. (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbGroupsGet(String userId, String groupType, String type, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAbGroupsGetWithHttpInfo(userId, groupType, type, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get Create Address Book Groups 26
     * This method is used for retrieving multiple groups.
     * <p><b>200</b> - Group element will hold two guids: a) id represent the nab guid b) itemGuid represents to the syncserver/middle guid   ItemGuid will be shown in the getGroup/s response after the sync to middle.
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param groupType Type of Group,type which can be specified as web or mobile Default is all. (optional)
     * @param type Addressbook name will be specified for retrieveing groups, Default is null or default addressbook. (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbGroupsGetWithHttpInfo(String userId, String groupType, String type, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbGroupsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupType", groupType));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/groups", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete address book group by group id 25 pending
     * This method is used for deleting a group. Deleting a group will remove it from all the contacts that added the group. This call will end up modifying the contacts that have the group.
     * <p><b>200</b> - The response for deleting a group show the contacts associated with the group as the version of the contacts also gets modified.
     * <p><b>301</b> - group delete 301 response
     * <p><b>401</b> - group delete 401 response
     * <p><b>404</b> - group delete 404 response
     * <p><b>422</b> - group delete 422 response
     * <p><b>500</b> - group delete 500 response
     * @param userId  (required)
     * @param groupId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbGroupsGroupIdDelete(String userId, String groupId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAbGroupsGroupIdDeleteWithHttpInfo(userId, groupId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Delete address book group by group id 25 pending
     * This method is used for deleting a group. Deleting a group will remove it from all the contacts that added the group. This call will end up modifying the contacts that have the group.
     * <p><b>200</b> - The response for deleting a group show the contacts associated with the group as the version of the contacts also gets modified.
     * <p><b>301</b> - group delete 301 response
     * <p><b>401</b> - group delete 401 response
     * <p><b>404</b> - group delete 404 response
     * <p><b>422</b> - group delete 422 response
     * <p><b>500</b> - group delete 500 response
     * @param userId  (required)
     * @param groupId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbGroupsGroupIdDeleteWithHttpInfo(String userId, String groupId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbGroupsGroupIdDelete");
        }
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling wsgPublicNabV1UserIdAbGroupsGroupIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("groupId", groupId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/groups/{groupId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Address Book Groups by groupId 25
     * This method is used for retrieving the group information using the group id.
     * <p><b>200</b> - Group element will hold two guids: a) id represent the nab guid b) itemGuid represents to the syncserver/middle guid   ItemGuid will be shown in the getGroup/s response after the sync to middle.
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param groupId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbGroupsGroupIdGet(String userId, String groupId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAbGroupsGroupIdGetWithHttpInfo(userId, groupId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get Address Book Groups by groupId 25
     * This method is used for retrieving the group information using the group id.
     * <p><b>200</b> - Group element will hold two guids: a) id represent the nab guid b) itemGuid represents to the syncserver/middle guid   ItemGuid will be shown in the getGroup/s response after the sync to middle.
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param groupId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbGroupsGroupIdGetWithHttpInfo(String userId, String groupId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbGroupsGroupIdGet");
        }
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling wsgPublicNabV1UserIdAbGroupsGroupIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("groupId", groupId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/groups/{groupId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put modify Address Book Groups 25
     * This method is used for modifying the group. A group can only be renamed. Modifying the group name will result in change to the version number of the group. INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES | DESCRIPTION                      | REQUIRED | |----------|------------|----------------------------------|----------| | group    | type       | group-data element,type of group | YES      | | group    | id         | id of the group                  | YES      | | group    | name       | name of the group                | YES      | | group    | version    | version of the group             | YES      | 
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - modifying group 301 response
     * <p><b>401</b> - modifying group 401 response
     * <p><b>403</b> - modifying group 301 response
     * <p><b>404</b> - modifying group 301 response
     * <p><b>409</b> - modifying group 409 response
     * <p><b>422</b> - modifying group 422 response
     * <p><b>500</b> - modifying group 500 response
     * @param userId  (required)
     * @param groupId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbGroupsGroupIdPut(String userId, String groupId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdAbGroupsGroupIdPutWithHttpInfo(userId, groupId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Put modify Address Book Groups 25
     * This method is used for modifying the group. A group can only be renamed. Modifying the group name will result in change to the version number of the group. INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES | DESCRIPTION                      | REQUIRED | |----------|------------|----------------------------------|----------| | group    | type       | group-data element,type of group | YES      | | group    | id         | id of the group                  | YES      | | group    | name       | name of the group                | YES      | | group    | version    | version of the group             | YES      | 
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - modifying group 301 response
     * <p><b>401</b> - modifying group 401 response
     * <p><b>403</b> - modifying group 301 response
     * <p><b>404</b> - modifying group 301 response
     * <p><b>409</b> - modifying group 409 response
     * <p><b>422</b> - modifying group 422 response
     * <p><b>500</b> - modifying group 500 response
     * @param userId  (required)
     * @param groupId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbGroupsGroupIdPutWithHttpInfo(String userId, String groupId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbGroupsGroupIdPut");
        }
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling wsgPublicNabV1UserIdAbGroupsGroupIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("groupId", groupId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/groups/{groupId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post Create Address Book Groups 26
     * This method is used for adding multiple groups. You can also add the groups to multiple contacts in the same call by specifying multiple contact references.
     * <p><b>200</b> - Successful response
     * <p><b>201</b> - Successful response
     * <p><b>301</b> - Successful response
     * <p><b>401</b> - Successful response
     * <p><b>403</b> - Successful response
     * <p><b>422</b> - Successful response
     * <p><b>500</b> - Successful response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES | DESCRIPTION                      | REQUIRED | |----------|------------|----------------------------------|----------| | group    | type       | group-data element,type of group | YES      | | group    | name       | name of group                    | YES      | | group    | tempid     | tempid of group                  | YES      | | group    | itemGuid   | Group item guid                  | NO       | | contact  | id         | contact-data element,contact-id  | NO       | | contact  | tempid     | tempid of contact                | NO       | | contact  | version    | contact version                  | NO       |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbGroupsPost(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdAbGroupsPostWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Post Create Address Book Groups 26
     * This method is used for adding multiple groups. You can also add the groups to multiple contacts in the same call by specifying multiple contact references.
     * <p><b>200</b> - Successful response
     * <p><b>201</b> - Successful response
     * <p><b>301</b> - Successful response
     * <p><b>401</b> - Successful response
     * <p><b>403</b> - Successful response
     * <p><b>422</b> - Successful response
     * <p><b>500</b> - Successful response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES | DESCRIPTION                      | REQUIRED | |----------|------------|----------------------------------|----------| | group    | type       | group-data element,type of group | YES      | | group    | name       | name of group                    | YES      | | group    | tempid     | tempid of group                  | YES      | | group    | itemGuid   | Group item guid                  | NO       | | contact  | id         | contact-data element,contact-id  | NO       | | contact  | tempid     | tempid of contact                | NO       | | contact  | version    | contact version                  | NO       |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbGroupsPostWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbGroupsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/groups", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put Create Address Book Groups 26
     * This method is used for modifying the groups. Please note that multiple operations are supported. You can either delete groups, modify groups, add multiple groups to multiple contacts and delete groups from multiple contacts.
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>401</b> - modify address book groups 401 response
     * <p><b>403</b> - modify address book groups 403 response
     * <p><b>422</b> - modify address book groups 422 response
     * <p><b>500</b> - modify address book groups 500 response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body FOLLOWING OPERATIONS ARE SUPPORTED DELETE GROUP,MODIFY GROUP,ADD-CONTACT and DELETE-CONTACT TO GROUPS  INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS       | ATTRIBUTES | DESCRIPTION                      | REQUIRED | |----------------|------------|----------------------------------|----------| | delete-group   | type       | group-data element,type of group | YES      | | delete-group   | id         | id of the group                  | YES      | | delete-group   | name       | name of the group                | YES      | | delete-group   | version    | version of the group             | YES      | | modify-group   | type       | group-data element,type of group | YES      | | modify-group   | id         | id of the group                  | YES      | | modify-group   | name       | name of the group                | YES      | | modify-group   | version    | version of the group             | YES      | | add-contact    | type       | group-data element,type of group | OPTIONAL | | add-contact    | id         | id of the group                  | OPTIONAL | | add-contact    | name       | name of the group                | NO       | | add-contact    | version    | version of the group             | OPTIONAL | | delete-contact | type       | group-data element,type of group | OPTIONAL | | delete-contact | id         | id of the group                  | OPTIONAL | | delete-contact | name       | name of the group                | NO       | | delete-contact | version    | version of the group             | OPTIONAL |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbGroupsPut(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdAbGroupsPutWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Put Create Address Book Groups 26
     * This method is used for modifying the groups. Please note that multiple operations are supported. You can either delete groups, modify groups, add multiple groups to multiple contacts and delete groups from multiple contacts.
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>401</b> - modify address book groups 401 response
     * <p><b>403</b> - modify address book groups 403 response
     * <p><b>422</b> - modify address book groups 422 response
     * <p><b>500</b> - modify address book groups 500 response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body FOLLOWING OPERATIONS ARE SUPPORTED DELETE GROUP,MODIFY GROUP,ADD-CONTACT and DELETE-CONTACT TO GROUPS  INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS       | ATTRIBUTES | DESCRIPTION                      | REQUIRED | |----------------|------------|----------------------------------|----------| | delete-group   | type       | group-data element,type of group | YES      | | delete-group   | id         | id of the group                  | YES      | | delete-group   | name       | name of the group                | YES      | | delete-group   | version    | version of the group             | YES      | | modify-group   | type       | group-data element,type of group | YES      | | modify-group   | id         | id of the group                  | YES      | | modify-group   | name       | name of the group                | YES      | | modify-group   | version    | version of the group             | YES      | | add-contact    | type       | group-data element,type of group | OPTIONAL | | add-contact    | id         | id of the group                  | OPTIONAL | | add-contact    | name       | name of the group                | NO       | | add-contact    | version    | version of the group             | OPTIONAL | | delete-contact | type       | group-data element,type of group | OPTIONAL | | delete-contact | id         | id of the group                  | OPTIONAL | | delete-contact | name       | name of the group                | NO       | | delete-contact | version    | version of the group             | OPTIONAL |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbGroupsPutWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbGroupsPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/groups", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * delete address book import session 63
     * This method is used for deleting all the contacts from import address book
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - Successful response
     * <p><b>401</b> - Successful response
     * <p><b>404</b> - Successful response
     * <p><b>422</b> - Successful response
     * <p><b>500</b> - Successful response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbImportSessionDelete(String userId, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAbImportSessionDeleteWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, content, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * delete address book import session 63
     * This method is used for deleting all the contacts from import address book
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - Successful response
     * <p><b>401</b> - Successful response
     * <p><b>404</b> - Successful response
     * <p><b>422</b> - Successful response
     * <p><b>500</b> - Successful response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbImportSessionDeleteWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbImportSessionDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (content != null)
        localVarHeaderParams.add("Content", apiClient.parameterToString(content));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/import/session", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get address book import session 61
     * This method is used for getting the contacts import status
     * <p><b>200</b> - get import session response
     * <p><b>301</b> - get import session response
     * <p><b>401</b> - get import session response
     * <p><b>404</b> - get import session response
     * <p><b>422</b> - get import session response
     * <p><b>500</b> - get import session response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbImportSessionGet(String userId, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAbImportSessionGetWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, content, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get address book import session 61
     * This method is used for getting the contacts import status
     * <p><b>200</b> - get import session response
     * <p><b>301</b> - get import session response
     * <p><b>401</b> - get import session response
     * <p><b>404</b> - get import session response
     * <p><b>422</b> - get import session response
     * <p><b>500</b> - get import session response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbImportSessionGetWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbImportSessionGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (content != null)
        localVarHeaderParams.add("Content", apiClient.parameterToString(content));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/import/session", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put Create Address book import session 62 pending
     * This method is used for starting and ending import sessions during contacts import. In start import session it checks the existence of contacts in import address book and in end import session it starts the dupe detection process. An echo is sent in the request parameter or as a cookie for insession notification and alerts. This information is sent in the DupeCompletionEvent once the dedupe process is completed.
     * <p><b>200</b> - import session modify response
     * <p><b>301</b> - import session modify response
     * <p><b>401</b> - import session modify response
     * <p><b>403</b> - import session modify response
     * <p><b>404</b> - import session modify response
     * <p><b>422</b> - import session modify response
     * <p><b>500</b> - import session modify response
     * @param userId  (required)
     * @param echo Contains the echo data recieved from the request (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES specific to the operations performed | ELEMENTS | ATTRIBUTES | DESCRIPTION                                                                                  | REQUIRED                           | |----------|------------|----------------------------------------------------------------------------------------------|------------------------------------| | session  |            | defines start/end import session                                                             | YES                                | | state    |            | contains values inservice or completed to identify whether it is start or end import session | YES. either of inservice/completed |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbImportSessionPut(String userId, String echo, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdAbImportSessionPutWithHttpInfo(userId, echo, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Put Create Address book import session 62 pending
     * This method is used for starting and ending import sessions during contacts import. In start import session it checks the existence of contacts in import address book and in end import session it starts the dupe detection process. An echo is sent in the request parameter or as a cookie for insession notification and alerts. This information is sent in the DupeCompletionEvent once the dedupe process is completed.
     * <p><b>200</b> - import session modify response
     * <p><b>301</b> - import session modify response
     * <p><b>401</b> - import session modify response
     * <p><b>403</b> - import session modify response
     * <p><b>404</b> - import session modify response
     * <p><b>422</b> - import session modify response
     * <p><b>500</b> - import session modify response
     * @param userId  (required)
     * @param echo Contains the echo data recieved from the request (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES specific to the operations performed | ELEMENTS | ATTRIBUTES | DESCRIPTION                                                                                  | REQUIRED                           | |----------|------------|----------------------------------------------------------------------------------------------|------------------------------------| | session  |            | defines start/end import session                                                             | YES                                | | state    |            | contains values inservice or completed to identify whether it is start or end import session | YES. either of inservice/completed |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbImportSessionPutWithHttpInfo(String userId, String echo, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbImportSessionPut");
        }
        
        // verify the required parameter 'echo' is set
        if (echo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'echo' when calling wsgPublicNabV1UserIdAbImportSessionPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "echo", echo));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/import/session", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get address book contacts conatct id picture picture id 91
     * This method is used for retrieving the picture for a contact in recycle bin. It should be noted that the picture id can be obtained from the contact itself which has the picture id as a photo reference field.  Users should specify the picture id in the URL. The browser will be able to cache the image based in this URL. Whenever the picture changes the picture id will also change. This should cause the browser to load the picture again. 
     * <p><b>200</b> - Get address book recycle contacts by contact id picture id response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param size Retrieves the picture with specified size (required)
     * @param imagetype Retrieves the picture with specified type Default is na. (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbRecycleContactsContactIdPicturePictureIdGet(String userId, String size, String imagetype, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAbRecycleContactsContactIdPicturePictureIdGetWithHttpInfo(userId, size, imagetype, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get address book contacts conatct id picture picture id 91
     * This method is used for retrieving the picture for a contact in recycle bin. It should be noted that the picture id can be obtained from the contact itself which has the picture id as a photo reference field.  Users should specify the picture id in the URL. The browser will be able to cache the image based in this URL. Whenever the picture changes the picture id will also change. This should cause the browser to load the picture again. 
     * <p><b>200</b> - Get address book recycle contacts by contact id picture id response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param size Retrieves the picture with specified size (required)
     * @param imagetype Retrieves the picture with specified type Default is na. (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbRecycleContactsContactIdPicturePictureIdGetWithHttpInfo(String userId, String size, String imagetype, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbRecycleContactsContactIdPicturePictureIdGet");
        }
        
        // verify the required parameter 'size' is set
        if (size == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'size' when calling wsgPublicNabV1UserIdAbRecycleContactsContactIdPicturePictureIdGet");
        }
        
        // verify the required parameter 'imagetype' is set
        if (imagetype == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imagetype' when calling wsgPublicNabV1UserIdAbRecycleContactsContactIdPicturePictureIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("size", size);
        uriVariables.put("imagetype", imagetype);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "image/png"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/recycle/contacts/{contactId}/picture/{pictureId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get address book recycle contacts 92
     * This method is used for retrieving all the recycle bin contacts  NOTE : 1. Strings are compared case-insensitive. 2. For parameter field-tag.type any field name excluding the index can be specified. 3. Both the prefix and suffix wildcards are allowed as well, indicating substring match - e.g. *123*. 4. Date&amp;Time values are compared in full. That is, no substring matching for them. 5. A Boolean existential expression is supplied by omitting the value part - e.g. &amp;tel.mobile&amp; evaluates to true of mobile phone number exists. 6. A Boolean non-existential expression is supplied by appending a tilde (~) to the existential expression. E.g. &amp;~tel.mobile&amp; evaluates to true if a mobile phone number does not exist. 7. Only one of ascending or descending sort can be requested. 8. Range Filtering is requested through the query parameters \&quot;rangebegin\&quot; and \&quot;maxitems\&quot; 
     * <p><b>200</b> - get deleted contacts response
     * <p><b>301</b> - User is in Different PU
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param fields Obtains the contact with all fields (optional)
     * @param name Filter the contacts by a name field (optional)
     * @param email Filter the contacts by a email field (optional)
     * @param im Filter the contacts by a Im field (optional)
     * @param address Filter the contacts by a Address field (optional)
     * @param url Filter the contacts by a Url field (optional)
     * @param tel Filter the contacts by a Tel field (optional)
     * @param addressHome Filter the contacts by specified field type (optional)
     * @param addressHomeStreet Filter the contacts by subfield of the address fields (optional)
     * @param sortAsc Sort the contacts according to the field and ascending order specified (optional)
     * @param sortDesc Sort the contacts according to the field and descending order specified (optional)
     * @param rangebegin Specifies index of the starting contact item after sorting (optional)
     * @param maxnum Specifies maximum number of contact items to fetch after sorting (optional)
     * @param contactids Specifies a list of comma seperated contact ids (optional)
     * @param ff Specifies whether fields should be excluded or included. Values can be exclude or include. Default is include. (optional)
     * @param size Retrieves the contact&#39;s image with specified size (optional)
     * @param imagetype Retrieves the contact&#39;s image with specified type (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbRecycleContactsGet(String userId, String fields, String name, String email, String im, String address, String url, String tel, String addressHome, String addressHomeStreet, String sortAsc, String sortDesc, String rangebegin, String maxnum, String contactids, String ff, String size, String imagetype, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAbRecycleContactsGetWithHttpInfo(userId, fields, name, email, im, address, url, tel, addressHome, addressHomeStreet, sortAsc, sortDesc, rangebegin, maxnum, contactids, ff, size, imagetype, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get address book recycle contacts 92
     * This method is used for retrieving all the recycle bin contacts  NOTE : 1. Strings are compared case-insensitive. 2. For parameter field-tag.type any field name excluding the index can be specified. 3. Both the prefix and suffix wildcards are allowed as well, indicating substring match - e.g. *123*. 4. Date&amp;Time values are compared in full. That is, no substring matching for them. 5. A Boolean existential expression is supplied by omitting the value part - e.g. &amp;tel.mobile&amp; evaluates to true of mobile phone number exists. 6. A Boolean non-existential expression is supplied by appending a tilde (~) to the existential expression. E.g. &amp;~tel.mobile&amp; evaluates to true if a mobile phone number does not exist. 7. Only one of ascending or descending sort can be requested. 8. Range Filtering is requested through the query parameters \&quot;rangebegin\&quot; and \&quot;maxitems\&quot; 
     * <p><b>200</b> - get deleted contacts response
     * <p><b>301</b> - User is in Different PU
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param fields Obtains the contact with all fields (optional)
     * @param name Filter the contacts by a name field (optional)
     * @param email Filter the contacts by a email field (optional)
     * @param im Filter the contacts by a Im field (optional)
     * @param address Filter the contacts by a Address field (optional)
     * @param url Filter the contacts by a Url field (optional)
     * @param tel Filter the contacts by a Tel field (optional)
     * @param addressHome Filter the contacts by specified field type (optional)
     * @param addressHomeStreet Filter the contacts by subfield of the address fields (optional)
     * @param sortAsc Sort the contacts according to the field and ascending order specified (optional)
     * @param sortDesc Sort the contacts according to the field and descending order specified (optional)
     * @param rangebegin Specifies index of the starting contact item after sorting (optional)
     * @param maxnum Specifies maximum number of contact items to fetch after sorting (optional)
     * @param contactids Specifies a list of comma seperated contact ids (optional)
     * @param ff Specifies whether fields should be excluded or included. Values can be exclude or include. Default is include. (optional)
     * @param size Retrieves the contact&#39;s image with specified size (optional)
     * @param imagetype Retrieves the contact&#39;s image with specified type (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbRecycleContactsGetWithHttpInfo(String userId, String fields, String name, String email, String im, String address, String url, String tel, String addressHome, String addressHomeStreet, String sortAsc, String sortDesc, String rangebegin, String maxnum, String contactids, String ff, String size, String imagetype, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbRecycleContactsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fields", fields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "email", email));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "im", im));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "address", address));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "url", url));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "tel", tel));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "address.home", addressHome));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "address.home.street", addressHomeStreet));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort-asc", sortAsc));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort-desc", sortDesc));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "rangebegin", rangebegin));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxnum", maxnum));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "contactids", contactids));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "ff", ff));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "imagetype", imagetype));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/recycle/contacts", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put Update Prefs 93
     * This method is used for undeleting the contacts from recycle bin and deleting the contacts permanently.
     * <p><b>200</b> - deleted contacts response
     * <p><b>301</b> - deleted contacts response
     * <p><b>401</b> - deleted contacts response
     * <p><b>403</b> - deleted contacts response
     * <p><b>422</b> - deleted contacts response
     * <p><b>500</b> - deleted contacts response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES | DESCRIPTION     | REQUIRED | |----------|------------|-----------------|----------| | contact  | id         | contact-id      | OPTIONAl | | contact  | tempid     | contact tempid  | OPTIONAL | | contact  | version    | contact version | OPTIONAL |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbRecycleContactsPut(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdAbRecycleContactsPutWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, authorization, body).getBody();
    }

    /**
     * Put Update Prefs 93
     * This method is used for undeleting the contacts from recycle bin and deleting the contacts permanently.
     * <p><b>200</b> - deleted contacts response
     * <p><b>301</b> - deleted contacts response
     * <p><b>401</b> - deleted contacts response
     * <p><b>403</b> - deleted contacts response
     * <p><b>422</b> - deleted contacts response
     * <p><b>500</b> - deleted contacts response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES | DESCRIPTION     | REQUIRED | |----------|------------|-----------------|----------| | contact  | id         | contact-id      | OPTIONAl | | contact  | tempid     | contact tempid  | OPTIONAL | | contact  | version    | contact version | OPTIONAL |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbRecycleContactsPutWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbRecycleContactsPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/recycle/contacts", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post address book rollback pending 69 not executed
     * This method is used to post the rollback request to the server for specified number of days. User can rollback his addressbook changes to configured number of days. The number of days allowed for rollback is : [-1,0,1,2,8,15,30]. -1 specifies to undo the rollback done previously in case no contact changes were synced after rollback operation.
     * <p><b>200</b> - Post create Address Book response
     * <p><b>201</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>403</b> - Post create Address Book response
     * <p><b>422</b> - Post create Address Book response
     * <p><b>500</b> - Post create Address Book response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbRollbackPost(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdAbRollbackPostWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Post address book rollback pending 69 not executed
     * This method is used to post the rollback request to the server for specified number of days. User can rollback his addressbook changes to configured number of days. The number of days allowed for rollback is : [-1,0,1,2,8,15,30]. -1 specifies to undo the rollback done previously in case no contact changes were synced after rollback operation.
     * <p><b>200</b> - Post create Address Book response
     * <p><b>201</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>403</b> - Post create Address Book response
     * <p><b>422</b> - Post create Address Book response
     * <p><b>500</b> - Post create Address Book response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbRollbackPostWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbRollbackPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/rollback", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get address book rollback by rollback id pending 70 not excecuted
     * This method is used to get the snapshot of particular days. Snapshot response has the addessbook changes made during the specified number of days.It shows the contact - adds, updates and deletes. snapshotid is the report id returned in snapshotreport-add-response.
     * <p><b>200</b> - Get snapshot response by snapshot id success response
     * <p><b>201</b> - Get snapshot response by snapshot id success response
     * <p><b>401</b> - Get snapshot response by snapshot id success response
     * <p><b>403</b> - Get snapshot response by snapshot id success response
     * <p><b>422</b> - Get snapshot response by snapshot id success response
     * <p><b>500</b> - Get snapshot response by snapshot id success response
     * @param userId  (required)
     * @param rollbackId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbRollbackRollbackIdGet(String userId, String rollbackId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAbRollbackRollbackIdGetWithHttpInfo(userId, rollbackId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get address book rollback by rollback id pending 70 not excecuted
     * This method is used to get the snapshot of particular days. Snapshot response has the addessbook changes made during the specified number of days.It shows the contact - adds, updates and deletes. snapshotid is the report id returned in snapshotreport-add-response.
     * <p><b>200</b> - Get snapshot response by snapshot id success response
     * <p><b>201</b> - Get snapshot response by snapshot id success response
     * <p><b>401</b> - Get snapshot response by snapshot id success response
     * <p><b>403</b> - Get snapshot response by snapshot id success response
     * <p><b>422</b> - Get snapshot response by snapshot id success response
     * <p><b>500</b> - Get snapshot response by snapshot id success response
     * @param userId  (required)
     * @param rollbackId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbRollbackRollbackIdGetWithHttpInfo(String userId, String rollbackId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbRollbackRollbackIdGet");
        }
        
        // verify the required parameter 'rollbackId' is set
        if (rollbackId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'rollbackId' when calling wsgPublicNabV1UserIdAbRollbackRollbackIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("rollbackId", rollbackId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/rollback/{rollbackId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get share link contacts 81 not executed pending
     * This method is used for retrieving shareLink contacts.
     * <p><b>200</b> - Post create Address Book response
     * <p><b>400</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>422</b> - Post create Address Book response
     * <p><b>503</b> - Post create Address Book response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbSharelinksGet(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAbSharelinksGetWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get share link contacts 81 not executed pending
     * This method is used for retrieving shareLink contacts.
     * <p><b>200</b> - Post create Address Book response
     * <p><b>400</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>422</b> - Post create Address Book response
     * <p><b>503</b> - Post create Address Book response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbSharelinksGetWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbSharelinksGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/sharelinks", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post create share link contacts 82 not executed pending
     * This method is used for adding items to shareLinks 
     * <p><b>200</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>409</b> - Post create Address Book response
     * <p><b>422</b> - Post create Address Book response
     * <p><b>503</b> - Post create Address Book response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES     | DESCRIPTION                  | REQUIRED | |----------|----------------|------------------------------|----------| | share    | expirationDate | Expiration Date of the Share | NO       | | share    | shareid        | id of the share              | yes      | | share    | visibility     | private/public               | yes      | | item     | itemid         | item guid of the contact     | yes      | | item     | resourceid     | id of the resource           | yes      | | item     | type           | type of the item             | yes      | | member   | contactid      | id of the contact            | yes      | | member   | memberid       | id of the member             | yes      |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbSharelinksPost(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdAbSharelinksPostWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Post create share link contacts 82 not executed pending
     * This method is used for adding items to shareLinks 
     * <p><b>200</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>409</b> - Post create Address Book response
     * <p><b>422</b> - Post create Address Book response
     * <p><b>503</b> - Post create Address Book response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES     | DESCRIPTION                  | REQUIRED | |----------|----------------|------------------------------|----------| | share    | expirationDate | Expiration Date of the Share | NO       | | share    | shareid        | id of the share              | yes      | | share    | visibility     | private/public               | yes      | | item     | itemid         | item guid of the contact     | yes      | | item     | resourceid     | id of the resource           | yes      | | item     | type           | type of the item             | yes      | | member   | contactid      | id of the contact            | yes      | | member   | memberid       | id of the member             | yes      |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbSharelinksPostWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbSharelinksPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/sharelinks", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put modify/delete share links 83 not executed pending
     * This method is used for modifying the shareLink.
     * <p><b>200</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>409</b> - Post create Address Book response
     * <p><b>422</b> - Post create Address Book response
     * <p><b>503</b> - Post create Address Book response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES     | DESCRIPTION                  | REQUIRED | |----------|----------------|------------------------------|----------| | delete   | expirationDate | expiration Date of the share | NO       | | delete   | shareid        | id of the share              | YES      | | delete   | visibility     | private/public               | YES      | | modify   | expirationDate | expiration Date of the share | NO       | | modify   | shareid        | id of the share              | YES      | | modify   | visibility     | private/public               | YES      |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbSharelinksPut(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdAbSharelinksPutWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Put modify/delete share links 83 not executed pending
     * This method is used for modifying the shareLink.
     * <p><b>200</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>409</b> - Post create Address Book response
     * <p><b>422</b> - Post create Address Book response
     * <p><b>503</b> - Post create Address Book response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES     | DESCRIPTION                  | REQUIRED | |----------|----------------|------------------------------|----------| | delete   | expirationDate | expiration Date of the share | NO       | | delete   | shareid        | id of the share              | YES      | | delete   | visibility     | private/public               | YES      | | modify   | expirationDate | expiration Date of the share | NO       | | modify   | shareid        | id of the share              | YES      | | modify   | visibility     | private/public               | YES      |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbSharelinksPutWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbSharelinksPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/sharelinks", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * post address book snapshot pending 71 not excecuted
     * This method is used for for posting the snapshot report request to Server. The number of days to obatin addressbook snapshot is specified in the request.
     * <p><b>200</b> - Post create Address Book response
     * <p><b>201</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>403</b> - Post create Address Book response
     * <p><b>422</b> - Post create Address Book response
     * <p><b>500</b> - Post create Address Book response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbSnapshotPost(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdAbSnapshotPostWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * post address book snapshot pending 71 not excecuted
     * This method is used for for posting the snapshot report request to Server. The number of days to obatin addressbook snapshot is specified in the request.
     * <p><b>200</b> - Post create Address Book response
     * <p><b>201</b> - Post create Address Book response
     * <p><b>401</b> - Post create Address Book response
     * <p><b>403</b> - Post create Address Book response
     * <p><b>422</b> - Post create Address Book response
     * <p><b>500</b> - Post create Address Book response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbSnapshotPostWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbSnapshotPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/snapshot", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get address book snapshot snapshotId pending 72 not executed
     * This method is used to get the snapshot of particular days. Snapshot response has the addessbook changes made during the specified number of days.It shows the contact - adds, updates and deletes. snapshotid is the report id returned in snapshotreport-add-response.
     * <p><b>201</b> - Get snapshot response by snapshot id success response
     * <p><b>401</b> - Authentication Failed response
     * <p><b>403</b> - Authorization Failed response
     * <p><b>422</b> - Xml is not valid response
     * <p><b>500</b> - Unknown error response
     * @param userId  (required)
     * @param snapshotId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAbSnapshotSnapshotIdGet(String userId, String snapshotId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAbSnapshotSnapshotIdGetWithHttpInfo(userId, snapshotId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get address book snapshot snapshotId pending 72 not executed
     * This method is used to get the snapshot of particular days. Snapshot response has the addessbook changes made during the specified number of days.It shows the contact - adds, updates and deletes. snapshotid is the report id returned in snapshotreport-add-response.
     * <p><b>201</b> - Get snapshot response by snapshot id success response
     * <p><b>401</b> - Authentication Failed response
     * <p><b>403</b> - Authorization Failed response
     * <p><b>422</b> - Xml is not valid response
     * <p><b>500</b> - Unknown error response
     * @param userId  (required)
     * @param snapshotId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAbSnapshotSnapshotIdGetWithHttpInfo(String userId, String snapshotId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAbSnapshotSnapshotIdGet");
        }
        
        // verify the required parameter 'snapshotId' is set
        if (snapshotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'snapshotId' when calling wsgPublicNabV1UserIdAbSnapshotSnapshotIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("snapshotId", snapshotId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/ab/snapshot/{snapshotId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Account Summary 5
     * 
     * <p><b>200</b> - Successful response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param manageStorage  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAccountGet(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Boolean manageStorage) throws RestClientException {
        return wsgPublicNabV1UserIdAccountGetWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, manageStorage).getBody();
    }

    /**
     * Get Account Summary 5
     * 
     * <p><b>200</b> - Successful response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param manageStorage  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAccountGetWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Boolean manageStorage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAccountGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "manageStorage", manageStorage));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/account", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Account properties 11
     * 
     * <p><b>200</b> - Get Account properties 200 response
     * <p><b>400</b> - Get Account properties 422 response
     * <p><b>401</b> - Get Account properties 422 response
     * <p><b>403</b> - Get Account properties 422 response
     * <p><b>405</b> - Get Account properties 422 response
     * <p><b>422</b> - Get Account properties 422 response
     * <p><b>500</b> - Get Account properties 422 response
     * @param userId  (required)
     * @param type types specifies what account properties to be returned (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAccountPropertiesGet(String userId, String type, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAccountPropertiesGetWithHttpInfo(userId, type, xF1ClientAuthorization, authorizationDomain, content, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get Account properties 11
     * 
     * <p><b>200</b> - Get Account properties 200 response
     * <p><b>400</b> - Get Account properties 422 response
     * <p><b>401</b> - Get Account properties 422 response
     * <p><b>403</b> - Get Account properties 422 response
     * <p><b>405</b> - Get Account properties 422 response
     * <p><b>422</b> - Get Account properties 422 response
     * <p><b>500</b> - Get Account properties 422 response
     * @param userId  (required)
     * @param type types specifies what account properties to be returned (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAccountPropertiesGetWithHttpInfo(String userId, String type, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAccountPropertiesGet");
        }
        
        // verify the required parameter 'type' is set
        if (type == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'type' when calling wsgPublicNabV1UserIdAccountPropertiesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (content != null)
        localVarHeaderParams.add("Content", apiClient.parameterToString(content));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/account/properties", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Account Tokens 12 pending
     * This method is used to retrieve the account tokens for the specified userid.
     * <p><b>200</b> - Get Account tokens 200 response
     * <p><b>401</b> - Get Account tokens 401 response
     * <p><b>301</b> - User is in Different PU
     * <p><b>403</b> - Authorization Failed
     * <p><b>422</b> - Get Account tokens 422 response
     * <p><b>500</b> - Get Account tokens 500 response
     * @param userId  (required)
     * @param timestamp The timestamp is the timestamp generated by the client in GMT and should approximately match the server time in GMT A variation of 10 minutes is okay (required)
     * @param signature Client will send signature which will match against server generated signature if matches then get tokens resoponse will be returned else error . (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAccountTokensGet(String userId, String timestamp, String signature, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAccountTokensGetWithHttpInfo(userId, timestamp, signature, xF1ClientAuthorization, authorizationDomain, content, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get Account Tokens 12 pending
     * This method is used to retrieve the account tokens for the specified userid.
     * <p><b>200</b> - Get Account tokens 200 response
     * <p><b>401</b> - Get Account tokens 401 response
     * <p><b>301</b> - User is in Different PU
     * <p><b>403</b> - Authorization Failed
     * <p><b>422</b> - Get Account tokens 422 response
     * <p><b>500</b> - Get Account tokens 500 response
     * @param userId  (required)
     * @param timestamp The timestamp is the timestamp generated by the client in GMT and should approximately match the server time in GMT A variation of 10 minutes is okay (required)
     * @param signature Client will send signature which will match against server generated signature if matches then get tokens resoponse will be returned else error . (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAccountTokensGetWithHttpInfo(String userId, String timestamp, String signature, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAccountTokensGet");
        }
        
        // verify the required parameter 'timestamp' is set
        if (timestamp == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'timestamp' when calling wsgPublicNabV1UserIdAccountTokensGet");
        }
        
        // verify the required parameter 'signature' is set
        if (signature == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'signature' when calling wsgPublicNabV1UserIdAccountTokensGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "timestamp", timestamp));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "signature", signature));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (content != null)
        localVarHeaderParams.add("Content", apiClient.parameterToString(content));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "tokenAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/account/tokens", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Account Tokens notification 13 pending
     * This method is used for sending secret key and access code for the user as an app directed SMS.
     * <p><b>200</b> - Get Account Tokens notification 200 response
     * <p><b>301</b> - User is in Different PU
     * <p><b>403</b> - Get Account tokens notification 403 response
     * <p><b>422</b> - Get Account tokens notification 422 response
     * <p><b>500</b> - Get Account tokens notification 500 response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS      | ATTRIBUTES | DESCRIPTION     | REQUIRED | |---------------|------------|-----------------|----------| | platform      |            | client platform | YES      | | clientversion |            | client version  | YES      | | deviceaddress |            | mdn             | YES      | (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAccountTokensNotificationPost(String userId, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdAccountTokensNotificationPostWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, content, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Get Account Tokens notification 13 pending
     * This method is used for sending secret key and access code for the user as an app directed SMS.
     * <p><b>200</b> - Get Account Tokens notification 200 response
     * <p><b>301</b> - User is in Different PU
     * <p><b>403</b> - Get Account tokens notification 403 response
     * <p><b>422</b> - Get Account tokens notification 422 response
     * <p><b>500</b> - Get Account tokens notification 500 response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS      | ATTRIBUTES | DESCRIPTION     | REQUIRED | |---------------|------------|-----------------|----------| | platform      |            | client platform | YES      | | clientversion |            | client version  | YES      | | deviceaddress |            | mdn             | YES      | (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAccountTokensNotificationPostWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAccountTokensNotificationPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (content != null)
        localVarHeaderParams.add("Content", apiClient.parameterToString(content));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "tokenAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/account/tokens/notification", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user events 37 pending
     * This call allows client to retrieve a list of alerts in the system for both shares and buddies in a single request. Alerts can be retrieved from a specific date, to a specific date in the system. The dates can be passed in as parameters to the alerts retrieval call. The “from” and “to” date is specified in the “yyyyMMddHHmmss” format.   Alerts are generated per user and can happen in the system due to the actions user takes or as a result of trying to sync data with other endpoints.   Typically, alerts would be shown at login to the user. The state of some alerts might change due to user action. For e.g. if the user is invited to a share an alert will be generated. If the user accepts the invitation the alert will go away. Similarly if any of the endpoint has exceeded device capacity then an alert will be generated
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param from NOTE :   1. Date parameter to be given in the format:yyyyMMddHHmmss (required)
     * @param to NOTE :   1. Date parameter to be given in the format:yyyyMMddHHmmss (required)
     * @param type  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdAlertsGet(String userId, String from, String to, String type, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdAlertsGetWithHttpInfo(userId, from, to, type, xF1ClientAuthorization, authorizationDomain, content, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get user events 37 pending
     * This call allows client to retrieve a list of alerts in the system for both shares and buddies in a single request. Alerts can be retrieved from a specific date, to a specific date in the system. The dates can be passed in as parameters to the alerts retrieval call. The “from” and “to” date is specified in the “yyyyMMddHHmmss” format.   Alerts are generated per user and can happen in the system due to the actions user takes or as a result of trying to sync data with other endpoints.   Typically, alerts would be shown at login to the user. The state of some alerts might change due to user action. For e.g. if the user is invited to a share an alert will be generated. If the user accepts the invitation the alert will go away. Similarly if any of the endpoint has exceeded device capacity then an alert will be generated
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param from NOTE :   1. Date parameter to be given in the format:yyyyMMddHHmmss (required)
     * @param to NOTE :   1. Date parameter to be given in the format:yyyyMMddHHmmss (required)
     * @param type  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdAlertsGetWithHttpInfo(String userId, String from, String to, String type, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdAlertsGet");
        }
        
        // verify the required parameter 'from' is set
        if (from == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'from' when calling wsgPublicNabV1UserIdAlertsGet");
        }
        
        // verify the required parameter 'to' is set
        if (to == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'to' when calling wsgPublicNabV1UserIdAlertsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "from", from));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "to", to));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (content != null)
        localVarHeaderParams.add("Content", apiClient.parameterToString(content));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/alerts", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Buddies buddyId Error code implementation pending 24
     * This method is used for retrieving information about a buddy.
     * <p><b>200</b> - Get buddy by buddy id response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param buddyId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdBuddiesBuddyIdGet(String userId, String buddyId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdBuddiesBuddyIdGetWithHttpInfo(userId, buddyId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get Buddies buddyId Error code implementation pending 24
     * This method is used for retrieving information about a buddy.
     * <p><b>200</b> - Get buddy by buddy id response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param buddyId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdBuddiesBuddyIdGetWithHttpInfo(String userId, String buddyId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdBuddiesBuddyIdGet");
        }
        
        // verify the required parameter 'buddyId' is set
        if (buddyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'buddyId' when calling wsgPublicNabV1UserIdBuddiesBuddyIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("buddyId", buddyId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/buddies/{buddyId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Buddies pending not excecuted 21
     * 
     * <p><b>200</b> - buddy invitation 200 response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param status Obtains the buddies filtered by status   NOTE : 1. Status parameter to be given within these states : invited,incoming-invitation buddy,rejected. (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdBuddiesGet(String userId, String status, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdBuddiesGetWithHttpInfo(userId, status, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get Buddies pending not excecuted 21
     * 
     * <p><b>200</b> - buddy invitation 200 response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param status Obtains the buddies filtered by status   NOTE : 1. Status parameter to be given within these states : invited,incoming-invitation buddy,rejected. (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdBuddiesGetWithHttpInfo(String userId, String status, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdBuddiesGet");
        }
        
        // verify the required parameter 'status' is set
        if (status == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'status' when calling wsgPublicNabV1UserIdBuddiesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/buddies", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post Buddies pending not executed 23
     * This method is used for inviting a buddy. User has a choice of changing the visibility of his profile. If the user has turned off the visibility of his profile then trying to invite the user will return an error. This check may be restricted to certain plans depending on the business requirements.   The input should have the following ELEMENTS or ATTRIBUTES: | ELEMENTS | ATTRIBUTES  | DESCRIPTION                                                 | REQUIRED | |----------|-------------|-------------------------------------------------------------|----------| | buddie   | buddyuserid | addresstype and userId of buddy to be addded seperated by \&quot; | \&quot;        | | buddie   | contactid   | contactId of the Buddy                                      | NO       | | buddie   | userid      | addresstype and userId of user seperated by \&quot;               | \&quot;        | | buddie   | status      | status of the Buddy                                         | NO       | | created  |             | created date of the Buddy                                   | NO       | | modified |             | modified date of the Buddy                                  | NO       | 
     * <p><b>200</b> - inviting a buddy 200 response
     * <p><b>301</b> - inviting a buddy 301 response
     * <p><b>401</b> - inviting a buddy 401 response
     * <p><b>403</b> - inviting a buddy 403 response
     * <p><b>422</b> - inviting a buddy 422 response
     * <p><b>500</b> - inviting a buddy 500 response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param manageStorage  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdBuddiesPost(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Boolean manageStorage, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdBuddiesPostWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, manageStorage, body).getBody();
    }

    /**
     * Post Buddies pending not executed 23
     * This method is used for inviting a buddy. User has a choice of changing the visibility of his profile. If the user has turned off the visibility of his profile then trying to invite the user will return an error. This check may be restricted to certain plans depending on the business requirements.   The input should have the following ELEMENTS or ATTRIBUTES: | ELEMENTS | ATTRIBUTES  | DESCRIPTION                                                 | REQUIRED | |----------|-------------|-------------------------------------------------------------|----------| | buddie   | buddyuserid | addresstype and userId of buddy to be addded seperated by \&quot; | \&quot;        | | buddie   | contactid   | contactId of the Buddy                                      | NO       | | buddie   | userid      | addresstype and userId of user seperated by \&quot;               | \&quot;        | | buddie   | status      | status of the Buddy                                         | NO       | | created  |             | created date of the Buddy                                   | NO       | | modified |             | modified date of the Buddy                                  | NO       | 
     * <p><b>200</b> - inviting a buddy 200 response
     * <p><b>301</b> - inviting a buddy 301 response
     * <p><b>401</b> - inviting a buddy 401 response
     * <p><b>403</b> - inviting a buddy 403 response
     * <p><b>422</b> - inviting a buddy 422 response
     * <p><b>500</b> - inviting a buddy 500 response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param manageStorage  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdBuddiesPostWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Boolean manageStorage, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdBuddiesPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "manageStorage", manageStorage));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/buddies", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put Buddies pending not executed 22
     * This method is used for modifying/deleting buddies. It allows you to accept or reject the buddy invitations that are sent to the user through the MODIFY operation. However, it should be noted that only the user that has received the invitation, can accept or reject the invitation. The DELETE operation can be used to break the buddy relationship once a buddy relationship is established.  The input should have the following ELEMENTS or ATTRIBUTES: | ELEMENTS | ATTRIBUTES  | DESCRIPTION                                                   | REQUIRED | |----------|-------------|---------------------------------------------------------------|----------| | DELETE   | buddyuserid | addresstype and userId of buddy to be deleted seperated by \&quot;  | \&quot;        | | DELETE   | contactid   | contactId of the Buddy                                        | NO       | | DELETE   | userid      | addresstype and userId of user seperated by \&quot;                 | \&quot;        | | DELETE   | status      | status of the Buddy                                           | NO       | | DELETE   | created     | created date of the Buddy                                     | NO       | | DELETE   | modified    | modified date of the Buddy                                    | NO       | | MODIFY   | buddyuserid | addresstype and userId of buddy to be modifled seperated by \&quot; | \&quot;        | | MODIFY   | contactid   | contactId of the Buddy                                        | NO       | | MODIFY   | userid      | addresstype and userId of user seperated by \&quot;                 | \&quot;        | | MODIFY   | status      | status of the Buddy                                           | NO       | | MODIFY   | created     | created date of the Buddy                                     | NO       | | MODIFY   | modified    | modified date of the Buddy                                    | NO       | 
     * <p><b>200</b> - buddy invitation 200 response
     * <p><b>301</b> - buddy invitation 301 response
     * <p><b>401</b> - buddy invitation 401 response
     * <p><b>404</b> - buddy invitation 404 response
     * <p><b>422</b> - buddy invitation 422 response
     * <p><b>500</b> - buddy invitation 500 response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdBuddiesPut(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdBuddiesPutWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Put Buddies pending not executed 22
     * This method is used for modifying/deleting buddies. It allows you to accept or reject the buddy invitations that are sent to the user through the MODIFY operation. However, it should be noted that only the user that has received the invitation, can accept or reject the invitation. The DELETE operation can be used to break the buddy relationship once a buddy relationship is established.  The input should have the following ELEMENTS or ATTRIBUTES: | ELEMENTS | ATTRIBUTES  | DESCRIPTION                                                   | REQUIRED | |----------|-------------|---------------------------------------------------------------|----------| | DELETE   | buddyuserid | addresstype and userId of buddy to be deleted seperated by \&quot;  | \&quot;        | | DELETE   | contactid   | contactId of the Buddy                                        | NO       | | DELETE   | userid      | addresstype and userId of user seperated by \&quot;                 | \&quot;        | | DELETE   | status      | status of the Buddy                                           | NO       | | DELETE   | created     | created date of the Buddy                                     | NO       | | DELETE   | modified    | modified date of the Buddy                                    | NO       | | MODIFY   | buddyuserid | addresstype and userId of buddy to be modifled seperated by \&quot; | \&quot;        | | MODIFY   | contactid   | contactId of the Buddy                                        | NO       | | MODIFY   | userid      | addresstype and userId of user seperated by \&quot;                 | \&quot;        | | MODIFY   | status      | status of the Buddy                                           | NO       | | MODIFY   | created     | created date of the Buddy                                     | NO       | | MODIFY   | modified    | modified date of the Buddy                                    | NO       | 
     * <p><b>200</b> - buddy invitation 200 response
     * <p><b>301</b> - buddy invitation 301 response
     * <p><b>401</b> - buddy invitation 401 response
     * <p><b>404</b> - buddy invitation 404 response
     * <p><b>422</b> - buddy invitation 422 response
     * <p><b>500</b> - buddy invitation 500 response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdBuddiesPutWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdBuddiesPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/buddies", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete endpoints endPointId pending not executed 10
     * This method is used for deleting an endpoint for the specified userId and endpoint id.
     * <p><b>200</b> - Delete endpoints endPointId success response
     * <p><b>301</b> - User is in Different PU response
     * <p><b>401</b> - Delete endpoints endPointId 401 error response
     * <p><b>403</b> - Delete endpoints endPointId 403 error response
     * <p><b>404</b> - Delete endpoints endPointId 404 error response
     * <p><b>422</b> - Delete endpoints endPointId 422 error response
     * <p><b>500</b> - Delete endpoints endPointId 500 error response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdEndpointsEndPointIdDelete(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdEndpointsEndPointIdDeleteWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Delete endpoints endPointId pending not executed 10
     * This method is used for deleting an endpoint for the specified userId and endpoint id.
     * <p><b>200</b> - Delete endpoints endPointId success response
     * <p><b>301</b> - User is in Different PU response
     * <p><b>401</b> - Delete endpoints endPointId 401 error response
     * <p><b>403</b> - Delete endpoints endPointId 403 error response
     * <p><b>404</b> - Delete endpoints endPointId 404 error response
     * <p><b>422</b> - Delete endpoints endPointId 422 error response
     * <p><b>500</b> - Delete endpoints endPointId 500 error response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdEndpointsEndPointIdDeleteWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdEndpointsEndPointIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/endpoints/{endPointId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get endpoints endPointId pending not executed 9
     * This method is used for retrieving a endpoint information includes pc client auto sync attributes, mobile client state attributes, upgrade info attributes based on userId and endpoint id.  PC Client Upgrade Detection Attributes. | UPGRADE INFO ATTRIBUTES | DESCRIPTION                                                                                                                                                                                                                           | READONLY | |-------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------| | upgrade.status          | The status of the upgrade. This can be either none, recommended or mandatory. If the status is none then it means that no upgrade is present for the endpoint. In this case the upgrade message and download URL will not be present. | Yes      | | upgrade.message         | The upgrade message.                                                                                                                                                                                                                  | Yes      | | upgrade.download.url    | The upgrade download URL.                                                                                                                                                                                                             | Yes      |  Mobile client state attributes | PHONE STATE                                                                            | GET ENDPOINTS RESPONSE                                                                                          | |----------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------| | User has a phone in the normal state i.e. it has been provisioned and is ready to sync | device.status&#x3D;ACTIVE device.customer.model&#x3D;empty or unavailable in the response device.client.support&#x3D;SUPPORTED | | User switches to new phone. Client is supported on the new phone.                      | No phone device will be returned.                                                                               | | User switches to new phone. Client is NOT supported on the new phone.                  | No phone device will be returned.                                                                               | 
     * <p><b>200</b> - Get endpoints by endpointsId success response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param upgrade Get the upgrade information for the device .Values for upgrade param are true , default value is false (optional)
     * @param attributes List endpoint attributes which are needs to be displayed for the endpoint. (optional)
     * @param supportedFields Flag to filter endpoint supported contact fields. Default value is true (optional)
     * @param autopromote Flag to filter endpoint autopromote settings info . Default value is true (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdEndpointsEndPointIdGet(String userId, String upgrade, String attributes, Boolean supportedFields, Boolean autopromote, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdEndpointsEndPointIdGetWithHttpInfo(userId, upgrade, attributes, supportedFields, autopromote, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get endpoints endPointId pending not executed 9
     * This method is used for retrieving a endpoint information includes pc client auto sync attributes, mobile client state attributes, upgrade info attributes based on userId and endpoint id.  PC Client Upgrade Detection Attributes. | UPGRADE INFO ATTRIBUTES | DESCRIPTION                                                                                                                                                                                                                           | READONLY | |-------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|----------| | upgrade.status          | The status of the upgrade. This can be either none, recommended or mandatory. If the status is none then it means that no upgrade is present for the endpoint. In this case the upgrade message and download URL will not be present. | Yes      | | upgrade.message         | The upgrade message.                                                                                                                                                                                                                  | Yes      | | upgrade.download.url    | The upgrade download URL.                                                                                                                                                                                                             | Yes      |  Mobile client state attributes | PHONE STATE                                                                            | GET ENDPOINTS RESPONSE                                                                                          | |----------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------| | User has a phone in the normal state i.e. it has been provisioned and is ready to sync | device.status&#x3D;ACTIVE device.customer.model&#x3D;empty or unavailable in the response device.client.support&#x3D;SUPPORTED | | User switches to new phone. Client is supported on the new phone.                      | No phone device will be returned.                                                                               | | User switches to new phone. Client is NOT supported on the new phone.                  | No phone device will be returned.                                                                               | 
     * <p><b>200</b> - Get endpoints by endpointsId success response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param upgrade Get the upgrade information for the device .Values for upgrade param are true , default value is false (optional)
     * @param attributes List endpoint attributes which are needs to be displayed for the endpoint. (optional)
     * @param supportedFields Flag to filter endpoint supported contact fields. Default value is true (optional)
     * @param autopromote Flag to filter endpoint autopromote settings info . Default value is true (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdEndpointsEndPointIdGetWithHttpInfo(String userId, String upgrade, String attributes, Boolean supportedFields, Boolean autopromote, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdEndpointsEndPointIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "upgrade", upgrade));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "attributes", attributes));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "supportedFields", supportedFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "autopromote", autopromote));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/endpoints/{endPointId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get endpoints 66
     * This method is used for retrieving endpoints information includes pc client auto sync attributes, mobile client state attributes for a user. 
     * <p><b>200</b> - The following attributes are displayed in GET endpoints call.  Mobile client state attributes | PHONE STATE                                                                            | GET ENDPOINTS RESPONSE                                                                                          | |----------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------| | User has a phone in the normal state i.e. it has been provisioned and is ready to sync | device.status&#x3D;ACTIVE device.customer.model&#x3D;empty or unavailable in the response device.client.support&#x3D;SUPPORTED | | User switches to new phone. Client is supported on the new phone.                      | No phone device will be returned.                                                                               | | User switches to new phone. Client is NOT supported on the new phone.                  | No phone device will be returned.                                                                               |  PC Client Auto-Sync Attributes | ATTRIBUTE                  | DESCRIPTION                                                                                                                    | READONLY | |----------------------------|--------------------------------------------------------------------------------------------------------------------------------|----------| | dc.auto-sync.interval      | The interval after which the PC client will try to sync                                                                        | Yes      | | dc.auto-sync.checkInterval | The interval at which the PC client will check for any updates to the dc.auto-sync. interval by invoking WSG GET ENDPOINT API. | Yes      |                     
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param view available or user .Default value is user (optional)
     * @param attributes List endpoint attributes which are needs to be displayed for the endpoint. (optional)
     * @param supportedFields Flag to filter endpoint supported contact fields. Default value is true (optional)
     * @param autopromote Flag to filter endpoint autopromote settings info . Default value is true (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdEndpointsGet(String userId, String view, String attributes, Boolean supportedFields, Boolean autopromote, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdEndpointsGetWithHttpInfo(userId, view, attributes, supportedFields, autopromote, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get endpoints 66
     * This method is used for retrieving endpoints information includes pc client auto sync attributes, mobile client state attributes for a user. 
     * <p><b>200</b> - The following attributes are displayed in GET endpoints call.  Mobile client state attributes | PHONE STATE                                                                            | GET ENDPOINTS RESPONSE                                                                                          | |----------------------------------------------------------------------------------------|-----------------------------------------------------------------------------------------------------------------| | User has a phone in the normal state i.e. it has been provisioned and is ready to sync | device.status&#x3D;ACTIVE device.customer.model&#x3D;empty or unavailable in the response device.client.support&#x3D;SUPPORTED | | User switches to new phone. Client is supported on the new phone.                      | No phone device will be returned.                                                                               | | User switches to new phone. Client is NOT supported on the new phone.                  | No phone device will be returned.                                                                               |  PC Client Auto-Sync Attributes | ATTRIBUTE                  | DESCRIPTION                                                                                                                    | READONLY | |----------------------------|--------------------------------------------------------------------------------------------------------------------------------|----------| | dc.auto-sync.interval      | The interval after which the PC client will try to sync                                                                        | Yes      | | dc.auto-sync.checkInterval | The interval at which the PC client will check for any updates to the dc.auto-sync. interval by invoking WSG GET ENDPOINT API. | Yes      |                     
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param view available or user .Default value is user (optional)
     * @param attributes List endpoint attributes which are needs to be displayed for the endpoint. (optional)
     * @param supportedFields Flag to filter endpoint supported contact fields. Default value is true (optional)
     * @param autopromote Flag to filter endpoint autopromote settings info . Default value is true (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdEndpointsGetWithHttpInfo(String userId, String view, String attributes, Boolean supportedFields, Boolean autopromote, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdEndpointsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "view", view));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "attributes", attributes));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "supportedFields", supportedFields));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "autopromote", autopromote));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/endpoints", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * post endpoints 67
     * This method is used for adding end points.  NOTE : 1. While adding google endpoint complete username should be specified with email address like username@gmail.com 
     * <p><b>200</b> - Get snapshot response by snapshot id success response
     * <p><b>301</b> - User is in Different PU response
     * <p><b>400</b> - Get snapshot response by snapshot id success response
     * <p><b>401</b> - Get snapshot response by snapshot id success response
     * <p><b>403</b> - Get snapshot response by snapshot id success response
     * <p><b>404</b> - Get snapshot response by snapshot id success response
     * <p><b>422</b> - Get snapshot response by snapshot id success response
     * <p><b>500</b> - Get snapshot response by snapshot id success response
     * @param userId  (required)
     * @param accountInfo Account info like f1username, endpoint username , endpoint password will be displyed in add endpoint response (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdEndpointsPost(String userId, Boolean accountInfo, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdEndpointsPostWithHttpInfo(userId, accountInfo, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * post endpoints 67
     * This method is used for adding end points.  NOTE : 1. While adding google endpoint complete username should be specified with email address like username@gmail.com 
     * <p><b>200</b> - Get snapshot response by snapshot id success response
     * <p><b>301</b> - User is in Different PU response
     * <p><b>400</b> - Get snapshot response by snapshot id success response
     * <p><b>401</b> - Get snapshot response by snapshot id success response
     * <p><b>403</b> - Get snapshot response by snapshot id success response
     * <p><b>404</b> - Get snapshot response by snapshot id success response
     * <p><b>422</b> - Get snapshot response by snapshot id success response
     * <p><b>500</b> - Get snapshot response by snapshot id success response
     * @param userId  (required)
     * @param accountInfo Account info like f1username, endpoint username , endpoint password will be displyed in add endpoint response (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdEndpointsPostWithHttpInfo(String userId, Boolean accountInfo, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdEndpointsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "accountInfo", accountInfo));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/endpoints", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * post endpoints 68
     * This method is used for modify and delete the endpoints for user:  | OPERATION | DESCRIPTION      | |-----------|------------------| | DELETE    | Delete endpoints | | MODIFY    | Modify endpoints |  The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS               | ATTRIBUTES           | DESCRIPTION                   | REQUIRED | |------------------------|----------------------|-------------------------------|----------| | Modify                 | endpoint             | endpoint for Modify           | OPTIONAL | | endpoint               | endpointtype         | End point type                | YES      | | endpoint               | endpointid           | End point id                  | YES      | | name                   |                      | Name of end point             | NO       | | username               |                      | User name of end point        | NO       | | password               |                      | Password of end point         | NO       | | attributes             | attribute            | supported attributes list     | OPTIONAL | | attribute              | value                | attribute vale                | OPTIONAL | | attribute              | name                 | attribute name                | OPTIONAL | | autopromote- endpoints | autopromote-endpoint | List of autopromote-endpoints | OPTIONAL | | autopromote- endpoint  | endpointid           | endpointid for auto-promote   | YES      | | autopromote- endpoint  | endpointtype         | endpointtype for auto-promote | YES      | | autopromote- endpoint  | autopromote          | Boolean value TRUE            | FALSE    | | Delete                 | endpoint             | endpoint for delete           | OPTIONAL | | endpoint               | endpointtype         | End point type                | YES      | | endpoint               | endpointid           | End point id                  | YES      | 
     * <p><b>200</b> - Get snapshot response by snapshot id success response
     * <p><b>301</b> - Get snapshot response by snapshot id success response
     * <p><b>401</b> - Get snapshot response by snapshot id success response
     * <p><b>403</b> - Get snapshot response by snapshot id success response
     * <p><b>404</b> - Get snapshot response by snapshot id success response
     * <p><b>422</b> - Get snapshot response by snapshot id success response
     * <p><b>500</b> - Get snapshot response by snapshot id success response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdEndpointsPut(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdEndpointsPutWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * post endpoints 68
     * This method is used for modify and delete the endpoints for user:  | OPERATION | DESCRIPTION      | |-----------|------------------| | DELETE    | Delete endpoints | | MODIFY    | Modify endpoints |  The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS               | ATTRIBUTES           | DESCRIPTION                   | REQUIRED | |------------------------|----------------------|-------------------------------|----------| | Modify                 | endpoint             | endpoint for Modify           | OPTIONAL | | endpoint               | endpointtype         | End point type                | YES      | | endpoint               | endpointid           | End point id                  | YES      | | name                   |                      | Name of end point             | NO       | | username               |                      | User name of end point        | NO       | | password               |                      | Password of end point         | NO       | | attributes             | attribute            | supported attributes list     | OPTIONAL | | attribute              | value                | attribute vale                | OPTIONAL | | attribute              | name                 | attribute name                | OPTIONAL | | autopromote- endpoints | autopromote-endpoint | List of autopromote-endpoints | OPTIONAL | | autopromote- endpoint  | endpointid           | endpointid for auto-promote   | YES      | | autopromote- endpoint  | endpointtype         | endpointtype for auto-promote | YES      | | autopromote- endpoint  | autopromote          | Boolean value TRUE            | FALSE    | | Delete                 | endpoint             | endpoint for delete           | OPTIONAL | | endpoint               | endpointtype         | End point type                | YES      | | endpoint               | endpointid           | End point id                  | YES      | 
     * <p><b>200</b> - Get snapshot response by snapshot id success response
     * <p><b>301</b> - Get snapshot response by snapshot id success response
     * <p><b>401</b> - Get snapshot response by snapshot id success response
     * <p><b>403</b> - Get snapshot response by snapshot id success response
     * <p><b>404</b> - Get snapshot response by snapshot id success response
     * <p><b>422</b> - Get snapshot response by snapshot id success response
     * <p><b>500</b> - Get snapshot response by snapshot id success response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdEndpointsPutWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdEndpointsPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/endpoints", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user events 38
     * This method is used for retrieving user event of particular type.
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param type  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdEventsGet(String userId, String type, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdEventsGetWithHttpInfo(userId, type, xF1ClientAuthorization, authorizationDomain, content, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get user events 38
     * This method is used for retrieving user event of particular type.
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param type  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdEventsGetWithHttpInfo(String userId, String type, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdEventsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (content != null)
        localVarHeaderParams.add("Content", apiClient.parameterToString(content));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/events", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post create user events 39
     * This method is used for adding multiple events for user. Event attributes are added as a part of input xml. for.e.g: \&quot;termandconditions\&quot; event type is added for the user when he accepts the new \&quot;TOC\&quot; 
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization This request may also contain client version, client platform and umi in the HTTP request headers. This is mainly used to validate the existence of the event for particular client version (optional)
     * @param xSNCRClientVersion client version header from the client (optional)
     * @param xSNCRClientPlatform client platform header from the client (optional)
     * @param xSNCRClientModelMapping client device UMI header from the client (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS       | ATTRIBUTES | DESCRIPTION                  | REQUIRED | |----------------|------------|------------------------------|----------| | add-user-event | event      | User event data root element | YES      | | event          | type       | Event type                   | YES      | | attribute      | name       | event attribute name         | NO       | | attribute      | value      | event attribute value        | NO       |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdEventsPost(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, String xSNCRClientVersion, String xSNCRClientPlatform, String xSNCRClientModelMapping, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdEventsPostWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, xSNCRClientVersion, xSNCRClientPlatform, xSNCRClientModelMapping, body).getBody();
    }

    /**
     * Post create user events 39
     * This method is used for adding multiple events for user. Event attributes are added as a part of input xml. for.e.g: \&quot;termandconditions\&quot; event type is added for the user when he accepts the new \&quot;TOC\&quot; 
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization This request may also contain client version, client platform and umi in the HTTP request headers. This is mainly used to validate the existence of the event for particular client version (optional)
     * @param xSNCRClientVersion client version header from the client (optional)
     * @param xSNCRClientPlatform client platform header from the client (optional)
     * @param xSNCRClientModelMapping client device UMI header from the client (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS       | ATTRIBUTES | DESCRIPTION                  | REQUIRED | |----------------|------------|------------------------------|----------| | add-user-event | event      | User event data root element | YES      | | event          | type       | Event type                   | YES      | | attribute      | name       | event attribute name         | NO       | | attribute      | value      | event attribute value        | NO       |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdEventsPostWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, String xSNCRClientVersion, String xSNCRClientPlatform, String xSNCRClientModelMapping, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdEventsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));
        if (xSNCRClientVersion != null)
        localVarHeaderParams.add("X-SNCR-Client-Version", apiClient.parameterToString(xSNCRClientVersion));
        if (xSNCRClientPlatform != null)
        localVarHeaderParams.add("X-SNCR-Client-Platform", apiClient.parameterToString(xSNCRClientPlatform));
        if (xSNCRClientModelMapping != null)
        localVarHeaderParams.add("X-SNCR-Client-Model-Mapping", apiClient.parameterToString(xSNCRClientModelMapping));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/events", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post pin notify/notification Preference 84 85 pending
     * This method is used for notifying the user his PIN via sms or email. This API is a generic API for sending notifications to the user and currently only supports sending PIN notifications. Notifications can be sent to the user via sms or email. A notification of sms or email type can be specified. It is the responsibility of the client to generate a unique id for the requested notification. This API makes use of the phone number and email address on the account provided while provisioning the account. This API also allows sending the account PIN encoded as access code via SMS. Sending the account PIN encoded as access code via e-mail is not supported. This API also allows to send text message as SMS .   Status about each of the notification is returned in the response and is identified by the specified notification id.
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>401</b> - post create notification response
     * <p><b>422</b> - post create notification response
     * <p><b>500</b> - post create notification response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param xF1ClientMethod  (optional)
     * @param contentType  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES specific to the operations performed | ELEMENTS     | ATTRIBUTES | DESCRIPTION                                               | REQUIRED | |--------------|------------|-----------------------------------------------------------|----------| | Notification | password   | Holds type, id &amp; optional format                          |          | | Notification | message    | Holds type,id,from,text &amp; format                          |          | | password     | type       | Notification type email or sms                            | YES      | | password     | id         | Notification id                                           | YES      | | password *   | format     | Format for password which is PIN, accesscode, text, or id | NO       | | message      | type       | Notification type email,sms, or register                  | YES      | | message      | id         | Notification id                                           | YES      | | message *    | format     | Format for password which is text                         | Yes      | | message      | from       | Originator address/name                                   | No       | | message      | text       | text needs to be sent as a SMS                            | Yes      |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdNotificationsPost(String userId, String xF1ClientAuthorization, String authorizationDomain, String xF1ClientMethod, String contentType, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdNotificationsPostWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, xF1ClientMethod, contentType, authorization, body).getBody();
    }

    /**
     * Post pin notify/notification Preference 84 85 pending
     * This method is used for notifying the user his PIN via sms or email. This API is a generic API for sending notifications to the user and currently only supports sending PIN notifications. Notifications can be sent to the user via sms or email. A notification of sms or email type can be specified. It is the responsibility of the client to generate a unique id for the requested notification. This API makes use of the phone number and email address on the account provided while provisioning the account. This API also allows sending the account PIN encoded as access code via SMS. Sending the account PIN encoded as access code via e-mail is not supported. This API also allows to send text message as SMS .   Status about each of the notification is returned in the response and is identified by the specified notification id.
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>401</b> - post create notification response
     * <p><b>422</b> - post create notification response
     * <p><b>500</b> - post create notification response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param xF1ClientMethod  (optional)
     * @param contentType  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES specific to the operations performed | ELEMENTS     | ATTRIBUTES | DESCRIPTION                                               | REQUIRED | |--------------|------------|-----------------------------------------------------------|----------| | Notification | password   | Holds type, id &amp; optional format                          |          | | Notification | message    | Holds type,id,from,text &amp; format                          |          | | password     | type       | Notification type email or sms                            | YES      | | password     | id         | Notification id                                           | YES      | | password *   | format     | Format for password which is PIN, accesscode, text, or id | NO       | | message      | type       | Notification type email,sms, or register                  | YES      | | message      | id         | Notification id                                           | YES      | | message *    | format     | Format for password which is text                         | Yes      | | message      | from       | Originator address/name                                   | No       | | message      | text       | text needs to be sent as a SMS                            | Yes      |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdNotificationsPostWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String xF1ClientMethod, String contentType, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdNotificationsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (xF1ClientMethod != null)
        localVarHeaderParams.add("X-F1-Client-Method", apiClient.parameterToString(xF1ClientMethod));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/notifications", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Preferences 14
     * Returns JSON response with a preference which was submitted by the user
     * <p><b>200</b> - Successful response
     * <p><b>404</b> - Matching data not found
     * <p><b>400</b> - Bad request
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server error
     * @param userId  (required)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param xSNCRClientPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdPreferencesGet(String userId, String authorizationDomain, String contentType, String xF1ClientAuthorization, String xSNCRClientPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdPreferencesGetWithHttpInfo(userId, authorizationDomain, contentType, xF1ClientAuthorization, xSNCRClientPlatform, authorization).getBody();
    }

    /**
     * Get Preferences 14
     * Returns JSON response with a preference which was submitted by the user
     * <p><b>200</b> - Successful response
     * <p><b>404</b> - Matching data not found
     * <p><b>400</b> - Bad request
     * <p><b>422</b> - Unprocessable Entity
     * <p><b>500</b> - Internal Server error
     * @param userId  (required)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param xSNCRClientPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdPreferencesGetWithHttpInfo(String userId, String authorizationDomain, String contentType, String xF1ClientAuthorization, String xSNCRClientPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdPreferencesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (xSNCRClientPlatform != null)
        localVarHeaderParams.add("X-SNCR-Client-Platform", apiClient.parameterToString(xSNCRClientPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/preferences", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post Preferences 16
     * Creates an entry in NAB with the preference submitted by the user
     * <p><b>200</b> - Successful response
     * <p><b>404</b> - Preference Not Found
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal Server error
     * @param userId  (required)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param xSNCRClientPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdPreferencesPost(String userId, String authorizationDomain, String contentType, String xF1ClientAuthorization, String xSNCRClientPlatform, String authorization, String body) throws RestClientException {
        return wsgPublicNabV1UserIdPreferencesPostWithHttpInfo(userId, authorizationDomain, contentType, xF1ClientAuthorization, xSNCRClientPlatform, authorization, body).getBody();
    }

    /**
     * Post Preferences 16
     * Creates an entry in NAB with the preference submitted by the user
     * <p><b>200</b> - Successful response
     * <p><b>404</b> - Preference Not Found
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal Server error
     * @param userId  (required)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param xSNCRClientPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdPreferencesPostWithHttpInfo(String userId, String authorizationDomain, String contentType, String xF1ClientAuthorization, String xSNCRClientPlatform, String authorization, String body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdPreferencesPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (xSNCRClientPlatform != null)
        localVarHeaderParams.add("X-SNCR-Client-Platform", apiClient.parameterToString(xSNCRClientPlatform));
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

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/preferences", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put Preferences 15
     * Creates an entry in NAB with the preference submitted by the user
     * <p><b>200</b> - Successful response
     * <p><b>404</b> - Preference Not Found
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal Server error
     * @param userId  (required)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param xSNCRClientPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdPreferencesPut(String userId, String authorizationDomain, String contentType, String xF1ClientAuthorization, String xSNCRClientPlatform, String authorization, String body) throws RestClientException {
        return wsgPublicNabV1UserIdPreferencesPutWithHttpInfo(userId, authorizationDomain, contentType, xF1ClientAuthorization, xSNCRClientPlatform, authorization, body).getBody();
    }

    /**
     * Put Preferences 15
     * Creates an entry in NAB with the preference submitted by the user
     * <p><b>200</b> - Successful response
     * <p><b>404</b> - Preference Not Found
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal Server error
     * @param userId  (required)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param xSNCRClientPlatform  (optional)
     * @param authorization  (optional)
     * @param body  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdPreferencesPutWithHttpInfo(String userId, String authorizationDomain, String contentType, String xF1ClientAuthorization, String xSNCRClientPlatform, String authorization, String body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdPreferencesPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (xSNCRClientPlatform != null)
        localVarHeaderParams.add("X-SNCR-Client-Platform", apiClient.parameterToString(xSNCRClientPlatform));
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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/preferences", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Prefs 89
     * This method is used for retrieving the preferences for the user
     * <p><b>200</b> - preferences get response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param attribute Obtains the preferences filtered by attribute name like cos,timezone PREFERENCE ATTRIBUTES NAME AND DESCRIPTION The following are preference attributes and descriptions | NAME                           | VALUE                                                                                                 | |--------------------------------|-------------------------------------------------------------------------------------------------------| | cos(read only)                 | Premium or Basic user                                                                                 | | timezone                       | List of Valid TimeZone                                                                                | | server.realtime.sync           | Synchronization preference – real-time or periodic (applicable for users with premium users COS only) | | nab.share.notification.enabled | Allow share invitation from others (flag)                                                             | | nab.buddy.notification.enabled | Allow buddy invitations from others (flag)                                                            | | allowedsmsmessages             | Allow the user to send a PIN to phone in an SMS                                                       | | nab.account.id.hidden          | Preference to set the account visibility                                                              |  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdPrefsGet(String userId, String attribute, String xF1ClientAuthorization, String authorizationDomain, String contentType, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdPrefsGetWithHttpInfo(userId, attribute, xF1ClientAuthorization, authorizationDomain, contentType, authorization).getBody();
    }

    /**
     * Get Prefs 89
     * This method is used for retrieving the preferences for the user
     * <p><b>200</b> - preferences get response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param attribute Obtains the preferences filtered by attribute name like cos,timezone PREFERENCE ATTRIBUTES NAME AND DESCRIPTION The following are preference attributes and descriptions | NAME                           | VALUE                                                                                                 | |--------------------------------|-------------------------------------------------------------------------------------------------------| | cos(read only)                 | Premium or Basic user                                                                                 | | timezone                       | List of Valid TimeZone                                                                                | | server.realtime.sync           | Synchronization preference – real-time or periodic (applicable for users with premium users COS only) | | nab.share.notification.enabled | Allow share invitation from others (flag)                                                             | | nab.buddy.notification.enabled | Allow buddy invitations from others (flag)                                                            | | allowedsmsmessages             | Allow the user to send a PIN to phone in an SMS                                                       | | nab.account.id.hidden          | Preference to set the account visibility                                                              |  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdPrefsGetWithHttpInfo(String userId, String attribute, String xF1ClientAuthorization, String authorizationDomain, String contentType, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdPrefsGet");
        }
        
        // verify the required parameter 'attribute' is set
        if (attribute == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'attribute' when calling wsgPublicNabV1UserIdPrefsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("attribute", attribute);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/prefs", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete Prefs Password 88
     * This method is used for delete/resetting the account password. The reset parameter will send in request URL. Setting reset to true will reset the password. Setting reset to false currently does not have any effect in the system. It is reserved for future use in system which supports setting empty passwords. Currently Synchronoss system does not allow empty passwords and so reset&#x3D;false is not a valid option. User must set reset to true always.   One of the advantages of this method is that it is secure when used with the parameter reset set to true. When used in this way, the reset password is never exposed to the user.
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - Successful response
     * <p><b>401</b> - Successful response
     * <p><b>422</b> - Successful response
     * <p><b>500</b> - Successful response
     * @param userId  (required)
     * @param reset  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdPrefsPasswordDelete(String userId, Boolean reset, String xF1ClientAuthorization, String authorizationDomain, String contentType, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdPrefsPasswordDeleteWithHttpInfo(userId, reset, xF1ClientAuthorization, authorizationDomain, contentType, authorization).getBody();
    }

    /**
     * Delete Prefs Password 88
     * This method is used for delete/resetting the account password. The reset parameter will send in request URL. Setting reset to true will reset the password. Setting reset to false currently does not have any effect in the system. It is reserved for future use in system which supports setting empty passwords. Currently Synchronoss system does not allow empty passwords and so reset&#x3D;false is not a valid option. User must set reset to true always.   One of the advantages of this method is that it is secure when used with the parameter reset set to true. When used in this way, the reset password is never exposed to the user.
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - Successful response
     * <p><b>401</b> - Successful response
     * <p><b>422</b> - Successful response
     * <p><b>500</b> - Successful response
     * @param userId  (required)
     * @param reset  (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdPrefsPasswordDeleteWithHttpInfo(String userId, Boolean reset, String xF1ClientAuthorization, String authorizationDomain, String contentType, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdPrefsPasswordDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "reset", reset));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/prefs/password", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Prefs Password 86
     * This method is used for retrieving the account password.
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdPrefsPasswordGet(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdPrefsPasswordGetWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, authorization).getBody();
    }

    /**
     * Get Prefs Password 86
     * This method is used for retrieving the account password.
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdPrefsPasswordGetWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdPrefsPasswordGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/prefs/password", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put Prefs Password 87
     * This method is used for modify/reset the account password . When a password is specified in the modify request the password is set to the specified password for that account.   When a empty password is provided, the password is reset to a random password and returned to the user in the response. Please note that FusionOne system does not allow setting password to empty password. Trying to do so will set the password to a random password.   Please note that in both the cases, whether modifying the password or resetting the password is a mandatory field. It either has a value or it is empty.   One of the disadvantages of this method is that it is not a secure way of resetting the password. The password which is reset is returned to the user. If you need a secure way of resetting the password please use the HTTP DELETE version of this API.
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - Successful response
     * <p><b>400</b> - Successful response
     * <p><b>401</b> - Successful response
     * <p><b>422</b> - Successful response
     * <p><b>500</b> - Successful response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES specific to the operations performed | ELEMENTS | ATTRIBUTES | DESCRIPTION      | REQUIRED | |----------|------------|------------------|----------| | password |            | Account Password | YES      |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdPrefsPasswordPut(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdPrefsPasswordPutWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, authorization, body).getBody();
    }

    /**
     * Put Prefs Password 87
     * This method is used for modify/reset the account password . When a password is specified in the modify request the password is set to the specified password for that account.   When a empty password is provided, the password is reset to a random password and returned to the user in the response. Please note that FusionOne system does not allow setting password to empty password. Trying to do so will set the password to a random password.   Please note that in both the cases, whether modifying the password or resetting the password is a mandatory field. It either has a value or it is empty.   One of the disadvantages of this method is that it is not a secure way of resetting the password. The password which is reset is returned to the user. If you need a secure way of resetting the password please use the HTTP DELETE version of this API.
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - Successful response
     * <p><b>400</b> - Successful response
     * <p><b>401</b> - Successful response
     * <p><b>422</b> - Successful response
     * <p><b>500</b> - Successful response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES specific to the operations performed | ELEMENTS | ATTRIBUTES | DESCRIPTION      | REQUIRED | |----------|------------|------------------|----------| | password |            | Account Password | YES      |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdPrefsPasswordPutWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdPrefsPasswordPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/prefs/password", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put Update Prefs 90
     * This method is used for modifying the preferences for the user account.
     * <p><b>200</b> - preferences operations response
     * <p><b>301</b> - preferences operations response
     * <p><b>400</b> - preferences operations response
     * <p><b>401</b> - preferences operations response
     * <p><b>403</b> - preferences operations response
     * <p><b>422</b> - preferences operations response
     * <p><b>500</b> - preferences operations response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS  | ATTRIBUTES | DESCRIPTION            | REQUIRED | |-----------|------------|------------------------|----------| | attribute | value      | value of the attribute | YES      | | attribute | name       | name of the attribute  | YES      |  PREFERENCE ATTRIBUTES NAME AND VALUE The following preference attributes are available for modification | NAME                           | VALUE                  | |--------------------------------|------------------------| | timezone                       | List of Valid TimeZone | | server.realtime.sync           | on or off              | | nab.share.notification.enabled | true or false          | | nab.buddy.notification.enabled | true or false          | | allowedsmsmessages             | true or false          | | nab.account.id.hidden          | true or false          |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdPrefsPut(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdPrefsPutWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, authorization, body).getBody();
    }

    /**
     * Put Update Prefs 90
     * This method is used for modifying the preferences for the user account.
     * <p><b>200</b> - preferences operations response
     * <p><b>301</b> - preferences operations response
     * <p><b>400</b> - preferences operations response
     * <p><b>401</b> - preferences operations response
     * <p><b>403</b> - preferences operations response
     * <p><b>422</b> - preferences operations response
     * <p><b>500</b> - preferences operations response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS  | ATTRIBUTES | DESCRIPTION            | REQUIRED | |-----------|------------|------------------------|----------| | attribute | value      | value of the attribute | YES      | | attribute | name       | name of the attribute  | YES      |  PREFERENCE ATTRIBUTES NAME AND VALUE The following preference attributes are available for modification | NAME                           | VALUE                  | |--------------------------------|------------------------| | timezone                       | List of Valid TimeZone | | server.realtime.sync           | on or off              | | nab.share.notification.enabled | true or false          | | nab.buddy.notification.enabled | true or false          | | allowedsmsmessages             | true or false          | | nab.account.id.hidden          | true or false          |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdPrefsPutWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdPrefsPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/prefs", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user Profile 65
     * This method is used for retrieving the profile for userid
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdProfileGet(String userId, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdProfileGetWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, content, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get user Profile 65
     * This method is used for retrieving the profile for userid
     * <p><b>200</b> - Successful response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdProfileGetWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdProfileGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (content != null)
        localVarHeaderParams.add("Content", apiClient.parameterToString(content));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/profile", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put update user Profile 65
     * This method is used for modifying the profile.
     * <p><b>200</b> - profile modify response
     * <p><b>301</b> - profile modify response
     * <p><b>401</b> - profile modify response
     * <p><b>403</b> - profile modify response
     * <p><b>404</b> - profile modify response
     * <p><b>422</b> - profile modify response
     * <p><b>500</b> - profile modify response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS          | ATTRIBUTES   | DESCRIPTION                                                 | REQUIRED | |-------------------|--------------|-------------------------------------------------------------|----------| | modify            | replace      | boolean to specify the operation is modify or replace       | NO       | | firstname         |              | First Name of the contact                                   | NO       | | lastname          |              | Last Name of the contact                                    | NO       | | middlename        |              | Middle Name of the contact                                  | NO       | | nameprefix        |              | NamePrefix of contact                                       | NO       | | namesuffix        |              | NameSuffix of contact                                       | NO       | | nickname          |              | Nickname of contact                                         | NO       | | birthday          |              | Birthdate of contact                                        | NO       | | source            |              | The source from where the contact originated.               | NO       | | endpointassoc     | endpointtype | EndpoinType of contact                                      | NO       | | endpointassoc     | endpointid   | EndpointId of contact                                       | NO       | | buddyassoc        | buddyuserid  | Buddy UserId of contact                                     | NO       | | prefmodeofcontact | type         | The type of preferred mode of communication for the contact | NO       | | prefmodeofcontact | value        | The preferred mode of communication for the contact         | NO       | | conflicttype      |              | Conflict Type of contact                                    | NO       | | incaseofemergency |              | Specifies contact as ICE or not                             | NO       | | photo             | ContentType  | Photo of contact                                            | NO       | | anniversary       |              | Marriage anniversary date                                   | NO       | | spouse            |              | Spouse of contact                                           | NO       | | children          |              | Children Names of contact                                   | NO       | | note              |              | Note for the contact                                        | NO       | | orgname           |              | Company Name of contact                                     | NO       | | orgunit           |              | Company Department of contact                               | NO       | | jobtitle          |              | Job titile of contact                                       | NO       | | profession        |              | Profession of contact                                       | NO       | | assistant         |              | Assistant Name of contact                                   | NO       | | gender            |              | Gender of the contact                                       | NO       | | relationship      |              | Relationship of the contact with the person                 | NO       | | maritalstatus     |              | Marital status of the contact                               | NO       | | timezone          |              | Timezone of the contact                                     | NO       | | created           |              | Created date of contact                                     | NO       | | modified          |              | Modified date of contact                                    | NO       | | tel               | type         | Telephone type of contact                                   | YES      | | tel               | indx         | Telephone indx of contact                                   | NO       | | number            |              | Telephone Number of contact                                 | NO       | | carrier           |              | Telephone Carrier of contact                                | NO       | | preference        |              | Telephone Preference of contact                             | NO       | | email             | type         | Email Type of contact                                       | YES      | | email             | indx         | Email Indx of contact                                       | NO       | | address           |              | Email Address of contact                                    | NO       | | preference        |              | Email Preference of contact                                 | NO       | | im                | type         | IM type of contact                                          | YES      | | address           |              | IM address of contact                                       | NO       | | preference        |              | IM preference of contact                                    | NO       | | address           | type         | Address type of the contact                                 | YES      | | address           | indx         | Address indx of the contact                                 | NO       | | pobox             |              | Post box number of the address                              | NO       | | street            |              | Street Number of the address                                | NO       | | apartment         |              | Apartment Number of the address                             | NO       | | city              |              | City of the address                                         | NO       | | state             |              | State of the address                                        | NO       | | zipcode           |              | Zipcode of the address                                      | NO       | | country           |              | Country of the address                                      | NO       | | preference        |              | Preference of the address                                   | NO       | | webpage           | type         | Webpage Type of contact                                     | YES      | | webpage           | indx         | Webpage Indx of contact                                     | NO       | | url               |              | Webpage Url of contact                                      | NO       | | groups            |              | Groups Type of contact                                      | YES      | | groups            | group        | Group added to contact                                      | NO       | | group             | id           | Group Id                                                    | YES      | | group             | name         | Name of the group                                           | YES      | | group             | version      | Version of the group                                        | YES      | | group             | type         | Group Type                                                  | YES      | | extfield          | name         | Name of the extensible field                                | YES      | | extfield          | value        | Value of the extensible field                               | YES      |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdProfilePut(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdProfilePutWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Put update user Profile 65
     * This method is used for modifying the profile.
     * <p><b>200</b> - profile modify response
     * <p><b>301</b> - profile modify response
     * <p><b>401</b> - profile modify response
     * <p><b>403</b> - profile modify response
     * <p><b>404</b> - profile modify response
     * <p><b>422</b> - profile modify response
     * <p><b>500</b> - profile modify response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS          | ATTRIBUTES   | DESCRIPTION                                                 | REQUIRED | |-------------------|--------------|-------------------------------------------------------------|----------| | modify            | replace      | boolean to specify the operation is modify or replace       | NO       | | firstname         |              | First Name of the contact                                   | NO       | | lastname          |              | Last Name of the contact                                    | NO       | | middlename        |              | Middle Name of the contact                                  | NO       | | nameprefix        |              | NamePrefix of contact                                       | NO       | | namesuffix        |              | NameSuffix of contact                                       | NO       | | nickname          |              | Nickname of contact                                         | NO       | | birthday          |              | Birthdate of contact                                        | NO       | | source            |              | The source from where the contact originated.               | NO       | | endpointassoc     | endpointtype | EndpoinType of contact                                      | NO       | | endpointassoc     | endpointid   | EndpointId of contact                                       | NO       | | buddyassoc        | buddyuserid  | Buddy UserId of contact                                     | NO       | | prefmodeofcontact | type         | The type of preferred mode of communication for the contact | NO       | | prefmodeofcontact | value        | The preferred mode of communication for the contact         | NO       | | conflicttype      |              | Conflict Type of contact                                    | NO       | | incaseofemergency |              | Specifies contact as ICE or not                             | NO       | | photo             | ContentType  | Photo of contact                                            | NO       | | anniversary       |              | Marriage anniversary date                                   | NO       | | spouse            |              | Spouse of contact                                           | NO       | | children          |              | Children Names of contact                                   | NO       | | note              |              | Note for the contact                                        | NO       | | orgname           |              | Company Name of contact                                     | NO       | | orgunit           |              | Company Department of contact                               | NO       | | jobtitle          |              | Job titile of contact                                       | NO       | | profession        |              | Profession of contact                                       | NO       | | assistant         |              | Assistant Name of contact                                   | NO       | | gender            |              | Gender of the contact                                       | NO       | | relationship      |              | Relationship of the contact with the person                 | NO       | | maritalstatus     |              | Marital status of the contact                               | NO       | | timezone          |              | Timezone of the contact                                     | NO       | | created           |              | Created date of contact                                     | NO       | | modified          |              | Modified date of contact                                    | NO       | | tel               | type         | Telephone type of contact                                   | YES      | | tel               | indx         | Telephone indx of contact                                   | NO       | | number            |              | Telephone Number of contact                                 | NO       | | carrier           |              | Telephone Carrier of contact                                | NO       | | preference        |              | Telephone Preference of contact                             | NO       | | email             | type         | Email Type of contact                                       | YES      | | email             | indx         | Email Indx of contact                                       | NO       | | address           |              | Email Address of contact                                    | NO       | | preference        |              | Email Preference of contact                                 | NO       | | im                | type         | IM type of contact                                          | YES      | | address           |              | IM address of contact                                       | NO       | | preference        |              | IM preference of contact                                    | NO       | | address           | type         | Address type of the contact                                 | YES      | | address           | indx         | Address indx of the contact                                 | NO       | | pobox             |              | Post box number of the address                              | NO       | | street            |              | Street Number of the address                                | NO       | | apartment         |              | Apartment Number of the address                             | NO       | | city              |              | City of the address                                         | NO       | | state             |              | State of the address                                        | NO       | | zipcode           |              | Zipcode of the address                                      | NO       | | country           |              | Country of the address                                      | NO       | | preference        |              | Preference of the address                                   | NO       | | webpage           | type         | Webpage Type of contact                                     | YES      | | webpage           | indx         | Webpage Indx of contact                                     | NO       | | url               |              | Webpage Url of contact                                      | NO       | | groups            |              | Groups Type of contact                                      | YES      | | groups            | group        | Group added to contact                                      | NO       | | group             | id           | Group Id                                                    | YES      | | group             | name         | Name of the group                                           | YES      | | group             | version      | Version of the group                                        | YES      | | group             | type         | Group Type                                                  | YES      | | extfield          | name         | Name of the extensible field                                | YES      | | extfield          | value        | Value of the extensible field                               | YES      |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdProfilePutWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdProfilePut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/profile", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Shares 31 not executed pending
     * This method is used for adding a buddy
     * <p><b>200</b> - Get Address Book response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param visibility Filter the shares by visibility of. If not specified, both public and private shares that the user is a member of (owned/subscribed/invited/rejected/requested) are returned. (optional)
     * @param membershipStatus Filter the shares by membership-status. It is an or list delimited by value owned not-member (optional)
     * @param rangebegin Specifies index of the starting item (optional)
     * @param maxnum Specifies maximum number of items to fetch. If visibility&#x3D;public and membership-status is null or contains not-member, maxnum will be default to 100 if not specified. (optional)
     * @param name Filter the shares by name field (optional)
     * @param description Filter the shares by description field (optional)
     * @param pobox Filter the shares by pobox field (optional)
     * @param apartment Filter the shares by apartment field (optional)
     * @param street Filter the shares by street field (optional)
     * @param city Filter the shares by city field (optional)
     * @param state Filter the shares by state field (optional)
     * @param zipcode Filter the shares by zipcode field (optional)
     * @param country Filter the shares by country field (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdSharesGet(String userId, String visibility, String membershipStatus, String rangebegin, String maxnum, String name, String description, String pobox, String apartment, String street, String city, String state, String zipcode, String country, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdSharesGetWithHttpInfo(userId, visibility, membershipStatus, rangebegin, maxnum, name, description, pobox, apartment, street, city, state, zipcode, country, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get Shares 31 not executed pending
     * This method is used for adding a buddy
     * <p><b>200</b> - Get Address Book response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param visibility Filter the shares by visibility of. If not specified, both public and private shares that the user is a member of (owned/subscribed/invited/rejected/requested) are returned. (optional)
     * @param membershipStatus Filter the shares by membership-status. It is an or list delimited by value owned not-member (optional)
     * @param rangebegin Specifies index of the starting item (optional)
     * @param maxnum Specifies maximum number of items to fetch. If visibility&#x3D;public and membership-status is null or contains not-member, maxnum will be default to 100 if not specified. (optional)
     * @param name Filter the shares by name field (optional)
     * @param description Filter the shares by description field (optional)
     * @param pobox Filter the shares by pobox field (optional)
     * @param apartment Filter the shares by apartment field (optional)
     * @param street Filter the shares by street field (optional)
     * @param city Filter the shares by city field (optional)
     * @param state Filter the shares by state field (optional)
     * @param zipcode Filter the shares by zipcode field (optional)
     * @param country Filter the shares by country field (optional)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdSharesGetWithHttpInfo(String userId, String visibility, String membershipStatus, String rangebegin, String maxnum, String name, String description, String pobox, String apartment, String street, String city, String state, String zipcode, String country, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdSharesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "visibility", visibility));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "membership-status", membershipStatus));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "rangebegin", rangebegin));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "maxnum", maxnum));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "description", description));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pobox", pobox));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "apartment", apartment));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "street", street));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "city", city));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "state", state));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "zipcode", zipcode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "country", country));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/shares", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post create Shares 32 not executed pending
     * This method is used for adding shares.   NOTE: While sending share invite to members,If the invited User has hidden his account then such requests are not processed. This condition valid only to ICS users for now
     * <p><b>200</b> - Post Address Book response
     * <p><b>301</b> - User is in Different PU
     * <p><b>401</b> - Unsupported HTTP Authentication
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource not found
     * <p><b>422</b> - Resource not found
     * <p><b>500</b> - Unknown error
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES  | DESCRIPTION                       | REQUIRED | |----------|-------------|-----------------------------------|----------| | share    | visibility  | Specifies share is private/public | NO       | | share    | tempid      | tempId of the share               | YES      | | share    | name        | share name                        | NO       | | share    | description | description of the share          | NO       | | share    | address     | address of the share              | NO       | | share    | members     | members of the share              | NO       | | share    | contacts    | contacts of the share             | NO       |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdSharesPost(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdSharesPostWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Post create Shares 32 not executed pending
     * This method is used for adding shares.   NOTE: While sending share invite to members,If the invited User has hidden his account then such requests are not processed. This condition valid only to ICS users for now
     * <p><b>200</b> - Post Address Book response
     * <p><b>301</b> - User is in Different PU
     * <p><b>401</b> - Unsupported HTTP Authentication
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource not found
     * <p><b>422</b> - Resource not found
     * <p><b>500</b> - Unknown error
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES  | DESCRIPTION                       | REQUIRED | |----------|-------------|-----------------------------------|----------| | share    | visibility  | Specifies share is private/public | NO       | | share    | tempid      | tempId of the share               | YES      | | share    | name        | share name                        | NO       | | share    | description | description of the share          | NO       | | share    | address     | address of the share              | NO       | | share    | members     | members of the share              | NO       | | share    | contacts    | contacts of the share             | NO       |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdSharesPostWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdSharesPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/shares", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put modify Shares 33 not executed pending
     * This method is used for performing different operations on shares 
     * <p><b>200</b> - Post Address Book response
     * <p><b>301</b> - User is in Different PU
     * <p><b>401</b> - Unsupported HTTP Authentication
     * <p><b>403</b> - Post Address Book response
     * <p><b>404</b> - Not a member of the share
     * <p><b>422</b> - Share Id is not valid
     * <p><b>500</b> - Unknown error
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS    | ATTRIBUTES  | DESCRIPTION                                           | REQUIRED | |-------------|-------------|-------------------------------------------------------|----------| | DELETE      | id          | id of the share to be deleted                         | YES      | | MODIFY      | id          | id of the share to be modified                        | YES      | | MODIFY      | name        | name of the share                                     | NO       | | MODIFY      | description | description of the share                              | NO       | | MODIFY      | address     | address of the share                                  | NO       | | MODIFY      | replace     | boolean to specify the operation is modify or replace | optional | | REQUEST     | id          | id of the share                                       | YES      | | SUBSCRIBE   | id          | id of the share                                       | YES      | | UNSUBSCRIBE | id          | id of the share                                       | YES      | | REJECT      | id          | id of the share                                       | YES      |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdSharesPut(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdSharesPutWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Put modify Shares 33 not executed pending
     * This method is used for performing different operations on shares 
     * <p><b>200</b> - Post Address Book response
     * <p><b>301</b> - User is in Different PU
     * <p><b>401</b> - Unsupported HTTP Authentication
     * <p><b>403</b> - Post Address Book response
     * <p><b>404</b> - Not a member of the share
     * <p><b>422</b> - Share Id is not valid
     * <p><b>500</b> - Unknown error
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS    | ATTRIBUTES  | DESCRIPTION                                           | REQUIRED | |-------------|-------------|-------------------------------------------------------|----------| | DELETE      | id          | id of the share to be deleted                         | YES      | | MODIFY      | id          | id of the share to be modified                        | YES      | | MODIFY      | name        | name of the share                                     | NO       | | MODIFY      | description | description of the share                              | NO       | | MODIFY      | address     | address of the share                                  | NO       | | MODIFY      | replace     | boolean to specify the operation is modify or replace | optional | | REQUEST     | id          | id of the share                                       | YES      | | SUBSCRIBE   | id          | id of the share                                       | YES      | | UNSUBSCRIBE | id          | id of the share                                       | YES      | | REJECT      | id          | id of the share                                       | YES      |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdSharesPutWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdSharesPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/shares", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Shares by share id address book contacts 28 not executed pending
     * This method is used for retrieving share contacts
     * <p><b>200</b> - Get Address Book response
     * <p><b>301</b> - Successful response
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param shareId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdSharesShareIdAbContactsGet(String userId, String shareId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdSharesShareIdAbContactsGetWithHttpInfo(userId, shareId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get Shares by share id address book contacts 28 not executed pending
     * This method is used for retrieving share contacts
     * <p><b>200</b> - Get Address Book response
     * <p><b>301</b> - Successful response
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param shareId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdSharesShareIdAbContactsGetWithHttpInfo(String userId, String shareId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdSharesShareIdAbContactsGet");
        }
        
        // verify the required parameter 'shareId' is set
        if (shareId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shareId' when calling wsgPublicNabV1UserIdSharesShareIdAbContactsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("shareId", shareId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/shares/{shareId}/ab/contacts", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Shares by share id address book contacts 30 not executed pending
     * This method is used for adding contacts to share
     * <p><b>200</b> - Post create Address Book response
     * <p><b>301</b> - Post create Address Book response
     * <p><b>403</b> - Post create Address Book response
     * <p><b>404</b> - Post create Address Book response
     * <p><b>422</b> - Post create Address Book response
     * <p><b>500</b> - Post create Address Book response
     * @param userId  (required)
     * @param shareId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS           | ATTRIBUTES   | DESCRIPTION                                                 | REQUIRED | |--------------------|--------------|-------------------------------------------------------------|----------| | share-contacts-add | contact      | contact to be added to share                                | NO       | | share-contacts-add | contactref   | contact copy to be added to share                           | NO       | | share-contacts-add | contactlink  | contact link to AB added to share                           | NO       | | contact            | version      | version of the contact                                      | optional | | contact            | id           | id of the contact                                           | optional | | contact            | tempid       | tempid of the contact                                       | optional | | firstname          |              | First Name of the contact                                   | NO       | | lastname           |              | Last Name of the contact                                    | NO       | | middlename         |              | Middle Name of the contact                                  | NO       | | nameprefix         |              | NamePrefix of contact                                       | NO       | | namesuffix         |              | NameSuffix of contact                                       | NO       | | nickname           |              | Nickname of contact                                         | NO       | | birthday           |              | Birthdate of contact                                        | NO       | | source             |              | The source from where the contact originated.               | NO       | | endpointassoc      | endpointtype | EndpoinType of contact                                      | NO       | | endpointassoc      | endpointid   | EndpoinId of contact                                        | NO       | | buddyassoc         | buddyuserid  | Buddy UserId of contact                                     | NO       | | shareassoc         | id           | ShareId associated with contact                             | NO       | | shareassoc         | name         | ShareName associated with contact                           | NO       | | prefmodeofcontact  | type         | The type of preferred mode of communication for the contact | NO       | | prefmodeofcontact  | value        | The preferred mode of communication for the contact         | NO       | | conflicttype       |              | Conflict Type of contact                                    | NO       | | incaseofemergency  |              | Specifies contact as ICE or not                             | NO       | | favorite           |              | Specifies contact as favourite                              | NO       | | photo              | ContentType  | Photo of contact                                            | NO       | | anniversary        |              | Marriage anniversary date                                   | NO       | | spouse             |              | Spouse of contact                                           | NO       | | children           |              | Children Names of contact                                   | NO       | | note               |              | Note for the contact                                        | NO       | | orgname            |              | Company Name of contact                                     | NO       | | orgunit            |              | Company Department of contact                               | NO       | | jobtitle           |              | Job titile of contact                                       | NO       | | profession         |              | Profession of contact                                       | NO       | | assistant          |              | Assistant Name of contact                                   | NO       | | gender             |              | Gender of the contact                                       | NO       | | relationship       |              | Relationship of the contact with the person                 | NO       | | maritalstatus      |              | Marital status of the contact                               | NO       | | timezone           |              | Timezone of the contact                                     | NO       | | created            |              | Created date of contact                                     | NO       | | modified           |              | Modified date of contact                                    | NO       | | tel                | type         | Telephone type of contact                                   | YES      | | tel                | indx         | Telephone indx of contact                                   | NO       | | number             |              | Telephone Number of contact                                 | NO       | | carrier            |              | Telephone Carrier of contact                                | NO       | | preference         |              | Telephone Preference of contact                             | NO       | | email              | type         | Email Type of contact                                       | YES      | | email              | indx         | Email Indx of contact                                       | NO       | | address            |              | Email Address of contact                                    | NO       | | preference         |              | Email Preference of contact                                 | NO       | | im                 | type         | IM type of contact                                          | YES      | | address            |              | IM address of contact                                       | NO       | | preference         |              | IM preference of contact                                    | NO       | | address            | type         | Address type of the contact                                 | YES      | | address            | indx         | Address indx of the contact                                 | NO       | | pobox              |              | Post box number of the address                              | NO       | | street             |              | Street Number of the address                                | NO       | | apartment          |              | Apartment Number of the address                             | NO       | | city               |              | City of the address                                         | NO       | | state              |              | State of the address                                        | NO       | | zipcode            |              | Zipcode of the address                                      | NO       | | country            |              | Country of the address                                      | NO       | | preference         |              | Preference of the address                                   | NO       | | webpage            | type         | Webpage Type of contact                                     | YES      | | webpage            | indx         | Webpage Indx of contact                                     | NO       | | url                |              | Webpage Url of contact                                      | NO       | | groups             |              | Groups Type of contact                                      | YES      | | groups             | group        | Group added to contact                                      | NO       | | group              | id           | Group Id                                                    | YES      | | group              | name         | Name of the group                                           | YES      | | group              | version      | Version of the group                                        | YES      | | group              | type         | Group Type                                                  | YES      | | extfield           | name         | Name of the extensible field                                | YES      | | extfield           | value        | Value of the extensible field                               | YES      | | contactref         | version      | version of the contact                                      | optional | | contactref         | id           | id of the contact                                           | optional | | contactref         | tempid       | contactId of the Buddy                                      | optional | | contactlink        | version      | version of the contact                                      | optional | | contactlink        | id           | id of the contact                                           | optional | | contactlink        | tempid       | tempid of the contact                                       | optional |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdSharesShareIdAbContactsPost(String userId, String shareId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdSharesShareIdAbContactsPostWithHttpInfo(userId, shareId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Get Shares by share id address book contacts 30 not executed pending
     * This method is used for adding contacts to share
     * <p><b>200</b> - Post create Address Book response
     * <p><b>301</b> - Post create Address Book response
     * <p><b>403</b> - Post create Address Book response
     * <p><b>404</b> - Post create Address Book response
     * <p><b>422</b> - Post create Address Book response
     * <p><b>500</b> - Post create Address Book response
     * @param userId  (required)
     * @param shareId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS           | ATTRIBUTES   | DESCRIPTION                                                 | REQUIRED | |--------------------|--------------|-------------------------------------------------------------|----------| | share-contacts-add | contact      | contact to be added to share                                | NO       | | share-contacts-add | contactref   | contact copy to be added to share                           | NO       | | share-contacts-add | contactlink  | contact link to AB added to share                           | NO       | | contact            | version      | version of the contact                                      | optional | | contact            | id           | id of the contact                                           | optional | | contact            | tempid       | tempid of the contact                                       | optional | | firstname          |              | First Name of the contact                                   | NO       | | lastname           |              | Last Name of the contact                                    | NO       | | middlename         |              | Middle Name of the contact                                  | NO       | | nameprefix         |              | NamePrefix of contact                                       | NO       | | namesuffix         |              | NameSuffix of contact                                       | NO       | | nickname           |              | Nickname of contact                                         | NO       | | birthday           |              | Birthdate of contact                                        | NO       | | source             |              | The source from where the contact originated.               | NO       | | endpointassoc      | endpointtype | EndpoinType of contact                                      | NO       | | endpointassoc      | endpointid   | EndpoinId of contact                                        | NO       | | buddyassoc         | buddyuserid  | Buddy UserId of contact                                     | NO       | | shareassoc         | id           | ShareId associated with contact                             | NO       | | shareassoc         | name         | ShareName associated with contact                           | NO       | | prefmodeofcontact  | type         | The type of preferred mode of communication for the contact | NO       | | prefmodeofcontact  | value        | The preferred mode of communication for the contact         | NO       | | conflicttype       |              | Conflict Type of contact                                    | NO       | | incaseofemergency  |              | Specifies contact as ICE or not                             | NO       | | favorite           |              | Specifies contact as favourite                              | NO       | | photo              | ContentType  | Photo of contact                                            | NO       | | anniversary        |              | Marriage anniversary date                                   | NO       | | spouse             |              | Spouse of contact                                           | NO       | | children           |              | Children Names of contact                                   | NO       | | note               |              | Note for the contact                                        | NO       | | orgname            |              | Company Name of contact                                     | NO       | | orgunit            |              | Company Department of contact                               | NO       | | jobtitle           |              | Job titile of contact                                       | NO       | | profession         |              | Profession of contact                                       | NO       | | assistant          |              | Assistant Name of contact                                   | NO       | | gender             |              | Gender of the contact                                       | NO       | | relationship       |              | Relationship of the contact with the person                 | NO       | | maritalstatus      |              | Marital status of the contact                               | NO       | | timezone           |              | Timezone of the contact                                     | NO       | | created            |              | Created date of contact                                     | NO       | | modified           |              | Modified date of contact                                    | NO       | | tel                | type         | Telephone type of contact                                   | YES      | | tel                | indx         | Telephone indx of contact                                   | NO       | | number             |              | Telephone Number of contact                                 | NO       | | carrier            |              | Telephone Carrier of contact                                | NO       | | preference         |              | Telephone Preference of contact                             | NO       | | email              | type         | Email Type of contact                                       | YES      | | email              | indx         | Email Indx of contact                                       | NO       | | address            |              | Email Address of contact                                    | NO       | | preference         |              | Email Preference of contact                                 | NO       | | im                 | type         | IM type of contact                                          | YES      | | address            |              | IM address of contact                                       | NO       | | preference         |              | IM preference of contact                                    | NO       | | address            | type         | Address type of the contact                                 | YES      | | address            | indx         | Address indx of the contact                                 | NO       | | pobox              |              | Post box number of the address                              | NO       | | street             |              | Street Number of the address                                | NO       | | apartment          |              | Apartment Number of the address                             | NO       | | city               |              | City of the address                                         | NO       | | state              |              | State of the address                                        | NO       | | zipcode            |              | Zipcode of the address                                      | NO       | | country            |              | Country of the address                                      | NO       | | preference         |              | Preference of the address                                   | NO       | | webpage            | type         | Webpage Type of contact                                     | YES      | | webpage            | indx         | Webpage Indx of contact                                     | NO       | | url                |              | Webpage Url of contact                                      | NO       | | groups             |              | Groups Type of contact                                      | YES      | | groups             | group        | Group added to contact                                      | NO       | | group              | id           | Group Id                                                    | YES      | | group              | name         | Name of the group                                           | YES      | | group              | version      | Version of the group                                        | YES      | | group              | type         | Group Type                                                  | YES      | | extfield           | name         | Name of the extensible field                                | YES      | | extfield           | value        | Value of the extensible field                               | YES      | | contactref         | version      | version of the contact                                      | optional | | contactref         | id           | id of the contact                                           | optional | | contactref         | tempid       | contactId of the Buddy                                      | optional | | contactlink        | version      | version of the contact                                      | optional | | contactlink        | id           | id of the contact                                           | optional | | contactlink        | tempid       | tempid of the contact                                       | optional |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdSharesShareIdAbContactsPostWithHttpInfo(String userId, String shareId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdSharesShareIdAbContactsPost");
        }
        
        // verify the required parameter 'shareId' is set
        if (shareId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shareId' when calling wsgPublicNabV1UserIdSharesShareIdAbContactsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("shareId", shareId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/shares/{shareId}/ab/contacts", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Shares by share id address book contacts 29 not executed pending
     * This method is used for modifying the share contacts
     * <p><b>200</b> - Post create Address Book response
     * <p><b>301</b> - Post create Address Book response
     * <p><b>403</b> - Post create Address Book response
     * <p><b>404</b> - Post create Address Book response
     * <p><b>500</b> - Post create Address Book response
     * @param userId  (required)
     * @param shareId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS          | ATTRIBUTES   | DESCRIPTION                                                 | REQUIRED | |-------------------|--------------|-------------------------------------------------------------|----------| | DELETE            | contact      | contact of share to be deleted                              | optional | | contact           | id           | id of the contact to be deleted                             | optional | | contact           | tempid       | tempid of the contact deleted                               | optional | | contact           | version      | version of the contact deleted                              | optional | | MODIFY            | contact      | contact of share to be modified                             | optional | | MODIFY            | replace      | boolean to specify the operation is modify or replace       | optional | | contact           | version      | version of the contact                                      | optional | | contact           | id           | id of the contact                                           | optional | | contact           | tempid       | tempid of the contact                                       | optional | | firstname         |              | First Name of the contact                                   | NO       | | lastname          |              | Last Name of the contact                                    | NO       | | middlename        |              | Middle Name of the contact                                  | NO       | | nameprefix        |              | NamePrefix of contact                                       | NO       | | namesuffix        |              | NameSuffix of contact                                       | NO       | | nickname          |              | Nickname of contact                                         | NO       | | birthday          |              | Birthdate of contact                                        | NO       | | source            |              | The source from where the contact originated.               | NO       | | endpointassoc     | endpointtype | EndpoinType of contact                                      | NO       | | endpointassoc     | endpointid   | EndpoinId of contact                                        | NO       | | buddyassoc        | buddyuserid  | Buddy UserId of contact                                     | NO       | | shareassoc        | id           | ShareId associated with contact                             | NO       | | shareassoc        | name         | ShareName associated with contact                           | NO       | | prefmodeofcontact | type         | The type of preferred mode of communication for the contact | NO       | | prefmodeofcontact | value        | The preferred mode of communication for the contact         | NO       | | conflicttype      |              | Conflict Type of contact                                    | NO       | | incaseofemergency |              | Specifies contact as ICE or not                             | NO       | | favorite          |              | Specifies contact as favourite                              | NO       | | photo             | ContentType  | Photo of contact                                            | NO       | | anniversary       |              | Marriage anniversary date                                   | NO       | | spouse            |              | Spouse of contact                                           | NO       | | children          |              | Children Names of contact                                   | NO       | | note              |              | Note for the contact                                        | NO       | | orgname           |              | Company Name of contact                                     | NO       | | orgunit           |              | Company Department of contact                               | NO       | | jobtitle          |              | Job titile of contact                                       | NO       | | profession        |              | Profession of contact                                       | NO       | | assistant         |              | Assistant Name of contact                                   | NO       | | gender            |              | Gender of the contact                                       | NO       | | relationship      |              | Relationship of the contact with the person                 | NO       | | maritalstatus     |              | Marital status of the contact                               | NO       | | timezone          |              | Timezone of the contact                                     | NO       | | created           |              | Created date of contact                                     | NO       | | modified          |              | Modified date of contact                                    | NO       | | tel               | type         | Telephone type of contact                                   | YES      | | tel               | indx         | Telephone indx of contact                                   | NO       | | number            |              | Telephone Number of contact                                 | NO       | | carrier           |              | Telephone Carrier of contact                                | NO       | | preference        |              | Telephone Preference of contact                             | NO       | | email             | type         | Email Type of contact                                       | YES      | | email             | indx         | Email Indx of contact                                       | NO       | | address           |              | Email Address of contact                                    | NO       | | preference        |              | Email Preference of contact                                 | NO       | | im                | type         | IM type of contact                                          | YES      | | address           |              | IM address of contact                                       | NO       | | preference        |              | IM preference of contact                                    | NO       | | address           | type         | Address type of the contact                                 | YES      | | address           | indx         | Address indx of the contact                                 | NO       | | pobox             |              | Post box number of the address                              | NO       | | street            |              | Street Number of the address                                | NO       | | apartment         |              | Apartment Number of the address                             | NO       | | city              |              | City of the address                                         | NO       | | state             |              | State of the address                                        | NO       | | zipcode           |              | Zipcode of the address                                      | NO       | | country           |              | Country of the address                                      | NO       | | preference        |              | Preference of the address                                   | NO       | | webpage           | type         | Webpage Type of contact                                     | YES      | | webpage           | indx         | Webpage Indx of contact                                     | NO       | | url               |              | Webpage Url of contact                                      | NO       | | groups            |              | Groups Type of contact                                      | YES      | | groups            | group        | Group added to contact                                      | NO       | | group             | id           | Group Id                                                    | YES      | | group             | name         | Name of the group                                           | YES      | | group             | version      | Version of the group                                        | YES      | | group             | type         | Group Type                                                  | YES      | | extfield          | name         | Name of the extensible field                                | YES      | | extfield          | value        | Value of the extensible field                               | YES      | | DELETE-LINK       | contact      | contact link of share to be deleted                         | optional | | contact           | id           | id of the contact link to be deleted                        | optional | | contact           | tempid       | tempid of the contact link to be deleted                    | optional | | contact           | version      | version of the contact link to be deleted                   | optional |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdSharesShareIdAbContactsPut(String userId, String shareId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdSharesShareIdAbContactsPutWithHttpInfo(userId, shareId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Get Shares by share id address book contacts 29 not executed pending
     * This method is used for modifying the share contacts
     * <p><b>200</b> - Post create Address Book response
     * <p><b>301</b> - Post create Address Book response
     * <p><b>403</b> - Post create Address Book response
     * <p><b>404</b> - Post create Address Book response
     * <p><b>500</b> - Post create Address Book response
     * @param userId  (required)
     * @param shareId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS          | ATTRIBUTES   | DESCRIPTION                                                 | REQUIRED | |-------------------|--------------|-------------------------------------------------------------|----------| | DELETE            | contact      | contact of share to be deleted                              | optional | | contact           | id           | id of the contact to be deleted                             | optional | | contact           | tempid       | tempid of the contact deleted                               | optional | | contact           | version      | version of the contact deleted                              | optional | | MODIFY            | contact      | contact of share to be modified                             | optional | | MODIFY            | replace      | boolean to specify the operation is modify or replace       | optional | | contact           | version      | version of the contact                                      | optional | | contact           | id           | id of the contact                                           | optional | | contact           | tempid       | tempid of the contact                                       | optional | | firstname         |              | First Name of the contact                                   | NO       | | lastname          |              | Last Name of the contact                                    | NO       | | middlename        |              | Middle Name of the contact                                  | NO       | | nameprefix        |              | NamePrefix of contact                                       | NO       | | namesuffix        |              | NameSuffix of contact                                       | NO       | | nickname          |              | Nickname of contact                                         | NO       | | birthday          |              | Birthdate of contact                                        | NO       | | source            |              | The source from where the contact originated.               | NO       | | endpointassoc     | endpointtype | EndpoinType of contact                                      | NO       | | endpointassoc     | endpointid   | EndpoinId of contact                                        | NO       | | buddyassoc        | buddyuserid  | Buddy UserId of contact                                     | NO       | | shareassoc        | id           | ShareId associated with contact                             | NO       | | shareassoc        | name         | ShareName associated with contact                           | NO       | | prefmodeofcontact | type         | The type of preferred mode of communication for the contact | NO       | | prefmodeofcontact | value        | The preferred mode of communication for the contact         | NO       | | conflicttype      |              | Conflict Type of contact                                    | NO       | | incaseofemergency |              | Specifies contact as ICE or not                             | NO       | | favorite          |              | Specifies contact as favourite                              | NO       | | photo             | ContentType  | Photo of contact                                            | NO       | | anniversary       |              | Marriage anniversary date                                   | NO       | | spouse            |              | Spouse of contact                                           | NO       | | children          |              | Children Names of contact                                   | NO       | | note              |              | Note for the contact                                        | NO       | | orgname           |              | Company Name of contact                                     | NO       | | orgunit           |              | Company Department of contact                               | NO       | | jobtitle          |              | Job titile of contact                                       | NO       | | profession        |              | Profession of contact                                       | NO       | | assistant         |              | Assistant Name of contact                                   | NO       | | gender            |              | Gender of the contact                                       | NO       | | relationship      |              | Relationship of the contact with the person                 | NO       | | maritalstatus     |              | Marital status of the contact                               | NO       | | timezone          |              | Timezone of the contact                                     | NO       | | created           |              | Created date of contact                                     | NO       | | modified          |              | Modified date of contact                                    | NO       | | tel               | type         | Telephone type of contact                                   | YES      | | tel               | indx         | Telephone indx of contact                                   | NO       | | number            |              | Telephone Number of contact                                 | NO       | | carrier           |              | Telephone Carrier of contact                                | NO       | | preference        |              | Telephone Preference of contact                             | NO       | | email             | type         | Email Type of contact                                       | YES      | | email             | indx         | Email Indx of contact                                       | NO       | | address           |              | Email Address of contact                                    | NO       | | preference        |              | Email Preference of contact                                 | NO       | | im                | type         | IM type of contact                                          | YES      | | address           |              | IM address of contact                                       | NO       | | preference        |              | IM preference of contact                                    | NO       | | address           | type         | Address type of the contact                                 | YES      | | address           | indx         | Address indx of the contact                                 | NO       | | pobox             |              | Post box number of the address                              | NO       | | street            |              | Street Number of the address                                | NO       | | apartment         |              | Apartment Number of the address                             | NO       | | city              |              | City of the address                                         | NO       | | state             |              | State of the address                                        | NO       | | zipcode           |              | Zipcode of the address                                      | NO       | | country           |              | Country of the address                                      | NO       | | preference        |              | Preference of the address                                   | NO       | | webpage           | type         | Webpage Type of contact                                     | YES      | | webpage           | indx         | Webpage Indx of contact                                     | NO       | | url               |              | Webpage Url of contact                                      | NO       | | groups            |              | Groups Type of contact                                      | YES      | | groups            | group        | Group added to contact                                      | NO       | | group             | id           | Group Id                                                    | YES      | | group             | name         | Name of the group                                           | YES      | | group             | version      | Version of the group                                        | YES      | | group             | type         | Group Type                                                  | YES      | | extfield          | name         | Name of the extensible field                                | YES      | | extfield          | value        | Value of the extensible field                               | YES      | | DELETE-LINK       | contact      | contact link of share to be deleted                         | optional | | contact           | id           | id of the contact link to be deleted                        | optional | | contact           | tempid       | tempid of the contact link to be deleted                    | optional | | contact           | version      | version of the contact link to be deleted                   | optional |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdSharesShareIdAbContactsPutWithHttpInfo(String userId, String shareId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdSharesShareIdAbContactsPut");
        }
        
        // verify the required parameter 'shareId' is set
        if (shareId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shareId' when calling wsgPublicNabV1UserIdSharesShareIdAbContactsPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("shareId", shareId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/shares/{shareId}/ab/contacts", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Shares by share id members 34 not executed pending
     * This method is used for getting share members
     * <p><b>200</b> - Get Address Book response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param shareId  (required)
     * @param membershipStatus NOTE :   1. Following values are only given for \&quot;membership-status\&quot; parameter:   all   invited   member requested   rejected (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdSharesShareIdMembersGet(String userId, String shareId, String membershipStatus, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdSharesShareIdMembersGetWithHttpInfo(userId, shareId, membershipStatus, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get Shares by share id members 34 not executed pending
     * This method is used for getting share members
     * <p><b>200</b> - Get Address Book response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param shareId  (required)
     * @param membershipStatus NOTE :   1. Following values are only given for \&quot;membership-status\&quot; parameter:   all   invited   member requested   rejected (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdSharesShareIdMembersGetWithHttpInfo(String userId, String shareId, String membershipStatus, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdSharesShareIdMembersGet");
        }
        
        // verify the required parameter 'shareId' is set
        if (shareId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shareId' when calling wsgPublicNabV1UserIdSharesShareIdMembersGet");
        }
        
        // verify the required parameter 'membershipStatus' is set
        if (membershipStatus == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'membershipStatus' when calling wsgPublicNabV1UserIdSharesShareIdMembersGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("shareId", shareId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "membership-status", membershipStatus));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/shares/{shareId}/members", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Shares by share id members 35 not executed pending
     * This method is used for adding share members  NOTE: While sending share invite to members,If the invited User has hidden his account then such requests are not processed. This condition valid only to ICS users for now. 
     * <p><b>200</b> - Get Address Book response
     * <p><b>301</b> - Get Address Book response
     * <p><b>401</b> - Get Address Book response
     * <p><b>403</b> - Get Address Book response
     * <p><b>404</b> - Get Address Book response
     * <p><b>422</b> - Get Address Book response
     * <p><b>500</b> - Get Address Book response
     * @param userId  (required)
     * @param shareId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES        | DESCRIPTION                 | REQUIRED | |----------|-------------------|-----------------------------|----------| | ADD      | created           | created date of the member  | NO       | | ADD      | modified          | modified date of the member | NO       | | ADD      | contactid         | contactId of the member     | NO       | | ADD      | userid            | userId of the member        | YES      | | ADD      | membership-status | membership status           | NO       | | ADD      | access-rights     | access rights of the member | NO       |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdSharesShareIdMembersPost(String userId, String shareId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdSharesShareIdMembersPostWithHttpInfo(userId, shareId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Get Shares by share id members 35 not executed pending
     * This method is used for adding share members  NOTE: While sending share invite to members,If the invited User has hidden his account then such requests are not processed. This condition valid only to ICS users for now. 
     * <p><b>200</b> - Get Address Book response
     * <p><b>301</b> - Get Address Book response
     * <p><b>401</b> - Get Address Book response
     * <p><b>403</b> - Get Address Book response
     * <p><b>404</b> - Get Address Book response
     * <p><b>422</b> - Get Address Book response
     * <p><b>500</b> - Get Address Book response
     * @param userId  (required)
     * @param shareId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES        | DESCRIPTION                 | REQUIRED | |----------|-------------------|-----------------------------|----------| | ADD      | created           | created date of the member  | NO       | | ADD      | modified          | modified date of the member | NO       | | ADD      | contactid         | contactId of the member     | NO       | | ADD      | userid            | userId of the member        | YES      | | ADD      | membership-status | membership status           | NO       | | ADD      | access-rights     | access rights of the member | NO       |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdSharesShareIdMembersPostWithHttpInfo(String userId, String shareId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdSharesShareIdMembersPost");
        }
        
        // verify the required parameter 'shareId' is set
        if (shareId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shareId' when calling wsgPublicNabV1UserIdSharesShareIdMembersPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("shareId", shareId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/shares/{shareId}/members", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Put modify Shares by share id members 36 not executed pending
     * This method is used for modifying share members
     * <p><b>200</b> - Get Address Book response
     * <p><b>301</b> - Get Address Book response
     * <p><b>401</b> - Get Address Book response
     * <p><b>403</b> - Get Address Book response
     * <p><b>404</b> - Get Address Book response
     * <p><b>422</b> - Get Address Book response
     * <p><b>500</b> - Get Address Book response
     * @param userId  (required)
     * @param shareId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES        | DESCRIPTION                 | REQUIRED | |----------|-------------------|-----------------------------|----------| | DELETE   | created           | created date of the member  | NO       | | DELETE   | modified          | modified date of the member | NO       | | DELETE   | contactid         | contactId of the member     | NO       | | DELETE   | userid            | userId of the member        | YES      | | DELETE   | membership-status | membership status           | NO       | | DELETE   | access-rights     | access rights of the member | NO       | | MODIFY   | created           | created date of the member  | NO       | | MODIFY   | modified          | modified date of the member | NO       | | MODIFY   | contactid         | contactId of the member     | NO       | | MODIFY   | userid            | userId of the member        | YES      | | MODIFY   | membership-status | membership status           | NO       | | MODIFY   | access-rights     | access rights of the member | NO       |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdSharesShareIdMembersPut(String userId, String shareId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdSharesShareIdMembersPutWithHttpInfo(userId, shareId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Put modify Shares by share id members 36 not executed pending
     * This method is used for modifying share members
     * <p><b>200</b> - Get Address Book response
     * <p><b>301</b> - Get Address Book response
     * <p><b>401</b> - Get Address Book response
     * <p><b>403</b> - Get Address Book response
     * <p><b>404</b> - Get Address Book response
     * <p><b>422</b> - Get Address Book response
     * <p><b>500</b> - Get Address Book response
     * @param userId  (required)
     * @param shareId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS | ATTRIBUTES        | DESCRIPTION                 | REQUIRED | |----------|-------------------|-----------------------------|----------| | DELETE   | created           | created date of the member  | NO       | | DELETE   | modified          | modified date of the member | NO       | | DELETE   | contactid         | contactId of the member     | NO       | | DELETE   | userid            | userId of the member        | YES      | | DELETE   | membership-status | membership status           | NO       | | DELETE   | access-rights     | access rights of the member | NO       | | MODIFY   | created           | created date of the member  | NO       | | MODIFY   | modified          | modified date of the member | NO       | | MODIFY   | contactid         | contactId of the member     | NO       | | MODIFY   | userid            | userId of the member        | YES      | | MODIFY   | membership-status | membership status           | NO       | | MODIFY   | access-rights     | access rights of the member | NO       |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdSharesShareIdMembersPutWithHttpInfo(String userId, String shareId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdSharesShareIdMembersPut");
        }
        
        // verify the required parameter 'shareId' is set
        if (shareId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'shareId' when calling wsgPublicNabV1UserIdSharesShareIdMembersPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("shareId", shareId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/shares/{shareId}/members", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post create sync pending not executed 101
     * This method is used for triggering a sync for the endpoint of the user.  HTTP HEADER COOKIES This cookie may be obtained from the HTTP request headers. | COOKIE NAME | COOKIE VALUE                                 | |-------------|----------------------------------------------| | echo        | session tracking information from the client | 
     * <p><b>200</b> - sync operation response
     * <p><b>301</b> - sync operation response
     * <p><b>401</b> - sync operation response
     * <p><b>403</b> - sync operation response
     * <p><b>404</b> - sync operation response
     * <p><b>422</b> - sync operation response
     * <p><b>500</b> - sync operation response
     * @param userId  (required)
     * @param echo Contains the echo data recieved from the request (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS    | ATTRIBUTES   | DESCRIPTION                                       | REQUIRED | |-------------|--------------|---------------------------------------------------|----------| | triggersync | endpointtype | type of endpoint to be synced                     | YES      | | triggersync | endpointid   | id of endpoint to be synced                       | YES      | | triggersync | userid       | userid                                            | YES      | | triggersync | dataclass    | dataclasses for endpoints that needs to be synced | NO       |\&quot;  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdSyncPost(String userId, String echo, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdSyncPostWithHttpInfo(userId, echo, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Post create sync pending not executed 101
     * This method is used for triggering a sync for the endpoint of the user.  HTTP HEADER COOKIES This cookie may be obtained from the HTTP request headers. | COOKIE NAME | COOKIE VALUE                                 | |-------------|----------------------------------------------| | echo        | session tracking information from the client | 
     * <p><b>200</b> - sync operation response
     * <p><b>301</b> - sync operation response
     * <p><b>401</b> - sync operation response
     * <p><b>403</b> - sync operation response
     * <p><b>404</b> - sync operation response
     * <p><b>422</b> - sync operation response
     * <p><b>500</b> - sync operation response
     * @param userId  (required)
     * @param echo Contains the echo data recieved from the request (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS    | ATTRIBUTES   | DESCRIPTION                                       | REQUIRED | |-------------|--------------|---------------------------------------------------|----------| | triggersync | endpointtype | type of endpoint to be synced                     | YES      | | triggersync | endpointid   | id of endpoint to be synced                       | YES      | | triggersync | userid       | userid                                            | YES      | | triggersync | dataclass    | dataclasses for endpoints that needs to be synced | NO       |\&quot;  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdSyncPostWithHttpInfo(String userId, String echo, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdSyncPost");
        }
        
        // verify the required parameter 'echo' is set
        if (echo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'echo' when calling wsgPublicNabV1UserIdSyncPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("echo", echo);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/sync", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post create sync status pending not excecuted 94
     * This method is used for retrieving sync status for userId. It checks both middle-&gt;wsg and wsg-&gt;middle sync status.
     * <p><b>200</b> - This call allows user to add a sync for specific endpoints or all user endpoints(if syncAll attribute is &#39;true&#39;).  | ELEMENTS            |        DESCRIPTION                                                                                                                                                                 |        VALUES                                       | |---------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------| |        code         |        If  http status code is 200 then only   this response xml come with proper code and msg                                                                                     |        application status codes                     | |        msg          | If  http status code is 200 then only this   response xml come with proper code and msg                                                                                            |        message relevant to application status code  | |        applyChanges |        It defines whether middle-&gt;wsg is in-sync or not.It is false if   middle-&gt;wsg is in-sync otherwise true, means some changes there in middle   which are not applied to wsg. |        true/false                                   | |        dumpChanges  | It   defines whether wsg-&gt;middle is in-sync or not.It is false if   wsg-&gt;middle is in-sync otherwise true, means some changes there in wsg   which are not applied to middle.      |        true/false                                   | |        synced       | It   depends on applyChanges &amp; dumpChanges. If both are false then it is true   otherwise false.                                                                                   |        true/false                                   | 
     * <p><b>400</b> - sync status response
     * <p><b>401</b> - sync status response
     * <p><b>403</b> - sync status response
     * <p><b>404</b> - sync status response
     * <p><b>405</b> - sync status response
     * <p><b>409</b> - sync status response
     * <p><b>422</b> - sync status response
     * <p><b>500</b> - sync status response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdSyncStatusGet(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdSyncStatusGetWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Post create sync status pending not excecuted 94
     * This method is used for retrieving sync status for userId. It checks both middle-&gt;wsg and wsg-&gt;middle sync status.
     * <p><b>200</b> - This call allows user to add a sync for specific endpoints or all user endpoints(if syncAll attribute is &#39;true&#39;).  | ELEMENTS            |        DESCRIPTION                                                                                                                                                                 |        VALUES                                       | |---------------------|------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|-----------------------------------------------------| |        code         |        If  http status code is 200 then only   this response xml come with proper code and msg                                                                                     |        application status codes                     | |        msg          | If  http status code is 200 then only this   response xml come with proper code and msg                                                                                            |        message relevant to application status code  | |        applyChanges |        It defines whether middle-&gt;wsg is in-sync or not.It is false if   middle-&gt;wsg is in-sync otherwise true, means some changes there in middle   which are not applied to wsg. |        true/false                                   | |        dumpChanges  | It   defines whether wsg-&gt;middle is in-sync or not.It is false if   wsg-&gt;middle is in-sync otherwise true, means some changes there in wsg   which are not applied to middle.      |        true/false                                   | |        synced       | It   depends on applyChanges &amp; dumpChanges. If both are false then it is true   otherwise false.                                                                                   |        true/false                                   | 
     * <p><b>400</b> - sync status response
     * <p><b>401</b> - sync status response
     * <p><b>403</b> - sync status response
     * <p><b>404</b> - sync status response
     * <p><b>405</b> - sync status response
     * <p><b>409</b> - sync status response
     * <p><b>422</b> - sync status response
     * <p><b>500</b> - sync status response
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdSyncStatusGetWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdSyncStatusGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/syncStatus", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * get syncsessions userId not executed pending 99
     * This method is used for retrieving sync sessions for a user. All the active sync sessions for the user will be returned. Typically the last sync session will be seen for every endpoint.
     * <p><b>200</b> - syncsessions get response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdSyncsessionsGet(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdSyncsessionsGetWithHttpInfo(userId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * get syncsessions userId not executed pending 99
     * This method is used for retrieving sync sessions for a user. All the active sync sessions for the user will be returned. Typically the last sync session will be seen for every endpoint.
     * <p><b>200</b> - syncsessions get response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdSyncsessionsGetWithHttpInfo(String userId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdSyncsessionsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/syncsessions", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * post syncsessions userId not executed pending 100
     * This call allows user to add a sync for specific endpoints or all user endpoints(if syncAll attribute is &#39;true&#39;).  If a sync session is already in progress for the specified endpoint then the same sync session will be returned. New sync session will not be created for that endpoint. Applications can check for existing sync sessions using the GET api for the Sync Sessions. When the sync is completed the one single endpoint a &#39;On Demand Sync Completion&#39; notification is sent to the client. If sync is triggered for multiple or if &#39;syncall&#39; is specified to trigger sync on all devices then individual &#39;On Demand Sync Completion&#39; events will be generated for each endpoint. If &#39;syncall&#39; is triggered and user has 5 endpoints then 5 &#39;On Demand Sync Completion&#39; events will be generated , here when syncAll is true &#39;One time sync &#39; endpoints will be preventing from ondemand sync. User can specify dataclasses for trigger sync.  An echo is sent in the request parameter or as a cookie for insession notification and alerts. The echo is later sent to &#39;On Demand Sync Completion&#39; event.  HTTP HEADER COOKIES This cookie may be obtained from the HTTP request headers. | COOKIE NAME | COOKIE VALUE                                 | |-------------|----------------------------------------------| | echo        | session tracking information from the client | 
     * <p><b>200</b> - syncsessions add response
     * <p><b>301</b> - syncsessions add response
     * <p><b>401</b> - syncsessions add response
     * <p><b>403</b> - syncsessions add response
     * <p><b>404</b> - syncsessions add response
     * <p><b>422</b> - syncsessions add response
     * <p><b>500</b> - syncsessions add response
     * @param userId  (required)
     * @param echo Contains the echo data recieved from the request (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES specific to the operations performed | ELEMENTS                  | ATTRIBUTES   | DESCRIPTION                                                                                                      | REQUIRED | |---------------------------|--------------|------------------------------------------------------------------------------------------------------------------|----------| | syncsessions- add-request | syncall      | If syncall flag is true then sync session will get added to all user endpoints else only for specified endpoints | OPTIONAL | | syncsessions- add-request | endpoint     | list of endpoints to add sync                                                                                    | OPTIONAL | | endpoint                  | endpointtype | End point type                                                                                                   | YES      | | endpoint                  | endpointid   | End point id                                                                                                     | YES      | | endpoint                  | dataclass    | Data class for sync                                                                                              | OPTIONAL | | dataclass                 | id           | Data class name like &#39;CONT&#39;                                                                                      | YES      |    NOTIFICATIONS GENERATED | NOTIFICATION              | DESCRIPTION                           | |---------------------------|---------------------------------------| | ON DEMAND SYNC COMPLETION | Generated when the sync is completed. |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdSyncsessionsPost(String userId, String echo, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdSyncsessionsPostWithHttpInfo(userId, echo, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * post syncsessions userId not executed pending 100
     * This call allows user to add a sync for specific endpoints or all user endpoints(if syncAll attribute is &#39;true&#39;).  If a sync session is already in progress for the specified endpoint then the same sync session will be returned. New sync session will not be created for that endpoint. Applications can check for existing sync sessions using the GET api for the Sync Sessions. When the sync is completed the one single endpoint a &#39;On Demand Sync Completion&#39; notification is sent to the client. If sync is triggered for multiple or if &#39;syncall&#39; is specified to trigger sync on all devices then individual &#39;On Demand Sync Completion&#39; events will be generated for each endpoint. If &#39;syncall&#39; is triggered and user has 5 endpoints then 5 &#39;On Demand Sync Completion&#39; events will be generated , here when syncAll is true &#39;One time sync &#39; endpoints will be preventing from ondemand sync. User can specify dataclasses for trigger sync.  An echo is sent in the request parameter or as a cookie for insession notification and alerts. The echo is later sent to &#39;On Demand Sync Completion&#39; event.  HTTP HEADER COOKIES This cookie may be obtained from the HTTP request headers. | COOKIE NAME | COOKIE VALUE                                 | |-------------|----------------------------------------------| | echo        | session tracking information from the client | 
     * <p><b>200</b> - syncsessions add response
     * <p><b>301</b> - syncsessions add response
     * <p><b>401</b> - syncsessions add response
     * <p><b>403</b> - syncsessions add response
     * <p><b>404</b> - syncsessions add response
     * <p><b>422</b> - syncsessions add response
     * <p><b>500</b> - syncsessions add response
     * @param userId  (required)
     * @param echo Contains the echo data recieved from the request (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES The input should have the following ELEMENTS or ATTRIBUTES specific to the operations performed | ELEMENTS                  | ATTRIBUTES   | DESCRIPTION                                                                                                      | REQUIRED | |---------------------------|--------------|------------------------------------------------------------------------------------------------------------------|----------| | syncsessions- add-request | syncall      | If syncall flag is true then sync session will get added to all user endpoints else only for specified endpoints | OPTIONAL | | syncsessions- add-request | endpoint     | list of endpoints to add sync                                                                                    | OPTIONAL | | endpoint                  | endpointtype | End point type                                                                                                   | YES      | | endpoint                  | endpointid   | End point id                                                                                                     | YES      | | endpoint                  | dataclass    | Data class for sync                                                                                              | OPTIONAL | | dataclass                 | id           | Data class name like &#39;CONT&#39;                                                                                      | YES      |    NOTIFICATIONS GENERATED | NOTIFICATION              | DESCRIPTION                           | |---------------------------|---------------------------------------| | ON DEMAND SYNC COMPLETION | Generated when the sync is completed. |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdSyncsessionsPostWithHttpInfo(String userId, String echo, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdSyncsessionsPost");
        }
        
        // verify the required parameter 'echo' is set
        if (echo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'echo' when calling wsgPublicNabV1UserIdSyncsessionsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("echo", echo);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/syncsessions", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * get syncsessions syncSessionId not executed pending 98
     * This method is used for retrieving syncsession for userId and SyncSessionId.
     * <p><b>200</b> - syncsession get response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param syncSessionId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdSyncsessionsSyncSessionIdGet(String userId, String syncSessionId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV1UserIdSyncsessionsSyncSessionIdGetWithHttpInfo(userId, syncSessionId, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * get syncsessions syncSessionId not executed pending 98
     * This method is used for retrieving syncsession for userId and SyncSessionId.
     * <p><b>200</b> - syncsession get response
     * <p><b>301</b> - User is in Different PU
     * <p><b>400</b> - Bad Url Syntax
     * <p><b>401</b> - Authentication Failed
     * <p><b>403</b> - Authorization Failed
     * <p><b>404</b> - Resource Not Found
     * <p><b>405</b> - Method Not Found
     * <p><b>409</b> - Resource access Conflict
     * <p><b>422</b> - Bad Request Semantics
     * <p><b>500</b> - Internal Server Error
     * @param userId  (required)
     * @param syncSessionId  (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdSyncsessionsSyncSessionIdGetWithHttpInfo(String userId, String syncSessionId, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdSyncsessionsSyncSessionIdGet");
        }
        
        // verify the required parameter 'syncSessionId' is set
        if (syncSessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'syncSessionId' when calling wsgPublicNabV1UserIdSyncsessionsSyncSessionIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("syncSessionId", syncSessionId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/syncsessions/{syncSessionId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post create websessions pending not executed 95
     * This method is used for starting or ending a web session. If the user is connecting to Synchronoss system for the very first time, it is possible that Synchronoss system may have to populate the user data in to Web Services Gateway database. Since such a data transfer takes some time, a special success code HTTP 202 is sent back to client to indicate that a first time data transfer is in progress.  The client can then choose to wait for the data to be transferred to WSG and then go on to do a getContacts call. When the data is transferred a notification will be sent for the user to indicate that transfer is complete.  This allows clients to display a message to the user while data is being transferred.  If for some reason a data transfer fails then a failure notification is sent. This allows the client to display a error message to the user.  The start session call can be repeatedly called without any problem. As long as the user data is not transferred the success code will be 202. Once the data is transferred successfully, start session will always return HTTP 200.  This API allows you to start multiple web sessions with Synchronoss. Different sessions must have different session id. Each session started must be ended with the end session. A maximum of five sessions can be started. If a timeout is not specified in the start session command, a default timeout will be used. The default timeout is for an hour. A session can be renewed by starting it again. Since the sessions times out after the timeout the clients must make sure to return the timeouts.  Recycling of websessions is supported by an attribute in wsg called websessions.recycle. If this property is set to false then an error will be obtained once the maximum number of sessions is exceeded. If this property is set to true then the oldest session is replaced with the new session. 
     * <p><b>200</b> - websession operations response
     * <p><b>202</b> - websession operations response
     * <p><b>301</b> - websession operations response
     * <p><b>401</b> - websession operations response
     * <p><b>403</b> - websession operations response
     * <p><b>404</b> - websession operations response
     * <p><b>422</b> - websession operations response
     * <p><b>500</b> - websession operations response
     * @param userId  (required)
     * @param echo Contains the echo data recieved from the request (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS  | ATTRIBUTES | DESCRIPTION                      | REQUIRED | |-----------|------------|----------------------------------|----------| | operation | sessionid  | Session Id of websession         | OPTIONAL | | operation | timeout    | Timeout of websession in seconds | OPTIONAL | | operation | command    | Websession command start/end     | YES      |  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV1UserIdWebsessionsPost(String userId, String echo, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        return wsgPublicNabV1UserIdWebsessionsPostWithHttpInfo(userId, echo, xF1ClientAuthorization, authorizationDomain, contentType, xClientSNCRPlatform, authorization, body).getBody();
    }

    /**
     * Post create websessions pending not executed 95
     * This method is used for starting or ending a web session. If the user is connecting to Synchronoss system for the very first time, it is possible that Synchronoss system may have to populate the user data in to Web Services Gateway database. Since such a data transfer takes some time, a special success code HTTP 202 is sent back to client to indicate that a first time data transfer is in progress.  The client can then choose to wait for the data to be transferred to WSG and then go on to do a getContacts call. When the data is transferred a notification will be sent for the user to indicate that transfer is complete.  This allows clients to display a message to the user while data is being transferred.  If for some reason a data transfer fails then a failure notification is sent. This allows the client to display a error message to the user.  The start session call can be repeatedly called without any problem. As long as the user data is not transferred the success code will be 202. Once the data is transferred successfully, start session will always return HTTP 200.  This API allows you to start multiple web sessions with Synchronoss. Different sessions must have different session id. Each session started must be ended with the end session. A maximum of five sessions can be started. If a timeout is not specified in the start session command, a default timeout will be used. The default timeout is for an hour. A session can be renewed by starting it again. Since the sessions times out after the timeout the clients must make sure to return the timeouts.  Recycling of websessions is supported by an attribute in wsg called websessions.recycle. If this property is set to false then an error will be obtained once the maximum number of sessions is exceeded. If this property is set to true then the oldest session is replaced with the new session. 
     * <p><b>200</b> - websession operations response
     * <p><b>202</b> - websession operations response
     * <p><b>301</b> - websession operations response
     * <p><b>401</b> - websession operations response
     * <p><b>403</b> - websession operations response
     * <p><b>404</b> - websession operations response
     * <p><b>422</b> - websession operations response
     * <p><b>500</b> - websession operations response
     * @param userId  (required)
     * @param echo Contains the echo data recieved from the request (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param contentType  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @param body INPUT ELEMENTS AND ATTRIBUTES  The input should have the following ELEMENTS or ATTRIBUTES | ELEMENTS  | ATTRIBUTES | DESCRIPTION                      | REQUIRED | |-----------|------------|----------------------------------|----------| | operation | sessionid  | Session Id of websession         | OPTIONAL | | operation | timeout    | Timeout of websession in seconds | OPTIONAL | | operation | command    | Websession command start/end     | YES      |  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV1UserIdWebsessionsPostWithHttpInfo(String userId, String echo, String xF1ClientAuthorization, String authorizationDomain, String contentType, String xClientSNCRPlatform, String authorization, Object body) throws RestClientException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV1UserIdWebsessionsPost");
        }
        
        // verify the required parameter 'echo' is set
        if (echo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'echo' when calling wsgPublicNabV1UserIdWebsessionsPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);
        uriVariables.put("echo", echo);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (contentType != null)
        localVarHeaderParams.add("Content-Type", apiClient.parameterToString(contentType));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v1/{userId}/websessions", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Account Tokens 12 pending
     * Get account tokens Version3 api will return the addressType and lcid along with the tokens .This address type will be used to identify the type of user and this will used for further server calls.   AUTHORIZATION DOMAIN    Request with vzw.portal.sso domain will authorize user with SAM server . Request with vzt.portal.sso domain will authorize user with VZT auth server . Request with vz.domain will authorize the user with SAM sever first , if it fails then it will authorize against VZT auth server.
     * <p><b>200</b> - Get Account tokens 200 response
     * <p><b>301</b> - Get Account tokens 301 response
     * <p><b>401</b> - Get Account tokens 401 response
     * <p><b>403</b> - Get Account tokens 403 response
     * <p><b>422</b> - Get Account tokens 422 response
     * <p><b>500</b> - Get Account tokens 500 response
     * @param userId  (required)
     * @param timestamp The timestamp is the timestamp generated by the client in GMT and should approximately match the server time in GMT A variation of 10 minutes is okay (required)
     * @param signature Client will send signature which will match against server generated signature if matches then get tokens resoponse will be returned else error . (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object wsgPublicNabV3UserIdAccountTokensGet(String userId, String timestamp, String signature, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        return wsgPublicNabV3UserIdAccountTokensGetWithHttpInfo(userId, timestamp, signature, xF1ClientAuthorization, authorizationDomain, content, xClientSNCRPlatform, authorization).getBody();
    }

    /**
     * Get Account Tokens 12 pending
     * Get account tokens Version3 api will return the addressType and lcid along with the tokens .This address type will be used to identify the type of user and this will used for further server calls.   AUTHORIZATION DOMAIN    Request with vzw.portal.sso domain will authorize user with SAM server . Request with vzt.portal.sso domain will authorize user with VZT auth server . Request with vz.domain will authorize the user with SAM sever first , if it fails then it will authorize against VZT auth server.
     * <p><b>200</b> - Get Account tokens 200 response
     * <p><b>301</b> - Get Account tokens 301 response
     * <p><b>401</b> - Get Account tokens 401 response
     * <p><b>403</b> - Get Account tokens 403 response
     * <p><b>422</b> - Get Account tokens 422 response
     * <p><b>500</b> - Get Account tokens 500 response
     * @param userId  (required)
     * @param timestamp The timestamp is the timestamp generated by the client in GMT and should approximately match the server time in GMT A variation of 10 minutes is okay (required)
     * @param signature Client will send signature which will match against server generated signature if matches then get tokens resoponse will be returned else error . (required)
     * @param xF1ClientAuthorization  (optional)
     * @param authorizationDomain  (optional)
     * @param content  (optional)
     * @param xClientSNCRPlatform  (optional)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> wsgPublicNabV3UserIdAccountTokensGetWithHttpInfo(String userId, String timestamp, String signature, String xF1ClientAuthorization, String authorizationDomain, String content, String xClientSNCRPlatform, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling wsgPublicNabV3UserIdAccountTokensGet");
        }
        
        // verify the required parameter 'timestamp' is set
        if (timestamp == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'timestamp' when calling wsgPublicNabV3UserIdAccountTokensGet");
        }
        
        // verify the required parameter 'signature' is set
        if (signature == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'signature' when calling wsgPublicNabV3UserIdAccountTokensGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "timestamp", timestamp));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "signature", signature));
        

        if (xF1ClientAuthorization != null)
        localVarHeaderParams.add("X-F1-Client-Authorization", apiClient.parameterToString(xF1ClientAuthorization));
        if (authorizationDomain != null)
        localVarHeaderParams.add("Authorization-domain", apiClient.parameterToString(authorizationDomain));
        if (content != null)
        localVarHeaderParams.add("Content", apiClient.parameterToString(content));
        if (xClientSNCRPlatform != null)
        localVarHeaderParams.add("X-Client-SNCR-Platform", apiClient.parameterToString(xClientSNCRPlatform));
        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "tokenAuth" };

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/wsg/public/nab/v3/{userId}/account/tokens", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
