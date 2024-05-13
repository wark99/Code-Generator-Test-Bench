package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.CarstocklistRequest;
import org.openapitools.client.model.CarstocklistResponse;
import org.openapitools.client.model.ErrorResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:13:48.943071954Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CarstockListApi {
    private ApiClient apiClient;

    public CarstockListApi() {
        this(new ApiClient());
    }

    public CarstockListApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get preview and status info for several carstocks to provide in list overview
     * Get preview and status info for several carstocks to provide in list overview
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param carstocklistRequest  (optional)
     * @return List&lt;CarstocklistResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstocklistResponse> newCarstocklistPost(CarstocklistRequest carstocklistRequest) throws RestClientException {
        return newCarstocklistPostWithHttpInfo(carstocklistRequest).getBody();
    }

    /**
     * Get preview and status info for several carstocks to provide in list overview
     * Get preview and status info for several carstocks to provide in list overview
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param carstocklistRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstocklistResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstocklistResponse>> newCarstocklistPostWithHttpInfo(CarstocklistRequest carstocklistRequest) throws RestClientException {
        Object localVarPostBody = carstocklistRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<CarstocklistResponse>> localReturnType = new ParameterizedTypeReference<List<CarstocklistResponse>>() {};
        return apiClient.invokeAPI("/new/carstocklist", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get preview and status info for several carstocks to provide in list overview
     * Get preview and status info for several carstocks to provide in list overview
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param carstocklistRequest  (optional)
     * @return List&lt;CarstocklistResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<CarstocklistResponse> newCarstocklistPost_0(CarstocklistRequest carstocklistRequest) throws RestClientException {
        return newCarstocklistPost_0WithHttpInfo(carstocklistRequest).getBody();
    }

    /**
     * Get preview and status info for several carstocks to provide in list overview
     * Get preview and status info for several carstocks to provide in list overview
     * <p><b>200</b> - Details of the given carstockids
     * <p><b>500</b> - Internal server error
     * @param carstocklistRequest  (optional)
     * @return ResponseEntity&lt;List&lt;CarstocklistResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<CarstocklistResponse>> newCarstocklistPost_0WithHttpInfo(CarstocklistRequest carstocklistRequest) throws RestClientException {
        Object localVarPostBody = carstocklistRequest;
        

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

        String[] localVarAuthNames = new String[] { "basic" };

        ParameterizedTypeReference<List<CarstocklistResponse>> localReturnType = new ParameterizedTypeReference<List<CarstocklistResponse>>() {};
        return apiClient.invokeAPI("/new/carstocklist", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
