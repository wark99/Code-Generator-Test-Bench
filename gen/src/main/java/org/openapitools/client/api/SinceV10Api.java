package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AgencyAgencyIdContractGet200Response;
import org.openapitools.client.model.BrandBrandIdAutoreplymsgGet200Response;
import org.openapitools.client.model.BrandBrandIdChatbotChatbotIdDelete200Response;
import org.openapitools.client.model.BrandBrandIdChatbotChatbotIdGet200Response;
import org.openapitools.client.model.BrandBrandIdChatbotGet200Response;
import org.openapitools.client.model.BrandBrandIdChatbotPost200Response;
import org.openapitools.client.model.BrandBrandIdMessagebaseMessagebaseIdGet200Response;
import org.openapitools.client.model.BrandBrandIdMessagebaseMessagebaseIdPut200Response;
import org.openapitools.client.model.BrandBrandIdMessagebasePost200Response;
import org.openapitools.client.model.BrandBrandIdMessagebasePostRequest;
import org.openapitools.client.model.CorpBrandPostRequestChatbots;
import org.openapitools.client.model.CorpPersonIdBrandBrandIdGet200Response;
import org.openapitools.client.model.CorpPersonIdBrandGet200Response;
import org.openapitools.client.model.MessagebaseCommonGet200Response;
import org.openapitools.client.model.MessagebaseCommonMessagebaseIdGet200Response;
import org.openapitools.client.model.MessagebaseMessagebaseformGet200Response;
import org.openapitools.client.model.MessagebaseMessagebaseformMessagebaseformIdGet200Response;
import org.openapitools.client.model.OneOf401ErrorInfo403ErrorInfo400ErrorInfo204ErrorInfo;
import org.openapitools.client.model.RegChatbotInfo;
import org.openapitools.client.model.RegMessagebaseInfo;
import org.openapitools.client.model.TokenInfo;
import org.openapitools.client.model.TokenPostRequest;
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
public class SinceV10Api {
    private ApiClient apiClient;

    public SinceV10Api() {
        this(new ApiClient());
    }

    public SinceV10Api(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
