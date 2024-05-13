# DefaultApi

All URIs are relative to */api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**lessonsIdEvaluationsPost**](DefaultApi.md#lessonsIdEvaluationsPost) | **POST** /lessons/{id}/evaluations | Добавить оценку ученика по занятию |
| [**lessonsIdGet**](DefaultApi.md#lessonsIdGet) | **GET** /lessons/{id} | Получить информацию о занятии по ID |
| [**lessonsPost**](DefaultApi.md#lessonsPost) | **POST** /lessons | Добавить занятие |
| [**usersGet**](DefaultApi.md#usersGet) | **GET** /users | Получить список учеников |
| [**usersPost**](DefaultApi.md#usersPost) | **POST** /users | Добавить одного ученика |



## lessonsIdEvaluationsPost

> Evaluation lessonsIdEvaluationsPost(id, evaluation)

Добавить оценку ученика по занятию

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
        defaultClient.setBasePath("/api");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Long id = 56L; // Long | ID занятия
        Evaluation evaluation = new Evaluation(); // Evaluation | Данные новой оценки
        try {
            Evaluation result = apiInstance.lessonsIdEvaluationsPost(id, evaluation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#lessonsIdEvaluationsPost");
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
| **id** | **Long**| ID занятия | |
| **evaluation** | [**Evaluation**](Evaluation.md)| Данные новой оценки | |

### Return type

[**Evaluation**](Evaluation.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Успешное добавление |  -  |


## lessonsIdGet

> Lesson lessonsIdGet(id)

Получить информацию о занятии по ID

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
        defaultClient.setBasePath("/api");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Long id = 56L; // Long | ID занятия
        try {
            Lesson result = apiInstance.lessonsIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#lessonsIdGet");
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
| **id** | **Long**| ID занятия | |

### Return type

[**Lesson**](Lesson.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Успешный запрос |  -  |


## lessonsPost

> Lesson lessonsPost(lesson)

Добавить занятие

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
        defaultClient.setBasePath("/api");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Lesson lesson = new Lesson(); // Lesson | Данные нового занятия
        try {
            Lesson result = apiInstance.lessonsPost(lesson);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#lessonsPost");
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
| **lesson** | [**Lesson**](Lesson.md)| Данные нового занятия | |

### Return type

[**Lesson**](Lesson.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Успешное добавление |  -  |


## usersGet

> List&lt;User&gt; usersGet()

Получить список учеников

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
        defaultClient.setBasePath("/api");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<User> result = apiInstance.usersGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#usersGet");
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

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Успешный запрос |  -  |


## usersPost

> User usersPost(user)

Добавить одного ученика

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
        defaultClient.setBasePath("/api");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        User user = new User(); // User | Данные нового ученика
        try {
            User result = apiInstance.usersPost(user);
            System.out.println(result);
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
| **user** | [**User**](User.md)| Данные нового ученика | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Успешное добавление |  -  |

