package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodAPIGetMatomoVersionPostRequest;
import org.openapitools.client.model.IndexPhpMethodAPIGetReportPagesMetadataPostRequest;
import org.openapitools.client.model.IndexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest;
import org.openapitools.client.model.IndexPhpMethodUsersManagerAddCapabilitiesPostRequest;
import org.openapitools.client.model.IndexPhpMethodUsersManagerAddUserPostRequest;
import org.openapitools.client.model.IndexPhpMethodUsersManagerCreateAppSpecificTokenAuthPostRequest;
import org.openapitools.client.model.IndexPhpMethodUsersManagerGetSitesAccessForUserPostRequest;
import org.openapitools.client.model.IndexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest;
import org.openapitools.client.model.IndexPhpMethodUsersManagerGetUserByEmailPostRequest;
import org.openapitools.client.model.IndexPhpMethodUsersManagerGetUserPreferencePostRequest;
import org.openapitools.client.model.IndexPhpMethodUsersManagerGetUsersPlusRolePostRequest;
import org.openapitools.client.model.IndexPhpMethodUsersManagerGetUsersPostRequest;
import org.openapitools.client.model.IndexPhpMethodUsersManagerGetUsersSitesFromAccessPostRequest;
import org.openapitools.client.model.IndexPhpMethodUsersManagerGetUsersWithSiteAccessPostRequest;
import org.openapitools.client.model.IndexPhpMethodUsersManagerInviteUserPostRequest;
import org.openapitools.client.model.IndexPhpMethodUsersManagerResendInvitePostRequest;
import org.openapitools.client.model.IndexPhpMethodUsersManagerSetSuperUserAccessPostRequest;
import org.openapitools.client.model.IndexPhpMethodUsersManagerSetUserAccessPostRequest;
import org.openapitools.client.model.IndexPhpMethodUsersManagerSetUserPreferencePostRequest;
import org.openapitools.client.model.IndexPhpMethodUsersManagerUpdateUserPostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:01.495468819Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UsersManagerApi {
    private ApiClient apiClient;

    public UsersManagerApi() {
        this(new ApiClient());
    }

    public UsersManagerApi(ApiClient apiClient) {
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
     * 
     * @param indexPhpMethodUsersManagerAddCapabilitiesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerAddCapabilitiesPost(IndexPhpMethodUsersManagerAddCapabilitiesPostRequest indexPhpMethodUsersManagerAddCapabilitiesPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerAddCapabilitiesPostWithHttpInfo(indexPhpMethodUsersManagerAddCapabilitiesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerAddCapabilitiesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerAddCapabilitiesPostWithHttpInfo(IndexPhpMethodUsersManagerAddCapabilitiesPostRequest indexPhpMethodUsersManagerAddCapabilitiesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerAddCapabilitiesPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.addCapabilities", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerAddUserPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerAddUserPost(IndexPhpMethodUsersManagerAddUserPostRequest indexPhpMethodUsersManagerAddUserPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerAddUserPostWithHttpInfo(indexPhpMethodUsersManagerAddUserPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerAddUserPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerAddUserPostWithHttpInfo(IndexPhpMethodUsersManagerAddUserPostRequest indexPhpMethodUsersManagerAddUserPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerAddUserPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.addUser", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerCreateAppSpecificTokenAuthPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerCreateAppSpecificTokenAuthPost(IndexPhpMethodUsersManagerCreateAppSpecificTokenAuthPostRequest indexPhpMethodUsersManagerCreateAppSpecificTokenAuthPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerCreateAppSpecificTokenAuthPostWithHttpInfo(indexPhpMethodUsersManagerCreateAppSpecificTokenAuthPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerCreateAppSpecificTokenAuthPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerCreateAppSpecificTokenAuthPostWithHttpInfo(IndexPhpMethodUsersManagerCreateAppSpecificTokenAuthPostRequest indexPhpMethodUsersManagerCreateAppSpecificTokenAuthPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerCreateAppSpecificTokenAuthPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.createAppSpecificTokenAuth", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerDeleteUserPost(IndexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest indexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerDeleteUserPostWithHttpInfo(indexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerDeleteUserPostWithHttpInfo(IndexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest indexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTwoFactorAuthResetTwoFactorAuthPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.deleteUser", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerResendInvitePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerGenerateInviteLinkPost(IndexPhpMethodUsersManagerResendInvitePostRequest indexPhpMethodUsersManagerResendInvitePostRequest) throws RestClientException {
        indexPhpmethodUsersManagerGenerateInviteLinkPostWithHttpInfo(indexPhpMethodUsersManagerResendInvitePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerResendInvitePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerGenerateInviteLinkPostWithHttpInfo(IndexPhpMethodUsersManagerResendInvitePostRequest indexPhpMethodUsersManagerResendInvitePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerResendInvitePostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.generateInviteLink", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerGetAvailableCapabilitiesPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerGetAvailableCapabilitiesPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerGetAvailableCapabilitiesPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAPIGetMatomoVersionPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.getAvailableCapabilities", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerGetAvailableRolesPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerGetAvailableRolesPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerGetAvailableRolesPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAPIGetMatomoVersionPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.getAvailableRoles", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetSitesAccessForUserPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerGetSitesAccessForUserPost(IndexPhpMethodUsersManagerGetSitesAccessForUserPostRequest indexPhpMethodUsersManagerGetSitesAccessForUserPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerGetSitesAccessForUserPostWithHttpInfo(indexPhpMethodUsersManagerGetSitesAccessForUserPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetSitesAccessForUserPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerGetSitesAccessForUserPostWithHttpInfo(IndexPhpMethodUsersManagerGetSitesAccessForUserPostRequest indexPhpMethodUsersManagerGetSitesAccessForUserPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerGetSitesAccessForUserPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.getSitesAccessForUser", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerGetSitesAccessFromUserPost(IndexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerGetSitesAccessFromUserPostWithHttpInfo(indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerGetSitesAccessFromUserPostWithHttpInfo(IndexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.getSitesAccessFromUser", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetUserByEmailPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerGetUserByEmailPost(IndexPhpMethodUsersManagerGetUserByEmailPostRequest indexPhpMethodUsersManagerGetUserByEmailPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerGetUserByEmailPostWithHttpInfo(indexPhpMethodUsersManagerGetUserByEmailPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetUserByEmailPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerGetUserByEmailPostWithHttpInfo(IndexPhpMethodUsersManagerGetUserByEmailPostRequest indexPhpMethodUsersManagerGetUserByEmailPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerGetUserByEmailPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.getUserByEmail", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetUserByEmailPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerGetUserLoginFromUserEmailPost(IndexPhpMethodUsersManagerGetUserByEmailPostRequest indexPhpMethodUsersManagerGetUserByEmailPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerGetUserLoginFromUserEmailPostWithHttpInfo(indexPhpMethodUsersManagerGetUserByEmailPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetUserByEmailPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerGetUserLoginFromUserEmailPostWithHttpInfo(IndexPhpMethodUsersManagerGetUserByEmailPostRequest indexPhpMethodUsersManagerGetUserByEmailPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerGetUserByEmailPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.getUserLoginFromUserEmail", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerGetUserPost(IndexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerGetUserPostWithHttpInfo(indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerGetUserPostWithHttpInfo(IndexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.getUser", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetUserPreferencePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerGetUserPreferencePost(IndexPhpMethodUsersManagerGetUserPreferencePostRequest indexPhpMethodUsersManagerGetUserPreferencePostRequest) throws RestClientException {
        indexPhpmethodUsersManagerGetUserPreferencePostWithHttpInfo(indexPhpMethodUsersManagerGetUserPreferencePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetUserPreferencePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerGetUserPreferencePostWithHttpInfo(IndexPhpMethodUsersManagerGetUserPreferencePostRequest indexPhpMethodUsersManagerGetUserPreferencePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerGetUserPreferencePostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.getUserPreference", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerGetUsersAccessFromSitePost(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerGetUsersAccessFromSitePostWithHttpInfo(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerGetUsersAccessFromSitePostWithHttpInfo(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAPIGetReportPagesMetadataPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.getUsersAccessFromSite", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerGetUsersHavingSuperUserAccessPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerGetUsersHavingSuperUserAccessPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerGetUsersHavingSuperUserAccessPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAPIGetMatomoVersionPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.getUsersHavingSuperUserAccess", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerGetUsersLoginPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerGetUsersLoginPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerGetUsersLoginPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAPIGetMatomoVersionPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.getUsersLogin", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetUsersPlusRolePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerGetUsersPlusRolePost(IndexPhpMethodUsersManagerGetUsersPlusRolePostRequest indexPhpMethodUsersManagerGetUsersPlusRolePostRequest) throws RestClientException {
        indexPhpmethodUsersManagerGetUsersPlusRolePostWithHttpInfo(indexPhpMethodUsersManagerGetUsersPlusRolePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetUsersPlusRolePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerGetUsersPlusRolePostWithHttpInfo(IndexPhpMethodUsersManagerGetUsersPlusRolePostRequest indexPhpMethodUsersManagerGetUsersPlusRolePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerGetUsersPlusRolePostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.getUsersPlusRole", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetUsersPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerGetUsersPost(IndexPhpMethodUsersManagerGetUsersPostRequest indexPhpMethodUsersManagerGetUsersPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerGetUsersPostWithHttpInfo(indexPhpMethodUsersManagerGetUsersPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetUsersPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerGetUsersPostWithHttpInfo(IndexPhpMethodUsersManagerGetUsersPostRequest indexPhpMethodUsersManagerGetUsersPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerGetUsersPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.getUsers", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetUsersSitesFromAccessPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerGetUsersSitesFromAccessPost(IndexPhpMethodUsersManagerGetUsersSitesFromAccessPostRequest indexPhpMethodUsersManagerGetUsersSitesFromAccessPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerGetUsersSitesFromAccessPostWithHttpInfo(indexPhpMethodUsersManagerGetUsersSitesFromAccessPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetUsersSitesFromAccessPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerGetUsersSitesFromAccessPostWithHttpInfo(IndexPhpMethodUsersManagerGetUsersSitesFromAccessPostRequest indexPhpMethodUsersManagerGetUsersSitesFromAccessPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerGetUsersSitesFromAccessPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.getUsersSitesFromAccess", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetUsersWithSiteAccessPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerGetUsersWithSiteAccessPost(IndexPhpMethodUsersManagerGetUsersWithSiteAccessPostRequest indexPhpMethodUsersManagerGetUsersWithSiteAccessPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerGetUsersWithSiteAccessPostWithHttpInfo(indexPhpMethodUsersManagerGetUsersWithSiteAccessPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetUsersWithSiteAccessPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerGetUsersWithSiteAccessPostWithHttpInfo(IndexPhpMethodUsersManagerGetUsersWithSiteAccessPostRequest indexPhpMethodUsersManagerGetUsersWithSiteAccessPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerGetUsersWithSiteAccessPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.getUsersWithSiteAccess", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerHasSuperUserAccessPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerHasSuperUserAccessPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerHasSuperUserAccessPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAPIGetMatomoVersionPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.hasSuperUserAccess", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerInviteUserPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerInviteUserPost(IndexPhpMethodUsersManagerInviteUserPostRequest indexPhpMethodUsersManagerInviteUserPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerInviteUserPostWithHttpInfo(indexPhpMethodUsersManagerInviteUserPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerInviteUserPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerInviteUserPostWithHttpInfo(IndexPhpMethodUsersManagerInviteUserPostRequest indexPhpMethodUsersManagerInviteUserPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerInviteUserPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.inviteUser", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerNewsletterSignupPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerNewsletterSignupPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerNewsletterSignupPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAPIGetMatomoVersionPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.newsletterSignup", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerAddCapabilitiesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerRemoveCapabilitiesPost(IndexPhpMethodUsersManagerAddCapabilitiesPostRequest indexPhpMethodUsersManagerAddCapabilitiesPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerRemoveCapabilitiesPostWithHttpInfo(indexPhpMethodUsersManagerAddCapabilitiesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerAddCapabilitiesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerRemoveCapabilitiesPostWithHttpInfo(IndexPhpMethodUsersManagerAddCapabilitiesPostRequest indexPhpMethodUsersManagerAddCapabilitiesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerAddCapabilitiesPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.removeCapabilities", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerResendInvitePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerResendInvitePost(IndexPhpMethodUsersManagerResendInvitePostRequest indexPhpMethodUsersManagerResendInvitePostRequest) throws RestClientException {
        indexPhpmethodUsersManagerResendInvitePostWithHttpInfo(indexPhpMethodUsersManagerResendInvitePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerResendInvitePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerResendInvitePostWithHttpInfo(IndexPhpMethodUsersManagerResendInvitePostRequest indexPhpMethodUsersManagerResendInvitePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerResendInvitePostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.resendInvite", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerSetSuperUserAccessPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerSetSuperUserAccessPost(IndexPhpMethodUsersManagerSetSuperUserAccessPostRequest indexPhpMethodUsersManagerSetSuperUserAccessPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerSetSuperUserAccessPostWithHttpInfo(indexPhpMethodUsersManagerSetSuperUserAccessPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerSetSuperUserAccessPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerSetSuperUserAccessPostWithHttpInfo(IndexPhpMethodUsersManagerSetSuperUserAccessPostRequest indexPhpMethodUsersManagerSetSuperUserAccessPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerSetSuperUserAccessPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.setSuperUserAccess", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerSetUserAccessPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerSetUserAccessPost(IndexPhpMethodUsersManagerSetUserAccessPostRequest indexPhpMethodUsersManagerSetUserAccessPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerSetUserAccessPostWithHttpInfo(indexPhpMethodUsersManagerSetUserAccessPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerSetUserAccessPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerSetUserAccessPostWithHttpInfo(IndexPhpMethodUsersManagerSetUserAccessPostRequest indexPhpMethodUsersManagerSetUserAccessPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerSetUserAccessPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.setUserAccess", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerSetUserPreferencePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerSetUserPreferencePost(IndexPhpMethodUsersManagerSetUserPreferencePostRequest indexPhpMethodUsersManagerSetUserPreferencePostRequest) throws RestClientException {
        indexPhpmethodUsersManagerSetUserPreferencePostWithHttpInfo(indexPhpMethodUsersManagerSetUserPreferencePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerSetUserPreferencePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerSetUserPreferencePostWithHttpInfo(IndexPhpMethodUsersManagerSetUserPreferencePostRequest indexPhpMethodUsersManagerSetUserPreferencePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerSetUserPreferencePostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.setUserPreference", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerUpdateUserPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerUpdateUserPost(IndexPhpMethodUsersManagerUpdateUserPostRequest indexPhpMethodUsersManagerUpdateUserPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerUpdateUserPostWithHttpInfo(indexPhpMethodUsersManagerUpdateUserPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerUpdateUserPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerUpdateUserPostWithHttpInfo(IndexPhpMethodUsersManagerUpdateUserPostRequest indexPhpMethodUsersManagerUpdateUserPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerUpdateUserPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.updateUser", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetUserByEmailPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerUserEmailExistsPost(IndexPhpMethodUsersManagerGetUserByEmailPostRequest indexPhpMethodUsersManagerGetUserByEmailPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerUserEmailExistsPostWithHttpInfo(indexPhpMethodUsersManagerGetUserByEmailPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetUserByEmailPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerUserEmailExistsPostWithHttpInfo(IndexPhpMethodUsersManagerGetUserByEmailPostRequest indexPhpMethodUsersManagerGetUserByEmailPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerGetUserByEmailPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.userEmailExists", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodUsersManagerUserExistsPost(IndexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest) throws RestClientException {
        indexPhpmethodUsersManagerUserExistsPostWithHttpInfo(indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodUsersManagerUserExistsPostWithHttpInfo(IndexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodUsersManagerGetSitesAccessFromUserPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "TokenAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/index.php?method=UsersManager.userExists", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
