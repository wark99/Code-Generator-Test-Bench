package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.NewRecipe;
import org.openapitools.client.model.RecipesGet200Response;
import org.openapitools.client.model.RecipesPost201Response;
import org.openapitools.client.model.RecipesRecipeIdGet200Response;
import org.openapitools.client.model.RecipesRecipeIdRatingPostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:19:30.095527364Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * Get recipes for dish, cuisine
     * 
     * <p><b>200</b> - OK
     * @param sort  (optional)
     * @param dishId  (optional)
     * @param cuisineId  (optional)
     * @return RecipesGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RecipesGet200Response recipesGet(String sort, Integer dishId, Integer cuisineId) throws RestClientException {
        return recipesGetWithHttpInfo(sort, dishId, cuisineId).getBody();
    }

    /**
     * Get recipes for dish, cuisine
     * 
     * <p><b>200</b> - OK
     * @param sort  (optional)
     * @param dishId  (optional)
     * @param cuisineId  (optional)
     * @return ResponseEntity&lt;RecipesGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RecipesGet200Response> recipesGetWithHttpInfo(String sort, Integer dishId, Integer cuisineId) throws RestClientException {
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

        ParameterizedTypeReference<RecipesGet200Response> localReturnType = new ParameterizedTypeReference<RecipesGet200Response>() {};
        return apiClient.invokeAPI("/recipes", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a new recipe
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b>
     * @param newRecipe  (required)
     * @return RecipesPost201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RecipesPost201Response recipesPost(NewRecipe newRecipe) throws RestClientException {
        return recipesPostWithHttpInfo(newRecipe).getBody();
    }

    /**
     * Create a new recipe
     * 
     * <p><b>201</b> - Created
     * <p><b>400</b>
     * @param newRecipe  (required)
     * @return ResponseEntity&lt;RecipesPost201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RecipesPost201Response> recipesPostWithHttpInfo(NewRecipe newRecipe) throws RestClientException {
        Object localVarPostBody = newRecipe;
        
        // verify the required parameter 'newRecipe' is set
        if (newRecipe == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'newRecipe' when calling recipesPost");
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

        ParameterizedTypeReference<RecipesPost201Response> localReturnType = new ParameterizedTypeReference<RecipesPost201Response>() {};
        return apiClient.invokeAPI("/recipes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Bookmark a recipe
     * 
     * <p><b>200</b>
     * <p><b>400</b>
     * @param recipeId  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object recipesRecipeIdBookmarkPost(Integer recipeId) throws RestClientException {
        return recipesRecipeIdBookmarkPostWithHttpInfo(recipeId).getBody();
    }

    /**
     * Bookmark a recipe
     * 
     * <p><b>200</b>
     * <p><b>400</b>
     * @param recipeId  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> recipesRecipeIdBookmarkPostWithHttpInfo(Integer recipeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'recipeId' is set
        if (recipeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipeId' when calling recipesRecipeIdBookmarkPost");
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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/recipes/{recipeId}/bookmark", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a recipe
     * 
     * <p><b>204</b> - No content
     * <p><b>403</b>
     * <p><b>404</b>
     * @param recipeId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void recipesRecipeIdDelete(Integer recipeId) throws RestClientException {
        recipesRecipeIdDeleteWithHttpInfo(recipeId);
    }

    /**
     * Delete a recipe
     * 
     * <p><b>204</b> - No content
     * <p><b>403</b>
     * <p><b>404</b>
     * @param recipeId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> recipesRecipeIdDeleteWithHttpInfo(Integer recipeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'recipeId' is set
        if (recipeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipeId' when calling recipesRecipeIdDelete");
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

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/recipes/{recipeId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get recipe details
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param recipeId  (required)
     * @return RecipesRecipeIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RecipesRecipeIdGet200Response recipesRecipeIdGet(Integer recipeId) throws RestClientException {
        return recipesRecipeIdGetWithHttpInfo(recipeId).getBody();
    }

    /**
     * Get recipe details
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param recipeId  (required)
     * @return ResponseEntity&lt;RecipesRecipeIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RecipesRecipeIdGet200Response> recipesRecipeIdGetWithHttpInfo(Integer recipeId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'recipeId' is set
        if (recipeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipeId' when calling recipesRecipeIdGet");
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

        ParameterizedTypeReference<RecipesRecipeIdGet200Response> localReturnType = new ParameterizedTypeReference<RecipesRecipeIdGet200Response>() {};
        return apiClient.invokeAPI("/recipes/{recipeId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Rate a recipe
     * 
     * <p><b>200</b>
     * <p><b>400</b>
     * @param recipeId  (required)
     * @param recipesRecipeIdRatingPostRequest  (required)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object recipesRecipeIdRatingPost(Integer recipeId, RecipesRecipeIdRatingPostRequest recipesRecipeIdRatingPostRequest) throws RestClientException {
        return recipesRecipeIdRatingPostWithHttpInfo(recipeId, recipesRecipeIdRatingPostRequest).getBody();
    }

    /**
     * Rate a recipe
     * 
     * <p><b>200</b>
     * <p><b>400</b>
     * @param recipeId  (required)
     * @param recipesRecipeIdRatingPostRequest  (required)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> recipesRecipeIdRatingPostWithHttpInfo(Integer recipeId, RecipesRecipeIdRatingPostRequest recipesRecipeIdRatingPostRequest) throws RestClientException {
        Object localVarPostBody = recipesRecipeIdRatingPostRequest;
        
        // verify the required parameter 'recipeId' is set
        if (recipeId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipeId' when calling recipesRecipeIdRatingPost");
        }
        
        // verify the required parameter 'recipesRecipeIdRatingPostRequest' is set
        if (recipesRecipeIdRatingPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipesRecipeIdRatingPostRequest' when calling recipesRecipeIdRatingPost");
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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/recipes/{recipeId}/rating", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
