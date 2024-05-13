package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.AppError;
import org.openapitools.client.model.Preference;
import org.openapitools.client.model.StatusOK;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PreferencesApi {
    private ApiClient apiClient;

    public PreferencesApi() {
        this(new ApiClient());
    }

    public PreferencesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete user&#39;s preferences
     * Delete a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User preferences saved successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User GUID (required)
     * @param preference List of preference objects (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK deletePreferences(String userId, List<Preference> preference) throws RestClientException {
        return deletePreferencesWithHttpInfo(userId, preference).getBody();
    }

    /**
     * Delete user&#39;s preferences
     * Delete a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User preferences saved successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User GUID (required)
     * @param preference List of preference objects (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> deletePreferencesWithHttpInfo(String userId, List<Preference> preference) throws RestClientException {
        Object localVarPostBody = preference;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling deletePreferences");
        }
        
        // verify the required parameter 'preference' is set
        if (preference == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'preference' when calling deletePreferences");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);

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

        ParameterizedTypeReference<StatusOK> localReturnType = new ParameterizedTypeReference<StatusOK>() {};
        return apiClient.invokeAPI("/users/{user_id}/preferences/delete", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the user&#39;s preferences
     * Get a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User preferences retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User GUID (required)
     * @return List&lt;Preference&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Preference> getPreferences(String userId) throws RestClientException {
        return getPreferencesWithHttpInfo(userId).getBody();
    }

    /**
     * Get the user&#39;s preferences
     * Get a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User preferences retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User GUID (required)
     * @return ResponseEntity&lt;List&lt;Preference&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Preference>> getPreferencesWithHttpInfo(String userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getPreferences");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);

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

        ParameterizedTypeReference<List<Preference>> localReturnType = new ParameterizedTypeReference<List<Preference>>() {};
        return apiClient.invokeAPI("/users/{user_id}/preferences", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List a user&#39;s preferences by category
     * Lists the current user&#39;s stored preferences in the given category. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - A list of all of the current user&#39;s preferences in the given category
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User GUID (required)
     * @param category The category of a group of preferences (required)
     * @return List&lt;Preference&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Preference> getPreferencesByCategory(String userId, String category) throws RestClientException {
        return getPreferencesByCategoryWithHttpInfo(userId, category).getBody();
    }

    /**
     * List a user&#39;s preferences by category
     * Lists the current user&#39;s stored preferences in the given category. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - A list of all of the current user&#39;s preferences in the given category
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId User GUID (required)
     * @param category The category of a group of preferences (required)
     * @return ResponseEntity&lt;List&lt;Preference&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Preference>> getPreferencesByCategoryWithHttpInfo(String userId, String category) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getPreferencesByCategory");
        }
        
        // verify the required parameter 'category' is set
        if (category == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'category' when calling getPreferencesByCategory");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("category", category);

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

        ParameterizedTypeReference<List<Preference>> localReturnType = new ParameterizedTypeReference<List<Preference>>() {};
        return apiClient.invokeAPI("/users/{user_id}/preferences/{category}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a specific user preference
     * Gets a single preference for the current user with the given category and name. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - A single preference for the current user in the current categorylist of all of the current user&#39;s preferences in the given category. 
     * <p><b>400</b>
     * <p><b>401</b>
     * @param userId User GUID (required)
     * @param category The category of a group of preferences (required)
     * @param preferenceName The name of the preference (required)
     * @return Preference
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Preference getPreferencesByCategoryByName(String userId, String category, String preferenceName) throws RestClientException {
        return getPreferencesByCategoryByNameWithHttpInfo(userId, category, preferenceName).getBody();
    }

    /**
     * Get a specific user preference
     * Gets a single preference for the current user with the given category and name. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - A single preference for the current user in the current categorylist of all of the current user&#39;s preferences in the given category. 
     * <p><b>400</b>
     * <p><b>401</b>
     * @param userId User GUID (required)
     * @param category The category of a group of preferences (required)
     * @param preferenceName The name of the preference (required)
     * @return ResponseEntity&lt;Preference&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Preference> getPreferencesByCategoryByNameWithHttpInfo(String userId, String category, String preferenceName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling getPreferencesByCategoryByName");
        }
        
        // verify the required parameter 'category' is set
        if (category == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'category' when calling getPreferencesByCategoryByName");
        }
        
        // verify the required parameter 'preferenceName' is set
        if (preferenceName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'preferenceName' when calling getPreferencesByCategoryByName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("category", category);
        uriVariables.put("preference_name", preferenceName);

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

        ParameterizedTypeReference<Preference> localReturnType = new ParameterizedTypeReference<Preference>() {};
        return apiClient.invokeAPI("/users/{user_id}/preferences/{category}/name/{preference_name}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Save the user&#39;s preferences
     * Save a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User preferences saved successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param userId User GUID (required)
     * @param preference List of preference objects (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK updatePreferences(String userId, List<Preference> preference) throws RestClientException {
        return updatePreferencesWithHttpInfo(userId, preference).getBody();
    }

    /**
     * Save the user&#39;s preferences
     * Save a list of the user&#39;s preferences. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 
     * <p><b>200</b> - User preferences saved successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param userId User GUID (required)
     * @param preference List of preference objects (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> updatePreferencesWithHttpInfo(String userId, List<Preference> preference) throws RestClientException {
        Object localVarPostBody = preference;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling updatePreferences");
        }
        
        // verify the required parameter 'preference' is set
        if (preference == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'preference' when calling updatePreferences");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);

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

        ParameterizedTypeReference<StatusOK> localReturnType = new ParameterizedTypeReference<StatusOK>() {};
        return apiClient.invokeAPI("/users/{user_id}/preferences", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
