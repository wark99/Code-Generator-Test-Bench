package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AnalyticsReportAck;
import org.openapitools.client.model.AnalyticsReportConstraints;
import org.openapitools.client.model.BalanceAndCashFlowAnalyticsReportConstraints;
import org.openapitools.client.model.ErrorMessage;
import java.io.File;
import org.openapitools.client.model.ObbAnalyticsReport;
import org.openapitools.client.model.ObbAnalyticsReportAck;
import org.openapitools.client.model.ObbErrorMessage;
import org.openapitools.client.model.SecurityFreezeErrorMessage;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T14:15:37.937249550Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CashFlowAnalyticsApi {
    private ApiClient apiClient;

    public CashFlowAnalyticsApi() {
        this(new ApiClient());
    }

    public CashFlowAnalyticsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Generate Cash Flow Analytics
     * Cash Flow Analytics for Business analyzes cash flow over time to report metrics and identify behavior that may indicate risk.  Calculated metrics include: * Average transaction value by month over the requested time period * Net cash flow over the requested time period and broken down by month * Count and report of weeks in the requested time period where there   were zero transactions posted to the customer&#39;s accounts  * Minimum/maximum/average/sum/count of deposits by month * Minimum/maximum/average/sum/count of withdrawals by month * Estimated amount of deposits that can be classified as business   revenue  * Number of transactions posted incurring a non-sufficient funds (NSF)   fee, and net amount charged in NSF fees   This version of the API is intended for piloting and integration testing your application with the Cash Flow Analytics product. It does not adhere to FCRA requirements, and should not be used for production/lending purposes. See _Generate Cash Flow Analytics - FCRA_ for the FCRA compliant version of this API.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get Cash Flow Analytics Report_ (operation: _GetCashFlowAnalyticsReport_).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Response given when cash flow analytics were generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF.
     * <p><b>400</b> - A bad request was provided
     * <p><b>401</b> - Unauthorized request
     * <p><b>403</b> - Access forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - Resource conflict
     * @param customerId A customer ID (required)
     * @param balanceAndCashFlowAnalyticsReportConstraints  (required)
     * @param referenceNumber Partner-provided reference number to correlate reports. (optional)
     * @return ObbAnalyticsReportAck
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ObbAnalyticsReportAck generateCashFlowAnalytics(String customerId, BalanceAndCashFlowAnalyticsReportConstraints balanceAndCashFlowAnalyticsReportConstraints, String referenceNumber) throws RestClientException {
        return generateCashFlowAnalyticsWithHttpInfo(customerId, balanceAndCashFlowAnalyticsReportConstraints, referenceNumber).getBody();
    }

    /**
     * Generate Cash Flow Analytics
     * Cash Flow Analytics for Business analyzes cash flow over time to report metrics and identify behavior that may indicate risk.  Calculated metrics include: * Average transaction value by month over the requested time period * Net cash flow over the requested time period and broken down by month * Count and report of weeks in the requested time period where there   were zero transactions posted to the customer&#39;s accounts  * Minimum/maximum/average/sum/count of deposits by month * Minimum/maximum/average/sum/count of withdrawals by month * Estimated amount of deposits that can be classified as business   revenue  * Number of transactions posted incurring a non-sufficient funds (NSF)   fee, and net amount charged in NSF fees   This version of the API is intended for piloting and integration testing your application with the Cash Flow Analytics product. It does not adhere to FCRA requirements, and should not be used for production/lending purposes. See _Generate Cash Flow Analytics - FCRA_ for the FCRA compliant version of this API.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get Cash Flow Analytics Report_ (operation: _GetCashFlowAnalyticsReport_).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Response given when cash flow analytics were generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF.
     * <p><b>400</b> - A bad request was provided
     * <p><b>401</b> - Unauthorized request
     * <p><b>403</b> - Access forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - Resource conflict
     * @param customerId A customer ID (required)
     * @param balanceAndCashFlowAnalyticsReportConstraints  (required)
     * @param referenceNumber Partner-provided reference number to correlate reports. (optional)
     * @return ResponseEntity&lt;ObbAnalyticsReportAck&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ObbAnalyticsReportAck> generateCashFlowAnalyticsWithHttpInfo(String customerId, BalanceAndCashFlowAnalyticsReportConstraints balanceAndCashFlowAnalyticsReportConstraints, String referenceNumber) throws RestClientException {
        Object localVarPostBody = balanceAndCashFlowAnalyticsReportConstraints;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling generateCashFlowAnalytics");
        }
        
        // verify the required parameter 'balanceAndCashFlowAnalyticsReportConstraints' is set
        if (balanceAndCashFlowAnalyticsReportConstraints == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'balanceAndCashFlowAnalyticsReportConstraints' when calling generateCashFlowAnalytics");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "reference-number", referenceNumber));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<ObbAnalyticsReportAck> localReturnType = new ParameterizedTypeReference<ObbAnalyticsReportAck>() {};
        return apiClient.invokeAPI("/analytics/cashflow/v1/customer/{customerId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate Cash Flow Analytics - FCRA
     * Cash Flow Analytics for Business analyzes cash flow over time to report metrics and identify behavior that may indicate risk.  Calculated metrics include: * Average transaction value by month over the requested time period * Net cash flow over the requested time period and broken down by month * Count and report of weeks in the requested time period where there   were zero transactions posted to the customer&#39;s accounts  * Minimum/maximum/average/sum/count of deposits by month * Minimum/maximum/average/sum/count of withdrawals by month * Estimated amount of deposits that can be classified as business   revenue  * Number of transactions posted incurring a non-sufficient funds (NSF)   fee, and net amount charged in NSF fees   This version of the API is intended for production use. It maintains and enforces all compliance with FCRA rules and requirements.  *Note:* this is a premium service, billable per every successful API call for non-testing customers.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get Cash Flow Analytics Report - FCRA_ (operation: _GetCashFlowAnalyticsReportFCRA_).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Response given when cash flow analytics (FCRA) were generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF.
     * <p><b>400</b> - A bad request was provided
     * <p><b>401</b> - Unauthorized request
     * <p><b>403</b> - Access forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - Resource conflict
     * @param customerId A customer ID (required)
     * @param balanceAndCashFlowAnalyticsReportConstraints  (required)
     * @param referenceNumber Partner-provided reference number to correlate reports. (optional)
     * @return ObbAnalyticsReportAck
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ObbAnalyticsReportAck generateCashFlowAnalyticsFcra(String customerId, BalanceAndCashFlowAnalyticsReportConstraints balanceAndCashFlowAnalyticsReportConstraints, String referenceNumber) throws RestClientException {
        return generateCashFlowAnalyticsFcraWithHttpInfo(customerId, balanceAndCashFlowAnalyticsReportConstraints, referenceNumber).getBody();
    }

    /**
     * Generate Cash Flow Analytics - FCRA
     * Cash Flow Analytics for Business analyzes cash flow over time to report metrics and identify behavior that may indicate risk.  Calculated metrics include: * Average transaction value by month over the requested time period * Net cash flow over the requested time period and broken down by month * Count and report of weeks in the requested time period where there   were zero transactions posted to the customer&#39;s accounts  * Minimum/maximum/average/sum/count of deposits by month * Minimum/maximum/average/sum/count of withdrawals by month * Estimated amount of deposits that can be classified as business   revenue  * Number of transactions posted incurring a non-sufficient funds (NSF)   fee, and net amount charged in NSF fees   This version of the API is intended for production use. It maintains and enforces all compliance with FCRA rules and requirements.  *Note:* this is a premium service, billable per every successful API call for non-testing customers.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get Cash Flow Analytics Report - FCRA_ (operation: _GetCashFlowAnalyticsReportFCRA_).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Response given when cash flow analytics (FCRA) were generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF.
     * <p><b>400</b> - A bad request was provided
     * <p><b>401</b> - Unauthorized request
     * <p><b>403</b> - Access forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - Resource conflict
     * @param customerId A customer ID (required)
     * @param balanceAndCashFlowAnalyticsReportConstraints  (required)
     * @param referenceNumber Partner-provided reference number to correlate reports. (optional)
     * @return ResponseEntity&lt;ObbAnalyticsReportAck&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ObbAnalyticsReportAck> generateCashFlowAnalyticsFcraWithHttpInfo(String customerId, BalanceAndCashFlowAnalyticsReportConstraints balanceAndCashFlowAnalyticsReportConstraints, String referenceNumber) throws RestClientException {
        Object localVarPostBody = balanceAndCashFlowAnalyticsReportConstraints;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling generateCashFlowAnalyticsFcra");
        }
        
        // verify the required parameter 'balanceAndCashFlowAnalyticsReportConstraints' is set
        if (balanceAndCashFlowAnalyticsReportConstraints == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'balanceAndCashFlowAnalyticsReportConstraints' when calling generateCashFlowAnalyticsFcra");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "reference-number", referenceNumber));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<ObbAnalyticsReportAck> localReturnType = new ParameterizedTypeReference<ObbAnalyticsReportAck>() {};
        return apiClient.invokeAPI("/analytics/cashflow/v1/customer/{customerId}/fcra", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate Cash Flow Analytics Report for the customer - Personal/Business
     * Generate a Cashflow Analytics Report for a given customer. This service retrieves up to two years of transaction history from connected accounts.  Cashflow Analytics analyzes transaction over time to report metrics and identify behavior that may indicate risk.  Before calling this API, a consumer or business may need to be created for the given customer ID based on the user type (see Consumer/Business APIs).  If no account type of checking or savings is found, the service will return HTTP 400 Bad Request.  This is a premium service, billable per every successful API call for non-testing customers. A successful call to this API will generate analytics report which can be retrieved via Get Report by Customer or Get Report by Consumer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param userType UserType indicates if the request is for a business or personal use case, Allowed values: business/personal. (required)
     * @param analyticsReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return AnalyticsReportAck
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AnalyticsReportAck generateCashflowAnalyticsReport(String customerId, String userType, AnalyticsReportConstraints analyticsReportConstraints, String callbackUrl) throws RestClientException {
        return generateCashflowAnalyticsReportWithHttpInfo(customerId, userType, analyticsReportConstraints, callbackUrl).getBody();
    }

    /**
     * Generate Cash Flow Analytics Report for the customer - Personal/Business
     * Generate a Cashflow Analytics Report for a given customer. This service retrieves up to two years of transaction history from connected accounts.  Cashflow Analytics analyzes transaction over time to report metrics and identify behavior that may indicate risk.  Before calling this API, a consumer or business may need to be created for the given customer ID based on the user type (see Consumer/Business APIs).  If no account type of checking or savings is found, the service will return HTTP 400 Bad Request.  This is a premium service, billable per every successful API call for non-testing customers. A successful call to this API will generate analytics report which can be retrieved via Get Report by Customer or Get Report by Consumer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param userType UserType indicates if the request is for a business or personal use case, Allowed values: business/personal. (required)
     * @param analyticsReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return ResponseEntity&lt;AnalyticsReportAck&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AnalyticsReportAck> generateCashflowAnalyticsReportWithHttpInfo(String customerId, String userType, AnalyticsReportConstraints analyticsReportConstraints, String callbackUrl) throws RestClientException {
        Object localVarPostBody = analyticsReportConstraints;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling generateCashflowAnalyticsReport");
        }
        
        // verify the required parameter 'userType' is set
        if (userType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userType' when calling generateCashflowAnalyticsReport");
        }
        
        // verify the required parameter 'analyticsReportConstraints' is set
        if (analyticsReportConstraints == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'analyticsReportConstraints' when calling generateCashflowAnalyticsReport");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        uriVariables.put("userType", userType);

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

        ParameterizedTypeReference<AnalyticsReportAck> localReturnType = new ParameterizedTypeReference<AnalyticsReportAck>() {};
        return apiClient.invokeAPI("/decisioning/v2/customers/{customerId}/reports/cashflow-analytics/userTypes/{userType}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get OBB Analytics Report
     * Retrieve the report saved by _Generate Balance Analytics_, _Generate Cash Flow Analytics_, or _Generate Payment History_. Requires the report ID generated by the previous call.  Report data can either be retrieved as a JSON document or a PDF file.  To specify the format required, set the _Accept request header_ to either **application/json** or **application/pdf**. If neither is set, the report format will be returned as a JSON document.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - OBB Analytics report data as JSON or PDF
     * <p><b>401</b> - Unauthorized request
     * <p><b>403</b> - Access forbidden
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param obbReportId Report ID generated and returned by OBB products (required)
     * @return ObbAnalyticsReport
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ObbAnalyticsReport getObbAnalyticsReport(String obbReportId) throws RestClientException {
        return getObbAnalyticsReportWithHttpInfo(obbReportId).getBody();
    }

    /**
     * Get OBB Analytics Report
     * Retrieve the report saved by _Generate Balance Analytics_, _Generate Cash Flow Analytics_, or _Generate Payment History_. Requires the report ID generated by the previous call.  Report data can either be retrieved as a JSON document or a PDF file.  To specify the format required, set the _Accept request header_ to either **application/json** or **application/pdf**. If neither is set, the report format will be returned as a JSON document.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - OBB Analytics report data as JSON or PDF
     * <p><b>401</b> - Unauthorized request
     * <p><b>403</b> - Access forbidden
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param obbReportId Report ID generated and returned by OBB products (required)
     * @return ResponseEntity&lt;ObbAnalyticsReport&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ObbAnalyticsReport> getObbAnalyticsReportWithHttpInfo(String obbReportId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'obbReportId' is set
        if (obbReportId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'obbReportId' when calling getObbAnalyticsReport");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("obb_report_id", obbReportId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/pdf"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<ObbAnalyticsReport> localReturnType = new ParameterizedTypeReference<ObbAnalyticsReport>() {};
        return apiClient.invokeAPI("/analytics/data/v1/{obb_report_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get OBB Analytics Report - FCRA
     * Retrieve the report saved by _Generate Balance Analytics - FCRA_, _Generate Cash Flow Analytics - FCRA_, or _Generate Payment History - FCRA_. Requires the report ID generated by the previous call.  Report data can either be retrieved as a JSON document or a PDF file.  To specify the format required, set the _Accept request header_ to either **application/json** or **application/pdf**. If neither is set, the report format will be returned as a JSON document.  *Note:* this is a premium service, billable per every successful API call for non-testing customers.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - OBB Analytics FCRA report data as JSON or PDF
     * <p><b>401</b> - Unauthorized request
     * <p><b>403</b> - Access forbidden
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param obbReportId Report ID generated and returned by OBB products (required)
     * @param purpose 2-digit code from [Permissible Purpose Codes](https://developer.mastercard.com/open-banking-us/documentation/products/lend/report-handling/permissible-purpose-codes/), specifying the reason for retrieving this report. Required for retrieving some reports. (required)
     * @return ObbAnalyticsReport
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ObbAnalyticsReport getObbAnalyticsReportFcra(String obbReportId, String purpose) throws RestClientException {
        return getObbAnalyticsReportFcraWithHttpInfo(obbReportId, purpose).getBody();
    }

    /**
     * Get OBB Analytics Report - FCRA
     * Retrieve the report saved by _Generate Balance Analytics - FCRA_, _Generate Cash Flow Analytics - FCRA_, or _Generate Payment History - FCRA_. Requires the report ID generated by the previous call.  Report data can either be retrieved as a JSON document or a PDF file.  To specify the format required, set the _Accept request header_ to either **application/json** or **application/pdf**. If neither is set, the report format will be returned as a JSON document.  *Note:* this is a premium service, billable per every successful API call for non-testing customers.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - OBB Analytics FCRA report data as JSON or PDF
     * <p><b>401</b> - Unauthorized request
     * <p><b>403</b> - Access forbidden
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param obbReportId Report ID generated and returned by OBB products (required)
     * @param purpose 2-digit code from [Permissible Purpose Codes](https://developer.mastercard.com/open-banking-us/documentation/products/lend/report-handling/permissible-purpose-codes/), specifying the reason for retrieving this report. Required for retrieving some reports. (required)
     * @return ResponseEntity&lt;ObbAnalyticsReport&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ObbAnalyticsReport> getObbAnalyticsReportFcraWithHttpInfo(String obbReportId, String purpose) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'obbReportId' is set
        if (obbReportId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'obbReportId' when calling getObbAnalyticsReportFcra");
        }
        
        // verify the required parameter 'purpose' is set
        if (purpose == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'purpose' when calling getObbAnalyticsReportFcra");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("obb_report_id", obbReportId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "purpose", purpose));
        

        final String[] localVarAccepts = { 
            "application/json", "application/pdf"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<ObbAnalyticsReport> localReturnType = new ParameterizedTypeReference<ObbAnalyticsReport>() {};
        return apiClient.invokeAPI("/analytics/data/v1/{obb_report_id}/fcra", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
