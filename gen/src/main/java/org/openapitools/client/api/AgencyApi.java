package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AgencyAgencyIdAgencyKeyGet200Response;
import org.openapitools.client.model.AgencyAgencyIdContractGet200Response;
import org.openapitools.client.model.AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200Response;
import org.openapitools.client.model.AgencyAgencyIdCorpCorpRegNumGet200Response;
import org.openapitools.client.model.BaselayoutComponentGet200Response;
import org.openapitools.client.model.BaselayoutProductRuleGet200Response;
import org.openapitools.client.model.BaselayoutSampleGet200Response;
import org.openapitools.client.model.BaselayoutSampleSampleLayoutIdGet200Response;
import org.openapitools.client.model.BrandBrandIdAutoreplymsgAutoReplyMsgIdGet200Response;
import org.openapitools.client.model.BrandBrandIdAutoreplymsgFilePost200Response;
import org.openapitools.client.model.BrandBrandIdAutoreplymsgGet200Response;
import org.openapitools.client.model.BrandBrandIdAutoreplymsgPost200Response;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotChatbotIdDelete200Response;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotChatbotIdGet200Response;
import org.openapitools.client.model.BrandBrandIdBidirectionalChatbotChatbotIdPersistentmenuPausePut200Response;
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
import org.openapitools.client.model.BrandBrandIdLayoutGet200Response;
import org.openapitools.client.model.BrandBrandIdLayoutLayoutIdDelete200Response;
import org.openapitools.client.model.BrandBrandIdLayoutLayoutIdGet200Response;
import org.openapitools.client.model.BrandBrandIdLayoutLayoutIdPut200Response;
import org.openapitools.client.model.BrandBrandIdLayoutPost200Response;
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
import org.openapitools.client.model.CorpBrandPostRequestChatbots;
import org.openapitools.client.model.CorpPersonIdBrandBrandIdGet200Response;
import org.openapitools.client.model.CorpPersonIdBrandBrandIdPut200Response;
import java.io.File;
import org.openapitools.client.model.LogoCommonGet200Response;
import org.openapitools.client.model.MessagebaseCommonGet200Response;
import org.openapitools.client.model.MessagebaseCommonMessagebaseIdGet200Response;
import org.openapitools.client.model.MessagebaseMessagebaseformGet200Response;
import org.openapitools.client.model.MessagebaseMessagebaseformMessagebaseformIdGet200Response;
import org.openapitools.client.model.MessagebaseMessagebaseformMessagebaseformIdLogoGet200Response;
import org.openapitools.client.model.ModTemplateInfo;
import org.openapitools.client.model.NotiBidirectional;
import org.openapitools.client.model.OneOf401ErrorInfo403ErrorInfo400ErrorInfo204ErrorInfo;
import org.openapitools.client.model.PausePersistentMenu;
import org.openapitools.client.model.RegAutoReplyMsgInfo;
import org.openapitools.client.model.RegBrandInfo;
import org.openapitools.client.model.RegBrandLayout;
import org.openapitools.client.model.RegChatbotInfo;
import org.openapitools.client.model.RegMessagebaseInfo;
import org.openapitools.client.model.RegTemplateInfo;
import org.openapitools.client.model.StatQueryBrandprofileBrandIdGet200Response;
import org.openapitools.client.model.StatQueryMessageBrandIdGet200Response;
import org.openapitools.client.model.StatQueryMessageButtonBrandIdGet200Response;
import org.openapitools.client.model.StatQueryPersistentMenuBrandIdGet200Response;
import org.openapitools.client.model.UsableQueryChatbotIdChatbotIdGet200Response;
import org.openapitools.client.model.WebhookErrorInfo;
import org.openapitools.client.model.WebhookUrlPostRequest;

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
public class AgencyApi {
    private ApiClient apiClient;

    public AgencyApi() {
        this(new ApiClient());
    }

    public AgencyApi(ApiClient apiClient) {
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
     * 계약된 브랜드 정보를 개별 조회 합니다. 
     * 계약된 브랜드 정보를 개별 조회 합니다.   승인된 브랜드만 조회가 가능합니다.     + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 
     * <p><b>200</b> - 조회된 브랜드 정보를 응답합니다. 
     * <p><b>0</b>
     * @param agencyId RCS Biz Center에 등록된 대행사 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @return CorpPersonIdBrandBrandIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorpPersonIdBrandBrandIdGet200Response agencyAgencyIdBrandBrandIdGet(String agencyId, String brandId) throws RestClientException {
        return agencyAgencyIdBrandBrandIdGetWithHttpInfo(agencyId, brandId).getBody();
    }

    /**
     * 계약된 브랜드 정보를 개별 조회 합니다. 
     * 계약된 브랜드 정보를 개별 조회 합니다.   승인된 브랜드만 조회가 가능합니다.     + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 
     * <p><b>200</b> - 조회된 브랜드 정보를 응답합니다. 
     * <p><b>0</b>
     * @param agencyId RCS Biz Center에 등록된 대행사 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @return ResponseEntity&lt;CorpPersonIdBrandBrandIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorpPersonIdBrandBrandIdGet200Response> agencyAgencyIdBrandBrandIdGetWithHttpInfo(String agencyId, String brandId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'agencyId' is set
        if (agencyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'agencyId' when calling agencyAgencyIdBrandBrandIdGet");
        }
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling agencyAgencyIdBrandBrandIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("agencyId", agencyId);
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
        return apiClient.invokeAPI("/agency/{agencyId}/brand/{brandId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 대행사가 운영 중인 브랜드 정보를 수정 합니다. 브랜드명, 프로필 이미지가 수정되면 다시 승인을 받아야 합니다. 
     * 대행사 계정으로 현재 운영 중인 브랜드 정보를 수정 합니다.    브랜드 권한(Contract)이 있어야 수정이 가능하며 Header에 브랜드 Key를 삽입하여야 합니다.   **브랜드명** 또는 **프로필 이미지**가 수정되면 다시 승인을 받아야 합니다. 상태가 **승인대기**로 변경 됩니다.   이외 정보 수정은 별도의 승인 과정 없이 업데이트 됩니다.   수정된 데이터가 이통 3사로 전송되는 과정에서 전송이 지연되거나 장애로 인해 이통 3사 모두 전송이 완료되지 못한 경우,   브랜드 정보 조회 데이터와 단말에서 표시되는 브랜드 홈 정보가 상이할 수 있습니다.      + **계정 권한 : 대행사**     + **브랜드 권한 : 운영자**     + **수정 가능 상태 : 승인, 반려(수정승인)**     + **수정 승인 요청 시 상태 : 승인대기(수정승인)** 
     * <p><b>200</b> - 정상적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param agencyId 브랜드의 운영 권한이 있는 대행사 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param regBrand  (optional)
     * @param brandProfile 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : png (최대1MB)**  (optional)
     * @param brandBackground 브랜드 백그라운드 이미지를 업로드합니다.   등록되어 있는 브랜드 백그라운드 이미지를 제거하기 위해서는 파일 없이 brandBackground form key만 전송하면 됩니다.\\\\ **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : jpg, png (최대1MB)**  (optional)
     * @return CorpPersonIdBrandBrandIdPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CorpPersonIdBrandBrandIdPut200Response agencyAgencyIdBrandBrandIdPut(String agencyId, String brandId, String xRCSBrandkey, RegBrandInfo regBrand, File brandProfile, File brandBackground) throws RestClientException {
        return agencyAgencyIdBrandBrandIdPutWithHttpInfo(agencyId, brandId, xRCSBrandkey, regBrand, brandProfile, brandBackground).getBody();
    }

    /**
     * 대행사가 운영 중인 브랜드 정보를 수정 합니다. 브랜드명, 프로필 이미지가 수정되면 다시 승인을 받아야 합니다. 
     * 대행사 계정으로 현재 운영 중인 브랜드 정보를 수정 합니다.    브랜드 권한(Contract)이 있어야 수정이 가능하며 Header에 브랜드 Key를 삽입하여야 합니다.   **브랜드명** 또는 **프로필 이미지**가 수정되면 다시 승인을 받아야 합니다. 상태가 **승인대기**로 변경 됩니다.   이외 정보 수정은 별도의 승인 과정 없이 업데이트 됩니다.   수정된 데이터가 이통 3사로 전송되는 과정에서 전송이 지연되거나 장애로 인해 이통 3사 모두 전송이 완료되지 못한 경우,   브랜드 정보 조회 데이터와 단말에서 표시되는 브랜드 홈 정보가 상이할 수 있습니다.      + **계정 권한 : 대행사**     + **브랜드 권한 : 운영자**     + **수정 가능 상태 : 승인, 반려(수정승인)**     + **수정 승인 요청 시 상태 : 승인대기(수정승인)** 
     * <p><b>200</b> - 정상적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param agencyId 브랜드의 운영 권한이 있는 대행사 ID 입니다. (required)
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param regBrand  (optional)
     * @param brandProfile 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : png (최대1MB)**  (optional)
     * @param brandBackground 브랜드 백그라운드 이미지를 업로드합니다.   등록되어 있는 브랜드 백그라운드 이미지를 제거하기 위해서는 파일 없이 brandBackground form key만 전송하면 됩니다.\\\\ **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : jpg, png (최대1MB)**  (optional)
     * @return ResponseEntity&lt;CorpPersonIdBrandBrandIdPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CorpPersonIdBrandBrandIdPut200Response> agencyAgencyIdBrandBrandIdPutWithHttpInfo(String agencyId, String brandId, String xRCSBrandkey, RegBrandInfo regBrand, File brandProfile, File brandBackground) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'agencyId' is set
        if (agencyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'agencyId' when calling agencyAgencyIdBrandBrandIdPut");
        }
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling agencyAgencyIdBrandBrandIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("agencyId", agencyId);
        uriVariables.put("brandId", brandId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xRCSBrandkey != null)
        localVarHeaderParams.add("X-RCS-Brandkey", apiClient.parameterToString(xRCSBrandkey));

        if (regBrand != null)
            localVarFormParams.add("regBrand", regBrand);
        if (brandProfile != null)
            localVarFormParams.add("brandProfile", new FileSystemResource(brandProfile));
        if (brandBackground != null)
            localVarFormParams.add("brandBackground", new FileSystemResource(brandBackground));

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
        return apiClient.invokeAPI("/agency/{agencyId}/brand/{brandId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 대행사가 계약된 브랜드 리스트를 제공합니다. 
     * 대행사가 계약된 브랜드 리스트를 제공합니다.   브랜드별 기업의 사업자등록번호를 함께 전달 하여 대행사에 등록된 기업 정보와 맵핑할 수 있습니다.      + **계정 권한: 대행사**   
     * <p><b>200</b> - 정상적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param agencyId RCS Biz Center에 등록된 대행사 ID 입니다. (required)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return AgencyAgencyIdContractGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AgencyAgencyIdContractGet200Response agencyAgencyIdContractGet(String agencyId, Integer offset, Integer limit) throws RestClientException {
        return agencyAgencyIdContractGetWithHttpInfo(agencyId, offset, limit).getBody();
    }

    /**
     * 대행사가 계약된 브랜드 리스트를 제공합니다. 
     * 대행사가 계약된 브랜드 리스트를 제공합니다.   브랜드별 기업의 사업자등록번호를 함께 전달 하여 대행사에 등록된 기업 정보와 맵핑할 수 있습니다.      + **계정 권한: 대행사**   
     * <p><b>200</b> - 정상적으로 처리된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param agencyId RCS Biz Center에 등록된 대행사 ID 입니다. (required)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return ResponseEntity&lt;AgencyAgencyIdContractGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AgencyAgencyIdContractGet200Response> agencyAgencyIdContractGetWithHttpInfo(String agencyId, Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'agencyId' is set
        if (agencyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'agencyId' when calling agencyAgencyIdContractGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("agencyId", agencyId);

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

        ParameterizedTypeReference<AgencyAgencyIdContractGet200Response> localReturnType = new ParameterizedTypeReference<AgencyAgencyIdContractGet200Response>() {};
        return apiClient.invokeAPI("/agency/{agencyId}/contract", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 대행사가 계약된 브랜드를 기업 단위로 조회합니다. 
     * 대행사가 계약된 브랜드를 기업 단위로 조회합니다.   기업 단위 조회 시 사업자등록번호를 이용합니다.      + **계정 권한: 대행사**   
     * <p><b>200</b> - 계약된 브랜드 목록이 응답됩니다. 
     * <p><b>0</b>
     * @param agencyId RCS Biz Center에 등록된 대행사 ID 입니다. (required)
     * @param corpRegNum 대상 기업의 사업자등록번호(10자리) 입니다. (required)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return AgencyAgencyIdContractGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AgencyAgencyIdContractGet200Response agencyAgencyIdCorpCorpRegNumBrandGet(String agencyId, String corpRegNum, Integer offset, Integer limit) throws RestClientException {
        return agencyAgencyIdCorpCorpRegNumBrandGetWithHttpInfo(agencyId, corpRegNum, offset, limit).getBody();
    }

    /**
     * 대행사가 계약된 브랜드를 기업 단위로 조회합니다. 
     * 대행사가 계약된 브랜드를 기업 단위로 조회합니다.   기업 단위 조회 시 사업자등록번호를 이용합니다.      + **계정 권한: 대행사**   
     * <p><b>200</b> - 계약된 브랜드 목록이 응답됩니다. 
     * <p><b>0</b>
     * @param agencyId RCS Biz Center에 등록된 대행사 ID 입니다. (required)
     * @param corpRegNum 대상 기업의 사업자등록번호(10자리) 입니다. (required)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return ResponseEntity&lt;AgencyAgencyIdContractGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AgencyAgencyIdContractGet200Response> agencyAgencyIdCorpCorpRegNumBrandGetWithHttpInfo(String agencyId, String corpRegNum, Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'agencyId' is set
        if (agencyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'agencyId' when calling agencyAgencyIdCorpCorpRegNumBrandGet");
        }
        
        // verify the required parameter 'corpRegNum' is set
        if (corpRegNum == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpRegNum' when calling agencyAgencyIdCorpCorpRegNumBrandGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("agencyId", agencyId);
        uriVariables.put("corpRegNum", corpRegNum);

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

        ParameterizedTypeReference<AgencyAgencyIdContractGet200Response> localReturnType = new ParameterizedTypeReference<AgencyAgencyIdContractGet200Response>() {};
        return apiClient.invokeAPI("/agency/{agencyId}/corp/{corpRegNum}/brand", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 발신번호가 RBC에 대상 사업자의 발신번호로 등록되어 있는지 확인할 수 있습니다. 
     * 발신번호가 RBC에 대상 사업자의 발신번호로 등록되어 있는지 확인할 수 있습니다.    + **계정 권한: 대행사**   
     * <p><b>200</b> - 등록 여부 확인 결과를 제공합니다.   
     * <p><b>0</b>
     * @param agencyId RCS Biz Center에 등록된 대행사 ID 입니다. (required)
     * @param corpRegNum 조회 대상 사업자등록번호(10자리) 입니다. (required)
     * @param chatbotId 확인하고자 하는 발신번호 입니다. (required)
     * @return AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200Response agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet(String agencyId, String corpRegNum, String chatbotId) throws RestClientException {
        return agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGetWithHttpInfo(agencyId, corpRegNum, chatbotId).getBody();
    }

    /**
     * 발신번호가 RBC에 대상 사업자의 발신번호로 등록되어 있는지 확인할 수 있습니다. 
     * 발신번호가 RBC에 대상 사업자의 발신번호로 등록되어 있는지 확인할 수 있습니다.    + **계정 권한: 대행사**   
     * <p><b>200</b> - 등록 여부 확인 결과를 제공합니다.   
     * <p><b>0</b>
     * @param agencyId RCS Biz Center에 등록된 대행사 ID 입니다. (required)
     * @param corpRegNum 조회 대상 사업자등록번호(10자리) 입니다. (required)
     * @param chatbotId 확인하고자 하는 발신번호 입니다. (required)
     * @return ResponseEntity&lt;AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200Response> agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGetWithHttpInfo(String agencyId, String corpRegNum, String chatbotId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'agencyId' is set
        if (agencyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'agencyId' when calling agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet");
        }
        
        // verify the required parameter 'corpRegNum' is set
        if (corpRegNum == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpRegNum' when calling agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet");
        }
        
        // verify the required parameter 'chatbotId' is set
        if (chatbotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'chatbotId' when calling agencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("agencyId", agencyId);
        uriVariables.put("corpRegNum", corpRegNum);
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

        ParameterizedTypeReference<AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200Response> localReturnType = new ParameterizedTypeReference<AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200Response>() {};
        return apiClient.invokeAPI("/agency/{agencyId}/corp/{corpRegNum}/chatbot/{chatbotId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 사업자등록번호로 RBC 가입 여부와 브랜드 대행사 지정 상태를 확인할 수 있습니다. 
     * 사업자등록번호로 RBC 가입 여부와 브랜드 대행사 지정 상태를 확인할 수 있습니다.      + **계정 권한: 대행사**   
     * <p><b>200</b> - 가입 여부, 대행사 지정 상태를 응답합니다.   
     * <p><b>0</b>
     * @param agencyId RCS Biz Center에 등록된 대행사 ID 입니다. (required)
     * @param corpRegNum 조회 대상 사업자등록번호(10자리) 입니다. (required)
     * @return AgencyAgencyIdCorpCorpRegNumGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AgencyAgencyIdCorpCorpRegNumGet200Response agencyAgencyIdCorpCorpRegNumGet(String agencyId, String corpRegNum) throws RestClientException {
        return agencyAgencyIdCorpCorpRegNumGetWithHttpInfo(agencyId, corpRegNum).getBody();
    }

    /**
     * 사업자등록번호로 RBC 가입 여부와 브랜드 대행사 지정 상태를 확인할 수 있습니다. 
     * 사업자등록번호로 RBC 가입 여부와 브랜드 대행사 지정 상태를 확인할 수 있습니다.      + **계정 권한: 대행사**   
     * <p><b>200</b> - 가입 여부, 대행사 지정 상태를 응답합니다.   
     * <p><b>0</b>
     * @param agencyId RCS Biz Center에 등록된 대행사 ID 입니다. (required)
     * @param corpRegNum 조회 대상 사업자등록번호(10자리) 입니다. (required)
     * @return ResponseEntity&lt;AgencyAgencyIdCorpCorpRegNumGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AgencyAgencyIdCorpCorpRegNumGet200Response> agencyAgencyIdCorpCorpRegNumGetWithHttpInfo(String agencyId, String corpRegNum) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'agencyId' is set
        if (agencyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'agencyId' when calling agencyAgencyIdCorpCorpRegNumGet");
        }
        
        // verify the required parameter 'corpRegNum' is set
        if (corpRegNum == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'corpRegNum' when calling agencyAgencyIdCorpCorpRegNumGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("agencyId", agencyId);
        uriVariables.put("corpRegNum", corpRegNum);

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

        ParameterizedTypeReference<AgencyAgencyIdCorpCorpRegNumGet200Response> localReturnType = new ParameterizedTypeReference<AgencyAgencyIdCorpCorpRegNumGet200Response>() {};
        return apiClient.invokeAPI("/agency/{agencyId}/corp/{corpRegNum}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 레이아웃 등록/수정 시 사용 가능한 컴포넌트 목록을 조회 합니다. 
     * 레이아웃 등록/수정 시 사용 가능한 컴포넌트 목록을 조회 합니다.   컴포넌트 별 상세 내역이 제공되므로 별도의 컴포넌트별 상세 조회 API는 제공하지 않습니다.      + **계정 권한: 대행사** 
     * <p><b>200</b> - 컴포넌트 리스트를 제공합니다. 
     * <p><b>0</b>
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return BaselayoutComponentGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BaselayoutComponentGet200Response baselayoutComponentGet(Integer offset, Integer limit) throws RestClientException {
        return baselayoutComponentGetWithHttpInfo(offset, limit).getBody();
    }

    /**
     * 레이아웃 등록/수정 시 사용 가능한 컴포넌트 목록을 조회 합니다. 
     * 레이아웃 등록/수정 시 사용 가능한 컴포넌트 목록을 조회 합니다.   컴포넌트 별 상세 내역이 제공되므로 별도의 컴포넌트별 상세 조회 API는 제공하지 않습니다.      + **계정 권한: 대행사** 
     * <p><b>200</b> - 컴포넌트 리스트를 제공합니다. 
     * <p><b>0</b>
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return ResponseEntity&lt;BaselayoutComponentGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BaselayoutComponentGet200Response> baselayoutComponentGetWithHttpInfo(Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<BaselayoutComponentGet200Response> localReturnType = new ParameterizedTypeReference<BaselayoutComponentGet200Response>() {};
        return apiClient.invokeAPI("/baselayout/component", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 메시지 상품별 레이아웃 구성 규칙을 조회합니다. 
     * 메시지 상품별 레이아웃 구성 규칙을 조회합니다.   본 규칙에 부합해야만 레이아웃 등록/수정이 가능합니다.      + **계정 권한: 대행사** 
     * <p><b>200</b> - 상품별 레이아웃 구성 규칙 정보를 응답합니다. 
     * <p><b>0</b>
     * @return BaselayoutProductRuleGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BaselayoutProductRuleGet200Response baselayoutProductRuleGet() throws RestClientException {
        return baselayoutProductRuleGetWithHttpInfo().getBody();
    }

    /**
     * 메시지 상품별 레이아웃 구성 규칙을 조회합니다. 
     * 메시지 상품별 레이아웃 구성 규칙을 조회합니다.   본 규칙에 부합해야만 레이아웃 등록/수정이 가능합니다.      + **계정 권한: 대행사** 
     * <p><b>200</b> - 상품별 레이아웃 구성 규칙 정보를 응답합니다. 
     * <p><b>0</b>
     * @return ResponseEntity&lt;BaselayoutProductRuleGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BaselayoutProductRuleGet200Response> baselayoutProductRuleGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<BaselayoutProductRuleGet200Response> localReturnType = new ParameterizedTypeReference<BaselayoutProductRuleGet200Response>() {};
        return apiClient.invokeAPI("/baselayout/product/rule", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 목록 입니다. 
     * 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 목록 입니다.      + **계정 권한: 대행사** 
     * <p><b>200</b> - 샘플 레이아웃 목록을 제공합니다. 
     * <p><b>0</b>
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return BaselayoutSampleGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BaselayoutSampleGet200Response baselayoutSampleGet(Integer offset, Integer limit) throws RestClientException {
        return baselayoutSampleGetWithHttpInfo(offset, limit).getBody();
    }

    /**
     * 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 목록 입니다. 
     * 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 목록 입니다.      + **계정 권한: 대행사** 
     * <p><b>200</b> - 샘플 레이아웃 목록을 제공합니다. 
     * <p><b>0</b>
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return ResponseEntity&lt;BaselayoutSampleGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BaselayoutSampleGet200Response> baselayoutSampleGetWithHttpInfo(Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<BaselayoutSampleGet200Response> localReturnType = new ParameterizedTypeReference<BaselayoutSampleGet200Response>() {};
        return apiClient.invokeAPI("/baselayout/sample", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 상세 정보를 조회합니다. 
     * 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 상세 정보를 조회합니다.      + **계정 권한: 대행사** 
     * <p><b>200</b> - 샘플 레이아웃 상세 조회 결과를 응답합니다. 
     * <p><b>0</b>
     * @param sampleLayoutId 샘플레이아웃 ID 입니다. (required)
     * @return BaselayoutSampleSampleLayoutIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BaselayoutSampleSampleLayoutIdGet200Response baselayoutSampleSampleLayoutIdGet(String sampleLayoutId) throws RestClientException {
        return baselayoutSampleSampleLayoutIdGetWithHttpInfo(sampleLayoutId).getBody();
    }

    /**
     * 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 상세 정보를 조회합니다. 
     * 레이아웃 등록/수정을 위해 참조용으로 제공되는 샘플 레이아웃 상세 정보를 조회합니다.      + **계정 권한: 대행사** 
     * <p><b>200</b> - 샘플 레이아웃 상세 조회 결과를 응답합니다. 
     * <p><b>0</b>
     * @param sampleLayoutId 샘플레이아웃 ID 입니다. (required)
     * @return ResponseEntity&lt;BaselayoutSampleSampleLayoutIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BaselayoutSampleSampleLayoutIdGet200Response> baselayoutSampleSampleLayoutIdGetWithHttpInfo(String sampleLayoutId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'sampleLayoutId' is set
        if (sampleLayoutId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sampleLayoutId' when calling baselayoutSampleSampleLayoutIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("sampleLayoutId", sampleLayoutId);

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

        ParameterizedTypeReference<BaselayoutSampleSampleLayoutIdGet200Response> localReturnType = new ParameterizedTypeReference<BaselayoutSampleSampleLayoutIdGet200Response>() {};
        return apiClient.invokeAPI("/baselayout/sample/{sampleLayoutId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
     * 브랜드 별 등록된 레이아웃 목록을 조회합니다. 
     * 브랜드 별 등록된 레이아웃 목록을 조회합니다.      + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 
     * <p><b>200</b> - 브랜드 내 등록된 레이아웃 목록을 응답합니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return BrandBrandIdLayoutGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdLayoutGet200Response brandBrandIdLayoutGet(String brandId, String xRCSBrandkey, Integer offset, Integer limit) throws RestClientException {
        return brandBrandIdLayoutGetWithHttpInfo(brandId, xRCSBrandkey, offset, limit).getBody();
    }

    /**
     * 브랜드 별 등록된 레이아웃 목록을 조회합니다. 
     * 브랜드 별 등록된 레이아웃 목록을 조회합니다.      + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 
     * <p><b>200</b> - 브랜드 내 등록된 레이아웃 목록을 응답합니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param offset 시작 offset 번호(default: 0) 입니다. (optional)
     * @param limit 조회 최대 건수(default: 100, maximum: 1000) 입니다. (optional)
     * @return ResponseEntity&lt;BrandBrandIdLayoutGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdLayoutGet200Response> brandBrandIdLayoutGetWithHttpInfo(String brandId, String xRCSBrandkey, Integer offset, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdLayoutGet");
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

        ParameterizedTypeReference<BrandBrandIdLayoutGet200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdLayoutGet200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/layout", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드 별 등록된 레이아웃을 삭제합니다. 
     * 브랜드 별 등록된 레이아웃을 삭제합니다.      + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 
     * <p><b>200</b> - 브랜드 내 레이아웃 정상 삭제 시 응답합니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param layoutId 레이아웃ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdLayoutLayoutIdDelete200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdLayoutLayoutIdDelete200Response brandBrandIdLayoutLayoutIdDelete(String brandId, String layoutId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdLayoutLayoutIdDeleteWithHttpInfo(brandId, layoutId, xRCSBrandkey).getBody();
    }

    /**
     * 브랜드 별 등록된 레이아웃을 삭제합니다. 
     * 브랜드 별 등록된 레이아웃을 삭제합니다.      + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 
     * <p><b>200</b> - 브랜드 내 레이아웃 정상 삭제 시 응답합니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param layoutId 레이아웃ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdLayoutLayoutIdDelete200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdLayoutLayoutIdDelete200Response> brandBrandIdLayoutLayoutIdDeleteWithHttpInfo(String brandId, String layoutId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdLayoutLayoutIdDelete");
        }
        
        // verify the required parameter 'layoutId' is set
        if (layoutId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'layoutId' when calling brandBrandIdLayoutLayoutIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);
        uriVariables.put("layoutId", layoutId);

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

        ParameterizedTypeReference<BrandBrandIdLayoutLayoutIdDelete200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdLayoutLayoutIdDelete200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/layout/{layoutId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드 별 등록된 레이아웃 목록을 조회합니다. 
     * 브랜드 별 등록된 레이아웃 목록을 조회합니다.      + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 
     * <p><b>200</b> - 브랜드 내 등록된 레이아웃 상세 정보를 응답합니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param layoutId 레이아웃ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return BrandBrandIdLayoutLayoutIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdLayoutLayoutIdGet200Response brandBrandIdLayoutLayoutIdGet(String brandId, String layoutId, String xRCSBrandkey) throws RestClientException {
        return brandBrandIdLayoutLayoutIdGetWithHttpInfo(brandId, layoutId, xRCSBrandkey).getBody();
    }

    /**
     * 브랜드 별 등록된 레이아웃 목록을 조회합니다. 
     * 브랜드 별 등록된 레이아웃 목록을 조회합니다.      + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 
     * <p><b>200</b> - 브랜드 내 등록된 레이아웃 상세 정보를 응답합니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param layoutId 레이아웃ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @return ResponseEntity&lt;BrandBrandIdLayoutLayoutIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdLayoutLayoutIdGet200Response> brandBrandIdLayoutLayoutIdGetWithHttpInfo(String brandId, String layoutId, String xRCSBrandkey) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdLayoutLayoutIdGet");
        }
        
        // verify the required parameter 'layoutId' is set
        if (layoutId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'layoutId' when calling brandBrandIdLayoutLayoutIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);
        uriVariables.put("layoutId", layoutId);

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

        ParameterizedTypeReference<BrandBrandIdLayoutLayoutIdGet200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdLayoutLayoutIdGet200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/layout/{layoutId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드 내 레이아웃을 수정 합니다.   
     * 브랜드 내 레이아웃을 수정 합니다.      + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 
     * <p><b>200</b> - 레이아웃이 정상적으로 수정된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param layoutId 레이아웃ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param regBrandLayout  (optional)
     * @return BrandBrandIdLayoutLayoutIdPut200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdLayoutLayoutIdPut200Response brandBrandIdLayoutLayoutIdPut(String brandId, String layoutId, String xRCSBrandkey, RegBrandLayout regBrandLayout) throws RestClientException {
        return brandBrandIdLayoutLayoutIdPutWithHttpInfo(brandId, layoutId, xRCSBrandkey, regBrandLayout).getBody();
    }

    /**
     * 브랜드 내 레이아웃을 수정 합니다.   
     * 브랜드 내 레이아웃을 수정 합니다.      + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 
     * <p><b>200</b> - 레이아웃이 정상적으로 수정된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param layoutId 레이아웃ID 입니다. (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param regBrandLayout  (optional)
     * @return ResponseEntity&lt;BrandBrandIdLayoutLayoutIdPut200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdLayoutLayoutIdPut200Response> brandBrandIdLayoutLayoutIdPutWithHttpInfo(String brandId, String layoutId, String xRCSBrandkey, RegBrandLayout regBrandLayout) throws RestClientException {
        Object localVarPostBody = regBrandLayout;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdLayoutLayoutIdPut");
        }
        
        // verify the required parameter 'layoutId' is set
        if (layoutId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'layoutId' when calling brandBrandIdLayoutLayoutIdPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("brandId", brandId);
        uriVariables.put("layoutId", layoutId);

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

        ParameterizedTypeReference<BrandBrandIdLayoutLayoutIdPut200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdLayoutLayoutIdPut200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/layout/{layoutId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 브랜드 내에서 사용할 수 있는 레이아웃을 등록 합니다.   
     * 브랜드 내에서 사용할 수 있는 레이아웃을 등록 합니다.      + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 
     * <p><b>200</b> - 레이아웃이 정상적으로 등록된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param regBrandLayout  (optional)
     * @return BrandBrandIdLayoutPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandBrandIdLayoutPost200Response brandBrandIdLayoutPost(String brandId, String xRCSBrandkey, RegBrandLayout regBrandLayout) throws RestClientException {
        return brandBrandIdLayoutPostWithHttpInfo(brandId, xRCSBrandkey, regBrandLayout).getBody();
    }

    /**
     * 브랜드 내에서 사용할 수 있는 레이아웃을 등록 합니다.   
     * 브랜드 내에서 사용할 수 있는 레이아웃을 등록 합니다.      + **계정 권한: 대행사**     + **브랜드 권한: 운영자** 
     * <p><b>200</b> - 레이아웃이 정상적으로 등록된 경우 응답됩니다. 
     * <p><b>0</b>
     * @param brandId 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  (required)
     * @param xRCSBrandkey RCS Biz Center에서 브랜드 등록 시 자동 생성되는 Key 입니다.&lt;br&gt;    대행사가 해당 브랜드에 대한 권한 여부를 판단하는데 사용됩니다.&lt;br&gt;     따라서, 대행사 계정으로 브랜드 내 정보를 조회/등록/수정 API 연동 시 Header에 설정되어야 합니다.  (optional)
     * @param regBrandLayout  (optional)
     * @return ResponseEntity&lt;BrandBrandIdLayoutPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandBrandIdLayoutPost200Response> brandBrandIdLayoutPostWithHttpInfo(String brandId, String xRCSBrandkey, RegBrandLayout regBrandLayout) throws RestClientException {
        Object localVarPostBody = regBrandLayout;
        
        // verify the required parameter 'brandId' is set
        if (brandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'brandId' when calling brandBrandIdLayoutPost");
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

        ParameterizedTypeReference<BrandBrandIdLayoutPost200Response> localReturnType = new ParameterizedTypeReference<BrandBrandIdLayoutPost200Response>() {};
        return apiClient.invokeAPI("/brand/{brandId}/layout", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
    /**
     * 대행사에서 등록한 수신서버 URL을 통해 RBC에서 발생하는 데이터의 등록/수정/삭제 이벤트 정보를 전달합니다. 
     * 대행사에서 등록한 수신서버 URL을 통해 RBC에서 발생하는 데이터의 등록/수정/삭제 이벤트 정보를 전달합니다.   등록/수정/삭제 알림 대상은 다음과 같습니다.     + 브랜드 계약(권한) 등록     + 브랜드 수정/반려     + 대화방 승인/수정/반려/삭제     + 템플릿 승인/수정/반려/삭제     + 자동응답메시지 등록/수정/삭제     + 신규 포멧/템플릿 상품 등록     + 대행사 키 재발급   + 레아아웃 등록/수정/삭제   + 로고 승인/수정/반려/삭제 
     * <p><b>200</b> - 성공적으로 알림을 수신하였을 경우 응답합니다. 
     * <p><b>400</b> - 대행사 측 청약이 우선 처리되지 않은 상태에서 &#39;contract&#39;가 전달된 경우 필히 응답되어야 합니다. 
     * @param webhookUrl 대행사에서 등록한 Webhook URL 정보  (required)
     * @param webhookUrlPostRequest notiType에 설정된 다음의 대상 정보를 구분하여 Object를 제공합니다.    - contract: 브랜드 계약                 - chatbot: 대화방                 - messagebaseform: 템플릿 양식                 - template: 템플릿                 - format: 포멧(이통 제공 공통템플릿)                 - brand: 브랜드                 - autoreplymsg: 자동응답메시지                 - agencykey: 대행사 키   - formatbr: 브랜드에 등록된 레이아웃으로 만든 포멧     - logo: 브랜드 로고  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void webhookUrlPost(String webhookUrl, WebhookUrlPostRequest webhookUrlPostRequest) throws RestClientException {
        webhookUrlPostWithHttpInfo(webhookUrl, webhookUrlPostRequest);
    }

    /**
     * 대행사에서 등록한 수신서버 URL을 통해 RBC에서 발생하는 데이터의 등록/수정/삭제 이벤트 정보를 전달합니다. 
     * 대행사에서 등록한 수신서버 URL을 통해 RBC에서 발생하는 데이터의 등록/수정/삭제 이벤트 정보를 전달합니다.   등록/수정/삭제 알림 대상은 다음과 같습니다.     + 브랜드 계약(권한) 등록     + 브랜드 수정/반려     + 대화방 승인/수정/반려/삭제     + 템플릿 승인/수정/반려/삭제     + 자동응답메시지 등록/수정/삭제     + 신규 포멧/템플릿 상품 등록     + 대행사 키 재발급   + 레아아웃 등록/수정/삭제   + 로고 승인/수정/반려/삭제 
     * <p><b>200</b> - 성공적으로 알림을 수신하였을 경우 응답합니다. 
     * <p><b>400</b> - 대행사 측 청약이 우선 처리되지 않은 상태에서 &#39;contract&#39;가 전달된 경우 필히 응답되어야 합니다. 
     * @param webhookUrl 대행사에서 등록한 Webhook URL 정보  (required)
     * @param webhookUrlPostRequest notiType에 설정된 다음의 대상 정보를 구분하여 Object를 제공합니다.    - contract: 브랜드 계약                 - chatbot: 대화방                 - messagebaseform: 템플릿 양식                 - template: 템플릿                 - format: 포멧(이통 제공 공통템플릿)                 - brand: 브랜드                 - autoreplymsg: 자동응답메시지                 - agencykey: 대행사 키   - formatbr: 브랜드에 등록된 레이아웃으로 만든 포멧     - logo: 브랜드 로고  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> webhookUrlPostWithHttpInfo(String webhookUrl, WebhookUrlPostRequest webhookUrlPostRequest) throws RestClientException {
        Object localVarPostBody = webhookUrlPostRequest;
        
        // verify the required parameter 'webhookUrl' is set
        if (webhookUrl == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'webhookUrl' when calling webhookUrlPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("webhookUrl", webhookUrl);

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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/{webhookUrl}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
