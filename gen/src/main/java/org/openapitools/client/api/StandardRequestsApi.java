package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BuroPaPost200Response;
import org.openapitools.client.model.DeleteIstat;
import org.openapitools.client.model.IstatRegionsGet200Response;
import org.openapitools.client.model.PostIstat;
import org.openapitools.client.model.PostPa;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:22:17.271343072Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class StandardRequestsApi {
    private ApiClient apiClient;

    public StandardRequestsApi() {
        this(new ApiClient());
    }

    public StandardRequestsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete the comunications of a given list of ids for the istat service that support the delete method
     * # Delete the comunications of a given list of ids for the istat service that support the delete method &lt;br/&gt;&lt;br/&gt;To successfully resolve this endpoint **you must first query the istat/regions endpoint**. Once you have retrieved the region of your interest and its relative host data schema you can use them to run this endpoint    
     * <p><b>200</b> - ok
     * <p><b>400</b> - Client error
     * @param deleteIstat  (optional)
     * @return BuroPaPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BuroPaPost200Response buroIstatDelete(DeleteIstat deleteIstat) throws RestClientException {
        return buroIstatDeleteWithHttpInfo(deleteIstat).getBody();
    }

    /**
     * Delete the comunications of a given list of ids for the istat service that support the delete method
     * # Delete the comunications of a given list of ids for the istat service that support the delete method &lt;br/&gt;&lt;br/&gt;To successfully resolve this endpoint **you must first query the istat/regions endpoint**. Once you have retrieved the region of your interest and its relative host data schema you can use them to run this endpoint    
     * <p><b>200</b> - ok
     * <p><b>400</b> - Client error
     * @param deleteIstat  (optional)
     * @return ResponseEntity&lt;BuroPaPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BuroPaPost200Response> buroIstatDeleteWithHttpInfo(DeleteIstat deleteIstat) throws RestClientException {
        Object localVarPostBody = deleteIstat;
        

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

        String[] localVarAuthNames = new String[] { "apiToken" };

        ParameterizedTypeReference<BuroPaPost200Response> localReturnType = new ParameterizedTypeReference<BuroPaPost200Response>() {};
        return apiClient.invokeAPI("/buro/istat", HttpMethod.DELETE, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post a reservations to any istat service
     * # Sends all reservations for the day to the ISTAT of the specified region &lt;br/&gt;&lt;br/&gt;To successfully resolve this endpoint **you must first query the istat/regions endpoint**. Once you have retrieved the region of your interest and its relative host data schema you can use them to run this endpoint    
     * <p><b>200</b> - ok
     * <p><b>400</b> - Client error
     * @param postIstat  (optional)
     * @return BuroPaPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BuroPaPost200Response buroIstatPost(PostIstat postIstat) throws RestClientException {
        return buroIstatPostWithHttpInfo(postIstat).getBody();
    }

    /**
     * Post a reservations to any istat service
     * # Sends all reservations for the day to the ISTAT of the specified region &lt;br/&gt;&lt;br/&gt;To successfully resolve this endpoint **you must first query the istat/regions endpoint**. Once you have retrieved the region of your interest and its relative host data schema you can use them to run this endpoint    
     * <p><b>200</b> - ok
     * <p><b>400</b> - Client error
     * @param postIstat  (optional)
     * @return ResponseEntity&lt;BuroPaPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BuroPaPost200Response> buroIstatPostWithHttpInfo(PostIstat postIstat) throws RestClientException {
        Object localVarPostBody = postIstat;
        

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

        String[] localVarAuthNames = new String[] { "apiToken" };

        ParameterizedTypeReference<BuroPaPost200Response> localReturnType = new ParameterizedTypeReference<BuroPaPost200Response>() {};
        return apiClient.invokeAPI("/buro/istat", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Post a reservations to Portale Alloggiati
     * # Post a single reservation in a certain day to Portale Alloggiati   **Obtain web service key** (wskey) --&gt; &lt;a href&#x3D;\&quot;https://support.vikey.it/it/articles/7991406-come-recuperare-la-chiave-web-service-dal-portale-alloggiati\&quot;&gt;Link&lt;/a&gt;  **Obtain apt_id** --&gt; By accessing your Alloggiati Web Portal user, the list of apartments registered on Alloggiati Web will appear in the Apartments &gt; List of apartments section: If the List of apartments section is not present, and there is only one apartment on the Accommodation Portal, the ID is 0. If there is no apartment, the lack can be corrected by manually adding the structure by clicking on the +. After taking note of the ID of each apartment in the left column, send it together with the relevant reservations  **Obtain is_multi_apt** --&gt; If in the Apartments &gt; List of apartments section there is more than one apartament is True, else False                                            
     * <p><b>200</b> - ok
     * <p><b>400</b> - Client error
     * @param postPa  (optional)
     * @return BuroPaPost200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BuroPaPost200Response buroPaPost(PostPa postPa) throws RestClientException {
        return buroPaPostWithHttpInfo(postPa).getBody();
    }

    /**
     * Post a reservations to Portale Alloggiati
     * # Post a single reservation in a certain day to Portale Alloggiati   **Obtain web service key** (wskey) --&gt; &lt;a href&#x3D;\&quot;https://support.vikey.it/it/articles/7991406-come-recuperare-la-chiave-web-service-dal-portale-alloggiati\&quot;&gt;Link&lt;/a&gt;  **Obtain apt_id** --&gt; By accessing your Alloggiati Web Portal user, the list of apartments registered on Alloggiati Web will appear in the Apartments &gt; List of apartments section: If the List of apartments section is not present, and there is only one apartment on the Accommodation Portal, the ID is 0. If there is no apartment, the lack can be corrected by manually adding the structure by clicking on the +. After taking note of the ID of each apartment in the left column, send it together with the relevant reservations  **Obtain is_multi_apt** --&gt; If in the Apartments &gt; List of apartments section there is more than one apartament is True, else False                                            
     * <p><b>200</b> - ok
     * <p><b>400</b> - Client error
     * @param postPa  (optional)
     * @return ResponseEntity&lt;BuroPaPost200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BuroPaPost200Response> buroPaPostWithHttpInfo(PostPa postPa) throws RestClientException {
        Object localVarPostBody = postPa;
        

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

        String[] localVarAuthNames = new String[] { "apiToken" };

        ParameterizedTypeReference<BuroPaPost200Response> localReturnType = new ParameterizedTypeReference<BuroPaPost200Response>() {};
        return apiClient.invokeAPI("/buro/pa", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get all the regions avaiable for Istat service and the relative Host_data node to use in the endpoint buro/istat
     * # Get all the regions avaiable for Istat service and the relative Host_data node to use in the endpoint buro/istat
     * <p><b>200</b> - ok
     * <p><b>400</b> - Client error
     * @return IstatRegionsGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public IstatRegionsGet200Response istatRegionsGet() throws RestClientException {
        return istatRegionsGetWithHttpInfo().getBody();
    }

    /**
     * Get all the regions avaiable for Istat service and the relative Host_data node to use in the endpoint buro/istat
     * # Get all the regions avaiable for Istat service and the relative Host_data node to use in the endpoint buro/istat
     * <p><b>200</b> - ok
     * <p><b>400</b> - Client error
     * @return ResponseEntity&lt;IstatRegionsGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<IstatRegionsGet200Response> istatRegionsGetWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] { "apiToken" };

        ParameterizedTypeReference<IstatRegionsGet200Response> localReturnType = new ParameterizedTypeReference<IstatRegionsGet200Response>() {};
        return apiClient.invokeAPI("/istat/regions", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
