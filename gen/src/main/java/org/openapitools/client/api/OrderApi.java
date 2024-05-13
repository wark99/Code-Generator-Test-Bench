package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CartEdit200Response;
import org.openapitools.client.model.Order;
import org.openapitools.client.model.OrderMakeRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:26:45.886026141Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class OrderApi {
    private ApiClient apiClient;

    public OrderApi() {
        this(new ApiClient());
    }

    public OrderApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Получить заказ
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param uuid UUID заказа (required)
     * @return Order
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Order orderGet(String uuid) throws RestClientException {
        return orderGetWithHttpInfo(uuid).getBody();
    }

    /**
     * Получить заказ
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param uuid UUID заказа (required)
     * @return ResponseEntity&lt;Order&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Order> orderGetWithHttpInfo(String uuid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uuid' when calling orderGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("uuid", uuid);

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

        ParameterizedTypeReference<Order> localReturnType = new ParameterizedTypeReference<Order>() {};
        return apiClient.invokeAPI("/api/order/{uuid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Создать заказ
     * 
     * <p><b>200</b> - OK
     * <p><b>422</b>
     * @param orderMakeRequest  (required)
     * @return CartEdit200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CartEdit200Response orderMake(OrderMakeRequest orderMakeRequest) throws RestClientException {
        return orderMakeWithHttpInfo(orderMakeRequest).getBody();
    }

    /**
     * Создать заказ
     * 
     * <p><b>200</b> - OK
     * <p><b>422</b>
     * @param orderMakeRequest  (required)
     * @return ResponseEntity&lt;CartEdit200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CartEdit200Response> orderMakeWithHttpInfo(OrderMakeRequest orderMakeRequest) throws RestClientException {
        Object localVarPostBody = orderMakeRequest;
        
        // verify the required parameter 'orderMakeRequest' is set
        if (orderMakeRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderMakeRequest' when calling orderMake");
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<CartEdit200Response> localReturnType = new ParameterizedTypeReference<CartEdit200Response>() {};
        return apiClient.invokeAPI("/api/order", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Получить заказы пользователя
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b>
     * @return List&lt;Order&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Order> ordersGet() throws RestClientException {
        return ordersGetWithHttpInfo().getBody();
    }

    /**
     * Получить заказы пользователя
     * 
     * <p><b>200</b> - OK
     * <p><b>401</b>
     * @return ResponseEntity&lt;List&lt;Order&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Order>> ordersGetWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<List<Order>> localReturnType = new ParameterizedTypeReference<List<Order>>() {};
        return apiClient.invokeAPI("/api/order", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
