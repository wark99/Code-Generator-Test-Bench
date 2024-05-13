package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response;
import org.openapitools.client.model.BrandBrandIdAutoreplymsgFilePost200Response;
import org.openapitools.client.model.BrandBrandIdAutoreplymsgGet200Response;
import org.openapitools.client.model.BrandBrandIdAutoreplymsgPost200Response;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotChatbotIdGet200Response;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPutRequest;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotChatbotIdPutRequest;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotGet200Response;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotPost200Response;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotPostRequest;
import org.openapitools.client.model.BrandBrandIdChatbotChatbotIdCancelPut200Response;
import org.openapitools.client.model.BrandBrandIdChatbotChatbotIdDelete200Response;
import org.openapitools.client.model.BrandBrandIdChatbotChatbotIdGet200Response;
import org.openapitools.client.model.BrandBrandIdChatbotGet200Response;
import org.openapitools.client.model.BrandBrandIdChatbotPost200Response;
import org.openapitools.client.model.BrandBrandIdLogoFileIdDelete200Response;
import org.openapitools.client.model.BrandBrandIdLogoFileIdGet200Response;
import org.openapitools.client.model.BrandBrandIdLogoFileIdPut200Response;
import org.openapitools.client.model.BrandBrandIdLogoGet200Response;
import org.openapitools.client.model.BrandBrandIdLogoPost200Response;
import org.openapitools.client.model.BrandBrandIdMessagebaseMessagebaseIdGet200Response;
import org.openapitools.client.model.BrandBrandIdMessagebaseMessagebaseIdPut200Response;
import org.openapitools.client.model.BrandBrandIdMessagebasePost200Response;
import org.openapitools.client.model.BrandBrandIdMessagebasePostRequest;
import org.openapitools.client.model.BrandBrandIdV2MessagebaseFilePost200Response;
import org.openapitools.client.model.CorpBrandCategoriesGet200Response;
import org.openapitools.client.model.CorpBrandPost200Response;
import org.openapitools.client.model.CorpBrandPostRequestChatbots;
import org.openapitools.client.model.CorpPersonIdBrandBrandIdCancelPut200Response;
import org.openapitools.client.model.CorpPersonIdBrandBrandIdDelete200Response;
import org.openapitools.client.model.CorpPersonIdBrandBrandIdGet200Response;
import org.openapitools.client.model.CorpPersonIdBrandBrandIdPrivilegeGet200Response;
import org.openapitools.client.model.CorpPersonIdBrandBrandIdPrivilegePostRequest;
import org.openapitools.client.model.CorpPersonIdBrandBrandIdPrivilegePutRequest;
import org.openapitools.client.model.CorpPersonIdBrandBrandIdPut200Response;
import org.openapitools.client.model.CorpPersonIdBrandGet200Response;
import java.io.File;
import org.openapitools.client.model.LogoCommonGet200Response;
import org.openapitools.client.model.MessagebaseCommonGet200Response;
import org.openapitools.client.model.MessagebaseCommonMessagebaseIdGet200Response;
import org.openapitools.client.model.MessagebaseMessagebaseformGet200Response;
import org.openapitools.client.model.MessagebaseMessagebaseformMessagebaseformIdGet200Response;
import org.openapitools.client.model.MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response;
import org.openapitools.client.model.ModTemplateInfo;
import org.openapitools.client.model.OneOf401ErrorInfo403ErrorInfo400ErrorInfo204ErrorInfo;
import org.openapitools.client.model.RegAutoReplyMsgInfo;
import org.openapitools.client.model.RegBrandInfo;
import org.openapitools.client.model.RegChatbotInfo;
import org.openapitools.client.model.RegMessagebaseInfo;
import org.openapitools.client.model.RegTemplateInfo;
import org.openapitools.client.model.StatQueryBrandprofileBrandIdGet200Response;
import org.openapitools.client.model.StatQueryMessageBrandIdGet200Response;
import org.openapitools.client.model.StatQueryMessageButtonBrandIdGet200Response;
import org.openapitools.client.model.StatQueryPersistentMenuBrandIdGet200Response;
import org.openapitools.client.model.UsableQueryChatbotIdChatbotIdGet200Response;

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
public class CorporationApi {
    private ApiClient apiClient;

    public CorporationApi() {
        this(new ApiClient());
    }

    public CorporationApi(ApiClient apiClient) {
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
     * 브랜드 내에 등록된 자동응답메시지 목록을 조회합니다. 
     * 브랜드 내에 등록된 자동응답메시지 목록을 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  
     * <p><b>200</b> - 브랜드에 등록된 자동응답 목록이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return BrandBrandIdAutoreplymsgGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdAutoreplymsgGet200Response brandBrandIdAutoreplymsgGet(String brandId, String xRCSBrandkey, Integer offset, Integer limit) throws RestClientException {
        return brandBrandIdAutoreplymsgGetWithHttpInfo(brandId, xRCSBrandkey, offset, limit).getBody();
    }

    /**
     * 브랜드 내에 등록된 자동응답메시지 목록을 조회합니다. 
     * 브랜드 내에 등록된 자동응답메시지 목록을 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  
     * <p><b>200</b> - 브랜드에 등록된 자동응답 목록이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return ResponseEntity&lt;BrandBrandIdAutoreplymsgGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdAutoreplymsgGet200Response> brandBrandIdAutoreplymsgGetWithHttpInfo(String brandId, String xRCSBrandkey, Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdAutoreplymsgGet");
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

        ParameterizedTypeReference<BrandBrandIdAutoreplymsgGet200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdAutoreplymsgGet200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/autoreplymsg", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
    /**
     * 대화방(발신번호)을 삭제합니다. 
     * 대화방(발신번호)을 삭제합니다. 양방향 대화방의 회신번호로 등록된 발신번호 삭제 시, 대상 양방향 대화방도 함께 삭제 처리 됩니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자**   + **삭제 가능 상태 : 저장, 반려, 승인** 
     * <p><b>200</b> - 성공적으로 삭제되었을 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdChatbotChatbotIdDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdChatbotChatbotIdDelete200Response brandBrandIdChatbotChatbotIdDelete(String brandId, String chatbotId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdChatbotChatbotIdDeleteWithHttpInfo(brandId, chatbotId, xRCSBrandkey).getBody();
    }

    /**
     * 대화방(발신번호)을 삭제합니다. 
     * 대화방(발신번호)을 삭제합니다. 양방향 대화방의 회신번호로 등록된 발신번호 삭제 시, 대상 양방향 대화방도 함께 삭제 처리 됩니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자**   + **삭제 가능 상태 : 저장, 반려, 승인** 
     * <p><b>200</b> - 성공적으로 삭제되었을 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdChatbotChatbotIdDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdChatbotChatbotIdDelete200Response> brandBrandIdChatbotChatbotIdDeleteWithHttpInfo(String brandId, String chatbotId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdChatbotChatbotIdDelete");
        }
        
        // verify the required parameter 'chatbotId' is set
        if (chatbotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chatbotId' when calling brandBrandIdChatbotChatbotIdDelete");
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

        ParameterizedTypeReference<BrandBrandIdChatbotChatbotIdDelete200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdChatbotChatbotIdDelete200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/chatbot/{chatbotId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 지정된 대화방(발신번호)의 상세 정보를 조회합니다. 
     * 지정된 대화방(발신번호)의 상세 정보를 조회합니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 해당 대화방의 상세 내역이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdChatbotChatbotIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdChatbotChatbotIdGet200Response brandBrandIdChatbotChatbotIdGet(String brandId, String chatbotId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdChatbotChatbotIdGetWithHttpInfo(brandId, chatbotId, xRCSBrandkey).getBody();
    }

    /**
     * 지정된 대화방(발신번호)의 상세 정보를 조회합니다. 
     * 지정된 대화방(발신번호)의 상세 정보를 조회합니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 해당 대화방의 상세 내역이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdChatbotChatbotIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdChatbotChatbotIdGet200Response> brandBrandIdChatbotChatbotIdGetWithHttpInfo(String brandId, String chatbotId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdChatbotChatbotIdGet");
        }
        
        // verify the required parameter 'chatbotId' is set
        if (chatbotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chatbotId' when calling brandBrandIdChatbotChatbotIdGet");
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

        ParameterizedTypeReference<BrandBrandIdChatbotChatbotIdGet200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdChatbotChatbotIdGet200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/chatbot/{chatbotId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 지정된 대화방(발신번호)의 정보를 업데이트합니다. 
     * 지정된 대화방(발신번호)의 정보를 업데이트합니다.   저장, 반려, 승인 상태의 대화방(발신번호)만 수정이 가능하며, 대화방명이 변경되면 RBC 운영자의 검수를 받아야 합니다.        + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자**   + **수정 가능 상태 : 저장, 반려, 승인** 
     * <p><b>200</b> - 상세 내역이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param subNumCertificate 통신서비스 가입증명원 입니다.   입력한 발신번호와 통신서비스 가입증명원의 전화번호가 일치해야 발신번호 등록이 가능하며 최근 1개월 이내 발급된 서류로 제출해야 합니다.   **파일형식 : jpg, png, pdf, tiff, zip (최대20MB)**  (optional)
     * @param chatbot  (optional)
     * @return BrandBrandIdChatbotChatbotIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdChatbotChatbotIdGet200Response brandBrandIdChatbotChatbotIdPut(String brandId, String chatbotId, String xRCSBrandkey, Object subNumCertificate, RegChatbotInfo chatbot) throws RestClientException {
        return brandBrandIdChatbotChatbotIdPutWithHttpInfo(brandId, chatbotId, xRCSBrandkey, subNumCertificate, chatbot).getBody();
    }

    /**
     * 지정된 대화방(발신번호)의 정보를 업데이트합니다. 
     * 지정된 대화방(발신번호)의 정보를 업데이트합니다.   저장, 반려, 승인 상태의 대화방(발신번호)만 수정이 가능하며, 대화방명이 변경되면 RBC 운영자의 검수를 받아야 합니다.        + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자**   + **수정 가능 상태 : 저장, 반려, 승인** 
     * <p><b>200</b> - 상세 내역이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param chatbotId 브랜드 내 대화방 정보 접근시 사용되는 대화방ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param subNumCertificate 통신서비스 가입증명원 입니다.   입력한 발신번호와 통신서비스 가입증명원의 전화번호가 일치해야 발신번호 등록이 가능하며 최근 1개월 이내 발급된 서류로 제출해야 합니다.   **파일형식 : jpg, png, pdf, tiff, zip (최대20MB)**  (optional)
     * @param chatbot  (optional)
     * @return ResponseEntity&lt;BrandBrandIdChatbotChatbotIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdChatbotChatbotIdGet200Response> brandBrandIdChatbotChatbotIdPutWithHttpInfo(String brandId, String chatbotId, String xRCSBrandkey, Object subNumCertificate, RegChatbotInfo chatbot) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdChatbotChatbotIdPut");
        }
        
        // verify the required parameter 'chatbotId' is set
        if (chatbotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chatbotId' when calling brandBrandIdChatbotChatbotIdPut");
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

        if (subNumCertificate != null)
            localVarFormParams.add("subNumCertificate", subNumCertificate);
        if (chatbot != null)
            localVarFormParams.add("chatbot", chatbot);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<BrandBrandIdChatbotChatbotIdGet200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdChatbotChatbotIdGet200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/chatbot/{chatbotId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드 내에 등록된 대화방 목록을 조회합니다. 
     * 브랜드 내에 등록된 대화방(발신번호) 목록을 조회합니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 브랜드에 등록된 대화방 목록이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return BrandBrandIdChatbotGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdChatbotGet200Response brandBrandIdChatbotGet(String brandId, String xRCSBrandkey, Integer offset, Integer limit) throws RestClientException {
        return brandBrandIdChatbotGetWithHttpInfo(brandId, xRCSBrandkey, offset, limit).getBody();
    }

    /**
     * 브랜드 내에 등록된 대화방 목록을 조회합니다. 
     * 브랜드 내에 등록된 대화방(발신번호) 목록을 조회합니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 브랜드에 등록된 대화방 목록이 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return ResponseEntity&lt;BrandBrandIdChatbotGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdChatbotGet200Response> brandBrandIdChatbotGetWithHttpInfo(String brandId, String xRCSBrandkey, Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdChatbotGet");
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

        ParameterizedTypeReference<BrandBrandIdChatbotGet200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdChatbotGet200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/chatbot", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 지정된 브랜드에 대화방(발신번호)을 등록합니다. 
     * 지정된 브랜드에 대화방(발신번호)을 등록합니다.   대화방 등록 시 RBC 운영자 검수 승인 후 사용이 가능합니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 대화방 등록 상태가 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param subNumCertificate 통신서비스 가입증명원 입니다.   입력한 발신번호와 통신서비스 가입증명원의 전화번호가 일치해야 발신번호 등록이 가능하며 최근 1개월 이내 발급된 서류로 제출해야 합니다.   **파일형식 : jpg, png, pdf, tiff, zip (최대20MB)**  (optional)
     * @param chatbots  (optional)
     * @return BrandBrandIdChatbotPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdChatbotPost200Response brandBrandIdChatbotPost(String brandId, String xRCSBrandkey, Object subNumCertificate, CorpBrandPostRequestChatbots chatbots) throws RestClientException {
        return brandBrandIdChatbotPostWithHttpInfo(brandId, xRCSBrandkey, subNumCertificate, chatbots).getBody();
    }

    /**
     * 지정된 브랜드에 대화방(발신번호)을 등록합니다. 
     * 지정된 브랜드에 대화방(발신번호)을 등록합니다.   대화방 등록 시 RBC 운영자 검수 승인 후 사용이 가능합니다.      + **계정 권한 : 마스터, 매니저, 대행사**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 대화방 등록 상태가 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param subNumCertificate 통신서비스 가입증명원 입니다.   입력한 발신번호와 통신서비스 가입증명원의 전화번호가 일치해야 발신번호 등록이 가능하며 최근 1개월 이내 발급된 서류로 제출해야 합니다.   **파일형식 : jpg, png, pdf, tiff, zip (최대20MB)**  (optional)
     * @param chatbots  (optional)
     * @return ResponseEntity&lt;BrandBrandIdChatbotPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdChatbotPost200Response> brandBrandIdChatbotPostWithHttpInfo(String brandId, String xRCSBrandkey, Object subNumCertificate, CorpBrandPostRequestChatbots chatbots) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdChatbotPost");
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

        if (subNumCertificate != null)
            localVarFormParams.add("subNumCertificate", subNumCertificate);
        if (chatbots != null)
            localVarFormParams.add("chatbots", chatbots);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<BrandBrandIdChatbotPost200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdChatbotPost200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/chatbot", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 로고의 승인요청을 취소합니다. 
     * 로고의 승인요청을 취소합니다.     + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**          각 상태별 취소 요청 동작은 다음과 같습니다.     + **승인대기 : 저장 상태로 변경**             + **승인대기(수정) : 직전 승인 상태 및 데이터로 롤백**   + **반려(수정) : 직전 승인 상태 및 데이터로 롤백**   + **이외의 경우 에러 리턴** 
     * <p><b>200</b> - 정상적으로 등록된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param fileId 로고 이미지 파일 ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdLogoPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdLogoPost200Response brandBrandIdLogoFileIdCancelPut(String brandId, String fileId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdLogoFileIdCancelPutWithHttpInfo(brandId, fileId, xRCSBrandkey).getBody();
    }

    /**
     * 로고의 승인요청을 취소합니다. 
     * 로고의 승인요청을 취소합니다.     + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**          각 상태별 취소 요청 동작은 다음과 같습니다.     + **승인대기 : 저장 상태로 변경**             + **승인대기(수정) : 직전 승인 상태 및 데이터로 롤백**   + **반려(수정) : 직전 승인 상태 및 데이터로 롤백**   + **이외의 경우 에러 리턴** 
     * <p><b>200</b> - 정상적으로 등록된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param fileId 로고 이미지 파일 ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdLogoPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdLogoPost200Response> brandBrandIdLogoFileIdCancelPutWithHttpInfo(String brandId, String fileId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdLogoFileIdCancelPut");
        }
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling brandBrandIdLogoFileIdCancelPut");
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

        ParameterizedTypeReference<BrandBrandIdLogoPost200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdLogoPost200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/logo/{fileId}/cancel", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드에 등록된 승인 이전 상태의 로고를 삭제 합니다. 
     * 브랜드에 등록된 승인 이전 상태의 로고를 삭제 합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **삭제 가능 상태 : 저장, 반려** 
     * <p><b>200</b> - 성공적으로 삭제된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param fileId 로고 ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdLogoFileIdDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdLogoFileIdDelete200Response brandBrandIdLogoFileIdDelete(String brandId, String fileId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdLogoFileIdDeleteWithHttpInfo(brandId, fileId, xRCSBrandkey).getBody();
    }

    /**
     * 브랜드에 등록된 승인 이전 상태의 로고를 삭제 합니다. 
     * 브랜드에 등록된 승인 이전 상태의 로고를 삭제 합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **삭제 가능 상태 : 저장, 반려** 
     * <p><b>200</b> - 성공적으로 삭제된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param fileId 로고 ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdLogoFileIdDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdLogoFileIdDelete200Response> brandBrandIdLogoFileIdDeleteWithHttpInfo(String brandId, String fileId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdLogoFileIdDelete");
        }
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling brandBrandIdLogoFileIdDelete");
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

        ParameterizedTypeReference<BrandBrandIdLogoFileIdDelete200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdLogoFileIdDelete200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/logo/{fileId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드에 등록된 로고를 단건 상세 조회합니다. 
     * 브랜드에 등록된 로고를 단건 상세 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 조회 요청한 로고 상세 정보입니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param fileId 로고 이미지 파일 ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdLogoFileIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdLogoFileIdGet200Response brandBrandIdLogoFileIdGet(String brandId, String fileId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdLogoFileIdGetWithHttpInfo(brandId, fileId, xRCSBrandkey).getBody();
    }

    /**
     * 브랜드에 등록된 로고를 단건 상세 조회합니다. 
     * 브랜드에 등록된 로고를 단건 상세 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 조회 요청한 로고 상세 정보입니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param fileId 로고 이미지 파일 ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdLogoFileIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdLogoFileIdGet200Response> brandBrandIdLogoFileIdGetWithHttpInfo(String brandId, String fileId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdLogoFileIdGet");
        }
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling brandBrandIdLogoFileIdGet");
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

        ParameterizedTypeReference<BrandBrandIdLogoFileIdGet200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdLogoFileIdGet200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/logo/{fileId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드에 등록된 로고를 수정 승인요청 합니다. 
     * 브랜드에 등록된 로고를 수정 승인요청 합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **수정 가능 상태 : 저장, 반려, 반려(수정), 승인** 
     * <p><b>200</b> - 정상적으로 등록된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param fileId 로고 ID 입니다. (required)
     * @param name 로고명 입니다. (required)
     * @param _file 업로드 로고 이미지 파일을 지칭합니다.            **파일형식 : gif, png, jpeg, jpg, bmp (최대 1MB)**  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param description 100자 이내의 로고 설명 입니다. (optional)
     * @return BrandBrandIdLogoFileIdPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdLogoFileIdPut200Response brandBrandIdLogoFileIdPut(String brandId, String fileId, String name, Object _file, String xRCSBrandkey, String description) throws RestClientException {
        return brandBrandIdLogoFileIdPutWithHttpInfo(brandId, fileId, name, _file, xRCSBrandkey, description).getBody();
    }

    /**
     * 브랜드에 등록된 로고를 수정 승인요청 합니다. 
     * 브랜드에 등록된 로고를 수정 승인요청 합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**   + **수정 가능 상태 : 저장, 반려, 반려(수정), 승인** 
     * <p><b>200</b> - 정상적으로 등록된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param fileId 로고 ID 입니다. (required)
     * @param name 로고명 입니다. (required)
     * @param _file 업로드 로고 이미지 파일을 지칭합니다.            **파일형식 : gif, png, jpeg, jpg, bmp (최대 1MB)**  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param description 100자 이내의 로고 설명 입니다. (optional)
     * @return ResponseEntity&lt;BrandBrandIdLogoFileIdPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdLogoFileIdPut200Response> brandBrandIdLogoFileIdPutWithHttpInfo(String brandId, String fileId, String name, Object _file, String xRCSBrandkey, String description) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdLogoFileIdPut");
        }
        
        // verify the required parameter 'fileId' is set
        if (fileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'fileId' when calling brandBrandIdLogoFileIdPut");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling brandBrandIdLogoFileIdPut");
        }
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '_file' when calling brandBrandIdLogoFileIdPut");
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

        if (name != null)
            localVarFormParams.add("name", name);
        if (description != null)
            localVarFormParams.add("description", description);
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

        ParameterizedTypeReference<BrandBrandIdLogoFileIdPut200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdLogoFileIdPut200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/logo/{fileId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드 별 등록된 로고 목록을 조회합니다. 
     * 브랜드 별 등록된 로고 목록을 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 브랜드 내 등록된 로고 목록을 응답합니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return BrandBrandIdLogoGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdLogoGet200Response brandBrandIdLogoGet(String brandId, String xRCSBrandkey, Integer offset, Integer limit) throws RestClientException {
        return brandBrandIdLogoGetWithHttpInfo(brandId, xRCSBrandkey, offset, limit).getBody();
    }

    /**
     * 브랜드 별 등록된 로고 목록을 조회합니다. 
     * 브랜드 별 등록된 로고 목록을 조회합니다.      + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 브랜드 내 등록된 로고 목록을 응답합니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return ResponseEntity&lt;BrandBrandIdLogoGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdLogoGet200Response> brandBrandIdLogoGetWithHttpInfo(String brandId, String xRCSBrandkey, Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdLogoGet");
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

        ParameterizedTypeReference<BrandBrandIdLogoGet200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdLogoGet200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/logo", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드 내에서 사용할 수 있는 로고를 등록 합니다.   
     * 브랜드 내에서 사용할 수 있는 로고를 등록 합니다.    등록한 로고는 영구적으로 사용 가능합니다.    + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 정상적으로 등록된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param name 로고명 입니다. (required)
     * @param _file 업로드 로고 이미지 파일을 지칭합니다.            **파일형식 : gif, png, jpeg, jpg, bmp (최대 1MB)**  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param description 100자 이내의 로고 설명 입니다. (optional)
     * @return BrandBrandIdLogoPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdLogoPost200Response brandBrandIdLogoPost(String brandId, String name, Object _file, String xRCSBrandkey, String description) throws RestClientException {
        return brandBrandIdLogoPostWithHttpInfo(brandId, name, _file, xRCSBrandkey, description).getBody();
    }

    /**
     * 브랜드 내에서 사용할 수 있는 로고를 등록 합니다.   
     * 브랜드 내에서 사용할 수 있는 로고를 등록 합니다.    등록한 로고는 영구적으로 사용 가능합니다.    + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 정상적으로 등록된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param name 로고명 입니다. (required)
     * @param _file 업로드 로고 이미지 파일을 지칭합니다.            **파일형식 : gif, png, jpeg, jpg, bmp (최대 1MB)**  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param description 100자 이내의 로고 설명 입니다. (optional)
     * @return ResponseEntity&lt;BrandBrandIdLogoPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdLogoPost200Response> brandBrandIdLogoPostWithHttpInfo(String brandId, String name, Object _file, String xRCSBrandkey, String description) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdLogoPost");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling brandBrandIdLogoPost");
        }
        
        // verify the required parameter '_file' is set
        if (_file == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter '_file' when calling brandBrandIdLogoPost");
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

        if (name != null)
            localVarFormParams.add("name", name);
        if (description != null)
            localVarFormParams.add("description", description);
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

        ParameterizedTypeReference<BrandBrandIdLogoPost200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdLogoPost200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/logo", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
     * 신규 개설한 승인대기 중인 브랜드의 승인요청을 취소합니다.   
     * 신규 개설한 승인대기 중인 브랜드의 승인요청을 취소합니다.    검수가 시작된 브랜드는 승인취소가 불가 합니다.      + **계정 권한 : 마스터, 매니저**     + **가능 상태 : 승인대기**   
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @return CorpPersonIdBrandBrandIdCancelPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorpPersonIdBrandBrandIdCancelPut200Response corpBrandBrandIdCancelPut(String brandId) throws RestClientException {
        return corpBrandBrandIdCancelPutWithHttpInfo(brandId).getBody();
    }

    /**
     * 신규 개설한 승인대기 중인 브랜드의 승인요청을 취소합니다.   
     * 신규 개설한 승인대기 중인 브랜드의 승인요청을 취소합니다.    검수가 시작된 브랜드는 승인취소가 불가 합니다.      + **계정 권한 : 마스터, 매니저**     + **가능 상태 : 승인대기**   
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @return ResponseEntity&lt;CorpPersonIdBrandBrandIdCancelPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorpPersonIdBrandBrandIdCancelPut200Response> corpBrandBrandIdCancelPutWithHttpInfo(String brandId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling corpBrandBrandIdCancelPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);

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

        ParameterizedTypeReference<CorpPersonIdBrandBrandIdCancelPut200Response> localReturnType = new ParameterizedTypeReference<CorpPersonIdBrandBrandIdCancelPut200Response>() {};
        return apiClient.invokeAPI("/corp/brand/{brandId}/cancel", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 마스터 계정을 이용하여 승인 이력이 없는 신규 개설 브랜드 삭제를 요청합니다. 
     * 마스터 계정을 이용하여 승인 이력이 없는 해당 계정이 신규 개설한 브랜드 삭제를 요청합니다. 정상적으로 승인요청된 브랜드는 **승인대기** 상태가 되므로 삭제가 불가합니다.\\ **- 사용 권한 계정 : 마스터**\\ **- 삭제 가능 상태 : 저장, 반려** 
     * <p><b>200</b> - 정상적으로 처리된 경우 응답됩니다.
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @return CorpPersonIdBrandBrandIdDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorpPersonIdBrandBrandIdDelete200Response corpBrandBrandIdDelete(String brandId) throws RestClientException {
        return corpBrandBrandIdDeleteWithHttpInfo(brandId).getBody();
    }

    /**
     * 마스터 계정을 이용하여 승인 이력이 없는 신규 개설 브랜드 삭제를 요청합니다. 
     * 마스터 계정을 이용하여 승인 이력이 없는 해당 계정이 신규 개설한 브랜드 삭제를 요청합니다. 정상적으로 승인요청된 브랜드는 **승인대기** 상태가 되므로 삭제가 불가합니다.\\ **- 사용 권한 계정 : 마스터**\\ **- 삭제 가능 상태 : 저장, 반려** 
     * <p><b>200</b> - 정상적으로 처리된 경우 응답됩니다.
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @return ResponseEntity&lt;CorpPersonIdBrandBrandIdDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorpPersonIdBrandBrandIdDelete200Response> corpBrandBrandIdDeleteWithHttpInfo(String brandId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling corpBrandBrandIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);

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

        ParameterizedTypeReference<CorpPersonIdBrandBrandIdDelete200Response> localReturnType = new ParameterizedTypeReference<CorpPersonIdBrandBrandIdDelete200Response>() {};
        return apiClient.invokeAPI("/corp/brand/{brandId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * RBC 웹에서 임시저장으로 등록한 브랜드 또는 신규 브랜드 등록 검수 시 반려된 경우 브랜드 수정 후 승인요청 시 사용합니다. 
     * RBC 웹에서 임시저장으로 등록한 브랜드 또는 신규 브랜드 등록 검수 시 반려된 경우 브랜드 수정 후 승인요청 시 사용합니다.   브랜드 등록 POST API를 통해 **승인** 요청하였으나 검수 시 **반려**되어 재승인 요청 또는   **RBC 홈페이지**에서 **임시저장**한 브랜드 정보를 수정하여 승인 요청하는 경우 사용합니다.      + **계정 권한 : 마스터, 매니저**   + **브랜드 권한 : 브랜드 대표운영자(브랜드를 등록한 마스터 또는 매니저)**     + **수정 대상 브랜드 상태 : 반려, 저장** 
     * <p><b>200</b> - 정상적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param regBrand  (required)
     * @param brandProfile 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : png (최대1MB)**  (required)
     * @param brandBackground 브랜드 백그라운드 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : jpg, png (최대1MB)**  (optional)
     * @param mainMdn 대표발신번호 개념 제거되어 더 이상 유효하지 않습니다. (optional)
     * @param chatbots  (optional)
     * @param subNumCertificate 통신서비스이용증명원을 업로드합니다.   대화방(발신번호) 등록을 위해 chatbots 지정한 경우 필수로 함께 업로드해야 합니다.   **허용되는 파일형식 : jpg, png, pdf, tiff, zip (최대20MB)**    (optional)
     * @return CorpBrandPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorpBrandPost200Response corpBrandBrandIdPut(String brandId, RegBrandInfo regBrand, Object brandProfile, Object brandBackground, String mainMdn, CorpBrandPostRequestChatbots chatbots, Object subNumCertificate) throws RestClientException {
        return corpBrandBrandIdPutWithHttpInfo(brandId, regBrand, brandProfile, brandBackground, mainMdn, chatbots, subNumCertificate).getBody();
    }

    /**
     * RBC 웹에서 임시저장으로 등록한 브랜드 또는 신규 브랜드 등록 검수 시 반려된 경우 브랜드 수정 후 승인요청 시 사용합니다. 
     * RBC 웹에서 임시저장으로 등록한 브랜드 또는 신규 브랜드 등록 검수 시 반려된 경우 브랜드 수정 후 승인요청 시 사용합니다.   브랜드 등록 POST API를 통해 **승인** 요청하였으나 검수 시 **반려**되어 재승인 요청 또는   **RBC 홈페이지**에서 **임시저장**한 브랜드 정보를 수정하여 승인 요청하는 경우 사용합니다.      + **계정 권한 : 마스터, 매니저**   + **브랜드 권한 : 브랜드 대표운영자(브랜드를 등록한 마스터 또는 매니저)**     + **수정 대상 브랜드 상태 : 반려, 저장** 
     * <p><b>200</b> - 정상적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param regBrand  (required)
     * @param brandProfile 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : png (최대1MB)**  (required)
     * @param brandBackground 브랜드 백그라운드 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : jpg, png (최대1MB)**  (optional)
     * @param mainMdn 대표발신번호 개념 제거되어 더 이상 유효하지 않습니다. (optional)
     * @param chatbots  (optional)
     * @param subNumCertificate 통신서비스이용증명원을 업로드합니다.   대화방(발신번호) 등록을 위해 chatbots 지정한 경우 필수로 함께 업로드해야 합니다.   **허용되는 파일형식 : jpg, png, pdf, tiff, zip (최대20MB)**    (optional)
     * @return ResponseEntity&lt;CorpBrandPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorpBrandPost200Response> corpBrandBrandIdPutWithHttpInfo(String brandId, RegBrandInfo regBrand, Object brandProfile, Object brandBackground, String mainMdn, CorpBrandPostRequestChatbots chatbots, Object subNumCertificate) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling corpBrandBrandIdPut");
        }
        
        // verify the required parameter 'regBrand' is set
        if (regBrand == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'regBrand' when calling corpBrandBrandIdPut");
        }
        
        // verify the required parameter 'brandProfile' is set
        if (brandProfile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandProfile' when calling corpBrandBrandIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (regBrand != null)
            localVarFormParams.add("regBrand", regBrand);
        if (brandProfile != null)
            localVarFormParams.add("brandProfile", brandProfile);
        if (brandBackground != null)
            localVarFormParams.add("brandBackground", brandBackground);
        if (mainMdn != null)
            localVarFormParams.add("mainMdn", mainMdn);
        if (chatbots != null)
            localVarFormParams.add("chatbots", chatbots);
        if (subNumCertificate != null)
            localVarFormParams.add("subNumCertificate", subNumCertificate);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<CorpBrandPost200Response> localReturnType = new ParameterizedTypeReference<CorpBrandPost200Response>() {};
        return apiClient.invokeAPI("/corp/brand/{brandId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드 등록 시 사용 가능한 카테고리 목록을 조회합니다.  
     * RCS Biz Center에서 브랜드를 등록할 때 필수 요구되는 카테고리(categoryId, categoryName), 하위 카테고리(subCategoryId, subCategoryName)에 해당하는 카테고리 목록을 조회합니다.   조회된 카테고리, 하위 카테고리 를 이용하여 브랜드 등록 시 지정합니다.      + **계정 권한 : 마스터, 매니저**   + **브랜드 권한 : 브랜드 대표운영자**    
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @return CorpBrandCategoriesGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorpBrandCategoriesGet200Response corpBrandCategoriesGet() throws RestClientException {
        return corpBrandCategoriesGetWithHttpInfo().getBody();
    }

    /**
     * 브랜드 등록 시 사용 가능한 카테고리 목록을 조회합니다.  
     * RCS Biz Center에서 브랜드를 등록할 때 필수 요구되는 카테고리(categoryId, categoryName), 하위 카테고리(subCategoryId, subCategoryName)에 해당하는 카테고리 목록을 조회합니다.   조회된 카테고리, 하위 카테고리 를 이용하여 브랜드 등록 시 지정합니다.      + **계정 권한 : 마스터, 매니저**   + **브랜드 권한 : 브랜드 대표운영자**    
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @return ResponseEntity&lt;CorpBrandCategoriesGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorpBrandCategoriesGet200Response> corpBrandCategoriesGetWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<CorpBrandCategoriesGet200Response> localReturnType = new ParameterizedTypeReference<CorpBrandCategoriesGet200Response>() {};
        return apiClient.invokeAPI("/corp/brand/categories", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 마스터, 매니저 계정을 이용하여 신규 브랜드 등록 승인을 요청합니다. 
     * 마스터, 매니저 계정을 이용하여 신규 브랜드 등록 승인을 요청합니다.(매니저 계정도 브랜드 등록이 가능하도록 권한이 변경되었습니다.)   또한 필수 항목이었던 발신번호는 옵션으로 변경되었습니다.   따라서 발신번호를 함께 등록하는 경우에만 발신번호에 대한 &#39;통신서비스 가입증명원&#39;을 함께 등록하면 됩니다.     브랜드를 등록한 계정은 브랜드의 대표운영자로 설정되며, 매니저 권한으로 등록한 브랜드는 마스터 권한 승급을 받아야 승인을 받을 수 있습니다.        + **계정 권한 : 마스터, 매니저**   
     * <p><b>200</b> - 정상적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param regBrand  (required)
     * @param brandProfile 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : png (최대1MB)**  (required)
     * @param brandBackground 브랜드 백그라운드 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : jpg, png (최대1MB)**  (optional)
     * @param mainMdn 대표발신번호 개념 제거되어 더 이상 유효하지 않습니다. (optional)
     * @param chatbots  (optional)
     * @param subNumCertificate 통신서비스이용증명원을 업로드합니다.   대화방(발신번호) 등록을 위해 chatbots 지정한 경우 필수로 함께 업로드해야 합니다.   **허용되는 파일형식 : jpg, png, pdf, tiff, zip (최대20MB)**    (optional)
     * @return CorpBrandPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorpBrandPost200Response corpBrandPost(RegBrandInfo regBrand, Object brandProfile, Object brandBackground, String mainMdn, CorpBrandPostRequestChatbots chatbots, Object subNumCertificate) throws RestClientException {
        return corpBrandPostWithHttpInfo(regBrand, brandProfile, brandBackground, mainMdn, chatbots, subNumCertificate).getBody();
    }

    /**
     * 마스터, 매니저 계정을 이용하여 신규 브랜드 등록 승인을 요청합니다. 
     * 마스터, 매니저 계정을 이용하여 신규 브랜드 등록 승인을 요청합니다.(매니저 계정도 브랜드 등록이 가능하도록 권한이 변경되었습니다.)   또한 필수 항목이었던 발신번호는 옵션으로 변경되었습니다.   따라서 발신번호를 함께 등록하는 경우에만 발신번호에 대한 &#39;통신서비스 가입증명원&#39;을 함께 등록하면 됩니다.     브랜드를 등록한 계정은 브랜드의 대표운영자로 설정되며, 매니저 권한으로 등록한 브랜드는 마스터 권한 승급을 받아야 승인을 받을 수 있습니다.        + **계정 권한 : 마스터, 매니저**   
     * <p><b>200</b> - 정상적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param regBrand  (required)
     * @param brandProfile 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : png (최대1MB)**  (required)
     * @param brandBackground 브랜드 백그라운드 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : jpg, png (최대1MB)**  (optional)
     * @param mainMdn 대표발신번호 개념 제거되어 더 이상 유효하지 않습니다. (optional)
     * @param chatbots  (optional)
     * @param subNumCertificate 통신서비스이용증명원을 업로드합니다.   대화방(발신번호) 등록을 위해 chatbots 지정한 경우 필수로 함께 업로드해야 합니다.   **허용되는 파일형식 : jpg, png, pdf, tiff, zip (최대20MB)**    (optional)
     * @return ResponseEntity&lt;CorpBrandPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorpBrandPost200Response> corpBrandPostWithHttpInfo(RegBrandInfo regBrand, Object brandProfile, Object brandBackground, String mainMdn, CorpBrandPostRequestChatbots chatbots, Object subNumCertificate) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'regBrand' is set
        if (regBrand == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'regBrand' when calling corpBrandPost");
        }
        
        // verify the required parameter 'brandProfile' is set
        if (brandProfile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandProfile' when calling corpBrandPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (regBrand != null)
            localVarFormParams.add("regBrand", regBrand);
        if (brandProfile != null)
            localVarFormParams.add("brandProfile", brandProfile);
        if (brandBackground != null)
            localVarFormParams.add("brandBackground", brandBackground);
        if (mainMdn != null)
            localVarFormParams.add("mainMdn", mainMdn);
        if (chatbots != null)
            localVarFormParams.add("chatbots", chatbots);
        if (subNumCertificate != null)
            localVarFormParams.add("subNumCertificate", subNumCertificate);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<CorpBrandPost200Response> localReturnType = new ParameterizedTypeReference<CorpBrandPost200Response>() {};
        return apiClient.invokeAPI("/corp/brand", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 승인대기 중인 브랜드의 승인요청을 취소합니다.   
     * 승인대기 중인 브랜드의 승인요청을 취소합니다.   브랜드 대표운영자 또는 운영자 권한이 있어야 승인요청 취소가 가능합니다.   검수가 시작된 브랜드는 승인취소가 불가 합니다.      + **계정 권한 : 마스터, 매니저**     + **브랜드 권한 : 대표운영자, 운영자**     + **가능 상태 : 승인대기**   
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자 또는 운영자의 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @return CorpPersonIdBrandBrandIdCancelPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorpPersonIdBrandBrandIdCancelPut200Response corpPersonIdBrandBrandIdCancelPut(String personId, String brandId) throws RestClientException {
        return corpPersonIdBrandBrandIdCancelPutWithHttpInfo(personId, brandId).getBody();
    }

    /**
     * 승인대기 중인 브랜드의 승인요청을 취소합니다.   
     * 승인대기 중인 브랜드의 승인요청을 취소합니다.   브랜드 대표운영자 또는 운영자 권한이 있어야 승인요청 취소가 가능합니다.   검수가 시작된 브랜드는 승인취소가 불가 합니다.      + **계정 권한 : 마스터, 매니저**     + **브랜드 권한 : 대표운영자, 운영자**     + **가능 상태 : 승인대기**   
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자 또는 운영자의 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @return ResponseEntity&lt;CorpPersonIdBrandBrandIdCancelPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorpPersonIdBrandBrandIdCancelPut200Response> corpPersonIdBrandBrandIdCancelPutWithHttpInfo(String personId, String brandId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling corpPersonIdBrandBrandIdCancelPut");
        }
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling corpPersonIdBrandBrandIdCancelPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("brandId", brandId);

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

        ParameterizedTypeReference<CorpPersonIdBrandBrandIdCancelPut200Response> localReturnType = new ParameterizedTypeReference<CorpPersonIdBrandBrandIdCancelPut200Response>() {};
        return apiClient.invokeAPI("/corp/{personId}/brand/{brandId}/cancel", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드를 삭제합니다. 
     * 브랜드를 삭제합니다.   브랜드 삭제를 위해서는 토큰 발급계정과 personId가 동일해야 하며 brandId에 대한 브랜드 대표운영자 권한이 있어야 합니다.   승인을 받지 않은 &#39;반려&#39;, &#39;저장&#39; 상태의 브랜드는 즉시 삭제 가능합니다.   **승인된 브랜드의 경우 등록된 발신번호, 템플릿을 먼저 삭제한 후 브랜드를 삭제해야 처리됩니다.**      + **계정 권한 : 마스터**     + **브랜드 권한 : 대표운영자**     + **삭제 가능 상태 : 승인, 반려, 저장** 
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @return CorpPersonIdBrandBrandIdDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorpPersonIdBrandBrandIdDelete200Response corpPersonIdBrandBrandIdDelete(String personId, String brandId) throws RestClientException {
        return corpPersonIdBrandBrandIdDeleteWithHttpInfo(personId, brandId).getBody();
    }

    /**
     * 브랜드를 삭제합니다. 
     * 브랜드를 삭제합니다.   브랜드 삭제를 위해서는 토큰 발급계정과 personId가 동일해야 하며 brandId에 대한 브랜드 대표운영자 권한이 있어야 합니다.   승인을 받지 않은 &#39;반려&#39;, &#39;저장&#39; 상태의 브랜드는 즉시 삭제 가능합니다.   **승인된 브랜드의 경우 등록된 발신번호, 템플릿을 먼저 삭제한 후 브랜드를 삭제해야 처리됩니다.**      + **계정 권한 : 마스터**     + **브랜드 권한 : 대표운영자**     + **삭제 가능 상태 : 승인, 반려, 저장** 
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @return ResponseEntity&lt;CorpPersonIdBrandBrandIdDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorpPersonIdBrandBrandIdDelete200Response> corpPersonIdBrandBrandIdDeleteWithHttpInfo(String personId, String brandId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling corpPersonIdBrandBrandIdDelete");
        }
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling corpPersonIdBrandBrandIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("brandId", brandId);

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

        ParameterizedTypeReference<CorpPersonIdBrandBrandIdDelete200Response> localReturnType = new ParameterizedTypeReference<CorpPersonIdBrandBrandIdDelete200Response>() {};
        return apiClient.invokeAPI("/corp/{personId}/brand/{brandId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드 상세 정보를 조회합니다. 
     * 관리 중인 브랜드의 상세 정보를 조회합니다.      + **계정 권한 : 마스터, 매니저**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 정상적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자 또는 운영자의 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @return CorpPersonIdBrandBrandIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorpPersonIdBrandBrandIdGet200Response corpPersonIdBrandBrandIdGet(String personId, String brandId) throws RestClientException {
        return corpPersonIdBrandBrandIdGetWithHttpInfo(personId, brandId).getBody();
    }

    /**
     * 브랜드 상세 정보를 조회합니다. 
     * 관리 중인 브랜드의 상세 정보를 조회합니다.      + **계정 권한 : 마스터, 매니저**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 정상적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자 또는 운영자의 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @return ResponseEntity&lt;CorpPersonIdBrandBrandIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorpPersonIdBrandBrandIdGet200Response> corpPersonIdBrandBrandIdGetWithHttpInfo(String personId, String brandId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling corpPersonIdBrandBrandIdGet");
        }
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling corpPersonIdBrandBrandIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("brandId", brandId);

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

        ParameterizedTypeReference<CorpPersonIdBrandBrandIdGet200Response> localReturnType = new ParameterizedTypeReference<CorpPersonIdBrandBrandIdGet200Response>() {};
        return apiClient.invokeAPI("/corp/{personId}/brand/{brandId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드에 등록된 운영 권한 정보를 조회합니다. 
     * 브랜드에 등록된 운영 권한 정보를 조회합니다. 브랜드에 등록된 브랜드 대표운영자, 운영자, 권한 지정 대행사 정보를 제공합니다.      + **계정 권한: 마스터, 매니저**   + **브랜드 권한: 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자 또는 운영자 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @return CorpPersonIdBrandBrandIdPrivilegeGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorpPersonIdBrandBrandIdPrivilegeGet200Response corpPersonIdBrandBrandIdPrivilegeGet(String personId, String brandId) throws RestClientException {
        return corpPersonIdBrandBrandIdPrivilegeGetWithHttpInfo(personId, brandId).getBody();
    }

    /**
     * 브랜드에 등록된 운영 권한 정보를 조회합니다. 
     * 브랜드에 등록된 운영 권한 정보를 조회합니다. 브랜드에 등록된 브랜드 대표운영자, 운영자, 권한 지정 대행사 정보를 제공합니다.      + **계정 권한: 마스터, 매니저**   + **브랜드 권한: 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자 또는 운영자 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @return ResponseEntity&lt;CorpPersonIdBrandBrandIdPrivilegeGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorpPersonIdBrandBrandIdPrivilegeGet200Response> corpPersonIdBrandBrandIdPrivilegeGetWithHttpInfo(String personId, String brandId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling corpPersonIdBrandBrandIdPrivilegeGet");
        }
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling corpPersonIdBrandBrandIdPrivilegeGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("brandId", brandId);

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

        ParameterizedTypeReference<CorpPersonIdBrandBrandIdPrivilegeGet200Response> localReturnType = new ParameterizedTypeReference<CorpPersonIdBrandBrandIdPrivilegeGet200Response>() {};
        return apiClient.invokeAPI("/corp/{personId}/brand/{brandId}/privilege", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드 운영자 권한 중 지정한 대상을 삭제합니다. 
     * 브랜드 운영자(마스터, 매니저), 운영자(대행사) 권한 중 지정한 대상을 삭제합니다.   대행사가 양방향 대행사인 경우, 권한 삭제 시 대행사가 연결된 양방향 대화방의 연결을 해지합니다.   브랜드 대표운영자는 삭제할 수 없으며 브랜드 대표운영자를 변경하고자 할 경우 PUT 메서드를 사용하여야 합니다.    + **계정 권한 : 마스터**   + **브랜드 권한: 브랜드 대표운영자** 
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param id 브랜드 운영자(마스터, 매니저) 또는 운영자(대행사) ID 입니다. (required)
     * @return CorpPersonIdBrandBrandIdPrivilegeGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorpPersonIdBrandBrandIdPrivilegeGet200Response corpPersonIdBrandBrandIdPrivilegeIdDelete(String personId, String brandId, String id) throws RestClientException {
        return corpPersonIdBrandBrandIdPrivilegeIdDeleteWithHttpInfo(personId, brandId, id).getBody();
    }

    /**
     * 브랜드 운영자 권한 중 지정한 대상을 삭제합니다. 
     * 브랜드 운영자(마스터, 매니저), 운영자(대행사) 권한 중 지정한 대상을 삭제합니다.   대행사가 양방향 대행사인 경우, 권한 삭제 시 대행사가 연결된 양방향 대화방의 연결을 해지합니다.   브랜드 대표운영자는 삭제할 수 없으며 브랜드 대표운영자를 변경하고자 할 경우 PUT 메서드를 사용하여야 합니다.    + **계정 권한 : 마스터**   + **브랜드 권한: 브랜드 대표운영자** 
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param id 브랜드 운영자(마스터, 매니저) 또는 운영자(대행사) ID 입니다. (required)
     * @return ResponseEntity&lt;CorpPersonIdBrandBrandIdPrivilegeGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorpPersonIdBrandBrandIdPrivilegeGet200Response> corpPersonIdBrandBrandIdPrivilegeIdDeleteWithHttpInfo(String personId, String brandId, String id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling corpPersonIdBrandBrandIdPrivilegeIdDelete");
        }
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling corpPersonIdBrandBrandIdPrivilegeIdDelete");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling corpPersonIdBrandBrandIdPrivilegeIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("brandId", brandId);
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<CorpPersonIdBrandBrandIdPrivilegeGet200Response> localReturnType = new ParameterizedTypeReference<CorpPersonIdBrandBrandIdPrivilegeGet200Response>() {};
        return apiClient.invokeAPI("/corp/{personId}/brand/{brandId}/privilege/{id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드 대표운영자가 브랜드 내 운영자(기업의 마스터/매니저, 대행사) 권한을 부여 합니다. 
     * 브랜드 대표운영자가 브랜드 내 운영자(기업의 마스터/매니저, 대행사) 권한을 부여 합니다.      + **계정 권한 : 마스터**   + **브랜드 권한 : 브랜드 대표운영자** 
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자의 계정 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param corpPersonIdBrandBrandIdPrivilegePostRequest + privilegeType이 SubManager 인 경우, 소속된 기업 내 다른 마스터, 매니저 계정을 운영자로 지정할 수 있습니다.   + privilegeType이 Agency 인 경우, 별도의 RCS 발송 계약을 맺은 대행사를 운영자로 지정합니다.    (optional)
     * @return CorpPersonIdBrandBrandIdPrivilegeGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorpPersonIdBrandBrandIdPrivilegeGet200Response corpPersonIdBrandBrandIdPrivilegePost(String personId, String brandId, CorpPersonIdBrandBrandIdPrivilegePostRequest corpPersonIdBrandBrandIdPrivilegePostRequest) throws RestClientException {
        return corpPersonIdBrandBrandIdPrivilegePostWithHttpInfo(personId, brandId, corpPersonIdBrandBrandIdPrivilegePostRequest).getBody();
    }

    /**
     * 브랜드 대표운영자가 브랜드 내 운영자(기업의 마스터/매니저, 대행사) 권한을 부여 합니다. 
     * 브랜드 대표운영자가 브랜드 내 운영자(기업의 마스터/매니저, 대행사) 권한을 부여 합니다.      + **계정 권한 : 마스터**   + **브랜드 권한 : 브랜드 대표운영자** 
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자의 계정 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param corpPersonIdBrandBrandIdPrivilegePostRequest + privilegeType이 SubManager 인 경우, 소속된 기업 내 다른 마스터, 매니저 계정을 운영자로 지정할 수 있습니다.   + privilegeType이 Agency 인 경우, 별도의 RCS 발송 계약을 맺은 대행사를 운영자로 지정합니다.    (optional)
     * @return ResponseEntity&lt;CorpPersonIdBrandBrandIdPrivilegeGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorpPersonIdBrandBrandIdPrivilegeGet200Response> corpPersonIdBrandBrandIdPrivilegePostWithHttpInfo(String personId, String brandId, CorpPersonIdBrandBrandIdPrivilegePostRequest corpPersonIdBrandBrandIdPrivilegePostRequest) throws RestClientException {
        Object localVarPostBody = corpPersonIdBrandBrandIdPrivilegePostRequest;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling corpPersonIdBrandBrandIdPrivilegePost");
        }
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling corpPersonIdBrandBrandIdPrivilegePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("brandId", brandId);

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

        ParameterizedTypeReference<CorpPersonIdBrandBrandIdPrivilegeGet200Response> localReturnType = new ParameterizedTypeReference<CorpPersonIdBrandBrandIdPrivilegeGet200Response>() {};
        return apiClient.invokeAPI("/corp/{personId}/brand/{brandId}/privilege", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드 대표운영자 권한을 위임합니다. 
     * 브랜드 대표운영자 권한을 지정된 마스터에게 위임합니다.   브랜드 대표운영자 변경 시 위임전 대표운영자는 운영자로 변경됩니다.      + **계정 권한 : 마스터**     + **브랜드 권한 : 브랜드 대표운영자** 
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param corpPersonIdBrandBrandIdPrivilegePutRequest - privilegeType이 Manager 만 허용되며 지정한 마스터 ID를 대표운영자로 설정합니다.   (optional)
     * @return CorpPersonIdBrandBrandIdPrivilegeGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorpPersonIdBrandBrandIdPrivilegeGet200Response corpPersonIdBrandBrandIdPrivilegePut(String personId, String brandId, CorpPersonIdBrandBrandIdPrivilegePutRequest corpPersonIdBrandBrandIdPrivilegePutRequest) throws RestClientException {
        return corpPersonIdBrandBrandIdPrivilegePutWithHttpInfo(personId, brandId, corpPersonIdBrandBrandIdPrivilegePutRequest).getBody();
    }

    /**
     * 브랜드 대표운영자 권한을 위임합니다. 
     * 브랜드 대표운영자 권한을 지정된 마스터에게 위임합니다.   브랜드 대표운영자 변경 시 위임전 대표운영자는 운영자로 변경됩니다.      + **계정 권한 : 마스터**     + **브랜드 권한 : 브랜드 대표운영자** 
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param corpPersonIdBrandBrandIdPrivilegePutRequest - privilegeType이 Manager 만 허용되며 지정한 마스터 ID를 대표운영자로 설정합니다.   (optional)
     * @return ResponseEntity&lt;CorpPersonIdBrandBrandIdPrivilegeGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorpPersonIdBrandBrandIdPrivilegeGet200Response> corpPersonIdBrandBrandIdPrivilegePutWithHttpInfo(String personId, String brandId, CorpPersonIdBrandBrandIdPrivilegePutRequest corpPersonIdBrandBrandIdPrivilegePutRequest) throws RestClientException {
        Object localVarPostBody = corpPersonIdBrandBrandIdPrivilegePutRequest;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling corpPersonIdBrandBrandIdPrivilegePut");
        }
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling corpPersonIdBrandBrandIdPrivilegePut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("brandId", brandId);

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

        ParameterizedTypeReference<CorpPersonIdBrandBrandIdPrivilegeGet200Response> localReturnType = new ParameterizedTypeReference<CorpPersonIdBrandBrandIdPrivilegeGet200Response>() {};
        return apiClient.invokeAPI("/corp/{personId}/brand/{brandId}/privilege", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 현재 운영 중인 브랜드 정보를 수정 합니다. 브랜드명, 프로필 이미지가 수정되면 다시 승인을 받아야 합니다. 
     * 현재 운영 중인 브랜드 정보를 수정 합니다.    브랜드 대표운영자 또는 운영자 권한이 있어야 수정이 가능합니다.   **브랜드명** 또는 **프로필 이미지**가 수정되면 다시 승인을 받아야 합니다.   이외 정보 수정은 별도의 승인 과정 없이 업데이트 됩니다.   수정된 데이터가 이통 3사로 전송되는 과정에서 전송이 지연되거나 장애로 인해 이통 3사 모두 전송이 완료되지 못한 경우,   브랜드 정보 조회 데이터와 단말에서 표시되는 브랜드 홈 정보가 상이할 수 있습니다.      + **계정 권한 : 마스터, 매니저**     + **브랜드 권한 : 대표운영자, 운영자**     + **수정 가능 상태 : 승인, 반려(수정승인)**   
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자 또는 운영자의 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param regBrand  (optional)
     * @param brandProfile 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : png (최대1MB)**  (optional)
     * @param brandBackground 브랜드 백그라운드 이미지를 업로드합니다.   등록되어 있는 브랜드 백그라운드 이미지를 제거하기 위해서는 파일 없이 brandBackground form key만 전송하면 됩니다.\\\\ **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : jpg, png (최대1MB)**  (optional)
     * @param mainMdn 대표발신번호 개념 제거되어 더 이상 유효하지 않습니다. (optional)
     * @return CorpPersonIdBrandBrandIdPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorpPersonIdBrandBrandIdPut200Response corpPersonIdBrandBrandIdPut(String personId, String brandId, RegBrandInfo regBrand, File brandProfile, File brandBackground, String mainMdn) throws RestClientException {
        return corpPersonIdBrandBrandIdPutWithHttpInfo(personId, brandId, regBrand, brandProfile, brandBackground, mainMdn).getBody();
    }

    /**
     * 현재 운영 중인 브랜드 정보를 수정 합니다. 브랜드명, 프로필 이미지가 수정되면 다시 승인을 받아야 합니다. 
     * 현재 운영 중인 브랜드 정보를 수정 합니다.    브랜드 대표운영자 또는 운영자 권한이 있어야 수정이 가능합니다.   **브랜드명** 또는 **프로필 이미지**가 수정되면 다시 승인을 받아야 합니다.   이외 정보 수정은 별도의 승인 과정 없이 업데이트 됩니다.   수정된 데이터가 이통 3사로 전송되는 과정에서 전송이 지연되거나 장애로 인해 이통 3사 모두 전송이 완료되지 못한 경우,   브랜드 정보 조회 데이터와 단말에서 표시되는 브랜드 홈 정보가 상이할 수 있습니다.      + **계정 권한 : 마스터, 매니저**     + **브랜드 권한 : 대표운영자, 운영자**     + **수정 가능 상태 : 승인, 반려(수정승인)**   
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자 또는 운영자의 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param regBrand  (optional)
     * @param brandProfile 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : png (최대1MB)**  (optional)
     * @param brandBackground 브랜드 백그라운드 이미지를 업로드합니다.   등록되어 있는 브랜드 백그라운드 이미지를 제거하기 위해서는 파일 없이 brandBackground form key만 전송하면 됩니다.\\\\ **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : jpg, png (최대1MB)**  (optional)
     * @param mainMdn 대표발신번호 개념 제거되어 더 이상 유효하지 않습니다. (optional)
     * @return ResponseEntity&lt;CorpPersonIdBrandBrandIdPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorpPersonIdBrandBrandIdPut200Response> corpPersonIdBrandBrandIdPutWithHttpInfo(String personId, String brandId, RegBrandInfo regBrand, File brandProfile, File brandBackground, String mainMdn) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling corpPersonIdBrandBrandIdPut");
        }
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling corpPersonIdBrandBrandIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);
        uriVariables.put("brandId", brandId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (regBrand != null)
            localVarFormParams.add("regBrand", regBrand);
        if (brandProfile != null)
            localVarFormParams.add("brandProfile", new FileSystemResource(brandProfile));
        if (brandBackground != null)
            localVarFormParams.add("brandBackground", new FileSystemResource(brandBackground));
        if (mainMdn != null)
            localVarFormParams.add("mainMdn", mainMdn);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<CorpPersonIdBrandBrandIdPut200Response> localReturnType = new ParameterizedTypeReference<CorpPersonIdBrandBrandIdPut200Response>() {};
        return apiClient.invokeAPI("/corp/{personId}/brand/{brandId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 마스터 또는 매니저 계정으로 운영 권한이 있는 브랜드 목록을 조회합니다. 
     * 마스터 또는 매니저 계정으로 운영 권한이 있는 브랜드 목록을 조회합니다.      + **계정 권한 : 마스터, 매니저**   + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자 또는 운영자의 계정(마스터, 매니저) ID 입니다. (required)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return CorpPersonIdBrandGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorpPersonIdBrandGet200Response corpPersonIdBrandGet(String personId, Integer offset, Integer limit) throws RestClientException {
        return corpPersonIdBrandGetWithHttpInfo(personId, offset, limit).getBody();
    }

    /**
     * 마스터 또는 매니저 계정으로 운영 권한이 있는 브랜드 목록을 조회합니다. 
     * 마스터 또는 매니저 계정으로 운영 권한이 있는 브랜드 목록을 조회합니다.      + **계정 권한 : 마스터, 매니저**   + **브랜드 권한 : 브랜드 대표운영자, 운영자** 
     * <p><b>200</b> - 
     * <p><b>0</b>
     * @param personId 브랜드 대표운영자 또는 운영자의 계정(마스터, 매니저) ID 입니다. (required)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return ResponseEntity&lt;CorpPersonIdBrandGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorpPersonIdBrandGet200Response> corpPersonIdBrandGetWithHttpInfo(String personId, Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'personId' is set
        if (personId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'personId' when calling corpPersonIdBrandGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("personId", personId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<CorpPersonIdBrandGet200Response> localReturnType = new ParameterizedTypeReference<CorpPersonIdBrandGet200Response>() {};
        return apiClient.invokeAPI("/corp/{personId}/brand", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * RBC에서 제공되는 기본 아이콘 이미지 정보를 조회합니다. 
     * RBC에서 제공되는 기본 아이콘 이미지 정보를 조회합니다.   조회된 파일 ID를 메시지 발송 시 또는 템플릿 등록 시 사용할 수 있습니다.      + **계정 권한 : 마스터, 매니저, 대행사** 
     * <p><b>200</b> - 기본 아이콘 이미지 리스트를 응답합니다. 
     * <p><b>0</b>
     * @return LogoCommonGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public LogoCommonGet200Response logoCommonGet() throws RestClientException {
        return logoCommonGetWithHttpInfo().getBody();
    }

    /**
     * RBC에서 제공되는 기본 아이콘 이미지 정보를 조회합니다. 
     * RBC에서 제공되는 기본 아이콘 이미지 정보를 조회합니다.   조회된 파일 ID를 메시지 발송 시 또는 템플릿 등록 시 사용할 수 있습니다.      + **계정 권한 : 마스터, 매니저, 대행사** 
     * <p><b>200</b> - 기본 아이콘 이미지 리스트를 응답합니다. 
     * <p><b>0</b>
     * @return ResponseEntity&lt;LogoCommonGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<LogoCommonGet200Response> logoCommonGetWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<LogoCommonGet200Response> localReturnType = new ParameterizedTypeReference<LogoCommonGet200Response>() {};
        return apiClient.invokeAPI("/logo/common", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
    /**
     * (준비중) 브랜드프로필 노출 통계를 조회합니다. 
     * (준비중)    브랜드프로필 노출 통계를 조회합니다.    - 브랜드 프로필 이미지가 단말에 표시되면 일자별로 집계됩니다.    - 단말에서 브랜드 프로필은 대화방별로 노출되므로 통계 데이터는 브랜드에 등록된 대화방별 건수로 제공됩니다.   - 통계 조회 기간은 데이터 존재 시 최근 1년 6개월 이내 기간 중 최대 31일까지 검색 가능합니다.    + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  
     * <p><b>200</b> - 성공적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param startDate 통계 조회 기간 시작일자(yyyymmdd) 입니다. (required)
     * @param endDate 통계 조회 기간 종료일자(yyyymmdd) 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return StatQueryBrandprofileBrandIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatQueryBrandprofileBrandIdGet200Response statQueryBrandprofileBrandIdGet(String brandId, String startDate, String endDate, String xRCSBrandkey) throws RestClientException {
        return statQueryBrandprofileBrandIdGetWithHttpInfo(brandId, startDate, endDate, xRCSBrandkey).getBody();
    }

    /**
     * (준비중) 브랜드프로필 노출 통계를 조회합니다. 
     * (준비중)    브랜드프로필 노출 통계를 조회합니다.    - 브랜드 프로필 이미지가 단말에 표시되면 일자별로 집계됩니다.    - 단말에서 브랜드 프로필은 대화방별로 노출되므로 통계 데이터는 브랜드에 등록된 대화방별 건수로 제공됩니다.   - 통계 조회 기간은 데이터 존재 시 최근 1년 6개월 이내 기간 중 최대 31일까지 검색 가능합니다.    + **계정 권한: 마스터, 매니저, 대행사**     + **브랜드 권한: 브랜드 대표운영자, 운영자**  
     * <p><b>200</b> - 성공적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param startDate 통계 조회 기간 시작일자(yyyymmdd) 입니다. (required)
     * @param endDate 통계 조회 기간 종료일자(yyyymmdd) 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;StatQueryBrandprofileBrandIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatQueryBrandprofileBrandIdGet200Response> statQueryBrandprofileBrandIdGetWithHttpInfo(String brandId, String startDate, String endDate, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling statQueryBrandprofileBrandIdGet");
        }
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling statQueryBrandprofileBrandIdGet");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling statQueryBrandprofileBrandIdGet");
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
        

        if (xRCSBrandkey != null)
        localVarHeaderParams.add("X-RCS-Brandkey", apiClient.parameterToString(xRCSBrandkey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "jwtAuth" };

        ParameterizedTypeReference<StatQueryBrandprofileBrandIdGet200Response> localReturnType = new ParameterizedTypeReference<StatQueryBrandprofileBrandIdGet200Response>() {};
        return apiClient.invokeAPI("/statQuery/brandprofile/{brandId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
    /**
     * 대화방ID 등록 가능 여부를 조회 합니다. 
     * 대화방ID 등록 가능 여부를 조회 합니다. 등록 가능한 경우 200 OK 응답으로 리턴되며, 대화방ID 형식 부적합, 이미 등록된 대화방ID 등  등록이 불가능한 경우 400 Error 리턴됩니다.    + 발신번호 조회 시에는 숫자만 입력해야 합니다.       - 발신번호 조회 시 숫자 이외 &#39;-&#39;을 삽입할 경우 양방향 대화방ID로 인식될 수 있으므로 주의해 주세요.     + 양방향 대화방ID 조회 시에는 영문, 숫자, &#39;-&#39;, &#39;_&#39; 사용이 가능합니다.       - 양방향 대화방ID 영문 대문자는 소문자로 변환됩니다.      + **계정 권한: 대행사**   
     * <p><b>200</b> - 대화방ID 등록이 가능할 경우 응답됩니다. 
     * <p><b>0</b>
     * @param chatbotId 확인하고자 하는 대화방ID 입니다. (required)
     * @return UsableQueryChatbotIdChatbotIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UsableQueryChatbotIdChatbotIdGet200Response usableQueryChatbotIdChatbotIdGet(String chatbotId) throws RestClientException {
        return usableQueryChatbotIdChatbotIdGetWithHttpInfo(chatbotId).getBody();
    }

    /**
     * 대화방ID 등록 가능 여부를 조회 합니다. 
     * 대화방ID 등록 가능 여부를 조회 합니다. 등록 가능한 경우 200 OK 응답으로 리턴되며, 대화방ID 형식 부적합, 이미 등록된 대화방ID 등  등록이 불가능한 경우 400 Error 리턴됩니다.    + 발신번호 조회 시에는 숫자만 입력해야 합니다.       - 발신번호 조회 시 숫자 이외 &#39;-&#39;을 삽입할 경우 양방향 대화방ID로 인식될 수 있으므로 주의해 주세요.     + 양방향 대화방ID 조회 시에는 영문, 숫자, &#39;-&#39;, &#39;_&#39; 사용이 가능합니다.       - 양방향 대화방ID 영문 대문자는 소문자로 변환됩니다.      + **계정 권한: 대행사**   
     * <p><b>200</b> - 대화방ID 등록이 가능할 경우 응답됩니다. 
     * <p><b>0</b>
     * @param chatbotId 확인하고자 하는 대화방ID 입니다. (required)
     * @return ResponseEntity&lt;UsableQueryChatbotIdChatbotIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UsableQueryChatbotIdChatbotIdGet200Response> usableQueryChatbotIdChatbotIdGetWithHttpInfo(String chatbotId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'chatbotId' is set
        if (chatbotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chatbotId' when calling usableQueryChatbotIdChatbotIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("chatbotId", chatbotId);

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

        ParameterizedTypeReference<UsableQueryChatbotIdChatbotIdGet200Response> localReturnType = new ParameterizedTypeReference<UsableQueryChatbotIdChatbotIdGet200Response>() {};
        return apiClient.invokeAPI("/usableQuery/chatbotId/{chatbotId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
