package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CustomerAccount;
import org.openapitools.client.model.CustomerAccounts;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T13:21:08.417587988Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AccountsApi {
    private ApiClient apiClient;

    public AccountsApi() {
        this(new ApiClient());
    }

    public AccountsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete Access to Customer Account by ID
     * This will delete access to a specific account only. If there are multiple permissioned accounts, then partners and their customers will have the flexibility to continue to access data from other connected accounts using the consented (Oauth) token for the customer. The customer data on that specific account will no longer be accessible. Any customer data already collected will be retained in accordance with our enterprise retention policy consistent with legal and business purposes. ​ _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>204</b> - Access to the customer account was successfully removed
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCustomerAccount(String customerId, String accountId) throws RestClientException {
        deleteCustomerAccountWithHttpInfo(customerId, accountId);
    }

    /**
     * Delete Access to Customer Account by ID
     * This will delete access to a specific account only. If there are multiple permissioned accounts, then partners and their customers will have the flexibility to continue to access data from other connected accounts using the consented (Oauth) token for the customer. The customer data on that specific account will no longer be accessible. Any customer data already collected will be retained in accordance with our enterprise retention policy consistent with legal and business purposes. ​ _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>204</b> - Access to the customer account was successfully removed
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCustomerAccountWithHttpInfo(String customerId, String accountId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling deleteCustomerAccount");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling deleteCustomerAccount");
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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/aggregation/v1/customers/{customerId}/accounts/{accountId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete Access to Customer Accounts by Institution Login ID
     * Delete access to all customer accounts for a given FI.​ This will delete access to the underlying account(s) under a given Institution Login ID. The customer data will no longer be accessible. Any customer data already collected will be retained in accordance with our enterprise retention policy consistent with legal and business purposes. _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>204</b> - Access to the customer accounts was successfully removed
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param institutionLoginId The institution login ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCustomerAccountsByInstitutionLogin(String customerId, String institutionLoginId) throws RestClientException {
        deleteCustomerAccountsByInstitutionLoginWithHttpInfo(customerId, institutionLoginId);
    }

    /**
     * Delete Access to Customer Accounts by Institution Login ID
     * Delete access to all customer accounts for a given FI.​ This will delete access to the underlying account(s) under a given Institution Login ID. The customer data will no longer be accessible. Any customer data already collected will be retained in accordance with our enterprise retention policy consistent with legal and business purposes. _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>204</b> - Access to the customer accounts was successfully removed
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param institutionLoginId The institution login ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCustomerAccountsByInstitutionLoginWithHttpInfo(String customerId, String institutionLoginId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling deleteCustomerAccountsByInstitutionLogin");
        }
        
        // verify the required parameter 'institutionLoginId' is set
        if (institutionLoginId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'institutionLoginId' when calling deleteCustomerAccountsByInstitutionLogin");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        uriVariables.put("institutionLoginId", institutionLoginId);

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/aggregation/v1/customers/{customerId}/institutionLogins/{institutionLoginId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Customer Account by ID
     * Get a customer account by ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @return CustomerAccount
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerAccount getCustomerAccount(String customerId, String accountId) throws RestClientException {
        return getCustomerAccountWithHttpInfo(customerId, accountId).getBody();
    }

    /**
     * Get Customer Account by ID
     * Get a customer account by ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @return ResponseEntity&lt;CustomerAccount&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerAccount> getCustomerAccountWithHttpInfo(String customerId, String accountId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getCustomerAccount");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling getCustomerAccount");
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

        ParameterizedTypeReference<CustomerAccount> localReturnType = new ParameterizedTypeReference<CustomerAccount>() {};
        return apiClient.invokeAPI("/aggregation/v2/customers/{customerId}/accounts/{accountId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Customer Accounts
     * Get all accounts owned by the given customer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account list was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param status A filter to fetch account in the given status (optional)
     * @param accountType A filter to fetch accounts for the given type. Currently supported types: \&quot;ava\&quot; (optional)
     * @return CustomerAccounts
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerAccounts getCustomerAccounts(String customerId, String status, String accountType) throws RestClientException {
        return getCustomerAccountsWithHttpInfo(customerId, status, accountType).getBody();
    }

    /**
     * Get Customer Accounts
     * Get all accounts owned by the given customer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account list was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param status A filter to fetch account in the given status (optional)
     * @param accountType A filter to fetch accounts for the given type. Currently supported types: \&quot;ava\&quot; (optional)
     * @return ResponseEntity&lt;CustomerAccounts&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerAccounts> getCustomerAccountsWithHttpInfo(String customerId, String status, String accountType) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getCustomerAccounts");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "account_type", accountType));
        

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<CustomerAccounts> localReturnType = new ParameterizedTypeReference<CustomerAccounts>() {};
        return apiClient.invokeAPI("/aggregation/v1/customers/{customerId}/accounts", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Customer Accounts by Institution ID
     * Get all active accounts owned by the given customer at the given institution.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account list was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param institutionId The institution ID (required)
     * @return CustomerAccounts
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerAccounts getCustomerAccountsByInstitution(String customerId, Long institutionId) throws RestClientException {
        return getCustomerAccountsByInstitutionWithHttpInfo(customerId, institutionId).getBody();
    }

    /**
     * Get Customer Accounts by Institution ID
     * Get all active accounts owned by the given customer at the given institution.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account list was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param institutionId The institution ID (required)
     * @return ResponseEntity&lt;CustomerAccounts&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerAccounts> getCustomerAccountsByInstitutionWithHttpInfo(String customerId, Long institutionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getCustomerAccountsByInstitution");
        }
        
        // verify the required parameter 'institutionId' is set
        if (institutionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'institutionId' when calling getCustomerAccountsByInstitution");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        uriVariables.put("institutionId", institutionId);

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

        ParameterizedTypeReference<CustomerAccounts> localReturnType = new ParameterizedTypeReference<CustomerAccounts>() {};
        return apiClient.invokeAPI("/aggregation/v1/customers/{customerId}/institutions/{institutionId}/accounts", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Customer Accounts by Institution Login ID
     * Get all accounts associated with the given institution login. All accounts returned are accessible by a single set of credentials on a single institution.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account list was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param institutionLoginId The institution login ID (required)
     * @return CustomerAccounts
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerAccounts getCustomerAccountsByInstitutionLogin(String customerId, String institutionLoginId) throws RestClientException {
        return getCustomerAccountsByInstitutionLoginWithHttpInfo(customerId, institutionLoginId).getBody();
    }

    /**
     * Get Customer Accounts by Institution Login ID
     * Get all accounts associated with the given institution login. All accounts returned are accessible by a single set of credentials on a single institution.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account list was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param institutionLoginId The institution login ID (required)
     * @return ResponseEntity&lt;CustomerAccounts&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerAccounts> getCustomerAccountsByInstitutionLoginWithHttpInfo(String customerId, String institutionLoginId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getCustomerAccountsByInstitutionLogin");
        }
        
        // verify the required parameter 'institutionLoginId' is set
        if (institutionLoginId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'institutionLoginId' when calling getCustomerAccountsByInstitutionLogin");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        uriVariables.put("institutionLoginId", institutionLoginId);

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

        ParameterizedTypeReference<CustomerAccounts> localReturnType = new ParameterizedTypeReference<CustomerAccounts>() {};
        return apiClient.invokeAPI("/aggregation/v1/customers/{customerId}/institutionLogins/{institutionLoginId}/accounts", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Refresh Customer Accounts
     * Refresh account and transaction data for all accounts associated with the  given &#x60;customerId&#x60; with a connection to the institution.  Client apps are not permitted to automate calls to the Refresh services. Active accounts are automatically refreshed by Finicity once per day. Because many financial institutions only post transactions once per day, calling Refresh services repeatedly is usually a waste of resources and is not recommended.  Apps may call Refresh services for a specific customer when there is a specific business case for the need of data that is up to date as of the moment. Please discuss with your account manager and systems engineer for further clarification.  The recommended timeout setting for this request is 120 seconds in order to receive a response. However, you can terminate the connection after making the call the operation will still complete. You will have to pull the account records to check for an updated aggregation attempt date to know when the refresh is complete.  Note: This service is not available for all Data Access Tiers.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account list was successfully refreshed
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @return CustomerAccounts
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerAccounts refreshCustomerAccounts(String customerId) throws RestClientException {
        return refreshCustomerAccountsWithHttpInfo(customerId).getBody();
    }

    /**
     * Refresh Customer Accounts
     * Refresh account and transaction data for all accounts associated with the  given &#x60;customerId&#x60; with a connection to the institution.  Client apps are not permitted to automate calls to the Refresh services. Active accounts are automatically refreshed by Finicity once per day. Because many financial institutions only post transactions once per day, calling Refresh services repeatedly is usually a waste of resources and is not recommended.  Apps may call Refresh services for a specific customer when there is a specific business case for the need of data that is up to date as of the moment. Please discuss with your account manager and systems engineer for further clarification.  The recommended timeout setting for this request is 120 seconds in order to receive a response. However, you can terminate the connection after making the call the operation will still complete. You will have to pull the account records to check for an updated aggregation attempt date to know when the refresh is complete.  Note: This service is not available for all Data Access Tiers.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account list was successfully refreshed
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @return ResponseEntity&lt;CustomerAccounts&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerAccounts> refreshCustomerAccountsWithHttpInfo(String customerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling refreshCustomerAccounts");
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<CustomerAccounts> localReturnType = new ParameterizedTypeReference<CustomerAccounts>() {};
        return apiClient.invokeAPI("/aggregation/v1/customers/{customerId}/accounts", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Refresh Customer Accounts by Institution Login ID
     * Refresh account and transaction data for all accounts associated with a given &#x60;institutionLoginId&#x60; with a connection to the institution.  Client apps are not permitted to automate calls to the Refresh services. Active accounts are automatically refreshed by Finicity once per day. Because many financial institutions only post transactions once per day, calling Refresh repeatedly is usually a waste of resources and is not recommended.  Apps may call Refresh services for a specific customer when there is a specific business case for the need of data that is up to date as of the moment. Please discuss with your account manager and systems engineer for further clarification.  The recommended timeout setting for this request is 120 seconds in order to receive a response. However, you can terminate the connection after making the call the operation will still complete. You will have to pull the account records to check for an updated aggregation attempt date to know when the refresh is complete.  Note: This service is not available for all Data Access Tiers.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account list was successfully refreshed
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param institutionLoginId The institution login ID (required)
     * @return CustomerAccounts
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerAccounts refreshCustomerAccountsByInstitutionLogin(String customerId, String institutionLoginId) throws RestClientException {
        return refreshCustomerAccountsByInstitutionLoginWithHttpInfo(customerId, institutionLoginId).getBody();
    }

    /**
     * Refresh Customer Accounts by Institution Login ID
     * Refresh account and transaction data for all accounts associated with a given &#x60;institutionLoginId&#x60; with a connection to the institution.  Client apps are not permitted to automate calls to the Refresh services. Active accounts are automatically refreshed by Finicity once per day. Because many financial institutions only post transactions once per day, calling Refresh repeatedly is usually a waste of resources and is not recommended.  Apps may call Refresh services for a specific customer when there is a specific business case for the need of data that is up to date as of the moment. Please discuss with your account manager and systems engineer for further clarification.  The recommended timeout setting for this request is 120 seconds in order to receive a response. However, you can terminate the connection after making the call the operation will still complete. You will have to pull the account records to check for an updated aggregation attempt date to know when the refresh is complete.  Note: This service is not available for all Data Access Tiers.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account list was successfully refreshed
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param institutionLoginId The institution login ID (required)
     * @return ResponseEntity&lt;CustomerAccounts&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerAccounts> refreshCustomerAccountsByInstitutionLoginWithHttpInfo(String customerId, String institutionLoginId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling refreshCustomerAccountsByInstitutionLogin");
        }
        
        // verify the required parameter 'institutionLoginId' is set
        if (institutionLoginId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'institutionLoginId' when calling refreshCustomerAccountsByInstitutionLogin");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        uriVariables.put("institutionLoginId", institutionLoginId);

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

        ParameterizedTypeReference<CustomerAccounts> localReturnType = new ParameterizedTypeReference<CustomerAccounts>() {};
        return apiClient.invokeAPI("/aggregation/v1/customers/{customerId}/institutionLogins/{institutionLoginId}/accounts", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Refresh Customer Account by Institution Login ID for Data Access Tiers
     * Refresh account and transaction data for all accounts associated with a given &#39;institutionLoginId&#x60; with a connection to the institution. Client apps are not permitted to automate calls to the Refresh services. Active accounts are automatically refreshed by Finicity once per day.  Apps may call Refresh services for a specific customer when there is a specific business case for the need of data that is up to date as of the moment. Please discuss with your account manager and systems engineer for further clarification.  Note: This service will be used for Data Access Tiers ASD, AFD and ATD.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>204</b> - The account list was successfully refreshed
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param institutionLoginId The institution login ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void refreshCustomerAccountsByInstitutionLoginV2(String customerId, String institutionLoginId) throws RestClientException {
        refreshCustomerAccountsByInstitutionLoginV2WithHttpInfo(customerId, institutionLoginId);
    }

    /**
     * Refresh Customer Account by Institution Login ID for Data Access Tiers
     * Refresh account and transaction data for all accounts associated with a given &#39;institutionLoginId&#x60; with a connection to the institution. Client apps are not permitted to automate calls to the Refresh services. Active accounts are automatically refreshed by Finicity once per day.  Apps may call Refresh services for a specific customer when there is a specific business case for the need of data that is up to date as of the moment. Please discuss with your account manager and systems engineer for further clarification.  Note: This service will be used for Data Access Tiers ASD, AFD and ATD.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>204</b> - The account list was successfully refreshed
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param institutionLoginId The institution login ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> refreshCustomerAccountsByInstitutionLoginV2WithHttpInfo(String customerId, String institutionLoginId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling refreshCustomerAccountsByInstitutionLoginV2");
        }
        
        // verify the required parameter 'institutionLoginId' is set
        if (institutionLoginId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'institutionLoginId' when calling refreshCustomerAccountsByInstitutionLoginV2");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        uriVariables.put("institutionLoginId", institutionLoginId);

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/aggregation/v2/customers/{customerId}/institutionLogins/{institutionLoginId}/accounts", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Refresh Customer Accounts for Data Access Tiers
     * Refresh account and transaction data for all accounts associated with the  given &#x60;customerId&#x60; with a connection to the institution.  Client apps are not permitted to automate calls to the Refresh services. Active accounts are automatically refreshed by Finicity once per day. Apps may call Refresh services for a specific customer when there is a specific business case for the need of data that is up to date as of the moment. Please discuss with your account manager and systems engineer for further clarification.  Note: This service will be used for Data Access Tiers ASD, AFD and ATD.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>204</b> - The account list was successfully refreshed
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void refreshCustomerAccountsV2(String customerId) throws RestClientException {
        refreshCustomerAccountsV2WithHttpInfo(customerId);
    }

    /**
     * Refresh Customer Accounts for Data Access Tiers
     * Refresh account and transaction data for all accounts associated with the  given &#x60;customerId&#x60; with a connection to the institution.  Client apps are not permitted to automate calls to the Refresh services. Active accounts are automatically refreshed by Finicity once per day. Apps may call Refresh services for a specific customer when there is a specific business case for the need of data that is up to date as of the moment. Please discuss with your account manager and systems engineer for further clarification.  Note: This service will be used for Data Access Tiers ASD, AFD and ATD.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>204</b> - The account list was successfully refreshed
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> refreshCustomerAccountsV2WithHttpInfo(String customerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling refreshCustomerAccountsV2");
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/aggregation/v2/customers/{customerId}/accounts", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
