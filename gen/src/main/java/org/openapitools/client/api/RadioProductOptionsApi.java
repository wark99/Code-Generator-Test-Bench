package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1RadiosRadioProductIdOptionsGet200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;

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
public class RadioProductOptionsApi {
    private ApiClient apiClient;

    public RadioProductOptionsApi() {
        this(new ApiClient());
    }

    public RadioProductOptionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List radio product options
     * This endpoint allows you to retrieve all the option attach to a radio product.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @return Model1RadiosRadioProductIdOptionsGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdOptionsGet200Response call1radiosRadioProductIdOptionsGet(Integer radioProductId) throws RestClientException {
        return call1radiosRadioProductIdOptionsGetWithHttpInfo(radioProductId).getBody();
    }

    /**
     * List radio product options
     * This endpoint allows you to retrieve all the option attach to a radio product.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * @param radioProductId The unique identifier (ID) of the radio product to request. (required)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdOptionsGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdOptionsGet200Response> call1radiosRadioProductIdOptionsGetWithHttpInfo(Integer radioProductId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'radioProductId' is set
        if (radioProductId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'radioProductId' when calling call1radiosRadioProductIdOptionsGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("radio_product_id", radioProductId);

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

        ParameterizedTypeReference<Model1RadiosRadioProductIdOptionsGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdOptionsGet200Response>() {};
        return apiClient.invokeAPI("/1/radios/{radio_product_id}/options", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
