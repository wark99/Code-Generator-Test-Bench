package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CorpBrandCategoriesGet200Response;
import org.openapitools.client.model.CorpBrandPost200Response;
import org.openapitools.client.model.CorpBrandPostRequestChatbots;
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
public class SinceV112Api {
    private ApiClient apiClient;

    public SinceV112Api() {
        this(new ApiClient());
    }

    public SinceV112Api(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
}
