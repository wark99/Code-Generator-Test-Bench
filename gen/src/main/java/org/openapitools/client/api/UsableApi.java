package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.OneOf401ErrorInfo403ErrorInfo400ErrorInfo204ErrorInfo;
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
public class UsableApi {
    private ApiClient apiClient;

    public UsableApi() {
        this(new ApiClient());
    }

    public UsableApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
