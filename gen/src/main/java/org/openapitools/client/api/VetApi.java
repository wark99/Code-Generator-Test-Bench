package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.RestError;
import org.openapitools.client.model.Vet;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T14:05:59.287652124Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class VetApi {
    private ApiClient apiClient;

    public VetApi() {
        this(new ApiClient());
    }

    public VetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a Vet
     * Creates a vet .
     * <p><b>200</b> - Vet created successfully.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Vet not found.
     * <p><b>500</b> - Server error.
     * @param vet The vet (required)
     * @return Vet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Vet addVet(Vet vet) throws RestClientException {
        return addVetWithHttpInfo(vet).getBody();
    }

    /**
     * Create a Vet
     * Creates a vet .
     * <p><b>200</b> - Vet created successfully.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Vet not found.
     * <p><b>500</b> - Server error.
     * @param vet The vet (required)
     * @return ResponseEntity&lt;Vet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Vet> addVetWithHttpInfo(Vet vet) throws RestClientException {
        Object localVarPostBody = vet;
        
        // verify the required parameter 'vet' is set
        if (vet == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vet' when calling addVet");
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

        ParameterizedTypeReference<Vet> localReturnType = new ParameterizedTypeReference<Vet>() {};
        return apiClient.invokeAPI("/vets", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a vet by ID
     * Returns the vet or a 404 error.
     * <p><b>200</b> - Vet details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Vet not found.
     * <p><b>500</b> - Server error.
     * @param vetId The ID of the vet. (required)
     * @return Vet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Vet deleteVet(Integer vetId) throws RestClientException {
        return deleteVetWithHttpInfo(vetId).getBody();
    }

    /**
     * Delete a vet by ID
     * Returns the vet or a 404 error.
     * <p><b>200</b> - Vet details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Vet not found.
     * <p><b>500</b> - Server error.
     * @param vetId The ID of the vet. (required)
     * @return ResponseEntity&lt;Vet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Vet> deleteVetWithHttpInfo(Integer vetId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vetId' is set
        if (vetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vetId' when calling deleteVet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vetId", vetId);

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

        ParameterizedTypeReference<Vet> localReturnType = new ParameterizedTypeReference<Vet>() {};
        return apiClient.invokeAPI("/vets/{vetId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a vet by ID
     * Returns the vet or a 404 error.
     * <p><b>200</b> - Vet details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Vet not found.
     * <p><b>500</b> - Server error.
     * @param vetId The ID of the vet. (required)
     * @return Vet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Vet getVet(Integer vetId) throws RestClientException {
        return getVetWithHttpInfo(vetId).getBody();
    }

    /**
     * Get a vet by ID
     * Returns the vet or a 404 error.
     * <p><b>200</b> - Vet details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Vet not found.
     * <p><b>500</b> - Server error.
     * @param vetId The ID of the vet. (required)
     * @return ResponseEntity&lt;Vet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Vet> getVetWithHttpInfo(Integer vetId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'vetId' is set
        if (vetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vetId' when calling getVet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vetId", vetId);

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

        ParameterizedTypeReference<Vet> localReturnType = new ParameterizedTypeReference<Vet>() {};
        return apiClient.invokeAPI("/vets/{vetId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lists vets
     * Returns an array of vets.
     * <p><b>200</b> - Vets found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>500</b> - Server error.
     * @return List&lt;Vet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Vet> listVets() throws RestClientException {
        return listVetsWithHttpInfo().getBody();
    }

    /**
     * Lists vets
     * Returns an array of vets.
     * <p><b>200</b> - Vets found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>500</b> - Server error.
     * @return ResponseEntity&lt;List&lt;Vet&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Vet>> listVetsWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<Vet>> localReturnType = new ParameterizedTypeReference<List<Vet>>() {};
        return apiClient.invokeAPI("/vets", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a vet  by ID
     * Returns the vet or a 404 error.
     * <p><b>200</b> - Pet type details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Vet not found.
     * <p><b>500</b> - Server error.
     * @param vetId The ID of the vet. (required)
     * @param vet The vet (required)
     * @return Vet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Vet updateVet(Integer vetId, Vet vet) throws RestClientException {
        return updateVetWithHttpInfo(vetId, vet).getBody();
    }

    /**
     * Update a vet  by ID
     * Returns the vet or a 404 error.
     * <p><b>200</b> - Pet type details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Vet not found.
     * <p><b>500</b> - Server error.
     * @param vetId The ID of the vet. (required)
     * @param vet The vet (required)
     * @return ResponseEntity&lt;Vet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Vet> updateVetWithHttpInfo(Integer vetId, Vet vet) throws RestClientException {
        Object localVarPostBody = vet;
        
        // verify the required parameter 'vetId' is set
        if (vetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vetId' when calling updateVet");
        }
        
        // verify the required parameter 'vet' is set
        if (vet == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vet' when calling updateVet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vetId", vetId);

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

        ParameterizedTypeReference<Vet> localReturnType = new ParameterizedTypeReference<Vet>() {};
        return apiClient.invokeAPI("/vets/{vetId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
