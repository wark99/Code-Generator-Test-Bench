package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.AppError;
import org.openapitools.client.model.Reaction;
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
public class ReactionsApi {
    private ApiClient apiClient;

    public ReactionsApi() {
        this(new ApiClient());
    }

    public ReactionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Remove a reaction from a post
     * Deletes a reaction made by a user from the given post. ##### Permissions Must be user or have &#x60;manage_system&#x60; permission. 
     * <p><b>200</b> - Reaction deletion successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId ID of the user (required)
     * @param postId ID of the post (required)
     * @param emojiName emoji name (required)
     * @return StatusOK
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StatusOK deleteReaction(String userId, String postId, String emojiName) throws RestClientException {
        return deleteReactionWithHttpInfo(userId, postId, emojiName).getBody();
    }

    /**
     * Remove a reaction from a post
     * Deletes a reaction made by a user from the given post. ##### Permissions Must be user or have &#x60;manage_system&#x60; permission. 
     * <p><b>200</b> - Reaction deletion successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param userId ID of the user (required)
     * @param postId ID of the post (required)
     * @param emojiName emoji name (required)
     * @return ResponseEntity&lt;StatusOK&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StatusOK> deleteReactionWithHttpInfo(String userId, String postId, String emojiName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userId' when calling deleteReaction");
        }
        
        // verify the required parameter 'postId' is set
        if (postId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postId' when calling deleteReaction");
        }
        
        // verify the required parameter 'emojiName' is set
        if (emojiName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emojiName' when calling deleteReaction");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("user_id", userId);
        uriVariables.put("post_id", postId);
        uriVariables.put("emoji_name", emojiName);

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
        return apiClient.invokeAPI("/users/{user_id}/posts/{post_id}/reactions/{emoji_name}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of reactions to a post
     * Get a list of reactions made by all users to a given post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in. 
     * <p><b>200</b> - List reactions retrieve successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId ID of a post (required)
     * @return List&lt;Reaction&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Reaction> getReactions(String postId) throws RestClientException {
        return getReactionsWithHttpInfo(postId).getBody();
    }

    /**
     * Get a list of reactions to a post
     * Get a list of reactions made by all users to a given post. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in. 
     * <p><b>200</b> - List reactions retrieve successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * @param postId ID of a post (required)
     * @return ResponseEntity&lt;List&lt;Reaction&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Reaction>> getReactionsWithHttpInfo(String postId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'postId' is set
        if (postId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'postId' when calling getReactions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("post_id", postId);

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

        ParameterizedTypeReference<List<Reaction>> localReturnType = new ParameterizedTypeReference<List<Reaction>>() {};
        return apiClient.invokeAPI("/posts/{post_id}/reactions", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a reaction
     * Create a reaction. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in. 
     * <p><b>201</b> - Reaction creation successful
     * <p><b>400</b>
     * <p><b>403</b>
     * @param reaction The user&#39;s reaction with its post_id, user_id, and emoji_name fields set (required)
     * @return Reaction
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Reaction saveReaction(Reaction reaction) throws RestClientException {
        return saveReactionWithHttpInfo(reaction).getBody();
    }

    /**
     * Create a reaction
     * Create a reaction. ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the post is in. 
     * <p><b>201</b> - Reaction creation successful
     * <p><b>400</b>
     * <p><b>403</b>
     * @param reaction The user&#39;s reaction with its post_id, user_id, and emoji_name fields set (required)
     * @return ResponseEntity&lt;Reaction&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Reaction> saveReactionWithHttpInfo(Reaction reaction) throws RestClientException {
        Object localVarPostBody = reaction;
        
        // verify the required parameter 'reaction' is set
        if (reaction == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reaction' when calling saveReaction");
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

        ParameterizedTypeReference<Reaction> localReturnType = new ParameterizedTypeReference<Reaction>() {};
        return apiClient.invokeAPI("/reactions", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
