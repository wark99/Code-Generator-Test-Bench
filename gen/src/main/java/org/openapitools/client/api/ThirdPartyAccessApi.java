package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ErrorMessage;
import org.openapitools.client.model.ThirdPartyAccessKeyData;
import org.openapitools.client.model.ThirdPartyAccessKeyReceiptData;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-03-30T15:37:23.431609925Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ThirdPartyAccessApi {
    private ApiClient apiClient;

    public ThirdPartyAccessApi() {
        this(new ApiClient());
    }

    public ThirdPartyAccessApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Generate Third Party Access Key
     * Generate access key for third party partners. A partner can provide access to third party partners with this access key.
     * <p><b>200</b> - The third party access key was successfully generated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param thirdPartyAccessKeyData  (required)
     * @return ThirdPartyAccessKeyReceiptData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ThirdPartyAccessKeyReceiptData generateThirdPartyAccessKey(ThirdPartyAccessKeyData thirdPartyAccessKeyData) throws RestClientException {
        return generateThirdPartyAccessKeyWithHttpInfo(thirdPartyAccessKeyData).getBody();
    }

    /**
     * Generate Third Party Access Key
     * Generate access key for third party partners. A partner can provide access to third party partners with this access key.
     * <p><b>200</b> - The third party access key was successfully generated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param thirdPartyAccessKeyData  (required)
     * @return ResponseEntity&lt;ThirdPartyAccessKeyReceiptData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ThirdPartyAccessKeyReceiptData> generateThirdPartyAccessKeyWithHttpInfo(ThirdPartyAccessKeyData thirdPartyAccessKeyData) throws RestClientException {
        Object localVarPostBody = thirdPartyAccessKeyData;
        
        // verify the required parameter 'thirdPartyAccessKeyData' is set
        if (thirdPartyAccessKeyData == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'thirdPartyAccessKeyData' when calling generateThirdPartyAccessKey");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<ThirdPartyAccessKeyReceiptData> localReturnType = new ParameterizedTypeReference<ThirdPartyAccessKeyReceiptData>() {};
        return apiClient.invokeAPI("/aggregation/v1/partners/accessKey", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Revoke Third Party Access
     * Revoke access of third party partners
     * <p><b>204</b> - The third party access key was successfully revoked
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param consentReceiptId Third party access key receipt ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void revokeThirdPartyAccessKey(String consentReceiptId) throws RestClientException {
        revokeThirdPartyAccessKeyWithHttpInfo(consentReceiptId);
    }

    /**
     * Revoke Third Party Access
     * Revoke access of third party partners
     * <p><b>204</b> - The third party access key was successfully revoked
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param consentReceiptId Third party access key receipt ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> revokeThirdPartyAccessKeyWithHttpInfo(String consentReceiptId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'consentReceiptId' is set
        if (consentReceiptId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'consentReceiptId' when calling revokeThirdPartyAccessKey");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("consentReceiptId", consentReceiptId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/aggregation/v1/partners/accessKey/{consentReceiptId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Third Party Access
     * Update access for third party partners
     * <p><b>200</b> - The third party access key was successfully updated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param consentReceiptId Third party access key receipt ID (required)
     * @param thirdPartyAccessKeyData  (required)
     * @return ThirdPartyAccessKeyReceiptData
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ThirdPartyAccessKeyReceiptData updateThirdPartyAccessKey(String consentReceiptId, ThirdPartyAccessKeyData thirdPartyAccessKeyData) throws RestClientException {
        return updateThirdPartyAccessKeyWithHttpInfo(consentReceiptId, thirdPartyAccessKeyData).getBody();
    }

    /**
     * Update Third Party Access
     * Update access for third party partners
     * <p><b>200</b> - The third party access key was successfully updated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param consentReceiptId Third party access key receipt ID (required)
     * @param thirdPartyAccessKeyData  (required)
     * @return ResponseEntity&lt;ThirdPartyAccessKeyReceiptData&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ThirdPartyAccessKeyReceiptData> updateThirdPartyAccessKeyWithHttpInfo(String consentReceiptId, ThirdPartyAccessKeyData thirdPartyAccessKeyData) throws RestClientException {
        Object localVarPostBody = thirdPartyAccessKeyData;
        
        // verify the required parameter 'consentReceiptId' is set
        if (consentReceiptId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'consentReceiptId' when calling updateThirdPartyAccessKey");
        }
        
        // verify the required parameter 'thirdPartyAccessKeyData' is set
        if (thirdPartyAccessKeyData == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'thirdPartyAccessKeyData' when calling updateThirdPartyAccessKey");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("consentReceiptId", consentReceiptId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<ThirdPartyAccessKeyReceiptData> localReturnType = new ParameterizedTypeReference<ThirdPartyAccessKeyReceiptData>() {};
        return apiClient.invokeAPI("/aggregation/v1/partners/accessKey/{consentReceiptId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
