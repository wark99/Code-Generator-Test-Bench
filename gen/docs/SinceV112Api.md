# SinceV112Api

All URIs are relative to *https://api-qa.rcsbizcenter.com/api/1.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**corpBrandCategoriesGet**](SinceV112Api.md#corpBrandCategoriesGet) | **GET** /corp/brand/categories | 브랜드 등록 시 사용 가능한 카테고리 목록을 조회합니다.   |
| [**corpBrandPost**](SinceV112Api.md#corpBrandPost) | **POST** /corp/brand | 마스터, 매니저 계정을 이용하여 신규 브랜드 등록 승인을 요청합니다.  |



## corpBrandCategoriesGet

> CorpBrandCategoriesGet200Response corpBrandCategoriesGet()

브랜드 등록 시 사용 가능한 카테고리 목록을 조회합니다.  

RCS Biz Center에서 브랜드를 등록할 때 필수 요구되는 카테고리(categoryId, categoryName), 하위 카테고리(subCategoryId, subCategoryName)에 해당하는 카테고리 목록을 조회합니다.   조회된 카테고리, 하위 카테고리 를 이용하여 브랜드 등록 시 지정합니다.      + **계정 권한 : 마스터, 매니저**   + **브랜드 권한 : 브랜드 대표운영자**    

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SinceV112Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV112Api apiInstance = new SinceV112Api(defaultClient);
        try {
            CorpBrandCategoriesGet200Response result = apiInstance.corpBrandCategoriesGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV112Api#corpBrandCategoriesGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**CorpBrandCategoriesGet200Response**](CorpBrandCategoriesGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** |  |  -  |


## corpBrandPost

> CorpBrandPost200Response corpBrandPost(regBrand, brandProfile, brandBackground, mainMdn, chatbots, subNumCertificate)

마스터, 매니저 계정을 이용하여 신규 브랜드 등록 승인을 요청합니다. 

마스터, 매니저 계정을 이용하여 신규 브랜드 등록 승인을 요청합니다.(매니저 계정도 브랜드 등록이 가능하도록 권한이 변경되었습니다.)   또한 필수 항목이었던 발신번호는 옵션으로 변경되었습니다.   따라서 발신번호를 함께 등록하는 경우에만 발신번호에 대한 &#39;통신서비스 가입증명원&#39;을 함께 등록하면 됩니다.     브랜드를 등록한 계정은 브랜드의 대표운영자로 설정되며, 매니저 권한으로 등록한 브랜드는 마스터 권한 승급을 받아야 승인을 받을 수 있습니다.        + **계정 권한 : 마스터, 매니저**   

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SinceV112Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV112Api apiInstance = new SinceV112Api(defaultClient);
        RegBrandInfo regBrand = new RegBrandInfo(); // RegBrandInfo | 
        Object brandProfile = null; // Object | 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : png (최대1MB)** 
        Object brandBackground = null; // Object | 브랜드 백그라운드 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : jpg, png (최대1MB)** 
        String mainMdn = "mainMdn_example"; // String | 대표발신번호 개념 제거되어 더 이상 유효하지 않습니다.
        CorpBrandPostRequestChatbots chatbots = new CorpBrandPostRequestChatbots(); // CorpBrandPostRequestChatbots | 
        Object subNumCertificate = null; // Object | 통신서비스이용증명원을 업로드합니다.   대화방(발신번호) 등록을 위해 chatbots 지정한 경우 필수로 함께 업로드해야 합니다.   **허용되는 파일형식 : jpg, png, pdf, tiff, zip (최대20MB)**   
        try {
            CorpBrandPost200Response result = apiInstance.corpBrandPost(regBrand, brandProfile, brandBackground, mainMdn, chatbots, subNumCertificate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV112Api#corpBrandPost");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **regBrand** | [**RegBrandInfo**](RegBrandInfo.md)|  | |
| **brandProfile** | [**Object**](Object.md)| 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : png (최대1MB)**  | |
| **brandBackground** | [**Object**](Object.md)| 브랜드 백그라운드 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : jpg, png (최대1MB)**  | [optional] |
| **mainMdn** | **String**| 대표발신번호 개념 제거되어 더 이상 유효하지 않습니다. | [optional] |
| **chatbots** | [**CorpBrandPostRequestChatbots**](CorpBrandPostRequestChatbots.md)|  | [optional] |
| **subNumCertificate** | [**Object**](Object.md)| 통신서비스이용증명원을 업로드합니다.   대화방(발신번호) 등록을 위해 chatbots 지정한 경우 필수로 함께 업로드해야 합니다.   **허용되는 파일형식 : jpg, png, pdf, tiff, zip (최대20MB)**    | [optional] |

### Return type

[**CorpBrandPost200Response**](CorpBrandPost200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 정상적으로 처리된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |

