package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Customer;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:58.322050771Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CustomersApi {
    private ApiClient apiClient;

    public CustomersApi() {
        this(new ApiClient());
    }

    public CustomersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Добавление нового клиента
     * 
     * <p><b>200</b> - OK
     * @param customer Данные нового клиента (optional)
     * @return Customer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Customer addCustomer(Customer customer) throws RestClientException {
        return addCustomerWithHttpInfo(customer).getBody();
    }

    /**
     * Добавление нового клиента
     * 
     * <p><b>200</b> - OK
     * @param customer Данные нового клиента (optional)
     * @return ResponseEntity&lt;Customer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Customer> addCustomerWithHttpInfo(Customer customer) throws RestClientException {
        Object localVarPostBody = customer;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Customer> localReturnType = new ParameterizedTypeReference<Customer>() {};
        return apiClient.invokeAPI("/customers", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Удаление клиента
     * 
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCustomer(String customerUuid) throws RestClientException {
        deleteCustomerWithHttpInfo(customerUuid);
    }

    /**
     * Удаление клиента
     * 
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCustomerWithHttpInfo(String customerUuid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerUuid' is set
        if (customerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerUuid' when calling deleteCustomer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerUuid", customerUuid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/customers/{customerUuid}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Информация о клиенте
     * Информация о клиенте по его идентификатору
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @return Customer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Customer getCustomer(String customerUuid) throws RestClientException {
        return getCustomerWithHttpInfo(customerUuid).getBody();
    }

    /**
     * Информация о клиенте
     * Информация о клиенте по его идентификатору
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @return ResponseEntity&lt;Customer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Customer> getCustomerWithHttpInfo(String customerUuid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerUuid' is set
        if (customerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerUuid' when calling getCustomer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerUuid", customerUuid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Customer> localReturnType = new ParameterizedTypeReference<Customer>() {};
        return apiClient.invokeAPI("/customers/{customerUuid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Список клиентов компании
     * 
     * <p><b>200</b> - OK
     * @param page Номер страницы (начиная с 1) (optional)
     * @param size Размер страницы (optional)
     * @return List&lt;Customer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Customer> getCustomers(Integer page, Integer size) throws RestClientException {
        return getCustomersWithHttpInfo(page, size).getBody();
    }

    /**
     * Список клиентов компании
     * 
     * <p><b>200</b> - OK
     * @param page Номер страницы (начиная с 1) (optional)
     * @param size Размер страницы (optional)
     * @return ResponseEntity&lt;List&lt;Customer&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Customer>> getCustomersWithHttpInfo(Integer page, Integer size) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<List<Customer>> localReturnType = new ParameterizedTypeReference<List<Customer>>() {};
        return apiClient.invokeAPI("/customers", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Обновление информации о клиенте
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param customer Данные клиента (optional)
     * @return Customer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Customer updateCustomer(String customerUuid, Customer customer) throws RestClientException {
        return updateCustomerWithHttpInfo(customerUuid, customer).getBody();
    }

    /**
     * Обновление информации о клиенте
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param customer Данные клиента (optional)
     * @return ResponseEntity&lt;Customer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Customer> updateCustomerWithHttpInfo(String customerUuid, Customer customer) throws RestClientException {
        Object localVarPostBody = customer;
        
        // verify the required parameter 'customerUuid' is set
        if (customerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerUuid' when calling updateCustomer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerUuid", customerUuid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "application/xml"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json", "application/xml"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Customer> localReturnType = new ParameterizedTypeReference<Customer>() {};
        return apiClient.invokeAPI("/customers/{customerUuid}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
