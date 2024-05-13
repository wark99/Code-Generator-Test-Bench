# CommandsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCommand**](CommandsApi.md#createCommand) | **POST** /commands | Create a command |
| [**deleteCommand**](CommandsApi.md#deleteCommand) | **DELETE** /commands/{command_id} | Delete a command |
| [**executeCommand**](CommandsApi.md#executeCommand) | **POST** /commands/execute | Execute a command |
| [**getCommandById**](CommandsApi.md#getCommandById) | **GET** /commands/{command_id} | Get a command |
| [**listAutocompleteCommands**](CommandsApi.md#listAutocompleteCommands) | **GET** /teams/{team_id}/commands/autocomplete | List autocomplete commands |
| [**listCommandAutocompleteSuggestions**](CommandsApi.md#listCommandAutocompleteSuggestions) | **GET** /teams/{team_id}/commands/autocomplete_suggestions | List commands&#39; autocomplete data |
| [**listCommands**](CommandsApi.md#listCommands) | **GET** /commands | List commands for a team |
| [**regenCommandToken**](CommandsApi.md#regenCommandToken) | **PUT** /commands/{command_id}/regen_token | Generate a new token |
| [**updateCommand**](CommandsApi.md#updateCommand) | **PUT** /commands/{command_id} | Update a command |



## createCommand

> Command createCommand(createCommandRequest)

Create a command

Create a command for a team. ##### Permissions &#x60;manage_slash_commands&#x60; for the team the command is in. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        CommandsApi apiInstance = new CommandsApi(defaultClient);
        CreateCommandRequest createCommandRequest = new CreateCommandRequest(); // CreateCommandRequest | command to be created
        try {
            Command result = apiInstance.createCommand(createCommandRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommandsApi#createCommand");
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
| **createCommandRequest** | [**CreateCommandRequest**](CreateCommandRequest.md)| command to be created | |

### Return type

[**Command**](Command.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Command creation successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **501** |  |  -  |


## deleteCommand

> StatusOK deleteCommand(commandId)

Delete a command

Delete a command based on command id string. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        CommandsApi apiInstance = new CommandsApi(defaultClient);
        String commandId = "commandId_example"; // String | ID of the command to delete
        try {
            StatusOK result = apiInstance.deleteCommand(commandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommandsApi#deleteCommand");
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
| **commandId** | **String**| ID of the command to delete | |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Command deletion successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## executeCommand

> CommandResponse executeCommand(executeCommandRequest)

Execute a command

Execute a command on a team. ##### Permissions Must have &#x60;use_slash_commands&#x60; permission for the team the command is in. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        CommandsApi apiInstance = new CommandsApi(defaultClient);
        ExecuteCommandRequest executeCommandRequest = new ExecuteCommandRequest(); // ExecuteCommandRequest | command to be executed
        try {
            CommandResponse result = apiInstance.executeCommand(executeCommandRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommandsApi#executeCommand");
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
| **executeCommandRequest** | [**ExecuteCommandRequest**](ExecuteCommandRequest.md)| command to be executed | |

### Return type

[**CommandResponse**](CommandResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Command execution successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **501** |  |  -  |


## getCommandById

> Command getCommandById(commandId)

Get a command

Get a command definition based on command id string. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in.  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        CommandsApi apiInstance = new CommandsApi(defaultClient);
        String commandId = "commandId_example"; // String | ID of the command to get
        try {
            Command result = apiInstance.getCommandById(commandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommandsApi#getCommandById");
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
| **commandId** | **String**| ID of the command to get | |

### Return type

[**Command**](Command.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Command get successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## listAutocompleteCommands

> List&lt;Command&gt; listAutocompleteCommands(teamId)

List autocomplete commands

List autocomplete commands in the team. ##### Permissions &#x60;view_team&#x60; for the team. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        CommandsApi apiInstance = new CommandsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        try {
            List<Command> result = apiInstance.listAutocompleteCommands(teamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommandsApi#listAutocompleteCommands");
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
| **teamId** | **String**| Team GUID | |

### Return type

[**List&lt;Command&gt;**](Command.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Autocomplete commands retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## listCommandAutocompleteSuggestions

> List&lt;AutocompleteSuggestion&gt; listCommandAutocompleteSuggestions(teamId, userInput)

List commands&#39; autocomplete data

List commands&#39; autocomplete data for the team. ##### Permissions &#x60;view_team&#x60; for the team. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        CommandsApi apiInstance = new CommandsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String userInput = "userInput_example"; // String | String inputted by the user.
        try {
            List<AutocompleteSuggestion> result = apiInstance.listCommandAutocompleteSuggestions(teamId, userInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommandsApi#listCommandAutocompleteSuggestions");
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
| **teamId** | **String**| Team GUID | |
| **userInput** | **String**| String inputted by the user. | |

### Return type

[**List&lt;AutocompleteSuggestion&gt;**](AutocompleteSuggestion.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Commands&#39; autocomplete data retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## listCommands

> List&lt;Command&gt; listCommands(teamId, customOnly)

List commands for a team

List commands for a team. ##### Permissions &#x60;manage_slash_commands&#x60; if need list custom commands. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        CommandsApi apiInstance = new CommandsApi(defaultClient);
        String teamId = "teamId_example"; // String | The team id.
        Boolean customOnly = false; // Boolean | To get only the custom commands. If set to false will get the custom if the user have access plus the system commands, otherwise just the system commands. 
        try {
            List<Command> result = apiInstance.listCommands(teamId, customOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommandsApi#listCommands");
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
| **teamId** | **String**| The team id. | [optional] |
| **customOnly** | **Boolean**| To get only the custom commands. If set to false will get the custom if the user have access plus the system commands, otherwise just the system commands.  | [optional] [default to false] |

### Return type

[**List&lt;Command&gt;**](Command.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Commands retrieve successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **501** |  |  -  |


## regenCommandToken

> RegenCommandToken200Response regenCommandToken(commandId)

Generate a new token

Generate a new token for the command based on command id string. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        CommandsApi apiInstance = new CommandsApi(defaultClient);
        String commandId = "commandId_example"; // String | ID of the command to generate the new token
        try {
            RegenCommandToken200Response result = apiInstance.regenCommandToken(commandId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommandsApi#regenCommandToken");
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
| **commandId** | **String**| ID of the command to generate the new token | |

### Return type

[**RegenCommandToken200Response**](RegenCommandToken200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token generation successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## updateCommand

> Command updateCommand(commandId, command)

Update a command

Update a single command based on command id string and Command struct. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        CommandsApi apiInstance = new CommandsApi(defaultClient);
        String commandId = "commandId_example"; // String | ID of the command to update
        Command command = new Command(); // Command | 
        try {
            Command result = apiInstance.updateCommand(commandId, command);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommandsApi#updateCommand");
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
| **commandId** | **String**| ID of the command to update | |
| **command** | [**Command**](Command.md)|  | |

### Return type

[**Command**](Command.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Command updated successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |

