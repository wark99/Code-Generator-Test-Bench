package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetApplicationVersion201Response;
import org.openapitools.client.model.NotificationList;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:14:21.073249278Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class MiscellaneousApi {
    private ApiClient apiClient;

    public MiscellaneousApi() {
        this(new ApiClient());
    }

    public MiscellaneousApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Application Version
     * Retrieve the version of the application.
     * <p><b>201</b> - Application version retrieved successfully.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @return GetApplicationVersion201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetApplicationVersion201Response getApplicationVersion() throws RestClientException {
        return getApplicationVersionWithHttpInfo().getBody();
    }

    /**
     * Get Application Version
     * Retrieve the version of the application.
     * <p><b>201</b> - Application version retrieved successfully.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @return ResponseEntity&lt;GetApplicationVersion201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetApplicationVersion201Response> getApplicationVersionWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "studio_oauth2" };

        ParameterizedTypeReference<GetApplicationVersion201Response> localReturnType = new ParameterizedTypeReference<GetApplicationVersion201Response>() {};
        return apiClient.invokeAPI("/version", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Notifications
     * Retrieve a list of notifications with optional filtering and pagination.
     * <p><b>201</b> - Notifications retrieved successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param page The page number for pagination. Default is 0. (optional)
     * @param limit The maximum number of notifications to return. Default is 10. (optional)
     * @param sortBy The field to sort notifications by. Default is \&quot;createdOn\&quot;. (optional)
     * @param sortOrder The sorting order. Default is \&quot;desc\&quot;. (optional)
     * @return List&lt;NotificationList&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<NotificationList> getNotifications(Integer page, Integer limit, String sortBy, String sortOrder) throws RestClientException {
        return getNotificationsWithHttpInfo(page, limit, sortBy, sortOrder).getBody();
    }

    /**
     * Get Notifications
     * Retrieve a list of notifications with optional filtering and pagination.
     * <p><b>201</b> - Notifications retrieved successfully.
     * <p><b>400</b> - Bad Request. Invalid input or validation error.
     * <p><b>500</b> - Internal Server Error. Something went wrong on the server.
     * @param page The page number for pagination. Default is 0. (optional)
     * @param limit The maximum number of notifications to return. Default is 10. (optional)
     * @param sortBy The field to sort notifications by. Default is \&quot;createdOn\&quot;. (optional)
     * @param sortOrder The sorting order. Default is \&quot;desc\&quot;. (optional)
     * @return ResponseEntity&lt;List&lt;NotificationList&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<NotificationList>> getNotificationsWithHttpInfo(Integer page, Integer limit, String sortBy, String sortOrder) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortOrder", sortOrder));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "studio_oauth2" };

        ParameterizedTypeReference<List<NotificationList>> localReturnType = new ParameterizedTypeReference<List<NotificationList>>() {};
        return apiClient.invokeAPI("/api/v1/notifications", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
