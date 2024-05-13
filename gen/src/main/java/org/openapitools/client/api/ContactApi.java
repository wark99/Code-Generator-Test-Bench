package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.PHPCreateContactPhpPostRequest;
import org.openapitools.client.model.PHPUpdateContactPhpPutRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:33.856729607Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ContactApi {
    private ApiClient apiClient;

    public ContactApi() {
        this(new ApiClient());
    }

    public ContactApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new contact
     * This endpoint allows for the creation of a new contact by providing the necessary details.
     * <p><b>200</b> - The contact has been successfully created.
     * @param phPCreateContactPhpPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void pHPCreateContactPhpPost(PHPCreateContactPhpPostRequest phPCreateContactPhpPostRequest) throws RestClientException {
        pHPCreateContactPhpPostWithHttpInfo(phPCreateContactPhpPostRequest);
    }

    /**
     * Create a new contact
     * This endpoint allows for the creation of a new contact by providing the necessary details.
     * <p><b>200</b> - The contact has been successfully created.
     * @param phPCreateContactPhpPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> pHPCreateContactPhpPostWithHttpInfo(PHPCreateContactPhpPostRequest phPCreateContactPhpPostRequest) throws RestClientException {
        Object localVarPostBody = phPCreateContactPhpPostRequest;
        
        // verify the required parameter 'phPCreateContactPhpPostRequest' is set
        if (phPCreateContactPhpPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'phPCreateContactPhpPostRequest' when calling pHPCreateContactPhpPost");
        }
        

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/PHP/createContact.php", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a contact
     * This endpoint allows for the deletion of a contact by providing the contact&#39;s ID.
     * <p><b>200</b> - The contact has been successfully deleted.
     * @param id The ID of the contact to be deleted. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void pHPDeleteContactPhpDelete(Integer id) throws RestClientException {
        pHPDeleteContactPhpDeleteWithHttpInfo(id);
    }

    /**
     * Delete a contact
     * This endpoint allows for the deletion of a contact by providing the contact&#39;s ID.
     * <p><b>200</b> - The contact has been successfully deleted.
     * @param id The ID of the contact to be deleted. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> pHPDeleteContactPhpDeleteWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling pHPDeleteContactPhpDelete");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/PHP/deleteContact.php", HttpMethod.DELETE, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search for a contact
     * This endpoint allows users to search for a contact by providing a search query and user ID.
     * <p><b>200</b> - The search results have been returned.
     * @param searchquery The query used to search for the contact. (required)
     * @param userid The user ID associated with the contact. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void pHPSearchContactPhpGet(String searchquery, String userid) throws RestClientException {
        pHPSearchContactPhpGetWithHttpInfo(searchquery, userid);
    }

    /**
     * Search for a contact
     * This endpoint allows users to search for a contact by providing a search query and user ID.
     * <p><b>200</b> - The search results have been returned.
     * @param searchquery The query used to search for the contact. (required)
     * @param userid The user ID associated with the contact. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> pHPSearchContactPhpGetWithHttpInfo(String searchquery, String userid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'searchquery' is set
        if (searchquery == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'searchquery' when calling pHPSearchContactPhpGet");
        }
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling pHPSearchContactPhpGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "searchquery", searchquery));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "userid", userid));
        

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/PHP/searchContact.php", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a contact
     * This endpoint allows users to update the details of an existing contact by providing the new information.
     * <p><b>200</b> - The contact has been successfully updated.
     * @param phPUpdateContactPhpPutRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void pHPUpdateContactPhpPut(PHPUpdateContactPhpPutRequest phPUpdateContactPhpPutRequest) throws RestClientException {
        pHPUpdateContactPhpPutWithHttpInfo(phPUpdateContactPhpPutRequest);
    }

    /**
     * Update a contact
     * This endpoint allows users to update the details of an existing contact by providing the new information.
     * <p><b>200</b> - The contact has been successfully updated.
     * @param phPUpdateContactPhpPutRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> pHPUpdateContactPhpPutWithHttpInfo(PHPUpdateContactPhpPutRequest phPUpdateContactPhpPutRequest) throws RestClientException {
        Object localVarPostBody = phPUpdateContactPhpPutRequest;
        
        // verify the required parameter 'phPUpdateContactPhpPutRequest' is set
        if (phPUpdateContactPhpPutRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'phPUpdateContactPhpPutRequest' when calling pHPUpdateContactPhpPut");
        }
        

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/PHP/updateContact.php", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
