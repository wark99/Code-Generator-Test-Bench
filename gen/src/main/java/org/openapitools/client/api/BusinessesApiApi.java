package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Business;
import org.openapitools.client.model.ErrorMessage;
import org.openapitools.client.model.NewBusiness;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T13:12:42.105719365Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BusinessesApiApi {
    private ApiClient apiClient;

    public BusinessesApiApi() {
        this(new ApiClient());
    }

    public BusinessesApiApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a New Business for a Customer
     * Create a new business record for the associated customer. A customer can have one business record associated.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The business was successfully created.
     * <p><b>404</b> - The customer does not exist
     * <p><b>409</b> - The resource already exists
     * @param customerId Unique identifier of the customer (required)
     * @param newBusiness  (required)
     * @return Business
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Business addBusinessDetails(String customerId, NewBusiness newBusiness) throws RestClientException {
        return addBusinessDetailsWithHttpInfo(customerId, newBusiness).getBody();
    }

    /**
     * Create a New Business for a Customer
     * Create a new business record for the associated customer. A customer can have one business record associated.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The business was successfully created.
     * <p><b>404</b> - The customer does not exist
     * <p><b>409</b> - The resource already exists
     * @param customerId Unique identifier of the customer (required)
     * @param newBusiness  (required)
     * @return ResponseEntity&lt;Business&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Business> addBusinessDetailsWithHttpInfo(String customerId, NewBusiness newBusiness) throws RestClientException {
        Object localVarPostBody = newBusiness;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling addBusinessDetails");
        }
        
        // verify the required parameter 'newBusiness' is set
        if (newBusiness == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'newBusiness' when calling addBusinessDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customer_id", customerId);

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

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<Business> localReturnType = new ParameterizedTypeReference<Business>() {};
        return apiClient.invokeAPI("/business-services/customers/{customer_id}/businesses", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Business for Customer
     * Retrieve business details associated with a specific customer. By providing the unique customer identifier, details about the associated business can be accessed.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The business information was successfully retrieved.
     * <p><b>404</b> - The customer does not exist
     * @param customerId Unique identifier of the customer (required)
     * @return List&lt;Business&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Business> getBusinessByCustomer(String customerId) throws RestClientException {
        return getBusinessByCustomerWithHttpInfo(customerId).getBody();
    }

    /**
     * Get Business for Customer
     * Retrieve business details associated with a specific customer. By providing the unique customer identifier, details about the associated business can be accessed.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The business information was successfully retrieved.
     * <p><b>404</b> - The customer does not exist
     * @param customerId Unique identifier of the customer (required)
     * @return ResponseEntity&lt;List&lt;Business&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Business>> getBusinessByCustomerWithHttpInfo(String customerId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling getBusinessByCustomer");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customer_id", customerId);

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

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<List<Business>> localReturnType = new ParameterizedTypeReference<List<Business>>() {};
        return apiClient.invokeAPI("/business-services/customers/{customer_id}/businesses", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Business by ID
     * Retrieve business details.  _Supported regions_: ![\\U0001F1FA\\U0001F1F8](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The business information was successfully retrieved.
     * <p><b>404</b> - The business does not exist
     * @param businessId Unique identifier of the business (required)
     * @return List&lt;Business&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Business> getBusinessById(String businessId) throws RestClientException {
        return getBusinessByIdWithHttpInfo(businessId).getBody();
    }

    /**
     * Get Business by ID
     * Retrieve business details.  _Supported regions_: ![\\U0001F1FA\\U0001F1F8](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The business information was successfully retrieved.
     * <p><b>404</b> - The business does not exist
     * @param businessId Unique identifier of the business (required)
     * @return ResponseEntity&lt;List&lt;Business&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Business>> getBusinessByIdWithHttpInfo(String businessId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'businessId' is set
        if (businessId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessId' when calling getBusinessById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("business_id", businessId);

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

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<List<Business>> localReturnType = new ParameterizedTypeReference<List<Business>>() {};
        return apiClient.invokeAPI("/business-services/businesses/{business_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update Business by ID
     * Update the details of a business based on its unique identifier. By providing the specific business ID and the updated information in the request, modifications can be made to the business&#39;s profile.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The business information was updated.
     * <p><b>404</b> - The business does not exist
     * @param businessId Unique identifier of the business (required)
     * @param newBusiness  (required)
     * @return Business
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Business updateBusiness(String businessId, NewBusiness newBusiness) throws RestClientException {
        return updateBusinessWithHttpInfo(businessId, newBusiness).getBody();
    }

    /**
     * Update Business by ID
     * Update the details of a business based on its unique identifier. By providing the specific business ID and the updated information in the request, modifications can be made to the business&#39;s profile.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - The business information was updated.
     * <p><b>404</b> - The business does not exist
     * @param businessId Unique identifier of the business (required)
     * @param newBusiness  (required)
     * @return ResponseEntity&lt;Business&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Business> updateBusinessWithHttpInfo(String businessId, NewBusiness newBusiness) throws RestClientException {
        Object localVarPostBody = newBusiness;
        
        // verify the required parameter 'businessId' is set
        if (businessId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'businessId' when calling updateBusiness");
        }
        
        // verify the required parameter 'newBusiness' is set
        if (newBusiness == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'newBusiness' when calling updateBusiness");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("business_id", businessId);

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

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<Business> localReturnType = new ParameterizedTypeReference<Business>() {};
        return apiClient.invokeAPI("/business-services/businesses/{business_id}", HttpMethod.PUT, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
