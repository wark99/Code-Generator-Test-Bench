package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiError;
import org.openapitools.client.model.AppError;
import org.openapitools.client.model.CreateEmojiRequest;
import org.openapitools.client.model.Emoji;
import java.io.File;
import org.openapitools.client.model.SearchEmojiRequest;

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
public class EmojiApi {
    private ApiClient apiClient;

    public EmojiApi() {
        this(new ApiClient());
    }

    public EmojiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Autocomplete custom emoji
     * Get a list of custom emoji with names starting with or matching the provided name. Returns a maximum of 100 results. ##### Permissions Must be authenticated.  
     * <p><b>200</b> - Emoji list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param name The emoji name to search. (required)
     * @return Emoji
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Emoji autocompleteEmoji(String name) throws RestClientException {
        return autocompleteEmojiWithHttpInfo(name).getBody();
    }

    /**
     * Autocomplete custom emoji
     * Get a list of custom emoji with names starting with or matching the provided name. Returns a maximum of 100 results. ##### Permissions Must be authenticated.  
     * <p><b>200</b> - Emoji list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param name The emoji name to search. (required)
     * @return ResponseEntity&lt;Emoji&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Emoji> autocompleteEmojiWithHttpInfo(String name) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling autocompleteEmoji");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Emoji> localReturnType = new ParameterizedTypeReference<Emoji>() {};
        return apiClient.invokeAPI("/emoji/autocomplete", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a custom emoji
     * Create a custom emoji for the team. ##### Permissions Must be authenticated. 
     * <p><b>201</b> - Emoji creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>413</b>
     * <p><b>501</b>
     * @param createEmojiRequest  (optional)
     * @return Emoji
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Emoji createEmoji(CreateEmojiRequest createEmojiRequest) throws RestClientException {
        return createEmojiWithHttpInfo(createEmojiRequest).getBody();
    }

    /**
     * Create a custom emoji
     * Create a custom emoji for the team. ##### Permissions Must be authenticated. 
     * <p><b>201</b> - Emoji creation successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>413</b>
     * <p><b>501</b>
     * @param createEmojiRequest  (optional)
     * @return ResponseEntity&lt;Emoji&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Emoji> createEmojiWithHttpInfo(CreateEmojiRequest createEmojiRequest) throws RestClientException {
        Object localVarPostBody = createEmojiRequest;
        

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

        ParameterizedTypeReference<Emoji> localReturnType = new ParameterizedTypeReference<Emoji>() {};
        return apiClient.invokeAPI("/emoji", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a custom emoji
     * Delete a custom emoji. ##### Permissions Must have the &#x60;manage_team&#x60; or &#x60;manage_system&#x60; permissions or be the user who created the emoji. 
     * <p><b>200</b> - Emoji delete successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param emojiId Emoji GUID (required)
     * @return Emoji
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Emoji deleteEmoji(String emojiId) throws RestClientException {
        return deleteEmojiWithHttpInfo(emojiId).getBody();
    }

    /**
     * Delete a custom emoji
     * Delete a custom emoji. ##### Permissions Must have the &#x60;manage_team&#x60; or &#x60;manage_system&#x60; permissions or be the user who created the emoji. 
     * <p><b>200</b> - Emoji delete successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param emojiId Emoji GUID (required)
     * @return ResponseEntity&lt;Emoji&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Emoji> deleteEmojiWithHttpInfo(String emojiId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'emojiId' is set
        if (emojiId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emojiId' when calling deleteEmoji");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("emoji_id", emojiId);

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

        ParameterizedTypeReference<Emoji> localReturnType = new ParameterizedTypeReference<Emoji>() {};
        return apiClient.invokeAPI("/emoji/{emoji_id}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a custom emoji
     * Get some metadata for a custom emoji. ##### Permissions Must be authenticated. 
     * <p><b>200</b> - Emoji retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * <p><b>501</b>
     * @param emojiId Emoji GUID (required)
     * @return Emoji
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Emoji getEmoji(String emojiId) throws RestClientException {
        return getEmojiWithHttpInfo(emojiId).getBody();
    }

    /**
     * Get a custom emoji
     * Get some metadata for a custom emoji. ##### Permissions Must be authenticated. 
     * <p><b>200</b> - Emoji retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * <p><b>501</b>
     * @param emojiId Emoji GUID (required)
     * @return ResponseEntity&lt;Emoji&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Emoji> getEmojiWithHttpInfo(String emojiId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'emojiId' is set
        if (emojiId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emojiId' when calling getEmoji");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("emoji_id", emojiId);

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

        ParameterizedTypeReference<Emoji> localReturnType = new ParameterizedTypeReference<Emoji>() {};
        return apiClient.invokeAPI("/emoji/{emoji_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a custom emoji by name
     * Get some metadata for a custom emoji using its name. ##### Permissions Must be authenticated.  
     * <p><b>200</b> - Emoji retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * <p><b>501</b>
     * @param emojiName Emoji name (required)
     * @return Emoji
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Emoji getEmojiByName(String emojiName) throws RestClientException {
        return getEmojiByNameWithHttpInfo(emojiName).getBody();
    }

    /**
     * Get a custom emoji by name
     * Get some metadata for a custom emoji using its name. ##### Permissions Must be authenticated.  
     * <p><b>200</b> - Emoji retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * <p><b>501</b>
     * @param emojiName Emoji name (required)
     * @return ResponseEntity&lt;Emoji&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Emoji> getEmojiByNameWithHttpInfo(String emojiName) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'emojiName' is set
        if (emojiName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emojiName' when calling getEmojiByName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
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

        ParameterizedTypeReference<Emoji> localReturnType = new ParameterizedTypeReference<Emoji>() {};
        return apiClient.invokeAPI("/emoji/name/{emoji_name}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get custom emoji image
     * Get the image for a custom emoji. ##### Permissions Must be authenticated. 
     * <p><b>200</b> - Emoji image retrieval successful
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>500</b>
     * <p><b>501</b>
     * @param emojiId Emoji GUID (required)
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File getEmojiImage(String emojiId) throws RestClientException {
        return getEmojiImageWithHttpInfo(emojiId).getBody();
    }

    /**
     * Get custom emoji image
     * Get the image for a custom emoji. ##### Permissions Must be authenticated. 
     * <p><b>200</b> - Emoji image retrieval successful
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * <p><b>500</b>
     * <p><b>501</b>
     * @param emojiId Emoji GUID (required)
     * @return ResponseEntity&lt;File&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<File> getEmojiImageWithHttpInfo(String emojiId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'emojiId' is set
        if (emojiId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emojiId' when calling getEmojiImage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("emoji_id", emojiId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "image/png", "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<File> localReturnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI("/emoji/{emoji_id}/image", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a list of custom emoji
     * Get a page of metadata for custom emoji on the system.##### Permissions Must be authenticated. 
     * <p><b>200</b> - Emoji list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of emojis per page. (optional, default to 60)
     * @param sort Either blank for no sorting or \&quot;name\&quot; to sort by emoji names. (optional, default to )
     * @return Emoji
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Emoji getEmojiList(Integer page, Integer perPage, String sort) throws RestClientException {
        return getEmojiListWithHttpInfo(page, perPage, sort).getBody();
    }

    /**
     * Get a list of custom emoji
     * Get a page of metadata for custom emoji on the system.##### Permissions Must be authenticated. 
     * <p><b>200</b> - Emoji list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param page The page to select. (optional, default to 0)
     * @param perPage The number of emojis per page. (optional, default to 60)
     * @param sort Either blank for no sorting or \&quot;name\&quot; to sort by emoji names. (optional, default to )
     * @return ResponseEntity&lt;Emoji&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Emoji> getEmojiListWithHttpInfo(Integer page, Integer perPage, String sort) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Emoji> localReturnType = new ParameterizedTypeReference<Emoji>() {};
        return apiClient.invokeAPI("/emoji", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Search custom emoji
     * Search for custom emoji by name based on search criteria provided in the request body. A maximum of 200 results are returned. ##### Permissions Must be authenticated.  
     * <p><b>200</b> - Emoji list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param searchEmojiRequest Search criteria (required)
     * @return List&lt;Emoji&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Emoji> searchEmoji(SearchEmojiRequest searchEmojiRequest) throws RestClientException {
        return searchEmojiWithHttpInfo(searchEmojiRequest).getBody();
    }

    /**
     * Search custom emoji
     * Search for custom emoji by name based on search criteria provided in the request body. A maximum of 200 results are returned. ##### Permissions Must be authenticated.  
     * <p><b>200</b> - Emoji list retrieval successful
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>501</b>
     * @param searchEmojiRequest Search criteria (required)
     * @return ResponseEntity&lt;List&lt;Emoji&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Emoji>> searchEmojiWithHttpInfo(SearchEmojiRequest searchEmojiRequest) throws RestClientException {
        Object localVarPostBody = searchEmojiRequest;
        
        // verify the required parameter 'searchEmojiRequest' is set
        if (searchEmojiRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'searchEmojiRequest' when calling searchEmoji");
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

        ParameterizedTypeReference<List<Emoji>> localReturnType = new ParameterizedTypeReference<List<Emoji>>() {};
        return apiClient.invokeAPI("/emoji/search", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
