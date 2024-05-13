# GameApi

All URIs are relative to *https://api.rphaven.co.uk/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sessionDetails**](GameApi.md#sessionDetails) | **GET** /session/{sessionId} |  |
| [**showBranchGames**](GameApi.md#showBranchGames) | **GET** /branch/{branchId}/games | Returns all the games for a branch |
| [**showGameDetails**](GameApi.md#showGameDetails) | **GET** /game/{gameId} |  |
| [**showGameSessions**](GameApi.md#showGameSessions) | **GET** /game/{gameId}/sessions |  |



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
import org.openapitools.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        GameApi apiInstance = new GameApi(defaultClient);
        UUID sessionId = UUID.randomUUID(); // UUID | ID of the session
        try {
            SessionDetails result = apiInstance.sessionDetails(sessionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#sessionDetails");
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


## showBranchGames

> List&lt;BranchGames&gt; showBranchGames(branchId)

Returns all the games for a branch

Show all the games for a branch

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        GameApi apiInstance = new GameApi(defaultClient);
        UUID branchId = UUID.randomUUID(); // UUID | ID of the branch
        try {
            List<BranchGames> result = apiInstance.showBranchGames(branchId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#showBranchGames");
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
| **branchId** | **UUID**| ID of the branch | |

### Return type

[**List&lt;BranchGames&gt;**](BranchGames.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Show all the games for a branch |  -  |


## showGameDetails

> Game showGameDetails(gameId)



Show a game

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        GameApi apiInstance = new GameApi(defaultClient);
        UUID gameId = UUID.randomUUID(); // UUID | ID of the game
        try {
            Game result = apiInstance.showGameDetails(gameId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#showGameDetails");
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

[**Game**](Game.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | show Game |  -  |


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
import org.openapitools.client.api.GameApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.rphaven.co.uk/v1");

        GameApi apiInstance = new GameApi(defaultClient);
        UUID gameId = UUID.randomUUID(); // UUID | ID of the game
        try {
            GameSessions result = apiInstance.showGameSessions(gameId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GameApi#showGameSessions");
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

