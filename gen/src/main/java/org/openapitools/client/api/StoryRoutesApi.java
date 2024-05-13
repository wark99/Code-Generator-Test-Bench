package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CreateStoryRequest;
import org.openapitools.client.model.StoryGetTagStoryUserUseridPostRequest;
import org.openapitools.client.model.UNKNOWN_BASE_TYPE;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:50.441407861Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class StoryRoutesApi {
    private ApiClient apiClient;

    public StoryRoutesApi() {
        this(new ApiClient());
    }

    public StoryRoutesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * add-reaction
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param storyid  (required)
     * @param reaction  (required)
     * @param authorization  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void storyAddReactionUserUseridStoryStoryidReactionReactionGet(String userid, String storyid, String reaction, String authorization) throws RestClientException {
        storyAddReactionUserUseridStoryStoryidReactionReactionGetWithHttpInfo(userid, storyid, reaction, authorization);
    }

    /**
     * add-reaction
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param storyid  (required)
     * @param reaction  (required)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> storyAddReactionUserUseridStoryStoryidReactionReactionGetWithHttpInfo(String userid, String storyid, String reaction, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling storyAddReactionUserUseridStoryStoryidReactionReactionGet");
        }
        
        // verify the required parameter 'storyid' is set
        if (storyid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storyid' when calling storyAddReactionUserUseridStoryStoryidReactionReactionGet");
        }
        
        // verify the required parameter 'reaction' is set
        if (reaction == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'reaction' when calling storyAddReactionUserUseridStoryStoryidReactionReactionGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);
        uriVariables.put("storyid", storyid);
        uriVariables.put("reaction", reaction);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/story/add-reaction/user/{userid}/story/{storyid}/reaction/{reaction}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * add-view
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param storyid  (required)
     * @param authorization  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void storyAddViewUserUseridStoryStoryidGet(String userid, String storyid, String authorization) throws RestClientException {
        storyAddViewUserUseridStoryStoryidGetWithHttpInfo(userid, storyid, authorization);
    }

    /**
     * add-view
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param storyid  (required)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> storyAddViewUserUseridStoryStoryidGetWithHttpInfo(String userid, String storyid, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling storyAddViewUserUseridStoryStoryidGet");
        }
        
        // verify the required parameter 'storyid' is set
        if (storyid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storyid' when calling storyAddViewUserUseridStoryStoryidGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);
        uriVariables.put("storyid", storyid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/story/add-view/user/{userid}/story/{storyid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * create-story
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param UNKNOWN_BASE_TYPE  (required)
     * @param authorization  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void storyCreateStoryUserUseridPost(String userid, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE, String authorization) throws RestClientException {
        storyCreateStoryUserUseridPostWithHttpInfo(userid, UNKNOWN_BASE_TYPE, authorization);
    }

    /**
     * create-story
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param UNKNOWN_BASE_TYPE  (required)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> storyCreateStoryUserUseridPostWithHttpInfo(String userid, UNKNOWN_BASE_TYPE UNKNOWN_BASE_TYPE, String authorization) throws RestClientException {
        Object localVarPostBody = UNKNOWN_BASE_TYPE;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling storyCreateStoryUserUseridPost");
        }
        
        // verify the required parameter 'UNKNOWN_BASE_TYPE' is set
        if (UNKNOWN_BASE_TYPE == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'UNKNOWN_BASE_TYPE' when calling storyCreateStoryUserUseridPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/story/create-story/user/{userid}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * delete-reaction
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param storyid  (required)
     * @param authorization  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void storyDeleteReactionUserUseridStoryStoryidDelete(String userid, String storyid, String authorization) throws RestClientException {
        storyDeleteReactionUserUseridStoryStoryidDeleteWithHttpInfo(userid, storyid, authorization);
    }

    /**
     * delete-reaction
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param storyid  (required)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> storyDeleteReactionUserUseridStoryStoryidDeleteWithHttpInfo(String userid, String storyid, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling storyDeleteReactionUserUseridStoryStoryidDelete");
        }
        
        // verify the required parameter 'storyid' is set
        if (storyid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storyid' when calling storyDeleteReactionUserUseridStoryStoryidDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);
        uriVariables.put("storyid", storyid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/story/delete-reaction/user/{userid}/story/{storyid}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * delete-story
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param storyid  (required)
     * @param authorization  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void storyDeleteStoryUserUseridStoryStoryidDelete(String userid, String storyid, String authorization) throws RestClientException {
        storyDeleteStoryUserUseridStoryStoryidDeleteWithHttpInfo(userid, storyid, authorization);
    }

    /**
     * delete-story
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param storyid  (required)
     * @param authorization  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> storyDeleteStoryUserUseridStoryStoryidDeleteWithHttpInfo(String userid, String storyid, String authorization) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling storyDeleteStoryUserUseridStoryStoryidDelete");
        }
        
        // verify the required parameter 'storyid' is set
        if (storyid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storyid' when calling storyDeleteStoryUserUseridStoryStoryidDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);
        uriVariables.put("storyid", storyid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/story/delete-story/user/{userid}/story/{storyid}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * get-all-college-stories
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void storyGetAllCollegeStoryUserUseridGet(String userid, String authorization, Integer page, Integer limit) throws RestClientException {
        storyGetAllCollegeStoryUserUseridGetWithHttpInfo(userid, authorization, page, limit);
    }

    /**
     * get-all-college-stories
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> storyGetAllCollegeStoryUserUseridGetWithHttpInfo(String userid, String authorization, Integer page, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling storyGetAllCollegeStoryUserUseridGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/story/get-all-college-story/user/{userid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * get-college-stories
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param collegeid  (required)
     * @param authorization  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void storyGetCollegeStoryUserUseridCollegeCollegeidGet(String userid, String collegeid, String authorization, Integer page, Integer limit) throws RestClientException {
        storyGetCollegeStoryUserUseridCollegeCollegeidGetWithHttpInfo(userid, collegeid, authorization, page, limit);
    }

    /**
     * get-college-stories
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param collegeid  (required)
     * @param authorization  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> storyGetCollegeStoryUserUseridCollegeCollegeidGetWithHttpInfo(String userid, String collegeid, String authorization, Integer page, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling storyGetCollegeStoryUserUseridCollegeCollegeidGet");
        }
        
        // verify the required parameter 'collegeid' is set
        if (collegeid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collegeid' when calling storyGetCollegeStoryUserUseridCollegeCollegeidGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);
        uriVariables.put("collegeid", collegeid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/story/get-college-story/user/{userid}/college/{collegeid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * get-tag-stories
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param storyGetTagStoryUserUseridPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void storyGetTagStoryUserUseridPost(String userid, String authorization, Integer page, Integer limit, StoryGetTagStoryUserUseridPostRequest storyGetTagStoryUserUseridPostRequest) throws RestClientException {
        storyGetTagStoryUserUseridPostWithHttpInfo(userid, authorization, page, limit, storyGetTagStoryUserUseridPostRequest);
    }

    /**
     * get-tag-stories
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @param storyGetTagStoryUserUseridPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> storyGetTagStoryUserUseridPostWithHttpInfo(String userid, String authorization, Integer page, Integer limit, StoryGetTagStoryUserUseridPostRequest storyGetTagStoryUserUseridPostRequest) throws RestClientException {
        Object localVarPostBody = storyGetTagStoryUserUseridPostRequest;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling storyGetTagStoryUserUseridPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/story/get-tag-story/user/{userid}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * get-user-story
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void storyGetUserStoryUserUseridGet(String userid, String authorization, Integer page, Integer limit) throws RestClientException {
        storyGetUserStoryUserUseridGetWithHttpInfo(userid, authorization, page, limit);
    }

    /**
     * get-user-story
     * 
     * <p><b>200</b> - Successful response
     * @param userid  (required)
     * @param authorization  (optional)
     * @param page  (optional)
     * @param limit  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> storyGetUserStoryUserUseridGetWithHttpInfo(String userid, String authorization, Integer page, Integer limit) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'userid' is set
        if (userid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userid' when calling storyGetUserStoryUserUseridGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userid", userid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        

        if (authorization != null)
        localVarHeaderParams.add("Authorization", apiClient.parameterToString(authorization));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/story/get-user-story/user/{userid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
