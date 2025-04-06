package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Consumer;
import org.openapitools.client.model.ConsumerUpdate;
import org.openapitools.client.model.CreatedConsumer;
import org.openapitools.client.model.ErrorMessage;
import org.openapitools.client.model.NewConsumer;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T13:21:08.417587988Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConsumersApi {
    private ApiClient apiClient;

    public ConsumersApi() {
        this(new ApiClient());
    }

    public ConsumersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create consumer for the customer
     * Create a consumer record associated with the given customer. A consumer persists as the owner of any reports that are generated, even after the original customer is deleted from the system.  A consumer must be created for the given customer before calling any of the Generate Report services.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>201</b> - The consumer was successfully created
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * <p><b>409</b> - The resource already exists
     * @param customerId A customer ID (required)
     * @param newConsumer  (required)
     * @return CreatedConsumer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CreatedConsumer createConsumer(String customerId, NewConsumer newConsumer) throws RestClientException {
        return createConsumerWithHttpInfo(customerId, newConsumer).getBody();
    }

    /**
     * Create consumer for the customer
     * Create a consumer record associated with the given customer. A consumer persists as the owner of any reports that are generated, even after the original customer is deleted from the system.  A consumer must be created for the given customer before calling any of the Generate Report services.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>201</b> - The consumer was successfully created
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * <p><b>409</b> - The resource already exists
     * @param customerId A customer ID (required)
     * @param newConsumer  (required)
     * @return ResponseEntity&lt;CreatedConsumer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CreatedConsumer> createConsumerWithHttpInfo(String customerId, NewConsumer newConsumer) throws RestClientException {
        Object localVarPostBody = newConsumer;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling createConsumer");
        }
        
        // verify the required parameter 'newConsumer' is set
        if (newConsumer == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'newConsumer' when calling createConsumer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<CreatedConsumer> localReturnType = new ParameterizedTypeReference<CreatedConsumer>() {};
        return apiClient.invokeAPI("/decisioning/v1/customers/{customerId}/consumer", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Consumer by ID
     * Get the details of a consumer record by consumer ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The consumer was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param consumerId The consumer ID (required)
     * @return Consumer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Consumer getConsumer(String consumerId) throws RestClientException {
        return getConsumerWithHttpInfo(consumerId).getBody();
    }

    /**
     * Get Consumer by ID
     * Get the details of a consumer record by consumer ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The consumer was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param consumerId The consumer ID (required)
     * @return ResponseEntity&lt;Consumer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Consumer> getConsumerWithHttpInfo(String consumerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'consumerId' is set
        if (consumerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'consumerId' when calling getConsumer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("consumerId", consumerId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<Consumer> localReturnType = new ParameterizedTypeReference<Consumer>() {};
        return apiClient.invokeAPI("/decisioning/v1/consumers/{consumerId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get the consumer record for the given customer.
     * Get the details of a consumer record by customer ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The consumer was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @return Consumer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Consumer getConsumerForCustomer(String customerId) throws RestClientException {
        return getConsumerForCustomerWithHttpInfo(customerId).getBody();
    }

    /**
     * Get the consumer record for the given customer.
     * Get the details of a consumer record by customer ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The consumer was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param customerId A customer ID (required)
     * @return ResponseEntity&lt;Consumer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Consumer> getConsumerForCustomerWithHttpInfo(String customerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getConsumerForCustomer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerId", customerId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<Consumer> localReturnType = new ParameterizedTypeReference<Consumer>() {};
        return apiClient.invokeAPI("/decisioning/v1/customers/{customerId}/consumer", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Modify Consumer by ID
     * Modify an existing consumer. All fields are required for a consumer record, but individual fields for this call are optional because fields that are not specified will be left unchanged.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>204</b> - The consumer was successfully updated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param consumerId The consumer ID (required)
     * @param consumerUpdate  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void modifyConsumer(String consumerId, ConsumerUpdate consumerUpdate) throws RestClientException {
        modifyConsumerWithHttpInfo(consumerId, consumerUpdate);
    }

    /**
     * Modify Consumer by ID
     * Modify an existing consumer. All fields are required for a consumer record, but individual fields for this call are optional because fields that are not specified will be left unchanged.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>204</b> - The consumer was successfully updated
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param consumerId The consumer ID (required)
     * @param consumerUpdate  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> modifyConsumerWithHttpInfo(String consumerId, ConsumerUpdate consumerUpdate) throws RestClientException {
        Object localVarPostBody = consumerUpdate;
        
        // verify the required parameter 'consumerId' is set
        if (consumerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'consumerId' when calling modifyConsumer");
        }
        
        // verify the required parameter 'consumerUpdate' is set
        if (consumerUpdate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'consumerUpdate' when calling modifyConsumer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("consumerId", consumerId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/decisioning/v1/consumers/{consumerId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
