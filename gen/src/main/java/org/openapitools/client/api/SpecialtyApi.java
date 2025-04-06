package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.RestError;
import org.openapitools.client.model.Specialty;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T13:21:26.399475655Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class SpecialtyApi {
    private ApiClient apiClient;

    public SpecialtyApi() {
        this(new ApiClient());
    }

    public SpecialtyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a specialty
     * Creates a specialty .
     * <p><b>200</b> - Specialty created successfully.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Specialty not found.
     * <p><b>500</b> - Server error.
     * @param specialty The specialty (required)
     * @return Specialty
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Specialty addSpecialty(Specialty specialty) throws RestClientException {
        return addSpecialtyWithHttpInfo(specialty).getBody();
    }

    /**
     * Create a specialty
     * Creates a specialty .
     * <p><b>200</b> - Specialty created successfully.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Specialty not found.
     * <p><b>500</b> - Server error.
     * @param specialty The specialty (required)
     * @return ResponseEntity&lt;Specialty&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Specialty> addSpecialtyWithHttpInfo(Specialty specialty) throws RestClientException {
        Object localVarPostBody = specialty;
        
        // verify the required parameter 'specialty' is set
        if (specialty == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'specialty' when calling addSpecialty");
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

        ParameterizedTypeReference<Specialty> localReturnType = new ParameterizedTypeReference<Specialty>() {};
        return apiClient.invokeAPI("/specialties", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a specialty by ID
     * Returns the specialty or a 404 error.
     * <p><b>200</b> - Specialty details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Specialty not found.
     * <p><b>500</b> - Server error.
     * @param specialtyId The ID of the specialty. (required)
     * @return Specialty
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Specialty deleteSpecialty(Integer specialtyId) throws RestClientException {
        return deleteSpecialtyWithHttpInfo(specialtyId).getBody();
    }

    /**
     * Delete a specialty by ID
     * Returns the specialty or a 404 error.
     * <p><b>200</b> - Specialty details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Specialty not found.
     * <p><b>500</b> - Server error.
     * @param specialtyId The ID of the specialty. (required)
     * @return ResponseEntity&lt;Specialty&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Specialty> deleteSpecialtyWithHttpInfo(Integer specialtyId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'specialtyId' is set
        if (specialtyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'specialtyId' when calling deleteSpecialty");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("specialtyId", specialtyId);

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

        ParameterizedTypeReference<Specialty> localReturnType = new ParameterizedTypeReference<Specialty>() {};
        return apiClient.invokeAPI("/specialties/{specialtyId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a specialty by ID
     * Returns the specialty or a 404 error.
     * <p><b>200</b> - Specialty details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Specialty not found.
     * <p><b>500</b> - Server error.
     * @param specialtyId The ID of the speciality. (required)
     * @return Specialty
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Specialty getSpecialty(Integer specialtyId) throws RestClientException {
        return getSpecialtyWithHttpInfo(specialtyId).getBody();
    }

    /**
     * Get a specialty by ID
     * Returns the specialty or a 404 error.
     * <p><b>200</b> - Specialty details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Specialty not found.
     * <p><b>500</b> - Server error.
     * @param specialtyId The ID of the speciality. (required)
     * @return ResponseEntity&lt;Specialty&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Specialty> getSpecialtyWithHttpInfo(Integer specialtyId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'specialtyId' is set
        if (specialtyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'specialtyId' when calling getSpecialty");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("specialtyId", specialtyId);

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

        ParameterizedTypeReference<Specialty> localReturnType = new ParameterizedTypeReference<Specialty>() {};
        return apiClient.invokeAPI("/specialties/{specialtyId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lists specialties
     * Returns an array of specialty .
     * <p><b>200</b> - Specialties found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>500</b> - Server error.
     * @return List&lt;Specialty&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Specialty> listSpecialties() throws RestClientException {
        return listSpecialtiesWithHttpInfo().getBody();
    }

    /**
     * Lists specialties
     * Returns an array of specialty .
     * <p><b>200</b> - Specialties found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>500</b> - Server error.
     * @return ResponseEntity&lt;List&lt;Specialty&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Specialty>> listSpecialtiesWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<Specialty>> localReturnType = new ParameterizedTypeReference<List<Specialty>>() {};
        return apiClient.invokeAPI("/specialties", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a specialty by ID
     * Returns the specialty or a 404 error.
     * <p><b>200</b> - Specialty details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Specialty not found.
     * <p><b>500</b> - Server error.
     * @param specialtyId The ID of the specialty. (required)
     * @param specialty The pet (required)
     * @return Specialty
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Specialty updateSpecialty(Integer specialtyId, Specialty specialty) throws RestClientException {
        return updateSpecialtyWithHttpInfo(specialtyId, specialty).getBody();
    }

    /**
     * Update a specialty by ID
     * Returns the specialty or a 404 error.
     * <p><b>200</b> - Specialty details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Specialty not found.
     * <p><b>500</b> - Server error.
     * @param specialtyId The ID of the specialty. (required)
     * @param specialty The pet (required)
     * @return ResponseEntity&lt;Specialty&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Specialty> updateSpecialtyWithHttpInfo(Integer specialtyId, Specialty specialty) throws RestClientException {
        Object localVarPostBody = specialty;
        
        // verify the required parameter 'specialtyId' is set
        if (specialtyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'specialtyId' when calling updateSpecialty");
        }
        
        // verify the required parameter 'specialty' is set
        if (specialty == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'specialty' when calling updateSpecialty");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("specialtyId", specialtyId);

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

        ParameterizedTypeReference<Specialty> localReturnType = new ParameterizedTypeReference<Specialty>() {};
        return apiClient.invokeAPI("/specialties/{specialtyId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
