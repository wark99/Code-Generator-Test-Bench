package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Comment;
import java.time.LocalDate;
import org.openapitools.client.model.Message;
import org.openapitools.client.model.Topic;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:58.322050771Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CommunicationsApi {
    private ApiClient apiClient;

    public CommunicationsApi() {
        this(new ApiClient());
    }

    public CommunicationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Добавление нового комментария
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param comment Данные нового комментария (optional)
     * @return Comment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Comment addComment(Comment comment) throws RestClientException {
        return addCommentWithHttpInfo(comment).getBody();
    }

    /**
     * Добавление нового комментария
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param comment Данные нового комментария (optional)
     * @return ResponseEntity&lt;Comment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Comment> addCommentWithHttpInfo(Comment comment) throws RestClientException {
        Object localVarPostBody = comment;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Comment> localReturnType = new ParameterizedTypeReference<Comment>() {};
        return apiClient.invokeAPI("/customers/{customerUuid}/topics/{topicId}/comments", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Добавление нового сообщения
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param message Данные нового сообщения (optional)
     * @return Message
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Message addMessage(Message message) throws RestClientException {
        return addMessageWithHttpInfo(message).getBody();
    }

    /**
     * Добавление нового сообщения
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param message Данные нового сообщения (optional)
     * @return ResponseEntity&lt;Message&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Message> addMessageWithHttpInfo(Message message) throws RestClientException {
        Object localVarPostBody = message;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Message> localReturnType = new ParameterizedTypeReference<Message>() {};
        return apiClient.invokeAPI("/customers/{customerUuid}/topics/{topicId}/messages", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Создание новой темы общения
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param topic Данные новой темы (optional)
     * @return Topic
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Topic addTopic(Topic topic) throws RestClientException {
        return addTopicWithHttpInfo(topic).getBody();
    }

    /**
     * Создание новой темы общения
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param topic Данные новой темы (optional)
     * @return ResponseEntity&lt;Topic&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Topic> addTopicWithHttpInfo(Topic topic) throws RestClientException {
        Object localVarPostBody = topic;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Topic> localReturnType = new ParameterizedTypeReference<Topic>() {};
        return apiClient.invokeAPI("/customers/{customerUuid}/topics", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Удаление комментария
     * 
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param topicId Идентификатор темы (required)
     * @param commentId Идентификатор комментария (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteComment(String customerUuid, Long topicId, Long commentId) throws RestClientException {
        deleteCommentWithHttpInfo(customerUuid, topicId, commentId);
    }

    /**
     * Удаление комментария
     * 
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param topicId Идентификатор темы (required)
     * @param commentId Идентификатор комментария (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCommentWithHttpInfo(String customerUuid, Long topicId, Long commentId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerUuid' is set
        if (customerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerUuid' when calling deleteComment");
        }
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling deleteComment");
        }
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling deleteComment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerUuid", customerUuid);
        uriVariables.put("topicId", topicId);
        uriVariables.put("commentId", commentId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/customers/{customerUuid}/topics/{topicId}/comments/{commentId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Удаление темы общения и всех сообщений по этой теме
     * 
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param topicId Идентификатор темы (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteTopic(String customerUuid, Long topicId) throws RestClientException {
        deleteTopicWithHttpInfo(customerUuid, topicId);
    }

    /**
     * Удаление темы общения и всех сообщений по этой теме
     * 
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param topicId Идентификатор темы (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteTopicWithHttpInfo(String customerUuid, Long topicId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerUuid' is set
        if (customerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerUuid' when calling deleteTopic");
        }
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling deleteTopic");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerUuid", customerUuid);
        uriVariables.put("topicId", topicId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/customers/{customerUuid}/topics/{topicId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Список тем общения с конкретным клиентом
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid  (required)
     * @param channelId Фильтр по каналу коммуникации (опциональный) (optional)
     * @param fromDate Фильтр по дате создания темы (включительно, опциональный) (optional)
     * @param toDate  (optional)
     * @param search Поиск по теме и описанию (optional)
     * @param page Номер страницы (начиная с 1) (optional)
     * @param size Число элементов на странице (optional)
     * @return List&lt;Topic&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Topic> getCustomerTopics(String customerUuid, Long channelId, LocalDate fromDate, LocalDate toDate, String search, Integer page, Integer size) throws RestClientException {
        return getCustomerTopicsWithHttpInfo(customerUuid, channelId, fromDate, toDate, search, page, size).getBody();
    }

    /**
     * Список тем общения с конкретным клиентом
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid  (required)
     * @param channelId Фильтр по каналу коммуникации (опциональный) (optional)
     * @param fromDate Фильтр по дате создания темы (включительно, опциональный) (optional)
     * @param toDate  (optional)
     * @param search Поиск по теме и описанию (optional)
     * @param page Номер страницы (начиная с 1) (optional)
     * @param size Число элементов на странице (optional)
     * @return ResponseEntity&lt;List&lt;Topic&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Topic>> getCustomerTopicsWithHttpInfo(String customerUuid, Long channelId, LocalDate fromDate, LocalDate toDate, String search, Integer page, Integer size) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerUuid' is set
        if (customerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerUuid' when calling getCustomerTopics");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerUuid", customerUuid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "channelId", channelId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "fromDate", fromDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "toDate", toDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "search", search));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<List<Topic>> localReturnType = new ParameterizedTypeReference<List<Topic>>() {};
        return apiClient.invokeAPI("/customers/{customerUuid}/topics", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Список комментариев по теме
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param topicId Идентификатор темы (required)
     * @param page Номер страницы (начиная с 1) (optional)
     * @param size Размер страницы (optional)
     * @return List&lt;Comment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Comment> getTopicComments(String customerUuid, Long topicId, Integer page, Integer size) throws RestClientException {
        return getTopicCommentsWithHttpInfo(customerUuid, topicId, page, size).getBody();
    }

    /**
     * Список комментариев по теме
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param topicId Идентификатор темы (required)
     * @param page Номер страницы (начиная с 1) (optional)
     * @param size Размер страницы (optional)
     * @return ResponseEntity&lt;List&lt;Comment&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Comment>> getTopicCommentsWithHttpInfo(String customerUuid, Long topicId, Integer page, Integer size) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerUuid' is set
        if (customerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerUuid' when calling getTopicComments");
        }
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling getTopicComments");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerUuid", customerUuid);
        uriVariables.put("topicId", topicId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<List<Comment>> localReturnType = new ParameterizedTypeReference<List<Comment>>() {};
        return apiClient.invokeAPI("/customers/{customerUuid}/topics/{topicId}/comments", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Список сообщений по теме
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param topicId Идентификатор темы (required)
     * @param page Номер страницы (начиная с 1) (optional)
     * @param size Размер страницы (optional)
     * @return List&lt;Message&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Message> getTopicMessages(String customerUuid, Long topicId, Integer page, Integer size) throws RestClientException {
        return getTopicMessagesWithHttpInfo(customerUuid, topicId, page, size).getBody();
    }

    /**
     * Список сообщений по теме
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param topicId Идентификатор темы (required)
     * @param page Номер страницы (начиная с 1) (optional)
     * @param size Размер страницы (optional)
     * @return ResponseEntity&lt;List&lt;Message&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Message>> getTopicMessagesWithHttpInfo(String customerUuid, Long topicId, Integer page, Integer size) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerUuid' is set
        if (customerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerUuid' when calling getTopicMessages");
        }
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling getTopicMessages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerUuid", customerUuid);
        uriVariables.put("topicId", topicId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<List<Message>> localReturnType = new ParameterizedTypeReference<List<Message>>() {};
        return apiClient.invokeAPI("/customers/{customerUuid}/topics/{topicId}/messages", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Обновление комментария
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param topicId Идентификатор темы (required)
     * @param commentId Идентификатор комментария (required)
     * @param comment Данные комментария (optional)
     * @return Comment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Comment updateComment(String customerUuid, Long topicId, Long commentId, Comment comment) throws RestClientException {
        return updateCommentWithHttpInfo(customerUuid, topicId, commentId, comment).getBody();
    }

    /**
     * Обновление комментария
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param topicId Идентификатор темы (required)
     * @param commentId Идентификатор комментария (required)
     * @param comment Данные комментария (optional)
     * @return ResponseEntity&lt;Comment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Comment> updateCommentWithHttpInfo(String customerUuid, Long topicId, Long commentId, Comment comment) throws RestClientException {
        Object localVarPostBody = comment;
        
        // verify the required parameter 'customerUuid' is set
        if (customerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerUuid' when calling updateComment");
        }
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling updateComment");
        }
        
        // verify the required parameter 'commentId' is set
        if (commentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'commentId' when calling updateComment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerUuid", customerUuid);
        uriVariables.put("topicId", topicId);
        uriVariables.put("commentId", commentId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Comment> localReturnType = new ParameterizedTypeReference<Comment>() {};
        return apiClient.invokeAPI("/customers/{customerUuid}/topics/{topicId}/comments/{commentId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Обновление темы общения
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param topicId Идентификатор темы (required)
     * @param topic Данные темы (optional)
     * @return Topic
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Topic updateTopic(String customerUuid, Long topicId, Topic topic) throws RestClientException {
        return updateTopicWithHttpInfo(customerUuid, topicId, topic).getBody();
    }

    /**
     * Обновление темы общения
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param topicId Идентификатор темы (required)
     * @param topic Данные темы (optional)
     * @return ResponseEntity&lt;Topic&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Topic> updateTopicWithHttpInfo(String customerUuid, Long topicId, Topic topic) throws RestClientException {
        Object localVarPostBody = topic;
        
        // verify the required parameter 'customerUuid' is set
        if (customerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerUuid' when calling updateTopic");
        }
        
        // verify the required parameter 'topicId' is set
        if (topicId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'topicId' when calling updateTopic");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerUuid", customerUuid);
        uriVariables.put("topicId", topicId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Topic> localReturnType = new ParameterizedTypeReference<Topic>() {};
        return apiClient.invokeAPI("/customers/{customerUuid}/topics/{topicId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
