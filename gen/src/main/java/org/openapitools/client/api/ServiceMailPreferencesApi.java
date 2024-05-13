package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1MailHostingsMailHostingIdPreferencesGet200Response;
import org.openapitools.client.model.Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut400Response;
import org.openapitools.client.model.Model1SwissBackupsSwissBackupIdAdminPut404Response;
import org.openapitools.client.model.RequestBody51;

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
public class ServiceMailPreferencesApi {
    private ApiClient apiClient;

    public ServiceMailPreferencesApi() {
        this(new ApiClient());
    }

    public ServiceMailPreferencesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List preferences
     * Returns preferences for given Service Mail
     * <p><b>200</b> - OK
     * @param mailHostingId ServiceMail identifier (required)
     * @return Model1MailHostingsMailHostingIdPreferencesGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1MailHostingsMailHostingIdPreferencesGet200Response call1mailHostingsMailHostingIdPreferencesGet(Integer mailHostingId) throws RestClientException {
        return call1mailHostingsMailHostingIdPreferencesGetWithHttpInfo(mailHostingId).getBody();
    }

    /**
     * List preferences
     * Returns preferences for given Service Mail
     * <p><b>200</b> - OK
     * @param mailHostingId ServiceMail identifier (required)
     * @return ResponseEntity&lt;Model1MailHostingsMailHostingIdPreferencesGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1MailHostingsMailHostingIdPreferencesGet200Response> call1mailHostingsMailHostingIdPreferencesGetWithHttpInfo(Integer mailHostingId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'mailHostingId' is set
        if (mailHostingId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'mailHostingId' when calling call1mailHostingsMailHostingIdPreferencesGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);

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

        ParameterizedTypeReference<Model1MailHostingsMailHostingIdPreferencesGet200Response> localReturnType = new ParameterizedTypeReference<Model1MailHostingsMailHostingIdPreferencesGet200Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/preferences", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Update preferences
     * Update preferences for given service Mail
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mailHostingId  (optional)
     * @param requestBody51  (optional)
     * @return Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1mailHostingsMailHostingIdPreferencesPatch(String mailHostingId, RequestBody51 requestBody51) throws RestClientException {
        return call1mailHostingsMailHostingIdPreferencesPatchWithHttpInfo(mailHostingId, requestBody51).getBody();
    }

    /**
     * Update preferences
     * Update preferences for given service Mail
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mailHostingId  (optional)
     * @param requestBody51  (optional)
     * @return ResponseEntity&lt;Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> call1mailHostingsMailHostingIdPreferencesPatchWithHttpInfo(String mailHostingId, RequestBody51 requestBody51) throws RestClientException {
        Object localVarPostBody = requestBody51;
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("mail_hosting_id", mailHostingId);

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

        String[] localVarAuthNames = new String[] { "bearerAuth" };

        ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response> localReturnType = new ParameterizedTypeReference<Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response>() {};
        return apiClient.invokeAPI("/1/mail_hostings/{mail_hosting_id}/preferences", HttpMethod.PATCH, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
