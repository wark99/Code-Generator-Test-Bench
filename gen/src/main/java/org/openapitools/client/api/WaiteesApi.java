package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetWaitee200Response;
import org.openapitools.client.model.PostWaitee200Response;
import org.openapitools.client.model.PostWaiteeRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:35.686627593Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class WaiteesApi {
    private ApiClient apiClient;

    public WaiteesApi() {
        this(new ApiClient());
    }

    public WaiteesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete a waitee
     * Delete a waitee.
     * <p><b>204</b> - Waitee deleted.
     * @param inviteCode  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteWaitee(String inviteCode) throws RestClientException {
        deleteWaiteeWithHttpInfo(inviteCode);
    }

    /**
     * Delete a waitee
     * Delete a waitee.
     * <p><b>204</b> - Waitee deleted.
     * @param inviteCode  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteWaiteeWithHttpInfo(String inviteCode) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inviteCode' is set
        if (inviteCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inviteCode' when calling deleteWaitee");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("inviteCode", inviteCode);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/waitees/{inviteCode}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a waitee
     * Retrieve the waitee.
     * <p><b>200</b> - Returns a Waitee object.
     * <p><b>404</b> - Waitee not found.
     * @param inviteCode  (required)
     * @return GetWaitee200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetWaitee200Response getWaitee(String inviteCode) throws RestClientException {
        return getWaiteeWithHttpInfo(inviteCode).getBody();
    }

    /**
     * Get a waitee
     * Retrieve the waitee.
     * <p><b>200</b> - Returns a Waitee object.
     * <p><b>404</b> - Waitee not found.
     * @param inviteCode  (required)
     * @return ResponseEntity&lt;GetWaitee200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetWaitee200Response> getWaiteeWithHttpInfo(String inviteCode) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'inviteCode' is set
        if (inviteCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inviteCode' when calling getWaitee");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("inviteCode", inviteCode);

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

        ParameterizedTypeReference<GetWaitee200Response> localReturnType = new ParameterizedTypeReference<GetWaitee200Response>() {};
        return apiClient.invokeAPI("/waitees/{inviteCode}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a waitee
     * Create a new waitee.
     * <p><b>200</b> - Waitee created.
     * @param postWaiteeRequest Creates a new waitee. If a user is signed in, &#x60;students.id&#x60; is required and the waitee will be associated to the authenticated user. If no user is signed in, &#x60;first_name&#x60;, &#x60;last_name&#x60;, &#x60;email&#x60;, &#x60;telephone&#x60;, &#x60;students.first_name&#x60; and &#x60;students.last_name&#x60; are required. (optional)
     * @return PostWaitee200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostWaitee200Response postWaitee(PostWaiteeRequest postWaiteeRequest) throws RestClientException {
        return postWaiteeWithHttpInfo(postWaiteeRequest).getBody();
    }

    /**
     * Create a waitee
     * Create a new waitee.
     * <p><b>200</b> - Waitee created.
     * @param postWaiteeRequest Creates a new waitee. If a user is signed in, &#x60;students.id&#x60; is required and the waitee will be associated to the authenticated user. If no user is signed in, &#x60;first_name&#x60;, &#x60;last_name&#x60;, &#x60;email&#x60;, &#x60;telephone&#x60;, &#x60;students.first_name&#x60; and &#x60;students.last_name&#x60; are required. (optional)
     * @return ResponseEntity&lt;PostWaitee200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostWaitee200Response> postWaiteeWithHttpInfo(PostWaiteeRequest postWaiteeRequest) throws RestClientException {
        Object localVarPostBody = postWaiteeRequest;
        

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<PostWaitee200Response> localReturnType = new ParameterizedTypeReference<PostWaitee200Response>() {};
        return apiClient.invokeAPI("/waitees", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
