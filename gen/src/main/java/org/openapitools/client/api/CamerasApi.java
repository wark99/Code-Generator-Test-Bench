package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Status;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:21:13.609131704Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CamerasApi {
    private ApiClient apiClient;

    public CamerasApi() {
        this(new ApiClient());
    }

    public CamerasApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Register camera to Connect by user.
     * 
     * <p><b>200</b> - **OK**
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>503</b>
     * @param printerUuid  (required)
     * @param origin  (optional, default to WEB)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void appPrintersPrinterUuidCameraPost(String printerUuid, String origin) throws RestClientException {
        appPrintersPrinterUuidCameraPostWithHttpInfo(printerUuid, origin);
    }

    /**
     * Register camera to Connect by user.
     * 
     * <p><b>200</b> - **OK**
     * <p><b>400</b>
     * <p><b>401</b>
     * <p><b>403</b>
     * <p><b>503</b>
     * @param printerUuid  (required)
     * @param origin  (optional, default to WEB)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> appPrintersPrinterUuidCameraPostWithHttpInfo(String printerUuid, String origin) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'printerUuid' is set
        if (printerUuid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'printerUuid' when calling appPrintersPrinterUuidCameraPost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("printer_uuid", printerUuid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "origin", origin));
        

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "Cookie" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/app/printers/{printer_uuid}/camera", HttpMethod.POST, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
