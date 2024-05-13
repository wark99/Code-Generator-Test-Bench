package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodAPIGetReportPagesMetadataPostRequest;
import org.openapitools.client.model.IndexPhpMethodAnnotationsAddPostRequest;
import org.openapitools.client.model.IndexPhpMethodAnnotationsDeletePostRequest;
import org.openapitools.client.model.IndexPhpMethodAnnotationsGetAllPostRequest;
import org.openapitools.client.model.IndexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest;
import org.openapitools.client.model.IndexPhpMethodAnnotationsSavePostRequest;

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
public class AnnotationsApi {
    private ApiClient apiClient;

    public AnnotationsApi() {
        this(new ApiClient());
    }

    public AnnotationsApi(ApiClient apiClient) {
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
     * @param indexPhpMethodAnnotationsAddPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodAnnotationsAddPost(IndexPhpMethodAnnotationsAddPostRequest indexPhpMethodAnnotationsAddPostRequest) throws RestClientException {
        indexPhpmethodAnnotationsAddPostWithHttpInfo(indexPhpMethodAnnotationsAddPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAnnotationsAddPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodAnnotationsAddPostWithHttpInfo(IndexPhpMethodAnnotationsAddPostRequest indexPhpMethodAnnotationsAddPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAnnotationsAddPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Annotations.add", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodAnnotationsDeleteAllPost(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
        indexPhpmethodAnnotationsDeleteAllPostWithHttpInfo(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetReportPagesMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodAnnotationsDeleteAllPostWithHttpInfo(IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest) throws RestClientException {
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
        return apiClient.invokeAPI("/index.php?method=Annotations.deleteAll", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAnnotationsDeletePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodAnnotationsDeletePost(IndexPhpMethodAnnotationsDeletePostRequest indexPhpMethodAnnotationsDeletePostRequest) throws RestClientException {
        indexPhpmethodAnnotationsDeletePostWithHttpInfo(indexPhpMethodAnnotationsDeletePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAnnotationsDeletePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodAnnotationsDeletePostWithHttpInfo(IndexPhpMethodAnnotationsDeletePostRequest indexPhpMethodAnnotationsDeletePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAnnotationsDeletePostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Annotations.delete", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAnnotationsGetAllPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodAnnotationsGetAllPost(IndexPhpMethodAnnotationsGetAllPostRequest indexPhpMethodAnnotationsGetAllPostRequest) throws RestClientException {
        indexPhpmethodAnnotationsGetAllPostWithHttpInfo(indexPhpMethodAnnotationsGetAllPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAnnotationsGetAllPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodAnnotationsGetAllPostWithHttpInfo(IndexPhpMethodAnnotationsGetAllPostRequest indexPhpMethodAnnotationsGetAllPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAnnotationsGetAllPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Annotations.getAll", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodAnnotationsGetAnnotationCountForDatesPost(IndexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest indexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest) throws RestClientException {
        indexPhpmethodAnnotationsGetAnnotationCountForDatesPostWithHttpInfo(indexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodAnnotationsGetAnnotationCountForDatesPostWithHttpInfo(IndexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest indexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAnnotationsGetAnnotationCountForDatesPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Annotations.getAnnotationCountForDates", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAnnotationsDeletePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodAnnotationsGetPost(IndexPhpMethodAnnotationsDeletePostRequest indexPhpMethodAnnotationsDeletePostRequest) throws RestClientException {
        indexPhpmethodAnnotationsGetPostWithHttpInfo(indexPhpMethodAnnotationsDeletePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAnnotationsDeletePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodAnnotationsGetPostWithHttpInfo(IndexPhpMethodAnnotationsDeletePostRequest indexPhpMethodAnnotationsDeletePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAnnotationsDeletePostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Annotations.get", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAnnotationsSavePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodAnnotationsSavePost(IndexPhpMethodAnnotationsSavePostRequest indexPhpMethodAnnotationsSavePostRequest) throws RestClientException {
        indexPhpmethodAnnotationsSavePostWithHttpInfo(indexPhpMethodAnnotationsSavePostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAnnotationsSavePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodAnnotationsSavePostWithHttpInfo(IndexPhpMethodAnnotationsSavePostRequest indexPhpMethodAnnotationsSavePostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAnnotationsSavePostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=Annotations.save", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
