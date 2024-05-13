package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BaselayoutComponentGet200Response;
import org.openapitools.client.model.BaselayoutProductRuleGet200Response;
import org.openapitools.client.model.BaselayoutSampleGet200Response;
import org.openapitools.client.model.BaselayoutSampleSampleLayoutIdGet200Response;
import org.openapitools.client.model.BrandBrandIdLayoutGet200Response;
import org.openapitools.client.model.BrandBrandIdLayoutLayoutIdDelete200Response;
import org.openapitools.client.model.BrandBrandIdLayoutLayoutIdGet200Response;
import org.openapitools.client.model.BrandBrandIdLayoutLayoutIdPut200Response;
import org.openapitools.client.model.BrandBrandIdLayoutPost200Response;
import org.openapitools.client.model.OneOf401ErrorInfo403ErrorInfo400ErrorInfo204ErrorInfo;
import org.openapitools.client.model.RegBrandLayout;

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
public class LayoutApi {
    private ApiClient apiClient;

    public LayoutApi() {
        this(new ApiClient());
    }

    public LayoutApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
}
