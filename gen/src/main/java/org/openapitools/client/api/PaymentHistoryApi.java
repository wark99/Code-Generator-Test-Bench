package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ErrorMessage;
import java.io.File;
import org.openapitools.client.model.ObbAnalyticsReport;
import org.openapitools.client.model.ObbAnalyticsReportAck;
import org.openapitools.client.model.ObbErrorMessage;

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
public class PaymentHistoryApi {
    private ApiClient apiClient;

    public PaymentHistoryApi() {
        this(new ApiClient());
    }

    public PaymentHistoryApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Generate Payment History
     * Payment history report analyzes up to 12-months of transactions and predicts the probability that a SMB will experience a payment risk event, such as NSF/Overdraft or missed recurring payments, in the near future when making a payment. The Risk Score provided in the report is a 2-digit ranking with four levels of risk going from low to high.  Some of the highlights of calculated risk present in the report include: * Risk Score representing the likelihood of a missed payment   based on analysis of permissioned open-banking data  * Monthly average balance for all accounts by month in the requested   time period  * Total deposit amount by month for all accounts in the requested time   period  * Total withdrawal amounts by month for all accounts in the requested   time period  * Number of NSF counts and aggregate amount per month in the requested   time period  * Recurring loan payment amounts per month in the requested time period * Insurance payment amount per month in the requested time period * Tax payment amounts per month in the requested time period  This version of the API is intended for piloting and integration testing your application with the Payment History product. It does not adhere to FCRA requirements, and should not be used for production/lending purposes. See _Generate Payment History - FCRA_ for the FCRA compliant version of this API.  *Note:* this is a premium service, billable per every successful API call for non-testing customers.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get OBB Analytics Report_ (operation: _GetObbAnalyticsReport_). *Note:* this is a premium service, billable per every successful API call for non-testing customers.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Response given when payment history was generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF.
     * <p><b>400</b> - A bad request was provided
     * <p><b>401</b> - Unauthorized request
     * <p><b>403</b> - Access forbidden
     * <p><b>404</b> - Resource not found
     * @param customerId A customer ID (required)
     * @param referenceNumber Partner-provided reference number to correlate reports. (optional)
     * @return ObbAnalyticsReportAck
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ObbAnalyticsReportAck generatePaymentHistory(String customerId, String referenceNumber) throws RestClientException {
        return generatePaymentHistoryWithHttpInfo(customerId, referenceNumber).getBody();
    }

    /**
     * Generate Payment History
     * Payment history report analyzes up to 12-months of transactions and predicts the probability that a SMB will experience a payment risk event, such as NSF/Overdraft or missed recurring payments, in the near future when making a payment. The Risk Score provided in the report is a 2-digit ranking with four levels of risk going from low to high.  Some of the highlights of calculated risk present in the report include: * Risk Score representing the likelihood of a missed payment   based on analysis of permissioned open-banking data  * Monthly average balance for all accounts by month in the requested   time period  * Total deposit amount by month for all accounts in the requested time   period  * Total withdrawal amounts by month for all accounts in the requested   time period  * Number of NSF counts and aggregate amount per month in the requested   time period  * Recurring loan payment amounts per month in the requested time period * Insurance payment amount per month in the requested time period * Tax payment amounts per month in the requested time period  This version of the API is intended for piloting and integration testing your application with the Payment History product. It does not adhere to FCRA requirements, and should not be used for production/lending purposes. See _Generate Payment History - FCRA_ for the FCRA compliant version of this API.  *Note:* this is a premium service, billable per every successful API call for non-testing customers.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get OBB Analytics Report_ (operation: _GetObbAnalyticsReport_). *Note:* this is a premium service, billable per every successful API call for non-testing customers.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Response given when payment history was generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF.
     * <p><b>400</b> - A bad request was provided
     * <p><b>401</b> - Unauthorized request
     * <p><b>403</b> - Access forbidden
     * <p><b>404</b> - Resource not found
     * @param customerId A customer ID (required)
     * @param referenceNumber Partner-provided reference number to correlate reports. (optional)
     * @return ResponseEntity&lt;ObbAnalyticsReportAck&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ObbAnalyticsReportAck> generatePaymentHistoryWithHttpInfo(String customerId, String referenceNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling generatePaymentHistory");
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<ObbAnalyticsReportAck> localReturnType = new ParameterizedTypeReference<ObbAnalyticsReportAck>() {};
        return apiClient.invokeAPI("/analytics/payment-history/v1/customer/{customerId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate Payment History - FCRA
     * Payment history report analyzes up to 12-months of transactions and predicts the probability that a SMB will experience a payment risk event, such as NSF/Overdraft or missed recurring payments, in the near future when making a payment. The Risk Score provided in the report is a 2-digit ranking with four levels of risk going from low to high.  Some of the highlights of calculated risk present in the report include: * Risk Score representing the likelihood of a missed payment   based on analysis of permissioned open-banking data  * Monthly average balance for all accounts by month in the requested   time period  * Total deposit amount by month for all accounts in the requested time   period  * Total withdrawal amounts by month for all accounts in the requested   time period  * Number of NSF counts and aggregate amount per month in the requested   time period  * Recurring loan payment amounts per month in the requested time period * Insurance payment amount per month in the requested time period * Tax payment amounts per month in the requested time period  This version of the API is intended for production use. It maintains and  enforces all compliance with FCRA rules and requirements.   *Note:* this is a premium service, billable per every successful API call for non-testing customers.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get OBB Analytics Report - FCRA_  (operation: _GetObbAnalyticsReportFcra_).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Response given when payment history (FCRA) was generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF.
     * <p><b>400</b> - A bad request was provided
     * <p><b>401</b> - Unauthorized request
     * <p><b>403</b> - Access forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - Resource conflict
     * @param customerId A customer ID (required)
     * @param referenceNumber Partner-provided reference number to correlate reports. (optional)
     * @return ObbAnalyticsReportAck
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ObbAnalyticsReportAck generatePaymentHistoryFcra(String customerId, String referenceNumber) throws RestClientException {
        return generatePaymentHistoryFcraWithHttpInfo(customerId, referenceNumber).getBody();
    }

    /**
     * Generate Payment History - FCRA
     * Payment history report analyzes up to 12-months of transactions and predicts the probability that a SMB will experience a payment risk event, such as NSF/Overdraft or missed recurring payments, in the near future when making a payment. The Risk Score provided in the report is a 2-digit ranking with four levels of risk going from low to high.  Some of the highlights of calculated risk present in the report include: * Risk Score representing the likelihood of a missed payment   based on analysis of permissioned open-banking data  * Monthly average balance for all accounts by month in the requested   time period  * Total deposit amount by month for all accounts in the requested time   period  * Total withdrawal amounts by month for all accounts in the requested   time period  * Number of NSF counts and aggregate amount per month in the requested   time period  * Recurring loan payment amounts per month in the requested time period * Insurance payment amount per month in the requested time period * Tax payment amounts per month in the requested time period  This version of the API is intended for production use. It maintains and  enforces all compliance with FCRA rules and requirements.   *Note:* this is a premium service, billable per every successful API call for non-testing customers.  A successful call to this API will generate analytics and store a report within Finicity. The report can be retrieved via _Get OBB Analytics Report - FCRA_  (operation: _GetObbAnalyticsReportFcra_).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Response given when payment history (FCRA) was generated successfully, providing the caller with a report ID which can be used to retrieve the report as JSON or a PDF.
     * <p><b>400</b> - A bad request was provided
     * <p><b>401</b> - Unauthorized request
     * <p><b>403</b> - Access forbidden
     * <p><b>404</b> - Resource not found
     * <p><b>409</b> - Resource conflict
     * @param customerId A customer ID (required)
     * @param referenceNumber Partner-provided reference number to correlate reports. (optional)
     * @return ResponseEntity&lt;ObbAnalyticsReportAck&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ObbAnalyticsReportAck> generatePaymentHistoryFcraWithHttpInfo(String customerId, String referenceNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling generatePaymentHistoryFcra");
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<ObbAnalyticsReportAck> localReturnType = new ParameterizedTypeReference<ObbAnalyticsReportAck>() {};
        return apiClient.invokeAPI("/analytics/payment-history/v1/customer/{customerId}/fcra", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
