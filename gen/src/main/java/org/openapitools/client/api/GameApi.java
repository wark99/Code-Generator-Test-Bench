package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BranchGames;
import org.openapitools.client.model.Game;
import org.openapitools.client.model.GameSessions;
import org.openapitools.client.model.SessionDetails;
import java.util.UUID;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:40.667796194Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GameApi {
    private ApiClient apiClient;

    public GameApi() {
        this(new ApiClient());
    }

    public GameApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Show session for a game
     * <p><b>200</b> - show session details
     * @param sessionId ID of the session (required)
     * @return SessionDetails
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SessionDetails sessionDetails(UUID sessionId) throws RestClientException {
        return sessionDetailsWithHttpInfo(sessionId).getBody();
    }

    /**
     * 
     * Show session for a game
     * <p><b>200</b> - show session details
     * @param sessionId ID of the session (required)
     * @return ResponseEntity&lt;SessionDetails&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SessionDetails> sessionDetailsWithHttpInfo(UUID sessionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'sessionId' is set
        if (sessionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sessionId' when calling sessionDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("sessionId", sessionId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/hal+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<SessionDetails> localReturnType = new ParameterizedTypeReference<SessionDetails>() {};
        return apiClient.invokeAPI("/session/{sessionId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Returns all the games for a branch
     * Show all the games for a branch
     * <p><b>200</b> - Show all the games for a branch
     * @param branchId ID of the branch (required)
     * @return List&lt;BranchGames&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<BranchGames> showBranchGames(UUID branchId) throws RestClientException {
        return showBranchGamesWithHttpInfo(branchId).getBody();
    }

    /**
     * Returns all the games for a branch
     * Show all the games for a branch
     * <p><b>200</b> - Show all the games for a branch
     * @param branchId ID of the branch (required)
     * @return ResponseEntity&lt;List&lt;BranchGames&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<BranchGames>> showBranchGamesWithHttpInfo(UUID branchId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'branchId' is set
        if (branchId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'branchId' when calling showBranchGames");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("branchId", branchId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/hal+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<BranchGames>> localReturnType = new ParameterizedTypeReference<List<BranchGames>>() {};
        return apiClient.invokeAPI("/branch/{branchId}/games", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Show a game
     * <p><b>200</b> - show Game
     * @param gameId ID of the game (required)
     * @return Game
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Game showGameDetails(UUID gameId) throws RestClientException {
        return showGameDetailsWithHttpInfo(gameId).getBody();
    }

    /**
     * 
     * Show a game
     * <p><b>200</b> - show Game
     * @param gameId ID of the game (required)
     * @return ResponseEntity&lt;Game&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Game> showGameDetailsWithHttpInfo(UUID gameId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'gameId' is set
        if (gameId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gameId' when calling showGameDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gameId", gameId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/hal+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Game> localReturnType = new ParameterizedTypeReference<Game>() {};
        return apiClient.invokeAPI("/game/{gameId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Show session for a game
     * <p><b>200</b> - show Game sessions
     * @param gameId ID of the game (required)
     * @return GameSessions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GameSessions showGameSessions(UUID gameId) throws RestClientException {
        return showGameSessionsWithHttpInfo(gameId).getBody();
    }

    /**
     * 
     * Show session for a game
     * <p><b>200</b> - show Game sessions
     * @param gameId ID of the game (required)
     * @return ResponseEntity&lt;GameSessions&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GameSessions> showGameSessionsWithHttpInfo(UUID gameId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'gameId' is set
        if (gameId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'gameId' when calling showGameSessions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("gameId", gameId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/hal+json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GameSessions> localReturnType = new ParameterizedTypeReference<GameSessions>() {};
        return apiClient.invokeAPI("/game/{gameId}/sessions", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
