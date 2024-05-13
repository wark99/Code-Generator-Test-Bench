# SinceV113Api

All URIs are relative to *https://api-qa.rcsbizcenter.com/api/1.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**corpBrandBrandIdDelete**](SinceV113Api.md#corpBrandBrandIdDelete) | **DELETE** /corp/brand/{brandId} | 마스터 계정을 이용하여 승인 이력이 없는 신규 개설 브랜드 삭제를 요청합니다.  |
| [**corpBrandBrandIdPut**](SinceV113Api.md#corpBrandBrandIdPut) | **PUT** /corp/brand/{brandId} | RBC 웹에서 임시저장으로 등록한 브랜드 또는 신규 브랜드 등록 검수 시 반려된 경우 브랜드 수정 후 승인요청 시 사용합니다.  |
| [**corpPersonIdBrandBrandIdDelete**](SinceV113Api.md#corpPersonIdBrandBrandIdDelete) | **DELETE** /corp/{personId}/brand/{brandId} | 브랜드를 삭제합니다.  |
| [**corpPersonIdBrandBrandIdGet**](SinceV113Api.md#corpPersonIdBrandBrandIdGet) | **GET** /corp/{personId}/brand/{brandId} | 브랜드 상세 정보를 조회합니다.  |
| [**corpPersonIdBrandBrandIdPrivilegeGet**](SinceV113Api.md#corpPersonIdBrandBrandIdPrivilegeGet) | **GET** /corp/{personId}/brand/{brandId}/privilege | 브랜드에 등록된 운영 권한 정보를 조회합니다.  |
| [**corpPersonIdBrandBrandIdPrivilegeIdDelete**](SinceV113Api.md#corpPersonIdBrandBrandIdPrivilegeIdDelete) | **DELETE** /corp/{personId}/brand/{brandId}/privilege/{id} | 브랜드 운영자 권한 중 지정한 대상을 삭제합니다.  |
| [**corpPersonIdBrandBrandIdPrivilegePost**](SinceV113Api.md#corpPersonIdBrandBrandIdPrivilegePost) | **POST** /corp/{personId}/brand/{brandId}/privilege | 브랜드 대표운영자가 브랜드 내 운영자(기업의 마스터/매니저, 대행사) 권한을 부여 합니다.  |
| [**corpPersonIdBrandBrandIdPrivilegePut**](SinceV113Api.md#corpPersonIdBrandBrandIdPrivilegePut) | **PUT** /corp/{personId}/brand/{brandId}/privilege | 브랜드 대표운영자 권한을 위임합니다.  |
| [**corpPersonIdBrandBrandIdPut**](SinceV113Api.md#corpPersonIdBrandBrandIdPut) | **PUT** /corp/{personId}/brand/{brandId} | 현재 운영 중인 브랜드 정보를 수정 합니다. 브랜드명, 프로필 이미지가 수정되면 다시 승인을 받아야 합니다.  |



## corpBrandBrandIdDelete

> CorpPersonIdBrandBrandIdDelete200Response corpBrandBrandIdDelete(brandId)

마스터 계정을 이용하여 승인 이력이 없는 신규 개설 브랜드 삭제를 요청합니다. 

마스터 계정을 이용하여 승인 이력이 없는 해당 계정이 신규 개설한 브랜드 삭제를 요청합니다. 정상적으로 승인요청된 브랜드는 **승인대기** 상태가 되므로 삭제가 불가합니다.\\ **- 사용 권한 계정 : 마스터**\\ **- 삭제 가능 상태 : 저장, 반려** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SinceV113Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV113Api apiInstance = new SinceV113Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        try {
            CorpPersonIdBrandBrandIdDelete200Response result = apiInstance.corpBrandBrandIdDelete(brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV113Api#corpBrandBrandIdDelete");
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
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |

### Return type

[**CorpPersonIdBrandBrandIdDelete200Response**](CorpPersonIdBrandBrandIdDelete200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 정상적으로 처리된 경우 응답됩니다. |  -  |
| **0** |  |  -  |


## corpBrandBrandIdPut

> CorpBrandPost200Response corpBrandBrandIdPut(brandId, regBrand, brandProfile, brandBackground, mainMdn, chatbots, subNumCertificate)

RBC 웹에서 임시저장으로 등록한 브랜드 또는 신규 브랜드 등록 검수 시 반려된 경우 브랜드 수정 후 승인요청 시 사용합니다. 

RBC 웹에서 임시저장으로 등록한 브랜드 또는 신규 브랜드 등록 검수 시 반려된 경우 브랜드 수정 후 승인요청 시 사용합니다.   브랜드 등록 POST API를 통해 **승인** 요청하였으나 검수 시 **반려**되어 재승인 요청 또는   **RBC 홈페이지**에서 **임시저장**한 브랜드 정보를 수정하여 승인 요청하는 경우 사용합니다.      + **계정 권한 : 마스터, 매니저**   + **브랜드 권한 : 브랜드 대표운영자(브랜드를 등록한 마스터 또는 매니저)**     + **수정 대상 브랜드 상태 : 반려, 저장** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SinceV113Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV113Api apiInstance = new SinceV113Api(defaultClient);
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        RegBrandInfo regBrand = new RegBrandInfo(); // RegBrandInfo | 
        Object brandProfile = null; // Object | 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : png (최대1MB)** 
        Object brandBackground = null; // Object | 브랜드 백그라운드 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 / 파일형식 : jpg, png (최대1MB)** 
        String mainMdn = "mainMdn_example"; // String | 대표발신번호 개념 제거되어 더 이상 유효하지 않습니다.
        CorpBrandPostRequestChatbots chatbots = new CorpBrandPostRequestChatbots(); // CorpBrandPostRequestChatbots | 
        Object subNumCertificate = null; // Object | 통신서비스이용증명원을 업로드합니다.   대화방(발신번호) 등록을 위해 chatbots 지정한 경우 필수로 함께 업로드해야 합니다.   **허용되는 파일형식 : jpg, png, pdf, tiff, zip (최대20MB)**   
        try {
            CorpBrandPost200Response result = apiInstance.corpBrandBrandIdPut(brandId, regBrand, brandProfile, brandBackground, mainMdn, chatbots, subNumCertificate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV113Api#corpBrandBrandIdPut");
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
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
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


## corpPersonIdBrandBrandIdDelete

> CorpPersonIdBrandBrandIdDelete200Response corpPersonIdBrandBrandIdDelete(personId, brandId)

브랜드를 삭제합니다. 

브랜드를 삭제합니다.   브랜드 삭제를 위해서는 토큰 발급계정과 personId가 동일해야 하며 brandId에 대한 브랜드 대표운영자 권한이 있어야 합니다.   승인을 받지 않은 &#39;반려&#39;, &#39;저장&#39; 상태의 브랜드는 즉시 삭제 가능합니다.   **승인된 브랜드의 경우 등록된 발신번호, 템플릿을 먼저 삭제한 후 브랜드를 삭제해야 처리됩니다.**      + **계정 권한 : 마스터**     + **브랜드 권한 : 대표운영자**     + **삭제 가능 상태 : 승인, 반려, 저장** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SinceV113Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV113Api apiInstance = new SinceV113Api(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        try {
            CorpPersonIdBrandBrandIdDelete200Response result = apiInstance.corpPersonIdBrandBrandIdDelete(personId, brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV113Api#corpPersonIdBrandBrandIdDelete");
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
| **personId** | **String**| 브랜드 대표운영자 ID 입니다. | |
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |

### Return type

[**CorpPersonIdBrandBrandIdDelete200Response**](CorpPersonIdBrandBrandIdDelete200Response.md)

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


## corpPersonIdBrandBrandIdGet

> CorpPersonIdBrandBrandIdGet200Response corpPersonIdBrandBrandIdGet(personId, brandId)

브랜드 상세 정보를 조회합니다. 

관리 중인 브랜드의 상세 정보를 조회합니다.      + **계정 권한 : 마스터, 매니저**     + **브랜드 권한 : 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SinceV113Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV113Api apiInstance = new SinceV113Api(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자 또는 운영자의 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        try {
            CorpPersonIdBrandBrandIdGet200Response result = apiInstance.corpPersonIdBrandBrandIdGet(personId, brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV113Api#corpPersonIdBrandBrandIdGet");
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
| **personId** | **String**| 브랜드 대표운영자 또는 운영자의 ID 입니다. | |
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |

### Return type

[**CorpPersonIdBrandBrandIdGet200Response**](CorpPersonIdBrandBrandIdGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 정상적으로 처리된 경우 응답됩니다.  |  -  |
| **0** |  |  -  |


## corpPersonIdBrandBrandIdPrivilegeGet

> CorpPersonIdBrandBrandIdPrivilegeGet200Response corpPersonIdBrandBrandIdPrivilegeGet(personId, brandId)

브랜드에 등록된 운영 권한 정보를 조회합니다. 

브랜드에 등록된 운영 권한 정보를 조회합니다. 브랜드에 등록된 브랜드 대표운영자, 운영자, 권한 지정 대행사 정보를 제공합니다.      + **계정 권한: 마스터, 매니저**   + **브랜드 권한: 브랜드 대표운영자, 운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SinceV113Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV113Api apiInstance = new SinceV113Api(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자 또는 운영자 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        try {
            CorpPersonIdBrandBrandIdPrivilegeGet200Response result = apiInstance.corpPersonIdBrandBrandIdPrivilegeGet(personId, brandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV113Api#corpPersonIdBrandBrandIdPrivilegeGet");
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
| **personId** | **String**| 브랜드 대표운영자 또는 운영자 ID 입니다. | |
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |

### Return type

[**CorpPersonIdBrandBrandIdPrivilegeGet200Response**](CorpPersonIdBrandBrandIdPrivilegeGet200Response.md)

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


## corpPersonIdBrandBrandIdPrivilegeIdDelete

> CorpPersonIdBrandBrandIdPrivilegeGet200Response corpPersonIdBrandBrandIdPrivilegeIdDelete(personId, brandId, id)

브랜드 운영자 권한 중 지정한 대상을 삭제합니다. 

브랜드 운영자(마스터, 매니저), 운영자(대행사) 권한 중 지정한 대상을 삭제합니다.   대행사가 양방향 대행사인 경우, 권한 삭제 시 대행사가 연결된 양방향 대화방의 연결을 해지합니다.   브랜드 대표운영자는 삭제할 수 없으며 브랜드 대표운영자를 변경하고자 할 경우 PUT 메서드를 사용하여야 합니다.    + **계정 권한 : 마스터**   + **브랜드 권한: 브랜드 대표운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SinceV113Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV113Api apiInstance = new SinceV113Api(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        String id = "id_example"; // String | 브랜드 운영자(마스터, 매니저) 또는 운영자(대행사) ID 입니다.
        try {
            CorpPersonIdBrandBrandIdPrivilegeGet200Response result = apiInstance.corpPersonIdBrandBrandIdPrivilegeIdDelete(personId, brandId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV113Api#corpPersonIdBrandBrandIdPrivilegeIdDelete");
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
| **personId** | **String**| 브랜드 대표운영자 ID 입니다. | |
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **id** | **String**| 브랜드 운영자(마스터, 매니저) 또는 운영자(대행사) ID 입니다. | |

### Return type

[**CorpPersonIdBrandBrandIdPrivilegeGet200Response**](CorpPersonIdBrandBrandIdPrivilegeGet200Response.md)

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


## corpPersonIdBrandBrandIdPrivilegePost

> CorpPersonIdBrandBrandIdPrivilegeGet200Response corpPersonIdBrandBrandIdPrivilegePost(personId, brandId, corpPersonIdBrandBrandIdPrivilegePostRequest)

브랜드 대표운영자가 브랜드 내 운영자(기업의 마스터/매니저, 대행사) 권한을 부여 합니다. 

브랜드 대표운영자가 브랜드 내 운영자(기업의 마스터/매니저, 대행사) 권한을 부여 합니다.      + **계정 권한 : 마스터**   + **브랜드 권한 : 브랜드 대표운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SinceV113Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV113Api apiInstance = new SinceV113Api(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자의 계정 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        CorpPersonIdBrandBrandIdPrivilegePostRequest corpPersonIdBrandBrandIdPrivilegePostRequest = new CorpPersonIdBrandBrandIdPrivilegePostRequest(); // CorpPersonIdBrandBrandIdPrivilegePostRequest | + privilegeType이 SubManager 인 경우, 소속된 기업 내 다른 마스터, 매니저 계정을 운영자로 지정할 수 있습니다.   + privilegeType이 Agency 인 경우, 별도의 RCS 발송 계약을 맺은 대행사를 운영자로 지정합니다.   
        try {
            CorpPersonIdBrandBrandIdPrivilegeGet200Response result = apiInstance.corpPersonIdBrandBrandIdPrivilegePost(personId, brandId, corpPersonIdBrandBrandIdPrivilegePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV113Api#corpPersonIdBrandBrandIdPrivilegePost");
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
| **personId** | **String**| 브랜드 대표운영자의 계정 ID 입니다. | |
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **corpPersonIdBrandBrandIdPrivilegePostRequest** | [**CorpPersonIdBrandBrandIdPrivilegePostRequest**](CorpPersonIdBrandBrandIdPrivilegePostRequest.md)| + privilegeType이 SubManager 인 경우, 소속된 기업 내 다른 마스터, 매니저 계정을 운영자로 지정할 수 있습니다.   + privilegeType이 Agency 인 경우, 별도의 RCS 발송 계약을 맺은 대행사를 운영자로 지정합니다.    | [optional] |

### Return type

[**CorpPersonIdBrandBrandIdPrivilegeGet200Response**](CorpPersonIdBrandBrandIdPrivilegeGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** |  |  -  |


## corpPersonIdBrandBrandIdPrivilegePut

> CorpPersonIdBrandBrandIdPrivilegeGet200Response corpPersonIdBrandBrandIdPrivilegePut(personId, brandId, corpPersonIdBrandBrandIdPrivilegePutRequest)

브랜드 대표운영자 권한을 위임합니다. 

브랜드 대표운영자 권한을 지정된 마스터에게 위임합니다.   브랜드 대표운영자 변경 시 위임전 대표운영자는 운영자로 변경됩니다.      + **계정 권한 : 마스터**     + **브랜드 권한 : 브랜드 대표운영자** 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SinceV113Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV113Api apiInstance = new SinceV113Api(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        CorpPersonIdBrandBrandIdPrivilegePutRequest corpPersonIdBrandBrandIdPrivilegePutRequest = new CorpPersonIdBrandBrandIdPrivilegePutRequest(); // CorpPersonIdBrandBrandIdPrivilegePutRequest | - privilegeType이 Manager 만 허용되며 지정한 마스터 ID를 대표운영자로 설정합니다.  
        try {
            CorpPersonIdBrandBrandIdPrivilegeGet200Response result = apiInstance.corpPersonIdBrandBrandIdPrivilegePut(personId, brandId, corpPersonIdBrandBrandIdPrivilegePutRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV113Api#corpPersonIdBrandBrandIdPrivilegePut");
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
| **personId** | **String**| 브랜드 대표운영자 ID 입니다. | |
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **corpPersonIdBrandBrandIdPrivilegePutRequest** | [**CorpPersonIdBrandBrandIdPrivilegePutRequest**](CorpPersonIdBrandBrandIdPrivilegePutRequest.md)| - privilegeType이 Manager 만 허용되며 지정한 마스터 ID를 대표운영자로 설정합니다.   | [optional] |

### Return type

[**CorpPersonIdBrandBrandIdPrivilegeGet200Response**](CorpPersonIdBrandBrandIdPrivilegeGet200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** |  |  -  |


## corpPersonIdBrandBrandIdPut

> CorpPersonIdBrandBrandIdPut200Response corpPersonIdBrandBrandIdPut(personId, brandId, regBrand, brandProfile, brandBackground, mainMdn)

현재 운영 중인 브랜드 정보를 수정 합니다. 브랜드명, 프로필 이미지가 수정되면 다시 승인을 받아야 합니다. 

현재 운영 중인 브랜드 정보를 수정 합니다.    브랜드 대표운영자 또는 운영자 권한이 있어야 수정이 가능합니다.   **브랜드명** 또는 **프로필 이미지**가 수정되면 다시 승인을 받아야 합니다.   이외 정보 수정은 별도의 승인 과정 없이 업데이트 됩니다.   수정된 데이터가 이통 3사로 전송되는 과정에서 전송이 지연되거나 장애로 인해 이통 3사 모두 전송이 완료되지 못한 경우,   브랜드 정보 조회 데이터와 단말에서 표시되는 브랜드 홈 정보가 상이할 수 있습니다.      + **계정 권한 : 마스터, 매니저**     + **브랜드 권한 : 대표운영자, 운영자**     + **수정 가능 상태 : 승인, 반려(수정승인)**   

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SinceV113Api;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-qa.rcsbizcenter.com/api/1.1");
        
        // Configure HTTP bearer authorization: jwtAuth
        HttpBearerAuth jwtAuth = (HttpBearerAuth) defaultClient.getAuthentication("jwtAuth");
        jwtAuth.setBearerToken("BEARER TOKEN");

        SinceV113Api apiInstance = new SinceV113Api(defaultClient);
        String personId = "personId_example"; // String | 브랜드 대표운영자 또는 운영자의 ID 입니다.
        String brandId = "brandId_example"; // String | 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다. 
        RegBrandInfo regBrand = new RegBrandInfo(); // RegBrandInfo | 
        File brandProfile = new File("/path/to/file"); // File | 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : png (최대1MB)** 
        File brandBackground = new File("/path/to/file"); // File | 브랜드 백그라운드 이미지를 업로드합니다.   등록되어 있는 브랜드 백그라운드 이미지를 제거하기 위해서는 파일 없이 brandBackground form key만 전송하면 됩니다.\\\\ **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : jpg, png (최대1MB)** 
        String mainMdn = "mainMdn_example"; // String | 대표발신번호 개념 제거되어 더 이상 유효하지 않습니다.
        try {
            CorpPersonIdBrandBrandIdPut200Response result = apiInstance.corpPersonIdBrandBrandIdPut(personId, brandId, regBrand, brandProfile, brandBackground, mainMdn);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SinceV113Api#corpPersonIdBrandBrandIdPut");
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
| **personId** | **String**| 브랜드 대표운영자 또는 운영자의 ID 입니다. | |
| **brandId** | **String**| 브랜드 내 정보 접근시 사용되는 브랜드ID Path Parameter 입니다.  | |
| **regBrand** | [**RegBrandInfo**](RegBrandInfo.md)|  | [optional] |
| **brandProfile** | **File**| 브랜드 프로필 이미지를 업로드합니다.   **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : png (최대1MB)**  | [optional] |
| **brandBackground** | **File**| 브랜드 백그라운드 이미지를 업로드합니다.   등록되어 있는 브랜드 백그라운드 이미지를 제거하기 위해서는 파일 없이 brandBackground form key만 전송하면 됩니다.\\\\ **최소사이즈 : 388X388px / 최대사이즈 : 1080X1080px / 1:1 비율 권장 / 파일형식 : jpg, png (최대1MB)**  | [optional] |
| **mainMdn** | **String**| 대표발신번호 개념 제거되어 더 이상 유효하지 않습니다. | [optional] |

### Return type

[**CorpPersonIdBrandBrandIdPut200Response**](CorpPersonIdBrandBrandIdPut200Response.md)

### Authorization

[jwtAuth](../README.md#jwtAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |
| **0** |  |  -  |

