package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPost403Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdPut422Response;
import org.openapitools.client.model.Model2ProfileApplicationsPasswordsGet200Response;
import org.openapitools.client.model.Model2ProfileApplicationsPasswordsPasswordIdGet200Response;
import org.openapitools.client.model.Model2ProfileApplicationsPasswordsPost201Response;

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
public class ApplicationsPasswordsApi {
    private ApiClient apiClient;

    public ApplicationsPasswordsApi() {
        this(new ApiClient());
    }

    public ApplicationsPasswordsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List applications passwords
     * This endpoint allows you to retrieve all the application password of the current user.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return Model2ProfileApplicationsPasswordsGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model2ProfileApplicationsPasswordsGet200Response call2profileApplicationsPasswordsGet() throws RestClientException {
        return call2profileApplicationsPasswordsGetWithHttpInfo().getBody();
    }

    /**
     * List applications passwords
     * This endpoint allows you to retrieve all the application password of the current user.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @return ResponseEntity&lt;Model2ProfileApplicationsPasswordsGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model2ProfileApplicationsPasswordsGet200Response> call2profileApplicationsPasswordsGetWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model2ProfileApplicationsPasswordsGet200Response> localReturnType = new ParameterizedTypeReference<Model2ProfileApplicationsPasswordsGet200Response>() {};
        return apiClient.invokeAPI("/2/profile/applications/passwords", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Display an application password
     * Returns a variety of information about a single application password specified by the requested unique identifier.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param passwordId The unique identifier (ID) of the password to request. (required)
     * @return Model2ProfileApplicationsPasswordsPasswordIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model2ProfileApplicationsPasswordsPasswordIdGet200Response call2profileApplicationsPasswordsPasswordIdGet(Integer passwordId) throws RestClientException {
        return call2profileApplicationsPasswordsPasswordIdGetWithHttpInfo(passwordId).getBody();
    }

    /**
     * Display an application password
     * Returns a variety of information about a single application password specified by the requested unique identifier.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * @param passwordId The unique identifier (ID) of the password to request. (required)
     * @return ResponseEntity&lt;Model2ProfileApplicationsPasswordsPasswordIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model2ProfileApplicationsPasswordsPasswordIdGet200Response> call2profileApplicationsPasswordsPasswordIdGetWithHttpInfo(Integer passwordId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'passwordId' is set
        if (passwordId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'passwordId' when calling call2profileApplicationsPasswordsPasswordIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("password_id", passwordId);

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

        ParameterizedTypeReference<Model2ProfileApplicationsPasswordsPasswordIdGet200Response> localReturnType = new ParameterizedTypeReference<Model2ProfileApplicationsPasswordsPasswordIdGet200Response>() {};
        return apiClient.invokeAPI("/2/profile/applications/passwords/{password_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Add an application password
     * Add a profile specific password Warning: password given in response cannot be retrieved later, so store / show it immediately
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>422</b> - Unprocessable Entity
     * @return Model2ProfileApplicationsPasswordsPost201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model2ProfileApplicationsPasswordsPost201Response call2profileApplicationsPasswordsPost() throws RestClientException {
        return call2profileApplicationsPasswordsPostWithHttpInfo().getBody();
    }

    /**
     * Add an application password
     * Add a profile specific password Warning: password given in response cannot be retrieved later, so store / show it immediately
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>422</b> - Unprocessable Entity
     * @return ResponseEntity&lt;Model2ProfileApplicationsPasswordsPost201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model2ProfileApplicationsPasswordsPost201Response> call2profileApplicationsPasswordsPostWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model2ProfileApplicationsPasswordsPost201Response> localReturnType = new ParameterizedTypeReference<Model2ProfileApplicationsPasswordsPost201Response>() {};
        return apiClient.invokeAPI("/2/profile/applications/passwords", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
