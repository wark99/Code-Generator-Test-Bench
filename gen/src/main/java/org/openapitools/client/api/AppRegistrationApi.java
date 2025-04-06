package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AppStatuses;
import org.openapitools.client.model.Application;
import org.openapitools.client.model.ApplicationResponse;
import org.openapitools.client.model.CustomerAccounts;
import org.openapitools.client.model.ErrorMessage;
import org.openapitools.client.model.InstitutionResponse;
import org.openapitools.client.model.RegisteredApplication;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T14:05:40.878624261Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AppRegistrationApi {
    private ApiClient apiClient;

    public AppRegistrationApi() {
        this(new ApiClient());
    }

    public AppRegistrationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get App Registration Status
     * Get the status of your application registration(s).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The app registration statuses were returned
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param preAppId The application registration tracking ID (optional)
     * @param applicationId The application ID (optional)
     * @param status Look up app registration requests by status (optional)
     * @param appName Look up app registration requests by app name (optional)
     * @param submittedDate Look up app registration requests by the date they were submitted (optional)
     * @param modifiedDate Look up app registration requests by the date the request was updated. This can be used to determine when a request was updated to \&quot;A\&quot; or \&quot;R\&quot;. (optional)
     * @param page Index of the page of results to return (optional, default to 1)
     * @param pageSize Maximum number of results per page (optional, default to 1)
     * @return AppStatuses
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AppStatuses getAppRegistrationStatus(String preAppId, String applicationId, String status, String appName, Long submittedDate, Long modifiedDate, Integer page, Integer pageSize) throws RestClientException {
        return getAppRegistrationStatusWithHttpInfo(preAppId, applicationId, status, appName, submittedDate, modifiedDate, page, pageSize).getBody();
    }

    /**
     * Get App Registration Status
     * Get the status of your application registration(s).  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The app registration statuses were returned
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param preAppId The application registration tracking ID (optional)
     * @param applicationId The application ID (optional)
     * @param status Look up app registration requests by status (optional)
     * @param appName Look up app registration requests by app name (optional)
     * @param submittedDate Look up app registration requests by the date they were submitted (optional)
     * @param modifiedDate Look up app registration requests by the date the request was updated. This can be used to determine when a request was updated to \&quot;A\&quot; or \&quot;R\&quot;. (optional)
     * @param page Index of the page of results to return (optional, default to 1)
     * @param pageSize Maximum number of results per page (optional, default to 1)
     * @return ResponseEntity&lt;AppStatuses&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AppStatuses> getAppRegistrationStatusWithHttpInfo(String preAppId, String applicationId, String status, String appName, Long submittedDate, Long modifiedDate, Integer page, Integer pageSize) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "preAppId", preAppId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "applicationId", applicationId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "appName", appName));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "submittedDate", submittedDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "modifiedDate", modifiedDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<AppStatuses> localReturnType = new ParameterizedTypeReference<AppStatuses>() {};
        return apiClient.invokeAPI("/aggregation/v2/partners/applications", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get applications details.
     * This endpoint returns the status of the submitted application and provides additional details.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Response containing one or more application details.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param start Index of the page of results to return (optional, default to 1)
     * @param limit Maximum number of results per page (optional, default to 50)
     * @param preAppId The identifier is provided by Mastercard at the first stage of application registration. (optional)
     * @param applicationId The identifier is generated after the pre-app is approved. Pre-app is the first stage of application registration. Partner first submits an application registration request, then a Pre-app Id is generated for it, and if all the details are correct, the sales team will approve it, and then an application will be registered with the Application Id and associated with the Pre-app. This Application Id is utilized throughout the lifespan of an application. (optional)
     * @param name The application name provided by the partner. (optional)
     * @param status The application registration status with Mastercard. &#39;A&#39;&#x3D;Active , &#39;P&#39;&#x3D;Pending , &#39;D&#39;&#x3D;Deleted , &#39;R&#39;&#x3D;Rejected. (optional)
     * @return ApplicationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApplicationResponse getApplications(Integer start, Integer limit, Integer preAppId, String applicationId, String name, String status) throws RestClientException {
        return getApplicationsWithHttpInfo(start, limit, preAppId, applicationId, name, status).getBody();
    }

    /**
     * Get applications details.
     * This endpoint returns the status of the submitted application and provides additional details.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Response containing one or more application details.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param start Index of the page of results to return (optional, default to 1)
     * @param limit Maximum number of results per page (optional, default to 50)
     * @param preAppId The identifier is provided by Mastercard at the first stage of application registration. (optional)
     * @param applicationId The identifier is generated after the pre-app is approved. Pre-app is the first stage of application registration. Partner first submits an application registration request, then a Pre-app Id is generated for it, and if all the details are correct, the sales team will approve it, and then an application will be registered with the Application Id and associated with the Pre-app. This Application Id is utilized throughout the lifespan of an application. (optional)
     * @param name The application name provided by the partner. (optional)
     * @param status The application registration status with Mastercard. &#39;A&#39;&#x3D;Active , &#39;P&#39;&#x3D;Pending , &#39;D&#39;&#x3D;Deleted , &#39;R&#39;&#x3D;Rejected. (optional)
     * @return ResponseEntity&lt;ApplicationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApplicationResponse> getApplicationsWithHttpInfo(Integer start, Integer limit, Integer preAppId, String applicationId, String name, String status) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "pre_app_id", preAppId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "application_id", applicationId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<ApplicationResponse> localReturnType = new ParameterizedTypeReference<ApplicationResponse>() {};
        return apiClient.invokeAPI("/applications", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the application registration status with the financial institutions.
     * The registration status of the approved application against the financial institutions.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The requested application registration status against financial institutions.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param applicationId The identifier is generated after the pre-app is approved. Pre-app is the first stage of application registration. Partner first submits an application registration request, then a Pre-app Id is generated for it, and if all the details are correct, the sales team will approve it, and then an application will be registered with the Application Id and associated with the Pre-app. This Application Id is utilized throughout the lifespan of an application. (required)
     * @param start Index of the page of results to return (optional, default to 1)
     * @param limit Maximum number of results per page (optional, default to 25)
     * @param institutionId The financial institution id at Mastercard. (optional)
     * @return InstitutionResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InstitutionResponse getRegisteredInstitutions(String applicationId, Integer start, Integer limit, Integer institutionId) throws RestClientException {
        return getRegisteredInstitutionsWithHttpInfo(applicationId, start, limit, institutionId).getBody();
    }

    /**
     * Get the application registration status with the financial institutions.
     * The registration status of the approved application against the financial institutions.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The requested application registration status against financial institutions.
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param applicationId The identifier is generated after the pre-app is approved. Pre-app is the first stage of application registration. Partner first submits an application registration request, then a Pre-app Id is generated for it, and if all the details are correct, the sales team will approve it, and then an application will be registered with the Application Id and associated with the Pre-app. This Application Id is utilized throughout the lifespan of an application. (required)
     * @param start Index of the page of results to return (optional, default to 1)
     * @param limit Maximum number of results per page (optional, default to 25)
     * @param institutionId The financial institution id at Mastercard. (optional)
     * @return ResponseEntity&lt;InstitutionResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InstitutionResponse> getRegisteredInstitutionsWithHttpInfo(String applicationId, Integer start, Integer limit, Integer institutionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'applicationId' when calling getRegisteredInstitutions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("application_id", applicationId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "institution_id", institutionId));
        

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<InstitutionResponse> localReturnType = new ParameterizedTypeReference<InstitutionResponse>() {};
        return apiClient.invokeAPI("/applications/{application_id}/institutions", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Migrate Institution Login Accounts
     * The &#x60;institutionLoginId&#x60; parameter uses Finicity&#39;s internal FI mapping to move accounts from the current FI legacy connection to the new OAuth FI connection.  This API returns a list of accounts for the given institution login ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The migration succeeded
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param institutionLoginId The institution login ID (required)
     * @return CustomerAccounts
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerAccounts migrateInstitutionLoginAccounts(String customerId, String institutionLoginId) throws RestClientException {
        return migrateInstitutionLoginAccountsWithHttpInfo(customerId, institutionLoginId).getBody();
    }

    /**
     * Migrate Institution Login Accounts
     * The &#x60;institutionLoginId&#x60; parameter uses Finicity&#39;s internal FI mapping to move accounts from the current FI legacy connection to the new OAuth FI connection.  This API returns a list of accounts for the given institution login ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The migration succeeded
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param institutionLoginId The institution login ID (required)
     * @return ResponseEntity&lt;CustomerAccounts&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerAccounts> migrateInstitutionLoginAccountsWithHttpInfo(String customerId, String institutionLoginId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling migrateInstitutionLoginAccounts");
        }
        
        // verify the required parameter 'institutionLoginId' is set
        if (institutionLoginId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'institutionLoginId' when calling migrateInstitutionLoginAccounts");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        uriVariables.put("institutionLoginId", institutionLoginId);

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

        ParameterizedTypeReference<CustomerAccounts> localReturnType = new ParameterizedTypeReference<CustomerAccounts>() {};
        return apiClient.invokeAPI("/aggregation/v2/customers/{customerId}/institutionLogins/{institutionLoginId}/migration", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Modify App Registration
     * Update a registered application.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The app registration was updated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param preAppId The application registration tracking ID (required)
     * @param application  (required)
     * @return RegisteredApplication
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RegisteredApplication modifyAppRegistration(String preAppId, Application application) throws RestClientException {
        return modifyAppRegistrationWithHttpInfo(preAppId, application).getBody();
    }

    /**
     * Modify App Registration
     * Update a registered application.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The app registration was updated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param preAppId The application registration tracking ID (required)
     * @param application  (required)
     * @return ResponseEntity&lt;RegisteredApplication&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RegisteredApplication> modifyAppRegistrationWithHttpInfo(String preAppId, Application application) throws RestClientException {
        Object localVarPostBody = application;
        
        // verify the required parameter 'preAppId' is set
        if (preAppId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'preAppId' when calling modifyAppRegistration");
        }
        
        // verify the required parameter 'application' is set
        if (application == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'application' when calling modifyAppRegistration");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("preAppId", preAppId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<RegisteredApplication> localReturnType = new ParameterizedTypeReference<RegisteredApplication>() {};
        return apiClient.invokeAPI("/aggregation/v1/partners/applications/{preAppId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Register App
     * Register a new application to access financial institutions using OAuth connections.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>201</b> - The app registration was successfully created
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param application  (required)
     * @return RegisteredApplication
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RegisteredApplication registerApp(Application application) throws RestClientException {
        return registerAppWithHttpInfo(application).getBody();
    }

    /**
     * Register App
     * Register a new application to access financial institutions using OAuth connections.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>201</b> - The app registration was successfully created
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param application  (required)
     * @return ResponseEntity&lt;RegisteredApplication&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RegisteredApplication> registerAppWithHttpInfo(Application application) throws RestClientException {
        Object localVarPostBody = application;
        
        // verify the required parameter 'application' is set
        if (application == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'application' when calling registerApp");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<RegisteredApplication> localReturnType = new ParameterizedTypeReference<RegisteredApplication>() {};
        return apiClient.invokeAPI("/aggregation/v1/partners/applications", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Set Customer App ID
     * If you have multiple applications for a single client, and you want to register their applications to access financial institutions using OAuth connections, then use this API to assign applications to an existing customer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The app was successfully assigned
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param applicationId The application ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void setCustomerAppID(String customerId, String applicationId) throws RestClientException {
        setCustomerAppIDWithHttpInfo(customerId, applicationId);
    }

    /**
     * Set Customer App ID
     * If you have multiple applications for a single client, and you want to register their applications to access financial institutions using OAuth connections, then use this API to assign applications to an existing customer.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The app was successfully assigned
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @param applicationId The application ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> setCustomerAppIDWithHttpInfo(String customerId, String applicationId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling setCustomerAppID");
        }
        
        // verify the required parameter 'applicationId' is set
        if (applicationId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'applicationId' when calling setCustomerAppID");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);
        uriVariables.put("applicationId", applicationId);

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/aggregation/v1/customers/{customerId}/applications/{applicationId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
