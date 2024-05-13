package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Contact;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:22:25.486395919Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ContactApi {
    private ApiClient apiClient;

    public ContactApi() {
        this(new ApiClient());
    }

    public ContactApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Liste des fiches contacts pour le salon demandé.
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b>
     * <p><b>404</b> - Compte exposant introuvable
     * @param salonId Identifiant de salon de référence pour récupérer les fiches contact associées. (required)
     * @return Contact
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Contact listContactsBySalonId(String salonId) throws RestClientException {
        return listContactsBySalonIdWithHttpInfo(salonId).getBody();
    }

    /**
     * Liste des fiches contacts pour le salon demandé.
     * 
     * <p><b>200</b> - successful operation
     * <p><b>401</b>
     * <p><b>404</b> - Compte exposant introuvable
     * @param salonId Identifiant de salon de référence pour récupérer les fiches contact associées. (required)
     * @return ResponseEntity&lt;Contact&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Contact> listContactsBySalonIdWithHttpInfo(String salonId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'salonId' is set
        if (salonId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'salonId' when calling listContactsBySalonId");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "salonId", salonId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Contact> localReturnType = new ParameterizedTypeReference<Contact>() {};
        return apiClient.invokeAPI("/listContactsBySalonId", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
