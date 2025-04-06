package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ErrorMessage;
import org.openapitools.client.model.PortfolioSummary;
import org.openapitools.client.model.PortfolioWithConsumerSummary;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T13:05:06.990716937Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class PortfoliosApi {
    private ApiClient apiClient;

    public PortfoliosApi() {
        this(new ApiClient());
    }

    public PortfoliosApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Portfolio by Consumer and Portfolio
     * Return a portfolio of most recently generated reports for each report type for a given consumer. If there are multiple reports that were generated for a report type (VOA, VOI, etc.), only the most recently generated report for the type will be returned.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The portfolio was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param consumerId The consumer ID (required)
     * @param portfolioId A portfolio ID with the portfolio version number. Using the portfolio number without a version number will return the most recently generated reports. (required)
     * @return PortfolioWithConsumerSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PortfolioWithConsumerSummary getPortfolioByConsumer(String consumerId, String portfolioId) throws RestClientException {
        return getPortfolioByConsumerWithHttpInfo(consumerId, portfolioId).getBody();
    }

    /**
     * Get Portfolio by Consumer and Portfolio
     * Return a portfolio of most recently generated reports for each report type for a given consumer. If there are multiple reports that were generated for a report type (VOA, VOI, etc.), only the most recently generated report for the type will be returned.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The portfolio was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param consumerId The consumer ID (required)
     * @param portfolioId A portfolio ID with the portfolio version number. Using the portfolio number without a version number will return the most recently generated reports. (required)
     * @return ResponseEntity&lt;PortfolioWithConsumerSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PortfolioWithConsumerSummary> getPortfolioByConsumerWithHttpInfo(String consumerId, String portfolioId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'consumerId' is set
        if (consumerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'consumerId' when calling getPortfolioByConsumer");
        }
        
        // verify the required parameter 'portfolioId' is set
        if (portfolioId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'portfolioId' when calling getPortfolioByConsumer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("consumerId", consumerId);
        uriVariables.put("portfolioId", portfolioId);

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

        ParameterizedTypeReference<PortfolioWithConsumerSummary> localReturnType = new ParameterizedTypeReference<PortfolioWithConsumerSummary>() {};
        return apiClient.invokeAPI("/decisioning/v1/consumers/{consumerId}/portfolios/{portfolioId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Portfolio by Customer and Portfolio
     * Return a portfolio of most recently generated reports for each report type for the given customer. If there are multiple reports that were generated for a report type (VOA, VOI, etc.), only the most recently generated report for the type will be returned.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png) 
     * <p><b>200</b> - The portfolio was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param portfolioId A portfolio ID with the portfolio version number. Using the portfolio number without a version number will return the most recently generated reports. (required)
     * @return PortfolioSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PortfolioSummary getPortfolioByCustomer(String customerId, String portfolioId) throws RestClientException {
        return getPortfolioByCustomerWithHttpInfo(customerId, portfolioId).getBody();
    }

    /**
     * Get Portfolio by Customer and Portfolio
     * Return a portfolio of most recently generated reports for each report type for the given customer. If there are multiple reports that were generated for a report type (VOA, VOI, etc.), only the most recently generated report for the type will be returned.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png) 
     * <p><b>200</b> - The portfolio was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>403</b> - The active security freeze for this consumer exists.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param portfolioId A portfolio ID with the portfolio version number. Using the portfolio number without a version number will return the most recently generated reports. (required)
     * @return ResponseEntity&lt;PortfolioSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PortfolioSummary> getPortfolioByCustomerWithHttpInfo(String customerId, String portfolioId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getPortfolioByCustomer");
        }
        
        // verify the required parameter 'portfolioId' is set
        if (portfolioId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'portfolioId' when calling getPortfolioByCustomer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        uriVariables.put("portfolioId", portfolioId);

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

        ParameterizedTypeReference<PortfolioSummary> localReturnType = new ParameterizedTypeReference<PortfolioSummary>() {};
        return apiClient.invokeAPI("/decisioning/v1/customers/{customerId}/portfolios/{portfolioId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
