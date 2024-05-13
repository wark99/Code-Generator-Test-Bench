package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.AppError;
import org.openapitools.client.model.Role;

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
public class RolesApi {
    private ApiClient apiClient;

    public RolesApi() {
        this(new ApiClient());
    }

    public RolesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a list of all the roles
     * ##### Permissions  &#x60;manage_system&#x60; permission is required.  
     * <p><b>200</b> - Roles retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @return List&lt;Role&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Role> getAllRoles() throws RestClientException {
        return getAllRolesWithHttpInfo().getBody();
    }

    /**
     * Get a list of all the roles
     * ##### Permissions  &#x60;manage_system&#x60; permission is required.  
     * <p><b>200</b> - Roles retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @return ResponseEntity&lt;List&lt;Role&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Role>> getAllRolesWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<Role>> localReturnType = new ParameterizedTypeReference<List<Role>>() {};
        return apiClient.invokeAPI("/roles", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a role
     * Get a role from the provided role id.  ##### Permissions Requires an active session but no other permissions.  
     * <p><b>200</b> - Role retrieval successful
     * <p><b>401</b>
     * <p><b>404</b>
     * @param roleId Role GUID (required)
     * @return Role
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Role getRole(String roleId) throws RestClientException {
        return getRoleWithHttpInfo(roleId).getBody();
    }

    /**
     * Get a role
     * Get a role from the provided role id.  ##### Permissions Requires an active session but no other permissions.  
     * <p><b>200</b> - Role retrieval successful
     * <p><b>401</b>
     * <p><b>404</b>
     * @param roleId Role GUID (required)
     * @return ResponseEntity&lt;Role&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Role> getRoleWithHttpInfo(String roleId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'roleId' is set
        if (roleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'roleId' when calling getRole");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("role_id", roleId);

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

        ParameterizedTypeReference<Role> localReturnType = new ParameterizedTypeReference<Role>() {};
        return apiClient.invokeAPI("/roles/{role_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a role by name
     * Get a role from the provided role name.  ##### Permissions Requires an active session but no other permissions.  
     * <p><b>200</b> - Role retrieval successful
     * <p><b>401</b>
     * <p><b>404</b>
     * @param roleName Role Name (required)
     * @return Role
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Role getRoleByName(String roleName) throws RestClientException {
        return getRoleByNameWithHttpInfo(roleName).getBody();
    }

    /**
     * Get a role by name
     * Get a role from the provided role name.  ##### Permissions Requires an active session but no other permissions.  
     * <p><b>200</b> - Role retrieval successful
     * <p><b>401</b>
     * <p><b>404</b>
     * @param roleName Role Name (required)
     * @return ResponseEntity&lt;Role&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Role> getRoleByNameWithHttpInfo(String roleName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'roleName' when calling getRoleByName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("role_name", roleName);

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

        ParameterizedTypeReference<Role> localReturnType = new ParameterizedTypeReference<Role>() {};
        return apiClient.invokeAPI("/roles/name/{role_name}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of roles by name
     * Get a list of roles from their names.  ##### Permissions Requires an active session but no other permissions.  
     * <p><b>200</b> - Role list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param requestBody List of role names (required)
     * @return List&lt;Role&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Role> getRolesByNames(List<String> requestBody) throws RestClientException {
        return getRolesByNamesWithHttpInfo(requestBody).getBody();
    }

    /**
     * Get a list of roles by name
     * Get a list of roles from their names.  ##### Permissions Requires an active session but no other permissions.  
     * <p><b>200</b> - Role list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param requestBody List of role names (required)
     * @return ResponseEntity&lt;List&lt;Role&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Role>> getRolesByNamesWithHttpInfo(List<String> requestBody) throws RestClientException {
        Object localVarPostBody = requestBody;
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody' when calling getRolesByNames");
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

        ParameterizedTypeReference<List<Role>> localReturnType = new ParameterizedTypeReference<List<Role>>() {};
        return apiClient.invokeAPI("/roles/names", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
