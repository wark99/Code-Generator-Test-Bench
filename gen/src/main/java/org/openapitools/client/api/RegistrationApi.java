package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.io.File;
import org.openapitools.client.model.IdVerificationIdDocTypesGet200ResponseInner;
import org.openapitools.client.model.RegistrationCreateAccountPost201Response;
import org.openapitools.client.model.RegistrationCreateAccountPostRequest;
import org.openapitools.client.model.RegistrationCreateProfilePostRequest;
import org.openapitools.client.model.RegistrationVerifyMobilePostRequest;
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
public class RegistrationApi {
    private ApiClient apiClient;

    public RegistrationApi() {
        this(new ApiClient());
    }

    public RegistrationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * gets a list of allowed id document types
     * list all official id documents allowed for the purpose of identity verification
     * <p><b>200</b> - retrieved id document types successfully
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @return List&lt;IdVerificationIdDocTypesGet200ResponseInner&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<IdVerificationIdDocTypesGet200ResponseInner> idVerificationIdDocTypesGet() throws RestClientException {
        return idVerificationIdDocTypesGetWithHttpInfo().getBody();
    }

    /**
     * gets a list of allowed id document types
     * list all official id documents allowed for the purpose of identity verification
     * <p><b>200</b> - retrieved id document types successfully
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @return ResponseEntity&lt;List&lt;IdVerificationIdDocTypesGet200ResponseInner&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<IdVerificationIdDocTypesGet200ResponseInner>> idVerificationIdDocTypesGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<IdVerificationIdDocTypesGet200ResponseInner>> localReturnType = new ParameterizedTypeReference<List<IdVerificationIdDocTypesGet200ResponseInner>>() {};
        return apiClient.invokeAPI("/id-verification/id-doc-types", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * uploads id document for id verification
     * This allows user to upload ID verification document to server. Only pdf,jpg,jpeg and png are allowed formats.  Maximum 2 files can be uploaded at a time and there are size restrictions of files 
     * <p><b>201</b> - document successfully uploaded
     * <p><b>400</b> - Unable to create profile.
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param idType  (required)
     * @param files  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void idVerificationUploadIdTypePost(String idType, List<File> files) throws RestClientException {
        idVerificationUploadIdTypePostWithHttpInfo(idType, files);
    }

    /**
     * uploads id document for id verification
     * This allows user to upload ID verification document to server. Only pdf,jpg,jpeg and png are allowed formats.  Maximum 2 files can be uploaded at a time and there are size restrictions of files 
     * <p><b>201</b> - document successfully uploaded
     * <p><b>400</b> - Unable to create profile.
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param idType  (required)
     * @param files  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> idVerificationUploadIdTypePostWithHttpInfo(String idType, List<File> files) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idType' is set
        if (idType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idType' when calling idVerificationUploadIdTypePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id-type", idType);

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
        return apiClient.invokeAPI("/id-verification/upload/{id-type}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * create a user account
     * This creates a basic user account with so you can login with access to basic features
     * <p><b>201</b> - Account successfully created
     * <p><b>400</b> - Account could not be created due to an error
     * <p><b>0</b> - Unexpected Error
     * @param registrationCreateAccountPostRequest  (optional)
     * @return RegistrationCreateAccountPost201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RegistrationCreateAccountPost201Response registrationCreateAccountPost(RegistrationCreateAccountPostRequest registrationCreateAccountPostRequest) throws RestClientException {
        return registrationCreateAccountPostWithHttpInfo(registrationCreateAccountPostRequest).getBody();
    }

    /**
     * create a user account
     * This creates a basic user account with so you can login with access to basic features
     * <p><b>201</b> - Account successfully created
     * <p><b>400</b> - Account could not be created due to an error
     * <p><b>0</b> - Unexpected Error
     * @param registrationCreateAccountPostRequest  (optional)
     * @return ResponseEntity&lt;RegistrationCreateAccountPost201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RegistrationCreateAccountPost201Response> registrationCreateAccountPostWithHttpInfo(RegistrationCreateAccountPostRequest registrationCreateAccountPostRequest) throws RestClientException {
        Object localVarPostBody = registrationCreateAccountPostRequest;
        

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

        ParameterizedTypeReference<RegistrationCreateAccountPost201Response> localReturnType = new ParameterizedTypeReference<RegistrationCreateAccountPost201Response>() {};
        return apiClient.invokeAPI("/registration/create-account", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * creates a user profile
     * creates a user profile and associates it to an account already created with /registration/create-account 
     * <p><b>204</b> - user profile successfully created
     * <p><b>400</b> - Unable to create profile.
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param registrationCreateProfilePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void registrationCreateProfilePost(RegistrationCreateProfilePostRequest registrationCreateProfilePostRequest) throws RestClientException {
        registrationCreateProfilePostWithHttpInfo(registrationCreateProfilePostRequest);
    }

    /**
     * creates a user profile
     * creates a user profile and associates it to an account already created with /registration/create-account 
     * <p><b>204</b> - user profile successfully created
     * <p><b>400</b> - Unable to create profile.
     * <p><b>403</b> - Forbidden
     * <p><b>0</b> - Unexpected Error
     * @param registrationCreateProfilePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> registrationCreateProfilePostWithHttpInfo(RegistrationCreateProfilePostRequest registrationCreateProfilePostRequest) throws RestClientException {
        Object localVarPostBody = registrationCreateProfilePostRequest;
        

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
        return apiClient.invokeAPI("/registration/create-profile", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Verifies that user mobile number
     * Verifies that user has access to mobile number the supplied during registration process
     * <p><b>200</b> - pin code was successfully verified
     * <p><b>400</b> - We were unable to verify your pin code
     * <p><b>0</b> - Unexpected Error
     * @param registrationVerifyMobilePostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void registrationVerifyMobilePost(RegistrationVerifyMobilePostRequest registrationVerifyMobilePostRequest) throws RestClientException {
        registrationVerifyMobilePostWithHttpInfo(registrationVerifyMobilePostRequest);
    }

    /**
     * Verifies that user mobile number
     * Verifies that user has access to mobile number the supplied during registration process
     * <p><b>200</b> - pin code was successfully verified
     * <p><b>400</b> - We were unable to verify your pin code
     * <p><b>0</b> - Unexpected Error
     * @param registrationVerifyMobilePostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> registrationVerifyMobilePostWithHttpInfo(RegistrationVerifyMobilePostRequest registrationVerifyMobilePostRequest) throws RestClientException {
        Object localVarPostBody = registrationVerifyMobilePostRequest;
        

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
        return apiClient.invokeAPI("/registration/verify-mobile", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
