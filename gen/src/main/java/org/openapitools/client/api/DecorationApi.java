package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.DecNotDone;
import org.openapitools.client.model.DecResult;
import org.openapitools.client.model.Decoration;
import java.io.File;
import org.openapitools.client.model.GetError;
import org.openapitools.client.model.RetryDecoration;
import org.openapitools.client.model.RoomTypeError;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:32.920428042Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DecorationApi {
    private ApiClient apiClient;

    public DecorationApi() {
        this(new ApiClient());
    }

    public DecorationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Obtain a new automatic &#39;decoration&#39; image from your input image.
     * Generates an automatic decoration for a input image of an indoor space in less than 20 seconds.
     * <p><b>200</b> - Image for decoration uploaded successfully
     * <p><b>400</b> - Bad Request
     * @param roomType TODO (required)
     * @param style TODO (required)
     * @param initImage  (optional)
     * @return Decoration
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Decoration autoDecoration(String roomType, String style, File initImage) throws RestClientException {
        return autoDecorationWithHttpInfo(roomType, style, initImage).getBody();
    }

    /**
     * Obtain a new automatic &#39;decoration&#39; image from your input image.
     * Generates an automatic decoration for a input image of an indoor space in less than 20 seconds.
     * <p><b>200</b> - Image for decoration uploaded successfully
     * <p><b>400</b> - Bad Request
     * @param roomType TODO (required)
     * @param style TODO (required)
     * @param initImage  (optional)
     * @return ResponseEntity&lt;Decoration&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Decoration> autoDecorationWithHttpInfo(String roomType, String style, File initImage) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'roomType' is set
        if (roomType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'roomType' when calling autoDecoration");
        }
        
        // verify the required parameter 'style' is set
        if (style == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'style' when calling autoDecoration");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "room_type", roomType));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "style", style));
        

        if (initImage != null)
            localVarFormParams.add("init_image", new FileSystemResource(initImage));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Decoration> localReturnType = new ParameterizedTypeReference<Decoration>() {};
        return apiClient.invokeAPI("/auto_decoration", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a full resolution decoration from img_id.
     * Get the full resolution decoration computed automatically using the img_id provided in auto_decoration endpoint.
     * <p><b>200</b> - successful operation (Decoration DONE)
     * <p><b>201</b> - successful operation (Decoration INPROGRESS)
     * <p><b>400</b> - Invalid status value
     * @param imgId UUID from the decoration provided for auto_decoration endpoint. (required)
     * @param retryId Retry id provided for retry_decoration endpoint. (optional)
     * @return DecResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DecResult getDecoration(String imgId, Integer retryId) throws RestClientException {
        return getDecorationWithHttpInfo(imgId, retryId).getBody();
    }

    /**
     * Get a full resolution decoration from img_id.
     * Get the full resolution decoration computed automatically using the img_id provided in auto_decoration endpoint.
     * <p><b>200</b> - successful operation (Decoration DONE)
     * <p><b>201</b> - successful operation (Decoration INPROGRESS)
     * <p><b>400</b> - Invalid status value
     * @param imgId UUID from the decoration provided for auto_decoration endpoint. (required)
     * @param retryId Retry id provided for retry_decoration endpoint. (optional)
     * @return ResponseEntity&lt;DecResult&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DecResult> getDecorationWithHttpInfo(String imgId, Integer retryId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'imgId' is set
        if (imgId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imgId' when calling getDecoration");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "img_id", imgId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "retry_id", retryId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<DecResult> localReturnType = new ParameterizedTypeReference<DecResult>() {};
        return apiClient.invokeAPI("/get_decoration", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retry a &#39;decoration&#39; image using same img_id.
     * Generates a new decoration for an specific image identified previously decorated. The room_type and style can&#39;t be modified and it will use the same as the ones provided in the auto_decoration call.
     * <p><b>200</b> - Processing a new decoration for specific img_id
     * <p><b>400</b> - Bad Request
     * @param imgId UIID provided in auto_decoration endpoint (required)
     * @return RetryDecoration
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RetryDecoration retryDecoration(String imgId) throws RestClientException {
        return retryDecorationWithHttpInfo(imgId).getBody();
    }

    /**
     * Retry a &#39;decoration&#39; image using same img_id.
     * Generates a new decoration for an specific image identified previously decorated. The room_type and style can&#39;t be modified and it will use the same as the ones provided in the auto_decoration call.
     * <p><b>200</b> - Processing a new decoration for specific img_id
     * <p><b>400</b> - Bad Request
     * @param imgId UIID provided in auto_decoration endpoint (required)
     * @return ResponseEntity&lt;RetryDecoration&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RetryDecoration> retryDecorationWithHttpInfo(String imgId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'imgId' is set
        if (imgId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imgId' when calling retryDecoration");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "img_id", imgId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<RetryDecoration> localReturnType = new ParameterizedTypeReference<RetryDecoration>() {};
        return apiClient.invokeAPI("/retry_decoration", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
