# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**basicUserInfoPost**](DefaultApi.md#basicUserInfoPost) | **POST** /basic-user-info | Collect basic user information like full name and referral source. |
| [**businessHoursNotificationGet**](DefaultApi.md#businessHoursNotificationGet) | **GET** /business-hours-notification | Notify the user about business hours and expected response times. |
| [**caseSpecificQueriesPost**](DefaultApi.md#caseSpecificQueriesPost) | **POST** /case-specific-queries | Ask case-specific questions regarding legal representation and accident details. |
| [**consentConfirmationDisclaimerPost**](DefaultApi.md#consentConfirmationDisclaimerPost) | **POST** /consent-confirmation-disclaimer | Confirm user&#39;s understanding of the service&#39;s nature and limitations. |
| [**consentVerificationPost**](DefaultApi.md#consentVerificationPost) | **POST** /consent-verification | Verify user consent for communication via text (SMS). |
| [**endInteractionPost**](DefaultApi.md#endInteractionPost) | **POST** /end-interaction | Conclude the interaction and provide closure. |
| [**feedbackCollectionPost**](DefaultApi.md#feedbackCollectionPost) | **POST** /feedback-collection | Collect user feedback for continuous improvement. |
| [**followUpQuestionsPost**](DefaultApi.md#followUpQuestionsPost) | **POST** /follow-up-questions | Pose detailed follow-up questions based on previous responses. |
| [**initializePost**](DefaultApi.md#initializePost) | **POST** /initialize | Start a new user session with an initial greeting. |



## basicUserInfoPost

> basicUserInfoPost(basicUserInfoPostRequest)

Collect basic user information like full name and referral source.

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
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BasicUserInfoPostRequest basicUserInfoPostRequest = new BasicUserInfoPostRequest(); // BasicUserInfoPostRequest | 
        try {
            apiInstance.basicUserInfoPost(basicUserInfoPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#basicUserInfoPost");
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
| **basicUserInfoPostRequest** | [**BasicUserInfoPostRequest**](BasicUserInfoPostRequest.md)|  | |

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
| **200** | Request for basic user information. |  -  |


## businessHoursNotificationGet

> businessHoursNotificationGet()

Notify the user about business hours and expected response times.

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
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            apiInstance.businessHoursNotificationGet();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#businessHoursNotificationGet");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Business hours information. |  -  |


## caseSpecificQueriesPost

> caseSpecificQueriesPost(basicUserInfoPostRequest)

Ask case-specific questions regarding legal representation and accident details.

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
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BasicUserInfoPostRequest basicUserInfoPostRequest = new BasicUserInfoPostRequest(); // BasicUserInfoPostRequest | 
        try {
            apiInstance.caseSpecificQueriesPost(basicUserInfoPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#caseSpecificQueriesPost");
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
| **basicUserInfoPostRequest** | [**BasicUserInfoPostRequest**](BasicUserInfoPostRequest.md)|  | |

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
| **200** | Case-specific queries and potential off-ramp scenarios. |  -  |


## consentConfirmationDisclaimerPost

> consentConfirmationDisclaimerPost(consentConfirmationDisclaimerPostRequest)

Confirm user&#39;s understanding of the service&#39;s nature and limitations.

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
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        ConsentConfirmationDisclaimerPostRequest consentConfirmationDisclaimerPostRequest = new ConsentConfirmationDisclaimerPostRequest(); // ConsentConfirmationDisclaimerPostRequest | 
        try {
            apiInstance.consentConfirmationDisclaimerPost(consentConfirmationDisclaimerPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#consentConfirmationDisclaimerPost");
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
| **consentConfirmationDisclaimerPostRequest** | [**ConsentConfirmationDisclaimerPostRequest**](ConsentConfirmationDisclaimerPostRequest.md)|  | |

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
| **200** | Confirmation of user&#39;s understanding and consent. |  -  |


## consentVerificationPost

> consentVerificationPost(consentVerificationPostRequest)

Verify user consent for communication via text (SMS).

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
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        ConsentVerificationPostRequest consentVerificationPostRequest = new ConsentVerificationPostRequest(); // ConsentVerificationPostRequest | 
        try {
            apiInstance.consentVerificationPost(consentVerificationPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#consentVerificationPost");
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
| **consentVerificationPostRequest** | [**ConsentVerificationPostRequest**](ConsentVerificationPostRequest.md)|  | |

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
| **200** | Confirmation of consent verification. |  -  |


## endInteractionPost

> endInteractionPost(basicUserInfoPostRequest)

Conclude the interaction and provide closure.

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
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BasicUserInfoPostRequest basicUserInfoPostRequest = new BasicUserInfoPostRequest(); // BasicUserInfoPostRequest | 
        try {
            apiInstance.endInteractionPost(basicUserInfoPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#endInteractionPost");
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
| **basicUserInfoPostRequest** | [**BasicUserInfoPostRequest**](BasicUserInfoPostRequest.md)|  | |

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
| **200** | Thank you message and interaction conclusion. |  -  |


## feedbackCollectionPost

> feedbackCollectionPost(feedbackCollectionPostRequest)

Collect user feedback for continuous improvement.

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
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        FeedbackCollectionPostRequest feedbackCollectionPostRequest = new FeedbackCollectionPostRequest(); // FeedbackCollectionPostRequest | 
        try {
            apiInstance.feedbackCollectionPost(feedbackCollectionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#feedbackCollectionPost");
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
| **feedbackCollectionPostRequest** | [**FeedbackCollectionPostRequest**](FeedbackCollectionPostRequest.md)|  | |

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
| **200** | Acknowledgement of feedback and appreciation. |  -  |


## followUpQuestionsPost

> followUpQuestionsPost(followUpQuestionsPostRequest)

Pose detailed follow-up questions based on previous responses.

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
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        FollowUpQuestionsPostRequest followUpQuestionsPostRequest = new FollowUpQuestionsPostRequest(); // FollowUpQuestionsPostRequest | 
        try {
            apiInstance.followUpQuestionsPost(followUpQuestionsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#followUpQuestionsPost");
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
| **followUpQuestionsPostRequest** | [**FollowUpQuestionsPostRequest**](FollowUpQuestionsPostRequest.md)|  | |

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
| **200** | Follow-up questions for clarity and completeness. |  -  |


## initializePost

> initializePost(initializePostRequest)

Start a new user session with an initial greeting.

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
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        InitializePostRequest initializePostRequest = new InitializePostRequest(); // InitializePostRequest | 
        try {
            apiInstance.initializePost(initializePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#initializePost");
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
| **initializePostRequest** | [**InitializePostRequest**](InitializePostRequest.md)|  | |

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
| **200** | Initial greeting and preliminary questions. |  -  |

