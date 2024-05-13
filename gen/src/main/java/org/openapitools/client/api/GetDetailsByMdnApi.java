package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetDetailsByMdnRequest;
import org.openapitools.client.model.ModelApiResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:50.381152Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class GetDetailsByMdnApi {
    private ApiClient apiClient;

    public GetDetailsByMdnApi() {
        this(new ApiClient());
    }

    public GetDetailsByMdnApi(ApiClient apiClient) {
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
     * 
     * <p><b>200</b> - successful
     * @param getDetailsByMdnRequest &lt;h1&gt;Description&lt;/h1&gt; &lt;h3&gt;The \&quot;Get Details By Mdn\&quot; Api displays information about Mdn’s details, subscription details, customer details and plan. &lt;h3&gt; &lt;h1&gt;Endpoints&lt;/h1&gt; &lt;h4&gt;/BoomGetMdnStatus&lt;/h4&gt; &lt;h1&gt;Request Type&lt;/h1&gt; &lt;h4&gt;Post&lt;/h4&gt; &lt;h3&gt;Parameters&lt;/h3&gt; &lt;ul&gt; &lt;li&gt;&lt;strong&gt;ClientCode&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Msisdn&lt;/strong&gt; (String - Mandatory) MSISDN must be exactly 10 digits.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Carrier_Type&lt;/strong&gt; (Int - Mandatory) 97 for purple2 and 90 for red.&lt;/li&gt; &lt;/ul&gt; (required)
     * @return ModelApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelApiResponse boomGetMdnStatusPost(GetDetailsByMdnRequest getDetailsByMdnRequest) throws RestClientException {
        return boomGetMdnStatusPostWithHttpInfo(getDetailsByMdnRequest).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful
     * @param getDetailsByMdnRequest &lt;h1&gt;Description&lt;/h1&gt; &lt;h3&gt;The \&quot;Get Details By Mdn\&quot; Api displays information about Mdn’s details, subscription details, customer details and plan. &lt;h3&gt; &lt;h1&gt;Endpoints&lt;/h1&gt; &lt;h4&gt;/BoomGetMdnStatus&lt;/h4&gt; &lt;h1&gt;Request Type&lt;/h1&gt; &lt;h4&gt;Post&lt;/h4&gt; &lt;h3&gt;Parameters&lt;/h3&gt; &lt;ul&gt; &lt;li&gt;&lt;strong&gt;ClientCode&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Msisdn&lt;/strong&gt; (String - Mandatory) MSISDN must be exactly 10 digits.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Carrier_Type&lt;/strong&gt; (Int - Mandatory) 97 for purple2 and 90 for red.&lt;/li&gt; &lt;/ul&gt; (required)
     * @return ResponseEntity&lt;ModelApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelApiResponse> boomGetMdnStatusPostWithHttpInfo(GetDetailsByMdnRequest getDetailsByMdnRequest) throws RestClientException {
        Object localVarPostBody = getDetailsByMdnRequest;
        
        // verify the required parameter 'getDetailsByMdnRequest' is set
        if (getDetailsByMdnRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'getDetailsByMdnRequest' when calling boomGetMdnStatusPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ModelApiResponse> localReturnType = new ParameterizedTypeReference<ModelApiResponse>() {};
        return apiClient.invokeAPI("/BoomGetMdnStatus", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
