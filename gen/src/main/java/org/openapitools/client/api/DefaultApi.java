package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AccountCreationRequest;
import org.openapitools.client.model.AccountCreationResponse;
import org.openapitools.client.model.HTTPValidationError;
import org.openapitools.client.model.LoginData;
import org.openapitools.client.model.LoginResponse;
import org.openapitools.client.model.ResponseMessage;
import org.openapitools.client.model.TriageDetailResponse;
import org.openapitools.client.model.TriageListResponse;
import org.openapitools.client.model.UpdateAccountInformationRequest;
import org.openapitools.client.model.UpdateTriageRequest;
import org.openapitools.client.model.UpdateUserHealthInfoRequest;
import org.openapitools.client.model.UserHealthInfoResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:24:43.969735874Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create New Account
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param accountCreationRequest  (required)
     * @return AccountCreationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AccountCreationResponse createNewAccountCreateAccountPost(AccountCreationRequest accountCreationRequest) throws RestClientException {
        return createNewAccountCreateAccountPostWithHttpInfo(accountCreationRequest).getBody();
    }

    /**
     * Create New Account
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param accountCreationRequest  (required)
     * @return ResponseEntity&lt;AccountCreationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AccountCreationResponse> createNewAccountCreateAccountPostWithHttpInfo(AccountCreationRequest accountCreationRequest) throws RestClientException {
        Object localVarPostBody = accountCreationRequest;
        
        // verify the required parameter 'accountCreationRequest' is set
        if (accountCreationRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accountCreationRequest' when calling createNewAccountCreateAccountPost");
        }
        

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

        ParameterizedTypeReference<AccountCreationResponse> localReturnType = new ParameterizedTypeReference<AccountCreationResponse>() {};
        return apiClient.invokeAPI("/create-account/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete Account Information
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @return ResponseMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseMessage deleteAccountInformationPatientIdAccountInfoDelete(String patientId) throws RestClientException {
        return deleteAccountInformationPatientIdAccountInfoDeleteWithHttpInfo(patientId).getBody();
    }

    /**
     * Delete Account Information
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @return ResponseEntity&lt;ResponseMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseMessage> deleteAccountInformationPatientIdAccountInfoDeleteWithHttpInfo(String patientId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'patientId' is set
        if (patientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patientId' when calling deleteAccountInformationPatientIdAccountInfoDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("patient_id", patientId);

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

        ParameterizedTypeReference<ResponseMessage> localReturnType = new ParameterizedTypeReference<ResponseMessage>() {};
        return apiClient.invokeAPI("/{patient_id}/account-info/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete Triage
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @param triageId  (required)
     * @return ResponseMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseMessage deleteTriagePatientIdTriagesTriageIdDelete(String patientId, String triageId) throws RestClientException {
        return deleteTriagePatientIdTriagesTriageIdDeleteWithHttpInfo(patientId, triageId).getBody();
    }

    /**
     * Delete Triage
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @param triageId  (required)
     * @return ResponseEntity&lt;ResponseMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseMessage> deleteTriagePatientIdTriagesTriageIdDeleteWithHttpInfo(String patientId, String triageId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'patientId' is set
        if (patientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patientId' when calling deleteTriagePatientIdTriagesTriageIdDelete");
        }
        
        // verify the required parameter 'triageId' is set
        if (triageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'triageId' when calling deleteTriagePatientIdTriagesTriageIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("patient_id", patientId);
        uriVariables.put("triage_id", triageId);

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

        ParameterizedTypeReference<ResponseMessage> localReturnType = new ParameterizedTypeReference<ResponseMessage>() {};
        return apiClient.invokeAPI("/{patient_id}/triages/{triage_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete User Health Info
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @return ResponseMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseMessage deleteUserHealthInfoPatientIdHealthInfoDelete(String patientId) throws RestClientException {
        return deleteUserHealthInfoPatientIdHealthInfoDeleteWithHttpInfo(patientId).getBody();
    }

    /**
     * Delete User Health Info
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @return ResponseEntity&lt;ResponseMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseMessage> deleteUserHealthInfoPatientIdHealthInfoDeleteWithHttpInfo(String patientId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'patientId' is set
        if (patientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patientId' when calling deleteUserHealthInfoPatientIdHealthInfoDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("patient_id", patientId);

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

        ParameterizedTypeReference<ResponseMessage> localReturnType = new ParameterizedTypeReference<ResponseMessage>() {};
        return apiClient.invokeAPI("/{patient_id}/health-info/", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Specific Triage
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @param triageId  (required)
     * @return TriageDetailResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TriageDetailResponse getSpecificTriagePatientIdTriagesTriageIdGet(Object patientId, Object triageId) throws RestClientException {
        return getSpecificTriagePatientIdTriagesTriageIdGetWithHttpInfo(patientId, triageId).getBody();
    }

    /**
     * Get Specific Triage
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @param triageId  (required)
     * @return ResponseEntity&lt;TriageDetailResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TriageDetailResponse> getSpecificTriagePatientIdTriagesTriageIdGetWithHttpInfo(Object patientId, Object triageId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'patientId' is set
        if (patientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patientId' when calling getSpecificTriagePatientIdTriagesTriageIdGet");
        }
        
        // verify the required parameter 'triageId' is set
        if (triageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'triageId' when calling getSpecificTriagePatientIdTriagesTriageIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("patient_id", patientId);
        uriVariables.put("triage_id", triageId);

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

        ParameterizedTypeReference<TriageDetailResponse> localReturnType = new ParameterizedTypeReference<TriageDetailResponse>() {};
        return apiClient.invokeAPI("/{patient_id}/triages/{triage_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Triage List
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @return TriageListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TriageListResponse getTriageListPatientIdTriagesGet(Object patientId) throws RestClientException {
        return getTriageListPatientIdTriagesGetWithHttpInfo(patientId).getBody();
    }

    /**
     * Get Triage List
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @return ResponseEntity&lt;TriageListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TriageListResponse> getTriageListPatientIdTriagesGetWithHttpInfo(Object patientId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'patientId' is set
        if (patientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patientId' when calling getTriageListPatientIdTriagesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("patient_id", patientId);

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

        ParameterizedTypeReference<TriageListResponse> localReturnType = new ParameterizedTypeReference<TriageListResponse>() {};
        return apiClient.invokeAPI("/{patient_id}/triages/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get User Health Info
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @return UserHealthInfoResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserHealthInfoResponse getUserHealthInfoPatientIdGet(Object patientId) throws RestClientException {
        return getUserHealthInfoPatientIdGetWithHttpInfo(patientId).getBody();
    }

    /**
     * Get User Health Info
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @return ResponseEntity&lt;UserHealthInfoResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserHealthInfoResponse> getUserHealthInfoPatientIdGetWithHttpInfo(Object patientId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'patientId' is set
        if (patientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patientId' when calling getUserHealthInfoPatientIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("patient_id", patientId);

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

        ParameterizedTypeReference<UserHealthInfoResponse> localReturnType = new ParameterizedTypeReference<UserHealthInfoResponse>() {};
        return apiClient.invokeAPI("/{patient_id}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Account Information
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @param updateAccountInformationRequest  (required)
     * @return ResponseMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseMessage updateAccountInformationPatientIdAccountInfoPut(String patientId, UpdateAccountInformationRequest updateAccountInformationRequest) throws RestClientException {
        return updateAccountInformationPatientIdAccountInfoPutWithHttpInfo(patientId, updateAccountInformationRequest).getBody();
    }

    /**
     * Update Account Information
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @param updateAccountInformationRequest  (required)
     * @return ResponseEntity&lt;ResponseMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseMessage> updateAccountInformationPatientIdAccountInfoPutWithHttpInfo(String patientId, UpdateAccountInformationRequest updateAccountInformationRequest) throws RestClientException {
        Object localVarPostBody = updateAccountInformationRequest;
        
        // verify the required parameter 'patientId' is set
        if (patientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patientId' when calling updateAccountInformationPatientIdAccountInfoPut");
        }
        
        // verify the required parameter 'updateAccountInformationRequest' is set
        if (updateAccountInformationRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateAccountInformationRequest' when calling updateAccountInformationPatientIdAccountInfoPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("patient_id", patientId);

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

        ParameterizedTypeReference<ResponseMessage> localReturnType = new ParameterizedTypeReference<ResponseMessage>() {};
        return apiClient.invokeAPI("/{patient_id}/account-info/", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Triage
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @param triageId  (required)
     * @param updateTriageRequest  (required)
     * @return ResponseMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseMessage updateTriagePatientIdTriagesTriageIdPut(String patientId, String triageId, UpdateTriageRequest updateTriageRequest) throws RestClientException {
        return updateTriagePatientIdTriagesTriageIdPutWithHttpInfo(patientId, triageId, updateTriageRequest).getBody();
    }

    /**
     * Update Triage
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @param triageId  (required)
     * @param updateTriageRequest  (required)
     * @return ResponseEntity&lt;ResponseMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseMessage> updateTriagePatientIdTriagesTriageIdPutWithHttpInfo(String patientId, String triageId, UpdateTriageRequest updateTriageRequest) throws RestClientException {
        Object localVarPostBody = updateTriageRequest;
        
        // verify the required parameter 'patientId' is set
        if (patientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patientId' when calling updateTriagePatientIdTriagesTriageIdPut");
        }
        
        // verify the required parameter 'triageId' is set
        if (triageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'triageId' when calling updateTriagePatientIdTriagesTriageIdPut");
        }
        
        // verify the required parameter 'updateTriageRequest' is set
        if (updateTriageRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateTriageRequest' when calling updateTriagePatientIdTriagesTriageIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("patient_id", patientId);
        uriVariables.put("triage_id", triageId);

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

        ParameterizedTypeReference<ResponseMessage> localReturnType = new ParameterizedTypeReference<ResponseMessage>() {};
        return apiClient.invokeAPI("/{patient_id}/triages/{triage_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update User Health Info
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @param updateUserHealthInfoRequest  (required)
     * @return ResponseMessage
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseMessage updateUserHealthInfoPatientIdHealthInfoPut(String patientId, UpdateUserHealthInfoRequest updateUserHealthInfoRequest) throws RestClientException {
        return updateUserHealthInfoPatientIdHealthInfoPutWithHttpInfo(patientId, updateUserHealthInfoRequest).getBody();
    }

    /**
     * Update User Health Info
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param patientId  (required)
     * @param updateUserHealthInfoRequest  (required)
     * @return ResponseEntity&lt;ResponseMessage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResponseMessage> updateUserHealthInfoPatientIdHealthInfoPutWithHttpInfo(String patientId, UpdateUserHealthInfoRequest updateUserHealthInfoRequest) throws RestClientException {
        Object localVarPostBody = updateUserHealthInfoRequest;
        
        // verify the required parameter 'patientId' is set
        if (patientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patientId' when calling updateUserHealthInfoPatientIdHealthInfoPut");
        }
        
        // verify the required parameter 'updateUserHealthInfoRequest' is set
        if (updateUserHealthInfoRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateUserHealthInfoRequest' when calling updateUserHealthInfoPatientIdHealthInfoPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("patient_id", patientId);

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

        ParameterizedTypeReference<ResponseMessage> localReturnType = new ParameterizedTypeReference<ResponseMessage>() {};
        return apiClient.invokeAPI("/{patient_id}/health-info/", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * User Validation
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param loginData  (required)
     * @return LoginResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LoginResponse userValidationLoginPost(LoginData loginData) throws RestClientException {
        return userValidationLoginPostWithHttpInfo(loginData).getBody();
    }

    /**
     * User Validation
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>422</b> - Validation Error
     * @param loginData  (required)
     * @return ResponseEntity&lt;LoginResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LoginResponse> userValidationLoginPostWithHttpInfo(LoginData loginData) throws RestClientException {
        Object localVarPostBody = loginData;
        
        // verify the required parameter 'loginData' is set
        if (loginData == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loginData' when calling userValidationLoginPost");
        }
        

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

        ParameterizedTypeReference<LoginResponse> localReturnType = new ParameterizedTypeReference<LoginResponse>() {};
        return apiClient.invokeAPI("/login/", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
