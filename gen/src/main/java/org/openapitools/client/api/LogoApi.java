package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BrandBrandIdLogoFileIdDelete200Response;
import org.openapitools.client.model.BrandBrandIdLogoFileIdGet200Response;
import org.openapitools.client.model.BrandBrandIdLogoFileIdPut200Response;
import org.openapitools.client.model.BrandBrandIdLogoGet200Response;
import org.openapitools.client.model.BrandBrandIdLogoPost200Response;
import org.openapitools.client.model.LogoCommonGet200Response;
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
public class LogoApi {
    private ApiClient apiClient;

    public LogoApi() {
        this(new ApiClient());
    }

    public LogoApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
}
