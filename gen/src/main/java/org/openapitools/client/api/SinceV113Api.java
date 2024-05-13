package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CorpBrandPost200Response;
import org.openapitools.client.model.CorpBrandPostRequestChatbots;
import org.openapitools.client.model.CorpPersonIdBrandBrandIdDelete200Response;
import org.openapitools.client.model.CorpPersonIdBrandBrandIdGet200Response;
import org.openapitools.client.model.CorpPersonIdBrandBrandIdPrivilegeGet200Response;
import org.openapitools.client.model.CorpPersonIdBrandBrandIdPrivilegePostRequest;
import org.openapitools.client.model.CorpPersonIdBrandBrandIdPrivilegePutRequest;
import org.openapitools.client.model.CorpPersonIdBrandBrandIdPut200Response;
import java.io.File;
import org.openapitools.client.model.OneOf401ErrorInfo403ErrorInfo400ErrorInfo204ErrorInfo;
import org.openapitools.client.model.RegBrandInfo;

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
public class SinceV113Api {
    private ApiClient apiClient;

    public SinceV113Api() {
        this(new ApiClient());
    }

    public SinceV113Api(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
}
