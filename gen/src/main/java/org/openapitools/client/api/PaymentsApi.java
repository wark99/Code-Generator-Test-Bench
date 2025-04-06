package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ACHDetails;
import org.openapitools.client.model.AccountOwner;
import org.openapitools.client.model.AccountOwnerHolders;
import org.openapitools.client.model.AvailableBalance;
import org.openapitools.client.model.ErrorMessage;
import org.openapitools.client.model.LoanPaymentDetails;
import org.openapitools.client.model.PaymentInstructions;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T13:34:32.874275138Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PaymentsApi {
    private ApiClient apiClient;

    public PaymentsApi() {
        this(new ApiClient());
    }

    public PaymentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Account ACH Details
     * Return the real account number and routing number details for an ACH payment.  Note: this is a premium service, billable per every successful API call.  _Supported account types_: \&quot;checking\&quot;, \&quot;savings\&quot;, \&quot;moneyMarket\&quot;  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Account ACH details were successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @return ACHDetails
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ACHDetails getAccountACHDetails(String customerId, String accountId) throws RestClientException {
        return getAccountACHDetailsWithHttpInfo(customerId, accountId).getBody();
    }

    /**
     * Get Account ACH Details
     * Return the real account number and routing number details for an ACH payment.  Note: this is a premium service, billable per every successful API call.  _Supported account types_: \&quot;checking\&quot;, \&quot;savings\&quot;, \&quot;moneyMarket\&quot;  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Account ACH details were successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @return ResponseEntity&lt;ACHDetails&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ACHDetails> getAccountACHDetailsWithHttpInfo(String customerId, String accountId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getAccountACHDetails");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling getAccountACHDetails");
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

        ParameterizedTypeReference<ACHDetails> localReturnType = new ParameterizedTypeReference<ACHDetails>() {};
        return apiClient.invokeAPI("/aggregation/v1/customers/{customerId}/accounts/{accountId}/details", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Account Owner
     * Retrieve the names and addresses of the account owner from a financial institution.  Note: this is a premium service, billable per every successful API call.  This service retrieves account data from the institution. This usually returns quickly, but in some scenarios may take a few minutes to complete. In the event of a timeout condition, retry the call.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account owner was successfully retrieved
     * <p><b>203</b> - The request was unsuccessful due to a required Multi-Factor Authentication (MFA) challenge. There is no further action that can be taken to resolve this error.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @return AccountOwner
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountOwner getAccountOwner(String customerId, String accountId) throws RestClientException {
        return getAccountOwnerWithHttpInfo(customerId, accountId).getBody();
    }

    /**
     * Get Account Owner
     * Retrieve the names and addresses of the account owner from a financial institution.  Note: this is a premium service, billable per every successful API call.  This service retrieves account data from the institution. This usually returns quickly, but in some scenarios may take a few minutes to complete. In the event of a timeout condition, retry the call.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account owner was successfully retrieved
     * <p><b>203</b> - The request was unsuccessful due to a required Multi-Factor Authentication (MFA) challenge. There is no further action that can be taken to resolve this error.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @return ResponseEntity&lt;AccountOwner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountOwner> getAccountOwnerWithHttpInfo(String customerId, String accountId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getAccountOwner");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling getAccountOwner");
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

        ParameterizedTypeReference<AccountOwner> localReturnType = new ParameterizedTypeReference<AccountOwner>() {};
        return apiClient.invokeAPI("/aggregation/v1/customers/{customerId}/accounts/{accountId}/owner", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Account Owner Details
     * This service retrieves the account details for an account holder from an institution. The following data objects are available.  * Account holders  * Addresses  * Emails  * Phones  * Documentations  * Identity Insights   Note: The data returned varies from institution to institution as not all of them make the same data available. This is a premium service, billable per each successful API call.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account owner was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @param withInsights If this parameter is true, Identity Insights data will be returned along with the account owner information (optional)
     * @param metaData OBAO is a program that is being offered to Mastercard issuers where when the new account is issued a Mastercard Debit or Prepaid account. OBAO offered partners will not be charged for ACH, AOV, and Balance API. (optional)
     * @return AccountOwnerHolders
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountOwnerHolders getAccountOwnerDetails(String customerId, String accountId, Boolean withInsights, String metaData) throws RestClientException {
        return getAccountOwnerDetailsWithHttpInfo(customerId, accountId, withInsights, metaData).getBody();
    }

    /**
     * Get Account Owner Details
     * This service retrieves the account details for an account holder from an institution. The following data objects are available.  * Account holders  * Addresses  * Emails  * Phones  * Documentations  * Identity Insights   Note: The data returned varies from institution to institution as not all of them make the same data available. This is a premium service, billable per each successful API call.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account owner was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @param withInsights If this parameter is true, Identity Insights data will be returned along with the account owner information (optional)
     * @param metaData OBAO is a program that is being offered to Mastercard issuers where when the new account is issued a Mastercard Debit or Prepaid account. OBAO offered partners will not be charged for ACH, AOV, and Balance API. (optional)
     * @return ResponseEntity&lt;AccountOwnerHolders&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountOwnerHolders> getAccountOwnerDetailsWithHttpInfo(String customerId, String accountId, Boolean withInsights, String metaData) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getAccountOwnerDetails");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling getAccountOwnerDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        uriVariables.put("accountId", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "withInsights", withInsights));
        

        if (metaData != null)
        localVarHeaderParams.add("Meta-Data", apiClient.parameterToString(metaData));

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<AccountOwnerHolders> localReturnType = new ParameterizedTypeReference<AccountOwnerHolders>() {};
        return apiClient.invokeAPI("/aggregation/v3/customers/{customerId}/accounts/{accountId}/owner", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Account ACH Details with RTP
     * Return the real account number and routing number details for an ACH payment along with the supported payment instruction details. If the RTP (Real Time Payment) value for “transferInEnabled” is true, then the account can receive RTPs. If the value for “transferOutEnabled” is true, then the account can send RTPs  Note: this is a premium service, billable per every successful API call.  _Supported account types_: \&quot;checking\&quot;, \&quot;savings\&quot;, \&quot;moneyMarket\&quot;  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Account ACH details were successfully retrieved
     * <p><b>400</b> - The request was rejected due to validation failures
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @return PaymentInstructions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentInstructions getAccountPaymentInstructionDetails(String customerId, String accountId) throws RestClientException {
        return getAccountPaymentInstructionDetailsWithHttpInfo(customerId, accountId).getBody();
    }

    /**
     * Get Account ACH Details with RTP
     * Return the real account number and routing number details for an ACH payment along with the supported payment instruction details. If the RTP (Real Time Payment) value for “transferInEnabled” is true, then the account can receive RTPs. If the value for “transferOutEnabled” is true, then the account can send RTPs  Note: this is a premium service, billable per every successful API call.  _Supported account types_: \&quot;checking\&quot;, \&quot;savings\&quot;, \&quot;moneyMarket\&quot;  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Account ACH details were successfully retrieved
     * <p><b>400</b> - The request was rejected due to validation failures
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @return ResponseEntity&lt;PaymentInstructions&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentInstructions> getAccountPaymentInstructionDetailsWithHttpInfo(String customerId, String accountId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getAccountPaymentInstructionDetails");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling getAccountPaymentInstructionDetails");
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

        ParameterizedTypeReference<PaymentInstructions> localReturnType = new ParameterizedTypeReference<PaymentInstructions>() {};
        return apiClient.invokeAPI("/aggregation/v3/customers/{customerId}/accounts/{accountId}/details", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Available Balance - Cached
     * _This endpoint will no longer be available after June 2025. You must transition to using the regular Get Available Balance endpoint, which can return either live or cached data depending on your requirements._  Retrieve the latest cached available and cleared account balances for a customer. Since we update and store balances throughout the day, this is the most accurate balance information available when a connection to a financial institution is unavailable or when a faster response is needed. Only deposit account types are supported: Checking, Savings, Money Market, and CD.  Note: this is a premium service, billable per every successful API call. Enrollment is required.  _Supported account types_: \&quot;checking\&quot;, \&quot;savings\&quot;, \&quot;moneyMarket\&quot;, \&quot;cd\&quot;  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The balance was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @return AvailableBalance
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public AvailableBalance getAvailableBalance(String customerId, String accountId) throws RestClientException {
        return getAvailableBalanceWithHttpInfo(customerId, accountId).getBody();
    }

    /**
     * Get Available Balance - Cached
     * _This endpoint will no longer be available after June 2025. You must transition to using the regular Get Available Balance endpoint, which can return either live or cached data depending on your requirements._  Retrieve the latest cached available and cleared account balances for a customer. Since we update and store balances throughout the day, this is the most accurate balance information available when a connection to a financial institution is unavailable or when a faster response is needed. Only deposit account types are supported: Checking, Savings, Money Market, and CD.  Note: this is a premium service, billable per every successful API call. Enrollment is required.  _Supported account types_: \&quot;checking\&quot;, \&quot;savings\&quot;, \&quot;moneyMarket\&quot;, \&quot;cd\&quot;  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The balance was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @return ResponseEntity&lt;AvailableBalance&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     * @deprecated
     */
    @Deprecated
    public ResponseEntity<AvailableBalance> getAvailableBalanceWithHttpInfo(String customerId, String accountId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getAvailableBalance");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling getAvailableBalance");
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

        ParameterizedTypeReference<AvailableBalance> localReturnType = new ParameterizedTypeReference<AvailableBalance>() {};
        return apiClient.invokeAPI("/aggregation/v1/customers/{customerId}/accounts/{accountId}/availableBalance", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Available Balance
     * Retrieve the available and cleared account balances for a single account in real-time directly from a financial institution. You can define an additional query parameter &#x60;balance_cache_interval&#x60; to specify the time interval of the last cached balance. This parameter is used by the server to determine whether the cached balance is still valid or if it needs to be refreshed.   Note: this is a premium service, billable per every successful API call.  _Supported account types_: \&quot;checking\&quot;, \&quot;savings\&quot;, \&quot;moneyMarket\&quot;, \&quot;cd\&quot;  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The live balance was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @param balanceCacheInterval &#x60;balance_cache_interval&#x60; (in minutes) is used to decide whether to return existing cached balance or retrieve from financial institution in real-time. Details explained below: 1. If the cached balance data at server is older than provided &#x60;balance_cache_interval&#x60; then live balance from financial institution will be retrieved. 2. If the cached balance data is within provided &#x60;balance_cache_interval&#x60; allowed interval then balance from cache will be returned. 3. If &#x60;balance_cache_interval&#x60; is 0 or not provided, then live balance from financial institution will be retrieved. (optional, default to 0)
     * @return AvailableBalance
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AvailableBalance getAvailableBalanceLive(String customerId, String accountId, Integer balanceCacheInterval) throws RestClientException {
        return getAvailableBalanceLiveWithHttpInfo(customerId, accountId, balanceCacheInterval).getBody();
    }

    /**
     * Get Available Balance
     * Retrieve the available and cleared account balances for a single account in real-time directly from a financial institution. You can define an additional query parameter &#x60;balance_cache_interval&#x60; to specify the time interval of the last cached balance. This parameter is used by the server to determine whether the cached balance is still valid or if it needs to be refreshed.   Note: this is a premium service, billable per every successful API call.  _Supported account types_: \&quot;checking\&quot;, \&quot;savings\&quot;, \&quot;moneyMarket\&quot;, \&quot;cd\&quot;  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The live balance was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @param balanceCacheInterval &#x60;balance_cache_interval&#x60; (in minutes) is used to decide whether to return existing cached balance or retrieve from financial institution in real-time. Details explained below: 1. If the cached balance data at server is older than provided &#x60;balance_cache_interval&#x60; then live balance from financial institution will be retrieved. 2. If the cached balance data is within provided &#x60;balance_cache_interval&#x60; allowed interval then balance from cache will be returned. 3. If &#x60;balance_cache_interval&#x60; is 0 or not provided, then live balance from financial institution will be retrieved. (optional, default to 0)
     * @return ResponseEntity&lt;AvailableBalance&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AvailableBalance> getAvailableBalanceLiveWithHttpInfo(String customerId, String accountId, Integer balanceCacheInterval) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getAvailableBalanceLive");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling getAvailableBalanceLive");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        uriVariables.put("accountId", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "balance_cache_interval", balanceCacheInterval));
        

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<AvailableBalance> localReturnType = new ParameterizedTypeReference<AvailableBalance>() {};
        return apiClient.invokeAPI("/aggregation/v1/customers/{customerId}/accounts/{accountId}/availableBalance/live", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Loan Payment Details
     * Return the loan payment details of the customer for a loan-type account.  Note: this is a premium service, billable per every successful API call.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The loan payment details were successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @return LoanPaymentDetails
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LoanPaymentDetails getLoanPaymentDetails(String customerId, String accountId) throws RestClientException {
        return getLoanPaymentDetailsWithHttpInfo(customerId, accountId).getBody();
    }

    /**
     * Get Loan Payment Details
     * Return the loan payment details of the customer for a loan-type account.  Note: this is a premium service, billable per every successful API call.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The loan payment details were successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @return ResponseEntity&lt;LoanPaymentDetails&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LoanPaymentDetails> getLoanPaymentDetailsWithHttpInfo(String customerId, String accountId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getLoanPaymentDetails");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling getLoanPaymentDetails");
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

        ParameterizedTypeReference<LoanPaymentDetails> localReturnType = new ParameterizedTypeReference<LoanPaymentDetails>() {};
        return apiClient.invokeAPI("/aggregation/v2/customers/{customerId}/accounts/{accountId}/loanDetails", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
