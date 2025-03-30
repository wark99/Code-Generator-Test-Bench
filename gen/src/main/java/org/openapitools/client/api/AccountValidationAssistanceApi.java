package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ErrorMessage;
import org.openapitools.client.model.InitiatedMicroDeposit;
import org.openapitools.client.model.MicroDepositDetails;
import org.openapitools.client.model.MicroDepositInitiation;
import org.openapitools.client.model.MicroDepositVerification;
import org.openapitools.client.model.MicroDepositVerificationError;
import org.openapitools.client.model.VerifiedMicroDeposit;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-30T15:48:08.238993781Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AccountValidationAssistanceApi {
    private ApiClient apiClient;

    public AccountValidationAssistanceApi() {
        this(new ApiClient());
    }

    public AccountValidationAssistanceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Micro Entries Details
     * Fetch the micro entries details. &#x60;customerId&#x60; and &#x60;accountId&#x60; are the identifiers of the customer and account receiving the micro entries.    _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Micro entries were successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @return MicroDepositDetails
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MicroDepositDetails getMicroDepositsDetails(String customerId, String accountId) throws RestClientException {
        return getMicroDepositsDetailsWithHttpInfo(customerId, accountId).getBody();
    }

    /**
     * Get Micro Entries Details
     * Fetch the micro entries details. &#x60;customerId&#x60; and &#x60;accountId&#x60; are the identifiers of the customer and account receiving the micro entries.    _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Micro entries were successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @return ResponseEntity&lt;MicroDepositDetails&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MicroDepositDetails> getMicroDepositsDetailsWithHttpInfo(String customerId, String accountId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getMicroDepositsDetails");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling getMicroDepositsDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        uriVariables.put("accountId", accountId);

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

        ParameterizedTypeReference<MicroDepositDetails> localReturnType = new ParameterizedTypeReference<MicroDepositDetails>() {};
        return apiClient.invokeAPI("/microentry/v1/customers/{customerId}/accounts/{accountId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Initiate Micro Entries
     * Initiate the micro entries to customer&#39;s account.  Two random micro amounts less than a dollar each will be deposited to provided customer&#39;s account.    _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Micro entries were successfully initiated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * <p><b>409</b> - The resource already exists
     * <p><b>429</b> - The service can&#39;t accept more requests or is not available from the Test Drive.
     * @param customerId A customer ID (required)
     * @param microDepositInitiation  (required)
     * @return InitiatedMicroDeposit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InitiatedMicroDeposit initiateMicroAmountDeposits(String customerId, MicroDepositInitiation microDepositInitiation) throws RestClientException {
        return initiateMicroAmountDepositsWithHttpInfo(customerId, microDepositInitiation).getBody();
    }

    /**
     * Initiate Micro Entries
     * Initiate the micro entries to customer&#39;s account.  Two random micro amounts less than a dollar each will be deposited to provided customer&#39;s account.    _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Micro entries were successfully initiated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * <p><b>409</b> - The resource already exists
     * <p><b>429</b> - The service can&#39;t accept more requests or is not available from the Test Drive.
     * @param customerId A customer ID (required)
     * @param microDepositInitiation  (required)
     * @return ResponseEntity&lt;InitiatedMicroDeposit&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InitiatedMicroDeposit> initiateMicroAmountDepositsWithHttpInfo(String customerId, MicroDepositInitiation microDepositInitiation) throws RestClientException {
        Object localVarPostBody = microDepositInitiation;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling initiateMicroAmountDeposits");
        }
        
        // verify the required parameter 'microDepositInitiation' is set
        if (microDepositInitiation == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'microDepositInitiation' when calling initiateMicroAmountDeposits");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<InitiatedMicroDeposit> localReturnType = new ParameterizedTypeReference<InitiatedMicroDeposit>() {};
        return apiClient.invokeAPI("/microentry/v1/customers/{customerId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Verify Micro Entries
     * Verify the micro entries as received by customer in customer&#39;s account. Customer needs to verify the micro amounts received in customer&#39;s account. &#x60;customerId&#x60; and &#x60;accountId&#x60; are the identifiers of the customer and account  receiving the micro entries.    _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Micro entries were successfully verified
     * <p><b>400</b> - Micro entries verification failed. status field could be any except \&quot;Verified\&quot; and \&quot;Completed\&quot;.
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @param microDepositVerification  (required)
     * @return VerifiedMicroDeposit
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VerifiedMicroDeposit verifyMicroAmountDeposits(String customerId, String accountId, MicroDepositVerification microDepositVerification) throws RestClientException {
        return verifyMicroAmountDepositsWithHttpInfo(customerId, accountId, microDepositVerification).getBody();
    }

    /**
     * Verify Micro Entries
     * Verify the micro entries as received by customer in customer&#39;s account. Customer needs to verify the micro amounts received in customer&#39;s account. &#x60;customerId&#x60; and &#x60;accountId&#x60; are the identifiers of the customer and account  receiving the micro entries.    _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Micro entries were successfully verified
     * <p><b>400</b> - Micro entries verification failed. status field could be any except \&quot;Verified\&quot; and \&quot;Completed\&quot;.
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @param microDepositVerification  (required)
     * @return ResponseEntity&lt;VerifiedMicroDeposit&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VerifiedMicroDeposit> verifyMicroAmountDepositsWithHttpInfo(String customerId, String accountId, MicroDepositVerification microDepositVerification) throws RestClientException {
        Object localVarPostBody = microDepositVerification;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling verifyMicroAmountDeposits");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling verifyMicroAmountDeposits");
        }
        
        // verify the required parameter 'microDepositVerification' is set
        if (microDepositVerification == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'microDepositVerification' when calling verifyMicroAmountDeposits");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        uriVariables.put("accountId", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<VerifiedMicroDeposit> localReturnType = new ParameterizedTypeReference<VerifiedMicroDeposit>() {};
        return apiClient.invokeAPI("/microentry/v1/customers/{customerId}/accounts/{accountId}/amounts", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
