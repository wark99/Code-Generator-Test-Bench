package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateAnswer201Response;
import org.openapitools.client.model.ErrorResponseObject;
import org.openapitools.client.model.GetQuestionAnswers200Response;
import org.openapitools.client.model.NewAnswer;
import org.openapitools.client.model.UpdateAnswer;

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
public class AnswersApi {
    private ApiClient apiClient;

    public AnswersApi() {
        this(new ApiClient());
    }

    public AnswersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new answer
     * 
     * <p><b>201</b> - Answer successfully created
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param questionId  (required)
     * @param newAnswer  (required)
     * @return CreateAnswer201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateAnswer201Response createAnswer(Integer questionId, NewAnswer newAnswer) throws RestClientException {
        return createAnswerWithHttpInfo(questionId, newAnswer).getBody();
    }

    /**
     * Create a new answer
     * 
     * <p><b>201</b> - Answer successfully created
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param questionId  (required)
     * @param newAnswer  (required)
     * @return ResponseEntity&lt;CreateAnswer201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateAnswer201Response> createAnswerWithHttpInfo(Integer questionId, NewAnswer newAnswer) throws RestClientException {
        Object localVarPostBody = newAnswer;
        
        // verify the required parameter 'questionId' is set
        if (questionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'questionId' when calling createAnswer");
        }
        
        // verify the required parameter 'newAnswer' is set
        if (newAnswer == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'newAnswer' when calling createAnswer");
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

        ParameterizedTypeReference<CreateAnswer201Response> localReturnType = new ParameterizedTypeReference<CreateAnswer201Response>() {};
        return apiClient.invokeAPI("/questions/{questionId}/answers", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete an answer
     * 
     * <p><b>204</b> - Answer successfully deleted
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param answerId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteAnswer(Integer answerId) throws RestClientException {
        deleteAnswerWithHttpInfo(answerId);
    }

    /**
     * Delete an answer
     * 
     * <p><b>204</b> - Answer successfully deleted
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param answerId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteAnswerWithHttpInfo(Integer answerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'answerId' is set
        if (answerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'answerId' when calling deleteAnswer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("answerId", answerId);

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
        return apiClient.invokeAPI("/answers/{answerId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Downvote an answer
     * 
     * <p><b>200</b> - Answer successfully upvoted
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param answerId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void downvoteAnswer(Integer answerId) throws RestClientException {
        downvoteAnswerWithHttpInfo(answerId);
    }

    /**
     * Downvote an answer
     * 
     * <p><b>200</b> - Answer successfully upvoted
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param answerId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> downvoteAnswerWithHttpInfo(Integer answerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'answerId' is set
        if (answerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'answerId' when calling downvoteAnswer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("answerId", answerId);

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
        return apiClient.invokeAPI("/answers/{answerId}/downvote", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get answers for a question
     * 
     * <p><b>200</b> - Successful response
     * <p><b>404</b>
     * @param questionId  (required)
     * @return GetQuestionAnswers200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetQuestionAnswers200Response getQuestionAnswers(Integer questionId) throws RestClientException {
        return getQuestionAnswersWithHttpInfo(questionId).getBody();
    }

    /**
     * Get answers for a question
     * 
     * <p><b>200</b> - Successful response
     * <p><b>404</b>
     * @param questionId  (required)
     * @return ResponseEntity&lt;GetQuestionAnswers200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetQuestionAnswers200Response> getQuestionAnswersWithHttpInfo(Integer questionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'questionId' is set
        if (questionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'questionId' when calling getQuestionAnswers");
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

        ParameterizedTypeReference<GetQuestionAnswers200Response> localReturnType = new ParameterizedTypeReference<GetQuestionAnswers200Response>() {};
        return apiClient.invokeAPI("/questions/{questionId}/answers", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update an answer
     * 
     * <p><b>200</b> - Answer successfully updated
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param answerId  (required)
     * @param updateAnswer  (required)
     * @return CreateAnswer201Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreateAnswer201Response updateAnswer(Integer answerId, UpdateAnswer updateAnswer) throws RestClientException {
        return updateAnswerWithHttpInfo(answerId, updateAnswer).getBody();
    }

    /**
     * Update an answer
     * 
     * <p><b>200</b> - Answer successfully updated
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>404</b>
     * @param answerId  (required)
     * @param updateAnswer  (required)
     * @return ResponseEntity&lt;CreateAnswer201Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreateAnswer201Response> updateAnswerWithHttpInfo(Integer answerId, UpdateAnswer updateAnswer) throws RestClientException {
        Object localVarPostBody = updateAnswer;
        
        // verify the required parameter 'answerId' is set
        if (answerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'answerId' when calling updateAnswer");
        }
        
        // verify the required parameter 'updateAnswer' is set
        if (updateAnswer == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateAnswer' when calling updateAnswer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("answerId", answerId);

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

        ParameterizedTypeReference<CreateAnswer201Response> localReturnType = new ParameterizedTypeReference<CreateAnswer201Response>() {};
        return apiClient.invokeAPI("/answers/{answerId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Upvote an answer
     * 
     * <p><b>200</b> - Answer successfully upvoted
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param answerId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void upvoteAnswer(Integer answerId) throws RestClientException {
        upvoteAnswerWithHttpInfo(answerId);
    }

    /**
     * Upvote an answer
     * 
     * <p><b>200</b> - Answer successfully upvoted
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>404</b>
     * @param answerId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> upvoteAnswerWithHttpInfo(Integer answerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'answerId' is set
        if (answerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'answerId' when calling upvoteAnswer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("answerId", answerId);

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
        return apiClient.invokeAPI("/answers/{answerId}/upvote", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
