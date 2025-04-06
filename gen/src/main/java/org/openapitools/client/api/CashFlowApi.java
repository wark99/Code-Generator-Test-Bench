package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CashFlowReportAck;
import org.openapitools.client.model.CashFlowReportConstraints;
import org.openapitools.client.model.ErrorMessage;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T12:57:35.632313798Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CashFlowApi {
    private ApiClient apiClient;

    public CashFlowApi() {
        this(new ApiClient());
    }

    public CashFlowApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Generate Cash Flow Report for the customer (Business)
     * Generate a Cash Flow Report (Business) report for all checking and savings under the given customer. This service retrieves up to two years of transaction history for the given account. It then uses this information to generate the CFR report. A consumer is not required to generate this report.  This report is not provided under FCRA rules, and this report is not available in the Finicity Consumer Portal for the borrower to view.  If no account type of checking or savings is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param cashFlowReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return CashFlowReportAck
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CashFlowReportAck generateCashFlowBusinessReport(String customerId, CashFlowReportConstraints cashFlowReportConstraints, String callbackUrl) throws RestClientException {
        return generateCashFlowBusinessReportWithHttpInfo(customerId, cashFlowReportConstraints, callbackUrl).getBody();
    }

    /**
     * Generate Cash Flow Report for the customer (Business)
     * Generate a Cash Flow Report (Business) report for all checking and savings under the given customer. This service retrieves up to two years of transaction history for the given account. It then uses this information to generate the CFR report. A consumer is not required to generate this report.  This report is not provided under FCRA rules, and this report is not available in the Finicity Consumer Portal for the borrower to view.  If no account type of checking or savings is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param cashFlowReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return ResponseEntity&lt;CashFlowReportAck&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CashFlowReportAck> generateCashFlowBusinessReportWithHttpInfo(String customerId, CashFlowReportConstraints cashFlowReportConstraints, String callbackUrl) throws RestClientException {
        Object localVarPostBody = cashFlowReportConstraints;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling generateCashFlowBusinessReport");
        }
        
        // verify the required parameter 'cashFlowReportConstraints' is set
        if (cashFlowReportConstraints == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cashFlowReportConstraints' when calling generateCashFlowBusinessReport");
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

        ParameterizedTypeReference<CashFlowReportAck> localReturnType = new ParameterizedTypeReference<CashFlowReportAck>() {};
        return apiClient.invokeAPI("/decisioning/v2/customers/{customerId}/cashFlowBusiness", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate Cash Flow Report for the customer (Personal)
     * Generate a Cash Flow Report (Personal) report for all checking and savings under the given customer. This service retrieves up to two years of transaction history for the given account. It then uses this information to generate the CFR report.  This report is provided under FCRA rules, with Finicity acting as the CRA (Consumer Reporting Agency). If an individual account is included in the report - for example, with an individual acting as an personal guarantor on the loan - then this version of the report should be used. In case of an adverse action on the loan where the decision was based on this report, then the borrower can be referred to the [Finicity Consumer Portal](https://consumer.finicityreports.com) where they can view this report and submit a dispute if they feel any information in this report is inaccurate.  Before calling this API, a consumer must be created for the given customer ID (see Consumers APIs).  If no account type of checking or savings is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param cashFlowReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return CashFlowReportAck
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CashFlowReportAck generateCashFlowPersonalReport(String customerId, CashFlowReportConstraints cashFlowReportConstraints, String callbackUrl) throws RestClientException {
        return generateCashFlowPersonalReportWithHttpInfo(customerId, cashFlowReportConstraints, callbackUrl).getBody();
    }

    /**
     * Generate Cash Flow Report for the customer (Personal)
     * Generate a Cash Flow Report (Personal) report for all checking and savings under the given customer. This service retrieves up to two years of transaction history for the given account. It then uses this information to generate the CFR report.  This report is provided under FCRA rules, with Finicity acting as the CRA (Consumer Reporting Agency). If an individual account is included in the report - for example, with an individual acting as an personal guarantor on the loan - then this version of the report should be used. In case of an adverse action on the loan where the decision was based on this report, then the borrower can be referred to the [Finicity Consumer Portal](https://consumer.finicityreports.com) where they can view this report and submit a dispute if they feel any information in this report is inaccurate.  Before calling this API, a consumer must be created for the given customer ID (see Consumers APIs).  If no account type of checking or savings is found, the service will return HTTP 400 Bad Request.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>202</b> - The report is being generated. When finished, a notification will be sent to the specified callback URL (Report Listener Service) and the report can be fetched using Get Report APIs. If you don&#39;t use a callback URL, Get Report returns a minimal report with the following status: &#39;inProgress&#39;. Repeat the call every 20 seconds until Get Report returns a different status.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param cashFlowReportConstraints  (required)
     * @param callbackUrl A Report Listener URL to receive notifications. The webhook must respond to the Finicity API with a 2xx HTTP status code. (optional)
     * @return ResponseEntity&lt;CashFlowReportAck&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CashFlowReportAck> generateCashFlowPersonalReportWithHttpInfo(String customerId, CashFlowReportConstraints cashFlowReportConstraints, String callbackUrl) throws RestClientException {
        Object localVarPostBody = cashFlowReportConstraints;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling generateCashFlowPersonalReport");
        }
        
        // verify the required parameter 'cashFlowReportConstraints' is set
        if (cashFlowReportConstraints == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cashFlowReportConstraints' when calling generateCashFlowPersonalReport");
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

        ParameterizedTypeReference<CashFlowReportAck> localReturnType = new ParameterizedTypeReference<CashFlowReportAck>() {};
        return apiClient.invokeAPI("/decisioning/v2/customers/{customerId}/cashFlowPersonal", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
