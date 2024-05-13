package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AddOntology201Response;
import org.openapitools.client.model.AddOntologyRequest;
import org.openapitools.client.model.GetOntologyNode404Response;
import org.openapitools.client.model.ListOntologyNodes400Response;
import org.openapitools.client.model.ListOntologyNodes404Response;
import org.openapitools.client.model.ListOntologyNodes409Response;
import org.openapitools.client.model.OntologyNode;
import org.openapitools.client.model.OntologyUpdate;
import org.openapitools.client.model.UpdateOntologyMetadata200Response;
import org.openapitools.client.model.UpdateOntologyMetadataRequest;
import org.openapitools.client.model.UpdateOntologyNode409Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:14:21.073249278Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OntologyApi {
    private ApiClient apiClient;

    public OntologyApi() {
        this(new ApiClient());
    }

    public OntologyApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create Ontology Node
     * Create a new ontology node with the specified information.
     * <p><b>201</b> - Ontology Node created successfully
     * <p><b>400</b> - Bad Request
     * <p><b>409</b> - Conflict
     * @param addOntologyRequest  (required)
     * @return AddOntology201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AddOntology201Response addOntology(AddOntologyRequest addOntologyRequest) throws RestClientException {
        return addOntologyWithHttpInfo(addOntologyRequest).getBody();
    }

    /**
     * Create Ontology Node
     * Create a new ontology node with the specified information.
     * <p><b>201</b> - Ontology Node created successfully
     * <p><b>400</b> - Bad Request
     * <p><b>409</b> - Conflict
     * @param addOntologyRequest  (required)
     * @return ResponseEntity&lt;AddOntology201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AddOntology201Response> addOntologyWithHttpInfo(AddOntologyRequest addOntologyRequest) throws RestClientException {
        Object localVarPostBody = addOntologyRequest;
        
        // verify the required parameter 'addOntologyRequest' is set
        if (addOntologyRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addOntologyRequest' when calling addOntology");
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

        String[] localVarAuthNames = new String[] { "studio_oauth2" };

        ParameterizedTypeReference<AddOntology201Response> localReturnType = new ParameterizedTypeReference<AddOntology201Response>() {};
        return apiClient.invokeAPI("/api/v1/ontologies", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete Ontology Node by ID
     * Delete an ontology node by its unique ID.
     * <p><b>204</b> - Ontology Node deleted successfully
     * <p><b>404</b> - Not Found
     * @param id ID of the ontology node to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteOntologyNode(String id) throws RestClientException {
        deleteOntologyNodeWithHttpInfo(id);
    }

    /**
     * Delete Ontology Node by ID
     * Delete an ontology node by its unique ID.
     * <p><b>204</b> - Ontology Node deleted successfully
     * <p><b>404</b> - Not Found
     * @param id ID of the ontology node to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteOntologyNodeWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteOntologyNode");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        String[] localVarAuthNames = new String[] { "studio_oauth2" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/v1/ontologies/{id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Ontology Node by ID
     * Retrieve an ontology node by its unique ID.
     * <p><b>201</b> - Ontology Node retrieved successfully
     * <p><b>404</b> - Not Found
     * @param id ID of the ontology node to retrieve (required)
     * @return OntologyUpdate
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OntologyUpdate getOntologyNode(String id) throws RestClientException {
        return getOntologyNodeWithHttpInfo(id).getBody();
    }

    /**
     * Get Ontology Node by ID
     * Retrieve an ontology node by its unique ID.
     * <p><b>201</b> - Ontology Node retrieved successfully
     * <p><b>404</b> - Not Found
     * @param id ID of the ontology node to retrieve (required)
     * @return ResponseEntity&lt;OntologyUpdate&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OntologyUpdate> getOntologyNodeWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getOntologyNode");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        String[] localVarAuthNames = new String[] { "studio_oauth2" };

        ParameterizedTypeReference<OntologyUpdate> localReturnType = new ParameterizedTypeReference<OntologyUpdate>() {};
        return apiClient.invokeAPI("/api/v1/ontologies/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List All Ontology Nodes
     * Retrieve a list of ontology nodes with optional filter and pagination.
     * <p><b>200</b> - Ontology Nodes retrieved successfully
     * <p><b>400</b> - Bad Request
     * <p><b>409</b> - Conflict
     * <p><b>404</b> - No results found
     * @param page Page number (optional, default: 1, can&#39;t be negative).  (optional, default to 1)
     * @param limit Number of items per page (optional, default: 10, max: 100).  (optional, default to 10)
     * @param sortBy Field to sort by (optional, default: modifiedOn).  (optional, default to modifiedOn)
     * @param sortOrder Sort order (optional, default: desc).  (optional, default to desc)
     * @param filter Filter criteria (optional, default: no).  (optional, default to false)
     * @return List&lt;OntologyNode&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<OntologyNode> listOntologyNodes(Integer page, Integer limit, String sortBy, String sortOrder, String filter) throws RestClientException {
        return listOntologyNodesWithHttpInfo(page, limit, sortBy, sortOrder, filter).getBody();
    }

    /**
     * List All Ontology Nodes
     * Retrieve a list of ontology nodes with optional filter and pagination.
     * <p><b>200</b> - Ontology Nodes retrieved successfully
     * <p><b>400</b> - Bad Request
     * <p><b>409</b> - Conflict
     * <p><b>404</b> - No results found
     * @param page Page number (optional, default: 1, can&#39;t be negative).  (optional, default to 1)
     * @param limit Number of items per page (optional, default: 10, max: 100).  (optional, default to 10)
     * @param sortBy Field to sort by (optional, default: modifiedOn).  (optional, default to modifiedOn)
     * @param sortOrder Sort order (optional, default: desc).  (optional, default to desc)
     * @param filter Filter criteria (optional, default: no).  (optional, default to false)
     * @return ResponseEntity&lt;List&lt;OntologyNode&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<OntologyNode>> listOntologyNodesWithHttpInfo(Integer page, Integer limit, String sortBy, String sortOrder, String filter) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortOrder", sortOrder));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter", filter));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "studio_oauth2" };

        ParameterizedTypeReference<List<OntologyNode>> localReturnType = new ParameterizedTypeReference<List<OntologyNode>>() {};
        return apiClient.invokeAPI("/api/v1/ontologies", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Ontology Node metadata
     * Update specific fields of an existing ontology node.
     * <p><b>200</b> - Ontology Node updated successfully
     * <p><b>400</b> - Bad Request
     * <p><b>409</b> - Conflict
     * @param id ID of the ontology node to update (required)
     * @param updateOntologyMetadataRequest  (required)
     * @return UpdateOntologyMetadata200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateOntologyMetadata200Response updateOntologyMetadata(String id, UpdateOntologyMetadataRequest updateOntologyMetadataRequest) throws RestClientException {
        return updateOntologyMetadataWithHttpInfo(id, updateOntologyMetadataRequest).getBody();
    }

    /**
     * Update Ontology Node metadata
     * Update specific fields of an existing ontology node.
     * <p><b>200</b> - Ontology Node updated successfully
     * <p><b>400</b> - Bad Request
     * <p><b>409</b> - Conflict
     * @param id ID of the ontology node to update (required)
     * @param updateOntologyMetadataRequest  (required)
     * @return ResponseEntity&lt;UpdateOntologyMetadata200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateOntologyMetadata200Response> updateOntologyMetadataWithHttpInfo(String id, UpdateOntologyMetadataRequest updateOntologyMetadataRequest) throws RestClientException {
        Object localVarPostBody = updateOntologyMetadataRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateOntologyMetadata");
        }
        
        // verify the required parameter 'updateOntologyMetadataRequest' is set
        if (updateOntologyMetadataRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateOntologyMetadataRequest' when calling updateOntologyMetadata");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        String[] localVarAuthNames = new String[] { "studio_oauth2" };

        ParameterizedTypeReference<UpdateOntologyMetadata200Response> localReturnType = new ParameterizedTypeReference<UpdateOntologyMetadata200Response>() {};
        return apiClient.invokeAPI("/api/v1/ontologies/{id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Ontology Node
     * Update an ontology node with specific actions (&#39;draft&#39; or &#39;publish&#39;).
     * <p><b>200</b> - Ontology Node updated successfully
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * @param id ID of the ontology node to update (required)
     * @param action Action to perform (&#39;draft&#39; or &#39;publish&#39;) (required)
     * @param ontologyUpdate  (required)
     * @return UpdateOntologyMetadata200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateOntologyMetadata200Response updateOntologyNode(String id, String action, OntologyUpdate ontologyUpdate) throws RestClientException {
        return updateOntologyNodeWithHttpInfo(id, action, ontologyUpdate).getBody();
    }

    /**
     * Update Ontology Node
     * Update an ontology node with specific actions (&#39;draft&#39; or &#39;publish&#39;).
     * <p><b>200</b> - Ontology Node updated successfully
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>409</b> - Conflict
     * @param id ID of the ontology node to update (required)
     * @param action Action to perform (&#39;draft&#39; or &#39;publish&#39;) (required)
     * @param ontologyUpdate  (required)
     * @return ResponseEntity&lt;UpdateOntologyMetadata200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateOntologyMetadata200Response> updateOntologyNodeWithHttpInfo(String id, String action, OntologyUpdate ontologyUpdate) throws RestClientException {
        Object localVarPostBody = ontologyUpdate;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateOntologyNode");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'action' when calling updateOntologyNode");
        }
        
        // verify the required parameter 'ontologyUpdate' is set
        if (ontologyUpdate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ontologyUpdate' when calling updateOntologyNode");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("action", action);

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

        String[] localVarAuthNames = new String[] { "studio_oauth2" };

        ParameterizedTypeReference<UpdateOntologyMetadata200Response> localReturnType = new ParameterizedTypeReference<UpdateOntologyMetadata200Response>() {};
        return apiClient.invokeAPI("/ontologies/{id}/{action}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
