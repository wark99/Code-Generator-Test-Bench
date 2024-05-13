package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1AccountsAccountIdGet200Response;
import org.openapitools.client.model.Model1AccountsAccountIdServicesGet200Response;
import org.openapitools.client.model.Model1AccountsGet200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPost403Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;
import org.openapitools.client.model.OneOfstringAnyType;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * Display an account
     * Returns a variety of information about a single Account specified by the requested unique identifier.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param accountId Unique identifier of the Account to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return Model1AccountsAccountIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1AccountsAccountIdGet200Response call1accountsAccountIdGet(Integer accountId, String with) throws RestClientException {
        return call1accountsAccountIdGetWithHttpInfo(accountId, with).getBody();
    }

    /**
     * Display an account
     * Returns a variety of information about a single Account specified by the requested unique identifier.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param accountId Unique identifier of the Account to request. (required)
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @return ResponseEntity&lt;Model1AccountsAccountIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1AccountsAccountIdGet200Response> call1accountsAccountIdGetWithHttpInfo(Integer accountId, String with) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling call1accountsAccountIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("account_id", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1AccountsAccountIdGet200Response> localReturnType = new ParameterizedTypeReference<Model1AccountsAccountIdGet200Response>() {};
        return apiClient.invokeAPI("/1/accounts/{account_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List services
     * This endpoint allows you to retrieve all the services of an account.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param accountId Unique identifier of the Account to request. (required)
     * @return Model1AccountsAccountIdServicesGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1AccountsAccountIdServicesGet200Response call1accountsAccountIdServicesGet(Integer accountId) throws RestClientException {
        return call1accountsAccountIdServicesGetWithHttpInfo(accountId).getBody();
    }

    /**
     * List services
     * This endpoint allows you to retrieve all the services of an account.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param accountId Unique identifier of the Account to request. (required)
     * @return ResponseEntity&lt;Model1AccountsAccountIdServicesGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1AccountsAccountIdServicesGet200Response> call1accountsAccountIdServicesGetWithHttpInfo(Integer accountId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountId' when calling call1accountsAccountIdServicesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("account_id", accountId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1AccountsAccountIdServicesGet200Response> localReturnType = new ParameterizedTypeReference<Model1AccountsAccountIdServicesGet200Response>() {};
        return apiClient.invokeAPI("/1/accounts/{account_id}/services", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List accounts
     * This endpoint allows you to retrieve all the accounts of a user.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param orderBy *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @param order *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional, default to asc)
     * @param orderFor *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @return Model1AccountsGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1AccountsGet200Response call1accountsGet(String with, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        return call1accountsGetWithHttpInfo(with, orderBy, order, orderFor).getBody();
    }

    /**
     * List accounts
     * This endpoint allows you to retrieve all the accounts of a user.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param with *Optional* : Allows loading additional data about a resource, which may include related resources. (optional)
     * @param orderBy *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @param order *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional, default to asc)
     * @param orderFor *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @return ResponseEntity&lt;Model1AccountsGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1AccountsGet200Response> call1accountsGetWithHttpInfo(String with, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with", with));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "order_by", orderBy));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "order_for", orderFor));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1AccountsGet200Response> localReturnType = new ParameterizedTypeReference<Model1AccountsGet200Response>() {};
        return apiClient.invokeAPI("/1/accounts", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
