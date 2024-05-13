package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateSupervisorsWithListInputRequestInner;
import org.openapitools.client.model.GetsupervisorById200ResponseInner;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:37.514106366Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SupervisorsApi {
    private ApiClient apiClient;

    public SupervisorsApi() {
        this(new ApiClient());
    }

    public SupervisorsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates list of Supervisors with given input array
     * Creates list of Supervisors with given input array
     * <p><b>200</b> - Successful operation
     * <p><b>0</b> - successful operation
     * @param createSupervisorsWithListInputRequestInner  (optional)
     * @return List&lt;CreateSupervisorsWithListInputRequestInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CreateSupervisorsWithListInputRequestInner> createSupervisorsWithListInput(List<CreateSupervisorsWithListInputRequestInner> createSupervisorsWithListInputRequestInner) throws RestClientException {
        return createSupervisorsWithListInputWithHttpInfo(createSupervisorsWithListInputRequestInner).getBody();
    }

    /**
     * Creates list of Supervisors with given input array
     * Creates list of Supervisors with given input array
     * <p><b>200</b> - Successful operation
     * <p><b>0</b> - successful operation
     * @param createSupervisorsWithListInputRequestInner  (optional)
     * @return ResponseEntity&lt;List&lt;CreateSupervisorsWithListInputRequestInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CreateSupervisorsWithListInputRequestInner>> createSupervisorsWithListInputWithHttpInfo(List<CreateSupervisorsWithListInputRequestInner> createSupervisorsWithListInputRequestInner) throws RestClientException {
        Object localVarPostBody = createSupervisorsWithListInputRequestInner;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<CreateSupervisorsWithListInputRequestInner>> localReturnType = new ParameterizedTypeReference<List<CreateSupervisorsWithListInputRequestInner>>() {};
        return apiClient.invokeAPI("/Supervisors/SupervisorbyID", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Deletes a Supervisors
     * delete a Supervisors
     * <p><b>400</b> - Invalid pet value
     * @param apiKey  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteSupervisors(String apiKey) throws RestClientException {
        deleteSupervisorsWithHttpInfo(apiKey);
    }

    /**
     * Deletes a Supervisors
     * delete a Supervisors
     * <p><b>400</b> - Invalid pet value
     * @param apiKey  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteSupervisorsWithHttpInfo(String apiKey) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (apiKey != null)
        localVarHeaderParams.add("api_key", apiClient.parameterToString(apiKey));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/Supervisors/{username}", HttpMethod.DELETE, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Supervisors by user name
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid username supplied
     * <p><b>404</b> - UserName not found
     * @param username The username that needs to be fetched. Use Supervisors1 for testing.  (required)
     * @return List&lt;CreateSupervisorsWithListInputRequestInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CreateSupervisorsWithListInputRequestInner> getSupervisorsByUserName(String username) throws RestClientException {
        return getSupervisorsByUserNameWithHttpInfo(username).getBody();
    }

    /**
     * Get Supervisors by user name
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid username supplied
     * <p><b>404</b> - UserName not found
     * @param username The username that needs to be fetched. Use Supervisors1 for testing.  (required)
     * @return ResponseEntity&lt;List&lt;CreateSupervisorsWithListInputRequestInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CreateSupervisorsWithListInputRequestInner>> getSupervisorsByUserNameWithHttpInfo(String username) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling getSupervisorsByUserName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<CreateSupervisorsWithListInputRequestInner>> localReturnType = new ParameterizedTypeReference<List<CreateSupervisorsWithListInputRequestInner>>() {};
        return apiClient.invokeAPI("/Supervisors/{username}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Find supervisor by ID
     * Returns a single supervisor
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Supervisore not found
     * @return List&lt;GetsupervisorById200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GetsupervisorById200ResponseInner> getsupervisorById() throws RestClientException {
        return getsupervisorByIdWithHttpInfo().getBody();
    }

    /**
     * Find supervisor by ID
     * Returns a single supervisor
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Supervisore not found
     * @return ResponseEntity&lt;List&lt;GetsupervisorById200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<GetsupervisorById200ResponseInner>> getsupervisorByIdWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<GetsupervisorById200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<GetsupervisorById200ResponseInner>>() {};
        return apiClient.invokeAPI("/Supervisors/SupervisorbyID", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Supervisors
     * 
     * <p><b>0</b> - successful operation
     * @param username username that need to be deleted (required)
     * @param createSupervisorsWithListInputRequestInner Update an existent Supervisors (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateSupervisors(String username, List<CreateSupervisorsWithListInputRequestInner> createSupervisorsWithListInputRequestInner) throws RestClientException {
        updateSupervisorsWithHttpInfo(username, createSupervisorsWithListInputRequestInner);
    }

    /**
     * Update Supervisors
     * 
     * <p><b>0</b> - successful operation
     * @param username username that need to be deleted (required)
     * @param createSupervisorsWithListInputRequestInner Update an existent Supervisors (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateSupervisorsWithHttpInfo(String username, List<CreateSupervisorsWithListInputRequestInner> createSupervisorsWithListInputRequestInner) throws RestClientException {
        Object localVarPostBody = createSupervisorsWithListInputRequestInner;
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'username' when calling updateSupervisors");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("username", username);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "application/xml", "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/Supervisors/{username}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
