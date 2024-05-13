package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodAPIGetReportPagesMetadataPostRequest;
import org.openapitools.client.model.IndexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest;
import org.openapitools.client.model.IndexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest;
import org.openapitools.client.model.IndexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest;
import org.openapitools.client.model.IndexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest;

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
public class AdvertisingConversionExportApi {
    private ApiClient apiClient;

    public AdvertisingConversionExportApi() {
        this(new ApiClient());
    }

    public AdvertisingConversionExportApi(ApiClient apiClient) {
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
     * @param indexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodAdvertisingConversionExportAddConversionExportPost(IndexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest indexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest) throws RestClientException {
        indexPhpmethodAdvertisingConversionExportAddConversionExportPostWithHttpInfo(indexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodAdvertisingConversionExportAddConversionExportPostWithHttpInfo(IndexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest indexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAdvertisingConversionExportAddConversionExportPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=AdvertisingConversionExport.addConversionExport", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodAdvertisingConversionExportDeleteConversionExportPost(IndexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest indexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest) throws RestClientException {
        indexPhpmethodAdvertisingConversionExportDeleteConversionExportPostWithHttpInfo(indexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodAdvertisingConversionExportDeleteConversionExportPostWithHttpInfo(IndexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest indexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAdvertisingConversionExportDeleteConversionExportPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=AdvertisingConversionExport.deleteConversionExport", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodAdvertisingConversionExportGetConversionExportPost(IndexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest) throws RestClientException {
        indexPhpmethodAdvertisingConversionExportGetConversionExportPostWithHttpInfo(indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodAdvertisingConversionExportGetConversionExportPostWithHttpInfo(IndexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=AdvertisingConversionExport.getConversionExport", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodAdvertisingConversionExportGetConversionExportsPost(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        indexPhpmethodAdvertisingConversionExportGetConversionExportsPostWithHttpInfo(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodAdvertisingConversionExportGetConversionExportsPostWithHttpInfo(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=AdvertisingConversionExport.getConversionExports", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodAdvertisingConversionExportRegenerateAccessTokenPost(IndexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest) throws RestClientException {
        indexPhpmethodAdvertisingConversionExportRegenerateAccessTokenPostWithHttpInfo(indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodAdvertisingConversionExportRegenerateAccessTokenPostWithHttpInfo(IndexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAdvertisingConversionExportGetConversionExportPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=AdvertisingConversionExport.regenerateAccessToken", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodAdvertisingConversionExportUpdateConversionExportPost(IndexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest indexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest) throws RestClientException {
        indexPhpmethodAdvertisingConversionExportUpdateConversionExportPostWithHttpInfo(indexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodAdvertisingConversionExportUpdateConversionExportPostWithHttpInfo(IndexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest indexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAdvertisingConversionExportUpdateConversionExportPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=AdvertisingConversionExport.updateConversionExport", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
