package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodAPIGetMatomoVersionPostRequest;
import org.openapitools.client.model.IndexPhpMethodMobileMessagingAddPhoneNumberPostRequest;
import org.openapitools.client.model.IndexPhpMethodMobileMessagingSetDelegatedManagementPostRequest;
import org.openapitools.client.model.IndexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest;
import org.openapitools.client.model.IndexPhpMethodMobileMessagingValidatePhoneNumberPostRequest;

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
public class MobileMessagingApi {
    private ApiClient apiClient;

    public MobileMessagingApi() {
        this(new ApiClient());
    }

    public MobileMessagingApi(ApiClient apiClient) {
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
     * @param indexPhpMethodMobileMessagingAddPhoneNumberPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMobileMessagingAddPhoneNumberPost(IndexPhpMethodMobileMessagingAddPhoneNumberPostRequest indexPhpMethodMobileMessagingAddPhoneNumberPostRequest) throws RestClientException {
        indexPhpmethodMobileMessagingAddPhoneNumberPostWithHttpInfo(indexPhpMethodMobileMessagingAddPhoneNumberPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodMobileMessagingAddPhoneNumberPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMobileMessagingAddPhoneNumberPostWithHttpInfo(IndexPhpMethodMobileMessagingAddPhoneNumberPostRequest indexPhpMethodMobileMessagingAddPhoneNumberPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodMobileMessagingAddPhoneNumberPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=MobileMessaging.addPhoneNumber", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMobileMessagingAreSMSAPICredentialProvidedPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodMobileMessagingAreSMSAPICredentialProvidedPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMobileMessagingAreSMSAPICredentialProvidedPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=MobileMessaging.areSMSAPICredentialProvided", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMobileMessagingDeleteSMSAPICredentialPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodMobileMessagingDeleteSMSAPICredentialPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMobileMessagingDeleteSMSAPICredentialPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=MobileMessaging.deleteSMSAPICredential", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMobileMessagingGetCreditLeftPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodMobileMessagingGetCreditLeftPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMobileMessagingGetCreditLeftPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=MobileMessaging.getCreditLeft", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMobileMessagingGetDelegatedManagementPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodMobileMessagingGetDelegatedManagementPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMobileMessagingGetDelegatedManagementPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=MobileMessaging.getDelegatedManagement", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMobileMessagingGetSMSProviderPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodMobileMessagingGetSMSProviderPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMobileMessagingGetSMSProviderPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=MobileMessaging.getSMSProvider", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodMobileMessagingAddPhoneNumberPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMobileMessagingRemovePhoneNumberPost(IndexPhpMethodMobileMessagingAddPhoneNumberPostRequest indexPhpMethodMobileMessagingAddPhoneNumberPostRequest) throws RestClientException {
        indexPhpmethodMobileMessagingRemovePhoneNumberPostWithHttpInfo(indexPhpMethodMobileMessagingAddPhoneNumberPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodMobileMessagingAddPhoneNumberPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMobileMessagingRemovePhoneNumberPostWithHttpInfo(IndexPhpMethodMobileMessagingAddPhoneNumberPostRequest indexPhpMethodMobileMessagingAddPhoneNumberPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodMobileMessagingAddPhoneNumberPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=MobileMessaging.removePhoneNumber", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodMobileMessagingSetDelegatedManagementPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMobileMessagingSetDelegatedManagementPost(IndexPhpMethodMobileMessagingSetDelegatedManagementPostRequest indexPhpMethodMobileMessagingSetDelegatedManagementPostRequest) throws RestClientException {
        indexPhpmethodMobileMessagingSetDelegatedManagementPostWithHttpInfo(indexPhpMethodMobileMessagingSetDelegatedManagementPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodMobileMessagingSetDelegatedManagementPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMobileMessagingSetDelegatedManagementPostWithHttpInfo(IndexPhpMethodMobileMessagingSetDelegatedManagementPostRequest indexPhpMethodMobileMessagingSetDelegatedManagementPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodMobileMessagingSetDelegatedManagementPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=MobileMessaging.setDelegatedManagement", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMobileMessagingSetSMSAPICredentialPost(IndexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest indexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest) throws RestClientException {
        indexPhpmethodMobileMessagingSetSMSAPICredentialPostWithHttpInfo(indexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMobileMessagingSetSMSAPICredentialPostWithHttpInfo(IndexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest indexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=MobileMessaging.setSMSAPICredential", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodMobileMessagingValidatePhoneNumberPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodMobileMessagingValidatePhoneNumberPost(IndexPhpMethodMobileMessagingValidatePhoneNumberPostRequest indexPhpMethodMobileMessagingValidatePhoneNumberPostRequest) throws RestClientException {
        indexPhpmethodMobileMessagingValidatePhoneNumberPostWithHttpInfo(indexPhpMethodMobileMessagingValidatePhoneNumberPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodMobileMessagingValidatePhoneNumberPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodMobileMessagingValidatePhoneNumberPostWithHttpInfo(IndexPhpMethodMobileMessagingValidatePhoneNumberPostRequest indexPhpMethodMobileMessagingValidatePhoneNumberPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodMobileMessagingValidatePhoneNumberPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=MobileMessaging.validatePhoneNumber", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
