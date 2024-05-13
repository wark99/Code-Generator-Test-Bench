package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AccountChangeMobilePutRequest;
import org.openapitools.client.model.AccountChangePasswordPutRequest;
import org.openapitools.client.model.AccountEditAboutFamilyPutRequest;
import org.openapitools.client.model.AccountGet200Response;
import org.openapitools.client.model.AccountUpdateProfileSettingPutRequest;
import java.io.File;
import org.openapitools.client.model.SearchProfilePost400Response;
import org.openapitools.client.model.SearchProfilePostDefaultResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:24.544913406Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AccountApi {
    private ApiClient apiClient;

    public AccountApi() {
        this(new ApiClient());
    }

    public AccountApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Change mobile number
     * Updates user mobile number, you can use it to change which mobile is your primary and alternate phone number
     * <p><b>204</b> - No content. Update succeeded
     * <p><b>400</b> - Invalid request
     * <p><b>403</b> - Unauthorized
     * <p><b>0</b> - Unexpected Error
     * @param accountChangeMobilePutRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void accountChangeMobilePut(AccountChangeMobilePutRequest accountChangeMobilePutRequest) throws RestClientException {
        accountChangeMobilePutWithHttpInfo(accountChangeMobilePutRequest);
    }

    /**
     * Change mobile number
     * Updates user mobile number, you can use it to change which mobile is your primary and alternate phone number
     * <p><b>204</b> - No content. Update succeeded
     * <p><b>400</b> - Invalid request
     * <p><b>403</b> - Unauthorized
     * <p><b>0</b> - Unexpected Error
     * @param accountChangeMobilePutRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> accountChangeMobilePutWithHttpInfo(AccountChangeMobilePutRequest accountChangeMobilePutRequest) throws RestClientException {
        Object localVarPostBody = accountChangeMobilePutRequest;
        

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/account/change-mobile", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Change user password
     * Allows user to change their password
     * <p><b>204</b> - No content. Password changed
     * <p><b>400</b> - Invalid request
     * <p><b>403</b> - Unauthorized
     * <p><b>0</b> - Unexpected Error
     * @param accountChangePasswordPutRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void accountChangePasswordPut(AccountChangePasswordPutRequest accountChangePasswordPutRequest) throws RestClientException {
        accountChangePasswordPutWithHttpInfo(accountChangePasswordPutRequest);
    }

    /**
     * Change user password
     * Allows user to change their password
     * <p><b>204</b> - No content. Password changed
     * <p><b>400</b> - Invalid request
     * <p><b>403</b> - Unauthorized
     * <p><b>0</b> - Unexpected Error
     * @param accountChangePasswordPutRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> accountChangePasswordPutWithHttpInfo(AccountChangePasswordPutRequest accountChangePasswordPutRequest) throws RestClientException {
        Object localVarPostBody = accountChangePasswordPutRequest;
        

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/account/change-password", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Edits About Family
     * Allows parent to edit about family details
     * <p><b>204</b> - No content
     * <p><b>400</b> - Unable to get requested images
     * <p><b>403</b> - Error occurred
     * <p><b>0</b> - Unexpected Error
     * @param accountEditAboutFamilyPutRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void accountEditAboutFamilyPut(AccountEditAboutFamilyPutRequest accountEditAboutFamilyPutRequest) throws RestClientException {
        accountEditAboutFamilyPutWithHttpInfo(accountEditAboutFamilyPutRequest);
    }

    /**
     * Edits About Family
     * Allows parent to edit about family details
     * <p><b>204</b> - No content
     * <p><b>400</b> - Unable to get requested images
     * <p><b>403</b> - Error occurred
     * <p><b>0</b> - Unexpected Error
     * @param accountEditAboutFamilyPutRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> accountEditAboutFamilyPutWithHttpInfo(AccountEditAboutFamilyPutRequest accountEditAboutFamilyPutRequest) throws RestClientException {
        Object localVarPostBody = accountEditAboutFamilyPutRequest;
        

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/account/edit-about-family", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get user profile
     * If id is supplied it retrieves the profile matching the id. Where no id is supplied then it retrieves profile of the currently logged in user. If id is not supplied and no user is currently logged in, it will return an error
     * <p><b>200</b> - User profile retrieved successfully
     * <p><b>400</b> - Unable to create profile.
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (optional)
     * @return AccountGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountGet200Response accountGet(String id) throws RestClientException {
        return accountGetWithHttpInfo(id).getBody();
    }

    /**
     * Get user profile
     * If id is supplied it retrieves the profile matching the id. Where no id is supplied then it retrieves profile of the currently logged in user. If id is not supplied and no user is currently logged in, it will return an error
     * <p><b>200</b> - User profile retrieved successfully
     * <p><b>400</b> - Unable to create profile.
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param id  (optional)
     * @return ResponseEntity&lt;AccountGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountGet200Response> accountGetWithHttpInfo(String id) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AccountGet200Response> localReturnType = new ParameterizedTypeReference<AccountGet200Response>() {};
        return apiClient.invokeAPI("/account", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * get profile image
     * Returns links to profile images matching the supplied dimensions. If id is supplied in addition, then images links returned will match profile images of user whose profile id was supplied else images returned will default to currently logged in user.
     * <p><b>200</b> - User profile retrieved successfully
     * <p><b>400</b> - Unable to get requested images
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param dimension  (required)
     * @param id  (optional)
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> accountGetImageDimensionGet(String dimension, String id) throws RestClientException {
        return accountGetImageDimensionGetWithHttpInfo(dimension, id).getBody();
    }

    /**
     * get profile image
     * Returns links to profile images matching the supplied dimensions. If id is supplied in addition, then images links returned will match profile images of user whose profile id was supplied else images returned will default to currently logged in user.
     * <p><b>200</b> - User profile retrieved successfully
     * <p><b>400</b> - Unable to get requested images
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param dimension  (required)
     * @param id  (optional)
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> accountGetImageDimensionGetWithHttpInfo(String dimension, String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'dimension' is set
        if (dimension == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dimension' when calling accountGetImageDimensionGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dimension", dimension);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<String>> localReturnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI("/account/get-image/{dimension}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * update user profile setting
     * Allow user to update their name, address, gender, date of birth and alternate mobile number. Note that user is not allowed to update their name if id verification has already been completed. 
     * <p><b>204</b> - user profile successfully created
     * <p><b>400</b> - Unable to update profile settings.
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param accountUpdateProfileSettingPutRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void accountUpdateProfileSettingPut(AccountUpdateProfileSettingPutRequest accountUpdateProfileSettingPutRequest) throws RestClientException {
        accountUpdateProfileSettingPutWithHttpInfo(accountUpdateProfileSettingPutRequest);
    }

    /**
     * update user profile setting
     * Allow user to update their name, address, gender, date of birth and alternate mobile number. Note that user is not allowed to update their name if id verification has already been completed. 
     * <p><b>204</b> - user profile successfully created
     * <p><b>400</b> - Unable to update profile settings.
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param accountUpdateProfileSettingPutRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> accountUpdateProfileSettingPutWithHttpInfo(AccountUpdateProfileSettingPutRequest accountUpdateProfileSettingPutRequest) throws RestClientException {
        Object localVarPostBody = accountUpdateProfileSettingPutRequest;
        

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/account/update-profile-setting", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * uploads user profile images
     * Allows user to upload profile images. User can upload a maximum of 5 images. Each image can be PNG or JPG and exist no more than 1MB in size. Minimum dimensions allowed is 600x600 pixels
     * <p><b>204</b> - profile images successfully uploaded
     * <p><b>400</b> - Unable to upload profile images
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param files  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void accountUploadImagePut(List<File> files) throws RestClientException {
        accountUploadImagePutWithHttpInfo(files);
    }

    /**
     * uploads user profile images
     * Allows user to upload profile images. User can upload a maximum of 5 images. Each image can be PNG or JPG and exist no more than 1MB in size. Minimum dimensions allowed is 600x600 pixels
     * <p><b>204</b> - profile images successfully uploaded
     * <p><b>400</b> - Unable to upload profile images
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param files  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> accountUploadImagePutWithHttpInfo(List<File> files) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (files != null)
            localVarFormParams.addAll("files", files.stream().map(FileSystemResource::new).collect(Collectors.toList()));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/account/upload-image", HttpMethod.PUT, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
