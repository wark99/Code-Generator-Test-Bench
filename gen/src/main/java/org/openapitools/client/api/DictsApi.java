package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AuthMethods;
import org.openapitools.client.model.CommonError;
import org.openapitools.client.model.HTTPValidationError;
import org.openapitools.client.model.ListDictItemScheme;
import org.openapitools.client.model.PageDictItemScheme;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:05.417254227Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DictsApi {
    private ApiClient apiClient;

    public DictsApi() {
        this(new ApiClient());
    }

    public DictsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a list of companies available to the user
     * Get a list of companies available to the user
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param text text value for search by name (optional)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return PageDictItemScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PageDictItemScheme approvedCompaniesUser(String text, Integer perPage, Integer page) throws RestClientException {
        return approvedCompaniesUserWithHttpInfo(text, perPage, page).getBody();
    }

    /**
     * Get a list of companies available to the user
     * Get a list of companies available to the user
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param text text value for search by name (optional)
     * @param perPage  (optional, default to 1000)
     * @param page  (optional, default to 1)
     * @return ResponseEntity&lt;PageDictItemScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PageDictItemScheme> approvedCompaniesUserWithHttpInfo(String text, Integer perPage, Integer page) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "text", text));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<PageDictItemScheme> localReturnType = new ParameterizedTypeReference<PageDictItemScheme>() {};
        return apiClient.invokeAPI("/dicts/approved-companies/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of enabled auth methods from config
     * Get a list of enabled auth methods from config
     * <p><b>200</b> - Successful Response
     * @return AuthMethods
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AuthMethods getAuthMethods() throws RestClientException {
        return getAuthMethodsWithHttpInfo().getBody();
    }

    /**
     * Get a list of enabled auth methods from config
     * Get a list of enabled auth methods from config
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;AuthMethods&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AuthMethods> getAuthMethodsWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AuthMethods> localReturnType = new ParameterizedTypeReference<AuthMethods>() {};
        return apiClient.invokeAPI("/dicts/auth-methods/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of user languages
     * Get a list of user languages  Args:     curr_user: Data of the current user  Returns:     Data scheme of language list
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * @return ListDictItemScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListDictItemScheme getLanguages() throws RestClientException {
        return getLanguagesWithHttpInfo().getBody();
    }

    /**
     * Get a list of user languages
     * Get a list of user languages  Args:     curr_user: Data of the current user  Returns:     Data scheme of language list
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * @return ResponseEntity&lt;ListDictItemScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListDictItemScheme> getLanguagesWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<ListDictItemScheme> localReturnType = new ParameterizedTypeReference<ListDictItemScheme>() {};
        return apiClient.invokeAPI("/dicts/languages/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of user roles
     * Get a list of user roles
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * @return ListDictItemScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListDictItemScheme getUserRoles() throws RestClientException {
        return getUserRolesWithHttpInfo().getBody();
    }

    /**
     * Get a list of user roles
     * Get a list of user roles
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * @return ResponseEntity&lt;ListDictItemScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListDictItemScheme> getUserRolesWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<ListDictItemScheme> localReturnType = new ParameterizedTypeReference<ListDictItemScheme>() {};
        return apiClient.invokeAPI("/dicts/user-roles/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
