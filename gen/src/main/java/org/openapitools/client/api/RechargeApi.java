package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ModelApiResponse;
import org.openapitools.client.model.RechargeRequest;

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
public class RechargeApi {
    private ApiClient apiClient;

    public RechargeApi() {
        this(new ApiClient());
    }

    public RechargeApi(ApiClient apiClient) {
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
     * &lt;h1&gt;Description&lt;/h1&gt; &lt;h3&gt;The \&quot;Recharge by Mdn\&quot; API is a specific type of recharge API that allows users to recharge their mobile phone using their Mdn.&lt;h3&gt; &lt;h1&gt;Endpoints&lt;/h1&gt; &lt;h4&gt;/BoomRecharge&lt;/h4&gt; &lt;h1&gt;Request Type&lt;/h1&gt; &lt;h4&gt;Post&lt;/h4&gt; &lt;h3&gt;Parameters&lt;/h3&gt; &lt;ul&gt; &lt;li&gt;&lt;code&gt;ClientCode&lt;/code&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;code&gt;TransactionId&lt;/code&gt; (String - Mandatory) Starting with \&quot;BRI\&quot; for instant activation.&lt;/li&gt; &lt;li&gt;&lt;code&gt;MSISDN&lt;/code&gt; (String - Mandatory) MSISDN must be exactly 10 digits.&lt;/li&gt; &lt;li&gt;&lt;code&gt;PlanID&lt;/code&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;code&gt;Rental&lt;/code&gt; (Decimal - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;code&gt;Carrier_Type&lt;/code&gt; (Int - Mandatory) 97 for purple2 and 90 for red.&lt;/li&gt; &lt;li&gt;&lt;code&gt;RechargeType&lt;/code&gt; (Int - Mandatory) 0 for after plan expires and 1 for starting from.&lt;/li&gt; &lt;/ul&gt;
     * <p><b>200</b> - successful
     * @param rechargeRequest Add Recharge (required)
     * @return ModelApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelApiResponse boomRechargePost(RechargeRequest rechargeRequest) throws RestClientException {
        return boomRechargePostWithHttpInfo(rechargeRequest).getBody();
    }

    /**
     * 
     * &lt;h1&gt;Description&lt;/h1&gt; &lt;h3&gt;The \&quot;Recharge by Mdn\&quot; API is a specific type of recharge API that allows users to recharge their mobile phone using their Mdn.&lt;h3&gt; &lt;h1&gt;Endpoints&lt;/h1&gt; &lt;h4&gt;/BoomRecharge&lt;/h4&gt; &lt;h1&gt;Request Type&lt;/h1&gt; &lt;h4&gt;Post&lt;/h4&gt; &lt;h3&gt;Parameters&lt;/h3&gt; &lt;ul&gt; &lt;li&gt;&lt;code&gt;ClientCode&lt;/code&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;code&gt;TransactionId&lt;/code&gt; (String - Mandatory) Starting with \&quot;BRI\&quot; for instant activation.&lt;/li&gt; &lt;li&gt;&lt;code&gt;MSISDN&lt;/code&gt; (String - Mandatory) MSISDN must be exactly 10 digits.&lt;/li&gt; &lt;li&gt;&lt;code&gt;PlanID&lt;/code&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;code&gt;Rental&lt;/code&gt; (Decimal - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;code&gt;Carrier_Type&lt;/code&gt; (Int - Mandatory) 97 for purple2 and 90 for red.&lt;/li&gt; &lt;li&gt;&lt;code&gt;RechargeType&lt;/code&gt; (Int - Mandatory) 0 for after plan expires and 1 for starting from.&lt;/li&gt; &lt;/ul&gt;
     * <p><b>200</b> - successful
     * @param rechargeRequest Add Recharge (required)
     * @return ResponseEntity&lt;ModelApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelApiResponse> boomRechargePostWithHttpInfo(RechargeRequest rechargeRequest) throws RestClientException {
        Object localVarPostBody = rechargeRequest;
        
        // verify the required parameter 'rechargeRequest' is set
        if (rechargeRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'rechargeRequest' when calling boomRechargePost");
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
        return apiClient.invokeAPI("/BoomRecharge", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
