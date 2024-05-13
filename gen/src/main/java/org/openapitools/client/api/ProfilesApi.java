package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.DescribeProfileFields200Response;
import org.openapitools.client.model.ParamProfileId;
import org.openapitools.client.model.ResponseErrors;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:03.349465965Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ProfilesApi {
    private ApiClient apiClient;

    public ProfilesApi() {
        this(new ApiClient());
    }

    public ProfilesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Describe Record fields in a Profile
     * <p><b>200</b> - OK
     * <p><b>406</b> - Not Acceptable (Validation errors)
     * @param profileId  (required)
     * @return DescribeProfileFields200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DescribeProfileFields200Response describeProfileFields(ParamProfileId profileId) throws RestClientException {
        return describeProfileFieldsWithHttpInfo(profileId).getBody();
    }

    /**
     * 
     * Describe Record fields in a Profile
     * <p><b>200</b> - OK
     * <p><b>406</b> - Not Acceptable (Validation errors)
     * @param profileId  (required)
     * @return ResponseEntity&lt;DescribeProfileFields200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DescribeProfileFields200Response> describeProfileFieldsWithHttpInfo(ParamProfileId profileId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'profileId' is set
        if (profileId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'profileId' when calling describeProfileFields");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "profile_id", profileId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "internal-JWT" };

        ParameterizedTypeReference<DescribeProfileFields200Response> localReturnType = new ParameterizedTypeReference<DescribeProfileFields200Response>() {};
        return apiClient.invokeAPI("/v1/profiles/describe", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
