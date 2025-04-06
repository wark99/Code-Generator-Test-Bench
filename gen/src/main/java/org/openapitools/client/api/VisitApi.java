package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.RestError;
import org.openapitools.client.model.Visit;
import org.openapitools.client.model.VisitFields;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T12:57:54.093984188Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class VisitApi {
    private ApiClient apiClient;

    public VisitApi() {
        this(new ApiClient());
    }

    public VisitApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a visit
     * Creates a visit.
     * <p><b>200</b> - visit created successfully.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Visit not found.
     * <p><b>500</b> - Server error.
     * @param visit The visit (required)
     * @return Visit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Visit addVisit(Visit visit) throws RestClientException {
        return addVisitWithHttpInfo(visit).getBody();
    }

    /**
     * Create a visit
     * Creates a visit.
     * <p><b>200</b> - visit created successfully.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Visit not found.
     * <p><b>500</b> - Server error.
     * @param visit The visit (required)
     * @return ResponseEntity&lt;Visit&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Visit> addVisitWithHttpInfo(Visit visit) throws RestClientException {
        Object localVarPostBody = visit;
        
        // verify the required parameter 'visit' is set
        if (visit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'visit' when calling addVisit");
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

        ParameterizedTypeReference<Visit> localReturnType = new ParameterizedTypeReference<Visit>() {};
        return apiClient.invokeAPI("/visits", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Adds a vet visit
     * Records the details of a new vet visit.
     * <p><b>201</b> - The vet visit was sucessfully added.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet not found for this owner.
     * <p><b>500</b> - Server error.
     * @param ownerId The ID of the pet owner. (required)
     * @param petId The ID of the pet. (required)
     * @param visitFields The details of the new vet visit. (required)
     * @return Visit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Visit addVisitToOwner(Integer ownerId, Integer petId, VisitFields visitFields) throws RestClientException {
        return addVisitToOwnerWithHttpInfo(ownerId, petId, visitFields).getBody();
    }

    /**
     * Adds a vet visit
     * Records the details of a new vet visit.
     * <p><b>201</b> - The vet visit was sucessfully added.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet not found for this owner.
     * <p><b>500</b> - Server error.
     * @param ownerId The ID of the pet owner. (required)
     * @param petId The ID of the pet. (required)
     * @param visitFields The details of the new vet visit. (required)
     * @return ResponseEntity&lt;Visit&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Visit> addVisitToOwnerWithHttpInfo(Integer ownerId, Integer petId, VisitFields visitFields) throws RestClientException {
        Object localVarPostBody = visitFields;
        
        // verify the required parameter 'ownerId' is set
        if (ownerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ownerId' when calling addVisitToOwner");
        }
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'petId' when calling addVisitToOwner");
        }
        
        // verify the required parameter 'visitFields' is set
        if (visitFields == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'visitFields' when calling addVisitToOwner");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("ownerId", ownerId);
        uriVariables.put("petId", petId);

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

        ParameterizedTypeReference<Visit> localReturnType = new ParameterizedTypeReference<Visit>() {};
        return apiClient.invokeAPI("/owners/{ownerId}/pets/{petId}/visits", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a visit by ID
     * Returns the visit or a 404 error.
     * <p><b>200</b> - Visit details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Visit not found.
     * <p><b>500</b> - Server error.
     * @param visitId The ID of the visit. (required)
     * @return Visit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Visit deleteVisit(Integer visitId) throws RestClientException {
        return deleteVisitWithHttpInfo(visitId).getBody();
    }

    /**
     * Delete a visit by ID
     * Returns the visit or a 404 error.
     * <p><b>200</b> - Visit details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Visit not found.
     * <p><b>500</b> - Server error.
     * @param visitId The ID of the visit. (required)
     * @return ResponseEntity&lt;Visit&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Visit> deleteVisitWithHttpInfo(Integer visitId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'visitId' is set
        if (visitId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'visitId' when calling deleteVisit");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("visitId", visitId);

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

        ParameterizedTypeReference<Visit> localReturnType = new ParameterizedTypeReference<Visit>() {};
        return apiClient.invokeAPI("/visits/{visitId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a visit by ID
     * Returns the visit or a 404 error.
     * <p><b>200</b> - Visit details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Visit not found.
     * <p><b>500</b> - Server error.
     * @param visitId The ID of the visit. (required)
     * @return Visit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Visit getVisit(Integer visitId) throws RestClientException {
        return getVisitWithHttpInfo(visitId).getBody();
    }

    /**
     * Get a visit by ID
     * Returns the visit or a 404 error.
     * <p><b>200</b> - Visit details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Visit not found.
     * <p><b>500</b> - Server error.
     * @param visitId The ID of the visit. (required)
     * @return ResponseEntity&lt;Visit&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Visit> getVisitWithHttpInfo(Integer visitId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'visitId' is set
        if (visitId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'visitId' when calling getVisit");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("visitId", visitId);

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

        ParameterizedTypeReference<Visit> localReturnType = new ParameterizedTypeReference<Visit>() {};
        return apiClient.invokeAPI("/visits/{visitId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lists visits
     * Returns an array of visit .
     * <p><b>200</b> - visits found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>500</b> - Server error.
     * @return List&lt;Visit&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Visit> listVisits() throws RestClientException {
        return listVisitsWithHttpInfo().getBody();
    }

    /**
     * Lists visits
     * Returns an array of visit .
     * <p><b>200</b> - visits found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>500</b> - Server error.
     * @return ResponseEntity&lt;List&lt;Visit&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Visit>> listVisitsWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<Visit>> localReturnType = new ParameterizedTypeReference<List<Visit>>() {};
        return apiClient.invokeAPI("/visits", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a visit by ID
     * Returns the visit or a 404 error.
     * <p><b>200</b> - Visit details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Visit not found.
     * <p><b>500</b> - Server error.
     * @param visitId The ID of the visit. (required)
     * @param visit The visit (required)
     * @return Visit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Visit updateVisit(Integer visitId, Visit visit) throws RestClientException {
        return updateVisitWithHttpInfo(visitId, visit).getBody();
    }

    /**
     * Update a visit by ID
     * Returns the visit or a 404 error.
     * <p><b>200</b> - Visit details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Visit not found.
     * <p><b>500</b> - Server error.
     * @param visitId The ID of the visit. (required)
     * @param visit The visit (required)
     * @return ResponseEntity&lt;Visit&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Visit> updateVisitWithHttpInfo(Integer visitId, Visit visit) throws RestClientException {
        Object localVarPostBody = visit;
        
        // verify the required parameter 'visitId' is set
        if (visitId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'visitId' when calling updateVisit");
        }
        
        // verify the required parameter 'visit' is set
        if (visit == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'visit' when calling updateVisit");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("visitId", visitId);

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

        ParameterizedTypeReference<Visit> localReturnType = new ParameterizedTypeReference<Visit>() {};
        return apiClient.invokeAPI("/visits/{visitId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
