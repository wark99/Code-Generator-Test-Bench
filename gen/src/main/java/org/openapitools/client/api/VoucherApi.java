package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.IssueVouchers200Response;
import org.openapitools.client.model.IssueVouchersRequest;
import org.openapitools.client.model.RetrieveVoucher200Response;
import org.openapitools.client.model.RetrieveVouchers200Response;
import java.util.UUID;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:20:16.719976364Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class VoucherApi {
    private ApiClient apiClient;

    public VoucherApi() {
        this(new ApiClient());
    }

    public VoucherApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Issue vouchers
     * Issue vouchers from the requested product identified by its code specified in the path.
     * <p><b>200</b> - OK
     * <p><b>500</b>
     * @param idempotencyKey The idempotency key in UUID v4 format to ensure issuing vouchers is idempotent. (required)
     * @param code The product code of the product object to be retrieved. (required)
     * @param issueVouchersRequest Request parameters required to issue vouchers. (optional)
     * @return IssueVouchers200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IssueVouchers200Response issueVouchers(UUID idempotencyKey, String code, IssueVouchersRequest issueVouchersRequest) throws RestClientException {
        return issueVouchersWithHttpInfo(idempotencyKey, code, issueVouchersRequest).getBody();
    }

    /**
     * Issue vouchers
     * Issue vouchers from the requested product identified by its code specified in the path.
     * <p><b>200</b> - OK
     * <p><b>500</b>
     * @param idempotencyKey The idempotency key in UUID v4 format to ensure issuing vouchers is idempotent. (required)
     * @param code The product code of the product object to be retrieved. (required)
     * @param issueVouchersRequest Request parameters required to issue vouchers. (optional)
     * @return ResponseEntity&lt;IssueVouchers200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IssueVouchers200Response> issueVouchersWithHttpInfo(UUID idempotencyKey, String code, IssueVouchersRequest issueVouchersRequest) throws RestClientException {
        Object localVarPostBody = issueVouchersRequest;
        
        // verify the required parameter 'idempotencyKey' is set
        if (idempotencyKey == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idempotencyKey' when calling issueVouchers");
        }
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'code' when calling issueVouchers");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("code", code);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (idempotencyKey != null)
        localVarHeaderParams.add("Idempotency-Key", apiClient.parameterToString(idempotencyKey));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<IssueVouchers200Response> localReturnType = new ParameterizedTypeReference<IssueVouchers200Response>() {};
        return apiClient.invokeAPI("/products/{code}", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve vouchers information
     * Retrieve the information and updated status of 1 voucher.
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param id The id of the voucher to be retrieved. (required)
     * @return RetrieveVoucher200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RetrieveVoucher200Response retrieveVoucher(UUID id) throws RestClientException {
        return retrieveVoucherWithHttpInfo(id).getBody();
    }

    /**
     * Retrieve vouchers information
     * Retrieve the information and updated status of 1 voucher.
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param id The id of the voucher to be retrieved. (required)
     * @return ResponseEntity&lt;RetrieveVoucher200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RetrieveVoucher200Response> retrieveVoucherWithHttpInfo(UUID id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling retrieveVoucher");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<RetrieveVoucher200Response> localReturnType = new ParameterizedTypeReference<RetrieveVoucher200Response>() {};
        return apiClient.invokeAPI("/vouchers/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve multiple vouchers information
     * Retrieve the details of multiple vouchers in a single request.
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param id  (required)
     * @return RetrieveVouchers200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RetrieveVouchers200Response retrieveVouchers(List<Object> id) throws RestClientException {
        return retrieveVouchersWithHttpInfo(id).getBody();
    }

    /**
     * Retrieve multiple vouchers information
     * Retrieve the details of multiple vouchers in a single request.
     * <p><b>200</b> - OK
     * <p><b>404</b>
     * @param id  (required)
     * @return ResponseEntity&lt;RetrieveVouchers200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RetrieveVouchers200Response> retrieveVouchersWithHttpInfo(List<Object> id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling retrieveVouchers");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "id", id));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<RetrieveVouchers200Response> localReturnType = new ParameterizedTypeReference<RetrieveVouchers200Response>() {};
        return apiClient.invokeAPI("/vouchers", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
