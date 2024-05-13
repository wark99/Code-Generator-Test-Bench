package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateUserParams;
import org.openapitools.client.model.CreateUserResponse;
import org.openapitools.client.model.FilterUsersParams;
import org.openapitools.client.model.FilterUsersResponse;
import org.openapitools.client.model.GenericSuccessResponse;
import org.openapitools.client.model.GetUserResponse;
import org.openapitools.client.model.UpdateUserParams;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:41.221792118Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UserApi {
    private ApiClient apiClient;

    public UserApi() {
        this(new ApiClient());
    }

    public UserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a user
     * 
     * <p><b>200</b> - Success, user created.
     * <p><b>400</b>
     * <p><b>404</b>
     * <p><b>429</b>
     * @param createUserParams Create a new user (optional)
     * @return CreateUserResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateUserResponse createUser(CreateUserParams createUserParams) throws RestClientException {
        return createUserWithHttpInfo(createUserParams).getBody();
    }

    /**
     * Create a user
     * 
     * <p><b>200</b> - Success, user created.
     * <p><b>400</b>
     * <p><b>404</b>
     * <p><b>429</b>
     * @param createUserParams Create a new user (optional)
     * @return ResponseEntity&lt;CreateUserResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateUserResponse> createUserWithHttpInfo(CreateUserParams createUserParams) throws RestClientException {
        Object localVarPostBody = createUserParams;
        

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<CreateUserResponse> localReturnType = new ParameterizedTypeReference<CreateUserResponse>() {};
        return apiClient.invokeAPI("/users/create", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Filter users
     * 
     * <p><b>200</b> - Success, here are matching users.
     * <p><b>400</b>
     * <p><b>404</b>
     * <p><b>429</b>
     * @param filterUsersParams Filters on users. Requires at least one of &#x60;id&#x60; or &#x60;group_id&#x60;. (optional)
     * @return FilterUsersResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FilterUsersResponse filterUsers(FilterUsersParams filterUsersParams) throws RestClientException {
        return filterUsersWithHttpInfo(filterUsersParams).getBody();
    }

    /**
     * Filter users
     * 
     * <p><b>200</b> - Success, here are matching users.
     * <p><b>400</b>
     * <p><b>404</b>
     * <p><b>429</b>
     * @param filterUsersParams Filters on users. Requires at least one of &#x60;id&#x60; or &#x60;group_id&#x60;. (optional)
     * @return ResponseEntity&lt;FilterUsersResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FilterUsersResponse> filterUsersWithHttpInfo(FilterUsersParams filterUsersParams) throws RestClientException {
        Object localVarPostBody = filterUsersParams;
        

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<FilterUsersResponse> localReturnType = new ParameterizedTypeReference<FilterUsersResponse>() {};
        return apiClient.invokeAPI("/v2/users", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user
     * 
     * <p><b>200</b> - Success, here is your user.
     * <p><b>429</b>
     * @return GetUserResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUserResponse getUser() throws RestClientException {
        return getUserWithHttpInfo().getBody();
    }

    /**
     * Get user
     * 
     * <p><b>200</b> - Success, here is your user.
     * <p><b>429</b>
     * @return ResponseEntity&lt;GetUserResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUserResponse> getUserWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<GetUserResponse> localReturnType = new ParameterizedTypeReference<GetUserResponse>() {};
        return apiClient.invokeAPI("/v2/user", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a user
     * 
     * <p><b>200</b> - Success, user updated.
     * <p><b>400</b>
     * <p><b>404</b>
     * <p><b>429</b>
     * @param updateUserParams Update a user. All fields are optional except &#x60;id&#x60;, this endpoint acts as a PATCH. (optional)
     * @return GenericSuccessResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GenericSuccessResponse updateUser(UpdateUserParams updateUserParams) throws RestClientException {
        return updateUserWithHttpInfo(updateUserParams).getBody();
    }

    /**
     * Update a user
     * 
     * <p><b>200</b> - Success, user updated.
     * <p><b>400</b>
     * <p><b>404</b>
     * <p><b>429</b>
     * @param updateUserParams Update a user. All fields are optional except &#x60;id&#x60;, this endpoint acts as a PATCH. (optional)
     * @return ResponseEntity&lt;GenericSuccessResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GenericSuccessResponse> updateUserWithHttpInfo(UpdateUserParams updateUserParams) throws RestClientException {
        Object localVarPostBody = updateUserParams;
        

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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<GenericSuccessResponse> localReturnType = new ParameterizedTypeReference<GenericSuccessResponse>() {};
        return apiClient.invokeAPI("/v2/users/update", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
