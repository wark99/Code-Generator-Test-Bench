package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BrandBrandIdMessagebaseMessagebaseIdGet200Response;
import org.openapitools.client.model.BrandBrandIdMessagebaseMessagebaseIdPut200Response;
import org.openapitools.client.model.BrandBrandIdMessagebasePost200Response;
import org.openapitools.client.model.BrandBrandIdMessagebasePostRequest;
import org.openapitools.client.model.BrandBrandIdV2MessagebaseFilePost200Response;
import org.openapitools.client.model.MessagebaseCommonGet200Response;
import org.openapitools.client.model.MessagebaseCommonMessagebaseIdGet200Response;
import org.openapitools.client.model.MessagebaseMessagebaseformGet200Response;
import org.openapitools.client.model.MessagebaseMessagebaseformMessagebaseformIdGet200Response;
import org.openapitools.client.model.MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response;
import org.openapitools.client.model.ModTemplateInfo;
import org.openapitools.client.model.OneOf401ErrorInfo403ErrorInfo400ErrorInfo204ErrorInfo;
import org.openapitools.client.model.RegMessagebaseInfo;
import org.openapitools.client.model.RegTemplateInfo;

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
public class MessagebaseApi {
    private ApiClient apiClient;

    public MessagebaseApi() {
        this(new ApiClient());
    }

    public MessagebaseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 브랜드에 등록된 템플릿을 조회합니다. 
     * 브랜드에 등록된 템플릿을 조회합니다.   템플릿 별 승인 상태를 확인할 수 있습니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿** 
     * <p><b>200</b> - 브랜드에 등록된 템플릿 ID 목록이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return MessagebaseCommonGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MessagebaseCommonGet200Response brandBrandIdMessagebaseGet(String brandId, String xRCSBrandkey, Integer offset, Integer limit) throws RestClientException {
        return brandBrandIdMessagebaseGetWithHttpInfo(brandId, xRCSBrandkey, offset, limit).getBody();
    }

    /**
     * 브랜드에 등록된 템플릿을 조회합니다. 
     * 브랜드에 등록된 템플릿을 조회합니다.   템플릿 별 승인 상태를 확인할 수 있습니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿** 
     * <p><b>200</b> - 브랜드에 등록된 템플릿 ID 목록이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return ResponseEntity&lt;MessagebaseCommonGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MessagebaseCommonGet200Response> brandBrandIdMessagebaseGetWithHttpInfo(String brandId, String xRCSBrandkey, Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdMessagebaseGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        

        if (xRCSBrandkey != null)
        localVarHeaderParams.add("X-RCS-Brandkey", apiClient.parameterToString(xRCSBrandkey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<MessagebaseCommonGet200Response> localReturnType = new ParameterizedTypeReference<MessagebaseCommonGet200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/messagebase", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 지정된 템플릿의 승인요청을 취소합니다. 
     * 지정된 템플릿의 승인요청을 취소합니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿**  각 상태별 취소 요청 동작은 다음과 같습니다.      + **승인대기 : 저장 상태로 변경**             + **승인대기(수정) : 직전 승인 상태 및 데이터로 롤백**   + **반려(수정) : 직전 승인 상태 및 데이터로 롤백**   + **이외의 경우 에러 리턴** 
     * <p><b>200</b> - 템플릿 승인요청이 정상적으로 취소된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param messagebaseId 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdMessagebaseMessagebaseIdPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdMessagebaseMessagebaseIdPut200Response brandBrandIdMessagebaseMessagebaseIdCancelPut(String brandId, String messagebaseId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdMessagebaseMessagebaseIdCancelPutWithHttpInfo(brandId, messagebaseId, xRCSBrandkey).getBody();
    }

    /**
     * 지정된 템플릿의 승인요청을 취소합니다. 
     * 지정된 템플릿의 승인요청을 취소합니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿**  각 상태별 취소 요청 동작은 다음과 같습니다.      + **승인대기 : 저장 상태로 변경**             + **승인대기(수정) : 직전 승인 상태 및 데이터로 롤백**   + **반려(수정) : 직전 승인 상태 및 데이터로 롤백**   + **이외의 경우 에러 리턴** 
     * <p><b>200</b> - 템플릿 승인요청이 정상적으로 취소된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param messagebaseId 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdMessagebaseMessagebaseIdPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdMessagebaseMessagebaseIdPut200Response> brandBrandIdMessagebaseMessagebaseIdCancelPutWithHttpInfo(String brandId, String messagebaseId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdMessagebaseMessagebaseIdCancelPut");
        }
        
        // verify the required parameter 'messagebaseId' is set
        if (messagebaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'messagebaseId' when calling brandBrandIdMessagebaseMessagebaseIdCancelPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);
        uriVariables.put("messagebaseId", messagebaseId);

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

        ParameterizedTypeReference<BrandBrandIdMessagebaseMessagebaseIdPut200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdMessagebaseMessagebaseIdPut200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/messagebase/{messagebaseId}/cancel", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드 내 지정된 템플릿을 삭제합니다. 
     * 브랜드 내 지정된 템플릿을 삭제합니다.   템플릿의 삭제는 상태에 따라 처리 여부가 결정됩니다.   한번 삭제된 템플릿은 복원이 불가능하며 동일한 ID로 생성할 수 없습니다.    + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿**   + **삭제 가능 상태 : 저장, 반려, 반려(수정), 승인** 
     * <p><b>200</b> - 템플릿이 성공적으로 삭제되었을 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param messagebaseId 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdMessagebaseMessagebaseIdPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdMessagebaseMessagebaseIdPut200Response brandBrandIdMessagebaseMessagebaseIdDelete(String brandId, String messagebaseId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdMessagebaseMessagebaseIdDeleteWithHttpInfo(brandId, messagebaseId, xRCSBrandkey).getBody();
    }

    /**
     * 브랜드 내 지정된 템플릿을 삭제합니다. 
     * 브랜드 내 지정된 템플릿을 삭제합니다.   템플릿의 삭제는 상태에 따라 처리 여부가 결정됩니다.   한번 삭제된 템플릿은 복원이 불가능하며 동일한 ID로 생성할 수 없습니다.    + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿**   + **삭제 가능 상태 : 저장, 반려, 반려(수정), 승인** 
     * <p><b>200</b> - 템플릿이 성공적으로 삭제되었을 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param messagebaseId 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdMessagebaseMessagebaseIdPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdMessagebaseMessagebaseIdPut200Response> brandBrandIdMessagebaseMessagebaseIdDeleteWithHttpInfo(String brandId, String messagebaseId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdMessagebaseMessagebaseIdDelete");
        }
        
        // verify the required parameter 'messagebaseId' is set
        if (messagebaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'messagebaseId' when calling brandBrandIdMessagebaseMessagebaseIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);
        uriVariables.put("messagebaseId", messagebaseId);

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

        ParameterizedTypeReference<BrandBrandIdMessagebaseMessagebaseIdPut200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdMessagebaseMessagebaseIdPut200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/messagebase/{messagebaseId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드에 등록된 지정 템플릿 상세 내역을 조회합니다. 
     * 브랜드에 등록된 지정 템플릿 상세 내역을 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿** 
     * <p><b>200</b> - 해당 템플릿의 상세 내역이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param messagebaseId 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdMessagebaseMessagebaseIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdMessagebaseMessagebaseIdGet200Response brandBrandIdMessagebaseMessagebaseIdGet(String brandId, String messagebaseId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdMessagebaseMessagebaseIdGetWithHttpInfo(brandId, messagebaseId, xRCSBrandkey).getBody();
    }

    /**
     * 브랜드에 등록된 지정 템플릿 상세 내역을 조회합니다. 
     * 브랜드에 등록된 지정 템플릿 상세 내역을 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿** 
     * <p><b>200</b> - 해당 템플릿의 상세 내역이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param messagebaseId 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdMessagebaseMessagebaseIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdMessagebaseMessagebaseIdGet200Response> brandBrandIdMessagebaseMessagebaseIdGetWithHttpInfo(String brandId, String messagebaseId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdMessagebaseMessagebaseIdGet");
        }
        
        // verify the required parameter 'messagebaseId' is set
        if (messagebaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'messagebaseId' when calling brandBrandIdMessagebaseMessagebaseIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);
        uriVariables.put("messagebaseId", messagebaseId);

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

        ParameterizedTypeReference<BrandBrandIdMessagebaseMessagebaseIdGet200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdMessagebaseMessagebaseIdGet200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/messagebase/{messagebaseId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 지정 템플릿을 업데이트 합니다. 
     * 지정 템플릿을 업데이트 합니다.   템플릿의 업데이트는 승인상태에 따라 처리 여부가 결정됩니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형)**   + **수정 가능 상태 : 저장, 반려, 반려(수정), 승인** 
     * <p><b>200</b> - 템플릿이 정상적으로 등록된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param messagebaseId 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param regMessagebaseInfo  (optional)
     * @return BrandBrandIdMessagebaseMessagebaseIdPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdMessagebaseMessagebaseIdPut200Response brandBrandIdMessagebaseMessagebaseIdPut(String brandId, String messagebaseId, String xRCSBrandkey, RegMessagebaseInfo regMessagebaseInfo) throws RestClientException {
        return brandBrandIdMessagebaseMessagebaseIdPutWithHttpInfo(brandId, messagebaseId, xRCSBrandkey, regMessagebaseInfo).getBody();
    }

    /**
     * 지정 템플릿을 업데이트 합니다. 
     * 지정 템플릿을 업데이트 합니다.   템플릿의 업데이트는 승인상태에 따라 처리 여부가 결정됩니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형)**   + **수정 가능 상태 : 저장, 반려, 반려(수정), 승인** 
     * <p><b>200</b> - 템플릿이 정상적으로 등록된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param messagebaseId 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param regMessagebaseInfo  (optional)
     * @return ResponseEntity&lt;BrandBrandIdMessagebaseMessagebaseIdPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdMessagebaseMessagebaseIdPut200Response> brandBrandIdMessagebaseMessagebaseIdPutWithHttpInfo(String brandId, String messagebaseId, String xRCSBrandkey, RegMessagebaseInfo regMessagebaseInfo) throws RestClientException {
        Object localVarPostBody = regMessagebaseInfo;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdMessagebaseMessagebaseIdPut");
        }
        
        // verify the required parameter 'messagebaseId' is set
        if (messagebaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'messagebaseId' when calling brandBrandIdMessagebaseMessagebaseIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);
        uriVariables.put("messagebaseId", messagebaseId);

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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<BrandBrandIdMessagebaseMessagebaseIdPut200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdMessagebaseMessagebaseIdPut200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/messagebase/{messagebaseId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드 내에서 사용할 구형 텍스트 템플릿을 등록합니다. 추가된 신규 템플릿 유형은 POST /brand/{brandId}/v2/messagebase 을 이용해야 합니다. 
     * 브랜드 내에서 사용할 텍스트 템플릿을 등록합니다.   등록된 템플릿은 RCS Biz Center 운영자의 승인 후 사용 가능합니다.   템플릿 등록 시 사용되는 messagebaseformId의 formattedString을 이용하여 템플릿의 formattedString을 등록해야 합니다. 추가된 신규 템플릿 유형은 POST /brand/{brandId}/v2/messagebase 을 이용해야 합니다.   **[템플릿 등록을 위한 formattedString 처리 방법]**      1. messagebaseform 리스트 조회      2. 템플릿 생성 시 사용하고자 하는 messagebaseformId 상세 조회를 통해 formattedString 확인(messagebaseform의 formattedString은 수시 업데이트 될 수 있음)        3. Messagebaseform formattedString 의 각 widget Object 의 widgetPolicy.allowedAttributes 에 지정된 key의 value만 수정할 수 있음(이외 수정 시 오류)        4. Cell의 경우, ROOT.regMessagebases[0].formattedString.RCSMessage.openrichcardMessage.layout.children[1].children 내 object 단위 제거 할 수 있음       단, 1개 이상의 Object(LinearLayout)는 존재해야 함        5. Cell의 경우, ROOT.regMessagebases[0].formattedString.RCSMessage.openrichcardMessage.layout.children[1].children[n].children 내 Object(TextView) 2개 중 1개는 삭제 가능함         6. 타이틀 자유형(구 테마 강조형A) 제목 좌측 영역은 고정문자열 8자까지 허용(변수 사용 불가)        7. 타이틀 자유형(구 테마 강조형A) 제목 우측 영역에 해당하는 ROOT.formattedString.RCSMessage.openrichcardMessage.layout.children[0].children[0].children[1] 삭제 가능        8. 타이틀 자유형(구 테마 강조형A) 제목 우측 영역에 해당하는 ROOT.formattedString.RCSMessage.openrichcardMessage.layout.children[0].children[0].children[1].text 값(value)은 템플릿 내 정의된 변수만 입력 가능(예시 참조)      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형)** 
     * <p><b>200</b> - 템플릿이 정상적으로 등록된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param brandBrandIdMessagebasePostRequest  (optional)
     * @return BrandBrandIdMessagebasePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdMessagebasePost200Response brandBrandIdMessagebasePost(String brandId, String xRCSBrandkey, BrandBrandIdMessagebasePostRequest brandBrandIdMessagebasePostRequest) throws RestClientException {
        return brandBrandIdMessagebasePostWithHttpInfo(brandId, xRCSBrandkey, brandBrandIdMessagebasePostRequest).getBody();
    }

    /**
     * 브랜드 내에서 사용할 구형 텍스트 템플릿을 등록합니다. 추가된 신규 템플릿 유형은 POST /brand/{brandId}/v2/messagebase 을 이용해야 합니다. 
     * 브랜드 내에서 사용할 텍스트 템플릿을 등록합니다.   등록된 템플릿은 RCS Biz Center 운영자의 승인 후 사용 가능합니다.   템플릿 등록 시 사용되는 messagebaseformId의 formattedString을 이용하여 템플릿의 formattedString을 등록해야 합니다. 추가된 신규 템플릿 유형은 POST /brand/{brandId}/v2/messagebase 을 이용해야 합니다.   **[템플릿 등록을 위한 formattedString 처리 방법]**      1. messagebaseform 리스트 조회      2. 템플릿 생성 시 사용하고자 하는 messagebaseformId 상세 조회를 통해 formattedString 확인(messagebaseform의 formattedString은 수시 업데이트 될 수 있음)        3. Messagebaseform formattedString 의 각 widget Object 의 widgetPolicy.allowedAttributes 에 지정된 key의 value만 수정할 수 있음(이외 수정 시 오류)        4. Cell의 경우, ROOT.regMessagebases[0].formattedString.RCSMessage.openrichcardMessage.layout.children[1].children 내 object 단위 제거 할 수 있음       단, 1개 이상의 Object(LinearLayout)는 존재해야 함        5. Cell의 경우, ROOT.regMessagebases[0].formattedString.RCSMessage.openrichcardMessage.layout.children[1].children[n].children 내 Object(TextView) 2개 중 1개는 삭제 가능함         6. 타이틀 자유형(구 테마 강조형A) 제목 좌측 영역은 고정문자열 8자까지 허용(변수 사용 불가)        7. 타이틀 자유형(구 테마 강조형A) 제목 우측 영역에 해당하는 ROOT.formattedString.RCSMessage.openrichcardMessage.layout.children[0].children[0].children[1] 삭제 가능        8. 타이틀 자유형(구 테마 강조형A) 제목 우측 영역에 해당하는 ROOT.formattedString.RCSMessage.openrichcardMessage.layout.children[0].children[0].children[1].text 값(value)은 템플릿 내 정의된 변수만 입력 가능(예시 참조)      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형)** 
     * <p><b>200</b> - 템플릿이 정상적으로 등록된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param brandBrandIdMessagebasePostRequest  (optional)
     * @return ResponseEntity&lt;BrandBrandIdMessagebasePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdMessagebasePost200Response> brandBrandIdMessagebasePostWithHttpInfo(String brandId, String xRCSBrandkey, BrandBrandIdMessagebasePostRequest brandBrandIdMessagebasePostRequest) throws RestClientException {
        Object localVarPostBody = brandBrandIdMessagebasePostRequest;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdMessagebasePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);

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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<BrandBrandIdMessagebasePost200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdMessagebasePost200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/messagebase", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 이미지 템플릿 용으로 등록한 이미지 파일 정보를 조회 합니다. 
     * 이미지 템플릿 용으로 등록한 이미지 파일 정보를 조회 합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**     + **지원 범위: 이미지 템플릿, LMS 템플릿**   
     * <p><b>200</b> - 조회 결과가 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param fileId 파일ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdV2MessagebaseFilePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdV2MessagebaseFilePost200Response brandBrandIdV2MessagebaseFileFileIdGet(String brandId, String fileId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdV2MessagebaseFileFileIdGetWithHttpInfo(brandId, fileId, xRCSBrandkey).getBody();
    }

    /**
     * 이미지 템플릿 용으로 등록한 이미지 파일 정보를 조회 합니다. 
     * 이미지 템플릿 용으로 등록한 이미지 파일 정보를 조회 합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**     + **지원 범위: 이미지 템플릿, LMS 템플릿**   
     * <p><b>200</b> - 조회 결과가 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param fileId 파일ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdV2MessagebaseFilePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdV2MessagebaseFilePost200Response> brandBrandIdV2MessagebaseFileFileIdGetWithHttpInfo(String brandId, String fileId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdV2MessagebaseFileFileIdGet");
        }
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling brandBrandIdV2MessagebaseFileFileIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);
        uriVariables.put("fileId", fileId);

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

        ParameterizedTypeReference<BrandBrandIdV2MessagebaseFilePost200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdV2MessagebaseFilePost200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/v2/messagebase/file/{fileId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 이미지 템플릿에서 사용할 이미지 파일을 등록합니다. 
     * 이미지 템플릿에서 사용할 이미지 파일을 등록합니다.   파일을 먼저 등록해야 이미지 템플릿 등록 시 file Id를 템플릿 내 지정할 수 있습니다.    + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**     + **지원 범위: 이미지 템플릿, LMS 템플릿**   
     * <p><b>200</b> - 성공적으로 등록되었을 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param _file 이미지 템플릿에 사용할 이미지 파일입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdV2MessagebaseFilePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdV2MessagebaseFilePost200Response brandBrandIdV2MessagebaseFilePost(String brandId, Object _file, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdV2MessagebaseFilePostWithHttpInfo(brandId, _file, xRCSBrandkey).getBody();
    }

    /**
     * 이미지 템플릿에서 사용할 이미지 파일을 등록합니다. 
     * 이미지 템플릿에서 사용할 이미지 파일을 등록합니다.   파일을 먼저 등록해야 이미지 템플릿 등록 시 file Id를 템플릿 내 지정할 수 있습니다.    + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**     + **지원 범위: 이미지 템플릿, LMS 템플릿**   
     * <p><b>200</b> - 성공적으로 등록되었을 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param _file 이미지 템플릿에 사용할 이미지 파일입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdV2MessagebaseFilePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdV2MessagebaseFilePost200Response> brandBrandIdV2MessagebaseFilePostWithHttpInfo(String brandId, Object _file, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdV2MessagebaseFilePost");
        }
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '_file' when calling brandBrandIdV2MessagebaseFilePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xRCSBrandkey != null)
        localVarHeaderParams.add("X-RCS-Brandkey", apiClient.parameterToString(xRCSBrandkey));

        if (_file != null)
            localVarFormParams.add("file", _file);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<BrandBrandIdV2MessagebaseFilePost200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdV2MessagebaseFilePost200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/v2/messagebase/file", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 이미 등록된 템플릿의 내용을 수정합니다. 
     * 이미 등록된 템플릿의 내용을 수정합니다. messagebase의 ID를 유지하면서 내용을 변경하고자 하는 경우 사용이 가능합니다. 수정 등록된 템플릿은 RCS Biz Center 운영자의 승인이 필요합니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿** 
     * <p><b>200</b> - 템플릿이 정상적으로 수정된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param messagebaseId 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param modTemplateInfo  (optional)
     * @return BrandBrandIdMessagebasePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdMessagebasePost200Response brandBrandIdV2MessagebaseMessagebaseIdPut(String brandId, String messagebaseId, String xRCSBrandkey, ModTemplateInfo modTemplateInfo) throws RestClientException {
        return brandBrandIdV2MessagebaseMessagebaseIdPutWithHttpInfo(brandId, messagebaseId, xRCSBrandkey, modTemplateInfo).getBody();
    }

    /**
     * 이미 등록된 템플릿의 내용을 수정합니다. 
     * 이미 등록된 템플릿의 내용을 수정합니다. messagebase의 ID를 유지하면서 내용을 변경하고자 하는 경우 사용이 가능합니다. 수정 등록된 템플릿은 RCS Biz Center 운영자의 승인이 필요합니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿** 
     * <p><b>200</b> - 템플릿이 정상적으로 수정된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param messagebaseId 브랜드 내 템플릿 정보 접근시 사용되는 템플릿ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param modTemplateInfo  (optional)
     * @return ResponseEntity&lt;BrandBrandIdMessagebasePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdMessagebasePost200Response> brandBrandIdV2MessagebaseMessagebaseIdPutWithHttpInfo(String brandId, String messagebaseId, String xRCSBrandkey, ModTemplateInfo modTemplateInfo) throws RestClientException {
        Object localVarPostBody = modTemplateInfo;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdV2MessagebaseMessagebaseIdPut");
        }
        
        // verify the required parameter 'messagebaseId' is set
        if (messagebaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'messagebaseId' when calling brandBrandIdV2MessagebaseMessagebaseIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);
        uriVariables.put("messagebaseId", messagebaseId);

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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<BrandBrandIdMessagebasePost200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdMessagebasePost200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/v2/messagebase/{messagebaseId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드 내에서 사용할 템플릿을 등록합니다.   Openrichcard 규격의 모든 템플릿 등록이 가능합니다. 
     * 브랜드 내에서 사용할 템플릿을 등록합니다.   모든 템플릿 등록이 가능하며,   템플릿 등록 시 사용되는 messagebaseformId의 params의 각 항목 중 템플릿에 표시될 내용을 입력하여 원하는 템플릿을 등록할 수 있습니다. 등록된 템플릿은 RCS Biz Center 운영자의 승인이 필요합니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿** 
     * <p><b>200</b> - 템플릿이 정상적으로 등록된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.             (optional)
     * @param regTemplateInfo  (optional)
     * @return BrandBrandIdMessagebasePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdMessagebasePost200Response brandBrandIdV2MessagebasePost(String brandId, String xRCSBrandkey, RegTemplateInfo regTemplateInfo) throws RestClientException {
        return brandBrandIdV2MessagebasePostWithHttpInfo(brandId, xRCSBrandkey, regTemplateInfo).getBody();
    }

    /**
     * 브랜드 내에서 사용할 템플릿을 등록합니다.   Openrichcard 규격의 모든 템플릿 등록이 가능합니다. 
     * 브랜드 내에서 사용할 템플릿을 등록합니다.   모든 템플릿 등록이 가능하며,   템플릿 등록 시 사용되는 messagebaseformId의 params의 각 항목 중 템플릿에 표시될 내용을 입력하여 원하는 템플릿을 등록할 수 있습니다. 등록된 템플릿은 RCS Biz Center 운영자의 승인이 필요합니다.      + **계정 권한: 마스터, 매니저, 대행사**   + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **지원 범위: 텍스트 템플릿(타이틀 선택형 / 타이틀 자유형), 이미지 템플릿, LMS 템플릿** 
     * <p><b>200</b> - 템플릿이 정상적으로 등록된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.             (optional)
     * @param regTemplateInfo  (optional)
     * @return ResponseEntity&lt;BrandBrandIdMessagebasePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdMessagebasePost200Response> brandBrandIdV2MessagebasePostWithHttpInfo(String brandId, String xRCSBrandkey, RegTemplateInfo regTemplateInfo) throws RestClientException {
        Object localVarPostBody = regTemplateInfo;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdV2MessagebasePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);

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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<BrandBrandIdMessagebasePost200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdMessagebasePost200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/v2/messagebase", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 이통사가 기본 제공하는 공통템플릿을 조회합니다. 
     * 이통사가 기본 제공하는 공통템플릿을 조회합니다.   공통템플릿은 SMS, LMS, MMS와 양방향 대화방용 CHAT 상품으로 구성되어 있습니다.      + **계정 권한 : 마스터, 매니저, 대행사** 
     * <p><b>200</b> - 공통템플릿 목록을 응답합니다. 
     * <p><b>0</b>
     * @param productCode 리치카드 메시지 유형 구분값 입니다. (optional)
     * @param cardType MMS에서 제공되는 메시지 카드 형태 구분값 입니다. (optional)
     * @param bizService 현재 공통템플릿은 유형별 제공되는 항목이 없으므로 본 파라미터는 사용되지 않습니다.  (optional)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return MessagebaseCommonGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MessagebaseCommonGet200Response messagebaseCommonGet(String productCode, String cardType, String bizService, Integer offset, Integer limit) throws RestClientException {
        return messagebaseCommonGetWithHttpInfo(productCode, cardType, bizService, offset, limit).getBody();
    }

    /**
     * 이통사가 기본 제공하는 공통템플릿을 조회합니다. 
     * 이통사가 기본 제공하는 공통템플릿을 조회합니다.   공통템플릿은 SMS, LMS, MMS와 양방향 대화방용 CHAT 상품으로 구성되어 있습니다.      + **계정 권한 : 마스터, 매니저, 대행사** 
     * <p><b>200</b> - 공통템플릿 목록을 응답합니다. 
     * <p><b>0</b>
     * @param productCode 리치카드 메시지 유형 구분값 입니다. (optional)
     * @param cardType MMS에서 제공되는 메시지 카드 형태 구분값 입니다. (optional)
     * @param bizService 현재 공통템플릿은 유형별 제공되는 항목이 없으므로 본 파라미터는 사용되지 않습니다.  (optional)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return ResponseEntity&lt;MessagebaseCommonGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MessagebaseCommonGet200Response> messagebaseCommonGetWithHttpInfo(String productCode, String cardType, String bizService, Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "productCode", productCode));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "cardType", cardType));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "bizService", bizService));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<MessagebaseCommonGet200Response> localReturnType = new ParameterizedTypeReference<MessagebaseCommonGet200Response>() {};
        return apiClient.invokeAPI("/messagebase/common", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 이통사가 기본 제공하는 공통템플릿 별 상세 내용을 조회합니다. 
     * 이통사가 기본 제공하는 공통템플릿 별 상세 내용을 조회합니다.   상품별 SMS, LMS, MMS, CHAT용 세부 정보를 조회할 수 있습니다.      + **계정 권한: 마스터, 매니저, 대행사** 
     * <p><b>200</b> - 공통템플릿 상세 내용을 응답합니다. 
     * <p><b>0</b>
     * @param messagebaseId  (required)
     * @return MessagebaseCommonMessagebaseIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MessagebaseCommonMessagebaseIdGet200Response messagebaseCommonMessagebaseIdGet(String messagebaseId) throws RestClientException {
        return messagebaseCommonMessagebaseIdGetWithHttpInfo(messagebaseId).getBody();
    }

    /**
     * 이통사가 기본 제공하는 공통템플릿 별 상세 내용을 조회합니다. 
     * 이통사가 기본 제공하는 공통템플릿 별 상세 내용을 조회합니다.   상품별 SMS, LMS, MMS, CHAT용 세부 정보를 조회할 수 있습니다.      + **계정 권한: 마스터, 매니저, 대행사** 
     * <p><b>200</b> - 공통템플릿 상세 내용을 응답합니다. 
     * <p><b>0</b>
     * @param messagebaseId  (required)
     * @return ResponseEntity&lt;MessagebaseCommonMessagebaseIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MessagebaseCommonMessagebaseIdGet200Response> messagebaseCommonMessagebaseIdGetWithHttpInfo(String messagebaseId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'messagebaseId' is set
        if (messagebaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'messagebaseId' when calling messagebaseCommonMessagebaseIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("messagebaseId", messagebaseId);

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

        ParameterizedTypeReference<MessagebaseCommonMessagebaseIdGet200Response> localReturnType = new ParameterizedTypeReference<MessagebaseCommonMessagebaseIdGet200Response>() {};
        return apiClient.invokeAPI("/messagebase/common/{messagebaseId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 템플릿 양식 목록을 조회합니다. 
     * 템플릿 양식 목록을 조회합니다.   템플릿 작성이 필요한 경우 조회된 템플릿 양식 ID를 이용하여 템플릿 양식 세부정보를 조회합니다.      + **계정 권한 : 마스터, 매니저, 대행사** 
     * <p><b>200</b> - 템플릿 양식 목록을 응답합니다. 
     * <p><b>0</b>
     * @param cardType  (optional)
     * @param bizCondition  (optional)
     * @param bizCategory  (optional)
     * @param bizService  (optional)
     * @param offset 시작 offset 번호(default: 0) (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) (optional)
     * @return MessagebaseMessagebaseformGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MessagebaseMessagebaseformGet200Response messagebaseMessagebaseformGet(String cardType, String bizCondition, String bizCategory, String bizService, Integer offset, Integer limit) throws RestClientException {
        return messagebaseMessagebaseformGetWithHttpInfo(cardType, bizCondition, bizCategory, bizService, offset, limit).getBody();
    }

    /**
     * 템플릿 양식 목록을 조회합니다. 
     * 템플릿 양식 목록을 조회합니다.   템플릿 작성이 필요한 경우 조회된 템플릿 양식 ID를 이용하여 템플릿 양식 세부정보를 조회합니다.      + **계정 권한 : 마스터, 매니저, 대행사** 
     * <p><b>200</b> - 템플릿 양식 목록을 응답합니다. 
     * <p><b>0</b>
     * @param cardType  (optional)
     * @param bizCondition  (optional)
     * @param bizCategory  (optional)
     * @param bizService  (optional)
     * @param offset 시작 offset 번호(default: 0) (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) (optional)
     * @return ResponseEntity&lt;MessagebaseMessagebaseformGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MessagebaseMessagebaseformGet200Response> messagebaseMessagebaseformGetWithHttpInfo(String cardType, String bizCondition, String bizCategory, String bizService, Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "cardType", cardType));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "bizCondition", bizCondition));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "bizCategory", bizCategory));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "bizService", bizService));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<MessagebaseMessagebaseformGet200Response> localReturnType = new ParameterizedTypeReference<MessagebaseMessagebaseformGet200Response>() {};
        return apiClient.invokeAPI("/messagebase/messagebaseform", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 템플릿 유형의 상세 내용을 조회합니다. 
     * 템플릿 유형의 상세 내용을 조회합니다.   formattedString을 이용하여 원하는 브랜드용 템플릿을 작성할 수 있습니다.   + **계정 권한 : 마스터, 매니저, 대행사** 
     * <p><b>200</b> - 템플릿 유형 상세 내용을 응답합니다. 
     * <p><b>0</b>
     * @param messagebaseformId  (required)
     * @return MessagebaseMessagebaseformMessagebaseformIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MessagebaseMessagebaseformMessagebaseformIdGet200Response messagebaseMessagebaseformMessagebaseformIdGet(String messagebaseformId) throws RestClientException {
        return messagebaseMessagebaseformMessagebaseformIdGetWithHttpInfo(messagebaseformId).getBody();
    }

    /**
     * 템플릿 유형의 상세 내용을 조회합니다. 
     * 템플릿 유형의 상세 내용을 조회합니다.   formattedString을 이용하여 원하는 브랜드용 템플릿을 작성할 수 있습니다.   + **계정 권한 : 마스터, 매니저, 대행사** 
     * <p><b>200</b> - 템플릿 유형 상세 내용을 응답합니다. 
     * <p><b>0</b>
     * @param messagebaseformId  (required)
     * @return ResponseEntity&lt;MessagebaseMessagebaseformMessagebaseformIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MessagebaseMessagebaseformMessagebaseformIdGet200Response> messagebaseMessagebaseformMessagebaseformIdGetWithHttpInfo(String messagebaseformId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'messagebaseformId' is set
        if (messagebaseformId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'messagebaseformId' when calling messagebaseMessagebaseformMessagebaseformIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("messagebaseformId", messagebaseformId);

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

        ParameterizedTypeReference<MessagebaseMessagebaseformMessagebaseformIdGet200Response> localReturnType = new ParameterizedTypeReference<MessagebaseMessagebaseformMessagebaseformIdGet200Response>() {};
        return apiClient.invokeAPI("/messagebase/messagebaseform/{messagebaseformId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * RBC에서 템플릿용으로 제공되는 기본 로고 이미지 정보를 조회합니다. 
     * RBC에서 템플릿용으로 제공되는 기본 로고 이미지 정보를 조회합니다.   조회된 이미지 파일 ID를 템플릿 등록 시 사용할 수 있습니다.      + **계정 권한 : 마스터, 매니저, 대행사** 
     * <p><b>200</b> - 템플릿 유형 별 제공되는 기본 로고 이미지 리스트를 응답합니다. 
     * <p><b>0</b>
     * @param messagebaseformId  (required)
     * @return MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response messagebaseMessagebaseformMessagebaseformIdLogoGet(String messagebaseformId) throws RestClientException {
        return messagebaseMessagebaseformMessagebaseformIdLogoGetWithHttpInfo(messagebaseformId).getBody();
    }

    /**
     * RBC에서 템플릿용으로 제공되는 기본 로고 이미지 정보를 조회합니다. 
     * RBC에서 템플릿용으로 제공되는 기본 로고 이미지 정보를 조회합니다.   조회된 이미지 파일 ID를 템플릿 등록 시 사용할 수 있습니다.      + **계정 권한 : 마스터, 매니저, 대행사** 
     * <p><b>200</b> - 템플릿 유형 별 제공되는 기본 로고 이미지 리스트를 응답합니다. 
     * <p><b>0</b>
     * @param messagebaseformId  (required)
     * @return ResponseEntity&lt;MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response> messagebaseMessagebaseformMessagebaseformIdLogoGetWithHttpInfo(String messagebaseformId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'messagebaseformId' is set
        if (messagebaseformId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'messagebaseformId' when calling messagebaseMessagebaseformMessagebaseformIdLogoGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("messagebaseformId", messagebaseformId);

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

        ParameterizedTypeReference<MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response> localReturnType = new ParameterizedTypeReference<MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response>() {};
        return apiClient.invokeAPI("/messagebase/messagebaseform/{messagebaseformId}/logo", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
