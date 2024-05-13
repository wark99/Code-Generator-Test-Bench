package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Provider;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:25.962969645Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ProviderApi {
    private ApiClient apiClient;

    public ProviderApi() {
        this(new ApiClient());
    }

    public ProviderApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new provider
     * 
     * <p><b>200</b> - Successful operation
     * @param provider  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void providerAddproviderPost(Provider provider) throws RestClientException {
        providerAddproviderPostWithHttpInfo(provider);
    }

    /**
     * Add a new provider
     * 
     * <p><b>200</b> - Successful operation
     * @param provider  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> providerAddproviderPostWithHttpInfo(Provider provider) throws RestClientException {
        Object localVarPostBody = provider;
        
        // verify the required parameter 'provider' is set
        if (provider == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'provider' when calling providerAddproviderPost");
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
        return apiClient.invokeAPI("/provider/addprovider", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete provider by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param providerID ID of the provider to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void providerDeleteproviderProviderIDDelete(Integer providerID) throws RestClientException {
        providerDeleteproviderProviderIDDeleteWithHttpInfo(providerID);
    }

    /**
     * Delete provider by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param providerID ID of the provider to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> providerDeleteproviderProviderIDDeleteWithHttpInfo(Integer providerID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'providerID' is set
        if (providerID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'providerID' when calling providerDeleteproviderProviderIDDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("providerID", providerID);

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
        return apiClient.invokeAPI("/provider/deleteprovider/{providerID}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all providers
     * 
     * <p><b>200</b> - Successful operation
     * @return List&lt;Provider&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Provider> providerGetprovidersGet() throws RestClientException {
        return providerGetprovidersGetWithHttpInfo().getBody();
    }

    /**
     * Get all providers
     * 
     * <p><b>200</b> - Successful operation
     * @return ResponseEntity&lt;List&lt;Provider&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Provider>> providerGetprovidersGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<Provider>> localReturnType = new ParameterizedTypeReference<List<Provider>>() {};
        return apiClient.invokeAPI("/provider/getproviders", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get provider by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param providerID ID of the provider to get (required)
     * @return Provider
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Provider providerProviderIDGet(Integer providerID) throws RestClientException {
        return providerProviderIDGetWithHttpInfo(providerID).getBody();
    }

    /**
     * Get provider by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param providerID ID of the provider to get (required)
     * @return ResponseEntity&lt;Provider&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Provider> providerProviderIDGetWithHttpInfo(Integer providerID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'providerID' is set
        if (providerID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'providerID' when calling providerProviderIDGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("providerID", providerID);

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

        ParameterizedTypeReference<Provider> localReturnType = new ParameterizedTypeReference<Provider>() {};
        return apiClient.invokeAPI("/provider/{providerID}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update provider by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param providerID ID of the provider to update (required)
     * @param provider  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void providerUpdateproviderProviderIDPut(Integer providerID, Provider provider) throws RestClientException {
        providerUpdateproviderProviderIDPutWithHttpInfo(providerID, provider);
    }

    /**
     * Update provider by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param providerID ID of the provider to update (required)
     * @param provider  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> providerUpdateproviderProviderIDPutWithHttpInfo(Integer providerID, Provider provider) throws RestClientException {
        Object localVarPostBody = provider;
        
        // verify the required parameter 'providerID' is set
        if (providerID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'providerID' when calling providerUpdateproviderProviderIDPut");
        }
        
        // verify the required parameter 'provider' is set
        if (provider == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'provider' when calling providerUpdateproviderProviderIDPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("providerID", providerID);

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
        return apiClient.invokeAPI("/provider/updateprovider/{providerID}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
