package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.InstantActivationRequest;
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
public class InstantActivationApi {
    private ApiClient apiClient;

    public InstantActivationApi() {
        this(new ApiClient());
    }

    public InstantActivationApi(ApiClient apiClient) {
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
     * &lt;h1&gt;Description&lt;/h1&gt; &lt;h3&gt;The \&quot;Activate Mdn with eSim / physical sim\&quot; API activates new number for a customer using eSim or physical sim. The new number can be activated only after a  successful validation which checks if the IMEI is valid and compatible to eSim technology or not.&lt;h3&gt; &lt;h1&gt;Endpoints&lt;/h1&gt; &lt;h4&gt;/BoomInstantActivation&lt;/h4&gt; &lt;h1&gt;Request Type&lt;/h1&gt; &lt;h4&gt;Post&lt;/h4&gt; &lt;h2&gt;Parameters&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;&lt;strong&gt;ClientCode&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;IMEI&lt;/strong&gt; (String - Mandatory) IMEI length Can&#39;t be greater than 16 and less than 14.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;SerialNumber&lt;/strong&gt; (String - with eSim mandatory otherwise optional) Serial No. Can&#39;t be greater than 23 or less than 18.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;PortMobileNo&lt;/strong&gt; (String - for portin mandatory otherwise optional)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Carrrier_Type&lt;/strong&gt; (Int - Mandatory) 97 for purple2 and 90 for red.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;TariffId&lt;/strong&gt; (Int - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Month&lt;/strong&gt; (Int - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Rental&lt;/strong&gt; (decimal - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;isWifi&lt;/strong&gt; (bool - Mandatory) True- with Wi-Fi and False- without Wi-Fi.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;TransactionId&lt;/strong&gt; (String - Mandatory) Starting from “BRI” for instant activation.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;ActivationOrPortin&lt;/strong&gt; (Int - Mandatory) 0 for Activation and 1 for Portin.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Customer_Details&lt;/strong&gt; (Object - Mandatory) &lt;ul&gt; &lt;li&gt;&lt;strong&gt;Firstname&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;LastName&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Email&lt;/strong&gt; (String - Optional)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Address&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;City&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;State&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Zip&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;contactNumber&lt;/strong&gt; (String - for portin mandatory otherwise optional) Port contact no can only be 10 digits.&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;
     * <p><b>200</b> - Successful
     * @param instantActivationRequest Add Activation (required)
     * @return ModelApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelApiResponse addMdn(InstantActivationRequest instantActivationRequest) throws RestClientException {
        return addMdnWithHttpInfo(instantActivationRequest).getBody();
    }

    /**
     * 
     * &lt;h1&gt;Description&lt;/h1&gt; &lt;h3&gt;The \&quot;Activate Mdn with eSim / physical sim\&quot; API activates new number for a customer using eSim or physical sim. The new number can be activated only after a  successful validation which checks if the IMEI is valid and compatible to eSim technology or not.&lt;h3&gt; &lt;h1&gt;Endpoints&lt;/h1&gt; &lt;h4&gt;/BoomInstantActivation&lt;/h4&gt; &lt;h1&gt;Request Type&lt;/h1&gt; &lt;h4&gt;Post&lt;/h4&gt; &lt;h2&gt;Parameters&lt;/h2&gt; &lt;ul&gt; &lt;li&gt;&lt;strong&gt;ClientCode&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;IMEI&lt;/strong&gt; (String - Mandatory) IMEI length Can&#39;t be greater than 16 and less than 14.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;SerialNumber&lt;/strong&gt; (String - with eSim mandatory otherwise optional) Serial No. Can&#39;t be greater than 23 or less than 18.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;PortMobileNo&lt;/strong&gt; (String - for portin mandatory otherwise optional)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Carrrier_Type&lt;/strong&gt; (Int - Mandatory) 97 for purple2 and 90 for red.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;TariffId&lt;/strong&gt; (Int - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Month&lt;/strong&gt; (Int - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Rental&lt;/strong&gt; (decimal - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;isWifi&lt;/strong&gt; (bool - Mandatory) True- with Wi-Fi and False- without Wi-Fi.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;TransactionId&lt;/strong&gt; (String - Mandatory) Starting from “BRI” for instant activation.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;ActivationOrPortin&lt;/strong&gt; (Int - Mandatory) 0 for Activation and 1 for Portin.&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Customer_Details&lt;/strong&gt; (Object - Mandatory) &lt;ul&gt; &lt;li&gt;&lt;strong&gt;Firstname&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;LastName&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Email&lt;/strong&gt; (String - Optional)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Address&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;City&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;State&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;Zip&lt;/strong&gt; (String - Mandatory)&lt;/li&gt; &lt;li&gt;&lt;strong&gt;contactNumber&lt;/strong&gt; (String - for portin mandatory otherwise optional) Port contact no can only be 10 digits.&lt;/li&gt; &lt;/ul&gt; &lt;/li&gt; &lt;/ul&gt;
     * <p><b>200</b> - Successful
     * @param instantActivationRequest Add Activation (required)
     * @return ResponseEntity&lt;ModelApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelApiResponse> addMdnWithHttpInfo(InstantActivationRequest instantActivationRequest) throws RestClientException {
        Object localVarPostBody = instantActivationRequest;
        
        // verify the required parameter 'instantActivationRequest' is set
        if (instantActivationRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'instantActivationRequest' when calling addMdn");
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
        return apiClient.invokeAPI("/BoomInstantActivation", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
