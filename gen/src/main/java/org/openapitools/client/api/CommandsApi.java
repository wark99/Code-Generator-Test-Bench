package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.AppError;
import org.openapitools.client.model.AutocompleteSuggestion;
import org.openapitools.client.model.Command;
import org.openapitools.client.model.CommandResponse;
import org.openapitools.client.model.CreateCommandRequest;
import org.openapitools.client.model.ExecuteCommandRequest;
import org.openapitools.client.model.RegenCommandToken200Response;
import org.openapitools.client.model.StatusOK;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CommandsApi {
    private ApiClient apiClient;

    public CommandsApi() {
        this(new ApiClient());
    }

    public CommandsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a command
     * Create a command for a team. ##### Permissions &#x60;manage_slash_commands&#x60; for the team the command is in. 
     * <p><b>201</b> - Command creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param createCommandRequest command to be created (required)
     * @return Command
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Command createCommand(CreateCommandRequest createCommandRequest) throws RestClientException {
        return createCommandWithHttpInfo(createCommandRequest).getBody();
    }

    /**
     * Create a command
     * Create a command for a team. ##### Permissions &#x60;manage_slash_commands&#x60; for the team the command is in. 
     * <p><b>201</b> - Command creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param createCommandRequest command to be created (required)
     * @return ResponseEntity&lt;Command&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Command> createCommandWithHttpInfo(CreateCommandRequest createCommandRequest) throws RestClientException {
        Object localVarPostBody = createCommandRequest;
        
        // verify the required parameter 'createCommandRequest' is set
        if (createCommandRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createCommandRequest' when calling createCommand");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Command> localReturnType = new ParameterizedTypeReference<Command>() {};
        return apiClient.invokeAPI("/commands", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a command
     * Delete a command based on command id string. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 
     * <p><b>200</b> - Command deletion successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param commandId ID of the command to delete (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK deleteCommand(String commandId) throws RestClientException {
        return deleteCommandWithHttpInfo(commandId).getBody();
    }

    /**
     * Delete a command
     * Delete a command based on command id string. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 
     * <p><b>200</b> - Command deletion successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param commandId ID of the command to delete (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> deleteCommandWithHttpInfo(String commandId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'commandId' is set
        if (commandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commandId' when calling deleteCommand");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("command_id", commandId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<StatusOK> localReturnType = new ParameterizedTypeReference<StatusOK>() {};
        return apiClient.invokeAPI("/commands/{command_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Execute a command
     * Execute a command on a team. ##### Permissions Must have &#x60;use_slash_commands&#x60; permission for the team the command is in. 
     * <p><b>200</b> - Command execution successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param executeCommandRequest command to be executed (required)
     * @return CommandResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommandResponse executeCommand(ExecuteCommandRequest executeCommandRequest) throws RestClientException {
        return executeCommandWithHttpInfo(executeCommandRequest).getBody();
    }

    /**
     * Execute a command
     * Execute a command on a team. ##### Permissions Must have &#x60;use_slash_commands&#x60; permission for the team the command is in. 
     * <p><b>200</b> - Command execution successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param executeCommandRequest command to be executed (required)
     * @return ResponseEntity&lt;CommandResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommandResponse> executeCommandWithHttpInfo(ExecuteCommandRequest executeCommandRequest) throws RestClientException {
        Object localVarPostBody = executeCommandRequest;
        
        // verify the required parameter 'executeCommandRequest' is set
        if (executeCommandRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'executeCommandRequest' when calling executeCommand");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<CommandResponse> localReturnType = new ParameterizedTypeReference<CommandResponse>() {};
        return apiClient.invokeAPI("/commands/execute", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a command
     * Get a command definition based on command id string. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in.  
     * <p><b>200</b> - Command get successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param commandId ID of the command to get (required)
     * @return Command
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Command getCommandById(String commandId) throws RestClientException {
        return getCommandByIdWithHttpInfo(commandId).getBody();
    }

    /**
     * Get a command
     * Get a command definition based on command id string. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in.  
     * <p><b>200</b> - Command get successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param commandId ID of the command to get (required)
     * @return ResponseEntity&lt;Command&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Command> getCommandByIdWithHttpInfo(String commandId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'commandId' is set
        if (commandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commandId' when calling getCommandById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("command_id", commandId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Command> localReturnType = new ParameterizedTypeReference<Command>() {};
        return apiClient.invokeAPI("/commands/{command_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List autocomplete commands
     * List autocomplete commands in the team. ##### Permissions &#x60;view_team&#x60; for the team. 
     * <p><b>200</b> - Autocomplete commands retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @return List&lt;Command&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Command> listAutocompleteCommands(String teamId) throws RestClientException {
        return listAutocompleteCommandsWithHttpInfo(teamId).getBody();
    }

    /**
     * List autocomplete commands
     * List autocomplete commands in the team. ##### Permissions &#x60;view_team&#x60; for the team. 
     * <p><b>200</b> - Autocomplete commands retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @return ResponseEntity&lt;List&lt;Command&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Command>> listAutocompleteCommandsWithHttpInfo(String teamId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling listAutocompleteCommands");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Command>> localReturnType = new ParameterizedTypeReference<List<Command>>() {};
        return apiClient.invokeAPI("/teams/{team_id}/commands/autocomplete", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List commands&#39; autocomplete data
     * List commands&#39; autocomplete data for the team. ##### Permissions &#x60;view_team&#x60; for the team. 
     * <p><b>200</b> - Commands&#39; autocomplete data retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param userInput String inputted by the user. (required)
     * @return List&lt;AutocompleteSuggestion&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AutocompleteSuggestion> listCommandAutocompleteSuggestions(String teamId, String userInput) throws RestClientException {
        return listCommandAutocompleteSuggestionsWithHttpInfo(teamId, userInput).getBody();
    }

    /**
     * List commands&#39; autocomplete data
     * List commands&#39; autocomplete data for the team. ##### Permissions &#x60;view_team&#x60; for the team. 
     * <p><b>200</b> - Commands&#39; autocomplete data retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param teamId Team GUID (required)
     * @param userInput String inputted by the user. (required)
     * @return ResponseEntity&lt;List&lt;AutocompleteSuggestion&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AutocompleteSuggestion>> listCommandAutocompleteSuggestionsWithHttpInfo(String teamId, String userInput) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'teamId' is set
        if (teamId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'teamId' when calling listCommandAutocompleteSuggestions");
        }
        
        // verify the required parameter 'userInput' is set
        if (userInput == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userInput' when calling listCommandAutocompleteSuggestions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("team_id", teamId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "user_input", userInput));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<AutocompleteSuggestion>> localReturnType = new ParameterizedTypeReference<List<AutocompleteSuggestion>>() {};
        return apiClient.invokeAPI("/teams/{team_id}/commands/autocomplete_suggestions", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List commands for a team
     * List commands for a team. ##### Permissions &#x60;manage_slash_commands&#x60; if need list custom commands. 
     * <p><b>200</b> - List Commands retrieve successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param teamId The team id. (optional)
     * @param customOnly To get only the custom commands. If set to false will get the custom if the user have access plus the system commands, otherwise just the system commands.  (optional, default to false)
     * @return List&lt;Command&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Command> listCommands(String teamId, Boolean customOnly) throws RestClientException {
        return listCommandsWithHttpInfo(teamId, customOnly).getBody();
    }

    /**
     * List commands for a team
     * List commands for a team. ##### Permissions &#x60;manage_slash_commands&#x60; if need list custom commands. 
     * <p><b>200</b> - List Commands retrieve successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param teamId The team id. (optional)
     * @param customOnly To get only the custom commands. If set to false will get the custom if the user have access plus the system commands, otherwise just the system commands.  (optional, default to false)
     * @return ResponseEntity&lt;List&lt;Command&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Command>> listCommandsWithHttpInfo(String teamId, Boolean customOnly) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "team_id", teamId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "custom_only", customOnly));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<Command>> localReturnType = new ParameterizedTypeReference<List<Command>>() {};
        return apiClient.invokeAPI("/commands", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Generate a new token
     * Generate a new token for the command based on command id string. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 
     * <p><b>200</b> - Token generation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param commandId ID of the command to generate the new token (required)
     * @return RegenCommandToken200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RegenCommandToken200Response regenCommandToken(String commandId) throws RestClientException {
        return regenCommandTokenWithHttpInfo(commandId).getBody();
    }

    /**
     * Generate a new token
     * Generate a new token for the command based on command id string. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 
     * <p><b>200</b> - Token generation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param commandId ID of the command to generate the new token (required)
     * @return ResponseEntity&lt;RegenCommandToken200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RegenCommandToken200Response> regenCommandTokenWithHttpInfo(String commandId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'commandId' is set
        if (commandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commandId' when calling regenCommandToken");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("command_id", commandId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<RegenCommandToken200Response> localReturnType = new ParameterizedTypeReference<RegenCommandToken200Response>() {};
        return apiClient.invokeAPI("/commands/{command_id}/regen_token", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a command
     * Update a single command based on command id string and Command struct. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 
     * <p><b>200</b> - Command updated successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param commandId ID of the command to update (required)
     * @param command  (required)
     * @return Command
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Command updateCommand(String commandId, Command command) throws RestClientException {
        return updateCommandWithHttpInfo(commandId, command).getBody();
    }

    /**
     * Update a command
     * Update a single command based on command id string and Command struct. ##### Permissions Must have &#x60;manage_slash_commands&#x60; permission for the team the command is in. 
     * <p><b>200</b> - Command updated successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param commandId ID of the command to update (required)
     * @param command  (required)
     * @return ResponseEntity&lt;Command&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Command> updateCommandWithHttpInfo(String commandId, Command command) throws RestClientException {
        Object localVarPostBody = command;
        
        // verify the required parameter 'commandId' is set
        if (commandId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commandId' when calling updateCommand");
        }
        
        // verify the required parameter 'command' is set
        if (command == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'command' when calling updateCommand");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("command_id", commandId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Command> localReturnType = new ParameterizedTypeReference<Command>() {};
        return apiClient.invokeAPI("/commands/{command_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
