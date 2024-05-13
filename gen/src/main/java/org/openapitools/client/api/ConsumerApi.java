package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Consumer;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:25.962969645Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class ConsumerApi {
    private ApiClient apiClient;

    public ConsumerApi() {
        this(new ApiClient());
    }

    public ConsumerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a new consumer
     * 
     * <p><b>200</b> - Successful operation
     * @param consumer  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void consumerAddNewConsumerPost(Consumer consumer) throws RestClientException {
        consumerAddNewConsumerPostWithHttpInfo(consumer);
    }

    /**
     * Add a new consumer
     * 
     * <p><b>200</b> - Successful operation
     * @param consumer  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> consumerAddNewConsumerPostWithHttpInfo(Consumer consumer) throws RestClientException {
        Object localVarPostBody = consumer;
        
        // verify the required parameter 'consumer' is set
        if (consumer == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'consumer' when calling consumerAddNewConsumerPost");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/consumer/addNewConsumer", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get consumer by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param consumerID ID of the consumer to get (required)
     * @return Consumer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Consumer consumerConsumerIDGet(Integer consumerID) throws RestClientException {
        return consumerConsumerIDGetWithHttpInfo(consumerID).getBody();
    }

    /**
     * Get consumer by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param consumerID ID of the consumer to get (required)
     * @return ResponseEntity&lt;Consumer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Consumer> consumerConsumerIDGetWithHttpInfo(Integer consumerID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'consumerID' is set
        if (consumerID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'consumerID' when calling consumerConsumerIDGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("consumerID", consumerID);

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

        ParameterizedTypeReference<Consumer> localReturnType = new ParameterizedTypeReference<Consumer>() {};
        return apiClient.invokeAPI("/consumer/{consumerID}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Delete consumer by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param consumerID ID of the consumer to delete (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void consumerDeleteConsumerConsumerIDDelete(Integer consumerID) throws RestClientException {
        consumerDeleteConsumerConsumerIDDeleteWithHttpInfo(consumerID);
    }

    /**
     * Delete consumer by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param consumerID ID of the consumer to delete (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> consumerDeleteConsumerConsumerIDDeleteWithHttpInfo(Integer consumerID) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'consumerID' is set
        if (consumerID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'consumerID' when calling consumerDeleteConsumerConsumerIDDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("consumerID", consumerID);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/consumer/deleteConsumer/{consumerID}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all consumers
     * 
     * <p><b>200</b> - Successful operation
     * @return List&lt;Consumer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Consumer> consumerGetconsumersGet() throws RestClientException {
        return consumerGetconsumersGetWithHttpInfo().getBody();
    }

    /**
     * Get all consumers
     * 
     * <p><b>200</b> - Successful operation
     * @return ResponseEntity&lt;List&lt;Consumer&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Consumer>> consumerGetconsumersGetWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<List<Consumer>> localReturnType = new ParameterizedTypeReference<List<Consumer>>() {};
        return apiClient.invokeAPI("/consumer/getconsumers", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update consumer by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param consumerID ID of the consumer to update (required)
     * @param consumer  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void consumerUpdateConsumerConsumerIDPut(Integer consumerID, Consumer consumer) throws RestClientException {
        consumerUpdateConsumerConsumerIDPutWithHttpInfo(consumerID, consumer);
    }

    /**
     * Update consumer by ID
     * 
     * <p><b>200</b> - Successful operation
     * @param consumerID ID of the consumer to update (required)
     * @param consumer  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> consumerUpdateConsumerConsumerIDPutWithHttpInfo(Integer consumerID, Consumer consumer) throws RestClientException {
        Object localVarPostBody = consumer;
        
        // verify the required parameter 'consumerID' is set
        if (consumerID == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'consumerID' when calling consumerUpdateConsumerConsumerIDPut");
        }
        
        // verify the required parameter 'consumer' is set
        if (consumer == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'consumer' when calling consumerUpdateConsumerConsumerIDPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("consumerID", consumerID);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/consumer/updateConsumer/{consumerID}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
