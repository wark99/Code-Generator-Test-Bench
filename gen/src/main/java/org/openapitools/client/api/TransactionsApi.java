package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ErrorMessage;
import org.openapitools.client.model.SecurityFreezeErrorMessage;
import org.openapitools.client.model.Transaction;
import org.openapitools.client.model.Transactions;
import org.openapitools.client.model.TransactionsReportAck;
import org.openapitools.client.model.TransactionsReportConstraints;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T12:50:32.834459740Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TransactionsApi {
    private ApiClient apiClient;

    public TransactionsApi() {
        this(new ApiClient());
    }

    public TransactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Generate Transactions Report for the customer
     * Generate a Transaction Report for the given accounts under the given customer. This service retrieves up to 24 months of transaction history for the given customer. It then uses this information to generate the Transaction Report.  This is a premium service. A billable event will be created upon the successful generation of the Transactions Report.  Before calling this API, a consumer must be created for the given customer ID (see Consumers APIs).  There cannot be more than 24 months between &#x60;fromDate&#x60; and &#x60;toDate&#x60;.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param fromDate A start date (required)
     * @param toDate A end date (required)
     * @param transactionsReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @param includePending If pending transactions must be included (optional, default to false)
     * @return TransactionsReportAck
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TransactionsReportAck generateTransactionsReport(String customerId, Long fromDate, Long toDate, TransactionsReportConstraints transactionsReportConstraints, String callbackUrl, Boolean includePending) throws RestClientException {
        return generateTransactionsReportWithHttpInfo(customerId, fromDate, toDate, transactionsReportConstraints, callbackUrl, includePending).getBody();
    }

    /**
     * Generate Transactions Report for the customer
     * Generate a Transaction Report for the given accounts under the given customer. This service retrieves up to 24 months of transaction history for the given customer. It then uses this information to generate the Transaction Report.  This is a premium service. A billable event will be created upon the successful generation of the Transactions Report.  Before calling this API, a consumer must be created for the given customer ID (see Consumers APIs).  There cannot be more than 24 months between &#x60;fromDate&#x60; and &#x60;toDate&#x60;.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param fromDate A start date (required)
     * @param toDate A end date (required)
     * @param transactionsReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @param includePending If pending transactions must be included (optional, default to false)
     * @return ResponseEntity&lt;TransactionsReportAck&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TransactionsReportAck> generateTransactionsReportWithHttpInfo(String customerId, Long fromDate, Long toDate, TransactionsReportConstraints transactionsReportConstraints, String callbackUrl, Boolean includePending) throws RestClientException {
        Object localVarPostBody = transactionsReportConstraints;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling generateTransactionsReport");
        }
        
        // verify the required parameter 'fromDate' is set
        if (fromDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fromDate' when calling generateTransactionsReport");
        }
        
        // verify the required parameter 'toDate' is set
        if (toDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'toDate' when calling generateTransactionsReport");
        }
        
        // verify the required parameter 'transactionsReportConstraints' is set
        if (transactionsReportConstraints == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'transactionsReportConstraints' when calling generateTransactionsReport");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "callbackUrl", callbackUrl));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromDate", fromDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "toDate", toDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "includePending", includePending));
        

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<TransactionsReportAck> localReturnType = new ParameterizedTypeReference<TransactionsReportAck>() {};
        return apiClient.invokeAPI("/decisioning/v2/customers/{customerId}/transactions", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get All Customer Transactions
     * Get all transactions available for this customer within the given date range, across all accounts. This service supports paging and sorting by &#x60;transactionDate&#x60; (or &#x60;postedDate&#x60; if no transaction date is provided), with a maximum of 1000 transactions per request.  Standard consumer aggregation provides up to 180 days of transactions prior to the date each account was added to the Finicity system. To access older transactions, you must first call the service Load Historic Transactions for Account.  There is no limit for the size of the window between &#x60;fromDate&#x60; and &#x60;toDate&#x60;, however, the maximum number of transactions returned on one page is 1000.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The transactions were successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param fromDate A start date (required)
     * @param toDate A end date (required)
     * @param start Index of the page of results to return (optional, default to 1)
     * @param limit Maximum number of results per page (optional, default to 25)
     * @param sort Date sort order: \&quot;asc\&quot; for ascending, \&quot;desc\&quot; for descending (optional, default to desc)
     * @param includePending If pending transactions must be included (optional, default to false)
     * @return Transactions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Transactions getAllCustomerTransactions(String customerId, Long fromDate, Long toDate, Integer start, Integer limit, String sort, Boolean includePending) throws RestClientException {
        return getAllCustomerTransactionsWithHttpInfo(customerId, fromDate, toDate, start, limit, sort, includePending).getBody();
    }

    /**
     * Get All Customer Transactions
     * Get all transactions available for this customer within the given date range, across all accounts. This service supports paging and sorting by &#x60;transactionDate&#x60; (or &#x60;postedDate&#x60; if no transaction date is provided), with a maximum of 1000 transactions per request.  Standard consumer aggregation provides up to 180 days of transactions prior to the date each account was added to the Finicity system. To access older transactions, you must first call the service Load Historic Transactions for Account.  There is no limit for the size of the window between &#x60;fromDate&#x60; and &#x60;toDate&#x60;, however, the maximum number of transactions returned on one page is 1000.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The transactions were successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param fromDate A start date (required)
     * @param toDate A end date (required)
     * @param start Index of the page of results to return (optional, default to 1)
     * @param limit Maximum number of results per page (optional, default to 25)
     * @param sort Date sort order: \&quot;asc\&quot; for ascending, \&quot;desc\&quot; for descending (optional, default to desc)
     * @param includePending If pending transactions must be included (optional, default to false)
     * @return ResponseEntity&lt;Transactions&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Transactions> getAllCustomerTransactionsWithHttpInfo(String customerId, Long fromDate, Long toDate, Integer start, Integer limit, String sort, Boolean includePending) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getAllCustomerTransactions");
        }
        
        // verify the required parameter 'fromDate' is set
        if (fromDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fromDate' when calling getAllCustomerTransactions");
        }
        
        // verify the required parameter 'toDate' is set
        if (toDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'toDate' when calling getAllCustomerTransactions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromDate", fromDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "toDate", toDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "includePending", includePending));
        

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<Transactions> localReturnType = new ParameterizedTypeReference<Transactions>() {};
        return apiClient.invokeAPI("/aggregation/v3/customers/{customerId}/transactions", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Customer Account Transactions
     * Get all transactions available for this customer account within the given date range. This service supports paging and sorting by &#x60;transactionDate&#x60; (or &#x60;postedDate&#x60; if no transaction date is provided), with a maximum of 1000 transactions per request.  Standard consumer aggregation provides up to 180 days of transactions prior to the date each account was added to the Finicity system. To access older transactions, you must first call the Cash Flow Verification service Load Historic Transactions for Account.  There is no limit for the size of the window between &#x60;fromDate&#x60; and &#x60;toDate&#x60;, however, the maximum number of transactions returned on one page is 1000.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The transactions were successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @param fromDate A start date (required)
     * @param toDate A end date (required)
     * @param start Index of the page of results to return (optional, default to 1)
     * @param limit Maximum number of results per page (optional, default to 25)
     * @param sort Date sort order: \&quot;asc\&quot; for ascending, \&quot;desc\&quot; for descending (optional, default to desc)
     * @param includePending If pending transactions must be included (optional, default to false)
     * @return Transactions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Transactions getCustomerAccountTransactions(String customerId, String accountId, Long fromDate, Long toDate, Integer start, Integer limit, String sort, Boolean includePending) throws RestClientException {
        return getCustomerAccountTransactionsWithHttpInfo(customerId, accountId, fromDate, toDate, start, limit, sort, includePending).getBody();
    }

    /**
     * Get Customer Account Transactions
     * Get all transactions available for this customer account within the given date range. This service supports paging and sorting by &#x60;transactionDate&#x60; (or &#x60;postedDate&#x60; if no transaction date is provided), with a maximum of 1000 transactions per request.  Standard consumer aggregation provides up to 180 days of transactions prior to the date each account was added to the Finicity system. To access older transactions, you must first call the Cash Flow Verification service Load Historic Transactions for Account.  There is no limit for the size of the window between &#x60;fromDate&#x60; and &#x60;toDate&#x60;, however, the maximum number of transactions returned on one page is 1000.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The transactions were successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @param fromDate A start date (required)
     * @param toDate A end date (required)
     * @param start Index of the page of results to return (optional, default to 1)
     * @param limit Maximum number of results per page (optional, default to 25)
     * @param sort Date sort order: \&quot;asc\&quot; for ascending, \&quot;desc\&quot; for descending (optional, default to desc)
     * @param includePending If pending transactions must be included (optional, default to false)
     * @return ResponseEntity&lt;Transactions&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Transactions> getCustomerAccountTransactionsWithHttpInfo(String customerId, String accountId, Long fromDate, Long toDate, Integer start, Integer limit, String sort, Boolean includePending) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getCustomerAccountTransactions");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling getCustomerAccountTransactions");
        }
        
        // verify the required parameter 'fromDate' is set
        if (fromDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fromDate' when calling getCustomerAccountTransactions");
        }
        
        // verify the required parameter 'toDate' is set
        if (toDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'toDate' when calling getCustomerAccountTransactions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        uriVariables.put("accountId", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromDate", fromDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "toDate", toDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "includePending", includePending));
        

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<Transactions> localReturnType = new ParameterizedTypeReference<Transactions>() {};
        return apiClient.invokeAPI("/aggregation/v4/customers/{customerId}/accounts/{accountId}/transactions", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Customer Transaction by ID
     * Get details for the given transaction.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The transaction was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param transactionId A transaction ID (required)
     * @return Transaction
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Transaction getCustomerTransaction(String customerId, Long transactionId) throws RestClientException {
        return getCustomerTransactionWithHttpInfo(customerId, transactionId).getBody();
    }

    /**
     * Get Customer Transaction by ID
     * Get details for the given transaction.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The transaction was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param transactionId A transaction ID (required)
     * @return ResponseEntity&lt;Transaction&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Transaction> getCustomerTransactionWithHttpInfo(String customerId, Long transactionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getCustomerTransaction");
        }
        
        // verify the required parameter 'transactionId' is set
        if (transactionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'transactionId' when calling getCustomerTransaction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        uriVariables.put("transactionId", transactionId);

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

        ParameterizedTypeReference<Transaction> localReturnType = new ParameterizedTypeReference<Transaction>() {};
        return apiClient.invokeAPI("/aggregation/v2/customers/{customerId}/transactions/{transactionId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Load Historic Transactions for Customer Account
     * Connect to the account&#39;s financial institution and load up to 24 months of historic transactions for the account. Length of history varies by institution.  This is a premium service. The billable event is a call to this service specifying a customer ID that has not been seen before by this service. (If this service is called multiple times with the same customer ID, to load transactions from multiple accounts, only one billable event has occurred.)  The recommended timeout setting for this request is 180 seconds in order to receive a response. However, you can terminate the connection after making the call the operation will still complete. You will have to pull the account records to check for an updated aggregation attempt date to know when the refresh is complete.  The date range sent to the institution is calculated from the account&#39;s &#x60;createdDate&#x60;. This means that calling this service a second time for the same account normally will not add any new transactions for the account. For this reason, a second call to this service for a known account ID will usually return immediately.  In a few specific scenarios, it may be desirable to force a second connection to the institution for a known account ID. Some examples are:  * The institution&#39;s policy has changed, making more transactions available * Finicity has now added a longer transaction history support for the institution * The first call encountered an error, and the resulting Aggregation Ticket has now been fixed by the Finicity Support Team  In these cases, the POST request can contain the parameter &#x60;force&#x3D;true&#x60; in the request body to force the second connection.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>203</b> - The request was unsuccessful due to a required Multi-Factor Authentication (MFA) challenge. There is no further action that can be taken to resolve this error.
     * <p><b>204</b> - Historic transactions have been loaded successfully. The transactions are now available by calling the Get Customer Account Transactions API.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void loadHistoricTransactionsForCustomerAccount(String customerId, String accountId) throws RestClientException {
        loadHistoricTransactionsForCustomerAccountWithHttpInfo(customerId, accountId);
    }

    /**
     * Load Historic Transactions for Customer Account
     * Connect to the account&#39;s financial institution and load up to 24 months of historic transactions for the account. Length of history varies by institution.  This is a premium service. The billable event is a call to this service specifying a customer ID that has not been seen before by this service. (If this service is called multiple times with the same customer ID, to load transactions from multiple accounts, only one billable event has occurred.)  The recommended timeout setting for this request is 180 seconds in order to receive a response. However, you can terminate the connection after making the call the operation will still complete. You will have to pull the account records to check for an updated aggregation attempt date to know when the refresh is complete.  The date range sent to the institution is calculated from the account&#39;s &#x60;createdDate&#x60;. This means that calling this service a second time for the same account normally will not add any new transactions for the account. For this reason, a second call to this service for a known account ID will usually return immediately.  In a few specific scenarios, it may be desirable to force a second connection to the institution for a known account ID. Some examples are:  * The institution&#39;s policy has changed, making more transactions available * Finicity has now added a longer transaction history support for the institution * The first call encountered an error, and the resulting Aggregation Ticket has now been fixed by the Finicity Support Team  In these cases, the POST request can contain the parameter &#x60;force&#x3D;true&#x60; in the request body to force the second connection.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>203</b> - The request was unsuccessful due to a required Multi-Factor Authentication (MFA) challenge. There is no further action that can be taken to resolve this error.
     * <p><b>204</b> - Historic transactions have been loaded successfully. The transactions are now available by calling the Get Customer Account Transactions API.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> loadHistoricTransactionsForCustomerAccountWithHttpInfo(String customerId, String accountId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling loadHistoricTransactionsForCustomerAccount");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling loadHistoricTransactionsForCustomerAccount");
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
        return apiClient.invokeAPI("/aggregation/v1/customers/{customerId}/accounts/{accountId}/transactions/historic", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
