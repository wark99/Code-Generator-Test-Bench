package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.PostApiV1LicensesCheckRequestBody;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:53.528488476Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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
     * Check License
     * The preferable way is to use \&quot;Bearer\&quot; header to send license code instead of \&quot;key\&quot; parameter.
     * <p><b>401</b> - Authentication is invalid
     * <p><b>403</b> - License is invalid
     * <p><b>204</b> - License is valid (no response body)
     * @param postApiV1LicensesCheckRequestBody  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiV1LicensesCheckPost(PostApiV1LicensesCheckRequestBody postApiV1LicensesCheckRequestBody) throws RestClientException {
        apiV1LicensesCheckPostWithHttpInfo(postApiV1LicensesCheckRequestBody);
    }

    /**
     * Check License
     * The preferable way is to use \&quot;Bearer\&quot; header to send license code instead of \&quot;key\&quot; parameter.
     * <p><b>401</b> - Authentication is invalid
     * <p><b>403</b> - License is invalid
     * <p><b>204</b> - License is valid (no response body)
     * @param postApiV1LicensesCheckRequestBody  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiV1LicensesCheckPostWithHttpInfo(PostApiV1LicensesCheckRequestBody postApiV1LicensesCheckRequestBody) throws RestClientException {
        Object localVarPostBody = postApiV1LicensesCheckRequestBody;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json;charset=UTF-8"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/v1/licenses/check", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
