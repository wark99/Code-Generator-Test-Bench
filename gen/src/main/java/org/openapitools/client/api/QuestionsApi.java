package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateQuestion201Response;
import org.openapitools.client.model.DifficultyLevelRequestDto;
import org.openapitools.client.model.ErrorResponseObject;
import org.openapitools.client.model.GetBookmarkedQuestions200Response;
import org.openapitools.client.model.NewQuestion;
import org.openapitools.client.model.RateQuestion200Response;
import org.openapitools.client.model.UpdateQuestion;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-26T20:19:29.213885611+03:00[Europe/Bucharest]", comments = "Generator version: 7.4.0")
public class QuestionsApi {
    private ApiClient apiClient;

    public QuestionsApi() {
        this(new ApiClient());
    }

    public QuestionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Bookmark a question
     * 
     * <p><b>200</b> - Question successfully bookmarked
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param questionId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void bookmarkQuestion(Integer questionId) throws RestClientException {
        bookmarkQuestionWithHttpInfo(questionId);
    }

    /**
     * Bookmark a question
     * 
     * <p><b>200</b> - Question successfully bookmarked
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param questionId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> bookmarkQuestionWithHttpInfo(Integer questionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'questionId' is set
        if (questionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'questionId' when calling bookmarkQuestion");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("questionId", questionId);

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/questions/{questionId}/bookmarks", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create a new question
     * 
     * <p><b>201</b> - Question successfully created
     * <p><b>400</b>
     * <p><b>401</b>
     * @param newQuestion  (required)
     * @return CreateQuestion201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateQuestion201Response createQuestion(NewQuestion newQuestion) throws RestClientException {
        return createQuestionWithHttpInfo(newQuestion).getBody();
    }

    /**
     * Create a new question
     * 
     * <p><b>201</b> - Question successfully created
     * <p><b>400</b>
     * <p><b>401</b>
     * @param newQuestion  (required)
     * @return ResponseEntity&lt;CreateQuestion201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateQuestion201Response> createQuestionWithHttpInfo(NewQuestion newQuestion) throws RestClientException {
        Object localVarPostBody = newQuestion;
        
        // verify the required parameter 'newQuestion' is set
        if (newQuestion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'newQuestion' when calling createQuestion");
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CreateQuestion201Response> localReturnType = new ParameterizedTypeReference<CreateQuestion201Response>() {};
        return apiClient.invokeAPI("/questions", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete a question
     * 
     * <p><b>204</b> - Question successfully deleted
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param questionId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteQuestion(Integer questionId) throws RestClientException {
        deleteQuestionWithHttpInfo(questionId);
    }

    /**
     * Delete a question
     * 
     * <p><b>204</b> - Question successfully deleted
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param questionId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteQuestionWithHttpInfo(Integer questionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'questionId' is set
        if (questionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'questionId' when calling deleteQuestion");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("questionId", questionId);

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/questions/{questionId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Downvote a question
     * 
     * <p><b>200</b> - Question successfully downvoted
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param questionId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void downvoteQuestion(Integer questionId) throws RestClientException {
        downvoteQuestionWithHttpInfo(questionId);
    }

    /**
     * Downvote a question
     * 
     * <p><b>200</b> - Question successfully downvoted
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param questionId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> downvoteQuestionWithHttpInfo(Integer questionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'questionId' is set
        if (questionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'questionId' when calling downvoteQuestion");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("questionId", questionId);

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/questions/{questionId}/downvote", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get bookmarked questions
     * 
     * <p><b>200</b> - Bookmarked questions retrieved successfully
     * <p><b>401</b>
     * @return GetBookmarkedQuestions200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetBookmarkedQuestions200Response getBookmarkedQuestions() throws RestClientException {
        return getBookmarkedQuestionsWithHttpInfo().getBody();
    }

    /**
     * Get bookmarked questions
     * 
     * <p><b>200</b> - Bookmarked questions retrieved successfully
     * <p><b>401</b>
     * @return ResponseEntity&lt;GetBookmarkedQuestions200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetBookmarkedQuestions200Response> getBookmarkedQuestionsWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetBookmarkedQuestions200Response> localReturnType = new ParameterizedTypeReference<GetBookmarkedQuestions200Response>() {};
        return apiClient.invokeAPI("/questions/bookmarked", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get question details
     * 
     * <p><b>200</b> - Successful response
     * <p><b>404</b>
     * @param questionId  (required)
     * @return CreateQuestion201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateQuestion201Response getQuestionDetails(Integer questionId) throws RestClientException {
        return getQuestionDetailsWithHttpInfo(questionId).getBody();
    }

    /**
     * Get question details
     * 
     * <p><b>200</b> - Successful response
     * <p><b>404</b>
     * @param questionId  (required)
     * @return ResponseEntity&lt;CreateQuestion201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateQuestion201Response> getQuestionDetailsWithHttpInfo(Integer questionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'questionId' is set
        if (questionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'questionId' when calling getQuestionDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("questionId", questionId);

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

        ParameterizedTypeReference<CreateQuestion201Response> localReturnType = new ParameterizedTypeReference<CreateQuestion201Response>() {};
        return apiClient.invokeAPI("/questions/{questionId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Rate a question&#39;s level of difficulty.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param id  (required)
     * @param difficultyLevelRequestDto  (required)
     * @return RateQuestion200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RateQuestion200Response rateQuestion(Long id, DifficultyLevelRequestDto difficultyLevelRequestDto) throws RestClientException {
        return rateQuestionWithHttpInfo(id, difficultyLevelRequestDto).getBody();
    }

    /**
     * Rate a question&#39;s level of difficulty.
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param id  (required)
     * @param difficultyLevelRequestDto  (required)
     * @return ResponseEntity&lt;RateQuestion200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RateQuestion200Response> rateQuestionWithHttpInfo(Long id, DifficultyLevelRequestDto difficultyLevelRequestDto) throws RestClientException {
        Object localVarPostBody = difficultyLevelRequestDto;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling rateQuestion");
        }
        
        // verify the required parameter 'difficultyLevelRequestDto' is set
        if (difficultyLevelRequestDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'difficultyLevelRequestDto' when calling rateQuestion");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<RateQuestion200Response> localReturnType = new ParameterizedTypeReference<RateQuestion200Response>() {};
        return apiClient.invokeAPI("/questions/{id}/vote-difficulty", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Remove bookmark from a question
     * 
     * <p><b>200</b> - Bookmark successfully removed
     * <p><b>401</b>
     * <p><b>404</b>
     * @param questionId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void removeQuestionBookmark(Integer questionId) throws RestClientException {
        removeQuestionBookmarkWithHttpInfo(questionId);
    }

    /**
     * Remove bookmark from a question
     * 
     * <p><b>200</b> - Bookmark successfully removed
     * <p><b>401</b>
     * <p><b>404</b>
     * @param questionId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> removeQuestionBookmarkWithHttpInfo(Integer questionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'questionId' is set
        if (questionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'questionId' when calling removeQuestionBookmark");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("questionId", questionId);

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/questions/{questionId}/bookmarks", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update a question
     * 
     * <p><b>200</b> - Question successfully updated
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param questionId  (required)
     * @param updateQuestion  (required)
     * @return CreateQuestion201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateQuestion201Response updateQuestion(Integer questionId, UpdateQuestion updateQuestion) throws RestClientException {
        return updateQuestionWithHttpInfo(questionId, updateQuestion).getBody();
    }

    /**
     * Update a question
     * 
     * <p><b>200</b> - Question successfully updated
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param questionId  (required)
     * @param updateQuestion  (required)
     * @return ResponseEntity&lt;CreateQuestion201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateQuestion201Response> updateQuestionWithHttpInfo(Integer questionId, UpdateQuestion updateQuestion) throws RestClientException {
        Object localVarPostBody = updateQuestion;
        
        // verify the required parameter 'questionId' is set
        if (questionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'questionId' when calling updateQuestion");
        }
        
        // verify the required parameter 'updateQuestion' is set
        if (updateQuestion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateQuestion' when calling updateQuestion");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("questionId", questionId);

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CreateQuestion201Response> localReturnType = new ParameterizedTypeReference<CreateQuestion201Response>() {};
        return apiClient.invokeAPI("/questions/{questionId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Upvote a question
     * 
     * <p><b>200</b> - Question successfully rated
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param questionId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void upvoteQuestion(Integer questionId) throws RestClientException {
        upvoteQuestionWithHttpInfo(questionId);
    }

    /**
     * Upvote a question
     * 
     * <p><b>200</b> - Question successfully rated
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param questionId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> upvoteQuestionWithHttpInfo(Integer questionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'questionId' is set
        if (questionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'questionId' when calling upvoteQuestion");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("questionId", questionId);

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/questions/{questionId}/upvote", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
