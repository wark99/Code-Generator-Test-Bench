package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AccountDetails200Response;
import org.openapitools.client.model.AccountOwner200Response;
import org.openapitools.client.model.AccountsResp;
import org.openapitools.client.model.BankLinkReqInner;
import org.openapitools.client.model.BankLinkResp;
import org.openapitools.client.model.Model400Inner;
import org.openapitools.client.model.Transactions200Response;
import org.openapitools.client.model.TransactionsFiltersParameter;
import org.openapitools.client.model.V40200Response;
import org.openapitools.client.model.V40Request;
import org.openapitools.client.model.V40report200Response;
import org.openapitools.client.model.V40reportRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:20.567624608Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DataApiApi {
    private ApiClient apiClient;

    public DataApiApi() {
        this(new ApiClient());
    }

    public DataApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Account Data Elements
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * @param consumerId  (required)
     * @param accountId  (required)
     * @param aggregatorId  (optional)
     * @return AccountDetails200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountDetails200Response accountDetails(String consumerId, Long accountId, String aggregatorId) throws RestClientException {
        return accountDetailsWithHttpInfo(consumerId, accountId, aggregatorId).getBody();
    }

    /**
     * Account Data Elements
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * @param consumerId  (required)
     * @param accountId  (required)
     * @param aggregatorId  (optional)
     * @return ResponseEntity&lt;AccountDetails200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountDetails200Response> accountDetailsWithHttpInfo(String consumerId, Long accountId, String aggregatorId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'consumerId' is set
        if (consumerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'consumerId' when calling accountDetails");
        }
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling accountDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("aggregator_id", aggregatorId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "consumer_id", consumerId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "account_id", accountId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<AccountDetails200Response> localReturnType = new ParameterizedTypeReference<AccountDetails200Response>() {};
        return apiClient.invokeAPI("/account-details/{aggregator_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Account Owner Personal Information
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>424</b> - Data source error
     * @param accountId  (required)
     * @param aggregatorId  (optional)
     * @return AccountOwner200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountOwner200Response accountOwner(Long accountId, String aggregatorId) throws RestClientException {
        return accountOwnerWithHttpInfo(accountId, aggregatorId).getBody();
    }

    /**
     * Account Owner Personal Information
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>424</b> - Data source error
     * @param accountId  (required)
     * @param aggregatorId  (optional)
     * @return ResponseEntity&lt;AccountOwner200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountOwner200Response> accountOwnerWithHttpInfo(Long accountId, String aggregatorId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling accountOwner");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("aggregator_id", aggregatorId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "account_id", accountId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<AccountOwner200Response> localReturnType = new ParameterizedTypeReference<AccountOwner200Response>() {};
        return apiClient.invokeAPI("/account-owner/{aggregator_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List Consumer Accounts
     * 
     * <p><b>200</b> - OK
     * @param consumerId  (required)
     * @return AccountsResp
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountsResp accounts(String consumerId) throws RestClientException {
        return accountsWithHttpInfo(consumerId).getBody();
    }

    /**
     * List Consumer Accounts
     * 
     * <p><b>200</b> - OK
     * @param consumerId  (required)
     * @return ResponseEntity&lt;AccountsResp&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountsResp> accountsWithHttpInfo(String consumerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'consumerId' is set
        if (consumerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'consumerId' when calling accounts");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "consumer_id", consumerId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<AccountsResp> localReturnType = new ParameterizedTypeReference<AccountsResp>() {};
        return apiClient.invokeAPI("/accounts", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate Bank Link
     * Generate secure URL to link bank accounts
     * <p><b>200</b> - OK
     * <p><b>400</b> - Incorrect input
     * @param bankLinkReqInner  (optional)
     * @return BankLinkResp
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BankLinkResp bankLink(List<BankLinkReqInner> bankLinkReqInner) throws RestClientException {
        return bankLinkWithHttpInfo(bankLinkReqInner).getBody();
    }

    /**
     * Generate Bank Link
     * Generate secure URL to link bank accounts
     * <p><b>200</b> - OK
     * <p><b>400</b> - Incorrect input
     * @param bankLinkReqInner  (optional)
     * @return ResponseEntity&lt;BankLinkResp&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BankLinkResp> bankLinkWithHttpInfo(List<BankLinkReqInner> bankLinkReqInner) throws RestClientException {
        Object localVarPostBody = bankLinkReqInner;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<BankLinkResp> localReturnType = new ParameterizedTypeReference<BankLinkResp>() {};
        return apiClient.invokeAPI("/bank-link", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Transactions Data Elements
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * @param filters  (required)
     * @param aggregatorId  (required)
     * @return Transactions200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Transactions200Response transactions(TransactionsFiltersParameter filters, String aggregatorId) throws RestClientException {
        return transactionsWithHttpInfo(filters, aggregatorId).getBody();
    }

    /**
     * Transactions Data Elements
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * @param filters  (required)
     * @param aggregatorId  (required)
     * @return ResponseEntity&lt;Transactions200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Transactions200Response> transactionsWithHttpInfo(TransactionsFiltersParameter filters, String aggregatorId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'filters' is set
        if (filters == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filters' when calling transactions");
        }
        
        // verify the required parameter 'aggregatorId' is set
        if (aggregatorId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aggregatorId' when calling transactions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("aggregator_id", aggregatorId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "filters", filters));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Transactions200Response> localReturnType = new ParameterizedTypeReference<Transactions200Response>() {};
        return apiClient.invokeAPI("/transactions/{aggregator_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * View V4.0 for a consumer
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Incorrect input
     * @param bureauId  (optional)
     * @param v40Request  (optional)
     * @return V40200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public V40200Response v40(String bureauId, V40Request v40Request) throws RestClientException {
        return v40WithHttpInfo(bureauId, v40Request).getBody();
    }

    /**
     * View V4.0 for a consumer
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Incorrect input
     * @param bureauId  (optional)
     * @param v40Request  (optional)
     * @return ResponseEntity&lt;V40200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<V40200Response> v40WithHttpInfo(String bureauId, V40Request v40Request) throws RestClientException {
        Object localVarPostBody = v40Request;
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bureau_id", bureauId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<V40200Response> localReturnType = new ParameterizedTypeReference<V40200Response>() {};
        return apiClient.invokeAPI("/scorev4/{bureau_id}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * View V4.0 hard inquiry report for a consumer
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Incorrect input
     * @param bureauId  (optional)
     * @param v40reportRequest  (optional)
     * @return V40report200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public V40report200Response v40hardreport(String bureauId, V40reportRequest v40reportRequest) throws RestClientException {
        return v40hardreportWithHttpInfo(bureauId, v40reportRequest).getBody();
    }

    /**
     * View V4.0 hard inquiry report for a consumer
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Incorrect input
     * @param bureauId  (optional)
     * @param v40reportRequest  (optional)
     * @return ResponseEntity&lt;V40report200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<V40report200Response> v40hardreportWithHttpInfo(String bureauId, V40reportRequest v40reportRequest) throws RestClientException {
        Object localVarPostBody = v40reportRequest;
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bureau_id", bureauId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<V40report200Response> localReturnType = new ParameterizedTypeReference<V40report200Response>() {};
        return apiClient.invokeAPI("/reports-vs4/hard-inquiry/{bureau_id}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * View V4.0 report for a consumer
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Incorrect input
     * @param bureauId  (optional)
     * @param v40reportRequest  (optional)
     * @return V40report200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public V40report200Response v40report(String bureauId, V40reportRequest v40reportRequest) throws RestClientException {
        return v40reportWithHttpInfo(bureauId, v40reportRequest).getBody();
    }

    /**
     * View V4.0 report for a consumer
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Incorrect input
     * @param bureauId  (optional)
     * @param v40reportRequest  (optional)
     * @return ResponseEntity&lt;V40report200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<V40report200Response> v40reportWithHttpInfo(String bureauId, V40reportRequest v40reportRequest) throws RestClientException {
        Object localVarPostBody = v40reportRequest;
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("bureau_id", bureauId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<V40report200Response> localReturnType = new ParameterizedTypeReference<V40report200Response>() {};
        return apiClient.invokeAPI("/reports-vs4/{bureau_id}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
