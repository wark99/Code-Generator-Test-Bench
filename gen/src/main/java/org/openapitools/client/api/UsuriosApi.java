package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ChangePassword;
import org.openapitools.client.model.GetUserResponse;
import org.openapitools.client.model.PasswordRecovery;
import org.openapitools.client.model.UpdatePasswordRecovery;
import org.openapitools.client.model.User;

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
public class UsuriosApi {
    private ApiClient apiClient;

    public UsuriosApi() {
        this(new ApiClient());
    }

    public UsuriosApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Remove usuários
     * remove usuário
     * <p><b>204</b> - No content
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param documentNumber Número de documento do usuário (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteUsers(String ocpApimSubscriptionKey, String documentNumber) throws RestClientException {
        deleteUsersWithHttpInfo(ocpApimSubscriptionKey, documentNumber);
    }

    /**
     * Remove usuários
     * remove usuário
     * <p><b>204</b> - No content
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param documentNumber Número de documento do usuário (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteUsersWithHttpInfo(String ocpApimSubscriptionKey, String documentNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling deleteUsers");
        }
        
        // verify the required parameter 'documentNumber' is set
        if (documentNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentNumber' when calling deleteUsers");
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

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/users/{documentNumber}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Lista todos os usuários cadastrados
     * Lista todos os usuários cadastrados
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @return List&lt;GetUserResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GetUserResponse> getUsers(String ocpApimSubscriptionKey) throws RestClientException {
        return getUsersWithHttpInfo(ocpApimSubscriptionKey).getBody();
    }

    /**
     * Lista todos os usuários cadastrados
     * Lista todos os usuários cadastrados
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @return ResponseEntity&lt;List&lt;GetUserResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<GetUserResponse>> getUsersWithHttpInfo(String ocpApimSubscriptionKey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling getUsers");
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

        ParameterizedTypeReference<List<GetUserResponse>> localReturnType = new ParameterizedTypeReference<List<GetUserResponse>>() {};
        return apiClient.invokeAPI("/users", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Consulta detalhes de usuário por e-mail
     * Consulta detalhes de usuário por e-mail
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param documentNumber Número de documento do usuário (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User getUsersByEmail(String ocpApimSubscriptionKey, String documentNumber) throws RestClientException {
        return getUsersByEmailWithHttpInfo(ocpApimSubscriptionKey, documentNumber).getBody();
    }

    /**
     * Consulta detalhes de usuário por e-mail
     * Consulta detalhes de usuário por e-mail
     * <p><b>200</b> - Ok
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param documentNumber Número de documento do usuário (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> getUsersByEmailWithHttpInfo(String ocpApimSubscriptionKey, String documentNumber) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling getUsersByEmail");
        }
        
        // verify the required parameter 'documentNumber' is set
        if (documentNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentNumber' when calling getUsersByEmail");
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

        ParameterizedTypeReference<User> localReturnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI("/users/{documentNumber}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
    public void getUsersValidation(String ocpApimSubscriptionKey, String hash) throws RestClientException {
        getUsersValidationWithHttpInfo(ocpApimSubscriptionKey, hash);
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
    public ResponseEntity<Void> getUsersValidationWithHttpInfo(String ocpApimSubscriptionKey, String hash) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling getUsersValidation");
        }
        
        // verify the required parameter 'hash' is set
        if (hash == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'hash' when calling getUsersValidation");
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
        return apiClient.invokeAPI("/users-validation/{hash}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
    public void postUserPasswordRecovery(String ocpApimSubscriptionKey, PasswordRecovery passwordRecovery) throws RestClientException {
        postUserPasswordRecoveryWithHttpInfo(ocpApimSubscriptionKey, passwordRecovery);
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
    public ResponseEntity<Void> postUserPasswordRecoveryWithHttpInfo(String ocpApimSubscriptionKey, PasswordRecovery passwordRecovery) throws RestClientException {
        Object localVarPostBody = passwordRecovery;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling postUserPasswordRecovery");
        }
        
        // verify the required parameter 'passwordRecovery' is set
        if (passwordRecovery == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'passwordRecovery' when calling postUserPasswordRecovery");
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
        return apiClient.invokeAPI("/users/password/recovery", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Cadastra novo usuário
     * Cadastra novo usuário
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param user Recebe um evento (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void postUsers(String ocpApimSubscriptionKey, User user) throws RestClientException {
        postUsersWithHttpInfo(ocpApimSubscriptionKey, user);
    }

    /**
     * Cadastra novo usuário
     * Cadastra novo usuário
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param user Recebe um evento (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> postUsersWithHttpInfo(String ocpApimSubscriptionKey, User user) throws RestClientException {
        Object localVarPostBody = user;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling postUsers");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'user' when calling postUsers");
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
        return apiClient.invokeAPI("/users", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Atualiza senha de usuário
     * Atualiza senha de usuário
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param documentNumber Número de documento do usuário (required)
     * @param changePassword  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putUserPassword(String ocpApimSubscriptionKey, String documentNumber, ChangePassword changePassword) throws RestClientException {
        putUserPasswordWithHttpInfo(ocpApimSubscriptionKey, documentNumber, changePassword);
    }

    /**
     * Atualiza senha de usuário
     * Atualiza senha de usuário
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param documentNumber Número de documento do usuário (required)
     * @param changePassword  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putUserPasswordWithHttpInfo(String ocpApimSubscriptionKey, String documentNumber, ChangePassword changePassword) throws RestClientException {
        Object localVarPostBody = changePassword;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling putUserPassword");
        }
        
        // verify the required parameter 'documentNumber' is set
        if (documentNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentNumber' when calling putUserPassword");
        }
        
        // verify the required parameter 'changePassword' is set
        if (changePassword == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'changePassword' when calling putUserPassword");
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
        return apiClient.invokeAPI("/users/password/{documentNumber}", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
    public void putUserPasswordHashValidation(String ocpApimSubscriptionKey, String ocpApimSubscriptionKey2) throws RestClientException {
        putUserPasswordHashValidationWithHttpInfo(ocpApimSubscriptionKey, ocpApimSubscriptionKey2);
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
    public ResponseEntity<Void> putUserPasswordHashValidationWithHttpInfo(String ocpApimSubscriptionKey, String ocpApimSubscriptionKey2) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling putUserPasswordHashValidation");
        }
        
        // verify the required parameter 'ocpApimSubscriptionKey2' is set
        if (ocpApimSubscriptionKey2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey2' when calling putUserPasswordHashValidation");
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
        return apiClient.invokeAPI("/users/password/hash-validation/{hash}", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
    public void putUserPasswordRecovery(String ocpApimSubscriptionKey, String ocpApimSubscriptionKey2, UpdatePasswordRecovery updatePasswordRecovery) throws RestClientException {
        putUserPasswordRecoveryWithHttpInfo(ocpApimSubscriptionKey, ocpApimSubscriptionKey2, updatePasswordRecovery);
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
    public ResponseEntity<Void> putUserPasswordRecoveryWithHttpInfo(String ocpApimSubscriptionKey, String ocpApimSubscriptionKey2, UpdatePasswordRecovery updatePasswordRecovery) throws RestClientException {
        Object localVarPostBody = updatePasswordRecovery;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling putUserPasswordRecovery");
        }
        
        // verify the required parameter 'ocpApimSubscriptionKey2' is set
        if (ocpApimSubscriptionKey2 == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey2' when calling putUserPasswordRecovery");
        }
        
        // verify the required parameter 'updatePasswordRecovery' is set
        if (updatePasswordRecovery == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updatePasswordRecovery' when calling putUserPasswordRecovery");
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
        return apiClient.invokeAPI("/users/password/recovery/{hash}", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Atualiza usuário
     * Atualiza usuário
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param documentNumber Número de documento do usuário (required)
     * @param user Recebe um evento (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void putUsers(String ocpApimSubscriptionKey, String documentNumber, User user) throws RestClientException {
        putUsersWithHttpInfo(ocpApimSubscriptionKey, documentNumber, user);
    }

    /**
     * Atualiza usuário
     * Atualiza usuário
     * <p><b>202</b> - Accepted
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * <p><b>500</b> - Internal Server error
     * @param ocpApimSubscriptionKey Api-Key (required)
     * @param documentNumber Número de documento do usuário (required)
     * @param user Recebe um evento (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> putUsersWithHttpInfo(String ocpApimSubscriptionKey, String documentNumber, User user) throws RestClientException {
        Object localVarPostBody = user;
        
        // verify the required parameter 'ocpApimSubscriptionKey' is set
        if (ocpApimSubscriptionKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'ocpApimSubscriptionKey' when calling putUsers");
        }
        
        // verify the required parameter 'documentNumber' is set
        if (documentNumber == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'documentNumber' when calling putUsers");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'user' when calling putUsers");
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

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/users/{documentNumber}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
