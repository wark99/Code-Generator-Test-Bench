package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Cart;
import org.openapitools.client.model.CartDeleteRequest;
import org.openapitools.client.model.CartEdit200Response;
import org.openapitools.client.model.CartEditRequest;

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
public class CartApi {
    private ApiClient apiClient;

    public CartApi() {
        this(new ApiClient());
    }

    public CartApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Удалить товар из корзины
     * 
     * <p><b>200</b> - OK
     * <p><b>422</b>
     * @param cartDeleteRequest  (required)
     * @return CartEdit200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CartEdit200Response cartDelete(CartDeleteRequest cartDeleteRequest) throws RestClientException {
        return cartDeleteWithHttpInfo(cartDeleteRequest).getBody();
    }

    /**
     * Удалить товар из корзины
     * 
     * <p><b>200</b> - OK
     * <p><b>422</b>
     * @param cartDeleteRequest  (required)
     * @return ResponseEntity&lt;CartEdit200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CartEdit200Response> cartDeleteWithHttpInfo(CartDeleteRequest cartDeleteRequest) throws RestClientException {
        Object localVarPostBody = cartDeleteRequest;
        
        // verify the required parameter 'cartDeleteRequest' is set
        if (cartDeleteRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cartDeleteRequest' when calling cartDelete");
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

        ParameterizedTypeReference<CartEdit200Response> localReturnType = new ParameterizedTypeReference<CartEdit200Response>() {};
        return apiClient.invokeAPI("/api/cart", HttpMethod.DELETE, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Изменить корзину
     * 
     * <p><b>200</b> - OK
     * <p><b>422</b>
     * @param cartEditRequest  (required)
     * @return CartEdit200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CartEdit200Response cartEdit(CartEditRequest cartEditRequest) throws RestClientException {
        return cartEditWithHttpInfo(cartEditRequest).getBody();
    }

    /**
     * Изменить корзину
     * 
     * <p><b>200</b> - OK
     * <p><b>422</b>
     * @param cartEditRequest  (required)
     * @return ResponseEntity&lt;CartEdit200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CartEdit200Response> cartEditWithHttpInfo(CartEditRequest cartEditRequest) throws RestClientException {
        Object localVarPostBody = cartEditRequest;
        
        // verify the required parameter 'cartEditRequest' is set
        if (cartEditRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cartEditRequest' when calling cartEdit");
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

        ParameterizedTypeReference<CartEdit200Response> localReturnType = new ParameterizedTypeReference<CartEdit200Response>() {};
        return apiClient.invokeAPI("/api/cart", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Получить корзину
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param uuid UUID корзины (required)
     * @return Cart
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Cart cartGet(String uuid) throws RestClientException {
        return cartGetWithHttpInfo(uuid).getBody();
    }

    /**
     * Получить корзину
     * 
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param uuid UUID корзины (required)
     * @return ResponseEntity&lt;Cart&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Cart> cartGetWithHttpInfo(String uuid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'uuid' when calling cartGet");
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

        ParameterizedTypeReference<Cart> localReturnType = new ParameterizedTypeReference<Cart>() {};
        return apiClient.invokeAPI("/api/cart/{uuid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
