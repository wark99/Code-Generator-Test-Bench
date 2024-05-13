package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CheckPortinMdnRequest;
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
public class CheckPortinMdnApi {
    private ApiClient apiClient;

    public CheckPortinMdnApi() {
        this(new ApiClient());
    }

    public CheckPortinMdnApi(ApiClient apiClient) {
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
     * &lt;h1&gt;Description&lt;/h1&gt; &lt;h3&gt;The \&quot;Check Port in by Mdn\&quot; API check if IMEI, SIM and MDN are compatible. We get status which describes if the MDN is Portable. This API is called during the port in number flow to check port possibility. &lt;h3&gt; &lt;h1&gt;Endpoints&lt;/h1&gt; &lt;h4&gt;/BoomCheckPortinMdn&lt;/h4&gt; &lt;h1&gt;Request Type&lt;/h1&gt; &lt;h4&gt;Post&lt;/h4&gt; &lt;h3&gt;Parameters&lt;/h3&gt; &lt;ul&gt; &lt;li&gt;&lt;strong&gt;ClientCode&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;IMEI&lt;/strong&gt; (String - Mandatory) IMEI length must be between 14 and 16 characters.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;SerialNumber&lt;/strong&gt; (String - with eSIM mandatory, otherwise optional) Serial No. must be between 18 and 23 characters.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Msisdn&lt;/strong&gt; (String - Mandatory) MSISDN must be exactly 10 digits.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;is4g&lt;/strong&gt; (Boolean - for portin mandatory, otherwise optional) True with 4G and False without 4G.&lt;/li&gt; &lt;/ul&gt;
     * <p><b>200</b> - successful
     * @param checkPortinMdnRequest Check Portin by Mdn (required)
     * @return ModelApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelApiResponse boomCheckPortinMdnPost(CheckPortinMdnRequest checkPortinMdnRequest) throws RestClientException {
        return boomCheckPortinMdnPostWithHttpInfo(checkPortinMdnRequest).getBody();
    }

    /**
     * 
     * &lt;h1&gt;Description&lt;/h1&gt; &lt;h3&gt;The \&quot;Check Port in by Mdn\&quot; API check if IMEI, SIM and MDN are compatible. We get status which describes if the MDN is Portable. This API is called during the port in number flow to check port possibility. &lt;h3&gt; &lt;h1&gt;Endpoints&lt;/h1&gt; &lt;h4&gt;/BoomCheckPortinMdn&lt;/h4&gt; &lt;h1&gt;Request Type&lt;/h1&gt; &lt;h4&gt;Post&lt;/h4&gt; &lt;h3&gt;Parameters&lt;/h3&gt; &lt;ul&gt; &lt;li&gt;&lt;strong&gt;ClientCode&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;IMEI&lt;/strong&gt; (String - Mandatory) IMEI length must be between 14 and 16 characters.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;SerialNumber&lt;/strong&gt; (String - with eSIM mandatory, otherwise optional) Serial No. must be between 18 and 23 characters.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Msisdn&lt;/strong&gt; (String - Mandatory) MSISDN must be exactly 10 digits.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;is4g&lt;/strong&gt; (Boolean - for portin mandatory, otherwise optional) True with 4G and False without 4G.&lt;/li&gt; &lt;/ul&gt;
     * <p><b>200</b> - successful
     * @param checkPortinMdnRequest Check Portin by Mdn (required)
     * @return ResponseEntity&lt;ModelApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelApiResponse> boomCheckPortinMdnPostWithHttpInfo(CheckPortinMdnRequest checkPortinMdnRequest) throws RestClientException {
        Object localVarPostBody = checkPortinMdnRequest;
        
        // verify the required parameter 'checkPortinMdnRequest' is set
        if (checkPortinMdnRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'checkPortinMdnRequest' when calling boomCheckPortinMdnPost");
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
        return apiClient.invokeAPI("/BoomCheckPortinMdn", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
