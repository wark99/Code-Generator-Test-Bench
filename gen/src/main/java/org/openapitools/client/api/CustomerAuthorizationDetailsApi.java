package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CustomerAuthorizationDetails;
import org.openapitools.client.model.ErrorMessage;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T13:05:06.990716937Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CustomerAuthorizationDetailsApi {
    private ApiClient apiClient;

    public CustomerAuthorizationDetailsApi() {
        this(new ApiClient());
    }

    public CustomerAuthorizationDetailsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns customer authorization details for the institution login identification.
     * The endpoint provides customer authorization details like authorization start date, authorization end date against the requested institution login id  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Successfully retrieved customer authorization details by institution login id.
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param institutionLoginId Institution login id of the customer. (required)
     * @return CustomerAuthorizationDetails
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerAuthorizationDetails getCustomerAuthorizationDetails(Long institutionLoginId) throws RestClientException {
        return getCustomerAuthorizationDetailsWithHttpInfo(institutionLoginId).getBody();
    }

    /**
     * Returns customer authorization details for the institution login identification.
     * The endpoint provides customer authorization details like authorization start date, authorization end date against the requested institution login id  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Successfully retrieved customer authorization details by institution login id.
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param institutionLoginId Institution login id of the customer. (required)
     * @return ResponseEntity&lt;CustomerAuthorizationDetails&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerAuthorizationDetails> getCustomerAuthorizationDetailsWithHttpInfo(Long institutionLoginId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'institutionLoginId' is set
        if (institutionLoginId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'institutionLoginId' when calling getCustomerAuthorizationDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("institution_login_id", institutionLoginId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<CustomerAuthorizationDetails> localReturnType = new ParameterizedTypeReference<CustomerAuthorizationDetails>() {};
        return apiClient.invokeAPI("/customers/institution-logins/{institution_login_id}/authorization-details", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
