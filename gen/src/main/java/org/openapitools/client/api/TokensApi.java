package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetDataAttachmentPaginationSet;
import org.openapitools.client.model.HTTPValidationError;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:15:43.391813307Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TokensApi {
    private ApiClient apiClient;

    public TokensApi() {
        this(new ApiClient());
    }

    public TokensApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Token Attachments
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>204</b> - No Content
     * <p><b>422</b> - Validation Error
     * @param tokenCode  (required)
     * @param pageSize  (optional, default to 10)
     * @param page  (optional, default to 1)
     * @param accept  (optional)
     * @return GetDataAttachmentPaginationSet
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDataAttachmentPaginationSet getTokenAttachmentsTokensTokenCodeAttachmentsGet(String tokenCode, Integer pageSize, Integer page, String accept) throws RestClientException {
        return getTokenAttachmentsTokensTokenCodeAttachmentsGetWithHttpInfo(tokenCode, pageSize, page, accept).getBody();
    }

    /**
     * Get Token Attachments
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>204</b> - No Content
     * <p><b>422</b> - Validation Error
     * @param tokenCode  (required)
     * @param pageSize  (optional, default to 10)
     * @param page  (optional, default to 1)
     * @param accept  (optional)
     * @return ResponseEntity&lt;GetDataAttachmentPaginationSet&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDataAttachmentPaginationSet> getTokenAttachmentsTokensTokenCodeAttachmentsGetWithHttpInfo(String tokenCode, Integer pageSize, Integer page, String accept) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tokenCode' is set
        if (tokenCode == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tokenCode' when calling getTokenAttachmentsTokensTokenCodeAttachmentsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("token_code", tokenCode);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page_size", pageSize));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        

        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetDataAttachmentPaginationSet> localReturnType = new ParameterizedTypeReference<GetDataAttachmentPaginationSet>() {};
        return apiClient.invokeAPI("/tokens/{token_code}/attachments", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
