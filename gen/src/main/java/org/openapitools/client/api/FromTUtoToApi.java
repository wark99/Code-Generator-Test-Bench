package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.OneOfillegalArgumentExceptionremoteException;
import org.openapitools.client.model.Ticket;
import org.openapitools.client.model.TicketKeys;
import org.openapitools.client.model.UpdateTicket;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:28.900088471Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class FromTUtoToApi {
    private ApiClient apiClient;

    public FromTUtoToApi() {
        this(new ApiClient());
    }

    public FromTUtoToApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new ticket in TO.
     * Create a new ticket in the Freshdesk instance that corresponds depending on the requested data.
     * <p><b>201</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * @param ticket Ticket attributes needed to create a new ticket. (required)
     * @return TicketKeys
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TicketKeys troubleTicketPost(Ticket ticket) throws RestClientException {
        return troubleTicketPostWithHttpInfo(ticket).getBody();
    }

    /**
     * Create a new ticket in TO.
     * Create a new ticket in the Freshdesk instance that corresponds depending on the requested data.
     * <p><b>201</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * @param ticket Ticket attributes needed to create a new ticket. (required)
     * @return ResponseEntity&lt;TicketKeys&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TicketKeys> troubleTicketPostWithHttpInfo(Ticket ticket) throws RestClientException {
        Object localVarPostBody = ticket;
        
        // verify the required parameter 'ticket' is set
        if (ticket == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ticket' when calling troubleTicketPost");
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

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<TicketKeys> localReturnType = new ParameterizedTypeReference<TicketKeys>() {};
        return apiClient.invokeAPI("/troubleTicket", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update an existing ticket from TU to TO.
     * Update the ticket in TO system.
     * <p><b>200</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * @param primaryKey  (required)
     * @param updateTicket Ticket object to update a ticket. (required)
     * @return UpdateTicket
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateTicket troubleTicketPrimaryKeyPatch(String primaryKey, UpdateTicket updateTicket) throws RestClientException {
        return troubleTicketPrimaryKeyPatchWithHttpInfo(primaryKey, updateTicket).getBody();
    }

    /**
     * Update an existing ticket from TU to TO.
     * Update the ticket in TO system.
     * <p><b>200</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * @param primaryKey  (required)
     * @param updateTicket Ticket object to update a ticket. (required)
     * @return ResponseEntity&lt;UpdateTicket&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateTicket> troubleTicketPrimaryKeyPatchWithHttpInfo(String primaryKey, UpdateTicket updateTicket) throws RestClientException {
        Object localVarPostBody = updateTicket;
        
        // verify the required parameter 'primaryKey' is set
        if (primaryKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'primaryKey' when calling troubleTicketPrimaryKeyPatch");
        }
        
        // verify the required parameter 'updateTicket' is set
        if (updateTicket == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateTicket' when calling troubleTicketPrimaryKeyPatch");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("primaryKey", primaryKey);

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

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<UpdateTicket> localReturnType = new ParameterizedTypeReference<UpdateTicket>() {};
        return apiClient.invokeAPI("/troubleTicket/{primaryKey}", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
