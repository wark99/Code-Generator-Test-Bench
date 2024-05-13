# DefaultApi

All URIs are relative to *http://ucic.extremist.gay:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**accountsGet**](DefaultApi.md#accountsGet) | **GET** /accounts |  |
| [**accountsIdCreatorGet**](DefaultApi.md#accountsIdCreatorGet) | **GET** /accounts/{id}/creator |  |
| [**accountsIdDelete**](DefaultApi.md#accountsIdDelete) | **DELETE** /accounts/{id} |  |
| [**accountsIdFollowPost**](DefaultApi.md#accountsIdFollowPost) | **POST** /accounts/{id}/follow |  |
| [**accountsIdFollowingGet**](DefaultApi.md#accountsIdFollowingGet) | **GET** /accounts/{id}/following |  |
| [**accountsIdGet**](DefaultApi.md#accountsIdGet) | **GET** /accounts/{id} |  |
| [**accountsIdPlaylistsGet**](DefaultApi.md#accountsIdPlaylistsGet) | **GET** /accounts/{id}/playlists |  |
| [**accountsIdPost**](DefaultApi.md#accountsIdPost) | **POST** /accounts/{id} |  |
| [**accountsIdRecommendedVideosGet**](DefaultApi.md#accountsIdRecommendedVideosGet) | **GET** /accounts/{id}/recommended-videos |  |
| [**accountsIdTagsGet**](DefaultApi.md#accountsIdTagsGet) | **GET** /accounts/{id}/tags |  |
| [**accountsIdUnfollowPost**](DefaultApi.md#accountsIdUnfollowPost) | **POST** /accounts/{id}/unfollow |  |
| [**accountsIdVideosGet**](DefaultApi.md#accountsIdVideosGet) | **GET** /accounts/{id}/videos |  |
| [**accountsLoginPost**](DefaultApi.md#accountsLoginPost) | **POST** /accounts/login |  |
| [**accountsRegisterPost**](DefaultApi.md#accountsRegisterPost) | **POST** /accounts/register |  |
| [**accountsSearchGet**](DefaultApi.md#accountsSearchGet) | **GET** /accounts/search |  |



## accountsGet

> List&lt;AccountResponse&gt; accountsGet(secret)



This endpoint retrieves all accounts. It requires a \&quot;secret\&quot; header with the value \&quot;meow\&quot;. &lt;br&gt; It responds with a list of all accounts in the system. (For debugging purposes)

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
        defaultClient.setBasePath("http://ucic.extremist.gay:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String secret = "meow"; // String | 
        try {
            List<AccountResponse> result = apiInstance.accountsGet(secret);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountsGet");
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
| **secret** | **String**|  | |

### Return type

[**List&lt;AccountResponse&gt;**](AccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## accountsIdCreatorGet

> AccountDisplayResponse accountsIdCreatorGet(id)



This endpoint retrieves a specific account&#39;s display details by ID. &lt;br&gt; It responds with the account&#39;s display details.

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
        defaultClient.setBasePath("http://ucic.extremist.gay:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            AccountDisplayResponse result = apiInstance.accountsIdCreatorGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountsIdCreatorGet");
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
| **id** | **String**|  | |

### Return type

[**AccountDisplayResponse**](AccountDisplayResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## accountsIdDelete

> ErrorResponse accountsIdDelete(id, token)



This endpoint deletes a specific account by ID. It requires a \&quot;token\&quot; header for authentication. &lt;br&gt; It responds with a NoContent response if the deletion is successful.

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
        defaultClient.setBasePath("http://ucic.extremist.gay:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | 
        String token = "token_example"; // String | 
        try {
            ErrorResponse result = apiInstance.accountsIdDelete(id, token);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountsIdDelete");
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
| **id** | **String**|  | |
| **token** | **String**|  | |

### Return type

[**ErrorResponse**](ErrorResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |


## accountsIdFollowPost

> ErrorResponse accountsIdFollowPost(id, token, accountId)



This endpoint allows a specific account to follow another account by ID. It requires \&quot;token\&quot; and \&quot;accountId\&quot; headers for authentication. &lt;br&gt; It responds with a success message if the follow action is successful.

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
        defaultClient.setBasePath("http://ucic.extremist.gay:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | 
        String token = "token_example"; // String | 
        String accountId = "accountId_example"; // String | 
        try {
            ErrorResponse result = apiInstance.accountsIdFollowPost(id, token, accountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountsIdFollowPost");
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
| **id** | **String**|  | |
| **token** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**ErrorResponse**](ErrorResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## accountsIdFollowingGet

> List&lt;AccountDisplayResponse&gt; accountsIdFollowingGet(id, token)



This endpoint retrieves a specific account&#39;s followed accounts by ID. It requires a \&quot;token\&quot; header for authentication. &lt;br&gt; It responds with the account&#39;s followed accounts.

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
        defaultClient.setBasePath("http://ucic.extremist.gay:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | 
        String token = "token_example"; // String | 
        try {
            List<AccountDisplayResponse> result = apiInstance.accountsIdFollowingGet(id, token);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountsIdFollowingGet");
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
| **id** | **String**|  | |
| **token** | **String**|  | |

### Return type

[**List&lt;AccountDisplayResponse&gt;**](AccountDisplayResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## accountsIdGet

> AccountsIdGet200Response accountsIdGet(id, token)



This endpoint retrieves a specific account by ID. It requires a \&quot;token\&quot; header for authentication. &lt;br&gt; It responds with the account&#39;s details if the retrieval is successful.

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
        defaultClient.setBasePath("http://ucic.extremist.gay:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | 
        String token = "token_example"; // String | 
        try {
            AccountsIdGet200Response result = apiInstance.accountsIdGet(id, token);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountsIdGet");
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
| **id** | **String**|  | |
| **token** | **String**|  | |

### Return type

[**AccountsIdGet200Response**](AccountsIdGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## accountsIdPlaylistsGet

> List&lt;PlaylistDisplayResponse&gt; accountsIdPlaylistsGet(id)



This endpoint retrieves a specific account&#39;s playlists by ID. &lt;br&gt; It responds with the account&#39;s playlists.

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
        defaultClient.setBasePath("http://ucic.extremist.gay:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            List<PlaylistDisplayResponse> result = apiInstance.accountsIdPlaylistsGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountsIdPlaylistsGet");
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
| **id** | **String**|  | |

### Return type

[**List&lt;PlaylistDisplayResponse&gt;**](PlaylistDisplayResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## accountsIdPost

> Object accountsIdPost(id)



This endpoint updates a specific account&#39;s details by ID. It requires a \&quot;token\&quot; header for authentication. &lt;br&gt; It responds with the updated account&#39;s details if the update is successful.

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
        defaultClient.setBasePath("http://ucic.extremist.gay:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            Object result = apiInstance.accountsIdPost(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountsIdPost");
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
| **id** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## accountsIdRecommendedVideosGet

> List&lt;VideoDisplayResponse&gt; accountsIdRecommendedVideosGet(id, token, by)



This endpoint retrieves recommended videos for a specific account by ID. It requires a \&quot;token\&quot; header for authentication and a \&quot;by\&quot; query parameter to specify the recommendation method. &lt;br&gt; It responds with a list of recommended videos.

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
        defaultClient.setBasePath("http://ucic.extremist.gay:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | 
        String token = "token_example"; // String | 
        String by = "tags"; // String | 
        try {
            List<VideoDisplayResponse> result = apiInstance.accountsIdRecommendedVideosGet(id, token, by);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountsIdRecommendedVideosGet");
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
| **id** | **String**|  | |
| **token** | **String**|  | |
| **by** | **String**|  | [enum: tags, following] |

### Return type

[**List&lt;VideoDisplayResponse&gt;**](VideoDisplayResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## accountsIdTagsGet

> List&lt;TagResponse&gt; accountsIdTagsGet(id, token)



This endpoint retrieves a specific account&#39;s followed tags by ID. It requires a \&quot;token\&quot; header for authentication. &lt;br&gt; It responds with the account&#39;s followed tags.

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
        defaultClient.setBasePath("http://ucic.extremist.gay:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | 
        String token = "token_example"; // String | 
        try {
            List<TagResponse> result = apiInstance.accountsIdTagsGet(id, token);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountsIdTagsGet");
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
| **id** | **String**|  | |
| **token** | **String**|  | |

### Return type

[**List&lt;TagResponse&gt;**](TagResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## accountsIdUnfollowPost

> ErrorResponse accountsIdUnfollowPost(id, token, accountId)



This endpoint allows a specific account to unfollow another account by ID. It requires \&quot;token\&quot; and \&quot;accountId\&quot; headers for authentication. &lt;br&gt; It responds with a success message if the unfollow action is successful.

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
        defaultClient.setBasePath("http://ucic.extremist.gay:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | 
        String token = "token_example"; // String | 
        String accountId = "accountId_example"; // String | 
        try {
            ErrorResponse result = apiInstance.accountsIdUnfollowPost(id, token, accountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountsIdUnfollowPost");
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
| **id** | **String**|  | |
| **token** | **String**|  | |
| **accountId** | **String**|  | |

### Return type

[**ErrorResponse**](ErrorResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## accountsIdVideosGet

> List&lt;VideoDisplayResponse&gt; accountsIdVideosGet(id)



This endpoint retrieves a specific account&#39;s videos by ID.&lt;br&gt; It responds with the account&#39;s videos.

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
        defaultClient.setBasePath("http://ucic.extremist.gay:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            List<VideoDisplayResponse> result = apiInstance.accountsIdVideosGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountsIdVideosGet");
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
| **id** | **String**|  | |

### Return type

[**List&lt;VideoDisplayResponse&gt;**](VideoDisplayResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## accountsLoginPost

> Object accountsLoginPost(loginAccount)



This endpoint allows an account to log in. It accepts a POST request with a body containing the account&#39;s email and password. &lt;br&gt; It responds with a token and account ID if the login is successful.

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
        defaultClient.setBasePath("http://ucic.extremist.gay:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LoginAccount loginAccount = new LoginAccount(); // LoginAccount | 
        try {
            Object result = apiInstance.accountsLoginPost(loginAccount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountsLoginPost");
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
| **loginAccount** | [**LoginAccount**](LoginAccount.md)|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## accountsRegisterPost

> AccountsRegisterPost200Response accountsRegisterPost(registrationAccount)



This endpoint allows a new account to register. It accepts a POST request with a body containing the account&#39;s username, email, and password. &lt;br&gt; It responds with the registered account&#39;s token and ID if the registration is successful.

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
        defaultClient.setBasePath("http://ucic.extremist.gay:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        RegistrationAccount registrationAccount = new RegistrationAccount(); // RegistrationAccount | 
        try {
            AccountsRegisterPost200Response result = apiInstance.accountsRegisterPost(registrationAccount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountsRegisterPost");
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
| **registrationAccount** | [**RegistrationAccount**](RegistrationAccount.md)|  | [optional] |

### Return type

[**AccountsRegisterPost200Response**](AccountsRegisterPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## accountsSearchGet

> List&lt;AccountDisplayResponse&gt; accountsSearchGet(q, fuzzy)



This endpoint searches for accounts. It accepts a \&quot;q\&quot; query parameter for the search query and an optional \&quot;fuzzy\&quot; query parameter to enable fuzzy search. &lt;br&gt; It responds with a list of matching accounts.

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
        defaultClient.setBasePath("http://ucic.extremist.gay:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String q = "q_example"; // String | 
        Boolean fuzzy = true; // Boolean | 
        try {
            List<AccountDisplayResponse> result = apiInstance.accountsSearchGet(q, fuzzy);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#accountsSearchGet");
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
| **q** | **String**|  | |
| **fuzzy** | **Boolean**|  | [optional] |

### Return type

[**List&lt;AccountDisplayResponse&gt;**](AccountDisplayResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

