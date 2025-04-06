package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AddCommentToRecipe201Response;
import org.openapitools.client.model.AddCommentToRecipeRequest;
import org.openapitools.client.model.CreateRecipe201Response;
import org.openapitools.client.model.ErrorResponseObject;
import org.openapitools.client.model.GetCommentsForRecipe200Response;
import org.openapitools.client.model.GetRecipesForEntity200Response;
import org.openapitools.client.model.GetUserFollowing200Response;
import org.openapitools.client.model.NewRecipe;
import org.openapitools.client.model.RateRecipeRequest;
import org.openapitools.client.model.SuccessResponseObject;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T12:57:24.039139870Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RecipeApi {
    private ApiClient apiClient;

    public RecipeApi() {
        this(new ApiClient());
    }

    public RecipeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a comment to a recipe
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b>
     * @param recipeId  (required)
     * @param addCommentToRecipeRequest  (required)
     * @return AddCommentToRecipe201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AddCommentToRecipe201Response addCommentToRecipe(Integer recipeId, AddCommentToRecipeRequest addCommentToRecipeRequest) throws RestClientException {
        return addCommentToRecipeWithHttpInfo(recipeId, addCommentToRecipeRequest).getBody();
    }

    /**
     * Add a comment to a recipe
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b>
     * @param recipeId  (required)
     * @param addCommentToRecipeRequest  (required)
     * @return ResponseEntity&lt;AddCommentToRecipe201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AddCommentToRecipe201Response> addCommentToRecipeWithHttpInfo(Integer recipeId, AddCommentToRecipeRequest addCommentToRecipeRequest) throws RestClientException {
        Object localVarPostBody = addCommentToRecipeRequest;
        
        // verify the required parameter 'recipeId' is set
        if (recipeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipeId' when calling addCommentToRecipe");
        }
        
        // verify the required parameter 'addCommentToRecipeRequest' is set
        if (addCommentToRecipeRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addCommentToRecipeRequest' when calling addCommentToRecipe");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("recipeId", recipeId);

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

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<AddCommentToRecipe201Response> localReturnType = new ParameterizedTypeReference<AddCommentToRecipe201Response>() {};
        return apiClient.invokeAPI("/recipes/{recipeId}/comments", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Bookmark a recipe
     * 
     * <p><b>200</b>
     * <p><b>400</b>
     * @param recipeId  (required)
     * @return SuccessResponseObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SuccessResponseObject bookmarkRecipe(Integer recipeId) throws RestClientException {
        return bookmarkRecipeWithHttpInfo(recipeId).getBody();
    }

    /**
     * Bookmark a recipe
     * 
     * <p><b>200</b>
     * <p><b>400</b>
     * @param recipeId  (required)
     * @return ResponseEntity&lt;SuccessResponseObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SuccessResponseObject> bookmarkRecipeWithHttpInfo(Integer recipeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'recipeId' is set
        if (recipeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipeId' when calling bookmarkRecipe");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("recipeId", recipeId);

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

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<SuccessResponseObject> localReturnType = new ParameterizedTypeReference<SuccessResponseObject>() {};
        return apiClient.invokeAPI("/recipes/{recipeId}/bookmarks", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a new recipe
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b>
     * @param newRecipe  (required)
     * @return CreateRecipe201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateRecipe201Response createRecipe(NewRecipe newRecipe) throws RestClientException {
        return createRecipeWithHttpInfo(newRecipe).getBody();
    }

    /**
     * Create a new recipe
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b>
     * @param newRecipe  (required)
     * @return ResponseEntity&lt;CreateRecipe201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateRecipe201Response> createRecipeWithHttpInfo(NewRecipe newRecipe) throws RestClientException {
        Object localVarPostBody = newRecipe;
        
        // verify the required parameter 'newRecipe' is set
        if (newRecipe == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'newRecipe' when calling createRecipe");
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

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<CreateRecipe201Response> localReturnType = new ParameterizedTypeReference<CreateRecipe201Response>() {};
        return apiClient.invokeAPI("/recipes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a recipe
     * 
     * <p><b>204</b> - OK
     * <p><b>403</b>
     * <p><b>404</b>
     * @param recipeId  (required)
     * @return SuccessResponseObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SuccessResponseObject deleteRecipeById(Integer recipeId) throws RestClientException {
        return deleteRecipeByIdWithHttpInfo(recipeId).getBody();
    }

    /**
     * Delete a recipe
     * 
     * <p><b>204</b> - OK
     * <p><b>403</b>
     * <p><b>404</b>
     * @param recipeId  (required)
     * @return ResponseEntity&lt;SuccessResponseObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SuccessResponseObject> deleteRecipeByIdWithHttpInfo(Integer recipeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'recipeId' is set
        if (recipeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipeId' when calling deleteRecipeById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("recipeId", recipeId);

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

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<SuccessResponseObject> localReturnType = new ParameterizedTypeReference<SuccessResponseObject>() {};
        return apiClient.invokeAPI("/recipes/{recipeId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get users who bookmarked a recipe
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param recipeId  (required)
     * @return GetUserFollowing200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetUserFollowing200Response getBookmarkers(Integer recipeId) throws RestClientException {
        return getBookmarkersWithHttpInfo(recipeId).getBody();
    }

    /**
     * Get users who bookmarked a recipe
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param recipeId  (required)
     * @return ResponseEntity&lt;GetUserFollowing200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetUserFollowing200Response> getBookmarkersWithHttpInfo(Integer recipeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'recipeId' is set
        if (recipeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipeId' when calling getBookmarkers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("recipeId", recipeId);

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

        ParameterizedTypeReference<GetUserFollowing200Response> localReturnType = new ParameterizedTypeReference<GetUserFollowing200Response>() {};
        return apiClient.invokeAPI("/recipes/{recipeId}/bookmarks", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get comments for a recipe
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param recipeId  (required)
     * @return GetCommentsForRecipe200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommentsForRecipe200Response getCommentsForRecipe(Integer recipeId) throws RestClientException {
        return getCommentsForRecipeWithHttpInfo(recipeId).getBody();
    }

    /**
     * Get comments for a recipe
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param recipeId  (required)
     * @return ResponseEntity&lt;GetCommentsForRecipe200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommentsForRecipe200Response> getCommentsForRecipeWithHttpInfo(Integer recipeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'recipeId' is set
        if (recipeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipeId' when calling getCommentsForRecipe");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("recipeId", recipeId);

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

        ParameterizedTypeReference<GetCommentsForRecipe200Response> localReturnType = new ParameterizedTypeReference<GetCommentsForRecipe200Response>() {};
        return apiClient.invokeAPI("/recipes/{recipeId}/comments", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get recipe details
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param recipeId  (required)
     * @return CreateRecipe201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateRecipe201Response getRecipeById(Integer recipeId) throws RestClientException {
        return getRecipeByIdWithHttpInfo(recipeId).getBody();
    }

    /**
     * Get recipe details
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param recipeId  (required)
     * @return ResponseEntity&lt;CreateRecipe201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateRecipe201Response> getRecipeByIdWithHttpInfo(Integer recipeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'recipeId' is set
        if (recipeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipeId' when calling getRecipeById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("recipeId", recipeId);

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

        ParameterizedTypeReference<CreateRecipe201Response> localReturnType = new ParameterizedTypeReference<CreateRecipe201Response>() {};
        return apiClient.invokeAPI("/recipes/{recipeId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get recipes for dish, cuisine
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param sort  (optional)
     * @param dishId  (optional)
     * @param cuisineId  (optional)
     * @return GetRecipesForEntity200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetRecipesForEntity200Response getRecipesForEntity(String sort, String dishId, String cuisineId) throws RestClientException {
        return getRecipesForEntityWithHttpInfo(sort, dishId, cuisineId).getBody();
    }

    /**
     * Get recipes for dish, cuisine
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * @param sort  (optional)
     * @param dishId  (optional)
     * @param cuisineId  (optional)
     * @return ResponseEntity&lt;GetRecipesForEntity200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetRecipesForEntity200Response> getRecipesForEntityWithHttpInfo(String sort, String dishId, String cuisineId) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "sort", sort));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "dishId", dishId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "cuisineId", cuisineId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetRecipesForEntity200Response> localReturnType = new ParameterizedTypeReference<GetRecipesForEntity200Response>() {};
        return apiClient.invokeAPI("/recipes", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Rate a recipe
     * 
     * <p><b>200</b>
     * <p><b>400</b>
     * @param recipeId  (required)
     * @param rateRecipeRequest  (required)
     * @return SuccessResponseObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SuccessResponseObject rateRecipe(Integer recipeId, RateRecipeRequest rateRecipeRequest) throws RestClientException {
        return rateRecipeWithHttpInfo(recipeId, rateRecipeRequest).getBody();
    }

    /**
     * Rate a recipe
     * 
     * <p><b>200</b>
     * <p><b>400</b>
     * @param recipeId  (required)
     * @param rateRecipeRequest  (required)
     * @return ResponseEntity&lt;SuccessResponseObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SuccessResponseObject> rateRecipeWithHttpInfo(Integer recipeId, RateRecipeRequest rateRecipeRequest) throws RestClientException {
        Object localVarPostBody = rateRecipeRequest;
        
        // verify the required parameter 'recipeId' is set
        if (recipeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipeId' when calling rateRecipe");
        }
        
        // verify the required parameter 'rateRecipeRequest' is set
        if (rateRecipeRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'rateRecipeRequest' when calling rateRecipe");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("recipeId", recipeId);

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

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<SuccessResponseObject> localReturnType = new ParameterizedTypeReference<SuccessResponseObject>() {};
        return apiClient.invokeAPI("/recipes/{recipeId}/rating", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Remove upvote from a comment
     * 
     * <p><b>200</b> - OK - returns new comment after upvote removal
     * <p><b>400</b>
     * @param recipeId  (required)
     * @param commentId  (required)
     * @return AddCommentToRecipe201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AddCommentToRecipe201Response removeUpvoteFromComment(Integer recipeId, Integer commentId) throws RestClientException {
        return removeUpvoteFromCommentWithHttpInfo(recipeId, commentId).getBody();
    }

    /**
     * Remove upvote from a comment
     * 
     * <p><b>200</b> - OK - returns new comment after upvote removal
     * <p><b>400</b>
     * @param recipeId  (required)
     * @param commentId  (required)
     * @return ResponseEntity&lt;AddCommentToRecipe201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AddCommentToRecipe201Response> removeUpvoteFromCommentWithHttpInfo(Integer recipeId, Integer commentId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'recipeId' is set
        if (recipeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipeId' when calling removeUpvoteFromComment");
        }
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling removeUpvoteFromComment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("recipeId", recipeId);
        uriVariables.put("commentId", commentId);

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

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<AddCommentToRecipe201Response> localReturnType = new ParameterizedTypeReference<AddCommentToRecipe201Response>() {};
        return apiClient.invokeAPI("/recipes/{recipeId}/comments/{commentId}/upvote", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Unbookmark a recipe
     * 
     * <p><b>204</b> - OK
     * <p><b>400</b>
     * @param recipeId  (required)
     * @return SuccessResponseObject
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SuccessResponseObject unbookmarkRecipe(Integer recipeId) throws RestClientException {
        return unbookmarkRecipeWithHttpInfo(recipeId).getBody();
    }

    /**
     * Unbookmark a recipe
     * 
     * <p><b>204</b> - OK
     * <p><b>400</b>
     * @param recipeId  (required)
     * @return ResponseEntity&lt;SuccessResponseObject&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SuccessResponseObject> unbookmarkRecipeWithHttpInfo(Integer recipeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'recipeId' is set
        if (recipeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipeId' when calling unbookmarkRecipe");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("recipeId", recipeId);

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

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<SuccessResponseObject> localReturnType = new ParameterizedTypeReference<SuccessResponseObject>() {};
        return apiClient.invokeAPI("/recipes/{recipeId}/bookmarks", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Upvote a comment
     * 
     * <p><b>200</b> - OK - returns new comment after upvote
     * <p><b>400</b>
     * @param recipeId  (required)
     * @param commentId  (required)
     * @return AddCommentToRecipe201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AddCommentToRecipe201Response upvoteComment(Integer recipeId, Integer commentId) throws RestClientException {
        return upvoteCommentWithHttpInfo(recipeId, commentId).getBody();
    }

    /**
     * Upvote a comment
     * 
     * <p><b>200</b> - OK - returns new comment after upvote
     * <p><b>400</b>
     * @param recipeId  (required)
     * @param commentId  (required)
     * @return ResponseEntity&lt;AddCommentToRecipe201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AddCommentToRecipe201Response> upvoteCommentWithHttpInfo(Integer recipeId, Integer commentId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'recipeId' is set
        if (recipeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipeId' when calling upvoteComment");
        }
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling upvoteComment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("recipeId", recipeId);
        uriVariables.put("commentId", commentId);

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

        String[] localVarAuthNames = new String[] { "auth_jwt" };

        ParameterizedTypeReference<AddCommentToRecipe201Response> localReturnType = new ParameterizedTypeReference<AddCommentToRecipe201Response>() {};
        return apiClient.invokeAPI("/recipes/{recipeId}/comments/{commentId}/upvote", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
