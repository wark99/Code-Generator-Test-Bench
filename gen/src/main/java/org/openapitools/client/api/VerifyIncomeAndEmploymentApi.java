package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ErrorMessage;
import org.openapitools.client.model.PayStatementReportAck;
import org.openapitools.client.model.PayStatementReportConstraints;
import org.openapitools.client.model.PayrollReportAck;
import org.openapitools.client.model.PayrollReportConstraints;
import org.openapitools.client.model.SecurityFreezeErrorMessage;
import org.openapitools.client.model.VOETransactionsReportAck;
import org.openapitools.client.model.VOETransactionsReportConstraints;
import org.openapitools.client.model.VOIEPaystubReportAck;
import org.openapitools.client.model.VOIEPaystubWithTXVerifyReportAck;
import org.openapitools.client.model.VOIEReportConstraints;
import org.openapitools.client.model.VOIEWithTXVerifyReportConstraints;
import org.openapitools.client.model.VOIReportAck;
import org.openapitools.client.model.VOIReportConstraints;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-30T15:37:23.431609925Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class VerifyIncomeAndEmploymentApi {
    private ApiClient apiClient;

    public VerifyIncomeAndEmploymentApi() {
        this(new ApiClient());
    }

    public VerifyIncomeAndEmploymentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Generate Pay Statement Report for the customer
     * Generate Pay Statement Extraction Report for the given customer. This service accepts asset IDs of the stored pay statements to generate a Pay Statement Extraction Report.  This is a premium service. The billing rate is the variable rate for Pay Statement Extraction Report under the current subscription plan. The billable event is the successful generation of a Pay Statement Extraction Report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param payStatementReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return PayStatementReportAck
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PayStatementReportAck generatePayStatementReport(String customerId, PayStatementReportConstraints payStatementReportConstraints, String callbackUrl) throws RestClientException {
        return generatePayStatementReportWithHttpInfo(customerId, payStatementReportConstraints, callbackUrl).getBody();
    }

    /**
     * Generate Pay Statement Report for the customer
     * Generate Pay Statement Extraction Report for the given customer. This service accepts asset IDs of the stored pay statements to generate a Pay Statement Extraction Report.  This is a premium service. The billing rate is the variable rate for Pay Statement Extraction Report under the current subscription plan. The billable event is the successful generation of a Pay Statement Extraction Report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param payStatementReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return ResponseEntity&lt;PayStatementReportAck&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PayStatementReportAck> generatePayStatementReportWithHttpInfo(String customerId, PayStatementReportConstraints payStatementReportConstraints, String callbackUrl) throws RestClientException {
        Object localVarPostBody = payStatementReportConstraints;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling generatePayStatementReport");
        }
        
        // verify the required parameter 'payStatementReportConstraints' is set
        if (payStatementReportConstraints == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'payStatementReportConstraints' when calling generatePayStatementReport");
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

        ParameterizedTypeReference<PayStatementReportAck> localReturnType = new ParameterizedTypeReference<PayStatementReportAck>() {};
        return apiClient.invokeAPI("/decisioning/v2/customers/{customerId}/payStatement", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate VOE - Payroll Report for the customer
     * Generate or refresh a VOE - Payroll report. Often used as a complementary report to the VOIE-Payroll report to fulfill the pre-close VOE requirements. It retrieves the customer&#39;s employment details and employment status through the payroll source without any income information.  This is a premium service. The billable event is the successful generation of a VOE - Payroll report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param payrollReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return PayrollReportAck
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PayrollReportAck generateVOEPayrollReport(String customerId, PayrollReportConstraints payrollReportConstraints, String callbackUrl) throws RestClientException {
        return generateVOEPayrollReportWithHttpInfo(customerId, payrollReportConstraints, callbackUrl).getBody();
    }

    /**
     * Generate VOE - Payroll Report for the customer
     * Generate or refresh a VOE - Payroll report. Often used as a complementary report to the VOIE-Payroll report to fulfill the pre-close VOE requirements. It retrieves the customer&#39;s employment details and employment status through the payroll source without any income information.  This is a premium service. The billable event is the successful generation of a VOE - Payroll report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param payrollReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return ResponseEntity&lt;PayrollReportAck&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PayrollReportAck> generateVOEPayrollReportWithHttpInfo(String customerId, PayrollReportConstraints payrollReportConstraints, String callbackUrl) throws RestClientException {
        Object localVarPostBody = payrollReportConstraints;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling generateVOEPayrollReport");
        }
        
        // verify the required parameter 'payrollReportConstraints' is set
        if (payrollReportConstraints == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'payrollReportConstraints' when calling generateVOEPayrollReport");
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

        ParameterizedTypeReference<PayrollReportAck> localReturnType = new ParameterizedTypeReference<PayrollReportAck>() {};
        return apiClient.invokeAPI("/decisioning/v2/customers/{customerId}/voePayroll", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate VOE - Transactions Report for the customer
     * Premium Service: A billable event when the API response is successful.  MVS-Direct integration developers only.  Used as a complimentary report to the VOA with Income and VOIE - Paystub (with TXVerify) reports and used to fulfill the pre-close VOE requirements.  Retrieve the latest credit transaction information from the borrower&#39;s connected bank accounts and groups them into income streams so that you can view their payment history to ensure a direct deport was made within the expected cadence. The report displays transaction descriptions without any dollar amounts so that income re-verification isn&#39;t necessary.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param voETransactionsReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return VOETransactionsReportAck
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VOETransactionsReportAck generateVOETransactionsReport(String customerId, VOETransactionsReportConstraints voETransactionsReportConstraints, String callbackUrl) throws RestClientException {
        return generateVOETransactionsReportWithHttpInfo(customerId, voETransactionsReportConstraints, callbackUrl).getBody();
    }

    /**
     * Generate VOE - Transactions Report for the customer
     * Premium Service: A billable event when the API response is successful.  MVS-Direct integration developers only.  Used as a complimentary report to the VOA with Income and VOIE - Paystub (with TXVerify) reports and used to fulfill the pre-close VOE requirements.  Retrieve the latest credit transaction information from the borrower&#39;s connected bank accounts and groups them into income streams so that you can view their payment history to ensure a direct deport was made within the expected cadence. The report displays transaction descriptions without any dollar amounts so that income re-verification isn&#39;t necessary.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param voETransactionsReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return ResponseEntity&lt;VOETransactionsReportAck&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VOETransactionsReportAck> generateVOETransactionsReportWithHttpInfo(String customerId, VOETransactionsReportConstraints voETransactionsReportConstraints, String callbackUrl) throws RestClientException {
        Object localVarPostBody = voETransactionsReportConstraints;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling generateVOETransactionsReport");
        }
        
        // verify the required parameter 'voETransactionsReportConstraints' is set
        if (voETransactionsReportConstraints == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'voETransactionsReportConstraints' when calling generateVOETransactionsReport");
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

        ParameterizedTypeReference<VOETransactionsReportAck> localReturnType = new ParameterizedTypeReference<VOETransactionsReportAck>() {};
        return apiClient.invokeAPI("/decisioning/v2/customers/{customerId}/voeTransactions", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate VOIE - Paystub Report for the customer
     * Generate a VOIE - Paystub report. This service uses the provided paystub(s), which are passed into the request body as asset IDs (generated using the Store Customer Pay Statement API) to generate the VOIE - Paystub report with digitized paystub details.  This is a premium service. The billing rate is the variable rate for VOIE - Paystub under the current subscription plan. The billable event is the successful generation of a VOIE - Paystub Report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param voIEReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return VOIEPaystubReportAck
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VOIEPaystubReportAck generateVOIEPaystubReport(String customerId, VOIEReportConstraints voIEReportConstraints, String callbackUrl) throws RestClientException {
        return generateVOIEPaystubReportWithHttpInfo(customerId, voIEReportConstraints, callbackUrl).getBody();
    }

    /**
     * Generate VOIE - Paystub Report for the customer
     * Generate a VOIE - Paystub report. This service uses the provided paystub(s), which are passed into the request body as asset IDs (generated using the Store Customer Pay Statement API) to generate the VOIE - Paystub report with digitized paystub details.  This is a premium service. The billing rate is the variable rate for VOIE - Paystub under the current subscription plan. The billable event is the successful generation of a VOIE - Paystub Report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param voIEReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return ResponseEntity&lt;VOIEPaystubReportAck&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VOIEPaystubReportAck> generateVOIEPaystubReportWithHttpInfo(String customerId, VOIEReportConstraints voIEReportConstraints, String callbackUrl) throws RestClientException {
        Object localVarPostBody = voIEReportConstraints;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling generateVOIEPaystubReport");
        }
        
        // verify the required parameter 'voIEReportConstraints' is set
        if (voIEReportConstraints == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'voIEReportConstraints' when calling generateVOIEPaystubReport");
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

        ParameterizedTypeReference<VOIEPaystubReportAck> localReturnType = new ParameterizedTypeReference<VOIEPaystubReportAck>() {};
        return apiClient.invokeAPI("/decisioning/v2/customers/{customerId}/voieTxVerify/withStatement", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate VOIE Paystub (with TXVerify) Report for the customer
     * Generate a VOIE - Paystub (with TXVerify) report for all checking and savings under the given customer. This service retrieves up to two years of transaction history for the given accounts. It then uses this information as well as the provided paystub(s), which are passed into the request body as asset IDs (generated using the Store Customer Pay Statement API) to generate the VOIE - Paystub (with TXVerify) report.  Note: if you are using this API to refresh the bank transactions, use the same asset ID from the first report. A new paystub is not required unless the paystub is too old for underwriting requirements. Using the same asset ID that was on the original report and the previously extracted details will be used to speed up report generation response time.  This is a premium service. The billing rate is the variable rate for VOIE TXVerify under the current subscription plan. The billable event is the successful generation of a VOIE TXVerify Report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param voIEWithTXVerifyReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return VOIEPaystubWithTXVerifyReportAck
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VOIEPaystubWithTXVerifyReportAck generateVOIEPaystubWithTXVerifyReport(String customerId, VOIEWithTXVerifyReportConstraints voIEWithTXVerifyReportConstraints, String callbackUrl) throws RestClientException {
        return generateVOIEPaystubWithTXVerifyReportWithHttpInfo(customerId, voIEWithTXVerifyReportConstraints, callbackUrl).getBody();
    }

    /**
     * Generate VOIE Paystub (with TXVerify) Report for the customer
     * Generate a VOIE - Paystub (with TXVerify) report for all checking and savings under the given customer. This service retrieves up to two years of transaction history for the given accounts. It then uses this information as well as the provided paystub(s), which are passed into the request body as asset IDs (generated using the Store Customer Pay Statement API) to generate the VOIE - Paystub (with TXVerify) report.  Note: if you are using this API to refresh the bank transactions, use the same asset ID from the first report. A new paystub is not required unless the paystub is too old for underwriting requirements. Using the same asset ID that was on the original report and the previously extracted details will be used to speed up report generation response time.  This is a premium service. The billing rate is the variable rate for VOIE TXVerify under the current subscription plan. The billable event is the successful generation of a VOIE TXVerify Report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param voIEWithTXVerifyReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return ResponseEntity&lt;VOIEPaystubWithTXVerifyReportAck&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VOIEPaystubWithTXVerifyReportAck> generateVOIEPaystubWithTXVerifyReportWithHttpInfo(String customerId, VOIEWithTXVerifyReportConstraints voIEWithTXVerifyReportConstraints, String callbackUrl) throws RestClientException {
        Object localVarPostBody = voIEWithTXVerifyReportConstraints;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling generateVOIEPaystubWithTXVerifyReport");
        }
        
        // verify the required parameter 'voIEWithTXVerifyReportConstraints' is set
        if (voIEWithTXVerifyReportConstraints == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'voIEWithTXVerifyReportConstraints' when calling generateVOIEPaystubWithTXVerifyReport");
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

        ParameterizedTypeReference<VOIEPaystubWithTXVerifyReportAck> localReturnType = new ParameterizedTypeReference<VOIEPaystubWithTXVerifyReportAck>() {};
        return apiClient.invokeAPI("/decisioning/v2/customers/{customerId}/voieTxVerify/withInterview", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate VOI Report for the customer
     * Generate a Verification of Income (VOI) report for all checking, savings, and money market accounts for the given customer. This service retrieves up to two years of transaction history for each account and uses this information to generate the VOI report.  This is a premium service. The billing rate is the variable rate for Verification of Income under the current subscription plan. The billable event is the successful generation of a VOI report.  If no account of type checking, savings, or money market is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param voIReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return VOIReportAck
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public VOIReportAck generateVOIReport(String customerId, VOIReportConstraints voIReportConstraints, String callbackUrl) throws RestClientException {
        return generateVOIReportWithHttpInfo(customerId, voIReportConstraints, callbackUrl).getBody();
    }

    /**
     * Generate VOI Report for the customer
     * Generate a Verification of Income (VOI) report for all checking, savings, and money market accounts for the given customer. This service retrieves up to two years of transaction history for each account and uses this information to generate the VOI report.  This is a premium service. The billing rate is the variable rate for Verification of Income under the current subscription plan. The billable event is the successful generation of a VOI report.  If no account of type checking, savings, or money market is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param voIReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return ResponseEntity&lt;VOIReportAck&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<VOIReportAck> generateVOIReportWithHttpInfo(String customerId, VOIReportConstraints voIReportConstraints, String callbackUrl) throws RestClientException {
        Object localVarPostBody = voIReportConstraints;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling generateVOIReport");
        }
        
        // verify the required parameter 'voIReportConstraints' is set
        if (voIReportConstraints == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'voIReportConstraints' when calling generateVOIReport");
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

        ParameterizedTypeReference<VOIReportAck> localReturnType = new ParameterizedTypeReference<VOIReportAck>() {};
        return apiClient.invokeAPI("/decisioning/v2/customers/{customerId}/voi", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate VOIE - Payroll Report for the customer
     * Generate or refresh a VOIE - Payroll report. For clients using the product via a consumer permissioning experience via Connect, the original VOIE - Payroll report generates when the consumer completes the Connect experience, and this API is only used for future report refreshes without reengaging the consumer.  This is a premium service. The billable event is the successful generation of a VOIE - Payroll report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param payrollReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return PayrollReportAck
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PayrollReportAck refreshVOIEPayrollReport(String customerId, PayrollReportConstraints payrollReportConstraints, String callbackUrl) throws RestClientException {
        return refreshVOIEPayrollReportWithHttpInfo(customerId, payrollReportConstraints, callbackUrl).getBody();
    }

    /**
     * Generate VOIE - Payroll Report for the customer
     * Generate or refresh a VOIE - Payroll report. For clients using the product via a consumer permissioning experience via Connect, the original VOIE - Payroll report generates when the consumer completes the Connect experience, and this API is only used for future report refreshes without reengaging the consumer.  This is a premium service. The billable event is the successful generation of a VOIE - Payroll report.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param payrollReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return ResponseEntity&lt;PayrollReportAck&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PayrollReportAck> refreshVOIEPayrollReportWithHttpInfo(String customerId, PayrollReportConstraints payrollReportConstraints, String callbackUrl) throws RestClientException {
        Object localVarPostBody = payrollReportConstraints;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling refreshVOIEPayrollReport");
        }
        
        // verify the required parameter 'payrollReportConstraints' is set
        if (payrollReportConstraints == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'payrollReportConstraints' when calling refreshVOIEPayrollReport");
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

        ParameterizedTypeReference<PayrollReportAck> localReturnType = new ParameterizedTypeReference<PayrollReportAck>() {};
        return apiClient.invokeAPI("/decisioning/v2/customers/{customerId}/voiePayroll", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
