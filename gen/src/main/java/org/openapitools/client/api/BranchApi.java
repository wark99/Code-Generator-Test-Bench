package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BranchDetails;
import org.openapitools.client.model.BranchGames;
import org.openapitools.client.model.BranchMeets;
import org.openapitools.client.model.BranchResource;
import org.openapitools.client.model.BranchTables;
import org.openapitools.client.model.BranchVenues;
import java.util.UUID;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:40.667796194Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BranchApi {
    private ApiClient apiClient;

    public BranchApi() {
        this(new ApiClient());
    }

    public BranchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new branch
     * Update an existing branch by Id
     * @param branchResource Update an existent branch in the store (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addBranch(BranchResource branchResource) throws RestClientException {
        addBranchWithHttpInfo(branchResource);
    }

    /**
     * Create a new branch
     * Update an existing branch by Id
     * @param branchResource Update an existent branch in the store (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> addBranchWithHttpInfo(BranchResource branchResource) throws RestClientException {
        Object localVarPostBody = branchResource;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/hal+json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/branch", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Show branch information
     * Show an existing branch by Id
     * <p><b>200</b> - Show the branch
     * @param branchId ID of the branch (required)
     * @return BranchDetails
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BranchDetails showBranch(UUID branchId) throws RestClientException {
        return showBranchWithHttpInfo(branchId).getBody();
    }

    /**
     * Show branch information
     * Show an existing branch by Id
     * <p><b>200</b> - Show the branch
     * @param branchId ID of the branch (required)
     * @return ResponseEntity&lt;BranchDetails&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BranchDetails> showBranchWithHttpInfo(UUID branchId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'branchId' is set
        if (branchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'branchId' when calling showBranch");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("branchId", branchId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/hal+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<BranchDetails> localReturnType = new ParameterizedTypeReference<BranchDetails>() {};
        return apiClient.invokeAPI("/branch/{branchId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns all the games for a branch
     * Show all the games for a branch
     * <p><b>200</b> - Show all the games for a branch
     * @param branchId ID of the branch (required)
     * @return List&lt;BranchGames&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BranchGames> showBranchGames(UUID branchId) throws RestClientException {
        return showBranchGamesWithHttpInfo(branchId).getBody();
    }

    /**
     * Returns all the games for a branch
     * Show all the games for a branch
     * <p><b>200</b> - Show all the games for a branch
     * @param branchId ID of the branch (required)
     * @return ResponseEntity&lt;List&lt;BranchGames&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BranchGames>> showBranchGamesWithHttpInfo(UUID branchId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'branchId' is set
        if (branchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'branchId' when calling showBranchGames");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("branchId", branchId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/hal+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<BranchGames>> localReturnType = new ParameterizedTypeReference<List<BranchGames>>() {};
        return apiClient.invokeAPI("/branch/{branchId}/games", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Show all planned game meets for a branch
     * 
     * <p><b>200</b> - show Meets
     * @param branchId ID of the branch (required)
     * @return List&lt;BranchMeets&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BranchMeets> showBranchMeets(UUID branchId) throws RestClientException {
        return showBranchMeetsWithHttpInfo(branchId).getBody();
    }

    /**
     * Show all planned game meets for a branch
     * 
     * <p><b>200</b> - show Meets
     * @param branchId ID of the branch (required)
     * @return ResponseEntity&lt;List&lt;BranchMeets&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BranchMeets>> showBranchMeetsWithHttpInfo(UUID branchId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'branchId' is set
        if (branchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'branchId' when calling showBranchMeets");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("branchId", branchId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/hal+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<BranchMeets>> localReturnType = new ParameterizedTypeReference<List<BranchMeets>>() {};
        return apiClient.invokeAPI("/branch/{branchId}/meets", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Show branch tables
     * @param branchId ID of the branch (required)
     * @return BranchTables
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BranchTables showBranchTables(UUID branchId) throws RestClientException {
        return showBranchTablesWithHttpInfo(branchId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Show branch tables
     * @param branchId ID of the branch (required)
     * @return ResponseEntity&lt;BranchTables&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BranchTables> showBranchTablesWithHttpInfo(UUID branchId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'branchId' is set
        if (branchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'branchId' when calling showBranchTables");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("branchId", branchId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/hal+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "api_key" };

        ParameterizedTypeReference<BranchTables> localReturnType = new ParameterizedTypeReference<BranchTables>() {};
        return apiClient.invokeAPI("/branch/{branchId}/tables", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Show Venues for a Branch
     * <p><b>200</b> - Show Venues for a Branch
     * @param branchId ID of the Branch (required)
     * @return BranchVenues
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BranchVenues showBranchVenues(UUID branchId) throws RestClientException {
        return showBranchVenuesWithHttpInfo(branchId).getBody();
    }

    /**
     * 
     * Show Venues for a Branch
     * <p><b>200</b> - Show Venues for a Branch
     * @param branchId ID of the Branch (required)
     * @return ResponseEntity&lt;BranchVenues&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BranchVenues> showBranchVenuesWithHttpInfo(UUID branchId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'branchId' is set
        if (branchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'branchId' when calling showBranchVenues");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("branchId", branchId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/hal+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<BranchVenues> localReturnType = new ParameterizedTypeReference<BranchVenues>() {};
        return apiClient.invokeAPI("/branch/{branchId}/venues", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Show all branches
     * Show all branches
     * @param body Update an existent branch in the store (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void showBranches(Object body) throws RestClientException {
        showBranchesWithHttpInfo(body);
    }

    /**
     * Show all branches
     * Show all branches
     * @param body Update an existent branch in the store (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> showBranchesWithHttpInfo(Object body) throws RestClientException {
        Object localVarPostBody = body;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/hal+json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "rphaven_auth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/branch", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update an existing branch
     * Update an existing branch by Id
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Branch not found
     * <p><b>405</b> - Validation exception
     * @param branchId ID of the branch (required)
     * @param branchResource Update an existent branch in the store (required)
     * @return BranchResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BranchResource updateBranch(UUID branchId, BranchResource branchResource) throws RestClientException {
        return updateBranchWithHttpInfo(branchId, branchResource).getBody();
    }

    /**
     * Update an existing branch
     * Update an existing branch by Id
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Invalid ID supplied
     * <p><b>404</b> - Branch not found
     * <p><b>405</b> - Validation exception
     * @param branchId ID of the branch (required)
     * @param branchResource Update an existent branch in the store (required)
     * @return ResponseEntity&lt;BranchResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BranchResource> updateBranchWithHttpInfo(UUID branchId, BranchResource branchResource) throws RestClientException {
        Object localVarPostBody = branchResource;
        
        // verify the required parameter 'branchId' is set
        if (branchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'branchId' when calling updateBranch");
        }
        
        // verify the required parameter 'branchResource' is set
        if (branchResource == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'branchResource' when calling updateBranch");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("branchId", branchId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/hal+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/hal+json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "rphaven_auth" };

        ParameterizedTypeReference<BranchResource> localReturnType = new ParameterizedTypeReference<BranchResource>() {};
        return apiClient.invokeAPI("/branch/{branchId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
