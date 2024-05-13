package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateUserAccount200Response;
import org.openapitools.client.model.CreateUserAccount400Response;
import org.openapitools.client.model.CreateUserAccountRequest;
import org.openapitools.client.model.GetAccounts200Response;
import org.openapitools.client.model.GetAccounts404Response;
import org.openapitools.client.model.GetTransactions200Response;
import org.openapitools.client.model.GetTransactions404Response;
import org.openapitools.client.model.GetTransactions500Response;
import org.openapitools.client.model.Send200Response;
import org.openapitools.client.model.Send400Response;
import org.openapitools.client.model.Send404Response;
import org.openapitools.client.model.SendRequest;
import org.openapitools.client.model.Signin200Response;
import org.openapitools.client.model.Signin400Response;
import org.openapitools.client.model.Signin404Response;
import org.openapitools.client.model.Signup200Response;
import org.openapitools.client.model.Signup400Response;
import org.openapitools.client.model.Signup500Response;
import org.openapitools.client.model.SignupRequest;
import org.openapitools.client.model.Withdraw200Response;
import org.openapitools.client.model.Withdraw404Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:16:12.335744348Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * create user account
     * create user account
     * <p><b>200</b> - success_create_account
     * <p><b>400</b> - failed_create_account_400
     * <p><b>500</b> - failed_send_up_500
     * @param createUserAccountRequest  (optional)
     * @return CreateUserAccount200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateUserAccount200Response createUserAccount(CreateUserAccountRequest createUserAccountRequest) throws RestClientException {
        return createUserAccountWithHttpInfo(createUserAccountRequest).getBody();
    }

    /**
     * create user account
     * create user account
     * <p><b>200</b> - success_create_account
     * <p><b>400</b> - failed_create_account_400
     * <p><b>500</b> - failed_send_up_500
     * @param createUserAccountRequest  (optional)
     * @return ResponseEntity&lt;CreateUserAccount200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateUserAccount200Response> createUserAccountWithHttpInfo(CreateUserAccountRequest createUserAccountRequest) throws RestClientException {
        Object localVarPostBody = createUserAccountRequest;
        

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

        ParameterizedTypeReference<CreateUserAccount200Response> localReturnType = new ParameterizedTypeReference<CreateUserAccount200Response>() {};
        return apiClient.invokeAPI("/v1/api/user/accounts", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * get accounts
     * get accounts
     * <p><b>200</b> - success_get_accounts
     * <p><b>404</b> - failed_get_transactions_404
     * <p><b>500</b> - failed_get_transactions_500
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param status  (optional)
     * @param accountType debit,credit,loan (optional)
     * @param sendRequest  (optional)
     * @return GetAccounts200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetAccounts200Response getAccounts(String startDate, String endDate, String status, String accountType, SendRequest sendRequest) throws RestClientException {
        return getAccountsWithHttpInfo(startDate, endDate, status, accountType, sendRequest).getBody();
    }

    /**
     * get accounts
     * get accounts
     * <p><b>200</b> - success_get_accounts
     * <p><b>404</b> - failed_get_transactions_404
     * <p><b>500</b> - failed_get_transactions_500
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param status  (optional)
     * @param accountType debit,credit,loan (optional)
     * @param sendRequest  (optional)
     * @return ResponseEntity&lt;GetAccounts200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetAccounts200Response> getAccountsWithHttpInfo(String startDate, String endDate, String status, String accountType, SendRequest sendRequest) throws RestClientException {
        Object localVarPostBody = sendRequest;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "account_type", accountType));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetAccounts200Response> localReturnType = new ParameterizedTypeReference<GetAccounts200Response>() {};
        return apiClient.invokeAPI("/v1/api/accounts", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * get transactions
     * get transactions
     * <p><b>200</b> - success_get_transactions
     * <p><b>404</b> - failed_get_transactions_404
     * <p><b>500</b> - failed_get_transactions_500
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param status  (optional)
     * @param transactionType withdraw / send (optional)
     * @param sendRequest  (optional)
     * @return GetTransactions200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetTransactions200Response getTransactions(String startDate, String endDate, String status, String transactionType, SendRequest sendRequest) throws RestClientException {
        return getTransactionsWithHttpInfo(startDate, endDate, status, transactionType, sendRequest).getBody();
    }

    /**
     * get transactions
     * get transactions
     * <p><b>200</b> - success_get_transactions
     * <p><b>404</b> - failed_get_transactions_404
     * <p><b>500</b> - failed_get_transactions_500
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param status  (optional)
     * @param transactionType withdraw / send (optional)
     * @param sendRequest  (optional)
     * @return ResponseEntity&lt;GetTransactions200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetTransactions200Response> getTransactionsWithHttpInfo(String startDate, String endDate, String status, String transactionType, SendRequest sendRequest) throws RestClientException {
        Object localVarPostBody = sendRequest;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start_date", startDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "end_date", endDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "transaction_type", transactionType));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetTransactions200Response> localReturnType = new ParameterizedTypeReference<GetTransactions200Response>() {};
        return apiClient.invokeAPI("/v1/api/transactions", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * send
     * send
     * <p><b>200</b> - success_send
     * <p><b>400</b> - failed_send_400
     * <p><b>404</b> - failed_send_404
     * <p><b>500</b> - failed_send_up_500
     * @param sendRequest  (optional)
     * @return Send200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Send200Response send(SendRequest sendRequest) throws RestClientException {
        return sendWithHttpInfo(sendRequest).getBody();
    }

    /**
     * send
     * send
     * <p><b>200</b> - success_send
     * <p><b>400</b> - failed_send_400
     * <p><b>404</b> - failed_send_404
     * <p><b>500</b> - failed_send_up_500
     * @param sendRequest  (optional)
     * @return ResponseEntity&lt;Send200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Send200Response> sendWithHttpInfo(SendRequest sendRequest) throws RestClientException {
        Object localVarPostBody = sendRequest;
        

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

        ParameterizedTypeReference<Send200Response> localReturnType = new ParameterizedTypeReference<Send200Response>() {};
        return apiClient.invokeAPI("/v1/api/send", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * signin
     * signin
     * <p><b>200</b> - success_signin
     * <p><b>400</b> - failed_signup_400
     * <p><b>404</b> - failed_signup_404
     * <p><b>500</b> - failed_sign_up_500
     * @param signupRequest  (optional)
     * @return Signin200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Signin200Response signin(SignupRequest signupRequest) throws RestClientException {
        return signinWithHttpInfo(signupRequest).getBody();
    }

    /**
     * signin
     * signin
     * <p><b>200</b> - success_signin
     * <p><b>400</b> - failed_signup_400
     * <p><b>404</b> - failed_signup_404
     * <p><b>500</b> - failed_sign_up_500
     * @param signupRequest  (optional)
     * @return ResponseEntity&lt;Signin200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Signin200Response> signinWithHttpInfo(SignupRequest signupRequest) throws RestClientException {
        Object localVarPostBody = signupRequest;
        

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Signin200Response> localReturnType = new ParameterizedTypeReference<Signin200Response>() {};
        return apiClient.invokeAPI("/api/v1/signin", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * signup
     * signup
     * <p><b>200</b> - success_signup
     * <p><b>400</b> - failed_signup_400
     * <p><b>500</b> - failed_sign_up_500
     * @param signupRequest  (optional)
     * @return Signup200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Signup200Response signup(SignupRequest signupRequest) throws RestClientException {
        return signupWithHttpInfo(signupRequest).getBody();
    }

    /**
     * signup
     * signup
     * <p><b>200</b> - success_signup
     * <p><b>400</b> - failed_signup_400
     * <p><b>500</b> - failed_sign_up_500
     * @param signupRequest  (optional)
     * @return ResponseEntity&lt;Signup200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Signup200Response> signupWithHttpInfo(SignupRequest signupRequest) throws RestClientException {
        Object localVarPostBody = signupRequest;
        

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Signup200Response> localReturnType = new ParameterizedTypeReference<Signup200Response>() {};
        return apiClient.invokeAPI("/api/v1/signup", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * withdraw
     * withdraw
     * <p><b>200</b> - success_withdraw
     * <p><b>400</b> - failed_withdraw_400
     * <p><b>404</b> - failed_withdraw_404
     * <p><b>500</b> - failed_withdraw_500
     * @param sendRequest  (optional)
     * @return Withdraw200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Withdraw200Response withdraw(SendRequest sendRequest) throws RestClientException {
        return withdrawWithHttpInfo(sendRequest).getBody();
    }

    /**
     * withdraw
     * withdraw
     * <p><b>200</b> - success_withdraw
     * <p><b>400</b> - failed_withdraw_400
     * <p><b>404</b> - failed_withdraw_404
     * <p><b>500</b> - failed_withdraw_500
     * @param sendRequest  (optional)
     * @return ResponseEntity&lt;Withdraw200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Withdraw200Response> withdrawWithHttpInfo(SendRequest sendRequest) throws RestClientException {
        Object localVarPostBody = sendRequest;
        

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

        ParameterizedTypeReference<Withdraw200Response> localReturnType = new ParameterizedTypeReference<Withdraw200Response>() {};
        return apiClient.invokeAPI("/v1/api/withdraw", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
