package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodAPIGetMatomoVersionPostRequest;
import org.openapitools.client.model.IndexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest;
import org.openapitools.client.model.IndexPhpMethodLanguagesManagerGetLanguageForUserPostRequest;
import org.openapitools.client.model.IndexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest;
import org.openapitools.client.model.IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest;
import org.openapitools.client.model.IndexPhpMethodLanguagesManagerSetLanguageForUserPostRequest;

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
public class LanguagesManagerApi {
    private ApiClient apiClient;

    public LanguagesManagerApi() {
        this(new ApiClient());
    }

    public LanguagesManagerApi(ApiClient apiClient) {
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
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodLanguagesManagerGetAvailableLanguageNamesPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodLanguagesManagerGetAvailableLanguageNamesPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodLanguagesManagerGetAvailableLanguageNamesPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=LanguagesManager.getAvailableLanguageNames", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodLanguagesManagerGetAvailableLanguagesInfoPost(IndexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest indexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest) throws RestClientException {
        indexPhpmethodLanguagesManagerGetAvailableLanguagesInfoPostWithHttpInfo(indexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodLanguagesManagerGetAvailableLanguagesInfoPostWithHttpInfo(IndexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest indexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodLanguagesManagerGetAvailableLanguagesInfoPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=LanguagesManager.getAvailableLanguagesInfo", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodLanguagesManagerGetAvailableLanguagesPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodLanguagesManagerGetAvailableLanguagesPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodLanguagesManagerGetAvailableLanguagesPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=LanguagesManager.getAvailableLanguages", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodLanguagesManagerGetLanguageForUserPost(IndexPhpMethodLanguagesManagerGetLanguageForUserPostRequest indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest) throws RestClientException {
        indexPhpmethodLanguagesManagerGetLanguageForUserPostWithHttpInfo(indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodLanguagesManagerGetLanguageForUserPostWithHttpInfo(IndexPhpMethodLanguagesManagerGetLanguageForUserPostRequest indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=LanguagesManager.getLanguageForUser", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodLanguagesManagerGetTranslationsForLanguagePost(IndexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest) throws RestClientException {
        indexPhpmethodLanguagesManagerGetTranslationsForLanguagePostWithHttpInfo(indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodLanguagesManagerGetTranslationsForLanguagePostWithHttpInfo(IndexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=LanguagesManager.getTranslationsForLanguage", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodLanguagesManagerIsLanguageAvailablePost(IndexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest) throws RestClientException {
        indexPhpmethodLanguagesManagerIsLanguageAvailablePostWithHttpInfo(indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodLanguagesManagerIsLanguageAvailablePostWithHttpInfo(IndexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodLanguagesManagerIsLanguageAvailablePostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=LanguagesManager.isLanguageAvailable", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodLanguagesManagerSet12HourClockForUserPost(IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest indexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest) throws RestClientException {
        indexPhpmethodLanguagesManagerSet12HourClockForUserPostWithHttpInfo(indexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodLanguagesManagerSet12HourClockForUserPostWithHttpInfo(IndexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest indexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodLanguagesManagerSet12HourClockForUserPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=LanguagesManager.set12HourClockForUser", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodLanguagesManagerSetLanguageForUserPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodLanguagesManagerSetLanguageForUserPost(IndexPhpMethodLanguagesManagerSetLanguageForUserPostRequest indexPhpMethodLanguagesManagerSetLanguageForUserPostRequest) throws RestClientException {
        indexPhpmethodLanguagesManagerSetLanguageForUserPostWithHttpInfo(indexPhpMethodLanguagesManagerSetLanguageForUserPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodLanguagesManagerSetLanguageForUserPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodLanguagesManagerSetLanguageForUserPostWithHttpInfo(IndexPhpMethodLanguagesManagerSetLanguageForUserPostRequest indexPhpMethodLanguagesManagerSetLanguageForUserPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodLanguagesManagerSetLanguageForUserPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=LanguagesManager.setLanguageForUser", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodLanguagesManagerUses12HourClockForUserPost(IndexPhpMethodLanguagesManagerGetLanguageForUserPostRequest indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest) throws RestClientException {
        indexPhpmethodLanguagesManagerUses12HourClockForUserPostWithHttpInfo(indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodLanguagesManagerUses12HourClockForUserPostWithHttpInfo(IndexPhpMethodLanguagesManagerGetLanguageForUserPostRequest indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodLanguagesManagerGetLanguageForUserPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=LanguagesManager.uses12HourClockForUser", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
