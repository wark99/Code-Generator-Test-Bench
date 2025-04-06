package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Pet;
import org.openapitools.client.model.PetFields;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T14:15:56.494173487Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PetApi {
    private ApiClient apiClient;

    public PetApi() {
        this(new ApiClient());
    }

    public PetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a pet
     * Creates a pet .
     * <p><b>200</b> - Pet type created successfully.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet not found.
     * <p><b>500</b> - Server error.
     * @param pet The pet (required)
     * @return Pet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Pet addPet(Pet pet) throws RestClientException {
        return addPetWithHttpInfo(pet).getBody();
    }

    /**
     * Create a pet
     * Creates a pet .
     * <p><b>200</b> - Pet type created successfully.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet not found.
     * <p><b>500</b> - Server error.
     * @param pet The pet (required)
     * @return ResponseEntity&lt;Pet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Pet> addPetWithHttpInfo(Pet pet) throws RestClientException {
        Object localVarPostBody = pet;
        
        // verify the required parameter 'pet' is set
        if (pet == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pet' when calling addPet");
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

        ParameterizedTypeReference<Pet> localReturnType = new ParameterizedTypeReference<Pet>() {};
        return apiClient.invokeAPI("/pets", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Adds a pet to an owner
     * Records the details of a new pet.
     * <p><b>201</b> - The pet was sucessfully added.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet not found.
     * <p><b>500</b> - Server error.
     * @param ownerId The ID of the pet owner. (required)
     * @param petFields The details of the new pet. (required)
     * @return Pet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Pet addPetToOwner(Integer ownerId, PetFields petFields) throws RestClientException {
        return addPetToOwnerWithHttpInfo(ownerId, petFields).getBody();
    }

    /**
     * Adds a pet to an owner
     * Records the details of a new pet.
     * <p><b>201</b> - The pet was sucessfully added.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet not found.
     * <p><b>500</b> - Server error.
     * @param ownerId The ID of the pet owner. (required)
     * @param petFields The details of the new pet. (required)
     * @return ResponseEntity&lt;Pet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Pet> addPetToOwnerWithHttpInfo(Integer ownerId, PetFields petFields) throws RestClientException {
        Object localVarPostBody = petFields;
        
        // verify the required parameter 'ownerId' is set
        if (ownerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ownerId' when calling addPetToOwner");
        }
        
        // verify the required parameter 'petFields' is set
        if (petFields == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'petFields' when calling addPetToOwner");
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

        ParameterizedTypeReference<Pet> localReturnType = new ParameterizedTypeReference<Pet>() {};
        return apiClient.invokeAPI("/owners/{ownerId}/pets", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a pet by ID
     * Returns the pet or a 404 error.
     * <p><b>200</b> - Pet details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet not found.
     * <p><b>500</b> - Server error.
     * @param petId The ID of the pet. (required)
     * @return Pet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Pet deletePet(Integer petId) throws RestClientException {
        return deletePetWithHttpInfo(petId).getBody();
    }

    /**
     * Delete a pet by ID
     * Returns the pet or a 404 error.
     * <p><b>200</b> - Pet details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet not found.
     * <p><b>500</b> - Server error.
     * @param petId The ID of the pet. (required)
     * @return ResponseEntity&lt;Pet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Pet> deletePetWithHttpInfo(Integer petId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'petId' when calling deletePet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("petId", petId);

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

        ParameterizedTypeReference<Pet> localReturnType = new ParameterizedTypeReference<Pet>() {};
        return apiClient.invokeAPI("/pets/{petId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a pet by ID
     * Returns the pet or a 404 error.
     * <p><b>200</b> - Pet details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet not found.
     * <p><b>500</b> - Server error.
     * @param ownerId The ID of the pet owner. (required)
     * @param petId The ID of the pet. (required)
     * @return Pet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Pet getOwnersPet(Integer ownerId, Integer petId) throws RestClientException {
        return getOwnersPetWithHttpInfo(ownerId, petId).getBody();
    }

    /**
     * Get a pet by ID
     * Returns the pet or a 404 error.
     * <p><b>200</b> - Pet details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet not found.
     * <p><b>500</b> - Server error.
     * @param ownerId The ID of the pet owner. (required)
     * @param petId The ID of the pet. (required)
     * @return ResponseEntity&lt;Pet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Pet> getOwnersPetWithHttpInfo(Integer ownerId, Integer petId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ownerId' is set
        if (ownerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ownerId' when calling getOwnersPet");
        }
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'petId' when calling getOwnersPet");
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Pet> localReturnType = new ParameterizedTypeReference<Pet>() {};
        return apiClient.invokeAPI("/owners/{ownerId}/pets/{petId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a pet by ID
     * Returns the pet  or a 404 error.
     * <p><b>200</b> - Pet details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet not found.
     * <p><b>500</b> - Server error.
     * @param petId The ID of the pet. (required)
     * @return Pet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Pet getPet(Integer petId) throws RestClientException {
        return getPetWithHttpInfo(petId).getBody();
    }

    /**
     * Get a pet by ID
     * Returns the pet  or a 404 error.
     * <p><b>200</b> - Pet details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet not found.
     * <p><b>500</b> - Server error.
     * @param petId The ID of the pet. (required)
     * @return ResponseEntity&lt;Pet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Pet> getPetWithHttpInfo(Integer petId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'petId' when calling getPet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("petId", petId);

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

        ParameterizedTypeReference<Pet> localReturnType = new ParameterizedTypeReference<Pet>() {};
        return apiClient.invokeAPI("/pets/{petId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lists pet
     * Returns an array of pet .
     * <p><b>200</b> - Pet types found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>500</b> - Server error.
     * @return List&lt;Pet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Pet> listPets() throws RestClientException {
        return listPetsWithHttpInfo().getBody();
    }

    /**
     * Lists pet
     * Returns an array of pet .
     * <p><b>200</b> - Pet types found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>500</b> - Server error.
     * @return ResponseEntity&lt;List&lt;Pet&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Pet>> listPetsWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<Pet>> localReturnType = new ParameterizedTypeReference<List<Pet>>() {};
        return apiClient.invokeAPI("/pets", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a pet&#39;s details
     * Updates the pet record with the specified details.
     * <p><b>204</b> - Update successful.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet not found for this owner.
     * <p><b>500</b> - Server error.
     * @param ownerId The ID of the pet owner. (required)
     * @param petId The ID of the pet. (required)
     * @param petFields The pet details to use for the update. (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateOwnersPet(Integer ownerId, Integer petId, PetFields petFields) throws RestClientException {
        updateOwnersPetWithHttpInfo(ownerId, petId, petFields);
    }

    /**
     * Update a pet&#39;s details
     * Updates the pet record with the specified details.
     * <p><b>204</b> - Update successful.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet not found for this owner.
     * <p><b>500</b> - Server error.
     * @param ownerId The ID of the pet owner. (required)
     * @param petId The ID of the pet. (required)
     * @param petFields The pet details to use for the update. (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateOwnersPetWithHttpInfo(Integer ownerId, Integer petId, PetFields petFields) throws RestClientException {
        Object localVarPostBody = petFields;
        
        // verify the required parameter 'ownerId' is set
        if (ownerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ownerId' when calling updateOwnersPet");
        }
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'petId' when calling updateOwnersPet");
        }
        
        // verify the required parameter 'petFields' is set
        if (petFields == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'petFields' when calling updateOwnersPet");
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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/owners/{ownerId}/pets/{petId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a pet by ID
     * Returns the pet or a 404 error.
     * <p><b>200</b> - Pet details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet not found.
     * <p><b>500</b> - Server error.
     * @param petId The ID of the pet. (required)
     * @param pet The pet (required)
     * @return Pet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Pet updatePet(Integer petId, Pet pet) throws RestClientException {
        return updatePetWithHttpInfo(petId, pet).getBody();
    }

    /**
     * Update a pet by ID
     * Returns the pet or a 404 error.
     * <p><b>200</b> - Pet details found and returned.
     * <p><b>304</b> - Not modified.
     * <p><b>400</b> - Bad request.
     * <p><b>404</b> - Pet not found.
     * <p><b>500</b> - Server error.
     * @param petId The ID of the pet. (required)
     * @param pet The pet (required)
     * @return ResponseEntity&lt;Pet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Pet> updatePetWithHttpInfo(Integer petId, Pet pet) throws RestClientException {
        Object localVarPostBody = pet;
        
        // verify the required parameter 'petId' is set
        if (petId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'petId' when calling updatePet");
        }
        
        // verify the required parameter 'pet' is set
        if (pet == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pet' when calling updatePet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
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

        ParameterizedTypeReference<Pet> localReturnType = new ParameterizedTypeReference<Pet>() {};
        return apiClient.invokeAPI("/pets/{petId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
