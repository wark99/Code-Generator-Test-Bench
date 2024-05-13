package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.MemberCourseUpdate200Response;
import org.openapitools.client.model.MemberCourseUpdate400Response;
import org.openapitools.client.model.MemberCourseUpdateRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:16:20.164612034Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class UpdateMemberCourseApi {
    private ApiClient apiClient;

    public UpdateMemberCourseApi() {
        this(new ApiClient());
    }

    public UpdateMemberCourseApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Endpoint to update a member with course completion
     * Endpoint to update a member with course completion
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * @param xApiKey API key for authorization (required)
     * @param xClientId API client ID (required)
     * @param memberId Member ID to update (required)
     * @param memberCourseUpdateRequest  (required)
     * @return MemberCourseUpdate200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MemberCourseUpdate200Response memberCourseUpdate(String xApiKey, String xClientId, String memberId, MemberCourseUpdateRequest memberCourseUpdateRequest) throws RestClientException {
        return memberCourseUpdateWithHttpInfo(xApiKey, xClientId, memberId, memberCourseUpdateRequest).getBody();
    }

    /**
     * Endpoint to update a member with course completion
     * Endpoint to update a member with course completion
     * <p><b>200</b> - Success
     * <p><b>400</b> - Bad request
     * @param xApiKey API key for authorization (required)
     * @param xClientId API client ID (required)
     * @param memberId Member ID to update (required)
     * @param memberCourseUpdateRequest  (required)
     * @return ResponseEntity&lt;MemberCourseUpdate200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MemberCourseUpdate200Response> memberCourseUpdateWithHttpInfo(String xApiKey, String xClientId, String memberId, MemberCourseUpdateRequest memberCourseUpdateRequest) throws RestClientException {
        Object localVarPostBody = memberCourseUpdateRequest;
        
        // verify the required parameter 'xApiKey' is set
        if (xApiKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xApiKey' when calling memberCourseUpdate");
        }
        
        // verify the required parameter 'xClientId' is set
        if (xClientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'xClientId' when calling memberCourseUpdate");
        }
        
        // verify the required parameter 'memberId' is set
        if (memberId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'memberId' when calling memberCourseUpdate");
        }
        
        // verify the required parameter 'memberCourseUpdateRequest' is set
        if (memberCourseUpdateRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'memberCourseUpdateRequest' when calling memberCourseUpdate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("memberId", memberId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xApiKey != null)
        localVarHeaderParams.add("x-api-key", apiClient.parameterToString(xApiKey));
        if (xClientId != null)
        localVarHeaderParams.add("x-client-id", apiClient.parameterToString(xClientId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<MemberCourseUpdate200Response> localReturnType = new ParameterizedTypeReference<MemberCourseUpdate200Response>() {};
        return apiClient.invokeAPI("/course/update/{memberId}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
