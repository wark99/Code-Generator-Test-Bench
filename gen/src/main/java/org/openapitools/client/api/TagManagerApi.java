package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodAPIGetMatomoVersionPostRequest;
import org.openapitools.client.model.IndexPhpMethodAPIGetReportPagesMetadataPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerAddContainerPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerAddContainerTagPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerAddContainerTriggerPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerAddContainerVariablePostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerChangeDebugUrlPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerCreateContainerVersionPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerDeleteContainerTagPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerGetContainerEmbedCodePostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerGetContainerInstallInstructionsPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerGetContainerTagsPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerGetContainerVariableReferencesPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerGetContainerVersionsPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerImportContainerVersionPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerPublishContainerVersionPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerUpdateContainerPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerUpdateContainerTagPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerUpdateContainerTriggerPostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerUpdateContainerVariablePostRequest;
import org.openapitools.client.model.IndexPhpMethodTagManagerUpdateContainerVersionPostRequest;

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
public class TagManagerApi {
    private ApiClient apiClient;

    public TagManagerApi() {
        this(new ApiClient());
    }

    public TagManagerApi(ApiClient apiClient) {
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
     * @param indexPhpMethodTagManagerAddContainerPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerAddContainerPost(IndexPhpMethodTagManagerAddContainerPostRequest indexPhpMethodTagManagerAddContainerPostRequest) throws RestClientException {
        indexPhpmethodTagManagerAddContainerPostWithHttpInfo(indexPhpMethodTagManagerAddContainerPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerAddContainerPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerAddContainerPostWithHttpInfo(IndexPhpMethodTagManagerAddContainerPostRequest indexPhpMethodTagManagerAddContainerPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerAddContainerPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.addContainer", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerAddContainerTagPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerAddContainerTagPost(IndexPhpMethodTagManagerAddContainerTagPostRequest indexPhpMethodTagManagerAddContainerTagPostRequest) throws RestClientException {
        indexPhpmethodTagManagerAddContainerTagPostWithHttpInfo(indexPhpMethodTagManagerAddContainerTagPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerAddContainerTagPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerAddContainerTagPostWithHttpInfo(IndexPhpMethodTagManagerAddContainerTagPostRequest indexPhpMethodTagManagerAddContainerTagPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerAddContainerTagPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.addContainerTag", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerAddContainerTriggerPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerAddContainerTriggerPost(IndexPhpMethodTagManagerAddContainerTriggerPostRequest indexPhpMethodTagManagerAddContainerTriggerPostRequest) throws RestClientException {
        indexPhpmethodTagManagerAddContainerTriggerPostWithHttpInfo(indexPhpMethodTagManagerAddContainerTriggerPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerAddContainerTriggerPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerAddContainerTriggerPostWithHttpInfo(IndexPhpMethodTagManagerAddContainerTriggerPostRequest indexPhpMethodTagManagerAddContainerTriggerPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerAddContainerTriggerPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.addContainerTrigger", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerAddContainerVariablePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerAddContainerVariablePost(IndexPhpMethodTagManagerAddContainerVariablePostRequest indexPhpMethodTagManagerAddContainerVariablePostRequest) throws RestClientException {
        indexPhpmethodTagManagerAddContainerVariablePostWithHttpInfo(indexPhpMethodTagManagerAddContainerVariablePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerAddContainerVariablePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerAddContainerVariablePostWithHttpInfo(IndexPhpMethodTagManagerAddContainerVariablePostRequest indexPhpMethodTagManagerAddContainerVariablePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerAddContainerVariablePostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.addContainerVariable", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerChangeDebugUrlPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerChangeDebugUrlPost(IndexPhpMethodTagManagerChangeDebugUrlPostRequest indexPhpMethodTagManagerChangeDebugUrlPostRequest) throws RestClientException {
        indexPhpmethodTagManagerChangeDebugUrlPostWithHttpInfo(indexPhpMethodTagManagerChangeDebugUrlPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerChangeDebugUrlPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerChangeDebugUrlPostWithHttpInfo(IndexPhpMethodTagManagerChangeDebugUrlPostRequest indexPhpMethodTagManagerChangeDebugUrlPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerChangeDebugUrlPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.changeDebugUrl", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerCreateContainerVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerCreateContainerVersionPost(IndexPhpMethodTagManagerCreateContainerVersionPostRequest indexPhpMethodTagManagerCreateContainerVersionPostRequest) throws RestClientException {
        indexPhpmethodTagManagerCreateContainerVersionPostWithHttpInfo(indexPhpMethodTagManagerCreateContainerVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerCreateContainerVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerCreateContainerVersionPostWithHttpInfo(IndexPhpMethodTagManagerCreateContainerVersionPostRequest indexPhpMethodTagManagerCreateContainerVersionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerCreateContainerVersionPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.createContainerVersion", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerCreateDefaultContainerForSitePost(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        indexPhpmethodTagManagerCreateDefaultContainerForSitePostWithHttpInfo(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerCreateDefaultContainerForSitePostWithHttpInfo(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=TagManager.createDefaultContainerForSite", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerVersionsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerDeleteContainerPost(IndexPhpMethodTagManagerGetContainerVersionsPostRequest indexPhpMethodTagManagerGetContainerVersionsPostRequest) throws RestClientException {
        indexPhpmethodTagManagerDeleteContainerPostWithHttpInfo(indexPhpMethodTagManagerGetContainerVersionsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerVersionsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerDeleteContainerPostWithHttpInfo(IndexPhpMethodTagManagerGetContainerVersionsPostRequest indexPhpMethodTagManagerGetContainerVersionsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerVersionsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.deleteContainer", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerDeleteContainerTagPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerDeleteContainerTagPost(IndexPhpMethodTagManagerDeleteContainerTagPostRequest indexPhpMethodTagManagerDeleteContainerTagPostRequest) throws RestClientException {
        indexPhpmethodTagManagerDeleteContainerTagPostWithHttpInfo(indexPhpMethodTagManagerDeleteContainerTagPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerDeleteContainerTagPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerDeleteContainerTagPostWithHttpInfo(IndexPhpMethodTagManagerDeleteContainerTagPostRequest indexPhpMethodTagManagerDeleteContainerTagPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerDeleteContainerTagPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.deleteContainerTag", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerDeleteContainerTriggerPost(IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest) throws RestClientException {
        indexPhpmethodTagManagerDeleteContainerTriggerPostWithHttpInfo(indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerDeleteContainerTriggerPostWithHttpInfo(IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.deleteContainerTrigger", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerDeleteContainerVariablePost(IndexPhpMethodTagManagerGetContainerVariableReferencesPostRequest indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest) throws RestClientException {
        indexPhpmethodTagManagerDeleteContainerVariablePostWithHttpInfo(indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerDeleteContainerVariablePostWithHttpInfo(IndexPhpMethodTagManagerGetContainerVariableReferencesPostRequest indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.deleteContainerVariable", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTagsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerDeleteContainerVersionPost(IndexPhpMethodTagManagerGetContainerTagsPostRequest indexPhpMethodTagManagerGetContainerTagsPostRequest) throws RestClientException {
        indexPhpmethodTagManagerDeleteContainerVersionPostWithHttpInfo(indexPhpMethodTagManagerGetContainerTagsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTagsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerDeleteContainerVersionPostWithHttpInfo(IndexPhpMethodTagManagerGetContainerTagsPostRequest indexPhpMethodTagManagerGetContainerTagsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerTagsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.deleteContainerVersion", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerVersionsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerDisablePreviewModePost(IndexPhpMethodTagManagerGetContainerVersionsPostRequest indexPhpMethodTagManagerGetContainerVersionsPostRequest) throws RestClientException {
        indexPhpmethodTagManagerDisablePreviewModePostWithHttpInfo(indexPhpMethodTagManagerGetContainerVersionsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerVersionsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerDisablePreviewModePostWithHttpInfo(IndexPhpMethodTagManagerGetContainerVersionsPostRequest indexPhpMethodTagManagerGetContainerVersionsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerVersionsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.disablePreviewMode", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTagsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerEnablePreviewModePost(IndexPhpMethodTagManagerGetContainerTagsPostRequest indexPhpMethodTagManagerGetContainerTagsPostRequest) throws RestClientException {
        indexPhpmethodTagManagerEnablePreviewModePostWithHttpInfo(indexPhpMethodTagManagerGetContainerTagsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTagsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerEnablePreviewModePostWithHttpInfo(IndexPhpMethodTagManagerGetContainerTagsPostRequest indexPhpMethodTagManagerGetContainerTagsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerTagsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.enablePreviewMode", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTagsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerExportContainerVersionPost(IndexPhpMethodTagManagerGetContainerTagsPostRequest indexPhpMethodTagManagerGetContainerTagsPostRequest) throws RestClientException {
        indexPhpmethodTagManagerExportContainerVersionPostWithHttpInfo(indexPhpMethodTagManagerGetContainerTagsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTagsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerExportContainerVersionPostWithHttpInfo(IndexPhpMethodTagManagerGetContainerTagsPostRequest indexPhpMethodTagManagerGetContainerTagsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerTagsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.exportContainerVersion", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetAvailableComparisonsPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetAvailableComparisonsPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetAvailableComparisonsPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=TagManager.getAvailableComparisons", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTagsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetAvailableContainerVariablesPost(IndexPhpMethodTagManagerGetContainerTagsPostRequest indexPhpMethodTagManagerGetContainerTagsPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetAvailableContainerVariablesPostWithHttpInfo(indexPhpMethodTagManagerGetContainerTagsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTagsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetAvailableContainerVariablesPostWithHttpInfo(IndexPhpMethodTagManagerGetContainerTagsPostRequest indexPhpMethodTagManagerGetContainerTagsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerTagsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.getAvailableContainerVariables", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetAvailableContextsPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetAvailableContextsPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetAvailableContextsPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=TagManager.getAvailableContexts", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetAvailableEnvironmentsPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetAvailableEnvironmentsPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetAvailableEnvironmentsPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=TagManager.getAvailableEnvironments", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetAvailableEnvironmentsWithPublishCapabilityPost(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetAvailableEnvironmentsWithPublishCapabilityPostWithHttpInfo(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetAvailableEnvironmentsWithPublishCapabilityPostWithHttpInfo(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=TagManager.getAvailableEnvironmentsWithPublishCapability", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetAvailableTagFireLimitsPost(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetAvailableTagFireLimitsPostWithHttpInfo(indexPhpMethodAPIGetMatomoVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetMatomoVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetAvailableTagFireLimitsPostWithHttpInfo(IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=TagManager.getAvailableTagFireLimits", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetAvailableTagTypesInContextPost(IndexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetAvailableTagTypesInContextPostWithHttpInfo(indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetAvailableTagTypesInContextPostWithHttpInfo(IndexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.getAvailableTagTypesInContext", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetAvailableTriggerTypesInContextPost(IndexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetAvailableTriggerTypesInContextPostWithHttpInfo(indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetAvailableTriggerTypesInContextPostWithHttpInfo(IndexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.getAvailableTriggerTypesInContext", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetAvailableVariableTypesInContextPost(IndexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetAvailableVariableTypesInContextPostWithHttpInfo(indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetAvailableVariableTypesInContextPostWithHttpInfo(IndexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetAvailableTagTypesInContextPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.getAvailableVariableTypesInContext", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerEmbedCodePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetContainerEmbedCodePost(IndexPhpMethodTagManagerGetContainerEmbedCodePostRequest indexPhpMethodTagManagerGetContainerEmbedCodePostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetContainerEmbedCodePostWithHttpInfo(indexPhpMethodTagManagerGetContainerEmbedCodePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerEmbedCodePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetContainerEmbedCodePostWithHttpInfo(IndexPhpMethodTagManagerGetContainerEmbedCodePostRequest indexPhpMethodTagManagerGetContainerEmbedCodePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerEmbedCodePostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.getContainerEmbedCode", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerInstallInstructionsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetContainerInstallInstructionsPost(IndexPhpMethodTagManagerGetContainerInstallInstructionsPostRequest indexPhpMethodTagManagerGetContainerInstallInstructionsPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetContainerInstallInstructionsPostWithHttpInfo(indexPhpMethodTagManagerGetContainerInstallInstructionsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerInstallInstructionsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetContainerInstallInstructionsPostWithHttpInfo(IndexPhpMethodTagManagerGetContainerInstallInstructionsPostRequest indexPhpMethodTagManagerGetContainerInstallInstructionsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerInstallInstructionsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.getContainerInstallInstructions", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerVersionsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetContainerPost(IndexPhpMethodTagManagerGetContainerVersionsPostRequest indexPhpMethodTagManagerGetContainerVersionsPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetContainerPostWithHttpInfo(indexPhpMethodTagManagerGetContainerVersionsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerVersionsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetContainerPostWithHttpInfo(IndexPhpMethodTagManagerGetContainerVersionsPostRequest indexPhpMethodTagManagerGetContainerVersionsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerVersionsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.getContainer", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerDeleteContainerTagPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetContainerTagPost(IndexPhpMethodTagManagerDeleteContainerTagPostRequest indexPhpMethodTagManagerDeleteContainerTagPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetContainerTagPostWithHttpInfo(indexPhpMethodTagManagerDeleteContainerTagPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerDeleteContainerTagPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetContainerTagPostWithHttpInfo(IndexPhpMethodTagManagerDeleteContainerTagPostRequest indexPhpMethodTagManagerDeleteContainerTagPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerDeleteContainerTagPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.getContainerTag", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTagsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetContainerTagsPost(IndexPhpMethodTagManagerGetContainerTagsPostRequest indexPhpMethodTagManagerGetContainerTagsPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetContainerTagsPostWithHttpInfo(indexPhpMethodTagManagerGetContainerTagsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTagsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetContainerTagsPostWithHttpInfo(IndexPhpMethodTagManagerGetContainerTagsPostRequest indexPhpMethodTagManagerGetContainerTagsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerTagsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.getContainerTags", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetContainerTriggerPost(IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetContainerTriggerPostWithHttpInfo(indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetContainerTriggerPostWithHttpInfo(IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.getContainerTrigger", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetContainerTriggerReferencesPost(IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetContainerTriggerReferencesPostWithHttpInfo(indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetContainerTriggerReferencesPostWithHttpInfo(IndexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerTriggerReferencesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.getContainerTriggerReferences", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTagsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetContainerTriggersPost(IndexPhpMethodTagManagerGetContainerTagsPostRequest indexPhpMethodTagManagerGetContainerTagsPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetContainerTriggersPostWithHttpInfo(indexPhpMethodTagManagerGetContainerTagsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTagsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetContainerTriggersPostWithHttpInfo(IndexPhpMethodTagManagerGetContainerTagsPostRequest indexPhpMethodTagManagerGetContainerTagsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerTagsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.getContainerTriggers", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetContainerVariablePost(IndexPhpMethodTagManagerGetContainerVariableReferencesPostRequest indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetContainerVariablePostWithHttpInfo(indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetContainerVariablePostWithHttpInfo(IndexPhpMethodTagManagerGetContainerVariableReferencesPostRequest indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.getContainerVariable", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetContainerVariableReferencesPost(IndexPhpMethodTagManagerGetContainerVariableReferencesPostRequest indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetContainerVariableReferencesPostWithHttpInfo(indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetContainerVariableReferencesPostWithHttpInfo(IndexPhpMethodTagManagerGetContainerVariableReferencesPostRequest indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerVariableReferencesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.getContainerVariableReferences", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTagsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetContainerVariablesPost(IndexPhpMethodTagManagerGetContainerTagsPostRequest indexPhpMethodTagManagerGetContainerTagsPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetContainerVariablesPostWithHttpInfo(indexPhpMethodTagManagerGetContainerTagsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTagsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetContainerVariablesPostWithHttpInfo(IndexPhpMethodTagManagerGetContainerTagsPostRequest indexPhpMethodTagManagerGetContainerTagsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerTagsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.getContainerVariables", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTagsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetContainerVersionPost(IndexPhpMethodTagManagerGetContainerTagsPostRequest indexPhpMethodTagManagerGetContainerTagsPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetContainerVersionPostWithHttpInfo(indexPhpMethodTagManagerGetContainerTagsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerTagsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetContainerVersionPostWithHttpInfo(IndexPhpMethodTagManagerGetContainerTagsPostRequest indexPhpMethodTagManagerGetContainerTagsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerTagsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.getContainerVersion", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerVersionsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetContainerVersionsPost(IndexPhpMethodTagManagerGetContainerVersionsPostRequest indexPhpMethodTagManagerGetContainerVersionsPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetContainerVersionsPostWithHttpInfo(indexPhpMethodTagManagerGetContainerVersionsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerGetContainerVersionsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetContainerVersionsPostWithHttpInfo(IndexPhpMethodTagManagerGetContainerVersionsPostRequest indexPhpMethodTagManagerGetContainerVersionsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerGetContainerVersionsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.getContainerVersions", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerGetContainersPost(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        indexPhpmethodTagManagerGetContainersPostWithHttpInfo(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerGetContainersPostWithHttpInfo(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=TagManager.getContainers", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerImportContainerVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerImportContainerVersionPost(IndexPhpMethodTagManagerImportContainerVersionPostRequest indexPhpMethodTagManagerImportContainerVersionPostRequest) throws RestClientException {
        indexPhpmethodTagManagerImportContainerVersionPostWithHttpInfo(indexPhpMethodTagManagerImportContainerVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerImportContainerVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerImportContainerVersionPostWithHttpInfo(IndexPhpMethodTagManagerImportContainerVersionPostRequest indexPhpMethodTagManagerImportContainerVersionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerImportContainerVersionPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.importContainerVersion", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerPublishContainerVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerPublishContainerVersionPost(IndexPhpMethodTagManagerPublishContainerVersionPostRequest indexPhpMethodTagManagerPublishContainerVersionPostRequest) throws RestClientException {
        indexPhpmethodTagManagerPublishContainerVersionPostWithHttpInfo(indexPhpMethodTagManagerPublishContainerVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerPublishContainerVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerPublishContainerVersionPostWithHttpInfo(IndexPhpMethodTagManagerPublishContainerVersionPostRequest indexPhpMethodTagManagerPublishContainerVersionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerPublishContainerVersionPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.publishContainerVersion", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerUpdateContainerPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerUpdateContainerPost(IndexPhpMethodTagManagerUpdateContainerPostRequest indexPhpMethodTagManagerUpdateContainerPostRequest) throws RestClientException {
        indexPhpmethodTagManagerUpdateContainerPostWithHttpInfo(indexPhpMethodTagManagerUpdateContainerPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerUpdateContainerPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerUpdateContainerPostWithHttpInfo(IndexPhpMethodTagManagerUpdateContainerPostRequest indexPhpMethodTagManagerUpdateContainerPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerUpdateContainerPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.updateContainer", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerUpdateContainerTagPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerUpdateContainerTagPost(IndexPhpMethodTagManagerUpdateContainerTagPostRequest indexPhpMethodTagManagerUpdateContainerTagPostRequest) throws RestClientException {
        indexPhpmethodTagManagerUpdateContainerTagPostWithHttpInfo(indexPhpMethodTagManagerUpdateContainerTagPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerUpdateContainerTagPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerUpdateContainerTagPostWithHttpInfo(IndexPhpMethodTagManagerUpdateContainerTagPostRequest indexPhpMethodTagManagerUpdateContainerTagPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerUpdateContainerTagPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.updateContainerTag", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerUpdateContainerTriggerPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerUpdateContainerTriggerPost(IndexPhpMethodTagManagerUpdateContainerTriggerPostRequest indexPhpMethodTagManagerUpdateContainerTriggerPostRequest) throws RestClientException {
        indexPhpmethodTagManagerUpdateContainerTriggerPostWithHttpInfo(indexPhpMethodTagManagerUpdateContainerTriggerPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerUpdateContainerTriggerPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerUpdateContainerTriggerPostWithHttpInfo(IndexPhpMethodTagManagerUpdateContainerTriggerPostRequest indexPhpMethodTagManagerUpdateContainerTriggerPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerUpdateContainerTriggerPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.updateContainerTrigger", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerUpdateContainerVariablePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerUpdateContainerVariablePost(IndexPhpMethodTagManagerUpdateContainerVariablePostRequest indexPhpMethodTagManagerUpdateContainerVariablePostRequest) throws RestClientException {
        indexPhpmethodTagManagerUpdateContainerVariablePostWithHttpInfo(indexPhpMethodTagManagerUpdateContainerVariablePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerUpdateContainerVariablePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerUpdateContainerVariablePostWithHttpInfo(IndexPhpMethodTagManagerUpdateContainerVariablePostRequest indexPhpMethodTagManagerUpdateContainerVariablePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerUpdateContainerVariablePostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.updateContainerVariable", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodTagManagerUpdateContainerVersionPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodTagManagerUpdateContainerVersionPost(IndexPhpMethodTagManagerUpdateContainerVersionPostRequest indexPhpMethodTagManagerUpdateContainerVersionPostRequest) throws RestClientException {
        indexPhpmethodTagManagerUpdateContainerVersionPostWithHttpInfo(indexPhpMethodTagManagerUpdateContainerVersionPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodTagManagerUpdateContainerVersionPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodTagManagerUpdateContainerVersionPostWithHttpInfo(IndexPhpMethodTagManagerUpdateContainerVersionPostRequest indexPhpMethodTagManagerUpdateContainerVersionPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodTagManagerUpdateContainerVersionPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=TagManager.updateContainerVersion", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
