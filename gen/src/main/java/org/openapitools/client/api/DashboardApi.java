package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CommonError;
import org.openapitools.client.model.DashboardFullStructScheme;
import org.openapitools.client.model.DashboardScheme;
import org.openapitools.client.model.DashboardType;
import org.openapitools.client.model.DictItemBaseScheme;
import org.openapitools.client.model.DictItemScheme;
import org.openapitools.client.model.HTTPValidationError;
import org.openapitools.client.model.ListDictItemScheme;

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
public class DashboardApi {
    private ApiClient apiClient;

    public DashboardApi() {
        this(new ApiClient());
    }

    public DashboardApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add dashboard
     * Add dashboard
     * <p><b>201</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param dashType  (required)
     * @param dashboardScheme  (required)
     * @return DictItemBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DictItemBaseScheme addDashboard(DashboardType dashType, DashboardScheme dashboardScheme) throws RestClientException {
        return addDashboardWithHttpInfo(dashType, dashboardScheme).getBody();
    }

    /**
     * Add dashboard
     * Add dashboard
     * <p><b>201</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>422</b> - Validation Error
     * @param dashType  (required)
     * @param dashboardScheme  (required)
     * @return ResponseEntity&lt;DictItemBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DictItemBaseScheme> addDashboardWithHttpInfo(DashboardType dashType, DashboardScheme dashboardScheme) throws RestClientException {
        Object localVarPostBody = dashboardScheme;
        
        // verify the required parameter 'dashType' is set
        if (dashType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dashType' when calling addDashboard");
        }
        
        // verify the required parameter 'dashboardScheme' is set
        if (dashboardScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dashboardScheme' when calling addDashboard");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dash_type", dashType);

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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<DictItemBaseScheme> localReturnType = new ParameterizedTypeReference<DictItemBaseScheme>() {};
        return apiClient.invokeAPI("/dashboard/{dash_type}/", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete dashboard by id
     * Delete dashboard by id
     * <p><b>204</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique dashboard id (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteDashboard(Integer id) throws RestClientException {
        deleteDashboardWithHttpInfo(id);
    }

    /**
     * Delete dashboard by id
     * Delete dashboard by id
     * <p><b>204</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id unique dashboard id (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteDashboardWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteDashboard");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/dashboard/{id}/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of dashboards
     * Get a list of dashboards
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @return DictItemScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DictItemScheme getDashboard(Integer id) throws RestClientException {
        return getDashboardWithHttpInfo(id).getBody();
    }

    /**
     * Get a list of dashboards
     * Get a list of dashboards
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @return ResponseEntity&lt;DictItemScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DictItemScheme> getDashboardWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDashboard");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<DictItemScheme> localReturnType = new ParameterizedTypeReference<DictItemScheme>() {};
        return apiClient.invokeAPI("/dashboard/{id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get full struct dashboard by id
     * Get full struct dashboard by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @return DashboardFullStructScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DashboardFullStructScheme getDashboardFullStruct(Integer id) throws RestClientException {
        return getDashboardFullStructWithHttpInfo(id).getBody();
    }

    /**
     * Get full struct dashboard by id
     * Get full struct dashboard by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @return ResponseEntity&lt;DashboardFullStructScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DashboardFullStructScheme> getDashboardFullStructWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDashboardFullStruct");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<DashboardFullStructScheme> localReturnType = new ParameterizedTypeReference<DashboardFullStructScheme>() {};
        return apiClient.invokeAPI("/dashboard/{id}/full-struct/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of dashboards
     * Get a list of dashboards
     * <p><b>200</b> - Successful Response
     * @return ListDictItemScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ListDictItemScheme getDashboards() throws RestClientException {
        return getDashboardsWithHttpInfo().getBody();
    }

    /**
     * Get a list of dashboards
     * Get a list of dashboards
     * <p><b>200</b> - Successful Response
     * @return ResponseEntity&lt;ListDictItemScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ListDictItemScheme> getDashboardsWithHttpInfo() throws RestClientException {
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
        return apiClient.invokeAPI("/dashboard/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update dashboard by id
     * Update dashboard by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @param dashboardScheme  (required)
     * @return DictItemBaseScheme
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DictItemBaseScheme updateDashboard(Integer id, DashboardScheme dashboardScheme) throws RestClientException {
        return updateDashboardWithHttpInfo(id, dashboardScheme).getBody();
    }

    /**
     * Update dashboard by id
     * Update dashboard by id
     * <p><b>200</b> - Successful Response
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param id  (required)
     * @param dashboardScheme  (required)
     * @return ResponseEntity&lt;DictItemBaseScheme&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DictItemBaseScheme> updateDashboardWithHttpInfo(Integer id, DashboardScheme dashboardScheme) throws RestClientException {
        Object localVarPostBody = dashboardScheme;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateDashboard");
        }
        
        // verify the required parameter 'dashboardScheme' is set
        if (dashboardScheme == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dashboardScheme' when calling updateDashboard");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        String[] localVarAuthNames = new String[] { "AWSAuthenticator" };

        ParameterizedTypeReference<DictItemBaseScheme> localReturnType = new ParameterizedTypeReference<DictItemBaseScheme>() {};
        return apiClient.invokeAPI("/dashboard/{id}/", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
