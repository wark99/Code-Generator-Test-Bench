package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ChangePassword;
import org.openapitools.client.model.Customer;
import org.openapitools.client.model.GetCustomerResponse;
import org.openapitools.client.model.PasswordRecovery;
import org.openapitools.client.model.PutCustomerRequest;
import org.openapitools.client.model.UpdatePasswordRecovery;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:09.376695343Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ClientesApi {
    private ApiClient apiClient;

    public ClientesApi() {
        this(new ApiClient());
    }

    public ClientesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Lista todos os clientes cadastrados
     * Lista todos os usuários cadastrados
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @return List&lt;GetCustomerResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GetCustomerResponse> getCustomers(String ocpApimSubscriptionKey) throws RestClientException {
        return getCustomersWithHttpInfo(ocpApimSubscriptionKey).getBody();
    }

    /**
     * Lista todos os clientes cadastrados
     * Lista todos os usuários cadastrados
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @return ResponseEntity&lt;List&lt;GetCustomerResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<GetCustomerResponse>> getCustomersWithHttpInfo(String ocpApimSubscriptionKey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling getCustomers");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (ocpApimSubscriptionKey != null)
        localVarHeaderParams.add("Ocp-Apim-Subscription-Key", apiClient.parameterToString(ocpApimSubscriptionKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<GetCustomerResponse>> localReturnType = new ParameterizedTypeReference<List<GetCustomerResponse>>() {};
        return apiClient.invokeAPI("/customers", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Consulta detalhes de usuário por número de documento
     * Consulta detalhes de usuário por número de documento
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param documentNumber Documento de identificação do cliente (required)
     * @return Customer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Customer getCustomersByDocumentNumber(String ocpApimSubscriptionKey, String documentNumber) throws RestClientException {
        return getCustomersByDocumentNumberWithHttpInfo(ocpApimSubscriptionKey, documentNumber).getBody();
    }

    /**
     * Consulta detalhes de usuário por número de documento
     * Consulta detalhes de usuário por número de documento
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param documentNumber Documento de identificação do cliente (required)
     * @return ResponseEntity&lt;Customer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Customer> getCustomersByDocumentNumberWithHttpInfo(String ocpApimSubscriptionKey, String documentNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling getCustomersByDocumentNumber");
        }
        
        // verify the required parameter 'documentNumber' is set
        if (documentNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentNumber' when calling getCustomersByDocumentNumber");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("documentNumber", documentNumber);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (ocpApimSubscriptionKey != null)
        localVarHeaderParams.add("Ocp-Apim-Subscription-Key", apiClient.parameterToString(ocpApimSubscriptionKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Customer> localReturnType = new ParameterizedTypeReference<Customer>() {};
        return apiClient.invokeAPI("/customers/{documentNumber}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Valida acesso do cliente com base no usuário e senha criptografados
     * Valida acesso do cliente com base no usuário e senha criptografados
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param hash base64(user:pass) (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getCustomersValidation(String ocpApimSubscriptionKey, String hash) throws RestClientException {
        getCustomersValidationWithHttpInfo(ocpApimSubscriptionKey, hash);
    }

    /**
     * Valida acesso do cliente com base no usuário e senha criptografados
     * Valida acesso do cliente com base no usuário e senha criptografados
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param hash base64(user:pass) (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getCustomersValidationWithHttpInfo(String ocpApimSubscriptionKey, String hash) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling getCustomersValidation");
        }
        
        // verify the required parameter 'hash' is set
        if (hash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hash' when calling getCustomersValidation");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("hash", hash);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (ocpApimSubscriptionKey != null)
        localVarHeaderParams.add("Ocp-Apim-Subscription-Key", apiClient.parameterToString(ocpApimSubscriptionKey));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/customers-validation/{hash}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Cadastra novo cliente
     * Cadastra novo cliente
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param customer Recebe um evento (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postCustomers(String ocpApimSubscriptionKey, Customer customer) throws RestClientException {
        postCustomersWithHttpInfo(ocpApimSubscriptionKey, customer);
    }

    /**
     * Cadastra novo cliente
     * Cadastra novo cliente
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param customer Recebe um evento (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postCustomersWithHttpInfo(String ocpApimSubscriptionKey, Customer customer) throws RestClientException {
        Object localVarPostBody = customer;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling postCustomers");
        }
        
        // verify the required parameter 'customer' is set
        if (customer == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customer' when calling postCustomers");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (ocpApimSubscriptionKey != null)
        localVarHeaderParams.add("Ocp-Apim-Subscription-Key", apiClient.parameterToString(ocpApimSubscriptionKey));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/customers", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Solicita recuperação de senha de usuário
     * Solicita recuperação de senha de usuário
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param passwordRecovery  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postCustomersPasswordRecovery(String ocpApimSubscriptionKey, PasswordRecovery passwordRecovery) throws RestClientException {
        postCustomersPasswordRecoveryWithHttpInfo(ocpApimSubscriptionKey, passwordRecovery);
    }

    /**
     * Solicita recuperação de senha de usuário
     * Solicita recuperação de senha de usuário
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param passwordRecovery  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postCustomersPasswordRecoveryWithHttpInfo(String ocpApimSubscriptionKey, PasswordRecovery passwordRecovery) throws RestClientException {
        Object localVarPostBody = passwordRecovery;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling postCustomersPasswordRecovery");
        }
        
        // verify the required parameter 'passwordRecovery' is set
        if (passwordRecovery == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'passwordRecovery' when calling postCustomersPasswordRecovery");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (ocpApimSubscriptionKey != null)
        localVarHeaderParams.add("Ocp-Apim-Subscription-Key", apiClient.parameterToString(ocpApimSubscriptionKey));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/customers/password/recovery", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Atualiza senha de cliente
     * Atualiza senha de cliente
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param documentNumber Número de documento do cliente (required)
     * @param changePassword  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putCustomerPassword(String ocpApimSubscriptionKey, String documentNumber, ChangePassword changePassword) throws RestClientException {
        putCustomerPasswordWithHttpInfo(ocpApimSubscriptionKey, documentNumber, changePassword);
    }

    /**
     * Atualiza senha de cliente
     * Atualiza senha de cliente
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param documentNumber Número de documento do cliente (required)
     * @param changePassword  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putCustomerPasswordWithHttpInfo(String ocpApimSubscriptionKey, String documentNumber, ChangePassword changePassword) throws RestClientException {
        Object localVarPostBody = changePassword;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling putCustomerPassword");
        }
        
        // verify the required parameter 'documentNumber' is set
        if (documentNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentNumber' when calling putCustomerPassword");
        }
        
        // verify the required parameter 'changePassword' is set
        if (changePassword == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'changePassword' when calling putCustomerPassword");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (ocpApimSubscriptionKey != null)
        localVarHeaderParams.add("Ocp-Apim-Subscription-Key", apiClient.parameterToString(ocpApimSubscriptionKey));
        if (documentNumber != null)
        localVarHeaderParams.add("documentNumber", apiClient.parameterToString(documentNumber));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/customers/password/{documentNumber}", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Atualiza cliente
     * Atualiza cliente
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param putCustomerRequest Recebe um evento (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putCustomers(String ocpApimSubscriptionKey, PutCustomerRequest putCustomerRequest) throws RestClientException {
        putCustomersWithHttpInfo(ocpApimSubscriptionKey, putCustomerRequest);
    }

    /**
     * Atualiza cliente
     * Atualiza cliente
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param putCustomerRequest Recebe um evento (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putCustomersWithHttpInfo(String ocpApimSubscriptionKey, PutCustomerRequest putCustomerRequest) throws RestClientException {
        Object localVarPostBody = putCustomerRequest;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling putCustomers");
        }
        
        // verify the required parameter 'putCustomerRequest' is set
        if (putCustomerRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'putCustomerRequest' when calling putCustomers");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (ocpApimSubscriptionKey != null)
        localVarHeaderParams.add("Ocp-Apim-Subscription-Key", apiClient.parameterToString(ocpApimSubscriptionKey));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/customers/{documentNumber}", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Efetua a validação do hash de recuperação de senha
     * Efetua a validação do hash de recuperação de senha
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param ocpApimSubscriptionKey2 hash (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putCustomersPasswordHashValidation(String ocpApimSubscriptionKey, String ocpApimSubscriptionKey2) throws RestClientException {
        putCustomersPasswordHashValidationWithHttpInfo(ocpApimSubscriptionKey, ocpApimSubscriptionKey2);
    }

    /**
     * Efetua a validação do hash de recuperação de senha
     * Efetua a validação do hash de recuperação de senha
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param ocpApimSubscriptionKey2 hash (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putCustomersPasswordHashValidationWithHttpInfo(String ocpApimSubscriptionKey, String ocpApimSubscriptionKey2) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling putCustomersPasswordHashValidation");
        }
        
        // verify the required parameter 'ocpApimSubscriptionKey2' is set
        if (ocpApimSubscriptionKey2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey2' when calling putCustomersPasswordHashValidation");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (ocpApimSubscriptionKey != null)
        localVarHeaderParams.add("Ocp-Apim-Subscription-Key", apiClient.parameterToString(ocpApimSubscriptionKey));
        if (ocpApimSubscriptionKey2 != null)
        localVarHeaderParams.add("Ocp-Apim-Subscription-Key", apiClient.parameterToString(ocpApimSubscriptionKey2));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/customers/password/hash-validation/{hash}", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Efetua a atualização de senha por fluxo de recuperação
     * Efetua a atualização de senha por fluxo de recuperação
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param ocpApimSubscriptionKey2 hash (required)
     * @param updatePasswordRecovery  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putCustomersPasswordRecovery(String ocpApimSubscriptionKey, String ocpApimSubscriptionKey2, UpdatePasswordRecovery updatePasswordRecovery) throws RestClientException {
        putCustomersPasswordRecoveryWithHttpInfo(ocpApimSubscriptionKey, ocpApimSubscriptionKey2, updatePasswordRecovery);
    }

    /**
     * Efetua a atualização de senha por fluxo de recuperação
     * Efetua a atualização de senha por fluxo de recuperação
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param ocpApimSubscriptionKey2 hash (required)
     * @param updatePasswordRecovery  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putCustomersPasswordRecoveryWithHttpInfo(String ocpApimSubscriptionKey, String ocpApimSubscriptionKey2, UpdatePasswordRecovery updatePasswordRecovery) throws RestClientException {
        Object localVarPostBody = updatePasswordRecovery;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling putCustomersPasswordRecovery");
        }
        
        // verify the required parameter 'ocpApimSubscriptionKey2' is set
        if (ocpApimSubscriptionKey2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey2' when calling putCustomersPasswordRecovery");
        }
        
        // verify the required parameter 'updatePasswordRecovery' is set
        if (updatePasswordRecovery == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updatePasswordRecovery' when calling putCustomersPasswordRecovery");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (ocpApimSubscriptionKey != null)
        localVarHeaderParams.add("Ocp-Apim-Subscription-Key", apiClient.parameterToString(ocpApimSubscriptionKey));
        if (ocpApimSubscriptionKey2 != null)
        localVarHeaderParams.add("Ocp-Apim-Subscription-Key", apiClient.parameterToString(ocpApimSubscriptionKey2));

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/customers/password/recovery/{hash}", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
