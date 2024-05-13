package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.OneOf401ErrorInfo403ErrorInfo400ErrorInfo204ErrorInfo;
import org.openapitools.client.model.TokenInfo;
import org.openapitools.client.model.TokenPostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:20.016497294Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TokenApi {
    private ApiClient apiClient;

    public TokenApi() {
        this(new ApiClient());
    }

    public TokenApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Access 토큰을 발급 요청합니다. 
     * Access 토큰을 발급 요청합니다.   RCS Biz Center 웹에서 가입 시 등록한 ID(마스터 또는 매니저, 대행사)와 계정 가입 시 자동 생성되는 API Key(RCS Biz Center 내 계정관리에서 확인)를 이용하여 토큰 발급을 요청합니다.   response로 전달되는 expiresIn 시간이 초과하면 토큰을 새로 발급 받아야 합니다.              + **API 사용 Client의 IP는 RCS Biz Center에서 등록하여야 합니다.       Client IP 등록은 내 계정관리에서 ID별 최대 10개까지 등록할 수 있습니다.**             + **계정 권한 : 마스터, 매니저, 대행사** 
     * <p><b>200</b>
     * <p><b>0</b>
     * @param tokenPostRequest required: true  (optional)
     * @return TokenInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TokenInfo tokenPost(TokenPostRequest tokenPostRequest) throws RestClientException {
        return tokenPostWithHttpInfo(tokenPostRequest).getBody();
    }

    /**
     * Access 토큰을 발급 요청합니다. 
     * Access 토큰을 발급 요청합니다.   RCS Biz Center 웹에서 가입 시 등록한 ID(마스터 또는 매니저, 대행사)와 계정 가입 시 자동 생성되는 API Key(RCS Biz Center 내 계정관리에서 확인)를 이용하여 토큰 발급을 요청합니다.   response로 전달되는 expiresIn 시간이 초과하면 토큰을 새로 발급 받아야 합니다.              + **API 사용 Client의 IP는 RCS Biz Center에서 등록하여야 합니다.       Client IP 등록은 내 계정관리에서 ID별 최대 10개까지 등록할 수 있습니다.**             + **계정 권한 : 마스터, 매니저, 대행사** 
     * <p><b>200</b>
     * <p><b>0</b>
     * @param tokenPostRequest required: true  (optional)
     * @return ResponseEntity&lt;TokenInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TokenInfo> tokenPostWithHttpInfo(TokenPostRequest tokenPostRequest) throws RestClientException {
        Object localVarPostBody = tokenPostRequest;
        

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

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<TokenInfo> localReturnType = new ParameterizedTypeReference<TokenInfo>() {};
        return apiClient.invokeAPI("/token", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
