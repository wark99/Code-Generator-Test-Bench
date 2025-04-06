package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.BrandingWrapper;
import org.openapitools.client.model.CertifiedInstitutions;
import org.openapitools.client.model.ErrorMessage;
import org.openapitools.client.model.InstitutionWrapper;
import org.openapitools.client.model.Institutions;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-06T13:34:32.874275138Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class InstitutionsApi {
    private ApiClient apiClient;

    public InstitutionsApi() {
        this(new ApiClient());
    }

    public InstitutionsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Certified Institutions
     * Search for financial institutions by certified product.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Institutions were successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param search Search term (financial institution &#x60;name&#x60; field). Leave empty for all FIs. (optional)
     * @param start Index of the page of results to return (optional, default to 1)
     * @param limit Maximum number of results per page (optional, default to 25)
     * @param type A product type: \&quot;transAgg\&quot;, \&quot;ach\&quot;, \&quot;stateAgg\&quot;, \&quot;voi\&quot;, \&quot;voa\&quot;, \&quot;aha\&quot;, \&quot;availBalance\&quot;, \&quot;accountOwner\&quot; (optional)
     * @param supportedCountries A list of country codes, &#39;*&#39; for all countries. (optional)
     * @return CertifiedInstitutions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CertifiedInstitutions getCertifiedInstitutions(String search, Integer start, Integer limit, String type, List<String> supportedCountries) throws RestClientException {
        return getCertifiedInstitutionsWithHttpInfo(search, start, limit, type, supportedCountries).getBody();
    }

    /**
     * Get Certified Institutions
     * Search for financial institutions by certified product.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Institutions were successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param search Search term (financial institution &#x60;name&#x60; field). Leave empty for all FIs. (optional)
     * @param start Index of the page of results to return (optional, default to 1)
     * @param limit Maximum number of results per page (optional, default to 25)
     * @param type A product type: \&quot;transAgg\&quot;, \&quot;ach\&quot;, \&quot;stateAgg\&quot;, \&quot;voi\&quot;, \&quot;voa\&quot;, \&quot;aha\&quot;, \&quot;availBalance\&quot;, \&quot;accountOwner\&quot; (optional)
     * @param supportedCountries A list of country codes, &#39;*&#39; for all countries. (optional)
     * @return ResponseEntity&lt;CertifiedInstitutions&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CertifiedInstitutions> getCertifiedInstitutionsWithHttpInfo(String search, Integer start, Integer limit, String type, List<String> supportedCountries) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "search", search));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "supportedCountries", supportedCountries));
        

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<CertifiedInstitutions> localReturnType = new ParameterizedTypeReference<CertifiedInstitutions>() {};
        return apiClient.invokeAPI("/institution/v2/certifiedInstitutions", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Certified Institutions With RSSD
     * Search for certified financial institutions w/RSSD.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Institutions were successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param search Search term (financial institution &#x60;name&#x60; field). Leave empty for all FIs. (optional)
     * @param start Index of the page of results to return (optional, default to 1)
     * @param limit Maximum number of results per page (optional, default to 25)
     * @param type A product type: \&quot;transAgg\&quot;, \&quot;ach\&quot;, \&quot;stateAgg\&quot;, \&quot;voi\&quot;, \&quot;voa\&quot;, \&quot;aha\&quot;, \&quot;availBalance\&quot;, \&quot;accountOwner\&quot; (optional)
     * @param supportedCountries A list of country codes, &#39;*&#39; for all countries. (optional)
     * @return CertifiedInstitutions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CertifiedInstitutions getCertifiedInstitutionsWithRSSD(String search, Integer start, Integer limit, String type, List<String> supportedCountries) throws RestClientException {
        return getCertifiedInstitutionsWithRSSDWithHttpInfo(search, start, limit, type, supportedCountries).getBody();
    }

    /**
     * Get Certified Institutions With RSSD
     * Search for certified financial institutions w/RSSD.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Institutions were successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param search Search term (financial institution &#x60;name&#x60; field). Leave empty for all FIs. (optional)
     * @param start Index of the page of results to return (optional, default to 1)
     * @param limit Maximum number of results per page (optional, default to 25)
     * @param type A product type: \&quot;transAgg\&quot;, \&quot;ach\&quot;, \&quot;stateAgg\&quot;, \&quot;voi\&quot;, \&quot;voa\&quot;, \&quot;aha\&quot;, \&quot;availBalance\&quot;, \&quot;accountOwner\&quot; (optional)
     * @param supportedCountries A list of country codes, &#39;*&#39; for all countries. (optional)
     * @return ResponseEntity&lt;CertifiedInstitutions&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CertifiedInstitutions> getCertifiedInstitutionsWithRSSDWithHttpInfo(String search, Integer start, Integer limit, String type, List<String> supportedCountries) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "search", search));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "supportedCountries", supportedCountries));
        

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<CertifiedInstitutions> localReturnType = new ParameterizedTypeReference<CertifiedInstitutions>() {};
        return apiClient.invokeAPI("/institution/v2/certifiedInstitutions/rssd", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Institution by ID
     * Get financial institution details by ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Institution was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param institutionId The institution ID (required)
     * @return InstitutionWrapper
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InstitutionWrapper getInstitution(Long institutionId) throws RestClientException {
        return getInstitutionWithHttpInfo(institutionId).getBody();
    }

    /**
     * Get Institution by ID
     * Get financial institution details by ID.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Institution was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param institutionId The institution ID (required)
     * @return ResponseEntity&lt;InstitutionWrapper&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InstitutionWrapper> getInstitutionWithHttpInfo(Long institutionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'institutionId' is set
        if (institutionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'institutionId' when calling getInstitution");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("institutionId", institutionId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<InstitutionWrapper> localReturnType = new ParameterizedTypeReference<InstitutionWrapper>() {};
        return apiClient.invokeAPI("/institution/v2/institutions/{institutionId}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Institution Branding by ID
     * Return the branding information for a financial institution.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Institution branding was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param institutionId The institution ID (required)
     * @return BrandingWrapper
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BrandingWrapper getInstitutionBranding(Long institutionId) throws RestClientException {
        return getInstitutionBrandingWithHttpInfo(institutionId).getBody();
    }

    /**
     * Get Institution Branding by ID
     * Return the branding information for a financial institution.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Institution branding was successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * <p><b>404</b> - The resource doesn&#39;t exist
     * @param institutionId The institution ID (required)
     * @return ResponseEntity&lt;BrandingWrapper&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BrandingWrapper> getInstitutionBrandingWithHttpInfo(Long institutionId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'institutionId' is set
        if (institutionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'institutionId' when calling getInstitutionBranding");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("institutionId", institutionId);

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<BrandingWrapper> localReturnType = new ParameterizedTypeReference<BrandingWrapper>() {};
        return apiClient.invokeAPI("/institution/v2/institutions/{institutionId}/branding", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Get Institutions
     * Search for financial institutions.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Institutions were successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param search Search term (financial institution &#x60;name&#x60; field). Leave empty for all FIs. (optional)
     * @param start Index of the page of results to return (optional, default to 1)
     * @param limit Maximum number of results per page (optional, default to 25)
     * @param type A product type: \&quot;transAgg\&quot;, \&quot;ach\&quot;, \&quot;stateAgg\&quot;, \&quot;voi\&quot;, \&quot;voa\&quot;, \&quot;aha\&quot;, \&quot;availBalance\&quot;, \&quot;accountOwner\&quot; (optional)
     * @param supportedCountries A list of country codes, &#39;*&#39; for all countries. (optional)
     * @return Institutions
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Institutions getInstitutions(String search, Integer start, Integer limit, String type, List<String> supportedCountries) throws RestClientException {
        return getInstitutionsWithHttpInfo(search, start, limit, type, supportedCountries).getBody();
    }

    /**
     * Get Institutions
     * Search for financial institutions.  _Supported regions_: ![🇺🇸](https://flagcdn.com/20x15/us.png)
     * <p><b>200</b> - Institutions were successfully retrieved
     * <p><b>400</b> - The request was rejected
     * <p><b>401</b> - The request lacks valid authentication credentials. Check \&quot;Finicity-App-Key\&quot; or \&quot;Finicity-App-Token\&quot;.
     * @param search Search term (financial institution &#x60;name&#x60; field). Leave empty for all FIs. (optional)
     * @param start Index of the page of results to return (optional, default to 1)
     * @param limit Maximum number of results per page (optional, default to 25)
     * @param type A product type: \&quot;transAgg\&quot;, \&quot;ach\&quot;, \&quot;stateAgg\&quot;, \&quot;voi\&quot;, \&quot;voa\&quot;, \&quot;aha\&quot;, \&quot;availBalance\&quot;, \&quot;accountOwner\&quot; (optional)
     * @param supportedCountries A list of country codes, &#39;*&#39; for all countries. (optional)
     * @return ResponseEntity&lt;Institutions&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Institutions> getInstitutionsWithHttpInfo(String search, Integer start, Integer limit, String type, List<String> supportedCountries) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "search", search));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "start", start));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "supportedCountries", supportedCountries));
        

        final String[] localVarAccepts = { 
            "application/json", "text/plain"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "FinicityAppToken", "FinicityAppKey" };

        ParameterizedTypeReference<Institutions> localReturnType = new ParameterizedTypeReference<Institutions>() {};
        return apiClient.invokeAPI("/institution/v2/institutions", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
