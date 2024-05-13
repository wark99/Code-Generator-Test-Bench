package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BasicUserInfoPostRequest;
import org.openapitools.client.model.ConsentConfirmationDisclaimerPostRequest;
import org.openapitools.client.model.ConsentVerificationPostRequest;
import org.openapitools.client.model.FeedbackCollectionPostRequest;
import org.openapitools.client.model.FollowUpQuestionsPostRequest;
import org.openapitools.client.model.InitializePostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:17.503316209Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * Collect basic user information like full name and referral source.
     * 
     * <p><b>200</b> - Request for basic user information.
     * @param basicUserInfoPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void basicUserInfoPost(BasicUserInfoPostRequest basicUserInfoPostRequest) throws RestClientException {
        basicUserInfoPostWithHttpInfo(basicUserInfoPostRequest);
    }

    /**
     * Collect basic user information like full name and referral source.
     * 
     * <p><b>200</b> - Request for basic user information.
     * @param basicUserInfoPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> basicUserInfoPostWithHttpInfo(BasicUserInfoPostRequest basicUserInfoPostRequest) throws RestClientException {
        Object localVarPostBody = basicUserInfoPostRequest;
        
        // verify the required parameter 'basicUserInfoPostRequest' is set
        if (basicUserInfoPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'basicUserInfoPostRequest' when calling basicUserInfoPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/basic-user-info", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Notify the user about business hours and expected response times.
     * 
     * <p><b>200</b> - Business hours information.
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void businessHoursNotificationGet() throws RestClientException {
        businessHoursNotificationGetWithHttpInfo();
    }

    /**
     * Notify the user about business hours and expected response times.
     * 
     * <p><b>200</b> - Business hours information.
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> businessHoursNotificationGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/business-hours-notification", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Ask case-specific questions regarding legal representation and accident details.
     * 
     * <p><b>200</b> - Case-specific queries and potential off-ramp scenarios.
     * @param basicUserInfoPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void caseSpecificQueriesPost(BasicUserInfoPostRequest basicUserInfoPostRequest) throws RestClientException {
        caseSpecificQueriesPostWithHttpInfo(basicUserInfoPostRequest);
    }

    /**
     * Ask case-specific questions regarding legal representation and accident details.
     * 
     * <p><b>200</b> - Case-specific queries and potential off-ramp scenarios.
     * @param basicUserInfoPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> caseSpecificQueriesPostWithHttpInfo(BasicUserInfoPostRequest basicUserInfoPostRequest) throws RestClientException {
        Object localVarPostBody = basicUserInfoPostRequest;
        
        // verify the required parameter 'basicUserInfoPostRequest' is set
        if (basicUserInfoPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'basicUserInfoPostRequest' when calling caseSpecificQueriesPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/case-specific-queries", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Confirm user&#39;s understanding of the service&#39;s nature and limitations.
     * 
     * <p><b>200</b> - Confirmation of user&#39;s understanding and consent.
     * @param consentConfirmationDisclaimerPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void consentConfirmationDisclaimerPost(ConsentConfirmationDisclaimerPostRequest consentConfirmationDisclaimerPostRequest) throws RestClientException {
        consentConfirmationDisclaimerPostWithHttpInfo(consentConfirmationDisclaimerPostRequest);
    }

    /**
     * Confirm user&#39;s understanding of the service&#39;s nature and limitations.
     * 
     * <p><b>200</b> - Confirmation of user&#39;s understanding and consent.
     * @param consentConfirmationDisclaimerPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> consentConfirmationDisclaimerPostWithHttpInfo(ConsentConfirmationDisclaimerPostRequest consentConfirmationDisclaimerPostRequest) throws RestClientException {
        Object localVarPostBody = consentConfirmationDisclaimerPostRequest;
        
        // verify the required parameter 'consentConfirmationDisclaimerPostRequest' is set
        if (consentConfirmationDisclaimerPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'consentConfirmationDisclaimerPostRequest' when calling consentConfirmationDisclaimerPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/consent-confirmation-disclaimer", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Verify user consent for communication via text (SMS).
     * 
     * <p><b>200</b> - Confirmation of consent verification.
     * @param consentVerificationPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void consentVerificationPost(ConsentVerificationPostRequest consentVerificationPostRequest) throws RestClientException {
        consentVerificationPostWithHttpInfo(consentVerificationPostRequest);
    }

    /**
     * Verify user consent for communication via text (SMS).
     * 
     * <p><b>200</b> - Confirmation of consent verification.
     * @param consentVerificationPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> consentVerificationPostWithHttpInfo(ConsentVerificationPostRequest consentVerificationPostRequest) throws RestClientException {
        Object localVarPostBody = consentVerificationPostRequest;
        
        // verify the required parameter 'consentVerificationPostRequest' is set
        if (consentVerificationPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'consentVerificationPostRequest' when calling consentVerificationPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/consent-verification", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Conclude the interaction and provide closure.
     * 
     * <p><b>200</b> - Thank you message and interaction conclusion.
     * @param basicUserInfoPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void endInteractionPost(BasicUserInfoPostRequest basicUserInfoPostRequest) throws RestClientException {
        endInteractionPostWithHttpInfo(basicUserInfoPostRequest);
    }

    /**
     * Conclude the interaction and provide closure.
     * 
     * <p><b>200</b> - Thank you message and interaction conclusion.
     * @param basicUserInfoPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> endInteractionPostWithHttpInfo(BasicUserInfoPostRequest basicUserInfoPostRequest) throws RestClientException {
        Object localVarPostBody = basicUserInfoPostRequest;
        
        // verify the required parameter 'basicUserInfoPostRequest' is set
        if (basicUserInfoPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'basicUserInfoPostRequest' when calling endInteractionPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/end-interaction", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Collect user feedback for continuous improvement.
     * 
     * <p><b>200</b> - Acknowledgement of feedback and appreciation.
     * @param feedbackCollectionPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void feedbackCollectionPost(FeedbackCollectionPostRequest feedbackCollectionPostRequest) throws RestClientException {
        feedbackCollectionPostWithHttpInfo(feedbackCollectionPostRequest);
    }

    /**
     * Collect user feedback for continuous improvement.
     * 
     * <p><b>200</b> - Acknowledgement of feedback and appreciation.
     * @param feedbackCollectionPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> feedbackCollectionPostWithHttpInfo(FeedbackCollectionPostRequest feedbackCollectionPostRequest) throws RestClientException {
        Object localVarPostBody = feedbackCollectionPostRequest;
        
        // verify the required parameter 'feedbackCollectionPostRequest' is set
        if (feedbackCollectionPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'feedbackCollectionPostRequest' when calling feedbackCollectionPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/feedback-collection", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Pose detailed follow-up questions based on previous responses.
     * 
     * <p><b>200</b> - Follow-up questions for clarity and completeness.
     * @param followUpQuestionsPostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void followUpQuestionsPost(FollowUpQuestionsPostRequest followUpQuestionsPostRequest) throws RestClientException {
        followUpQuestionsPostWithHttpInfo(followUpQuestionsPostRequest);
    }

    /**
     * Pose detailed follow-up questions based on previous responses.
     * 
     * <p><b>200</b> - Follow-up questions for clarity and completeness.
     * @param followUpQuestionsPostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> followUpQuestionsPostWithHttpInfo(FollowUpQuestionsPostRequest followUpQuestionsPostRequest) throws RestClientException {
        Object localVarPostBody = followUpQuestionsPostRequest;
        
        // verify the required parameter 'followUpQuestionsPostRequest' is set
        if (followUpQuestionsPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'followUpQuestionsPostRequest' when calling followUpQuestionsPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/follow-up-questions", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Start a new user session with an initial greeting.
     * 
     * <p><b>200</b> - Initial greeting and preliminary questions.
     * @param initializePostRequest  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void initializePost(InitializePostRequest initializePostRequest) throws RestClientException {
        initializePostWithHttpInfo(initializePostRequest);
    }

    /**
     * Start a new user session with an initial greeting.
     * 
     * <p><b>200</b> - Initial greeting and preliminary questions.
     * @param initializePostRequest  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> initializePostWithHttpInfo(InitializePostRequest initializePostRequest) throws RestClientException {
        Object localVarPostBody = initializePostRequest;
        
        // verify the required parameter 'initializePostRequest' is set
        if (initializePostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'initializePostRequest' when calling initializePost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/initialize", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
