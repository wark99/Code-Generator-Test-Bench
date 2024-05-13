package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.OneOfillegalArgumentExceptionremoteException;
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
public class FromTOtoTuApi {
    private ApiClient apiClient;

    public FromTOtoTuApi() {
        this(new ApiClient());
    }

    public FromTOtoTuApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Update an existing ticket from TO to TU.
     * The ticket status changes in TO and send information to TU.
     * <p><b>200</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * @param updateTicket Ticket object to update a ticket. (required)
     * @return UpdateTicket
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UpdateTicket troubleTicketUpdatePost(UpdateTicket updateTicket) throws RestClientException {
        return troubleTicketUpdatePostWithHttpInfo(updateTicket).getBody();
    }

    /**
     * Update an existing ticket from TO to TU.
     * The ticket status changes in TO and send information to TU.
     * <p><b>200</b>
     * <p><b>400</b>
     * <p><b>401</b>
     * @param updateTicket Ticket object to update a ticket. (required)
     * @return ResponseEntity&lt;UpdateTicket&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UpdateTicket> troubleTicketUpdatePostWithHttpInfo(UpdateTicket updateTicket) throws RestClientException {
        Object localVarPostBody = updateTicket;
        
        // verify the required parameter 'updateTicket' is set
        if (updateTicket == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateTicket' when calling troubleTicketUpdatePost");
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

        ParameterizedTypeReference<UpdateTicket> localReturnType = new ParameterizedTypeReference<UpdateTicket>() {};
        return apiClient.invokeAPI("/troubleTicket/update", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
