package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Evaluation;
import org.openapitools.client.model.Lesson;
import org.openapitools.client.model.User;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:14:37.454999481Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Добавить оценку ученика по занятию
     * 
     * <p><b>200</b> - Успешное добавление
     * @param id ID занятия (required)
     * @param evaluation Данные новой оценки (required)
     * @return Evaluation
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Evaluation lessonsIdEvaluationsPost(Long id, Evaluation evaluation) throws RestClientException {
        return lessonsIdEvaluationsPostWithHttpInfo(id, evaluation).getBody();
    }

    /**
     * Добавить оценку ученика по занятию
     * 
     * <p><b>200</b> - Успешное добавление
     * @param id ID занятия (required)
     * @param evaluation Данные новой оценки (required)
     * @return ResponseEntity&lt;Evaluation&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Evaluation> lessonsIdEvaluationsPostWithHttpInfo(Long id, Evaluation evaluation) throws RestClientException {
        Object localVarPostBody = evaluation;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling lessonsIdEvaluationsPost");
        }
        
        // verify the required parameter 'evaluation' is set
        if (evaluation == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'evaluation' when calling lessonsIdEvaluationsPost");
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

        ParameterizedTypeReference<Evaluation> localReturnType = new ParameterizedTypeReference<Evaluation>() {};
        return apiClient.invokeAPI("/lessons/{id}/evaluations", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Получить информацию о занятии по ID
     * 
     * <p><b>200</b> - Успешный запрос
     * @param id ID занятия (required)
     * @return Lesson
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Lesson lessonsIdGet(Long id) throws RestClientException {
        return lessonsIdGetWithHttpInfo(id).getBody();
    }

    /**
     * Получить информацию о занятии по ID
     * 
     * <p><b>200</b> - Успешный запрос
     * @param id ID занятия (required)
     * @return ResponseEntity&lt;Lesson&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Lesson> lessonsIdGetWithHttpInfo(Long id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling lessonsIdGet");
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
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Lesson> localReturnType = new ParameterizedTypeReference<Lesson>() {};
        return apiClient.invokeAPI("/lessons/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Добавить занятие
     * 
     * <p><b>200</b> - Успешное добавление
     * @param lesson Данные нового занятия (required)
     * @return Lesson
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Lesson lessonsPost(Lesson lesson) throws RestClientException {
        return lessonsPostWithHttpInfo(lesson).getBody();
    }

    /**
     * Добавить занятие
     * 
     * <p><b>200</b> - Успешное добавление
     * @param lesson Данные нового занятия (required)
     * @return ResponseEntity&lt;Lesson&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Lesson> lessonsPostWithHttpInfo(Lesson lesson) throws RestClientException {
        Object localVarPostBody = lesson;
        
        // verify the required parameter 'lesson' is set
        if (lesson == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'lesson' when calling lessonsPost");
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

        ParameterizedTypeReference<Lesson> localReturnType = new ParameterizedTypeReference<Lesson>() {};
        return apiClient.invokeAPI("/lessons", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Получить список учеников
     * 
     * <p><b>200</b> - Успешный запрос
     * @return List&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<User> usersGet() throws RestClientException {
        return usersGetWithHttpInfo().getBody();
    }

    /**
     * Получить список учеников
     * 
     * <p><b>200</b> - Успешный запрос
     * @return ResponseEntity&lt;List&lt;User&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<User>> usersGetWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<List<User>> localReturnType = new ParameterizedTypeReference<List<User>>() {};
        return apiClient.invokeAPI("/users", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Добавить одного ученика
     * 
     * <p><b>200</b> - Успешное добавление
     * @param user Данные нового ученика (required)
     * @return User
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public User usersPost(User user) throws RestClientException {
        return usersPostWithHttpInfo(user).getBody();
    }

    /**
     * Добавить одного ученика
     * 
     * <p><b>200</b> - Успешное добавление
     * @param user Данные нового ученика (required)
     * @return ResponseEntity&lt;User&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<User> usersPostWithHttpInfo(User user) throws RestClientException {
        Object localVarPostBody = user;
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'user' when calling usersPost");
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

        ParameterizedTypeReference<User> localReturnType = new ParameterizedTypeReference<User>() {};
        return apiClient.invokeAPI("/users", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
