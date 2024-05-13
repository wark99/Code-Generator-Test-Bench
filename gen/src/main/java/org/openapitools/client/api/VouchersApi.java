package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.PostVoucher200Response;
import org.openapitools.client.model.PostVoucherCheck200Response;
import org.openapitools.client.model.PostVoucherCheckRequest;
import org.openapitools.client.model.PostVoucherRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:35.686627593Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class VouchersApi {
    private ApiClient apiClient;

    public VouchersApi() {
        this(new ApiClient());
    }

    public VouchersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a voucher
     * Create a new voucher.
     * <p><b>200</b> - Voucher created.
     * @param postVoucherRequest Creates a new voucher. (optional)
     * @return PostVoucher200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostVoucher200Response postVoucher(PostVoucherRequest postVoucherRequest) throws RestClientException {
        return postVoucherWithHttpInfo(postVoucherRequest).getBody();
    }

    /**
     * Create a voucher
     * Create a new voucher.
     * <p><b>200</b> - Voucher created.
     * @param postVoucherRequest Creates a new voucher. (optional)
     * @return ResponseEntity&lt;PostVoucher200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostVoucher200Response> postVoucherWithHttpInfo(PostVoucherRequest postVoucherRequest) throws RestClientException {
        Object localVarPostBody = postVoucherRequest;
        

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<PostVoucher200Response> localReturnType = new ParameterizedTypeReference<PostVoucher200Response>() {};
        return apiClient.invokeAPI("/vouchers", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Check a voucher
     * Check a voucher code.
     * <p><b>200</b> - Returns a message relating to the status of the voucher.
     * @param postVoucherCheckRequest Checks a voucher code exists. (optional)
     * @return PostVoucherCheck200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PostVoucherCheck200Response postVoucherCheck(PostVoucherCheckRequest postVoucherCheckRequest) throws RestClientException {
        return postVoucherCheckWithHttpInfo(postVoucherCheckRequest).getBody();
    }

    /**
     * Check a voucher
     * Check a voucher code.
     * <p><b>200</b> - Returns a message relating to the status of the voucher.
     * @param postVoucherCheckRequest Checks a voucher code exists. (optional)
     * @return ResponseEntity&lt;PostVoucherCheck200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PostVoucherCheck200Response> postVoucherCheckWithHttpInfo(PostVoucherCheckRequest postVoucherCheckRequest) throws RestClientException {
        Object localVarPostBody = postVoucherCheckRequest;
        

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

        String[] localVarAuthNames = new String[] { "Authorization" };

        ParameterizedTypeReference<PostVoucherCheck200Response> localReturnType = new ParameterizedTypeReference<PostVoucherCheck200Response>() {};
        return apiClient.invokeAPI("/vouchers/check", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
