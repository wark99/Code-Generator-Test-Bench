package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.OneOf401ErrorInfo403ErrorInfo400ErrorInfo204ErrorInfo;
import org.openapitools.client.model.StatQueryMessageBrandIdGet200Response;
import org.openapitools.client.model.StatQueryMessageButtonBrandIdGet200Response;
import org.openapitools.client.model.StatQueryPersistentMenuBrandIdGet200Response;

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
public class SinceV116Api {
    private ApiClient apiClient;

    public SinceV116Api() {
        this(new ApiClient());
    }

    public SinceV116Api(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 고객반응 통계 - 캠페인 메시지 발송/읽음확인 통계를 조회합니다. 
     * 고객반응 통계 - 캠페인 메시지 발송/읽음확인 통계를 조회합니다.    - 동일 Group ID에 발송일 기준 3일간 (D+3) 집계됩니다. 단, 이통사별 발송 성공건수 100건 이상인 경우에 한해 집계됩니다.     - 통계 조회 기간은 데이터 존재 시 최근 1년 6개월 이내 기간 중 최대 31일까지 검색 가능합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  
     * <p><b>200</b> - 성공적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param startDate 통계 조회 기간 시작일자(yyyymmdd) 입니다. (required)
     * @param endDate 통계 조회 기간 종료일자(yyyymmdd) 입니다. (required)
     * @param groupId 발송 캠페인 구분 ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param chatbotId 대화방ID 입니다. (optional)
     * @return StatQueryMessageBrandIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatQueryMessageBrandIdGet200Response statQueryMessageBrandIdGet(String brandId, String startDate, String endDate, String groupId, String xRCSBrandkey, String chatbotId) throws RestClientException {
        return statQueryMessageBrandIdGetWithHttpInfo(brandId, startDate, endDate, groupId, xRCSBrandkey, chatbotId).getBody();
    }

    /**
     * 고객반응 통계 - 캠페인 메시지 발송/읽음확인 통계를 조회합니다. 
     * 고객반응 통계 - 캠페인 메시지 발송/읽음확인 통계를 조회합니다.    - 동일 Group ID에 발송일 기준 3일간 (D+3) 집계됩니다. 단, 이통사별 발송 성공건수 100건 이상인 경우에 한해 집계됩니다.     - 통계 조회 기간은 데이터 존재 시 최근 1년 6개월 이내 기간 중 최대 31일까지 검색 가능합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  
     * <p><b>200</b> - 성공적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param startDate 통계 조회 기간 시작일자(yyyymmdd) 입니다. (required)
     * @param endDate 통계 조회 기간 종료일자(yyyymmdd) 입니다. (required)
     * @param groupId 발송 캠페인 구분 ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param chatbotId 대화방ID 입니다. (optional)
     * @return ResponseEntity&lt;StatQueryMessageBrandIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatQueryMessageBrandIdGet200Response> statQueryMessageBrandIdGetWithHttpInfo(String brandId, String startDate, String endDate, String groupId, String xRCSBrandkey, String chatbotId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling statQueryMessageBrandIdGet");
        }
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling statQueryMessageBrandIdGet");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling statQueryMessageBrandIdGet");
        }
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling statQueryMessageBrandIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupId", groupId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "chatbotId", chatbotId));
        

        if (xRCSBrandkey != null)
        localVarHeaderParams.add("X-RCS-Brandkey", apiClient.parameterToString(xRCSBrandkey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<StatQueryMessageBrandIdGet200Response> localReturnType = new ParameterizedTypeReference<StatQueryMessageBrandIdGet200Response>() {};
        return apiClient.invokeAPI("/statQuery/message/{brandId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 고객반응 통계 - 캠페인 메시지 버튼 클릭 통계를 조회합니다. 
     * 고객반응 통계 - 캠페인 메시지 버튼 클릭 통계를 조회합니다.    - 동일 Group ID에 발송일 기준 4일간(D+3) 집계됩니다. 단, 이통사별 발송 성공건수 100건 이상인 경우에 한해 집계됩니다.     - 통계 조회 기간은 데이터 존재 시 최근 1년 6개월 이내 기간 중 최대 31일까지 검색 가능합니다.    + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  
     * <p><b>200</b> - 성공적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param startDate 통계 조회 기간 시작일자(yyyymmdd) 입니다. (required)
     * @param endDate 통계 조회 기간 종료일자(yyyymmdd) 입니다. (required)
     * @param groupId 발송 캠페인 구분 ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param chatbotId 대화방ID 입니다. (optional)
     * @return StatQueryMessageButtonBrandIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatQueryMessageButtonBrandIdGet200Response statQueryMessageButtonBrandIdGet(String brandId, String startDate, String endDate, String groupId, String xRCSBrandkey, String chatbotId) throws RestClientException {
        return statQueryMessageButtonBrandIdGetWithHttpInfo(brandId, startDate, endDate, groupId, xRCSBrandkey, chatbotId).getBody();
    }

    /**
     * 고객반응 통계 - 캠페인 메시지 버튼 클릭 통계를 조회합니다. 
     * 고객반응 통계 - 캠페인 메시지 버튼 클릭 통계를 조회합니다.    - 동일 Group ID에 발송일 기준 4일간(D+3) 집계됩니다. 단, 이통사별 발송 성공건수 100건 이상인 경우에 한해 집계됩니다.     - 통계 조회 기간은 데이터 존재 시 최근 1년 6개월 이내 기간 중 최대 31일까지 검색 가능합니다.    + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  
     * <p><b>200</b> - 성공적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param startDate 통계 조회 기간 시작일자(yyyymmdd) 입니다. (required)
     * @param endDate 통계 조회 기간 종료일자(yyyymmdd) 입니다. (required)
     * @param groupId 발송 캠페인 구분 ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param chatbotId 대화방ID 입니다. (optional)
     * @return ResponseEntity&lt;StatQueryMessageButtonBrandIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatQueryMessageButtonBrandIdGet200Response> statQueryMessageButtonBrandIdGetWithHttpInfo(String brandId, String startDate, String endDate, String groupId, String xRCSBrandkey, String chatbotId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling statQueryMessageButtonBrandIdGet");
        }
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling statQueryMessageButtonBrandIdGet");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling statQueryMessageButtonBrandIdGet");
        }
        
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'groupId' when calling statQueryMessageButtonBrandIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "groupId", groupId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "chatbotId", chatbotId));
        

        if (xRCSBrandkey != null)
        localVarHeaderParams.add("X-RCS-Brandkey", apiClient.parameterToString(xRCSBrandkey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<StatQueryMessageButtonBrandIdGet200Response> localReturnType = new ParameterizedTypeReference<StatQueryMessageButtonBrandIdGet200Response>() {};
        return apiClient.invokeAPI("/statQuery/messageButton/{brandId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 고객반응 통계 - 대화방 메뉴 클릭 통계를 조회합니다. 
     * 고객반응 통계 - 대화방 메뉴 클릭 통계를 조회합니다.    - 대화방별 1건 이상 사용자선택이 일어난 경우에 대해 집계됩니다.     - 통계 조회 기간은 데이터 존재 시 최근 1년 6개월 이내 기간 중 최대 31일까지 검색 가능합니다.    + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  
     * <p><b>200</b> - 성공적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param startDate 통계 조회 기간 시작일자(yyyymmdd) 입니다. (required)
     * @param endDate 통계 조회 기간 종료일자(yyyymmdd) 입니다. (required)
     * @param chatbotId 대화방ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return StatQueryPersistentMenuBrandIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatQueryPersistentMenuBrandIdGet200Response statQueryPersistentMenuBrandIdGet(String brandId, String startDate, String endDate, String chatbotId, String xRCSBrandkey) throws RestClientException {
        return statQueryPersistentMenuBrandIdGetWithHttpInfo(brandId, startDate, endDate, chatbotId, xRCSBrandkey).getBody();
    }

    /**
     * 고객반응 통계 - 대화방 메뉴 클릭 통계를 조회합니다. 
     * 고객반응 통계 - 대화방 메뉴 클릭 통계를 조회합니다.    - 대화방별 1건 이상 사용자선택이 일어난 경우에 대해 집계됩니다.     - 통계 조회 기간은 데이터 존재 시 최근 1년 6개월 이내 기간 중 최대 31일까지 검색 가능합니다.    + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  
     * <p><b>200</b> - 성공적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param startDate 통계 조회 기간 시작일자(yyyymmdd) 입니다. (required)
     * @param endDate 통계 조회 기간 종료일자(yyyymmdd) 입니다. (required)
     * @param chatbotId 대화방ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;StatQueryPersistentMenuBrandIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatQueryPersistentMenuBrandIdGet200Response> statQueryPersistentMenuBrandIdGetWithHttpInfo(String brandId, String startDate, String endDate, String chatbotId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling statQueryPersistentMenuBrandIdGet");
        }
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling statQueryPersistentMenuBrandIdGet");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling statQueryPersistentMenuBrandIdGet");
        }
        
        // verify the required parameter 'chatbotId' is set
        if (chatbotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chatbotId' when calling statQueryPersistentMenuBrandIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "chatbotId", chatbotId));
        

        if (xRCSBrandkey != null)
        localVarHeaderParams.add("X-RCS-Brandkey", apiClient.parameterToString(xRCSBrandkey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<StatQueryPersistentMenuBrandIdGet200Response> localReturnType = new ParameterizedTypeReference<StatQueryPersistentMenuBrandIdGet200Response>() {};
        return apiClient.invokeAPI("/statQuery/persistentMenu/{brandId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
