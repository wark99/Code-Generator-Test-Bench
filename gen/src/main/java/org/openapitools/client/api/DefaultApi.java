package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ActivityFullDetailFromPreorderIdCopy200Response;
import org.openapitools.client.model.ActivityFullDetailFromPreorderIdCopy400Response;
import org.openapitools.client.model.ActivityPax1TicketAvailabilityCopy200Response;
import org.openapitools.client.model.ActivityPax1TicketAvailabilityCopy400Response;
import org.openapitools.client.model.AvailabilityUsd200Response;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:17:54.085425345Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Activity full detail from preorder_id Copy
     * Activity full detail from preorder_id Copy
     * <p><b>200</b> - OK / OK
     * <p><b>400</b> - Bad Request / Bad Request
     * @param preorderid  (required)
     * @param xServantripCulture  (optional)
     * @param xServantripCurrency  (optional)
     * @return ActivityFullDetailFromPreorderIdCopy200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ActivityFullDetailFromPreorderIdCopy200Response activityFullDetailFromPreorderIdCopy(String preorderid, String xServantripCulture, String xServantripCurrency) throws RestClientException {
        return activityFullDetailFromPreorderIdCopyWithHttpInfo(preorderid, xServantripCulture, xServantripCurrency).getBody();
    }

    /**
     * Activity full detail from preorder_id Copy
     * Activity full detail from preorder_id Copy
     * <p><b>200</b> - OK / OK
     * <p><b>400</b> - Bad Request / Bad Request
     * @param preorderid  (required)
     * @param xServantripCulture  (optional)
     * @param xServantripCurrency  (optional)
     * @return ResponseEntity&lt;ActivityFullDetailFromPreorderIdCopy200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ActivityFullDetailFromPreorderIdCopy200Response> activityFullDetailFromPreorderIdCopyWithHttpInfo(String preorderid, String xServantripCulture, String xServantripCurrency) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'preorderid' is set
        if (preorderid == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'preorderid' when calling activityFullDetailFromPreorderIdCopy");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("preorderid", preorderid);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xServantripCulture != null)
        localVarHeaderParams.add("X-Servantrip-Culture", apiClient.parameterToString(xServantripCulture));
        if (xServantripCurrency != null)
        localVarHeaderParams.add("X-Servantrip-Currency", apiClient.parameterToString(xServantripCurrency));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "text/plain"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ActivityFullDetailFromPreorderIdCopy200Response> localReturnType = new ParameterizedTypeReference<ActivityFullDetailFromPreorderIdCopy200Response>() {};
        return apiClient.invokeAPI("/api/v2_1/activities/{preorderid}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Activity pax, 1 ticket. Availability Copy
     * Activity pax, 1 ticket. Availability Copy
     * <p><b>200</b> - OK / OK
     * <p><b>400</b> - Bad Request / Bad Request
     * @param xServantripCulture  (optional)
     * @param xServantripCurrency  (optional)
     * @return ActivityPax1TicketAvailabilityCopy200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ActivityPax1TicketAvailabilityCopy200Response activityPax1TicketAvailabilityCopy(String xServantripCulture, String xServantripCurrency) throws RestClientException {
        return activityPax1TicketAvailabilityCopyWithHttpInfo(xServantripCulture, xServantripCurrency).getBody();
    }

    /**
     * Activity pax, 1 ticket. Availability Copy
     * Activity pax, 1 ticket. Availability Copy
     * <p><b>200</b> - OK / OK
     * <p><b>400</b> - Bad Request / Bad Request
     * @param xServantripCulture  (optional)
     * @param xServantripCurrency  (optional)
     * @return ResponseEntity&lt;ActivityPax1TicketAvailabilityCopy200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ActivityPax1TicketAvailabilityCopy200Response> activityPax1TicketAvailabilityCopyWithHttpInfo(String xServantripCulture, String xServantripCurrency) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xServantripCulture != null)
        localVarHeaderParams.add("X-Servantrip-Culture", apiClient.parameterToString(xServantripCulture));
        if (xServantripCurrency != null)
        localVarHeaderParams.add("X-Servantrip-Currency", apiClient.parameterToString(xServantripCurrency));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "text/plain"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<ActivityPax1TicketAvailabilityCopy200Response> localReturnType = new ParameterizedTypeReference<ActivityPax1TicketAvailabilityCopy200Response>() {};
        return apiClient.invokeAPI("/api/v2_1/availability", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Availability USD
     * Shows all availability in USD.
     * <p><b>200</b> - OK / OK
     * <p><b>400</b> - Bad Request / Bad Request
     * @param xServantripCulture  (optional)
     * @param xServantripCurrency  (optional)
     * @return AvailabilityUsd200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AvailabilityUsd200Response availabilityUsd(String xServantripCulture, String xServantripCurrency) throws RestClientException {
        return availabilityUsdWithHttpInfo(xServantripCulture, xServantripCurrency).getBody();
    }

    /**
     * Availability USD
     * Shows all availability in USD.
     * <p><b>200</b> - OK / OK
     * <p><b>400</b> - Bad Request / Bad Request
     * @param xServantripCulture  (optional)
     * @param xServantripCurrency  (optional)
     * @return ResponseEntity&lt;AvailabilityUsd200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AvailabilityUsd200Response> availabilityUsdWithHttpInfo(String xServantripCulture, String xServantripCurrency) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xServantripCulture != null)
        localVarHeaderParams.add("X-Servantrip-Culture", apiClient.parameterToString(xServantripCulture));
        if (xServantripCurrency != null)
        localVarHeaderParams.add("X-Servantrip-Currency", apiClient.parameterToString(xServantripCurrency));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<AvailabilityUsd200Response> localReturnType = new ParameterizedTypeReference<AvailabilityUsd200Response>() {};
        return apiClient.invokeAPI("/v2_1/availability", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
