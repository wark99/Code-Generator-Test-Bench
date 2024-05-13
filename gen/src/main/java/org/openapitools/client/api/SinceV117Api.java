package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AgencyAgencyIdCorpCorpRegNumChatbotChatbotIdGet200Response;
import org.openapitools.client.model.AgencyAgencyIdCorpCorpRegNumGet200Response;
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
public class SinceV117Api {
    private ApiClient apiClient;

    public SinceV117Api() {
        this(new ApiClient());
    }

    public SinceV117Api(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
}
