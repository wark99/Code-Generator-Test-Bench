package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GatewayBody;
import org.openapitools.client.model.SendMonthlyNewsletterByEmail200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:12.926892586Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GatewayApi {
    private ApiClient apiClient;

    public GatewayApi() {
        this(new ApiClient());
    }

    public GatewayApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Send monthly newsletter to customer via email
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal Server Error
     * @param gatewayBody The customer ID and message ID (required)
     * @return SendMonthlyNewsletterByEmail200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SendMonthlyNewsletterByEmail200Response sendMonthlyNewsletterByEmail(GatewayBody gatewayBody) throws RestClientException {
        return sendMonthlyNewsletterByEmailWithHttpInfo(gatewayBody).getBody();
    }

    /**
     * Send monthly newsletter to customer via email
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>500</b> - Internal Server Error
     * @param gatewayBody The customer ID and message ID (required)
     * @return ResponseEntity&lt;SendMonthlyNewsletterByEmail200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SendMonthlyNewsletterByEmail200Response> sendMonthlyNewsletterByEmailWithHttpInfo(GatewayBody gatewayBody) throws RestClientException {
        Object localVarPostBody = gatewayBody;
        
        // verify the required parameter 'gatewayBody' is set
        if (gatewayBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gatewayBody' when calling sendMonthlyNewsletterByEmail");
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

        ParameterizedTypeReference<SendMonthlyNewsletterByEmail200Response> localReturnType = new ParameterizedTypeReference<SendMonthlyNewsletterByEmail200Response>() {};
        return apiClient.invokeAPI("/email/newsletter", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
