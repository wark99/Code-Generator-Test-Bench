package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AgencyAgencyIdAgencyKeyGet200Response;
import org.openapitools.client.model.BrandBrandIdChatbotChatbotIdCancelPut200Response;
import org.openapitools.client.model.OneOf401ErrorInfo403ErrorInfo400ErrorInfo204ErrorInfo;

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
public class SinceV119Api {
    private ApiClient apiClient;

    public SinceV119Api() {
        this(new ApiClient());
    }

    public SinceV119Api(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * RBC에서 발급된 최종 대행사 키를 조회합니다. 
     * RBC 에서 발급된 최종 대행사 키를 조회합니다.      + **계정 권한: 대행사**    대행사 키의 재발급, 삭제는 RBC 홈페이지에서만 가능합니다.   대행사 키 재발급 시,      + 이전 대행사 키는 재발급 후 24시간 동안 유효하며, 24시간 경과 후 자동 삭제됩니다.      + 대행사키의 유출이 우려되어 즉시 삭제를 원할 경우, RBC 웹사이트를 통해 직전 대행사키를 수동 삭제할 수 있습니다.       이 경우 신규 대행사키로만 메시지 전송이 성공되며, 직전 대행사키로 메시지 전송 시 실패됩니다.       ( 경로 : RBC대행사 계정 로그인 &gt; 내 계정관리 &gt; Agency Key ) 
     * <p><b>200</b> - 현재 대행사 키 정보를 응답합니다. 
     * <p><b>0</b>
     * @param agencyId RCS Biz Center에 등록된 대행사 ID 입니다. (required)
     * @return AgencyAgencyIdAgencyKeyGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AgencyAgencyIdAgencyKeyGet200Response agencyAgencyIdAgencyKeyGet(String agencyId) throws RestClientException {
        return agencyAgencyIdAgencyKeyGetWithHttpInfo(agencyId).getBody();
    }

    /**
     * RBC에서 발급된 최종 대행사 키를 조회합니다. 
     * RBC 에서 발급된 최종 대행사 키를 조회합니다.      + **계정 권한: 대행사**    대행사 키의 재발급, 삭제는 RBC 홈페이지에서만 가능합니다.   대행사 키 재발급 시,      + 이전 대행사 키는 재발급 후 24시간 동안 유효하며, 24시간 경과 후 자동 삭제됩니다.      + 대행사키의 유출이 우려되어 즉시 삭제를 원할 경우, RBC 웹사이트를 통해 직전 대행사키를 수동 삭제할 수 있습니다.       이 경우 신규 대행사키로만 메시지 전송이 성공되며, 직전 대행사키로 메시지 전송 시 실패됩니다.       ( 경로 : RBC대행사 계정 로그인 &gt; 내 계정관리 &gt; Agency Key ) 
     * <p><b>200</b> - 현재 대행사 키 정보를 응답합니다. 
     * <p><b>0</b>
     * @param agencyId RCS Biz Center에 등록된 대행사 ID 입니다. (required)
     * @return ResponseEntity&lt;AgencyAgencyIdAgencyKeyGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AgencyAgencyIdAgencyKeyGet200Response> agencyAgencyIdAgencyKeyGetWithHttpInfo(String agencyId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'agencyId' is set
        if (agencyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'agencyId' when calling agencyAgencyIdAgencyKeyGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("agencyId", agencyId);

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

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<AgencyAgencyIdAgencyKeyGet200Response> localReturnType = new ParameterizedTypeReference<AgencyAgencyIdAgencyKeyGet200Response>() {};
        return apiClient.invokeAPI("/agency/{agencyId}/agencyKey", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 지정된 대화방(발신번호, 양방향ID)의 승인요청을 취소합니다. 
     * 지정된 대화방(발신번호, 양방향ID)의 승인요청을 취소합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**    각 상태별 취소 요청 동작은 다음과 같습니다.            + **승인대기 : 저장 상태로 변경**             + **승인대기(수정) : 직전 승인 상태 및 데이터로 롤백**           + **반려(수정) : 직전 승인 상태 및 데이터로 롤백**     + **이외의 경우 에러 리턴** 
     * <p><b>200</b> - 대화방 승인요청이 정상적으로 취소된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdChatbotChatbotIdCancelPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdChatbotChatbotIdCancelPut200Response brandBrandIdChatbotChatbotIdCancelPut(String brandId, String chatbotId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdChatbotChatbotIdCancelPutWithHttpInfo(brandId, chatbotId, xRCSBrandkey).getBody();
    }

    /**
     * 지정된 대화방(발신번호, 양방향ID)의 승인요청을 취소합니다. 
     * 지정된 대화방(발신번호, 양방향ID)의 승인요청을 취소합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**    각 상태별 취소 요청 동작은 다음과 같습니다.            + **승인대기 : 저장 상태로 변경**             + **승인대기(수정) : 직전 승인 상태 및 데이터로 롤백**           + **반려(수정) : 직전 승인 상태 및 데이터로 롤백**     + **이외의 경우 에러 리턴** 
     * <p><b>200</b> - 대화방 승인요청이 정상적으로 취소된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdChatbotChatbotIdCancelPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdChatbotChatbotIdCancelPut200Response> brandBrandIdChatbotChatbotIdCancelPutWithHttpInfo(String brandId, String chatbotId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdChatbotChatbotIdCancelPut");
        }
        
        // verify the required parameter 'chatbotId' is set
        if (chatbotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chatbotId' when calling brandBrandIdChatbotChatbotIdCancelPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);
        uriVariables.put("chatbotId", chatbotId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xRCSBrandkey != null)
        localVarHeaderParams.add("X-RCS-Brandkey", apiClient.parameterToString(xRCSBrandkey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<BrandBrandIdChatbotChatbotIdCancelPut200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdChatbotChatbotIdCancelPut200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/chatbot/{chatbotId}/cancel", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
