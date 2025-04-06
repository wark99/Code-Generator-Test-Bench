package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CustomerAccountMultipleStatements;
import org.openapitools.client.model.ErrorMessage;
import java.io.File;
import org.openapitools.client.model.SecurityFreezeErrorMessage;
import org.openapitools.client.model.StatementReportAck;
import org.openapitools.client.model.StatementReportConstraints;

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
public class BankStatementsApi {
    private ApiClient apiClient;

    public BankStatementsApi() {
        this(new ApiClient());
    }

    public BankStatementsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Generate Statement Report for the customer
     * Generate a Statement Report for the given accounts under the given customer.  This is a premium service. A billable event will be created upon the successful generation of the Statement Report.  Before calling this API, a consumer must be created for the given customer ID (see Consumers APIs).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param statementReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return StatementReportAck
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatementReportAck generateStatementReport(String customerId, StatementReportConstraints statementReportConstraints, String callbackUrl) throws RestClientException {
        return generateStatementReportWithHttpInfo(customerId, statementReportConstraints, callbackUrl).getBody();
    }

    /**
     * Generate Statement Report for the customer
     * Generate a Statement Report for the given accounts under the given customer.  This is a premium service. A billable event will be created upon the successful generation of the Statement Report.  Before calling this API, a consumer must be created for the given customer ID (see Consumers APIs).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param statementReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return ResponseEntity&lt;StatementReportAck&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatementReportAck> generateStatementReportWithHttpInfo(String customerId, StatementReportConstraints statementReportConstraints, String callbackUrl) throws RestClientException {
        Object localVarPostBody = statementReportConstraints;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling generateStatementReport");
        }
        
        // verify the required parameter 'statementReportConstraints' is set
        if (statementReportConstraints == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'statementReportConstraints' when calling generateStatementReport");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "callbackUrl", callbackUrl));
        

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<StatementReportAck> localReturnType = new ParameterizedTypeReference<StatementReportAck>() {};
        return apiClient.invokeAPI("/decisioning/v2/customers/{customerId}/statement", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Customer Account Multiple Statement Details
     * This endpoint retrieves details of the account statements available for a given customer (up to a maximum of 24 statements).  Use the asset ID of the statement you are interested in to obtain the statement report using Get Asset by Customer and ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account statements were successfully retrieved.
     * <p><b>203</b> - The request was unsuccessful due to a required Multi-Factor Authentication (MFA) challenge. There is no further action that can be taken to resolve this error.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @param index Request details of statements with comma-separated indexes between 1-24. The default value is 1 which will return details of the most recent statement. Increasing the index will return details of older statements, for example, setting the index value to 6 will return data on the sixth most recent statement. (optional, default to 1)
     * @return CustomerAccountMultipleStatements
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerAccountMultipleStatements getCustomerAccountMultipleStatement(String customerId, String accountId, String index) throws RestClientException {
        return getCustomerAccountMultipleStatementWithHttpInfo(customerId, accountId, index).getBody();
    }

    /**
     * Get Customer Account Multiple Statement Details
     * This endpoint retrieves details of the account statements available for a given customer (up to a maximum of 24 statements).  Use the asset ID of the statement you are interested in to obtain the statement report using Get Asset by Customer and ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The account statements were successfully retrieved.
     * <p><b>203</b> - The request was unsuccessful due to a required Multi-Factor Authentication (MFA) challenge. There is no further action that can be taken to resolve this error.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @param index Request details of statements with comma-separated indexes between 1-24. The default value is 1 which will return details of the most recent statement. Increasing the index will return details of older statements, for example, setting the index value to 6 will return data on the sixth most recent statement. (optional, default to 1)
     * @return ResponseEntity&lt;CustomerAccountMultipleStatements&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerAccountMultipleStatements> getCustomerAccountMultipleStatementWithHttpInfo(String customerId, String accountId, String index) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getCustomerAccountMultipleStatement");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling getCustomerAccountMultipleStatement");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        uriVariables.put("accountId", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "index", index));
        

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<CustomerAccountMultipleStatements> localReturnType = new ParameterizedTypeReference<CustomerAccountMultipleStatements>() {};
        return apiClient.invokeAPI("/aggregation/v3/customers/{customerId}/accounts/{accountId}/statement", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Customer Account Statement
     * Retrieve the customer&#39;s bank statements in PDF format. Up to 24 months of history is available depending on the financial institution. Since this is a premium service, charges incur per each successful statement retrieved.  For certified financial institutions, statements are available for the following account types: * Checking * Savings * Money market * CDs * Investments * Mortgage * Credit cards * Loans * Line of credit * Student Loans  Note: setting the timeout to 180 seconds is recommended to allow enough time for a response.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The statement was successfully downloaded as a PDF file
     * <p><b>203</b> - The request was unsuccessful due to a required Multi-Factor Authentication (MFA) challenge. There is no further action that can be taken to resolve this error.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @param index Request statements from 1-24. By default, 1 is the most recent statement. Increase the index value to count back (by month) and retrieve its most recent statement. (optional, default to 1)
     * @param type The type of statement to retrieve (optional)
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File getCustomerAccountStatement(String customerId, String accountId, Integer index, String type) throws RestClientException {
        return getCustomerAccountStatementWithHttpInfo(customerId, accountId, index, type).getBody();
    }

    /**
     * Get Customer Account Statement
     * Retrieve the customer&#39;s bank statements in PDF format. Up to 24 months of history is available depending on the financial institution. Since this is a premium service, charges incur per each successful statement retrieved.  For certified financial institutions, statements are available for the following account types: * Checking * Savings * Money market * CDs * Investments * Mortgage * Credit cards * Loans * Line of credit * Student Loans  Note: setting the timeout to 180 seconds is recommended to allow enough time for a response.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The statement was successfully downloaded as a PDF file
     * <p><b>203</b> - The request was unsuccessful due to a required Multi-Factor Authentication (MFA) challenge. There is no further action that can be taken to resolve this error.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param accountId The account ID (required)
     * @param index Request statements from 1-24. By default, 1 is the most recent statement. Increase the index value to count back (by month) and retrieve its most recent statement. (optional, default to 1)
     * @param type The type of statement to retrieve (optional)
     * @return ResponseEntity&lt;File&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<File> getCustomerAccountStatementWithHttpInfo(String customerId, String accountId, Integer index, String type) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getCustomerAccountStatement");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling getCustomerAccountStatement");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        uriVariables.put("accountId", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "index", index));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        

        final String[] localVarAccepts = { 
            "application/octet-stream", "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<File> localReturnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI("/aggregation/v1/customers/{customerId}/accounts/{accountId}/statement", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
