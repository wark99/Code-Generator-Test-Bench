package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.PublicApiV1EconomyMyBalanceGet400Response;
import org.openapitools.client.model.PublicApiV1TradeAcceptTradeidPost200Response;
import org.openapitools.client.model.PublicApiV1TradeAcceptTradeidPostRequest;
import org.openapitools.client.model.PublicApiV1TradeCreateRecipientUseridPost200Response;
import org.openapitools.client.model.PublicApiV1TradeCreateRecipientUseridPost400Response;
import org.openapitools.client.model.PublicApiV1TradeCreateRecipientUseridPostRequest;
import org.openapitools.client.model.PublicApiV1TradeListGet200Response;
import org.openapitools.client.model.PublicApiV1TradeTradeidGet200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:25:02.257670598Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class TradingApi {
    private ApiClient apiClient;

    public TradingApi() {
        this(new ApiClient());
    }

    public TradingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Accept Trade
     * Accept a trade with the specified trade ID.
     * <p><b>200</b> - Trade acceptance was successful
     * <p><b>400</b> - Bad request or error in trade acceptance
     * @param tradeid The ID of the trade. (required)
     * @param publicApiV1TradeAcceptTradeidPostRequest  (required)
     * @return PublicApiV1TradeAcceptTradeidPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PublicApiV1TradeAcceptTradeidPost200Response publicApiV1TradeAcceptTradeidPost(Integer tradeid, PublicApiV1TradeAcceptTradeidPostRequest publicApiV1TradeAcceptTradeidPostRequest) throws RestClientException {
        return publicApiV1TradeAcceptTradeidPostWithHttpInfo(tradeid, publicApiV1TradeAcceptTradeidPostRequest).getBody();
    }

    /**
     * Accept Trade
     * Accept a trade with the specified trade ID.
     * <p><b>200</b> - Trade acceptance was successful
     * <p><b>400</b> - Bad request or error in trade acceptance
     * @param tradeid The ID of the trade. (required)
     * @param publicApiV1TradeAcceptTradeidPostRequest  (required)
     * @return ResponseEntity&lt;PublicApiV1TradeAcceptTradeidPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PublicApiV1TradeAcceptTradeidPost200Response> publicApiV1TradeAcceptTradeidPostWithHttpInfo(Integer tradeid, PublicApiV1TradeAcceptTradeidPostRequest publicApiV1TradeAcceptTradeidPostRequest) throws RestClientException {
        Object localVarPostBody = publicApiV1TradeAcceptTradeidPostRequest;
        
        // verify the required parameter 'tradeid' is set
        if (tradeid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tradeid' when calling publicApiV1TradeAcceptTradeidPost");
        }
        
        // verify the required parameter 'publicApiV1TradeAcceptTradeidPostRequest' is set
        if (publicApiV1TradeAcceptTradeidPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'publicApiV1TradeAcceptTradeidPostRequest' when calling publicApiV1TradeAcceptTradeidPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tradeid", tradeid);

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

        ParameterizedTypeReference<PublicApiV1TradeAcceptTradeidPost200Response> localReturnType = new ParameterizedTypeReference<PublicApiV1TradeAcceptTradeidPost200Response>() {};
        return apiClient.invokeAPI("/public-api/v1/trade/accept/{tradeid}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Accept Trade
     * Accept a trade with the specified trade ID.
     * <p><b>200</b> - Trade acceptance was successful
     * <p><b>400</b> - Bad request or error in trade acceptance
     * @param tradeid The ID of the trade. (required)
     * @return PublicApiV1TradeAcceptTradeidPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PublicApiV1TradeAcceptTradeidPost200Response publicApiV1TradeCancelTradeidPost(Integer tradeid) throws RestClientException {
        return publicApiV1TradeCancelTradeidPostWithHttpInfo(tradeid).getBody();
    }

    /**
     * Accept Trade
     * Accept a trade with the specified trade ID.
     * <p><b>200</b> - Trade acceptance was successful
     * <p><b>400</b> - Bad request or error in trade acceptance
     * @param tradeid The ID of the trade. (required)
     * @return ResponseEntity&lt;PublicApiV1TradeAcceptTradeidPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PublicApiV1TradeAcceptTradeidPost200Response> publicApiV1TradeCancelTradeidPostWithHttpInfo(Integer tradeid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tradeid' is set
        if (tradeid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tradeid' when calling publicApiV1TradeCancelTradeidPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tradeid", tradeid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PublicApiV1TradeAcceptTradeidPost200Response> localReturnType = new ParameterizedTypeReference<PublicApiV1TradeAcceptTradeidPost200Response>() {};
        return apiClient.invokeAPI("/public-api/v1/trade/cancel/{tradeid}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Create Trade
     * Create a trade request with the specified recipient user.
     * <p><b>200</b> - Trade request was successful
     * <p><b>400</b> - Bad request or error in trade creation
     * @param recipientUserid The ID of the recipient user. (required)
     * @param publicApiV1TradeCreateRecipientUseridPostRequest  (required)
     * @return PublicApiV1TradeCreateRecipientUseridPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PublicApiV1TradeCreateRecipientUseridPost200Response publicApiV1TradeCreateRecipientUseridPost(Integer recipientUserid, PublicApiV1TradeCreateRecipientUseridPostRequest publicApiV1TradeCreateRecipientUseridPostRequest) throws RestClientException {
        return publicApiV1TradeCreateRecipientUseridPostWithHttpInfo(recipientUserid, publicApiV1TradeCreateRecipientUseridPostRequest).getBody();
    }

    /**
     * Create Trade
     * Create a trade request with the specified recipient user.
     * <p><b>200</b> - Trade request was successful
     * <p><b>400</b> - Bad request or error in trade creation
     * @param recipientUserid The ID of the recipient user. (required)
     * @param publicApiV1TradeCreateRecipientUseridPostRequest  (required)
     * @return ResponseEntity&lt;PublicApiV1TradeCreateRecipientUseridPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PublicApiV1TradeCreateRecipientUseridPost200Response> publicApiV1TradeCreateRecipientUseridPostWithHttpInfo(Integer recipientUserid, PublicApiV1TradeCreateRecipientUseridPostRequest publicApiV1TradeCreateRecipientUseridPostRequest) throws RestClientException {
        Object localVarPostBody = publicApiV1TradeCreateRecipientUseridPostRequest;
        
        // verify the required parameter 'recipientUserid' is set
        if (recipientUserid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipientUserid' when calling publicApiV1TradeCreateRecipientUseridPost");
        }
        
        // verify the required parameter 'publicApiV1TradeCreateRecipientUseridPostRequest' is set
        if (publicApiV1TradeCreateRecipientUseridPostRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'publicApiV1TradeCreateRecipientUseridPostRequest' when calling publicApiV1TradeCreateRecipientUseridPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("recipient_userid", recipientUserid);

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

        ParameterizedTypeReference<PublicApiV1TradeCreateRecipientUseridPost200Response> localReturnType = new ParameterizedTypeReference<PublicApiV1TradeCreateRecipientUseridPost200Response>() {};
        return apiClient.invokeAPI("/public-api/v1/trade/create/{recipient_userid}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Accept Trade
     * Accept a trade with the specified trade ID.
     * <p><b>200</b> - Trade acceptance was successful
     * <p><b>400</b> - Bad request or error in trade acceptance
     * @param tradeid The ID of the trade. (required)
     * @return PublicApiV1TradeAcceptTradeidPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PublicApiV1TradeAcceptTradeidPost200Response publicApiV1TradeDeclineTradeidPost(Integer tradeid) throws RestClientException {
        return publicApiV1TradeDeclineTradeidPostWithHttpInfo(tradeid).getBody();
    }

    /**
     * Accept Trade
     * Accept a trade with the specified trade ID.
     * <p><b>200</b> - Trade acceptance was successful
     * <p><b>400</b> - Bad request or error in trade acceptance
     * @param tradeid The ID of the trade. (required)
     * @return ResponseEntity&lt;PublicApiV1TradeAcceptTradeidPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PublicApiV1TradeAcceptTradeidPost200Response> publicApiV1TradeDeclineTradeidPostWithHttpInfo(Integer tradeid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tradeid' is set
        if (tradeid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tradeid' when calling publicApiV1TradeDeclineTradeidPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tradeid", tradeid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PublicApiV1TradeAcceptTradeidPost200Response> localReturnType = new ParameterizedTypeReference<PublicApiV1TradeAcceptTradeidPost200Response>() {};
        return apiClient.invokeAPI("/public-api/v1/trade/decline/{tradeid}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List Trades
     * List trades for the authenticated user.
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Not Logged In
     * @return PublicApiV1TradeListGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PublicApiV1TradeListGet200Response publicApiV1TradeListGet() throws RestClientException {
        return publicApiV1TradeListGetWithHttpInfo().getBody();
    }

    /**
     * List Trades
     * List trades for the authenticated user.
     * <p><b>200</b> - Successful operation
     * <p><b>400</b> - Not Logged In
     * @return ResponseEntity&lt;PublicApiV1TradeListGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PublicApiV1TradeListGet200Response> publicApiV1TradeListGetWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PublicApiV1TradeListGet200Response> localReturnType = new ParameterizedTypeReference<PublicApiV1TradeListGet200Response>() {};
        return apiClient.invokeAPI("/public-api/v1/trade/list", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Trade by ID
     * Retrieve trade information by trade ID.
     * <p><b>200</b> - Successful operation
     * @param tradeid The ID of the trade. (required)
     * @return PublicApiV1TradeTradeidGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PublicApiV1TradeTradeidGet200Response publicApiV1TradeTradeidGet(Integer tradeid) throws RestClientException {
        return publicApiV1TradeTradeidGetWithHttpInfo(tradeid).getBody();
    }

    /**
     * Get Trade by ID
     * Retrieve trade information by trade ID.
     * <p><b>200</b> - Successful operation
     * @param tradeid The ID of the trade. (required)
     * @return ResponseEntity&lt;PublicApiV1TradeTradeidGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PublicApiV1TradeTradeidGet200Response> publicApiV1TradeTradeidGetWithHttpInfo(Integer tradeid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tradeid' is set
        if (tradeid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tradeid' when calling publicApiV1TradeTradeidGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tradeid", tradeid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PublicApiV1TradeTradeidGet200Response> localReturnType = new ParameterizedTypeReference<PublicApiV1TradeTradeidGet200Response>() {};
        return apiClient.invokeAPI("/public-api/v1/trade/{tradeid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
