package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.Model1CountriesCountryIdGet200Response;
import org.openapitools.client.model.Model1CountriesGet200Response;
import org.openapitools.client.model.OneOfstringAnyType;

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
public class CountriesApi {
    private ApiClient apiClient;

    public CountriesApi() {
        this(new ApiClient());
    }

    public CountriesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Display a country
     * Returns a variety of information about a single Country specified by the requested unique identifier.
     * <p><b>200</b> - OK
     * @param countryId The unique identifier (ID) of the country to request. (required)
     * @return Model1CountriesCountryIdGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1CountriesCountryIdGet200Response call1countriesCountryIdGet(Integer countryId) throws RestClientException {
        return call1countriesCountryIdGetWithHttpInfo(countryId).getBody();
    }

    /**
     * Display a country
     * Returns a variety of information about a single Country specified by the requested unique identifier.
     * <p><b>200</b> - OK
     * @param countryId The unique identifier (ID) of the country to request. (required)
     * @return ResponseEntity&lt;Model1CountriesCountryIdGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1CountriesCountryIdGet200Response> call1countriesCountryIdGetWithHttpInfo(Integer countryId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'countryId' is set
        if (countryId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'countryId' when calling call1countriesCountryIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("country_id", countryId);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1CountriesCountryIdGet200Response> localReturnType = new ParameterizedTypeReference<Model1CountriesCountryIdGet200Response>() {};
        return apiClient.invokeAPI("/1/countries/{country_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * List countries
     * This endpoint allows you to retrieve all the countries.
     * <p><b>200</b> - OK
     * @param onlyEnabled  (optional)
     * @param onlyEnabledException  (optional)
     * @param search  (optional)
     * @param _return *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  (optional)
     * @param limit *Optional parameter* that define the number of items to return&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param skip *Optional parameter* that define the index of the first item to return (0 &#x3D; first item)&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param page *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param perPage *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param orderBy *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @param order *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional, default to asc)
     * @param orderFor *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @return Model1CountriesGet200Response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Model1CountriesGet200Response call1countriesGet(Boolean onlyEnabled, List<Integer> onlyEnabledException, String search, String _return, Integer limit, Integer skip, Integer page, Integer perPage, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        return call1countriesGetWithHttpInfo(onlyEnabled, onlyEnabledException, search, _return, limit, skip, page, perPage, orderBy, order, orderFor).getBody();
    }

    /**
     * List countries
     * This endpoint allows you to retrieve all the countries.
     * <p><b>200</b> - OK
     * @param onlyEnabled  (optional)
     * @param onlyEnabledException  (optional)
     * @param search  (optional)
     * @param _return *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  (optional)
     * @param limit *Optional parameter* that define the number of items to return&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param skip *Optional parameter* that define the index of the first item to return (0 &#x3D; first item)&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  (optional)
     * @param page *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param perPage *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  (optional)
     * @param orderBy *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @param order *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional, default to asc)
     * @param orderFor *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  (optional)
     * @return ResponseEntity&lt;Model1CountriesGet200Response&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Model1CountriesGet200Response> call1countriesGetWithHttpInfo(Boolean onlyEnabled, List<Integer> onlyEnabledException, String search, String _return, Integer limit, Integer skip, Integer page, Integer perPage, OneOfstringAnyType orderBy, String order, Object orderFor) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "only_enabled", onlyEnabled));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "only_enabled_exception", onlyEnabledException));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "search", search));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "return", _return));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "skip", skip));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "order_by", orderBy));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "order", order));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "order_for", orderFor));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Model1CountriesGet200Response> localReturnType = new ParameterizedTypeReference<Model1CountriesGet200Response>() {};
        return apiClient.invokeAPI("/1/countries", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
