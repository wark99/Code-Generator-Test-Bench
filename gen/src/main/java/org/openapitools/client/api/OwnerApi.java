package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Owner;
import org.openapitools.client.model.OwnerFields;
import org.openapitools.client.model.RestError;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T13:27:01.899651941Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OwnerApi {
    private ApiClient apiClient;

    public OwnerApi() {
        this(new ApiClient());
    }

    public OwnerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Adds a pet owner
     * Records the details of a new pet owner.
     * <p><b>201</b> - The pet owner was sucessfully added.
     * <p><b>400</b> - Bad request.
     * <p><b>500</b> - Server error.
     * @param ownerFields The pet owner (required)
     * @return Owner
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Owner addOwner(OwnerFields ownerFields) throws RestClientException {
        return addOwnerWithHttpInfo(ownerFields).getBody();
    }

    /**
     * Adds a pet owner
     * Records the details of a new pet owner.
     * <p><b>201</b> - The pet owner was sucessfully added.
     * <p><b>400</b> - Bad request.
     * <p><b>500</b> - Server error.
     * @param ownerFields The pet owner (required)
     * @return ResponseEntity&lt;Owner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Owner> addOwnerWithHttpInfo(OwnerFields ownerFields) throws RestClientException {
        Object localVarPostBody = ownerFields;
        
        // verify the required parameter 'ownerFields' is set
        if (ownerFields == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ownerFields' when calling addOwner");
        }
        

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

        ParameterizedTypeReference<Owner> localReturnType = new ParameterizedTypeReference<Owner>() {};
        return apiClient.invokeAPI("/owners", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete an owner by ID
     * Returns the owner or a 404 error.
     * <p><b>200</b> - Owner details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Owner  not found.
     * <p><b>500</b> - Server error.
     * @param ownerId The ID of the owner. (required)
     * @return Owner
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Owner deleteOwner(Integer ownerId) throws RestClientException {
        return deleteOwnerWithHttpInfo(ownerId).getBody();
    }

    /**
     * Delete an owner by ID
     * Returns the owner or a 404 error.
     * <p><b>200</b> - Owner details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Owner  not found.
     * <p><b>500</b> - Server error.
     * @param ownerId The ID of the owner. (required)
     * @return ResponseEntity&lt;Owner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Owner> deleteOwnerWithHttpInfo(Integer ownerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ownerId' is set
        if (ownerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ownerId' when calling deleteOwner");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ownerId", ownerId);

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

        ParameterizedTypeReference<Owner> localReturnType = new ParameterizedTypeReference<Owner>() {};
        return apiClient.invokeAPI("/owners/{ownerId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a pet owner by ID
     * Returns the pet owner or a 404 error.
     * <p><b>200</b> - Owner details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Owner not found.
     * <p><b>500</b> - Server error.
     * @param ownerId The ID of the pet owner. (required)
     * @return Owner
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Owner getOwner(Integer ownerId) throws RestClientException {
        return getOwnerWithHttpInfo(ownerId).getBody();
    }

    /**
     * Get a pet owner by ID
     * Returns the pet owner or a 404 error.
     * <p><b>200</b> - Owner details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Owner not found.
     * <p><b>500</b> - Server error.
     * @param ownerId The ID of the pet owner. (required)
     * @return ResponseEntity&lt;Owner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Owner> getOwnerWithHttpInfo(Integer ownerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ownerId' is set
        if (ownerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ownerId' when calling getOwner");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ownerId", ownerId);

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

        ParameterizedTypeReference<Owner> localReturnType = new ParameterizedTypeReference<Owner>() {};
        return apiClient.invokeAPI("/owners/{ownerId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lists pet owners
     * Returns an array of pet owners.
     * <p><b>200</b> - Owner details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>500</b> - Server error.
     * @param lastName Last name. (optional)
     * @return List&lt;Owner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Owner> listOwners(String lastName) throws RestClientException {
        return listOwnersWithHttpInfo(lastName).getBody();
    }

    /**
     * Lists pet owners
     * Returns an array of pet owners.
     * <p><b>200</b> - Owner details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>500</b> - Server error.
     * @param lastName Last name. (optional)
     * @return ResponseEntity&lt;List&lt;Owner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Owner>> listOwnersWithHttpInfo(String lastName) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "lastName", lastName));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Owner>> localReturnType = new ParameterizedTypeReference<List<Owner>>() {};
        return apiClient.invokeAPI("/owners", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a pet owner&#39;s details
     * Updates the pet owner record with the specified details.
     * <p><b>200</b> - Update successful.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Owner not found.
     * <p><b>500</b> - Server error.
     * @param ownerId The ID of the pet owner. (required)
     * @param ownerFields The pet owner details to use for the update. (required)
     * @return Owner
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Owner updateOwner(Integer ownerId, OwnerFields ownerFields) throws RestClientException {
        return updateOwnerWithHttpInfo(ownerId, ownerFields).getBody();
    }

    /**
     * Update a pet owner&#39;s details
     * Updates the pet owner record with the specified details.
     * <p><b>200</b> - Update successful.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Owner not found.
     * <p><b>500</b> - Server error.
     * @param ownerId The ID of the pet owner. (required)
     * @param ownerFields The pet owner details to use for the update. (required)
     * @return ResponseEntity&lt;Owner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Owner> updateOwnerWithHttpInfo(Integer ownerId, OwnerFields ownerFields) throws RestClientException {
        Object localVarPostBody = ownerFields;
        
        // verify the required parameter 'ownerId' is set
        if (ownerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ownerId' when calling updateOwner");
        }
        
        // verify the required parameter 'ownerFields' is set
        if (ownerFields == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ownerFields' when calling updateOwner");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ownerId", ownerId);

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

        ParameterizedTypeReference<Owner> localReturnType = new ParameterizedTypeReference<Owner>() {};
        return apiClient.invokeAPI("/owners/{ownerId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
