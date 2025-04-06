package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.DepositSwitchDetails;
import org.openapitools.client.model.DepositSwitchesSummary;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T12:47:14.152745765Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TransferApi {
    private ApiClient apiClient;

    public TransferApi() {
        this(new ApiClient());
    }

    public TransferApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Deposit Switches by Customer ID
     * Retrieve summary of deposit switches performed by given customer ID. _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Deposit switches performed by the customer
     * <p><b>400</b> - The request was rejected.
     * <p><b>404</b> - The requested entity was not found
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param customerId Unique identifier of the customer (required)
     * @return DepositSwitchesSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DepositSwitchesSummary getAllDepositSwitches(String customerId) throws RestClientException {
        return getAllDepositSwitchesWithHttpInfo(customerId).getBody();
    }

    /**
     * Get Deposit Switches by Customer ID
     * Retrieve summary of deposit switches performed by given customer ID. _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Deposit switches performed by the customer
     * <p><b>400</b> - The request was rejected.
     * <p><b>404</b> - The requested entity was not found
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param customerId Unique identifier of the customer (required)
     * @return ResponseEntity&lt;DepositSwitchesSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DepositSwitchesSummary> getAllDepositSwitchesWithHttpInfo(String customerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getAllDepositSwitches");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customer_id", customerId);

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

        ParameterizedTypeReference<DepositSwitchesSummary> localReturnType = new ParameterizedTypeReference<DepositSwitchesSummary>() {};
        return apiClient.invokeAPI("/transfer/customers/{customer_id}/deposit-switches", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Deposit Switch by ID
     * Retrieve deposit switch details by switch ID. _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Deposit switch details
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId Unique identifier of the customer (required)
     * @param switchId Deposit Switch ID (required)
     * @return DepositSwitchDetails
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DepositSwitchDetails getDepositSwitchDetails(String customerId, String switchId) throws RestClientException {
        return getDepositSwitchDetailsWithHttpInfo(customerId, switchId).getBody();
    }

    /**
     * Get Deposit Switch by ID
     * Retrieve deposit switch details by switch ID. _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Deposit switch details
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId Unique identifier of the customer (required)
     * @param switchId Deposit Switch ID (required)
     * @return ResponseEntity&lt;DepositSwitchDetails&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DepositSwitchDetails> getDepositSwitchDetailsWithHttpInfo(String customerId, String switchId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getDepositSwitchDetails");
        }
        
        // verify the required parameter 'switchId' is set
        if (switchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'switchId' when calling getDepositSwitchDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customer_id", customerId);
        uriVariables.put("switch_id", switchId);

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

        ParameterizedTypeReference<DepositSwitchDetails> localReturnType = new ParameterizedTypeReference<DepositSwitchDetails>() {};
        return apiClient.invokeAPI("/transfer/customers/{customer_id}/deposit-switches/{switch_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
