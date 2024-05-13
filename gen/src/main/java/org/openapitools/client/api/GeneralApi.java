package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.math.BigDecimal;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:33.772980200Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GeneralApi {
    private ApiClient apiClient;

    public GeneralApi() {
        this(new ApiClient());
    }

    public GeneralApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Job Status
     * An endpoint is used to check on the progress of the requested API job.   RESULT EXAMPLE:      {       \&quot;data\&quot;: {         \&quot;type\&quot;: \&quot;api_job_result\&quot;,         \&quot;id\&quot;: \&quot;05f988ad-c39a-4d87-b866-efe99bdee885\&quot;,         \&quot;attributes\&quot;: {           \&quot;status\&quot;: \&quot;success\&quot;,           \&quot;type\&quot;: \&quot;tth_hospitality_product_categories\&quot;,           \&quot;result\&quot;: \&quot;[{\\\&quot;name\\\&quot;: \\\&quot;Hotel Accommodation\\\&quot;, \\\&quot;weight\\\&quot;: 9.5}, {\\\&quot;name\\\&quot;: \\\&quot;Restaurant and Dining\\\&quot;, \\\&quot;weight\\\&quot;: 8}, {\\\&quot;name\\\&quot;: \\\&quot;Tourist Attractions\\\&quot;, \\\&quot;weight\\\&quot;: 7.5}]\&quot;         }       }     } 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>404</b> - Not Found
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object v1JobStatus9e0f60b8029946e9Be2e02e216b8dc66Get(String accept) throws RestClientException {
        return v1JobStatus9e0f60b8029946e9Be2e02e216b8dc66GetWithHttpInfo(accept).getBody();
    }

    /**
     * Job Status
     * An endpoint is used to check on the progress of the requested API job.   RESULT EXAMPLE:      {       \&quot;data\&quot;: {         \&quot;type\&quot;: \&quot;api_job_result\&quot;,         \&quot;id\&quot;: \&quot;05f988ad-c39a-4d87-b866-efe99bdee885\&quot;,         \&quot;attributes\&quot;: {           \&quot;status\&quot;: \&quot;success\&quot;,           \&quot;type\&quot;: \&quot;tth_hospitality_product_categories\&quot;,           \&quot;result\&quot;: \&quot;[{\\\&quot;name\\\&quot;: \\\&quot;Hotel Accommodation\\\&quot;, \\\&quot;weight\\\&quot;: 9.5}, {\\\&quot;name\\\&quot;: \\\&quot;Restaurant and Dining\\\&quot;, \\\&quot;weight\\\&quot;: 8}, {\\\&quot;name\\\&quot;: \\\&quot;Tourist Attractions\\\&quot;, \\\&quot;weight\\\&quot;: 7.5}]\&quot;         }       }     } 
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>402</b> - Payment Required
     * <p><b>404</b> - Not Found
     * <p><b>429</b> - Too Many Requests
     * <p><b>500</b> - Internal Server Error
     * <p><b>503</b> - Service Unavailable
     * @param accept  (optional)
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> v1JobStatus9e0f60b8029946e9Be2e02e216b8dc66GetWithHttpInfo(String accept) throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<Object> localReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/v1/job/status/9e0f60b8-0299-46e9-be2e-02e216b8dc66", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
