package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AuthLoginPost200Response;
import org.openapitools.client.model.AuthLoginPost401Response;
import org.openapitools.client.model.AuthLoginPostRequest;
import org.openapitools.client.model.AuthLogoutPost200Response;
import org.openapitools.client.model.AuthLogoutPostRequest;
import org.openapitools.client.model.ClothesListUserIdGet200Response;
import org.openapitools.client.model.ClothesReturnPostRequest;
import org.openapitools.client.model.ClothesStorePost200Response;
import org.openapitools.client.model.ClothesStorePostRequest;
import org.openapitools.client.model.NotificationsSlackPostRequest;
import org.openapitools.client.model.PaymentsRetryPostRequest;
import org.openapitools.client.model.PaymentsUserIdAutoGet200Response;
import org.openapitools.client.model.StorageRequestsRequestIdPickupPut200Response;
import org.openapitools.client.model.UsersPostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:22.823821767Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * 로그인
     * 사용자 이메일과 비밀번호를 통해 로그인을 진행하고, 인증 토큰을 발급합니다.
     * <p><b>200</b> - 로그인 성공
     * <p><b>401</b> - Unauthorized
     * @param authLoginPostRequest  (required)
     * @return AuthLoginPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AuthLoginPost200Response authLoginPost(AuthLoginPostRequest authLoginPostRequest) throws RestClientException {
        return authLoginPostWithHttpInfo(authLoginPostRequest).getBody();
    }

    /**
     * 로그인
     * 사용자 이메일과 비밀번호를 통해 로그인을 진행하고, 인증 토큰을 발급합니다.
     * <p><b>200</b> - 로그인 성공
     * <p><b>401</b> - Unauthorized
     * @param authLoginPostRequest  (required)
     * @return ResponseEntity&lt;AuthLoginPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AuthLoginPost200Response> authLoginPostWithHttpInfo(AuthLoginPostRequest authLoginPostRequest) throws RestClientException {
        Object localVarPostBody = authLoginPostRequest;
        
        // verify the required parameter 'authLoginPostRequest' is set
        if (authLoginPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authLoginPostRequest' when calling authLoginPost");
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

        ParameterizedTypeReference<AuthLoginPost200Response> localReturnType = new ParameterizedTypeReference<AuthLoginPost200Response>() {};
        return apiClient.invokeAPI("/auth/login", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 로그아웃
     * 현재 세션의 사용자를 로그아웃 처리합니다.
     * <p><b>200</b> - 로그아웃 성공
     * @param authLogoutPostRequest  (required)
     * @return AuthLogoutPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AuthLogoutPost200Response authLogoutPost(AuthLogoutPostRequest authLogoutPostRequest) throws RestClientException {
        return authLogoutPostWithHttpInfo(authLogoutPostRequest).getBody();
    }

    /**
     * 로그아웃
     * 현재 세션의 사용자를 로그아웃 처리합니다.
     * <p><b>200</b> - 로그아웃 성공
     * @param authLogoutPostRequest  (required)
     * @return ResponseEntity&lt;AuthLogoutPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AuthLogoutPost200Response> authLogoutPostWithHttpInfo(AuthLogoutPostRequest authLogoutPostRequest) throws RestClientException {
        Object localVarPostBody = authLogoutPostRequest;
        
        // verify the required parameter 'authLogoutPostRequest' is set
        if (authLogoutPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'authLogoutPostRequest' when calling authLogoutPost");
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

        ParameterizedTypeReference<AuthLogoutPost200Response> localReturnType = new ParameterizedTypeReference<AuthLogoutPost200Response>() {};
        return apiClient.invokeAPI("/auth/logout", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 보관한 의류 리스트 조회
     * 사용자가 보관한 의류 리스트를 조회하는 API
     * <p><b>200</b> - 보관한 의류 리스트 조회 성공
     * <p><b>404</b> - No clothes found
     * <p><b>401</b> - User not authenticated
     * @param userId  (required)
     * @return ClothesListUserIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ClothesListUserIdGet200Response clothesListUserIdGet(Integer userId) throws RestClientException {
        return clothesListUserIdGetWithHttpInfo(userId).getBody();
    }

    /**
     * 보관한 의류 리스트 조회
     * 사용자가 보관한 의류 리스트를 조회하는 API
     * <p><b>200</b> - 보관한 의류 리스트 조회 성공
     * <p><b>404</b> - No clothes found
     * <p><b>401</b> - User not authenticated
     * @param userId  (required)
     * @return ResponseEntity&lt;ClothesListUserIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ClothesListUserIdGet200Response> clothesListUserIdGetWithHttpInfo(Integer userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling clothesListUserIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);

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

        ParameterizedTypeReference<ClothesListUserIdGet200Response> localReturnType = new ParameterizedTypeReference<ClothesListUserIdGet200Response>() {};
        return apiClient.invokeAPI("/clothes/list/{user_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 의류 반환 신청
     * 사용자가 보관된 의류의 반환을 신청합니다.
     * @param clothesReturnPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void clothesReturnPost(ClothesReturnPostRequest clothesReturnPostRequest) throws RestClientException {
        clothesReturnPostWithHttpInfo(clothesReturnPostRequest);
    }

    /**
     * 의류 반환 신청
     * 사용자가 보관된 의류의 반환을 신청합니다.
     * @param clothesReturnPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> clothesReturnPostWithHttpInfo(ClothesReturnPostRequest clothesReturnPostRequest) throws RestClientException {
        Object localVarPostBody = clothesReturnPostRequest;
        
        // verify the required parameter 'clothesReturnPostRequest' is set
        if (clothesReturnPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clothesReturnPostRequest' when calling clothesReturnPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/clothes/return", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 의류 보관 신청
     * 사용자가 의류 보관을 신청하는 API
     * <p><b>200</b> - 의류 보관 신청 성공
     * <p><b>400</b> - Invalid input data
     * <p><b>401</b> - User not authenticated
     * <p><b>403</b> - User is not authorized to perform this action
     * @param clothesStorePostRequest  (required)
     * @return ClothesStorePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ClothesStorePost200Response clothesStorePost(ClothesStorePostRequest clothesStorePostRequest) throws RestClientException {
        return clothesStorePostWithHttpInfo(clothesStorePostRequest).getBody();
    }

    /**
     * 의류 보관 신청
     * 사용자가 의류 보관을 신청하는 API
     * <p><b>200</b> - 의류 보관 신청 성공
     * <p><b>400</b> - Invalid input data
     * <p><b>401</b> - User not authenticated
     * <p><b>403</b> - User is not authorized to perform this action
     * @param clothesStorePostRequest  (required)
     * @return ResponseEntity&lt;ClothesStorePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ClothesStorePost200Response> clothesStorePostWithHttpInfo(ClothesStorePostRequest clothesStorePostRequest) throws RestClientException {
        Object localVarPostBody = clothesStorePostRequest;
        
        // verify the required parameter 'clothesStorePostRequest' is set
        if (clothesStorePostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clothesStorePostRequest' when calling clothesStorePost");
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

        ParameterizedTypeReference<ClothesStorePost200Response> localReturnType = new ParameterizedTypeReference<ClothesStorePost200Response>() {};
        return apiClient.invokeAPI("/clothes/store", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Slack에 알림 보내기
     * 결제 실패 시 구성된 Slack 채널로 알림 메시지를 보냄
     * <p><b>200</b> - 알림 전송
     * <p><b>400</b> - 잘못된 입력
     * @param notificationsSlackPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void notificationsSlackPost(NotificationsSlackPostRequest notificationsSlackPostRequest) throws RestClientException {
        notificationsSlackPostWithHttpInfo(notificationsSlackPostRequest);
    }

    /**
     * Slack에 알림 보내기
     * 결제 실패 시 구성된 Slack 채널로 알림 메시지를 보냄
     * <p><b>200</b> - 알림 전송
     * <p><b>400</b> - 잘못된 입력
     * @param notificationsSlackPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> notificationsSlackPostWithHttpInfo(NotificationsSlackPostRequest notificationsSlackPostRequest) throws RestClientException {
        Object localVarPostBody = notificationsSlackPostRequest;
        
        // verify the required parameter 'notificationsSlackPostRequest' is set
        if (notificationsSlackPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'notificationsSlackPostRequest' when calling notificationsSlackPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/notifications/slack", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 실패한 결제 재시도
     * 저장된 카드 정보를 사용하여 매일 실패한 결제를 자동으로 재시도
     * <p><b>200</b> - 결제 재시도 시작됨
     * <p><b>404</b> - 사용자를 찾을 수 없음
     * @param paymentsRetryPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void paymentsRetryPost(PaymentsRetryPostRequest paymentsRetryPostRequest) throws RestClientException {
        paymentsRetryPostWithHttpInfo(paymentsRetryPostRequest);
    }

    /**
     * 실패한 결제 재시도
     * 저장된 카드 정보를 사용하여 매일 실패한 결제를 자동으로 재시도
     * <p><b>200</b> - 결제 재시도 시작됨
     * <p><b>404</b> - 사용자를 찾을 수 없음
     * @param paymentsRetryPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> paymentsRetryPostWithHttpInfo(PaymentsRetryPostRequest paymentsRetryPostRequest) throws RestClientException {
        Object localVarPostBody = paymentsRetryPostRequest;
        
        // verify the required parameter 'paymentsRetryPostRequest' is set
        if (paymentsRetryPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'paymentsRetryPostRequest' when calling paymentsRetryPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/payments/retry", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 자동 결제
     * 사용자의 월별 결제에 대한 자동 결제 상태를 검색
     * <p><b>200</b> - 결제 상태 검색
     * <p><b>404</b> - User not found
     * @param userId user ID (required)
     * @return PaymentsUserIdAutoGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PaymentsUserIdAutoGet200Response paymentsUserIdAutoGet(Integer userId) throws RestClientException {
        return paymentsUserIdAutoGetWithHttpInfo(userId).getBody();
    }

    /**
     * 자동 결제
     * 사용자의 월별 결제에 대한 자동 결제 상태를 검색
     * <p><b>200</b> - 결제 상태 검색
     * <p><b>404</b> - User not found
     * @param userId user ID (required)
     * @return ResponseEntity&lt;PaymentsUserIdAutoGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PaymentsUserIdAutoGet200Response> paymentsUserIdAutoGetWithHttpInfo(Integer userId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling paymentsUserIdAutoGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userId", userId);

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

        ParameterizedTypeReference<PaymentsUserIdAutoGet200Response> localReturnType = new ParameterizedTypeReference<PaymentsUserIdAutoGet200Response>() {};
        return apiClient.invokeAPI("/payments/{userId}/auto", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 의류 반환 완료 (배송팀용)
     * 
     * <p><b>200</b> - 의류 반환 완료
     * @param requestId  (required)
     * @return StorageRequestsRequestIdPickupPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StorageRequestsRequestIdPickupPut200Response returnRequestsRequestIdReturnPut(String requestId) throws RestClientException {
        return returnRequestsRequestIdReturnPutWithHttpInfo(requestId).getBody();
    }

    /**
     * 의류 반환 완료 (배송팀용)
     * 
     * <p><b>200</b> - 의류 반환 완료
     * @param requestId  (required)
     * @return ResponseEntity&lt;StorageRequestsRequestIdPickupPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StorageRequestsRequestIdPickupPut200Response> returnRequestsRequestIdReturnPutWithHttpInfo(String requestId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestId' when calling returnRequestsRequestIdReturnPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("requestId", requestId);

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

        ParameterizedTypeReference<StorageRequestsRequestIdPickupPut200Response> localReturnType = new ParameterizedTypeReference<StorageRequestsRequestIdPickupPut200Response>() {};
        return apiClient.invokeAPI("/return-requests/{requestId}/return", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 의류 수거 완료 (배송팀용)
     * 
     * <p><b>200</b> - 의류 수거 완료
     * @param requestId  (required)
     * @return StorageRequestsRequestIdPickupPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StorageRequestsRequestIdPickupPut200Response storageRequestsRequestIdPickupPut(String requestId) throws RestClientException {
        return storageRequestsRequestIdPickupPutWithHttpInfo(requestId).getBody();
    }

    /**
     * 의류 수거 완료 (배송팀용)
     * 
     * <p><b>200</b> - 의류 수거 완료
     * @param requestId  (required)
     * @return ResponseEntity&lt;StorageRequestsRequestIdPickupPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StorageRequestsRequestIdPickupPut200Response> storageRequestsRequestIdPickupPutWithHttpInfo(String requestId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestId' when calling storageRequestsRequestIdPickupPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("requestId", requestId);

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

        ParameterizedTypeReference<StorageRequestsRequestIdPickupPut200Response> localReturnType = new ParameterizedTypeReference<StorageRequestsRequestIdPickupPut200Response>() {};
        return apiClient.invokeAPI("/storage-requests/{requestId}/pickup", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 의류 적재 완료 (물류팀용)
     * 
     * <p><b>200</b> - 의류 적재 완료
     * @param requestId  (required)
     * @return StorageRequestsRequestIdPickupPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StorageRequestsRequestIdPickupPut200Response storageRequestsRequestIdStorePut(String requestId) throws RestClientException {
        return storageRequestsRequestIdStorePutWithHttpInfo(requestId).getBody();
    }

    /**
     * 의류 적재 완료 (물류팀용)
     * 
     * <p><b>200</b> - 의류 적재 완료
     * @param requestId  (required)
     * @return ResponseEntity&lt;StorageRequestsRequestIdPickupPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StorageRequestsRequestIdPickupPut200Response> storageRequestsRequestIdStorePutWithHttpInfo(String requestId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'requestId' is set
        if (requestId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestId' when calling storageRequestsRequestIdStorePut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("requestId", requestId);

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

        ParameterizedTypeReference<StorageRequestsRequestIdPickupPut200Response> localReturnType = new ParameterizedTypeReference<StorageRequestsRequestIdPickupPut200Response>() {};
        return apiClient.invokeAPI("/storage-requests/{requestId}/store", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 회원가입
     * 핸드폰 번호, 주소, 비밀번호로 새로운 사용자 등록
     * <p><b>201</b> - User created successfully
     * <p><b>400</b> - Invalid input
     * @param usersPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void usersPost(UsersPostRequest usersPostRequest) throws RestClientException {
        usersPostWithHttpInfo(usersPostRequest);
    }

    /**
     * 회원가입
     * 핸드폰 번호, 주소, 비밀번호로 새로운 사용자 등록
     * <p><b>201</b> - User created successfully
     * <p><b>400</b> - Invalid input
     * @param usersPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> usersPostWithHttpInfo(UsersPostRequest usersPostRequest) throws RestClientException {
        Object localVarPostBody = usersPostRequest;
        
        // verify the required parameter 'usersPostRequest' is set
        if (usersPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'usersPostRequest' when calling usersPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

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
}
