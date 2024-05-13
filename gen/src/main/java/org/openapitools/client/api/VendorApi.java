package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Vendor;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:22:43.478746035Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class VendorApi {
    private ApiClient apiClient;

    public VendorApi() {
        this(new ApiClient());
    }

    public VendorApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new vendor
     * 
     * <p><b>200</b> - Vendor created successfully
     * <p><b>201</b> - created
     * @param vendor Vendor object to be created (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void createVendor(Vendor vendor) throws RestClientException {
        createVendorWithHttpInfo(vendor);
    }

    /**
     * Create a new vendor
     * 
     * <p><b>200</b> - Vendor created successfully
     * <p><b>201</b> - created
     * @param vendor Vendor object to be created (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createVendorWithHttpInfo(Vendor vendor) throws RestClientException {
        Object localVarPostBody = vendor;
        
        // verify the required parameter 'vendor' is set
        if (vendor == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vendor' when calling createVendor");
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
        return apiClient.invokeAPI("/vendor", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a vendor
     * Delete a vendor by ID
     * <p><b>200</b> - Vendor deleted successfully
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Vendor not found
     * @param vendorId ID of the vendor to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteVendor(Integer vendorId) throws RestClientException {
        deleteVendorWithHttpInfo(vendorId);
    }

    /**
     * Delete a vendor
     * Delete a vendor by ID
     * <p><b>200</b> - Vendor deleted successfully
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Vendor not found
     * @param vendorId ID of the vendor to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteVendorWithHttpInfo(Integer vendorId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendorId' is set
        if (vendorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vendorId' when calling deleteVendor");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vendor_id", vendorId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/Vendor/{vendor_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all vendors
     * Returns all registered vendors
     * <p><b>200</b> - Successful operation
     * @return List&lt;Vendor&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Vendor> getAllVendors() throws RestClientException {
        return getAllVendorsWithHttpInfo().getBody();
    }

    /**
     * Get all vendors
     * Returns all registered vendors
     * <p><b>200</b> - Successful operation
     * @return ResponseEntity&lt;List&lt;Vendor&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Vendor>> getAllVendorsWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<Vendor>> localReturnType = new ParameterizedTypeReference<List<Vendor>>() {};
        return apiClient.invokeAPI("/vendor", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get vendor by ID
     * Returns a single vendor based on the provided ID
     * <p><b>200</b> - Successful operation
     * <p><b>404</b> - Vendor not found
     * @param vendorId ID of the vendor to retrieve (required)
     * @return Vendor
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Vendor getVendorById(Integer vendorId) throws RestClientException {
        return getVendorByIdWithHttpInfo(vendorId).getBody();
    }

    /**
     * Get vendor by ID
     * Returns a single vendor based on the provided ID
     * <p><b>200</b> - Successful operation
     * <p><b>404</b> - Vendor not found
     * @param vendorId ID of the vendor to retrieve (required)
     * @return ResponseEntity&lt;Vendor&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Vendor> getVendorByIdWithHttpInfo(Integer vendorId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vendorId' is set
        if (vendorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vendorId' when calling getVendorById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vendor_id", vendorId);

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

        ParameterizedTypeReference<Vendor> localReturnType = new ParameterizedTypeReference<Vendor>() {};
        return apiClient.invokeAPI("/Vendor/{vendor_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update an existing vendor partially
     * Update an existing vendor partially by ID
     * <p><b>200</b> - Vendor updated successfully
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Vendor not found
     * <p><b>422</b> - Validation exception
     * @param vendorId ID of the vendor to update (required)
     * @param vendor Partially updated vendor information (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void partialUpdateVendor(Integer vendorId, Vendor vendor) throws RestClientException {
        partialUpdateVendorWithHttpInfo(vendorId, vendor);
    }

    /**
     * Update an existing vendor partially
     * Update an existing vendor partially by ID
     * <p><b>200</b> - Vendor updated successfully
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Vendor not found
     * <p><b>422</b> - Validation exception
     * @param vendorId ID of the vendor to update (required)
     * @param vendor Partially updated vendor information (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> partialUpdateVendorWithHttpInfo(Integer vendorId, Vendor vendor) throws RestClientException {
        Object localVarPostBody = vendor;
        
        // verify the required parameter 'vendorId' is set
        if (vendorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vendorId' when calling partialUpdateVendor");
        }
        
        // verify the required parameter 'vendor' is set
        if (vendor == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vendor' when calling partialUpdateVendor");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vendor_id", vendorId);

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
        return apiClient.invokeAPI("/Vendor/{vendor_id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update an existing vendor
     * Update an existing vendor by ID
     * <p><b>200</b> - Vendor updated successfully
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Vendor not found
     * <p><b>422</b> - Validation exception
     * @param vendorId ID of the vendor to update (required)
     * @param vendor Updated vendor information (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateVendor(Integer vendorId, Vendor vendor) throws RestClientException {
        updateVendorWithHttpInfo(vendorId, vendor);
    }

    /**
     * Update an existing vendor
     * Update an existing vendor by ID
     * <p><b>200</b> - Vendor updated successfully
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Vendor not found
     * <p><b>422</b> - Validation exception
     * @param vendorId ID of the vendor to update (required)
     * @param vendor Updated vendor information (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateVendorWithHttpInfo(Integer vendorId, Vendor vendor) throws RestClientException {
        Object localVarPostBody = vendor;
        
        // verify the required parameter 'vendorId' is set
        if (vendorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vendorId' when calling updateVendor");
        }
        
        // verify the required parameter 'vendor' is set
        if (vendor == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vendor' when calling updateVendor");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vendor_id", vendorId);

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
        return apiClient.invokeAPI("/Vendor/{vendor_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
