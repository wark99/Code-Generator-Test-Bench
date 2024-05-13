# DefaultApi

All URIs are relative to *http://localhost:3000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**authLoginPost**](DefaultApi.md#authLoginPost) | **POST** /auth/login | 로그인 |
| [**authLogoutPost**](DefaultApi.md#authLogoutPost) | **POST** /auth/logout | 로그아웃 |
| [**clothesListUserIdGet**](DefaultApi.md#clothesListUserIdGet) | **GET** /clothes/list/{user_id} | 보관한 의류 리스트 조회 |
| [**clothesReturnPost**](DefaultApi.md#clothesReturnPost) | **POST** /clothes/return | 의류 반환 신청 |
| [**clothesStorePost**](DefaultApi.md#clothesStorePost) | **POST** /clothes/store | 의류 보관 신청 |
| [**notificationsSlackPost**](DefaultApi.md#notificationsSlackPost) | **POST** /notifications/slack | Slack에 알림 보내기 |
| [**paymentsRetryPost**](DefaultApi.md#paymentsRetryPost) | **POST** /payments/retry | 실패한 결제 재시도 |
| [**paymentsUserIdAutoGet**](DefaultApi.md#paymentsUserIdAutoGet) | **GET** /payments/{userId}/auto | 자동 결제 |
| [**returnRequestsRequestIdReturnPut**](DefaultApi.md#returnRequestsRequestIdReturnPut) | **PUT** /return-requests/{requestId}/return | 의류 반환 완료 (배송팀용) |
| [**storageRequestsRequestIdPickupPut**](DefaultApi.md#storageRequestsRequestIdPickupPut) | **PUT** /storage-requests/{requestId}/pickup | 의류 수거 완료 (배송팀용) |
| [**storageRequestsRequestIdStorePut**](DefaultApi.md#storageRequestsRequestIdStorePut) | **PUT** /storage-requests/{requestId}/store | 의류 적재 완료 (물류팀용) |
| [**usersPost**](DefaultApi.md#usersPost) | **POST** /users | 회원가입 |



## authLoginPost

> AuthLoginPost200Response authLoginPost(authLoginPostRequest)

로그인

사용자 이메일과 비밀번호를 통해 로그인을 진행하고, 인증 토큰을 발급합니다.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AuthLoginPostRequest authLoginPostRequest = new AuthLoginPostRequest(); // AuthLoginPostRequest | 
        try {
            AuthLoginPost200Response result = apiInstance.authLoginPost(authLoginPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#authLoginPost");
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
| **authLoginPostRequest** | [**AuthLoginPostRequest**](AuthLoginPostRequest.md)|  | |

### Return type

[**AuthLoginPost200Response**](AuthLoginPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 로그인 성공 |  -  |
| **401** | Unauthorized |  -  |


## authLogoutPost

> AuthLogoutPost200Response authLogoutPost(authLogoutPostRequest)

로그아웃

현재 세션의 사용자를 로그아웃 처리합니다.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AuthLogoutPostRequest authLogoutPostRequest = new AuthLogoutPostRequest(); // AuthLogoutPostRequest | 
        try {
            AuthLogoutPost200Response result = apiInstance.authLogoutPost(authLogoutPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#authLogoutPost");
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
| **authLogoutPostRequest** | [**AuthLogoutPostRequest**](AuthLogoutPostRequest.md)|  | |

### Return type

[**AuthLogoutPost200Response**](AuthLogoutPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 로그아웃 성공 |  -  |


## clothesListUserIdGet

> ClothesListUserIdGet200Response clothesListUserIdGet(userId)

보관한 의류 리스트 조회

사용자가 보관한 의류 리스트를 조회하는 API

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer userId = 56; // Integer | 
        try {
            ClothesListUserIdGet200Response result = apiInstance.clothesListUserIdGet(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#clothesListUserIdGet");
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
| **userId** | **Integer**|  | |

### Return type

[**ClothesListUserIdGet200Response**](ClothesListUserIdGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 보관한 의류 리스트 조회 성공 |  -  |
| **404** | No clothes found |  -  |
| **401** | User not authenticated |  -  |


## clothesReturnPost

> clothesReturnPost(clothesReturnPostRequest)

의류 반환 신청

사용자가 보관된 의류의 반환을 신청합니다.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        ClothesReturnPostRequest clothesReturnPostRequest = new ClothesReturnPostRequest(); // ClothesReturnPostRequest | 
        try {
            apiInstance.clothesReturnPost(clothesReturnPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#clothesReturnPost");
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
| **clothesReturnPostRequest** | [**ClothesReturnPostRequest**](ClothesReturnPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## clothesStorePost

> ClothesStorePost200Response clothesStorePost(clothesStorePostRequest)

의류 보관 신청

사용자가 의류 보관을 신청하는 API

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        ClothesStorePostRequest clothesStorePostRequest = new ClothesStorePostRequest(); // ClothesStorePostRequest | 
        try {
            ClothesStorePost200Response result = apiInstance.clothesStorePost(clothesStorePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#clothesStorePost");
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
| **clothesStorePostRequest** | [**ClothesStorePostRequest**](ClothesStorePostRequest.md)|  | |

### Return type

[**ClothesStorePost200Response**](ClothesStorePost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 의류 보관 신청 성공 |  -  |
| **400** | Invalid input data |  -  |
| **401** | User not authenticated |  -  |
| **403** | User is not authorized to perform this action |  -  |


## notificationsSlackPost

> notificationsSlackPost(notificationsSlackPostRequest)

Slack에 알림 보내기

결제 실패 시 구성된 Slack 채널로 알림 메시지를 보냄

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        NotificationsSlackPostRequest notificationsSlackPostRequest = new NotificationsSlackPostRequest(); // NotificationsSlackPostRequest | 
        try {
            apiInstance.notificationsSlackPost(notificationsSlackPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#notificationsSlackPost");
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
| **notificationsSlackPostRequest** | [**NotificationsSlackPostRequest**](NotificationsSlackPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 알림 전송 |  -  |
| **400** | 잘못된 입력 |  -  |


## paymentsRetryPost

> paymentsRetryPost(paymentsRetryPostRequest)

실패한 결제 재시도

저장된 카드 정보를 사용하여 매일 실패한 결제를 자동으로 재시도

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        PaymentsRetryPostRequest paymentsRetryPostRequest = new PaymentsRetryPostRequest(); // PaymentsRetryPostRequest | 
        try {
            apiInstance.paymentsRetryPost(paymentsRetryPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#paymentsRetryPost");
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
| **paymentsRetryPostRequest** | [**PaymentsRetryPostRequest**](PaymentsRetryPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 결제 재시도 시작됨 |  -  |
| **404** | 사용자를 찾을 수 없음 |  -  |


## paymentsUserIdAutoGet

> PaymentsUserIdAutoGet200Response paymentsUserIdAutoGet(userId)

자동 결제

사용자의 월별 결제에 대한 자동 결제 상태를 검색

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Integer userId = 56; // Integer | user ID
        try {
            PaymentsUserIdAutoGet200Response result = apiInstance.paymentsUserIdAutoGet(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#paymentsUserIdAutoGet");
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
| **userId** | **Integer**| user ID | |

### Return type

[**PaymentsUserIdAutoGet200Response**](PaymentsUserIdAutoGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 결제 상태 검색 |  -  |
| **404** | User not found |  -  |


## returnRequestsRequestIdReturnPut

> StorageRequestsRequestIdPickupPut200Response returnRequestsRequestIdReturnPut(requestId)

의류 반환 완료 (배송팀용)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String requestId = "requestId_example"; // String | 
        try {
            StorageRequestsRequestIdPickupPut200Response result = apiInstance.returnRequestsRequestIdReturnPut(requestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#returnRequestsRequestIdReturnPut");
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
| **requestId** | **String**|  | |

### Return type

[**StorageRequestsRequestIdPickupPut200Response**](StorageRequestsRequestIdPickupPut200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 의류 반환 완료 |  -  |


## storageRequestsRequestIdPickupPut

> StorageRequestsRequestIdPickupPut200Response storageRequestsRequestIdPickupPut(requestId)

의류 수거 완료 (배송팀용)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String requestId = "requestId_example"; // String | 
        try {
            StorageRequestsRequestIdPickupPut200Response result = apiInstance.storageRequestsRequestIdPickupPut(requestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#storageRequestsRequestIdPickupPut");
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
| **requestId** | **String**|  | |

### Return type

[**StorageRequestsRequestIdPickupPut200Response**](StorageRequestsRequestIdPickupPut200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 의류 수거 완료 |  -  |


## storageRequestsRequestIdStorePut

> StorageRequestsRequestIdPickupPut200Response storageRequestsRequestIdStorePut(requestId)

의류 적재 완료 (물류팀용)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String requestId = "requestId_example"; // String | 
        try {
            StorageRequestsRequestIdPickupPut200Response result = apiInstance.storageRequestsRequestIdStorePut(requestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#storageRequestsRequestIdStorePut");
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
| **requestId** | **String**|  | |

### Return type

[**StorageRequestsRequestIdPickupPut200Response**](StorageRequestsRequestIdPickupPut200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 의류 적재 완료 |  -  |


## usersPost

> usersPost(usersPostRequest)

회원가입

핸드폰 번호, 주소, 비밀번호로 새로운 사용자 등록

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        UsersPostRequest usersPostRequest = new UsersPostRequest(); // UsersPostRequest | 
        try {
            apiInstance.usersPost(usersPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#usersPost");
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
| **usersPostRequest** | [**UsersPostRequest**](UsersPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | User created successfully |  -  |
| **400** | Invalid input |  -  |

