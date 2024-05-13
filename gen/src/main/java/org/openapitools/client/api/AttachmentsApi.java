package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetDataAttachmentResponse;
import org.openapitools.client.model.HTTPValidationError;
import org.openapitools.client.model.ItemNotFoundMessage;
import java.util.UUID;

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
public class AttachmentsApi {
    private ApiClient apiClient;

    public AttachmentsApi() {
        this(new ApiClient());
    }

    public AttachmentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Data Attachment
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param dataAttachmentId  (required)
     * @param accept  (optional)
     * @return GetDataAttachmentResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDataAttachmentResponse getDataAttachmentAttachmentsDataAttachmentIdGet(UUID dataAttachmentId, String accept) throws RestClientException {
        return getDataAttachmentAttachmentsDataAttachmentIdGetWithHttpInfo(dataAttachmentId, accept).getBody();
    }

    /**
     * Get Data Attachment
     * 
     * <p><b>200</b> - Successful Response
     * <p><b>404</b> - Not Found
     * <p><b>422</b> - Validation Error
     * @param dataAttachmentId  (required)
     * @param accept  (optional)
     * @return ResponseEntity&lt;GetDataAttachmentResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDataAttachmentResponse> getDataAttachmentAttachmentsDataAttachmentIdGetWithHttpInfo(UUID dataAttachmentId, String accept) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'dataAttachmentId' is set
        if (dataAttachmentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dataAttachmentId' when calling getDataAttachmentAttachmentsDataAttachmentIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("data_attachment_id", dataAttachmentId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (accept != null)
        localVarHeaderParams.add("Accept", apiClient.parameterToString(accept));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<GetDataAttachmentResponse> localReturnType = new ParameterizedTypeReference<GetDataAttachmentResponse>() {};
        return apiClient.invokeAPI("/attachments/{data_attachment_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
