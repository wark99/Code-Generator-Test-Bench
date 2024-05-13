package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AttributesResponse;
import org.openapitools.client.model.GenericError;
import org.openapitools.client.model.GetScoreRequest;
import org.openapitools.client.model.GetScoreRequest1;
import java.time.LocalDate;
import org.openapitools.client.model.ScoreResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:38.356341300Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ScoringApiApi {
    private ApiClient apiClient;

    public ScoringApiApi() {
        this(new ApiClient());
    }

    public ScoringApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get VS4+ attributes
     * Returns all VS4+ attributes calculated for a consumer based on its accounts, transaction history and credit information, using VS4+&#39;s proprietary model.
     * <p><b>200</b> - VS4+ attributes are calculated successfully.
     * <p><b>206</b> - Consumer profile is valid but does not qualify VS4+ attributes calculation.
     * <p><b>400</b> - Invalid request.
     * <p><b>415</b> - Invalid content type.
     * @param getScoreRequest Consumer file and credit report data. (required)
     * @param consumerId The pseudonimized consumer ID. (optional)
     * @param requestDate The date to send the scoring request. (optional)
     * @param uploadId ID of the upload session. Required when submitting consumer files by uploading them to S3. (optional)
     * @return AttributesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AttributesResponse getAttributes(GetScoreRequest getScoreRequest, String consumerId, LocalDate requestDate, String uploadId) throws RestClientException {
        return getAttributesWithHttpInfo(getScoreRequest, consumerId, requestDate, uploadId).getBody();
    }

    /**
     * Get VS4+ attributes
     * Returns all VS4+ attributes calculated for a consumer based on its accounts, transaction history and credit information, using VS4+&#39;s proprietary model.
     * <p><b>200</b> - VS4+ attributes are calculated successfully.
     * <p><b>206</b> - Consumer profile is valid but does not qualify VS4+ attributes calculation.
     * <p><b>400</b> - Invalid request.
     * <p><b>415</b> - Invalid content type.
     * @param getScoreRequest Consumer file and credit report data. (required)
     * @param consumerId The pseudonimized consumer ID. (optional)
     * @param requestDate The date to send the scoring request. (optional)
     * @param uploadId ID of the upload session. Required when submitting consumer files by uploading them to S3. (optional)
     * @return ResponseEntity&lt;AttributesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AttributesResponse> getAttributesWithHttpInfo(GetScoreRequest getScoreRequest, String consumerId, LocalDate requestDate, String uploadId) throws RestClientException {
        Object localVarPostBody = getScoreRequest;
        
        // verify the required parameter 'getScoreRequest' is set
        if (getScoreRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'getScoreRequest' when calling getAttributes");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "consumer_id", consumerId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "request_date", requestDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "upload_id", uploadId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<AttributesResponse> localReturnType = new ParameterizedTypeReference<AttributesResponse>() {};
        return apiClient.invokeAPI("/attributes", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a Dummy VS4+ Score
     * Calculates a dummy credit score. Used in development for input validation.
     * <p><b>200</b> - VS4+ score is calculated successfully.
     * <p><b>206</b> - Consumer profile is valid but not qualified for VS4+ score calculation.
     * <p><b>400</b> - Invalid request.
     * <p><b>415</b> - Invalid content type.
     * @param getScoreRequest Consumer file and credit report data. (required)
     * @param consumerId The pseudonimized consumer ID. (optional)
     * @param requestDate The date to send the scoring request. (optional)
     * @param uploadId ID of the upload session. Required when submitting consumer files by uploading them to S3. (optional)
     * @return ScoreResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ScoreResponse getSandboxScore(GetScoreRequest getScoreRequest, String consumerId, LocalDate requestDate, String uploadId) throws RestClientException {
        return getSandboxScoreWithHttpInfo(getScoreRequest, consumerId, requestDate, uploadId).getBody();
    }

    /**
     * Get a Dummy VS4+ Score
     * Calculates a dummy credit score. Used in development for input validation.
     * <p><b>200</b> - VS4+ score is calculated successfully.
     * <p><b>206</b> - Consumer profile is valid but not qualified for VS4+ score calculation.
     * <p><b>400</b> - Invalid request.
     * <p><b>415</b> - Invalid content type.
     * @param getScoreRequest Consumer file and credit report data. (required)
     * @param consumerId The pseudonimized consumer ID. (optional)
     * @param requestDate The date to send the scoring request. (optional)
     * @param uploadId ID of the upload session. Required when submitting consumer files by uploading them to S3. (optional)
     * @return ResponseEntity&lt;ScoreResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ScoreResponse> getSandboxScoreWithHttpInfo(GetScoreRequest getScoreRequest, String consumerId, LocalDate requestDate, String uploadId) throws RestClientException {
        Object localVarPostBody = getScoreRequest;
        
        // verify the required parameter 'getScoreRequest' is set
        if (getScoreRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'getScoreRequest' when calling getSandboxScore");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "consumer_id", consumerId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "request_date", requestDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "upload_id", uploadId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<ScoreResponse> localReturnType = new ParameterizedTypeReference<ScoreResponse>() {};
        return apiClient.invokeAPI("/sandbox", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get a VS4+ Score
     * Calculates a weighted credit score for a consumer based on its accounts, transaction history and credit information, using VS4+&#39;s proprietary model.
     * <p><b>200</b> - VS4+ score is calculated successfully.
     * <p><b>206</b> - Consumer profile is valid but not qualified for VS4+ score calculation.
     * <p><b>400</b> - Invalid request.
     * <p><b>415</b> - Invalid content type.
     * @param getScoreRequest Consumer file and credit report data. (required)
     * @param consumerId The pseudonimized consumer ID. (optional)
     * @param requestDate The date to send the scoring request. (optional)
     * @param uploadId ID of the upload session. Required when submitting consumer files by uploading them to S3. (optional)
     * @return ScoreResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ScoreResponse getScore(GetScoreRequest getScoreRequest, String consumerId, LocalDate requestDate, String uploadId) throws RestClientException {
        return getScoreWithHttpInfo(getScoreRequest, consumerId, requestDate, uploadId).getBody();
    }

    /**
     * Get a VS4+ Score
     * Calculates a weighted credit score for a consumer based on its accounts, transaction history and credit information, using VS4+&#39;s proprietary model.
     * <p><b>200</b> - VS4+ score is calculated successfully.
     * <p><b>206</b> - Consumer profile is valid but not qualified for VS4+ score calculation.
     * <p><b>400</b> - Invalid request.
     * <p><b>415</b> - Invalid content type.
     * @param getScoreRequest Consumer file and credit report data. (required)
     * @param consumerId The pseudonimized consumer ID. (optional)
     * @param requestDate The date to send the scoring request. (optional)
     * @param uploadId ID of the upload session. Required when submitting consumer files by uploading them to S3. (optional)
     * @return ResponseEntity&lt;ScoreResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ScoreResponse> getScoreWithHttpInfo(GetScoreRequest getScoreRequest, String consumerId, LocalDate requestDate, String uploadId) throws RestClientException {
        Object localVarPostBody = getScoreRequest;
        
        // verify the required parameter 'getScoreRequest' is set
        if (getScoreRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'getScoreRequest' when calling getScore");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "consumer_id", consumerId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "request_date", requestDate));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "upload_id", uploadId));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<ScoreResponse> localReturnType = new ParameterizedTypeReference<ScoreResponse>() {};
        return apiClient.invokeAPI("/score", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
