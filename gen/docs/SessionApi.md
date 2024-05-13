# SessionApi

All URIs are relative to *https://api.rphaven.co.uk/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sessionDetails**](SessionApi.md#sessionDetails) | **GET** /session/{sessionId} |  |
| [**showGameSessions**](SessionApi.md#showGameSessions) | **GET** /game/{gameId}/sessions |  |
| [**showMeetSessions**](SessionApi.md#showMeetSessions) | **GET** /meet/{meetId}/sessions |  |



## sessionDetails

> SessionDetails sessionDetails(sessionId)



Show session for a game

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SessionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        SessionApi apiInstance = new SessionApi(defaultClient);
        UUID sessionId = UUID.randomUUID(); // UUID | ID of the session
        try {
            SessionDetails result = apiInstance.sessionDetails(sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionApi#sessionDetails");
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
| **sessionId** | **UUID**| ID of the session | |

### Return type

[**SessionDetails**](SessionDetails.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | show session details |  -  |


## showGameSessions

> GameSessions showGameSessions(gameId)



Show session for a game

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SessionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        SessionApi apiInstance = new SessionApi(defaultClient);
        UUID gameId = UUID.randomUUID(); // UUID | ID of the game
        try {
            GameSessions result = apiInstance.showGameSessions(gameId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionApi#showGameSessions");
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
| **gameId** | **UUID**| ID of the game | |

### Return type

[**GameSessions**](GameSessions.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | show Game sessions |  -  |


## showMeetSessions

> Object showMeetSessions(meetId)



Show all Session for a Meet

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SessionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        SessionApi apiInstance = new SessionApi(defaultClient);
        UUID meetId = UUID.randomUUID(); // UUID | ID of the Meet
        try {
            Object result = apiInstance.showMeetSessions(meetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SessionApi#showMeetSessions");
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
| **meetId** | **UUID**| ID of the Meet | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | show Meet |  -  |

