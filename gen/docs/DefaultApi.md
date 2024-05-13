# DefaultApi

All URIs are relative to *https://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createUserAccount**](DefaultApi.md#createUserAccount) | **POST** /v1/api/user/accounts | create user account |
| [**getAccounts**](DefaultApi.md#getAccounts) | **GET** /v1/api/accounts | get accounts |
| [**getTransactions**](DefaultApi.md#getTransactions) | **GET** /v1/api/transactions | get transactions |
| [**send**](DefaultApi.md#send) | **POST** /v1/api/send | send |
| [**signin**](DefaultApi.md#signin) | **POST** /api/v1/signin | signin |
| [**signup**](DefaultApi.md#signup) | **POST** /api/v1/signup | signup |
| [**withdraw**](DefaultApi.md#withdraw) | **POST** /v1/api/withdraw | withdraw |



## createUserAccount

> CreateUserAccount200Response createUserAccount(createUserAccountRequest)

create user account

create user account

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        CreateUserAccountRequest createUserAccountRequest = new CreateUserAccountRequest(); // CreateUserAccountRequest | 
        try {
            CreateUserAccount200Response result = apiInstance.createUserAccount(createUserAccountRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createUserAccount");
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
| **createUserAccountRequest** | [**CreateUserAccountRequest**](CreateUserAccountRequest.md)|  | [optional] |

### Return type

[**CreateUserAccount200Response**](CreateUserAccount200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success_create_account |  -  |
| **400** | failed_create_account_400 |  -  |
| **500** | failed_send_up_500 |  -  |


## getAccounts

> GetAccounts200Response getAccounts(startDate, endDate, status, accountType, sendRequest)

get accounts

get accounts

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String startDate = "2024-06-09"; // String | 
        String endDate = "2024-07-09"; // String | 
        String status = "true"; // String | 
        String accountType = "debit"; // String | debit,credit,loan
        SendRequest sendRequest = new SendRequest(); // SendRequest | 
        try {
            GetAccounts200Response result = apiInstance.getAccounts(startDate, endDate, status, accountType, sendRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getAccounts");
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
| **startDate** | **String**|  | [optional] |
| **endDate** | **String**|  | [optional] |
| **status** | **String**|  | [optional] |
| **accountType** | **String**| debit,credit,loan | [optional] |
| **sendRequest** | [**SendRequest**](SendRequest.md)|  | [optional] |

### Return type

[**GetAccounts200Response**](GetAccounts200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success_get_accounts |  -  |
| **404** | failed_get_transactions_404 |  -  |
| **500** | failed_get_transactions_500 |  -  |


## getTransactions

> GetTransactions200Response getTransactions(startDate, endDate, status, transactionType, sendRequest)

get transactions

get transactions

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String startDate = "2024-06-09"; // String | 
        String endDate = "2024-07-09"; // String | 
        String status = "true"; // String | 
        String transactionType = "withdraw"; // String | withdraw / send
        SendRequest sendRequest = new SendRequest(); // SendRequest | 
        try {
            GetTransactions200Response result = apiInstance.getTransactions(startDate, endDate, status, transactionType, sendRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getTransactions");
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
| **startDate** | **String**|  | [optional] |
| **endDate** | **String**|  | [optional] |
| **status** | **String**|  | [optional] |
| **transactionType** | **String**| withdraw / send | [optional] |
| **sendRequest** | [**SendRequest**](SendRequest.md)|  | [optional] |

### Return type

[**GetTransactions200Response**](GetTransactions200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success_get_transactions |  -  |
| **404** | failed_get_transactions_404 |  -  |
| **500** | failed_get_transactions_500 |  -  |


## send

> Send200Response send(sendRequest)

send

send

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        SendRequest sendRequest = new SendRequest(); // SendRequest | 
        try {
            Send200Response result = apiInstance.send(sendRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#send");
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
| **sendRequest** | [**SendRequest**](SendRequest.md)|  | [optional] |

### Return type

[**Send200Response**](Send200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success_send |  -  |
| **400** | failed_send_400 |  -  |
| **404** | failed_send_404 |  -  |
| **500** | failed_send_up_500 |  -  |


## signin

> Signin200Response signin(signupRequest)

signin

signin

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
        defaultClient.setBasePath("https://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        SignupRequest signupRequest = new SignupRequest(); // SignupRequest | 
        try {
            Signin200Response result = apiInstance.signin(signupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#signin");
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
| **signupRequest** | [**SignupRequest**](SignupRequest.md)|  | [optional] |

### Return type

[**Signin200Response**](Signin200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success_signin |  -  |
| **400** | failed_signup_400 |  -  |
| **404** | failed_signup_404 |  -  |
| **500** | failed_sign_up_500 |  -  |


## signup

> Signup200Response signup(signupRequest)

signup

signup

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
        defaultClient.setBasePath("https://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        SignupRequest signupRequest = new SignupRequest(); // SignupRequest | 
        try {
            Signup200Response result = apiInstance.signup(signupRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#signup");
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
| **signupRequest** | [**SignupRequest**](SignupRequest.md)|  | [optional] |

### Return type

[**Signup200Response**](Signup200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success_signup |  -  |
| **400** | failed_signup_400 |  -  |
| **500** | failed_sign_up_500 |  -  |


## withdraw

> Withdraw200Response withdraw(sendRequest)

withdraw

withdraw

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        SendRequest sendRequest = new SendRequest(); // SendRequest | 
        try {
            Withdraw200Response result = apiInstance.withdraw(sendRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#withdraw");
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
| **sendRequest** | [**SendRequest**](SendRequest.md)|  | [optional] |

### Return type

[**Withdraw200Response**](Withdraw200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success_withdraw |  -  |
| **400** | failed_withdraw_400 |  -  |
| **404** | failed_withdraw_404 |  -  |
| **500** | failed_withdraw_500 |  -  |

