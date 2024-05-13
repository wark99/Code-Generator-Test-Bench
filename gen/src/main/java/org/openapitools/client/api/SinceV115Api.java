package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response;
import org.openapitools.client.model.BrandBrandIdAutoreplymsgFilePost200Response;
import org.openapitools.client.model.BrandBrandIdAutoreplymsgPost200Response;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotChatbotIdGet200Response;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut200Response;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotChatbotIdPutRequest;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotGet200Response;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotPost200Response;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotPostRequest;
import org.openapitools.client.model.NotiBidirectional;
import org.openapitools.client.model.OneOf401ErrorInfo403ErrorInfo400ErrorInfo204ErrorInfo;
import org.openapitools.client.model.PausePersistentMenu;
import org.openapitools.client.model.RegAutoReplyMsgInfo;

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
public class SinceV115Api {
    private ApiClient apiClient;

    public SinceV115Api() {
        this(new ApiClient());
    }

    public SinceV115Api(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 자동응답메시지를 삭제합니다. 
     * 자동응답메시지를 삭제합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 성공적으로 삭제되었을 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param autoReplyMsgId 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdAutoreplymsgPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdAutoreplymsgPost200Response brandBrandIdAutoreplymsgAutoReplyMsgIdDelete(String brandId, String autoReplyMsgId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdAutoreplymsgAutoReplyMsgIdDeleteWithHttpInfo(brandId, autoReplyMsgId, xRCSBrandkey).getBody();
    }

    /**
     * 자동응답메시지를 삭제합니다. 
     * 자동응답메시지를 삭제합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 성공적으로 삭제되었을 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param autoReplyMsgId 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdAutoreplymsgPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdAutoreplymsgPost200Response> brandBrandIdAutoreplymsgAutoReplyMsgIdDeleteWithHttpInfo(String brandId, String autoReplyMsgId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdAutoreplymsgAutoReplyMsgIdDelete");
        }
        
        // verify the required parameter 'autoReplyMsgId' is set
        if (autoReplyMsgId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autoReplyMsgId' when calling brandBrandIdAutoreplymsgAutoReplyMsgIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);
        uriVariables.put("autoReplyMsgId", autoReplyMsgId);

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

        ParameterizedTypeReference<BrandBrandIdAutoreplymsgPost200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdAutoreplymsgPost200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/autoreplymsg/{autoReplyMsgId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 자동응답메시지의 상세 정보를 조회합니다. 
     * 자동응답메시지의 상세 정보를 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  
     * <p><b>200</b> - 상세 내역이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param autoReplyMsgId 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response brandBrandIdAutoreplymsgAutoReplyMsgIdGet(String brandId, String autoReplyMsgId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdAutoreplymsgAutoReplyMsgIdGetWithHttpInfo(brandId, autoReplyMsgId, xRCSBrandkey).getBody();
    }

    /**
     * 자동응답메시지의 상세 정보를 조회합니다. 
     * 자동응답메시지의 상세 정보를 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  
     * <p><b>200</b> - 상세 내역이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param autoReplyMsgId 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response> brandBrandIdAutoreplymsgAutoReplyMsgIdGetWithHttpInfo(String brandId, String autoReplyMsgId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdAutoreplymsgAutoReplyMsgIdGet");
        }
        
        // verify the required parameter 'autoReplyMsgId' is set
        if (autoReplyMsgId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autoReplyMsgId' when calling brandBrandIdAutoreplymsgAutoReplyMsgIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);
        uriVariables.put("autoReplyMsgId", autoReplyMsgId);

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

        ParameterizedTypeReference<BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/autoreplymsg/{autoReplyMsgId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 자동응답메시지의 정보를 업데이트합니다. 
     * 자동응답메시지의 정보를 업데이트합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**   자동응답메시지에 등록 가능한 액션이 추가 되었습니다.      + 전화걸기   + 웹사이트(내부브라우져)   + 웹사이트(외부브라우져)   + 대화방연결(메시지작성)   + 캘린더(일정)   + 지도(좌표)   + 지도(키워드)   + 지도(현재위치)   + &lt;신규&gt;자동응답메시지연결   + &lt;신규&gt;챗봇연결    제공되는 productcode &#x3D; chat 해당 messagebaseId를 지정하여 사용하며 다음과 같이 처리 됩니다.          + 기본 말풍선(SCS00000), 텍스트 카드(SCL00000)는 기본 말풍선(SCS00000)으로 처리     + 세로형_Meduim(SCwThM00), 세로형_Tall(SCwThT00)은 세로형_Meduim(SCwThM00)으로 처리   + 슬라이드형_Medium, 슬라이드형_Small은 슬라이드형_Medium으로 처리       - 슬라이드형 Medium ID: CCwMhM0200 ~ CCwMhM0600        **따라서 지정된 messagebaseId에만 존재하는 필드가 전환되는 messagebaseId에 존재하지 않는 경우 무시됩니다.**    예를 들어, 텍스트 카드로 등록 시 title을 입력하더라도 기본 말풍선은 title을 지원하지 않으므로 title이 적용되지 않습니다. 
     * <p><b>200</b> - 상세 내역이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param autoReplyMsgId 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param regAutoReplyMsgInfo  (optional)
     * @return BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response brandBrandIdAutoreplymsgAutoReplyMsgIdPut(String brandId, String autoReplyMsgId, String xRCSBrandkey, RegAutoReplyMsgInfo regAutoReplyMsgInfo) throws RestClientException {
        return brandBrandIdAutoreplymsgAutoReplyMsgIdPutWithHttpInfo(brandId, autoReplyMsgId, xRCSBrandkey, regAutoReplyMsgInfo).getBody();
    }

    /**
     * 자동응답메시지의 정보를 업데이트합니다. 
     * 자동응답메시지의 정보를 업데이트합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**   자동응답메시지에 등록 가능한 액션이 추가 되었습니다.      + 전화걸기   + 웹사이트(내부브라우져)   + 웹사이트(외부브라우져)   + 대화방연결(메시지작성)   + 캘린더(일정)   + 지도(좌표)   + 지도(키워드)   + 지도(현재위치)   + &lt;신규&gt;자동응답메시지연결   + &lt;신규&gt;챗봇연결    제공되는 productcode &#x3D; chat 해당 messagebaseId를 지정하여 사용하며 다음과 같이 처리 됩니다.          + 기본 말풍선(SCS00000), 텍스트 카드(SCL00000)는 기본 말풍선(SCS00000)으로 처리     + 세로형_Meduim(SCwThM00), 세로형_Tall(SCwThT00)은 세로형_Meduim(SCwThM00)으로 처리   + 슬라이드형_Medium, 슬라이드형_Small은 슬라이드형_Medium으로 처리       - 슬라이드형 Medium ID: CCwMhM0200 ~ CCwMhM0600        **따라서 지정된 messagebaseId에만 존재하는 필드가 전환되는 messagebaseId에 존재하지 않는 경우 무시됩니다.**    예를 들어, 텍스트 카드로 등록 시 title을 입력하더라도 기본 말풍선은 title을 지원하지 않으므로 title이 적용되지 않습니다. 
     * <p><b>200</b> - 상세 내역이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param autoReplyMsgId 브랜드 내 자동응답메시지 정보 접근시 사용되는 자동응답메시지ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param regAutoReplyMsgInfo  (optional)
     * @return ResponseEntity&lt;BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response> brandBrandIdAutoreplymsgAutoReplyMsgIdPutWithHttpInfo(String brandId, String autoReplyMsgId, String xRCSBrandkey, RegAutoReplyMsgInfo regAutoReplyMsgInfo) throws RestClientException {
        Object localVarPostBody = regAutoReplyMsgInfo;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdAutoreplymsgAutoReplyMsgIdPut");
        }
        
        // verify the required parameter 'autoReplyMsgId' is set
        if (autoReplyMsgId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autoReplyMsgId' when calling brandBrandIdAutoreplymsgAutoReplyMsgIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);
        uriVariables.put("autoReplyMsgId", autoReplyMsgId);

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

        ParameterizedTypeReference<BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/autoreplymsg/{autoReplyMsgId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 자동응답메시지에서 사용할 이미지 파일 상세 정보를 조회합니다. 
     * 자동응답메시지에서 사용할 이미지 파일 상세 정보를 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 등록된 파일 정보를 응답합니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param fileId 파일ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdAutoreplymsgFilePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdAutoreplymsgFilePost200Response brandBrandIdAutoreplymsgFileFileIdGet(String brandId, String fileId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdAutoreplymsgFileFileIdGetWithHttpInfo(brandId, fileId, xRCSBrandkey).getBody();
    }

    /**
     * 자동응답메시지에서 사용할 이미지 파일 상세 정보를 조회합니다. 
     * 자동응답메시지에서 사용할 이미지 파일 상세 정보를 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 등록된 파일 정보를 응답합니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param fileId 파일ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdAutoreplymsgFilePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdAutoreplymsgFilePost200Response> brandBrandIdAutoreplymsgFileFileIdGetWithHttpInfo(String brandId, String fileId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdAutoreplymsgFileFileIdGet");
        }
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling brandBrandIdAutoreplymsgFileFileIdGet");
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

        ParameterizedTypeReference<BrandBrandIdAutoreplymsgFilePost200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdAutoreplymsgFilePost200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/autoreplymsg/file/{fileId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 자동응답메시지에서 사용할 이미지 파일을 등록합니다. 
     * 자동응답메시지에서 사용할 이미지 파일을 등록합니다. 파일을 먼저 등록해야 자동응답메시지를 등록할 때 fileId를 메시지 내 지정할 수 있습니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 성공적으로 등록되었을 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param _file 자동응답메시지에 사용할 이미지 파일입니다.  (optional)
     * @return BrandBrandIdAutoreplymsgFilePost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdAutoreplymsgFilePost200Response brandBrandIdAutoreplymsgFilePost(String brandId, String xRCSBrandkey, Object _file) throws RestClientException {
        return brandBrandIdAutoreplymsgFilePostWithHttpInfo(brandId, xRCSBrandkey, _file).getBody();
    }

    /**
     * 자동응답메시지에서 사용할 이미지 파일을 등록합니다. 
     * 자동응답메시지에서 사용할 이미지 파일을 등록합니다. 파일을 먼저 등록해야 자동응답메시지를 등록할 때 fileId를 메시지 내 지정할 수 있습니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 성공적으로 등록되었을 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param _file 자동응답메시지에 사용할 이미지 파일입니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdAutoreplymsgFilePost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdAutoreplymsgFilePost200Response> brandBrandIdAutoreplymsgFilePostWithHttpInfo(String brandId, String xRCSBrandkey, Object _file) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdAutoreplymsgFilePost");
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

        ParameterizedTypeReference<BrandBrandIdAutoreplymsgFilePost200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdAutoreplymsgFilePost200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/autoreplymsg/file", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드에 자동응답메시지를 등록합니다. 
     * 브랜드에 자동응답메시지를 등록합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**    자동응답메시지에 등록 가능한 액션이 추가 되었습니다.      + 전화걸기   + 웹사이트(내부브라우져)   + 웹사이트(외부브라우져)   + 대화방연결(메시지작성)   + 캘린더(일정)   + 지도(좌표)   + 지도(키워드)   + 지도(현재위치)   + &lt;신규&gt;자동응답메시지연결   + &lt;신규&gt;챗봇연결  제공되는 productcode &#x3D; chat 해당 messagebaseId를 지정하여 사용하며 다음과 같이 처리 됩니다.          + 기본 말풍선(SCS00000), 텍스트 카드(SCL00000)는 기본 말풍선(SCS00000)으로 처리     + 세로형_Meduim(SCwThM00), 세로형_Tall(SCwThT00)은 세로형_Meduim(SCwThM00)으로 처리   + 슬라이드형_Medium, 슬라이드형_Small은 슬라이드형_Medium으로 처리       - 슬라이드형 Medium ID: CCwMhM0200 ~ CCwMhM0600        **따라서 지정된 messagebaseId에만 존재하는 필드가 전환되는 messagebaseId에 존재하지 않는 경우 무시됩니다.**    예를 들어, 텍스트 카드로 등록 시 title을 입력하더라도 기본 말풍선은 title을 지원하지 않으므로 title이 적용되지 않습니다. 
     * <p><b>200</b> - 자동응답메시지 등록 결과가 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param regAutoReplyMsgInfo 자동응답메시지 등록 정보를 전송합니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdAutoreplymsgPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdAutoreplymsgPost200Response brandBrandIdAutoreplymsgPost(String brandId, RegAutoReplyMsgInfo regAutoReplyMsgInfo, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdAutoreplymsgPostWithHttpInfo(brandId, regAutoReplyMsgInfo, xRCSBrandkey).getBody();
    }

    /**
     * 브랜드에 자동응답메시지를 등록합니다. 
     * 브랜드에 자동응답메시지를 등록합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**    자동응답메시지에 등록 가능한 액션이 추가 되었습니다.      + 전화걸기   + 웹사이트(내부브라우져)   + 웹사이트(외부브라우져)   + 대화방연결(메시지작성)   + 캘린더(일정)   + 지도(좌표)   + 지도(키워드)   + 지도(현재위치)   + &lt;신규&gt;자동응답메시지연결   + &lt;신규&gt;챗봇연결  제공되는 productcode &#x3D; chat 해당 messagebaseId를 지정하여 사용하며 다음과 같이 처리 됩니다.          + 기본 말풍선(SCS00000), 텍스트 카드(SCL00000)는 기본 말풍선(SCS00000)으로 처리     + 세로형_Meduim(SCwThM00), 세로형_Tall(SCwThT00)은 세로형_Meduim(SCwThM00)으로 처리   + 슬라이드형_Medium, 슬라이드형_Small은 슬라이드형_Medium으로 처리       - 슬라이드형 Medium ID: CCwMhM0200 ~ CCwMhM0600        **따라서 지정된 messagebaseId에만 존재하는 필드가 전환되는 messagebaseId에 존재하지 않는 경우 무시됩니다.**    예를 들어, 텍스트 카드로 등록 시 title을 입력하더라도 기본 말풍선은 title을 지원하지 않으므로 title이 적용되지 않습니다. 
     * <p><b>200</b> - 자동응답메시지 등록 결과가 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param regAutoReplyMsgInfo 자동응답메시지 등록 정보를 전송합니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdAutoreplymsgPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdAutoreplymsgPost200Response> brandBrandIdAutoreplymsgPostWithHttpInfo(String brandId, RegAutoReplyMsgInfo regAutoReplyMsgInfo, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = regAutoReplyMsgInfo;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdAutoreplymsgPost");
        }
        
        // verify the required parameter 'regAutoReplyMsgInfo' is set
        if (regAutoReplyMsgInfo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'regAutoReplyMsgInfo' when calling brandBrandIdAutoreplymsgPost");
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

        ParameterizedTypeReference<BrandBrandIdAutoreplymsgPost200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdAutoreplymsgPost200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/autoreplymsg", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 대화방(양방향)을 삭제합니다. 
     * 양방향ID 대화방 삭제 또는 양방향 대행사가 연결된 발신번호 대화방에서 양방향 대행사 정보를 제거합니다.      + 양방향ID 대화방 삭제     + 발신번호 대화방에 연결된 양방향 대행사 정보 제거(양방향 서비스 속성 제거)      + 양방향 대행사 정보가 없는 발신번호 대화방 삭제(DELETE /brand/{brandId}/chatbot/{chatbotId} 동일)     - **계정 권한 : 마스터, 매니저, 대행사**     - **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 성공적으로 삭제되었을 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response brandBrandIdBidirectionalChatbotChatbotIdDelete(String brandId, String chatbotId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdBidirectionalChatbotChatbotIdDeleteWithHttpInfo(brandId, chatbotId, xRCSBrandkey).getBody();
    }

    /**
     * 대화방(양방향)을 삭제합니다. 
     * 양방향ID 대화방 삭제 또는 양방향 대행사가 연결된 발신번호 대화방에서 양방향 대행사 정보를 제거합니다.      + 양방향ID 대화방 삭제     + 발신번호 대화방에 연결된 양방향 대행사 정보 제거(양방향 서비스 속성 제거)      + 양방향 대행사 정보가 없는 발신번호 대화방 삭제(DELETE /brand/{brandId}/chatbot/{chatbotId} 동일)     - **계정 권한 : 마스터, 매니저, 대행사**     - **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 성공적으로 삭제되었을 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response> brandBrandIdBidirectionalChatbotChatbotIdDeleteWithHttpInfo(String brandId, String chatbotId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdBidirectionalChatbotChatbotIdDelete");
        }
        
        // verify the required parameter 'chatbotId' is set
        if (chatbotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chatbotId' when calling brandBrandIdBidirectionalChatbotChatbotIdDelete");
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

        ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/bidirectional/chatbot/{chatbotId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 대화방(양방향)의 상세 정보를 조회합니다. 
     * 대화방(양방향)의 상세 정보를 조회합니다.   양방향ID 또는 대화방메뉴, 양방향 대행사가 연결된 대화방의 상세 정보를 조회합니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 대화방(양방향)의 상세 내역이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdBidirectionalChatbotChatbotIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdBidirectionalChatbotChatbotIdGet200Response brandBrandIdBidirectionalChatbotChatbotIdGet(String brandId, String chatbotId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdBidirectionalChatbotChatbotIdGetWithHttpInfo(brandId, chatbotId, xRCSBrandkey).getBody();
    }

    /**
     * 대화방(양방향)의 상세 정보를 조회합니다. 
     * 대화방(양방향)의 상세 정보를 조회합니다.   양방향ID 또는 대화방메뉴, 양방향 대행사가 연결된 대화방의 상세 정보를 조회합니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 대화방(양방향)의 상세 내역이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdBidirectionalChatbotChatbotIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdBidirectionalChatbotChatbotIdGet200Response> brandBrandIdBidirectionalChatbotChatbotIdGetWithHttpInfo(String brandId, String chatbotId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdBidirectionalChatbotChatbotIdGet");
        }
        
        // verify the required parameter 'chatbotId' is set
        if (chatbotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chatbotId' when calling brandBrandIdBidirectionalChatbotChatbotIdGet");
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

        ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotChatbotIdGet200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotChatbotIdGet200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/bidirectional/chatbot/{chatbotId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 대화방의 대화방메뉴를 삭제합니다. 
     * 대화방의 대화방메뉴를 삭제합니다.    삭제 요청한 대화방의 대화방메뉴만 삭제되며 대화방은 삭제되지 않습니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**   
     * <p><b>200</b> - 성공적으로 삭제된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete(String brandId, String chatbotId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDeleteWithHttpInfo(brandId, chatbotId, xRCSBrandkey).getBody();
    }

    /**
     * 대화방의 대화방메뉴를 삭제합니다. 
     * 대화방의 대화방메뉴를 삭제합니다.    삭제 요청한 대화방의 대화방메뉴만 삭제되며 대화방은 삭제되지 않습니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**   
     * <p><b>200</b> - 성공적으로 삭제된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response> brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDeleteWithHttpInfo(String brandId, String chatbotId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete");
        }
        
        // verify the required parameter 'chatbotId' is set
        if (chatbotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chatbotId' when calling brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuDelete");
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

        ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 중계사만 사용이 가능하며, 양방향 대화방의 대화방메뉴 사용을 중지 또는 재개합니다. 
     * 양방향 대화방에 대화방메뉴 사용을 중지 또는 재개합니다.   양방향 대화방에 등록된 중계사만 사용이 가능합니다.   과금 미납 발생 등 특이사항이 발생한 경우 사용하며 대화방메뉴 중지에 대한 정보가 사용자에게 RBC 홈페이지에서 표시됩니다.   
     * <p><b>200</b> - 성공적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param pausePersistentMenu  (optional)
     * @return BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut200Response brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut(String brandId, String chatbotId, String xRCSBrandkey, PausePersistentMenu pausePersistentMenu) throws RestClientException {
        return brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePutWithHttpInfo(brandId, chatbotId, xRCSBrandkey, pausePersistentMenu).getBody();
    }

    /**
     * 중계사만 사용이 가능하며, 양방향 대화방의 대화방메뉴 사용을 중지 또는 재개합니다. 
     * 양방향 대화방에 대화방메뉴 사용을 중지 또는 재개합니다.   양방향 대화방에 등록된 중계사만 사용이 가능합니다.   과금 미납 발생 등 특이사항이 발생한 경우 사용하며 대화방메뉴 중지에 대한 정보가 사용자에게 RBC 홈페이지에서 표시됩니다.   
     * <p><b>200</b> - 성공적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param pausePersistentMenu  (optional)
     * @return ResponseEntity&lt;BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut200Response> brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePutWithHttpInfo(String brandId, String chatbotId, String xRCSBrandkey, PausePersistentMenu pausePersistentMenu) throws RestClientException {
        Object localVarPostBody = pausePersistentMenu;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut");
        }
        
        // verify the required parameter 'chatbotId' is set
        if (chatbotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chatbotId' when calling brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut");
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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu/pause", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 대화방에 대화방메뉴를 등록합니다. 
     * 대화방에 대화방메뉴를 등록합니다. 대화방 메뉴 개편으로 상위 메뉴, 하위 메뉴 구분 없이 최대 5개까지 메뉴를 지정할 수 있습니다.      ※  대표번호 문자서비스가 설정된 대화방에는 대화방메뉴를 등록할 수 없습니다. 즉, rcsReply 값이 1인 대화방에만 대화방메뉴를 설정할 수 있습니다.    + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 성공적으로 등록된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest  (optional)
     * @return BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost(String brandId, String chatbotId, String xRCSBrandkey, BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest) throws RestClientException {
        return brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPostWithHttpInfo(brandId, chatbotId, xRCSBrandkey, brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest).getBody();
    }

    /**
     * 대화방에 대화방메뉴를 등록합니다. 
     * 대화방에 대화방메뉴를 등록합니다. 대화방 메뉴 개편으로 상위 메뉴, 하위 메뉴 구분 없이 최대 5개까지 메뉴를 지정할 수 있습니다.      ※  대표번호 문자서비스가 설정된 대화방에는 대화방메뉴를 등록할 수 없습니다. 즉, rcsReply 값이 1인 대화방에만 대화방메뉴를 설정할 수 있습니다.    + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 성공적으로 등록된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest  (optional)
     * @return ResponseEntity&lt;BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response> brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPostWithHttpInfo(String brandId, String chatbotId, String xRCSBrandkey, BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest) throws RestClientException {
        Object localVarPostBody = brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost");
        }
        
        // verify the required parameter 'chatbotId' is set
        if (chatbotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chatbotId' when calling brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPost");
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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 대화방의 대화방메뉴를 수정합니다. 
     * 대화방의 대화방메뉴를 수정합니다. 대화방 메뉴 개편으로 상위 메뉴, 하위 메뉴 구분 없이 최대 5개까지 메뉴를 지정할 수 있습니다.      ※  대표번호 문자서비스가 설정된 대화방에는 대화방메뉴를 등록할 수 없습니다. 즉, rcsReply 값이 1인 대화방에만 대화방메뉴를 설정할 수 있습니다.    + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 성공적으로 수정된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest  (optional)
     * @return BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut(String brandId, String chatbotId, String xRCSBrandkey, BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest) throws RestClientException {
        return brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutWithHttpInfo(brandId, chatbotId, xRCSBrandkey, brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest).getBody();
    }

    /**
     * 대화방의 대화방메뉴를 수정합니다. 
     * 대화방의 대화방메뉴를 수정합니다. 대화방 메뉴 개편으로 상위 메뉴, 하위 메뉴 구분 없이 최대 5개까지 메뉴를 지정할 수 있습니다.      ※  대표번호 문자서비스가 설정된 대화방에는 대화방메뉴를 등록할 수 없습니다. 즉, rcsReply 값이 1인 대화방에만 대화방메뉴를 설정할 수 있습니다.    + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 성공적으로 수정된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest  (optional)
     * @return ResponseEntity&lt;BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response> brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutWithHttpInfo(String brandId, String chatbotId, String xRCSBrandkey, BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest) throws RestClientException {
        Object localVarPostBody = brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut");
        }
        
        // verify the required parameter 'chatbotId' is set
        if (chatbotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chatbotId' when calling brandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPut");
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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/bidirectional/chatbot/{chatbotId}/persistentmenu", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 대화방(양방향) 정보를 수정 합니다. 
     * 대화방(양방향) 정보를 수정 합니다.   양방향ID를 이용한 대화방을 수정하거나 대화방에 다음과 같은 사항을 연결을 하고자 하는 경우 사용합니다.        + 양방향ID 대화방 수정     + 발신번호 또는 양방향ID 대화방에 대화방 메뉴 등록     + 발신번호 또는 양방향ID 대화방에 양방향 서비스 대행사 연결/해제(자동응답메시지, 챗봇 사용)    대화방명 등록/변경 시 RBC 운영자 검수 승인 후 등록됩니다.      + 발신번호를 이용한 양방향 대화방 전환 등록 시 대화방명이 변경된 경우     + 사용자 입력 양방향ID를 이용한 신규 양방향 대화방 등록 시       - **계정 권한 : 마스터, 매니저, 대행사**     - **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 상세 내역이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param brandBrandIdBidirectionalChatbotChatbotIdPutRequest  (optional)
     * @return BrandBrandIdBidirectionalChatbotPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdBidirectionalChatbotPost200Response brandBrandIdBidirectionalChatbotChatbotIdPut(String brandId, String chatbotId, String xRCSBrandkey, BrandBrandIdBidirectionalChatbotChatbotIdPutRequest brandBrandIdBidirectionalChatbotChatbotIdPutRequest) throws RestClientException {
        return brandBrandIdBidirectionalChatbotChatbotIdPutWithHttpInfo(brandId, chatbotId, xRCSBrandkey, brandBrandIdBidirectionalChatbotChatbotIdPutRequest).getBody();
    }

    /**
     * 대화방(양방향) 정보를 수정 합니다. 
     * 대화방(양방향) 정보를 수정 합니다.   양방향ID를 이용한 대화방을 수정하거나 대화방에 다음과 같은 사항을 연결을 하고자 하는 경우 사용합니다.        + 양방향ID 대화방 수정     + 발신번호 또는 양방향ID 대화방에 대화방 메뉴 등록     + 발신번호 또는 양방향ID 대화방에 양방향 서비스 대행사 연결/해제(자동응답메시지, 챗봇 사용)    대화방명 등록/변경 시 RBC 운영자 검수 승인 후 등록됩니다.      + 발신번호를 이용한 양방향 대화방 전환 등록 시 대화방명이 변경된 경우     + 사용자 입력 양방향ID를 이용한 신규 양방향 대화방 등록 시       - **계정 권한 : 마스터, 매니저, 대행사**     - **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 상세 내역이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param brandBrandIdBidirectionalChatbotChatbotIdPutRequest  (optional)
     * @return ResponseEntity&lt;BrandBrandIdBidirectionalChatbotPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdBidirectionalChatbotPost200Response> brandBrandIdBidirectionalChatbotChatbotIdPutWithHttpInfo(String brandId, String chatbotId, String xRCSBrandkey, BrandBrandIdBidirectionalChatbotChatbotIdPutRequest brandBrandIdBidirectionalChatbotChatbotIdPutRequest) throws RestClientException {
        Object localVarPostBody = brandBrandIdBidirectionalChatbotChatbotIdPutRequest;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdBidirectionalChatbotChatbotIdPut");
        }
        
        // verify the required parameter 'chatbotId' is set
        if (chatbotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chatbotId' when calling brandBrandIdBidirectionalChatbotChatbotIdPut");
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
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotPost200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotPost200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/bidirectional/chatbot/{chatbotId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드에 등록된 대화방(양방향) 목록을 조회합니다. 
     * 브랜드에 등록된 양방향ID 또는 대화방메뉴, 양방향 대행사가 연결된 대화방 목록을 조회합니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 브랜드에 등록된 대화방(양방향) 목록이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return BrandBrandIdBidirectionalChatbotGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdBidirectionalChatbotGet200Response brandBrandIdBidirectionalChatbotGet(String brandId, String xRCSBrandkey, Integer offset, Integer limit) throws RestClientException {
        return brandBrandIdBidirectionalChatbotGetWithHttpInfo(brandId, xRCSBrandkey, offset, limit).getBody();
    }

    /**
     * 브랜드에 등록된 대화방(양방향) 목록을 조회합니다. 
     * 브랜드에 등록된 양방향ID 또는 대화방메뉴, 양방향 대행사가 연결된 대화방 목록을 조회합니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 브랜드에 등록된 대화방(양방향) 목록이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return ResponseEntity&lt;BrandBrandIdBidirectionalChatbotGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdBidirectionalChatbotGet200Response> brandBrandIdBidirectionalChatbotGetWithHttpInfo(String brandId, String xRCSBrandkey, Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdBidirectionalChatbotGet");
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

        ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotGet200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotGet200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/bidirectional/chatbot", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 대화방(양방향)을 등록합니다. 
     * 양방향ID를 이용한 대화방을 등록하거나 대화방에 다음과 같은 사항을 연결을 하고자 하는 경우 사용합니다.        + 양방향ID 대화방 등록     + 발신번호 또는 양방향ID 대화방에 대화방 메뉴 등록     + 발신번호 또는 양방향ID 대화방에 양방향 서비스 대행사 연결(자동응답메시지, 챗봇 사용)    대화방명 등록/변경 시 RBC 운영자 검수 승인 후 등록됩니다.        + 발신번호를 이용한 양방향 대화방 전환 등록 시 대화방명이 변경된 경우     + 사용자 입력 양방향ID를 이용한 신규 양방향 대화방 등록 시      - **계정 권한 : 마스터, 매니저, 대행사**     - **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 등록 내역이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param brandBrandIdBidirectionalChatbotPostRequest  (optional)
     * @return BrandBrandIdBidirectionalChatbotPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdBidirectionalChatbotPost200Response brandBrandIdBidirectionalChatbotPost(String brandId, String xRCSBrandkey, BrandBrandIdBidirectionalChatbotPostRequest brandBrandIdBidirectionalChatbotPostRequest) throws RestClientException {
        return brandBrandIdBidirectionalChatbotPostWithHttpInfo(brandId, xRCSBrandkey, brandBrandIdBidirectionalChatbotPostRequest).getBody();
    }

    /**
     * 대화방(양방향)을 등록합니다. 
     * 양방향ID를 이용한 대화방을 등록하거나 대화방에 다음과 같은 사항을 연결을 하고자 하는 경우 사용합니다.        + 양방향ID 대화방 등록     + 발신번호 또는 양방향ID 대화방에 대화방 메뉴 등록     + 발신번호 또는 양방향ID 대화방에 양방향 서비스 대행사 연결(자동응답메시지, 챗봇 사용)    대화방명 등록/변경 시 RBC 운영자 검수 승인 후 등록됩니다.        + 발신번호를 이용한 양방향 대화방 전환 등록 시 대화방명이 변경된 경우     + 사용자 입력 양방향ID를 이용한 신규 양방향 대화방 등록 시      - **계정 권한 : 마스터, 매니저, 대행사**     - **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 등록 내역이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param brandBrandIdBidirectionalChatbotPostRequest  (optional)
     * @return ResponseEntity&lt;BrandBrandIdBidirectionalChatbotPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdBidirectionalChatbotPost200Response> brandBrandIdBidirectionalChatbotPostWithHttpInfo(String brandId, String xRCSBrandkey, BrandBrandIdBidirectionalChatbotPostRequest brandBrandIdBidirectionalChatbotPostRequest) throws RestClientException {
        Object localVarPostBody = brandBrandIdBidirectionalChatbotPostRequest;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdBidirectionalChatbotPost");
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

        ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotPost200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdBidirectionalChatbotPost200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/bidirectional/chatbot", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 양방향 서비스 제공 중계사에서 구현해야 하는 Webhook URI 입니다. 
     * 양방향 서비스 제공 중계사에서 구현해야 하는 Webhook URI 입니다. RBC 대행사 정보의 수신서버 URL하위에 bidirctional 경로를 구현 제공해야 합니다.   양방향 서비스 제공 중계사는 RBC에 등록되는 대행사의 양방향 메시지 중계사 지정, 양방향 대화방 등록, 대화방 메뉴 사용 시 청약 여부와 같이 양방향 서비스 제공을 위해 필수 정보 연동이 필요합니다.   
     * <p><b>200</b> - 전송된 정보가 정상 처리된 경우 응답합니다. 
     * <p><b>404</b> - appointment, subscription 수신 시 판단 결과 실패에 해당하는 경우 리턴 합니다. 
     * @param webhookUrl 양방향 중계사에서 등록한 수신서버(Webhook) URL 정보 입니다.  (required)
     * @param notiBidirectional notiType에 설정된 다음의 대상 정보를 구분하여 Object를 제공합니다.   persistentmenu는 registration의 의미를 포함하고 있습니다.   예를 들어, A중계사로 지정되어 있던 대화방메뉴를 갖는 양방향 대화방의 중계사를 B중계사로 변경한 경우, B중계사는 registration 수신 없이 persistentmenu를 수신하게 됩니다.      - &#39;appointment&#39;: 일반 대행사가 양방향 서비스 중계사로 지정 알림   + 중계사는 대행사 지정에 대한 판단 후 성공(200) 또는 실패(404) 응답을 리턴하여야 함      **[예시]**     {     \&quot;notiType\&quot;: \&quot;appointment\&quot;,     \&quot;value\&quot;: {       \&quot;agencyCorpRegNum\&quot;: \&quot;1148196221\&quot;     }   }    - &#39;registration&#39;: 양방향 대화방 등록 알림 (agencyId는 RBC에 등록된 대행사 ID 이며, noti를 받은 중계사를 지정한 대행사의 ID 또는 중계사의 ID)    + 양방향 대화방 생성 후 단순 통지, 중계사는 수신시 성공(200) 응답을 리턴하여야 함     **[예시]**     {     \&quot;notiType\&quot;: \&quot;registration\&quot;,     \&quot;value\&quot;: {       \&quot;agencyId\&quot;: \&quot;noagency\&quot;,       \&quot;brandId\&quot;: \&quot;BR.Q63creSjku\&quot;,       \&quot;brandKey\&quot;: \&quot;BK.SD8X63r9uJaApN9\&quot;,       \&quot;chatbotId\&quot;: \&quot;bd_chatbot_v1\&quot;,       \&quot;corpRegNum\&quot;: \&quot;1148196221\&quot;     }   }  - &#39;subscription&#39;: 대화방메뉴 자동응답메시지 사용 청약 확인을 RBC가 중계사로 요청함     + 중계사는 corpRegNum으로 대화방메뉴 자동응답메시지 사용 청약 여부를 확인 후 성공(200) 또는 실패(404) 응답을 리턴하여야 함      **[예시]**     {     \&quot;notiType\&quot;: \&quot;subscription\&quot;,     \&quot;value\&quot;: {       \&quot;agencyId\&quot;: \&quot;noagency\&quot;,       \&quot;brandId\&quot;: \&quot;BR.Q63creSjku\&quot;,       \&quot;brandKey\&quot;: \&quot;BK.SD8X63r9uJaApN9\&quot;,       \&quot;chatbotId\&quot;: \&quot;bd_chatbot_v1\&quot;,       \&quot;corpRegNum\&quot;: \&quot;1148196221\&quot;     }   }  - &#39;persistentmenu&#39;: 대화방메뉴 등록 알림 (agencyId는 RBC에 등록된 대행사 ID 이며, noti를 받은 중계사를 지정한 대행사의 ID 또는 중계사의 ID)   + 양방향 대화방 대화방메뉴 등록 후 단순 통지, 중계사는 수신시 성공(200) 응답을 리턴하여야 함    **[예시]**     {     \&quot;notiType\&quot;: \&quot;persistentmenu\&quot;,     \&quot;value\&quot;: {       \&quot;agencyId\&quot;: \&quot;noagency\&quot;,       \&quot;brandId\&quot;: \&quot;BR.Q63creSjku\&quot;,       \&quot;brandKey\&quot;: \&quot;BK.SD8X63r9uJaApN9\&quot;,       \&quot;chatbotId\&quot;: \&quot;bd_chatbot_v1\&quot;,       \&quot;corpRegNum\&quot;: \&quot;1148196221\&quot;     }   }  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void webhookUrlBidirectionalPost(String webhookUrl, NotiBidirectional notiBidirectional) throws RestClientException {
        webhookUrlBidirectionalPostWithHttpInfo(webhookUrl, notiBidirectional);
    }

    /**
     * 양방향 서비스 제공 중계사에서 구현해야 하는 Webhook URI 입니다. 
     * 양방향 서비스 제공 중계사에서 구현해야 하는 Webhook URI 입니다. RBC 대행사 정보의 수신서버 URL하위에 bidirctional 경로를 구현 제공해야 합니다.   양방향 서비스 제공 중계사는 RBC에 등록되는 대행사의 양방향 메시지 중계사 지정, 양방향 대화방 등록, 대화방 메뉴 사용 시 청약 여부와 같이 양방향 서비스 제공을 위해 필수 정보 연동이 필요합니다.   
     * <p><b>200</b> - 전송된 정보가 정상 처리된 경우 응답합니다. 
     * <p><b>404</b> - appointment, subscription 수신 시 판단 결과 실패에 해당하는 경우 리턴 합니다. 
     * @param webhookUrl 양방향 중계사에서 등록한 수신서버(Webhook) URL 정보 입니다.  (required)
     * @param notiBidirectional notiType에 설정된 다음의 대상 정보를 구분하여 Object를 제공합니다.   persistentmenu는 registration의 의미를 포함하고 있습니다.   예를 들어, A중계사로 지정되어 있던 대화방메뉴를 갖는 양방향 대화방의 중계사를 B중계사로 변경한 경우, B중계사는 registration 수신 없이 persistentmenu를 수신하게 됩니다.      - &#39;appointment&#39;: 일반 대행사가 양방향 서비스 중계사로 지정 알림   + 중계사는 대행사 지정에 대한 판단 후 성공(200) 또는 실패(404) 응답을 리턴하여야 함      **[예시]**     {     \&quot;notiType\&quot;: \&quot;appointment\&quot;,     \&quot;value\&quot;: {       \&quot;agencyCorpRegNum\&quot;: \&quot;1148196221\&quot;     }   }    - &#39;registration&#39;: 양방향 대화방 등록 알림 (agencyId는 RBC에 등록된 대행사 ID 이며, noti를 받은 중계사를 지정한 대행사의 ID 또는 중계사의 ID)    + 양방향 대화방 생성 후 단순 통지, 중계사는 수신시 성공(200) 응답을 리턴하여야 함     **[예시]**     {     \&quot;notiType\&quot;: \&quot;registration\&quot;,     \&quot;value\&quot;: {       \&quot;agencyId\&quot;: \&quot;noagency\&quot;,       \&quot;brandId\&quot;: \&quot;BR.Q63creSjku\&quot;,       \&quot;brandKey\&quot;: \&quot;BK.SD8X63r9uJaApN9\&quot;,       \&quot;chatbotId\&quot;: \&quot;bd_chatbot_v1\&quot;,       \&quot;corpRegNum\&quot;: \&quot;1148196221\&quot;     }   }  - &#39;subscription&#39;: 대화방메뉴 자동응답메시지 사용 청약 확인을 RBC가 중계사로 요청함     + 중계사는 corpRegNum으로 대화방메뉴 자동응답메시지 사용 청약 여부를 확인 후 성공(200) 또는 실패(404) 응답을 리턴하여야 함      **[예시]**     {     \&quot;notiType\&quot;: \&quot;subscription\&quot;,     \&quot;value\&quot;: {       \&quot;agencyId\&quot;: \&quot;noagency\&quot;,       \&quot;brandId\&quot;: \&quot;BR.Q63creSjku\&quot;,       \&quot;brandKey\&quot;: \&quot;BK.SD8X63r9uJaApN9\&quot;,       \&quot;chatbotId\&quot;: \&quot;bd_chatbot_v1\&quot;,       \&quot;corpRegNum\&quot;: \&quot;1148196221\&quot;     }   }  - &#39;persistentmenu&#39;: 대화방메뉴 등록 알림 (agencyId는 RBC에 등록된 대행사 ID 이며, noti를 받은 중계사를 지정한 대행사의 ID 또는 중계사의 ID)   + 양방향 대화방 대화방메뉴 등록 후 단순 통지, 중계사는 수신시 성공(200) 응답을 리턴하여야 함    **[예시]**     {     \&quot;notiType\&quot;: \&quot;persistentmenu\&quot;,     \&quot;value\&quot;: {       \&quot;agencyId\&quot;: \&quot;noagency\&quot;,       \&quot;brandId\&quot;: \&quot;BR.Q63creSjku\&quot;,       \&quot;brandKey\&quot;: \&quot;BK.SD8X63r9uJaApN9\&quot;,       \&quot;chatbotId\&quot;: \&quot;bd_chatbot_v1\&quot;,       \&quot;corpRegNum\&quot;: \&quot;1148196221\&quot;     }   }  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> webhookUrlBidirectionalPostWithHttpInfo(String webhookUrl, NotiBidirectional notiBidirectional) throws RestClientException {
        Object localVarPostBody = notiBidirectional;
        
        // verify the required parameter 'webhookUrl' is set
        if (webhookUrl == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'webhookUrl' when calling webhookUrlBidirectionalPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("webhookUrl", webhookUrl);

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

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{webhookUrl}/bidirectional", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
