# DefaultApi

All URIs are relative to *http://localhost:5000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**institutionsGet**](DefaultApi.md#institutionsGet) | **GET** /institutions | List all institutions. |
| [**institutionsInstitutionCoursesGet**](DefaultApi.md#institutionsInstitutionCoursesGet) | **GET** /institutions/{institution}/courses | List all courses for a specific institution. |
| [**institutionsInstitutionProgrammesGet**](DefaultApi.md#institutionsInstitutionProgrammesGet) | **GET** /institutions/{institution}/programmes | List all programmes for a specific institution. |
| [**schedulesGet**](DefaultApi.md#schedulesGet) | **GET** /schedules | List all schedules. |
| [**schedulesPost**](DefaultApi.md#schedulesPost) | **POST** /schedules | Enable or disable scraping schedules. |
| [**scrapingJobScrapingIdPost**](DefaultApi.md#scrapingJobScrapingIdPost) | **POST** /scraping-job/{scraping_id} | Approve or reject a scraping job. |
| [**scrapingJobsGet**](DefaultApi.md#scrapingJobsGet) | **GET** /scraping-jobs | List all scraping jobs. |
| [**scrapingJobsInstitutionNameGet**](DefaultApi.md#scrapingJobsInstitutionNameGet) | **GET** /scraping-jobs/{institution_name} | List scraping jobs for a specific institution. |
| [**scrapingJobsInstitutionNamePost**](DefaultApi.md#scrapingJobsInstitutionNamePost) | **POST** /scraping-jobs/{institution_name} | Start or stop scraping job for a institution. |
| [**scrapingPreviewGet**](DefaultApi.md#scrapingPreviewGet) | **GET** /scraping-preview | Get all scraping session awaiting approval of associated data. |
| [**scrapingPreviewInstitutionGet**](DefaultApi.md#scrapingPreviewInstitutionGet) | **GET** /scraping-preview/{institution} | Get scraping sessions awaiting approval for a specific institution. |
| [**scrapingPreviewInstitutionSessionIdGet**](DefaultApi.md#scrapingPreviewInstitutionSessionIdGet) | **GET** /scraping-preview/{institution}/{session_id} | Get preview data for a specific session by institution. |



## institutionsGet

> InstitutionsGet200Response institutionsGet()

List all institutions.

Retrieve a list of all available institutions.

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
        defaultClient.setBasePath("http://localhost:5000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            InstitutionsGet200Response result = apiInstance.institutionsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#institutionsGet");
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

[**InstitutionsGet200Response**](InstitutionsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of institutions. |  -  |


## institutionsInstitutionCoursesGet

> InstitutionsInstitutionCoursesGet200Response institutionsInstitutionCoursesGet(institution)

List all courses for a specific institution.

Retrieve all courses associated with a given institution.

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
        defaultClient.setBasePath("http://localhost:5000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String institution = "institution_example"; // String | 
        try {
            InstitutionsInstitutionCoursesGet200Response result = apiInstance.institutionsInstitutionCoursesGet(institution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#institutionsInstitutionCoursesGet");
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
| **institution** | **String**|  | |

### Return type

[**InstitutionsInstitutionCoursesGet200Response**](InstitutionsInstitutionCoursesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of courses. |  -  |
| **404** | Institution not found. |  -  |


## institutionsInstitutionProgrammesGet

> InstitutionsInstitutionProgrammesGet200Response institutionsInstitutionProgrammesGet(institution)

List all programmes for a specific institution.

Retrieve all programmes associated with a given institution.

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
        defaultClient.setBasePath("http://localhost:5000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String institution = "institution_example"; // String | 
        try {
            InstitutionsInstitutionProgrammesGet200Response result = apiInstance.institutionsInstitutionProgrammesGet(institution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#institutionsInstitutionProgrammesGet");
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
| **institution** | **String**|  | |

### Return type

[**InstitutionsInstitutionProgrammesGet200Response**](InstitutionsInstitutionProgrammesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of programmes. |  -  |
| **404** | Institution not found. |  -  |


## schedulesGet

> List&lt;SchedulesGet200ResponseInner&gt; schedulesGet()

List all schedules.

Retrieve a list of all active schedules.

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
        defaultClient.setBasePath("http://localhost:5000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            List<SchedulesGet200ResponseInner> result = apiInstance.schedulesGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#schedulesGet");
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

[**List&lt;SchedulesGet200ResponseInner&gt;**](SchedulesGet200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of schedules. |  -  |


## schedulesPost

> schedulesPost(schedulesPostRequest)

Enable or disable scraping schedules.

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
        defaultClient.setBasePath("http://localhost:5000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        SchedulesPostRequest schedulesPostRequest = new SchedulesPostRequest(); // SchedulesPostRequest | 
        try {
            apiInstance.schedulesPost(schedulesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#schedulesPost");
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
| **schedulesPostRequest** | [**SchedulesPostRequest**](SchedulesPostRequest.md)|  | |

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
| **201** | Scheduling action executed successfully. |  -  |
| **400** | Invalid or missing action in request. |  -  |


## scrapingJobScrapingIdPost

> scrapingJobScrapingIdPost(scrapingId, scrapingJobScrapingIdPostRequest)

Approve or reject a scraping job.

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
        defaultClient.setBasePath("http://localhost:5000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String scrapingId = "scrapingId_example"; // String | 
        ScrapingJobScrapingIdPostRequest scrapingJobScrapingIdPostRequest = new ScrapingJobScrapingIdPostRequest(); // ScrapingJobScrapingIdPostRequest | 
        try {
            apiInstance.scrapingJobScrapingIdPost(scrapingId, scrapingJobScrapingIdPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#scrapingJobScrapingIdPost");
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
| **scrapingId** | **String**|  | |
| **scrapingJobScrapingIdPostRequest** | [**ScrapingJobScrapingIdPostRequest**](ScrapingJobScrapingIdPostRequest.md)|  | |

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
| **201** | Scraping data approved successfully. |  -  |
| **400** | Invalid input. |  -  |


## scrapingJobsGet

> ScrapingJobsGet200Response scrapingJobsGet()

List all scraping jobs.

Retrieve a list of all running scraping jobs.

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
        defaultClient.setBasePath("http://localhost:5000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            ScrapingJobsGet200Response result = apiInstance.scrapingJobsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#scrapingJobsGet");
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

[**ScrapingJobsGet200Response**](ScrapingJobsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of scraping jobs. |  -  |


## scrapingJobsInstitutionNameGet

> ScrapingJobsGet200Response scrapingJobsInstitutionNameGet(institutionName)

List scraping jobs for a specific institution.

Retrieve all scraping jobs running for a specific institution.

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
        defaultClient.setBasePath("http://localhost:5000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String institutionName = "institutionName_example"; // String | 
        try {
            ScrapingJobsGet200Response result = apiInstance.scrapingJobsInstitutionNameGet(institutionName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#scrapingJobsInstitutionNameGet");
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
| **institutionName** | **String**|  | |

### Return type

[**ScrapingJobsGet200Response**](ScrapingJobsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of scraping jobs. |  -  |


## scrapingJobsInstitutionNamePost

> scrapingJobsInstitutionNamePost(institutionName, schedulesPostRequest)

Start or stop scraping job for a institution.

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
        defaultClient.setBasePath("http://localhost:5000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String institutionName = "institutionName_example"; // String | 
        SchedulesPostRequest schedulesPostRequest = new SchedulesPostRequest(); // SchedulesPostRequest | 
        try {
            apiInstance.scrapingJobsInstitutionNamePost(institutionName, schedulesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#scrapingJobsInstitutionNamePost");
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
| **institutionName** | **String**|  | |
| **schedulesPostRequest** | [**SchedulesPostRequest**](SchedulesPostRequest.md)|  | |

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
| **201** | Scraping job updated successfully. |  -  |
| **400** | Invalid action. |  -  |


## scrapingPreviewGet

> ScrapingPreviewGet200Response scrapingPreviewGet()

Get all scraping session awaiting approval of associated data.

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
        defaultClient.setBasePath("http://localhost:5000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            ScrapingPreviewGet200Response result = apiInstance.scrapingPreviewGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#scrapingPreviewGet");
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

[**ScrapingPreviewGet200Response**](ScrapingPreviewGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A list of all scraping sessions awaiting approval. |  -  |


## scrapingPreviewInstitutionGet

> ScrapingPreviewGet200Response scrapingPreviewInstitutionGet(institution)

Get scraping sessions awaiting approval for a specific institution.

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
        defaultClient.setBasePath("http://localhost:5000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String institution = "institution_example"; // String | 
        try {
            ScrapingPreviewGet200Response result = apiInstance.scrapingPreviewInstitutionGet(institution);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#scrapingPreviewInstitutionGet");
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
| **institution** | **String**|  | |

### Return type

[**ScrapingPreviewGet200Response**](ScrapingPreviewGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of sessions awaiting approval for the given institution. |  -  |


## scrapingPreviewInstitutionSessionIdGet

> scrapingPreviewInstitutionSessionIdGet(institution, sessionId)

Get preview data for a specific session by institution.

Retrieve a random set of data from a specific session by institution.

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
        defaultClient.setBasePath("http://localhost:5000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String institution = "institution_example"; // String | 
        String sessionId = "sessionId_example"; // String | 
        try {
            apiInstance.scrapingPreviewInstitutionSessionIdGet(institution, sessionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#scrapingPreviewInstitutionSessionIdGet");
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
| **institution** | **String**|  | |
| **sessionId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The session data. |  -  |

