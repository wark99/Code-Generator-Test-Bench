package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CommunicationChannel;
import org.openapitools.client.model.CustomerChannel;

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
public class ChannelsApi {
    private ApiClient apiClient;

    public ChannelsApi() {
        this(new ApiClient());
    }

    public ChannelsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Добавление нового канала коммуникации
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param communicationChannel Данные нового канала (optional)
     * @return CommunicationChannel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommunicationChannel addChannel(CommunicationChannel communicationChannel) throws RestClientException {
        return addChannelWithHttpInfo(communicationChannel).getBody();
    }

    /**
     * Добавление нового канала коммуникации
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param communicationChannel Данные нового канала (optional)
     * @return ResponseEntity&lt;CommunicationChannel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommunicationChannel> addChannelWithHttpInfo(CommunicationChannel communicationChannel) throws RestClientException {
        Object localVarPostBody = communicationChannel;
        

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

        ParameterizedTypeReference<CommunicationChannel> localReturnType = new ParameterizedTypeReference<CommunicationChannel>() {};
        return apiClient.invokeAPI("/channels", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Добавление нового канала коммуникации для клиента
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param customerChannel Данные нового канала (optional)
     * @return CustomerChannel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerChannel addCustomerChannel(String customerUuid, CustomerChannel customerChannel) throws RestClientException {
        return addCustomerChannelWithHttpInfo(customerUuid, customerChannel).getBody();
    }

    /**
     * Добавление нового канала коммуникации для клиента
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param customerChannel Данные нового канала (optional)
     * @return ResponseEntity&lt;CustomerChannel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerChannel> addCustomerChannelWithHttpInfo(String customerUuid, CustomerChannel customerChannel) throws RestClientException {
        Object localVarPostBody = customerChannel;
        
        // verify the required parameter 'customerUuid' is set
        if (customerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerUuid' when calling addCustomerChannel");
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

        ParameterizedTypeReference<CustomerChannel> localReturnType = new ParameterizedTypeReference<CustomerChannel>() {};
        return apiClient.invokeAPI("/customers/{customerUuid}/channels", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Удаление всех каналов коммуникации одного клиента
     * 
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteAllCustomerChannels(String customerUuid) throws RestClientException {
        deleteAllCustomerChannelsWithHttpInfo(customerUuid);
    }

    /**
     * Удаление всех каналов коммуникации одного клиента
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
    public ResponseEntity<Void> deleteAllCustomerChannelsWithHttpInfo(String customerUuid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerUuid' is set
        if (customerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerUuid' when calling deleteAllCustomerChannels");
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
        return apiClient.invokeAPI("/customers/{customerUuid}/channels", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Удаление канала коммуникации
     * 
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param channelId Идентификатор канала (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteChannel(Long channelId) throws RestClientException {
        deleteChannelWithHttpInfo(channelId);
    }

    /**
     * Удаление канала коммуникации
     * 
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param channelId Идентификатор канала (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteChannelWithHttpInfo(Long channelId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling deleteChannel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channelId", channelId);

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
        return apiClient.invokeAPI("/channels/{channelId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Удаление канала коммуникации для клиента
     * 
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param channelId Идентификатор канала (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCustomerChannel(String customerUuid, Long channelId) throws RestClientException {
        deleteCustomerChannelWithHttpInfo(customerUuid, channelId);
    }

    /**
     * Удаление канала коммуникации для клиента
     * 
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param channelId Идентификатор канала (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCustomerChannelWithHttpInfo(String customerUuid, Long channelId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerUuid' is set
        if (customerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerUuid' when calling deleteCustomerChannel");
        }
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling deleteCustomerChannel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerUuid", customerUuid);
        uriVariables.put("channelId", channelId);

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
        return apiClient.invokeAPI("/customers/{customerUuid}/channels/{channelId}", HttpMethod.DELETE, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Список каналов коммуникации, поддерживаемый сервисом
     * email, SMS, Push-уведомления и т.д.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>5XX</b> - Unexpected server error
     * @return List&lt;CommunicationChannel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CommunicationChannel> getChannels() throws RestClientException {
        return getChannelsWithHttpInfo().getBody();
    }

    /**
     * Список каналов коммуникации, поддерживаемый сервисом
     * email, SMS, Push-уведомления и т.д.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>5XX</b> - Unexpected server error
     * @return ResponseEntity&lt;List&lt;CommunicationChannel&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CommunicationChannel>> getChannelsWithHttpInfo() throws RestClientException {
        Object localVarPostBody = null;
        

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

        ParameterizedTypeReference<List<CommunicationChannel>> localReturnType = new ParameterizedTypeReference<List<CommunicationChannel>>() {};
        return apiClient.invokeAPI("/channels", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Список всех каналов коммуникации одного клиента
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @return List&lt;CustomerChannel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CustomerChannel> getCustomerChannels(String customerUuid) throws RestClientException {
        return getCustomerChannelsWithHttpInfo(customerUuid).getBody();
    }

    /**
     * Список всех каналов коммуникации одного клиента
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @return ResponseEntity&lt;List&lt;CustomerChannel&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CustomerChannel>> getCustomerChannelsWithHttpInfo(String customerUuid) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerUuid' is set
        if (customerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerUuid' when calling getCustomerChannels");
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

        ParameterizedTypeReference<List<CustomerChannel>> localReturnType = new ParameterizedTypeReference<List<CustomerChannel>>() {};
        return apiClient.invokeAPI("/customers/{customerUuid}/channels", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Обновление канала коммуникации
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param channelId Идентификатор канала (required)
     * @param communicationChannel Данные канала (optional)
     * @return CommunicationChannel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommunicationChannel updateChannel(Long channelId, CommunicationChannel communicationChannel) throws RestClientException {
        return updateChannelWithHttpInfo(channelId, communicationChannel).getBody();
    }

    /**
     * Обновление канала коммуникации
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param channelId Идентификатор канала (required)
     * @param communicationChannel Данные канала (optional)
     * @return ResponseEntity&lt;CommunicationChannel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommunicationChannel> updateChannelWithHttpInfo(Long channelId, CommunicationChannel communicationChannel) throws RestClientException {
        Object localVarPostBody = communicationChannel;
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling updateChannel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("channelId", channelId);

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

        ParameterizedTypeReference<CommunicationChannel> localReturnType = new ParameterizedTypeReference<CommunicationChannel>() {};
        return apiClient.invokeAPI("/channels/{channelId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Обновление канала коммуникации для клиента
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param channelId Идентификатор канала (required)
     * @param customerChannel Данные канала (optional)
     * @return CustomerChannel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CustomerChannel updateCustomerChannel(String customerUuid, Long channelId, CustomerChannel customerChannel) throws RestClientException {
        return updateCustomerChannelWithHttpInfo(customerUuid, channelId, customerChannel).getBody();
    }

    /**
     * Обновление канала коммуникации для клиента
     * 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * <p><b>404</b> - Not Found
     * <p><b>5XX</b> - Unexpected server error
     * @param customerUuid Идентификатор клиента (required)
     * @param channelId Идентификатор канала (required)
     * @param customerChannel Данные канала (optional)
     * @return ResponseEntity&lt;CustomerChannel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CustomerChannel> updateCustomerChannelWithHttpInfo(String customerUuid, Long channelId, CustomerChannel customerChannel) throws RestClientException {
        Object localVarPostBody = customerChannel;
        
        // verify the required parameter 'customerUuid' is set
        if (customerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerUuid' when calling updateCustomerChannel");
        }
        
        // verify the required parameter 'channelId' is set
        if (channelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'channelId' when calling updateCustomerChannel");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customerUuid", customerUuid);
        uriVariables.put("channelId", channelId);

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

        ParameterizedTypeReference<CustomerChannel> localReturnType = new ParameterizedTypeReference<CustomerChannel>() {};
        return apiClient.invokeAPI("/customers/{customerUuid}/channels/{channelId}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
