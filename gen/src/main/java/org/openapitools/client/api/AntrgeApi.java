package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.ApiKitafinderAntraegeErmaessigungmitbelegenPostRequest;
import org.openapitools.client.model.ApiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest;
import org.openapitools.client.model.ApiKitafinderAntraegeFristablaufPostRequest;
import org.openapitools.client.model.ApiKitafinderAntraegeRegelsatzPostRequest;
import org.openapitools.client.model.ApiKitafinderAntraegeUnterlageneingangPostRequest;
import org.openapitools.client.model.ApiKitafinderAntraegeUnterlagenfristgesetztPostRequest;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:16:41.833762886Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class AntrgeApi {
    private ApiClient apiClient;

    public AntrgeApi() {
        this(new ApiClient());
    }

    public AntrgeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Neuen Antrag auf Ermäßigung mit Belegen erstellen (E4)
     * Neuen Antrag auf Ermäßigung mit Belegen erstellen (E4)
     * <p><b>201</b> - Create (E4) Antrag auf Ermäßigung mit Belegen
     * <p><b>401</b> - API key nicht angegeben oder ungültig
     * <p><b>4XX</b> - Sonstiger Client Fehler (4xx)
     * <p><b>5XX</b> - Server Fehler (5xx)
     * @param apiKitafinderAntraegeErmaessigungmitbelegenPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiKitafinderAntraegeErmaessigungmitbelegenPost(ApiKitafinderAntraegeErmaessigungmitbelegenPostRequest apiKitafinderAntraegeErmaessigungmitbelegenPostRequest) throws RestClientException {
        apiKitafinderAntraegeErmaessigungmitbelegenPostWithHttpInfo(apiKitafinderAntraegeErmaessigungmitbelegenPostRequest);
    }

    /**
     * Neuen Antrag auf Ermäßigung mit Belegen erstellen (E4)
     * Neuen Antrag auf Ermäßigung mit Belegen erstellen (E4)
     * <p><b>201</b> - Create (E4) Antrag auf Ermäßigung mit Belegen
     * <p><b>401</b> - API key nicht angegeben oder ungültig
     * <p><b>4XX</b> - Sonstiger Client Fehler (4xx)
     * <p><b>5XX</b> - Server Fehler (5xx)
     * @param apiKitafinderAntraegeErmaessigungmitbelegenPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiKitafinderAntraegeErmaessigungmitbelegenPostWithHttpInfo(ApiKitafinderAntraegeErmaessigungmitbelegenPostRequest apiKitafinderAntraegeErmaessigungmitbelegenPostRequest) throws RestClientException {
        Object localVarPostBody = apiKitafinderAntraegeErmaessigungmitbelegenPostRequest;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/kitafinder/antraege/ermaessigungmitbelegen", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Neuen Antrag auf Ermäßigung mit Selbsteinschätzung erstellen (E3)
     * Neuen Antrag auf Ermäßigung mit Selbsteinschätzung erstellen (E3)
     * <p><b>201</b> - Create (E3) Antrag auf Ermäßigung mit Selbsteinschätzung
     * <p><b>401</b> - API key nicht angegeben oder ungültig
     * <p><b>4XX</b> - Sonstiger Client Fehler (4xx)
     * <p><b>5XX</b> - Server Fehler (5xx)
     * @param apiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiKitafinderAntraegeErmaessigungselbsteinschaetzungPost(ApiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest apiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest) throws RestClientException {
        apiKitafinderAntraegeErmaessigungselbsteinschaetzungPostWithHttpInfo(apiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest);
    }

    /**
     * Neuen Antrag auf Ermäßigung mit Selbsteinschätzung erstellen (E3)
     * Neuen Antrag auf Ermäßigung mit Selbsteinschätzung erstellen (E3)
     * <p><b>201</b> - Create (E3) Antrag auf Ermäßigung mit Selbsteinschätzung
     * <p><b>401</b> - API key nicht angegeben oder ungültig
     * <p><b>4XX</b> - Sonstiger Client Fehler (4xx)
     * <p><b>5XX</b> - Server Fehler (5xx)
     * @param apiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiKitafinderAntraegeErmaessigungselbsteinschaetzungPostWithHttpInfo(ApiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest apiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest) throws RestClientException {
        Object localVarPostBody = apiKitafinderAntraegeErmaessigungselbsteinschaetzungPostRequest;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/kitafinder/antraege/ermaessigungselbsteinschaetzung", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Fristablauf (E1)
     * Fristablauf (E1) Nur für Neuverträge wenn 4 Wochen nach Neuvertrag kein Antrag gestellt wurde
     * <p><b>200</b> - Fristablauf übertragen
     * <p><b>401</b> - API key nicht angegeben oder ungültig
     * <p><b>4XX</b> - Sonstiger Client Fehler (4xx)
     * <p><b>5XX</b> - Server Fehler (5xx)
     * @param apiKitafinderAntraegeFristablaufPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiKitafinderAntraegeFristablaufPost(ApiKitafinderAntraegeFristablaufPostRequest apiKitafinderAntraegeFristablaufPostRequest) throws RestClientException {
        apiKitafinderAntraegeFristablaufPostWithHttpInfo(apiKitafinderAntraegeFristablaufPostRequest);
    }

    /**
     * Fristablauf (E1)
     * Fristablauf (E1) Nur für Neuverträge wenn 4 Wochen nach Neuvertrag kein Antrag gestellt wurde
     * <p><b>200</b> - Fristablauf übertragen
     * <p><b>401</b> - API key nicht angegeben oder ungültig
     * <p><b>4XX</b> - Sonstiger Client Fehler (4xx)
     * <p><b>5XX</b> - Server Fehler (5xx)
     * @param apiKitafinderAntraegeFristablaufPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiKitafinderAntraegeFristablaufPostWithHttpInfo(ApiKitafinderAntraegeFristablaufPostRequest apiKitafinderAntraegeFristablaufPostRequest) throws RestClientException {
        Object localVarPostBody = apiKitafinderAntraegeFristablaufPostRequest;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/kitafinder/antraege/fristablauf", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Neuen Antrag auf Regelsatz erstellen (E2)
     * Neuen Antrag auf Regelsatz erstellen (E2)
     * <p><b>201</b> - Create (E2) Antrag auf Regelsatz
     * <p><b>401</b> - API key nicht angegeben oder ungültig
     * <p><b>4XX</b> - Sonstiger Client Fehler (4xx)
     * <p><b>5XX</b> - Server Fehler (5xx)
     * @param apiKitafinderAntraegeRegelsatzPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiKitafinderAntraegeRegelsatzPost(ApiKitafinderAntraegeRegelsatzPostRequest apiKitafinderAntraegeRegelsatzPostRequest) throws RestClientException {
        apiKitafinderAntraegeRegelsatzPostWithHttpInfo(apiKitafinderAntraegeRegelsatzPostRequest);
    }

    /**
     * Neuen Antrag auf Regelsatz erstellen (E2)
     * Neuen Antrag auf Regelsatz erstellen (E2)
     * <p><b>201</b> - Create (E2) Antrag auf Regelsatz
     * <p><b>401</b> - API key nicht angegeben oder ungültig
     * <p><b>4XX</b> - Sonstiger Client Fehler (4xx)
     * <p><b>5XX</b> - Server Fehler (5xx)
     * @param apiKitafinderAntraegeRegelsatzPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiKitafinderAntraegeRegelsatzPostWithHttpInfo(ApiKitafinderAntraegeRegelsatzPostRequest apiKitafinderAntraegeRegelsatzPostRequest) throws RestClientException {
        Object localVarPostBody = apiKitafinderAntraegeRegelsatzPostRequest;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/kitafinder/antraege/regelsatz", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Unterlageneingang (E5)
     * Unterlageneingang (E5)
     * <p><b>200</b> - Update (E5) Unterlageneingang
     * <p><b>401</b> - API key nicht angegeben oder ungültig
     * <p><b>4XX</b> - Sonstiger Client Fehler (4xx)
     * <p><b>5XX</b> - Server Fehler (5xx)
     * @param apiKitafinderAntraegeUnterlageneingangPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiKitafinderAntraegeUnterlageneingangPost(ApiKitafinderAntraegeUnterlageneingangPostRequest apiKitafinderAntraegeUnterlageneingangPostRequest) throws RestClientException {
        apiKitafinderAntraegeUnterlageneingangPostWithHttpInfo(apiKitafinderAntraegeUnterlageneingangPostRequest);
    }

    /**
     * Unterlageneingang (E5)
     * Unterlageneingang (E5)
     * <p><b>200</b> - Update (E5) Unterlageneingang
     * <p><b>401</b> - API key nicht angegeben oder ungültig
     * <p><b>4XX</b> - Sonstiger Client Fehler (4xx)
     * <p><b>5XX</b> - Server Fehler (5xx)
     * @param apiKitafinderAntraegeUnterlageneingangPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiKitafinderAntraegeUnterlageneingangPostWithHttpInfo(ApiKitafinderAntraegeUnterlageneingangPostRequest apiKitafinderAntraegeUnterlageneingangPostRequest) throws RestClientException {
        Object localVarPostBody = apiKitafinderAntraegeUnterlageneingangPostRequest;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/kitafinder/antraege/unterlageneingang", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Frist für Unterlagen wurde gesetzt (E6)
     * Frist für Unterlagen wurde gesetzt (E6)
     * <p><b>200</b> - Update (E6) Frist für Unterlagen wurde gesetzt
     * <p><b>401</b> - API key nicht angegeben oder ungültig
     * <p><b>4XX</b> - Sonstiger Client Fehler (4xx)
     * <p><b>5XX</b> - Server Fehler (5xx)
     * @param apiKitafinderAntraegeUnterlagenfristgesetztPostRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void apiKitafinderAntraegeUnterlagenfristgesetztPost(ApiKitafinderAntraegeUnterlagenfristgesetztPostRequest apiKitafinderAntraegeUnterlagenfristgesetztPostRequest) throws RestClientException {
        apiKitafinderAntraegeUnterlagenfristgesetztPostWithHttpInfo(apiKitafinderAntraegeUnterlagenfristgesetztPostRequest);
    }

    /**
     * Frist für Unterlagen wurde gesetzt (E6)
     * Frist für Unterlagen wurde gesetzt (E6)
     * <p><b>200</b> - Update (E6) Frist für Unterlagen wurde gesetzt
     * <p><b>401</b> - API key nicht angegeben oder ungültig
     * <p><b>4XX</b> - Sonstiger Client Fehler (4xx)
     * <p><b>5XX</b> - Server Fehler (5xx)
     * @param apiKitafinderAntraegeUnterlagenfristgesetztPostRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> apiKitafinderAntraegeUnterlagenfristgesetztPostWithHttpInfo(ApiKitafinderAntraegeUnterlagenfristgesetztPostRequest apiKitafinderAntraegeUnterlagenfristgesetztPostRequest) throws RestClientException {
        Object localVarPostBody = apiKitafinderAntraegeUnterlagenfristgesetztPostRequest;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = {  };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };

        ParameterizedTypeReference<Void> localReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/api/kitafinder/antraege/unterlagenfristgesetzt", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
