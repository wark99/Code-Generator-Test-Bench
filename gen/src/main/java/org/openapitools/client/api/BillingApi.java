package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1SwissBackupsCalculateGet200Response;
import org.openapitools.client.model.Model1SwissBackupsPricingGet200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:18:35.261242100Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class BillingApi {
    private ApiClient apiClient;

    public BillingApi() {
        this(new ApiClient());
    }

    public BillingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Calculate the price
     * Calculate the price for a specific configuration
     * <p><b>200</b> - OK
     * @param size  (required)
     * @param currencyId  (optional)
     * @param dueAt  (optional)
     * @param isDemo  (optional)
     * @param slot  (optional)
     * @param slotMobile  (optional)
     * @param slotServer  (optional)
     * @param slotVirtual  (optional)
     * @param slotWorkstation  (optional)
     * @return Model1SwissBackupsCalculateGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsCalculateGet200Response call1swissBackupsCalculateGet(Integer size, Integer currencyId, String dueAt, Boolean isDemo, Integer slot, Integer slotMobile, Integer slotServer, Integer slotVirtual, Integer slotWorkstation) throws RestClientException {
        return call1swissBackupsCalculateGetWithHttpInfo(size, currencyId, dueAt, isDemo, slot, slotMobile, slotServer, slotVirtual, slotWorkstation).getBody();
    }

    /**
     * Calculate the price
     * Calculate the price for a specific configuration
     * <p><b>200</b> - OK
     * @param size  (required)
     * @param currencyId  (optional)
     * @param dueAt  (optional)
     * @param isDemo  (optional)
     * @param slot  (optional)
     * @param slotMobile  (optional)
     * @param slotServer  (optional)
     * @param slotVirtual  (optional)
     * @param slotWorkstation  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsCalculateGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsCalculateGet200Response> call1swissBackupsCalculateGetWithHttpInfo(Integer size, Integer currencyId, String dueAt, Boolean isDemo, Integer slot, Integer slotMobile, Integer slotServer, Integer slotVirtual, Integer slotWorkstation) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'size' is set
        if (size == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'size' when calling call1swissBackupsCalculateGet");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency_id", currencyId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "due_at", dueAt));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "is_demo", isDemo));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "size", size));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "slot", slot));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "slot_mobile", slotMobile));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "slot_server", slotServer));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "slot_virtual", slotVirtual));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "slot_workstation", slotWorkstation));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1SwissBackupsCalculateGet200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsCalculateGet200Response>() {};
        return apiClient.invokeAPI("/1/swiss_backups/calculate", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List prices and discounts
     * List all prices and discounts for Swiss Backup products
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param accountId The account identifier (optional)
     * @param currencyId  (optional)
     * @param swissBackupId  (optional)
     * @param withRenewal  (optional)
     * @return Model1SwissBackupsPricingGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1SwissBackupsPricingGet200Response call1swissBackupsPricingGet(Integer accountId, Integer currencyId, Integer swissBackupId, Boolean withRenewal) throws RestClientException {
        return call1swissBackupsPricingGetWithHttpInfo(accountId, currencyId, swissBackupId, withRenewal).getBody();
    }

    /**
     * List prices and discounts
     * List all prices and discounts for Swiss Backup products
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param accountId The account identifier (optional)
     * @param currencyId  (optional)
     * @param swissBackupId  (optional)
     * @param withRenewal  (optional)
     * @return ResponseEntity&lt;Model1SwissBackupsPricingGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1SwissBackupsPricingGet200Response> call1swissBackupsPricingGetWithHttpInfo(Integer accountId, Integer currencyId, Integer swissBackupId, Boolean withRenewal) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "account_id", accountId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "currency_id", currencyId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "swiss_backup_id", swissBackupId));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "with_renewal", withRenewal));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1SwissBackupsPricingGet200Response> localReturnType = new ParameterizedTypeReference<Model1SwissBackupsPricingGet200Response>() {};
        return apiClient.invokeAPI("/1/swiss_backups/pricing", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
