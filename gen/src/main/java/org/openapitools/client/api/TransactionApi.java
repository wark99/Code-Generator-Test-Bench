package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.TransactionsIdPatchRequest;
import org.openapitools.client.model.TransactionsPostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:45.736611184Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TransactionApi {
    private ApiClient apiClient;

    public TransactionApi() {
        this(new ApiClient());
    }

    public TransactionApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve all transactions
     * 
     * <p><b>200</b> - The request was successful.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void transactionsGet() throws RestClientException {
        transactionsGetWithHttpInfo();
    }

    /**
     * Retrieve all transactions
     * 
     * <p><b>200</b> - The request was successful.
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> transactionsGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/transactions", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a specific transaction
     * 
     * <p><b>200</b> - The transaction was successfully deleted.
     * <p><b>404</b> - The requested transaction could not be found.
     * @param id ID of the transaction to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void transactionsIdDelete(Integer id) throws RestClientException {
        transactionsIdDeleteWithHttpInfo(id);
    }

    /**
     * Delete a specific transaction
     * 
     * <p><b>200</b> - The transaction was successfully deleted.
     * <p><b>404</b> - The requested transaction could not be found.
     * @param id ID of the transaction to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> transactionsIdDeleteWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling transactionsIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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
        return apiClient.invokeAPI("/transactions/{id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a specific transaction
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>404</b> - The requested transaction could not be found.
     * @param id ID of the transaction to retrieve (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void transactionsIdGet(Integer id) throws RestClientException {
        transactionsIdGetWithHttpInfo(id);
    }

    /**
     * Retrieve a specific transaction
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>404</b> - The requested transaction could not be found.
     * @param id ID of the transaction to retrieve (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> transactionsIdGetWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling transactionsIdGet");
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/transactions/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Partially update a specific transaction by ID
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * <p><b>404</b> - The requested transaction could not be found.
     * @param id ID of the transaction to update (required)
     * @param transactionsIdPatchRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void transactionsIdPatch(Integer id, TransactionsIdPatchRequest transactionsIdPatchRequest) throws RestClientException {
        transactionsIdPatchWithHttpInfo(id, transactionsIdPatchRequest);
    }

    /**
     * Partially update a specific transaction by ID
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * <p><b>404</b> - The requested transaction could not be found.
     * @param id ID of the transaction to update (required)
     * @param transactionsIdPatchRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> transactionsIdPatchWithHttpInfo(Integer id, TransactionsIdPatchRequest transactionsIdPatchRequest) throws RestClientException {
        Object localVarPostBody = transactionsIdPatchRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling transactionsIdPatch");
        }
        
        // verify the required parameter 'transactionsIdPatchRequest' is set
        if (transactionsIdPatchRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'transactionsIdPatchRequest' when calling transactionsIdPatch");
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/transactions/{id}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a specific transaction by ID
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * <p><b>404</b> - The requested transaction could not be found.
     * @param id ID of the transaction to update (required)
     * @param transactionsPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void transactionsIdPut(Integer id, TransactionsPostRequest transactionsPostRequest) throws RestClientException {
        transactionsIdPutWithHttpInfo(id, transactionsPostRequest);
    }

    /**
     * Update a specific transaction by ID
     * 
     * <p><b>200</b> - The request was successful.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * <p><b>404</b> - The requested transaction could not be found.
     * @param id ID of the transaction to update (required)
     * @param transactionsPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> transactionsIdPutWithHttpInfo(Integer id, TransactionsPostRequest transactionsPostRequest) throws RestClientException {
        Object localVarPostBody = transactionsPostRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling transactionsIdPut");
        }
        
        // verify the required parameter 'transactionsPostRequest' is set
        if (transactionsPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'transactionsPostRequest' when calling transactionsIdPut");
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/transactions/{id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a new transaction
     * 
     * <p><b>201</b> - The transaction was successfully created.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * @param transactionsPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void transactionsPost(TransactionsPostRequest transactionsPostRequest) throws RestClientException {
        transactionsPostWithHttpInfo(transactionsPostRequest);
    }

    /**
     * Create a new transaction
     * 
     * <p><b>201</b> - The transaction was successfully created.
     * <p><b>400</b> - The request body is missing or contains invalid parameters.
     * @param transactionsPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> transactionsPostWithHttpInfo(TransactionsPostRequest transactionsPostRequest) throws RestClientException {
        Object localVarPostBody = transactionsPostRequest;
        
        // verify the required parameter 'transactionsPostRequest' is set
        if (transactionsPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'transactionsPostRequest' when calling transactionsPost");
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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/transactions", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
