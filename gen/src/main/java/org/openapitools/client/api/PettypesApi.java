package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.PetType;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T12:50:50.922808494Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PettypesApi {
    private ApiClient apiClient;

    public PettypesApi() {
        this(new ApiClient());
    }

    public PettypesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a pet type
     * Creates a pet type .
     * <p><b>200</b> - Pet type created successfully.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet Type not found.
     * <p><b>500</b> - Server error.
     * @param petType The pet type (required)
     * @return PetType
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PetType addPetType(PetType petType) throws RestClientException {
        return addPetTypeWithHttpInfo(petType).getBody();
    }

    /**
     * Create a pet type
     * Creates a pet type .
     * <p><b>200</b> - Pet type created successfully.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet Type not found.
     * <p><b>500</b> - Server error.
     * @param petType The pet type (required)
     * @return ResponseEntity&lt;PetType&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PetType> addPetTypeWithHttpInfo(PetType petType) throws RestClientException {
        Object localVarPostBody = petType;
        
        // verify the required parameter 'petType' is set
        if (petType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'petType' when calling addPetType");
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

        ParameterizedTypeReference<PetType> localReturnType = new ParameterizedTypeReference<PetType>() {};
        return apiClient.invokeAPI("/pettypes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a pet type by ID
     * Returns the pet type or a 404 error.
     * <p><b>200</b> - Pet type details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet type not found.
     * <p><b>500</b> - Server error.
     * @param petTypeId The ID of the pet type. (required)
     * @return PetType
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PetType deletePetType(Integer petTypeId) throws RestClientException {
        return deletePetTypeWithHttpInfo(petTypeId).getBody();
    }

    /**
     * Delete a pet type by ID
     * Returns the pet type or a 404 error.
     * <p><b>200</b> - Pet type details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet type not found.
     * <p><b>500</b> - Server error.
     * @param petTypeId The ID of the pet type. (required)
     * @return ResponseEntity&lt;PetType&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PetType> deletePetTypeWithHttpInfo(Integer petTypeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'petTypeId' is set
        if (petTypeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'petTypeId' when calling deletePetType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("petTypeId", petTypeId);

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

        ParameterizedTypeReference<PetType> localReturnType = new ParameterizedTypeReference<PetType>() {};
        return apiClient.invokeAPI("/pettypes/{petTypeId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a pet type by ID
     * Returns the pet type or a 404 error.
     * <p><b>200</b> - Pet type details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet Type not found.
     * <p><b>500</b> - Server error.
     * @param petTypeId The ID of the pet type. (required)
     * @return PetType
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PetType getPetType(Integer petTypeId) throws RestClientException {
        return getPetTypeWithHttpInfo(petTypeId).getBody();
    }

    /**
     * Get a pet type by ID
     * Returns the pet type or a 404 error.
     * <p><b>200</b> - Pet type details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet Type not found.
     * <p><b>500</b> - Server error.
     * @param petTypeId The ID of the pet type. (required)
     * @return ResponseEntity&lt;PetType&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PetType> getPetTypeWithHttpInfo(Integer petTypeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'petTypeId' is set
        if (petTypeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'petTypeId' when calling getPetType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("petTypeId", petTypeId);

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

        ParameterizedTypeReference<PetType> localReturnType = new ParameterizedTypeReference<PetType>() {};
        return apiClient.invokeAPI("/pettypes/{petTypeId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lists pet types
     * Returns an array of pet types.
     * <p><b>200</b> - Pet types found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>500</b> - Server error.
     * @return List&lt;PetType&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PetType> listPetTypes() throws RestClientException {
        return listPetTypesWithHttpInfo().getBody();
    }

    /**
     * Lists pet types
     * Returns an array of pet types.
     * <p><b>200</b> - Pet types found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>500</b> - Server error.
     * @return ResponseEntity&lt;List&lt;PetType&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PetType>> listPetTypesWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<PetType>> localReturnType = new ParameterizedTypeReference<List<PetType>>() {};
        return apiClient.invokeAPI("/pettypes", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a pet type by ID
     * Returns the pet type or a 404 error.
     * <p><b>200</b> - Pet type details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet Type not found.
     * <p><b>500</b> - Server error.
     * @param petTypeId The ID of the pet type. (required)
     * @param petType The pet type (required)
     * @return PetType
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PetType updatePetType(Integer petTypeId, PetType petType) throws RestClientException {
        return updatePetTypeWithHttpInfo(petTypeId, petType).getBody();
    }

    /**
     * Update a pet type by ID
     * Returns the pet type or a 404 error.
     * <p><b>200</b> - Pet type details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet Type not found.
     * <p><b>500</b> - Server error.
     * @param petTypeId The ID of the pet type. (required)
     * @param petType The pet type (required)
     * @return ResponseEntity&lt;PetType&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PetType> updatePetTypeWithHttpInfo(Integer petTypeId, PetType petType) throws RestClientException {
        Object localVarPostBody = petType;
        
        // verify the required parameter 'petTypeId' is set
        if (petTypeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'petTypeId' when calling updatePetType");
        }
        
        // verify the required parameter 'petType' is set
        if (petType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'petType' when calling updatePetType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("petTypeId", petTypeId);

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

        ParameterizedTypeReference<PetType> localReturnType = new ParameterizedTypeReference<PetType>() {};
        return apiClient.invokeAPI("/pettypes/{petTypeId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
