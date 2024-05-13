package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IndexPhpMethodAPIGetSegmentsMetadataPostRequest;
import org.openapitools.client.model.IndexPhpMethodCustomAlertsAddAlertPostRequest;
import org.openapitools.client.model.IndexPhpMethodCustomAlertsEditAlertPostRequest;
import org.openapitools.client.model.IndexPhpMethodCustomAlertsGetAlertPostRequest;
import org.openapitools.client.model.IndexPhpMethodCustomAlertsGetAlertsPostRequest;
import org.openapitools.client.model.IndexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest;

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
public class CustomAlertsApi {
    private ApiClient apiClient;

    public CustomAlertsApi() {
        this(new ApiClient());
    }

    public CustomAlertsApi(ApiClient apiClient) {
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
     * @param indexPhpMethodCustomAlertsAddAlertPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCustomAlertsAddAlertPost(IndexPhpMethodCustomAlertsAddAlertPostRequest indexPhpMethodCustomAlertsAddAlertPostRequest) throws RestClientException {
        indexPhpmethodCustomAlertsAddAlertPostWithHttpInfo(indexPhpMethodCustomAlertsAddAlertPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCustomAlertsAddAlertPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCustomAlertsAddAlertPostWithHttpInfo(IndexPhpMethodCustomAlertsAddAlertPostRequest indexPhpMethodCustomAlertsAddAlertPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCustomAlertsAddAlertPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CustomAlerts.addAlert", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCustomAlertsGetAlertPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCustomAlertsDeleteAlertPost(IndexPhpMethodCustomAlertsGetAlertPostRequest indexPhpMethodCustomAlertsGetAlertPostRequest) throws RestClientException {
        indexPhpmethodCustomAlertsDeleteAlertPostWithHttpInfo(indexPhpMethodCustomAlertsGetAlertPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCustomAlertsGetAlertPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCustomAlertsDeleteAlertPostWithHttpInfo(IndexPhpMethodCustomAlertsGetAlertPostRequest indexPhpMethodCustomAlertsGetAlertPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCustomAlertsGetAlertPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CustomAlerts.deleteAlert", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCustomAlertsEditAlertPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCustomAlertsEditAlertPost(IndexPhpMethodCustomAlertsEditAlertPostRequest indexPhpMethodCustomAlertsEditAlertPostRequest) throws RestClientException {
        indexPhpmethodCustomAlertsEditAlertPostWithHttpInfo(indexPhpMethodCustomAlertsEditAlertPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCustomAlertsEditAlertPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCustomAlertsEditAlertPostWithHttpInfo(IndexPhpMethodCustomAlertsEditAlertPostRequest indexPhpMethodCustomAlertsEditAlertPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCustomAlertsEditAlertPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CustomAlerts.editAlert", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCustomAlertsGetAlertPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCustomAlertsGetAlertPost(IndexPhpMethodCustomAlertsGetAlertPostRequest indexPhpMethodCustomAlertsGetAlertPostRequest) throws RestClientException {
        indexPhpmethodCustomAlertsGetAlertPostWithHttpInfo(indexPhpMethodCustomAlertsGetAlertPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCustomAlertsGetAlertPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCustomAlertsGetAlertPostWithHttpInfo(IndexPhpMethodCustomAlertsGetAlertPostRequest indexPhpMethodCustomAlertsGetAlertPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCustomAlertsGetAlertPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CustomAlerts.getAlert", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCustomAlertsGetAlertsPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCustomAlertsGetAlertsPost(IndexPhpMethodCustomAlertsGetAlertsPostRequest indexPhpMethodCustomAlertsGetAlertsPostRequest) throws RestClientException {
        indexPhpmethodCustomAlertsGetAlertsPostWithHttpInfo(indexPhpMethodCustomAlertsGetAlertsPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCustomAlertsGetAlertsPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCustomAlertsGetAlertsPostWithHttpInfo(IndexPhpMethodCustomAlertsGetAlertsPostRequest indexPhpMethodCustomAlertsGetAlertsPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCustomAlertsGetAlertsPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CustomAlerts.getAlerts", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodAPIGetSegmentsMetadataPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCustomAlertsGetTriggeredAlertsPost(IndexPhpMethodAPIGetSegmentsMetadataPostRequest indexPhpMethodAPIGetSegmentsMetadataPostRequest) throws RestClientException {
        indexPhpmethodCustomAlertsGetTriggeredAlertsPostWithHttpInfo(indexPhpMethodAPIGetSegmentsMetadataPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodAPIGetSegmentsMetadataPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCustomAlertsGetTriggeredAlertsPostWithHttpInfo(IndexPhpMethodAPIGetSegmentsMetadataPostRequest indexPhpMethodAPIGetSegmentsMetadataPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodAPIGetSegmentsMetadataPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CustomAlerts.getTriggeredAlerts", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * @param indexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void indexPhpmethodCustomAlertsGetValuesForAlertInPastPost(IndexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest indexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest) throws RestClientException {
        indexPhpmethodCustomAlertsGetValuesForAlertInPastPostWithHttpInfo(indexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest);
    }

    /**
     * 
     * 
     * @param indexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> indexPhpmethodCustomAlertsGetValuesForAlertInPastPostWithHttpInfo(IndexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest indexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest) throws RestClientException {
        Object localVarPostBody = indexPhpMethodCustomAlertsGetValuesForAlertInPastPostRequest;
        

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
        return apiClient.invokeAPI("/index.php?method=CustomAlerts.getValuesForAlertInPast", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
