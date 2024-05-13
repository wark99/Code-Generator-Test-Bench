package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.MessagingSendPostRequest;
import org.openapitools.client.model.MessagingThreadIdGet200ResponseInner;
import org.openapitools.client.model.MessagingThreadsGet200ResponseInner;
import org.openapitools.client.model.SearchProfilePost400Response;
import org.openapitools.client.model.SearchProfilePostDefaultResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:24.544913406Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MessageCenterApi {
    private ApiClient apiClient;

    public MessageCenterApi() {
        this(new ApiClient());
    }

    public MessageCenterApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * send a message
     * 
     * <p><b>201</b> - Successfully sent a message
     * <p><b>400</b> - There was problem sending a message
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param messagingSendPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void messagingSendPost(MessagingSendPostRequest messagingSendPostRequest) throws RestClientException {
        messagingSendPostWithHttpInfo(messagingSendPostRequest);
    }

    /**
     * send a message
     * 
     * <p><b>201</b> - Successfully sent a message
     * <p><b>400</b> - There was problem sending a message
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param messagingSendPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> messagingSendPostWithHttpInfo(MessagingSendPostRequest messagingSendPostRequest) throws RestClientException {
        Object localVarPostBody = messagingSendPostRequest;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

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
        return apiClient.invokeAPI("/messaging/send", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * get messages for particular thread
     * 
     * <p><b>200</b> - Messages successfully retrieved
     * <p><b>400</b> - There was problem retrieving thread&#39;s messages
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @return List&lt;MessagingThreadIdGet200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MessagingThreadIdGet200ResponseInner> messagingThreadIdGet(String id) throws RestClientException {
        return messagingThreadIdGetWithHttpInfo(id).getBody();
    }

    /**
     * get messages for particular thread
     * 
     * <p><b>200</b> - Messages successfully retrieved
     * <p><b>400</b> - There was problem retrieving thread&#39;s messages
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (required)
     * @return ResponseEntity&lt;List&lt;MessagingThreadIdGet200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MessagingThreadIdGet200ResponseInner>> messagingThreadIdGetWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling messagingThreadIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<MessagingThreadIdGet200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<MessagingThreadIdGet200ResponseInner>>() {};
        return apiClient.invokeAPI("/messaging/thread/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user active message threads
     * 
     * <p><b>200</b> - User message threads retrieved
     * <p><b>400</b> - There was problem retrieving user message threads
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @return List&lt;MessagingThreadsGet200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MessagingThreadsGet200ResponseInner> messagingThreadsGet() throws RestClientException {
        return messagingThreadsGetWithHttpInfo().getBody();
    }

    /**
     * Get user active message threads
     * 
     * <p><b>200</b> - User message threads retrieved
     * <p><b>400</b> - There was problem retrieving user message threads
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @return ResponseEntity&lt;List&lt;MessagingThreadsGet200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MessagingThreadsGet200ResponseInner>> messagingThreadsGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<MessagingThreadsGet200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<MessagingThreadsGet200ResponseInner>>() {};
        return apiClient.invokeAPI("/messaging/threads", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
