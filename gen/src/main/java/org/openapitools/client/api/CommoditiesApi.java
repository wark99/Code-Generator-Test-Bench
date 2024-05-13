package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.GetCommoditiesAveragesOkResponse;
import org.openapitools.client.model.GetCommoditiesOkResponse;
import org.openapitools.client.model.GetCommoditiesPricesAllOkResponse;
import org.openapitools.client.model.GetCommoditiesPricesHistoryOkResponse;
import org.openapitools.client.model.GetCommoditiesPricesOkResponse;
import org.openapitools.client.model.GetCommoditiesRankingOkResponse;
import org.openapitools.client.model.GetCommoditiesRawPricesAllOkResponse;
import org.openapitools.client.model.GetCommoditiesRawPricesOkResponse;
import org.openapitools.client.model.GetCommoditiesRoutesOkResponse;
import org.openapitools.client.model.GetCommoditiesStatusOkResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:23:46.594754675Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CommoditiesApi {
    private ApiClient apiClient;

    public CommoditiesApi() {
        this(new ApiClient());
    }

    public CommoditiesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a list of all commodities covered by UEX.
     * 
     * <p><b>200</b> - OK
     * @return GetCommoditiesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommoditiesOkResponse getCommodities() throws RestClientException {
        return getCommoditiesWithHttpInfo().getBody();
    }

    /**
     * Get a list of all commodities covered by UEX.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;GetCommoditiesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommoditiesOkResponse> getCommoditiesWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetCommoditiesOkResponse> localReturnType = new ParameterizedTypeReference<GetCommoditiesOkResponse>() {};
        return apiClient.invokeAPI("/commodities/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of average prices and stock data of a specific commodity in the last 180 days. (CAX Index)
     * 
     * <p><b>200</b> - OK
     * @param idCommodity  (required)
     * @return GetCommoditiesAveragesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommoditiesAveragesOkResponse getCommoditiesAveragesByCommodity(String idCommodity) throws RestClientException {
        return getCommoditiesAveragesByCommodityWithHttpInfo(idCommodity).getBody();
    }

    /**
     * Retrieve a list of average prices and stock data of a specific commodity in the last 180 days. (CAX Index)
     * 
     * <p><b>200</b> - OK
     * @param idCommodity  (required)
     * @return ResponseEntity&lt;GetCommoditiesAveragesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommoditiesAveragesOkResponse> getCommoditiesAveragesByCommodityWithHttpInfo(String idCommodity) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idCommodity' is set
        if (idCommodity == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idCommodity' when calling getCommoditiesAveragesByCommodity");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id_commodity", idCommodity);

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

        ParameterizedTypeReference<GetCommoditiesAveragesOkResponse> localReturnType = new ParameterizedTypeReference<GetCommoditiesAveragesOkResponse>() {};
        return apiClient.invokeAPI("/commodities_averages/id_commodity/{id_commodity}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of prices for all commodities in all terminals, all at once
     * 
     * <p><b>200</b> - OK
     * @return GetCommoditiesPricesAllOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommoditiesPricesAllOkResponse getCommoditiesPricesAll() throws RestClientException {
        return getCommoditiesPricesAllWithHttpInfo().getBody();
    }

    /**
     * Retrieve a list of prices for all commodities in all terminals, all at once
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;GetCommoditiesPricesAllOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommoditiesPricesAllOkResponse> getCommoditiesPricesAllWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetCommoditiesPricesAllOkResponse> localReturnType = new ParameterizedTypeReference<GetCommoditiesPricesAllOkResponse>() {};
        return apiClient.invokeAPI("/commodities_prices_all/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of prices for all commodities.
     * 
     * <p><b>200</b> - OK
     * @param idCommodity  (required)
     * @return GetCommoditiesPricesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommoditiesPricesOkResponse getCommoditiesPricesByCommodity(String idCommodity) throws RestClientException {
        return getCommoditiesPricesByCommodityWithHttpInfo(idCommodity).getBody();
    }

    /**
     * Retrieve a list of prices for all commodities.
     * 
     * <p><b>200</b> - OK
     * @param idCommodity  (required)
     * @return ResponseEntity&lt;GetCommoditiesPricesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommoditiesPricesOkResponse> getCommoditiesPricesByCommodityWithHttpInfo(String idCommodity) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idCommodity' is set
        if (idCommodity == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idCommodity' when calling getCommoditiesPricesByCommodity");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id_commodity", idCommodity);

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

        ParameterizedTypeReference<GetCommoditiesPricesOkResponse> localReturnType = new ParameterizedTypeReference<GetCommoditiesPricesOkResponse>() {};
        return apiClient.invokeAPI("/commodities_prices/id_commodity/{id_commodity}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of prices for all commodities.
     * 
     * <p><b>200</b> - OK
     * @param idTerminal  (required)
     * @return GetCommoditiesPricesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommoditiesPricesOkResponse getCommoditiesPricesByTerminal(String idTerminal) throws RestClientException {
        return getCommoditiesPricesByTerminalWithHttpInfo(idTerminal).getBody();
    }

    /**
     * Retrieve a list of prices for all commodities.
     * 
     * <p><b>200</b> - OK
     * @param idTerminal  (required)
     * @return ResponseEntity&lt;GetCommoditiesPricesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommoditiesPricesOkResponse> getCommoditiesPricesByTerminalWithHttpInfo(String idTerminal) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idTerminal' is set
        if (idTerminal == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idTerminal' when calling getCommoditiesPricesByTerminal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id_terminal", idTerminal);

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

        ParameterizedTypeReference<GetCommoditiesPricesOkResponse> localReturnType = new ParameterizedTypeReference<GetCommoditiesPricesOkResponse>() {};
        return apiClient.invokeAPI("/commodities_prices/id_terminal/{id_terminal}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Obtain a price history of a commodity at a specific location
     * 
     * <p><b>200</b> - OK
     * @param idTerminal  (required)
     * @param idCommodity  (required)
     * @return GetCommoditiesPricesHistoryOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommoditiesPricesHistoryOkResponse getCommoditiesPricesHistoryByTerminalAndCommodity(String idTerminal, String idCommodity) throws RestClientException {
        return getCommoditiesPricesHistoryByTerminalAndCommodityWithHttpInfo(idTerminal, idCommodity).getBody();
    }

    /**
     * Obtain a price history of a commodity at a specific location
     * 
     * <p><b>200</b> - OK
     * @param idTerminal  (required)
     * @param idCommodity  (required)
     * @return ResponseEntity&lt;GetCommoditiesPricesHistoryOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommoditiesPricesHistoryOkResponse> getCommoditiesPricesHistoryByTerminalAndCommodityWithHttpInfo(String idTerminal, String idCommodity) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idTerminal' is set
        if (idTerminal == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idTerminal' when calling getCommoditiesPricesHistoryByTerminalAndCommodity");
        }
        
        // verify the required parameter 'idCommodity' is set
        if (idCommodity == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idCommodity' when calling getCommoditiesPricesHistoryByTerminalAndCommodity");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id_terminal", idTerminal);
        uriVariables.put("id_commodity", idCommodity);

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

        ParameterizedTypeReference<GetCommoditiesPricesHistoryOkResponse> localReturnType = new ParameterizedTypeReference<GetCommoditiesPricesHistoryOkResponse>() {};
        return apiClient.invokeAPI("/commodities_prices_history/id_terminal/{id_terminal}/id_commodity/{id_commodity}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieves the UEX Commodities Average Index™ Ranking
     * 
     * <p><b>200</b> - OK
     * @return GetCommoditiesRankingOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommoditiesRankingOkResponse getCommoditiesRanking() throws RestClientException {
        return getCommoditiesRankingWithHttpInfo().getBody();
    }

    /**
     * Retrieves the UEX Commodities Average Index™ Ranking
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;GetCommoditiesRankingOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommoditiesRankingOkResponse> getCommoditiesRankingWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetCommoditiesRankingOkResponse> localReturnType = new ParameterizedTypeReference<GetCommoditiesRankingOkResponse>() {};
        return apiClient.invokeAPI("/commodities_ranking/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of prices for all raw commodities in all terminals, all at once
     * 
     * <p><b>200</b> - OK
     * @return GetCommoditiesRawPricesAllOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommoditiesRawPricesAllOkResponse getCommoditiesRawPricesAll() throws RestClientException {
        return getCommoditiesRawPricesAllWithHttpInfo().getBody();
    }

    /**
     * Retrieve a list of prices for all raw commodities in all terminals, all at once
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;GetCommoditiesRawPricesAllOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommoditiesRawPricesAllOkResponse> getCommoditiesRawPricesAllWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetCommoditiesRawPricesAllOkResponse> localReturnType = new ParameterizedTypeReference<GetCommoditiesRawPricesAllOkResponse>() {};
        return apiClient.invokeAPI("/commodities_raw_prices_all/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of prices for all unrefined (raw/ore) commodities.
     * 
     * <p><b>200</b> - OK
     * @param idCommodity  (required)
     * @return GetCommoditiesRawPricesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommoditiesRawPricesOkResponse getCommoditiesRawPricesByCommodity(String idCommodity) throws RestClientException {
        return getCommoditiesRawPricesByCommodityWithHttpInfo(idCommodity).getBody();
    }

    /**
     * Retrieve a list of prices for all unrefined (raw/ore) commodities.
     * 
     * <p><b>200</b> - OK
     * @param idCommodity  (required)
     * @return ResponseEntity&lt;GetCommoditiesRawPricesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommoditiesRawPricesOkResponse> getCommoditiesRawPricesByCommodityWithHttpInfo(String idCommodity) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idCommodity' is set
        if (idCommodity == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idCommodity' when calling getCommoditiesRawPricesByCommodity");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id_commodity", idCommodity);

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

        ParameterizedTypeReference<GetCommoditiesRawPricesOkResponse> localReturnType = new ParameterizedTypeReference<GetCommoditiesRawPricesOkResponse>() {};
        return apiClient.invokeAPI("/commodities_raw_prices/id_commodity/{id_commodity}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of prices for all unrefined (raw/ore) commodities.
     * 
     * <p><b>200</b> - OK
     * @param idTerminal  (required)
     * @return GetCommoditiesRawPricesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommoditiesRawPricesOkResponse getCommoditiesRawPricesByTerminal(String idTerminal) throws RestClientException {
        return getCommoditiesRawPricesByTerminalWithHttpInfo(idTerminal).getBody();
    }

    /**
     * Retrieve a list of prices for all unrefined (raw/ore) commodities.
     * 
     * <p><b>200</b> - OK
     * @param idTerminal  (required)
     * @return ResponseEntity&lt;GetCommoditiesRawPricesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommoditiesRawPricesOkResponse> getCommoditiesRawPricesByTerminalWithHttpInfo(String idTerminal) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idTerminal' is set
        if (idTerminal == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idTerminal' when calling getCommoditiesRawPricesByTerminal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id_terminal", idTerminal);

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

        ParameterizedTypeReference<GetCommoditiesRawPricesOkResponse> localReturnType = new ParameterizedTypeReference<GetCommoditiesRawPricesOkResponse>() {};
        return apiClient.invokeAPI("/commodities_raw_prices/id_terminal/{id_terminal}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of common routes calculated based on data reports
     * 
     * <p><b>200</b> - OK
     * @param idCommodity  (required)
     * @return GetCommoditiesRoutesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommoditiesRoutesOkResponse getCommoditiesRoutesByCommodity(String idCommodity) throws RestClientException {
        return getCommoditiesRoutesByCommodityWithHttpInfo(idCommodity).getBody();
    }

    /**
     * Retrieve a list of common routes calculated based on data reports
     * 
     * <p><b>200</b> - OK
     * @param idCommodity  (required)
     * @return ResponseEntity&lt;GetCommoditiesRoutesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommoditiesRoutesOkResponse> getCommoditiesRoutesByCommodityWithHttpInfo(String idCommodity) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idCommodity' is set
        if (idCommodity == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idCommodity' when calling getCommoditiesRoutesByCommodity");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id_commodity", idCommodity);

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

        ParameterizedTypeReference<GetCommoditiesRoutesOkResponse> localReturnType = new ParameterizedTypeReference<GetCommoditiesRoutesOkResponse>() {};
        return apiClient.invokeAPI("/commodities_routes/id_commodity/{id_commodity}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of common routes calculated based on data reports
     * 
     * <p><b>200</b> - OK
     * @param idOrbitOrigin  (required)
     * @return GetCommoditiesRoutesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommoditiesRoutesOkResponse getCommoditiesRoutesByOrbitOrigin(String idOrbitOrigin) throws RestClientException {
        return getCommoditiesRoutesByOrbitOriginWithHttpInfo(idOrbitOrigin).getBody();
    }

    /**
     * Retrieve a list of common routes calculated based on data reports
     * 
     * <p><b>200</b> - OK
     * @param idOrbitOrigin  (required)
     * @return ResponseEntity&lt;GetCommoditiesRoutesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommoditiesRoutesOkResponse> getCommoditiesRoutesByOrbitOriginWithHttpInfo(String idOrbitOrigin) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idOrbitOrigin' is set
        if (idOrbitOrigin == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idOrbitOrigin' when calling getCommoditiesRoutesByOrbitOrigin");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id_orbit_origin", idOrbitOrigin);

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

        ParameterizedTypeReference<GetCommoditiesRoutesOkResponse> localReturnType = new ParameterizedTypeReference<GetCommoditiesRoutesOkResponse>() {};
        return apiClient.invokeAPI("/commodities_routes/id_orbit_origin/{id_orbit_origin}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of common routes calculated based on data reports
     * 
     * <p><b>200</b> - OK
     * @param idPlanetOrigin  (required)
     * @return GetCommoditiesRoutesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommoditiesRoutesOkResponse getCommoditiesRoutesByPlanetOrigin(String idPlanetOrigin) throws RestClientException {
        return getCommoditiesRoutesByPlanetOriginWithHttpInfo(idPlanetOrigin).getBody();
    }

    /**
     * Retrieve a list of common routes calculated based on data reports
     * 
     * <p><b>200</b> - OK
     * @param idPlanetOrigin  (required)
     * @return ResponseEntity&lt;GetCommoditiesRoutesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommoditiesRoutesOkResponse> getCommoditiesRoutesByPlanetOriginWithHttpInfo(String idPlanetOrigin) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idPlanetOrigin' is set
        if (idPlanetOrigin == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idPlanetOrigin' when calling getCommoditiesRoutesByPlanetOrigin");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id_planet_origin", idPlanetOrigin);

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

        ParameterizedTypeReference<GetCommoditiesRoutesOkResponse> localReturnType = new ParameterizedTypeReference<GetCommoditiesRoutesOkResponse>() {};
        return apiClient.invokeAPI("/commodities_routes/id_planet_origin/{id_planet_origin}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of common routes calculated based on data reports
     * 
     * <p><b>200</b> - OK
     * @param idTerminalOrigin  (required)
     * @return GetCommoditiesRoutesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommoditiesRoutesOkResponse getCommoditiesRoutesByTerminalOrigin(String idTerminalOrigin) throws RestClientException {
        return getCommoditiesRoutesByTerminalOriginWithHttpInfo(idTerminalOrigin).getBody();
    }

    /**
     * Retrieve a list of common routes calculated based on data reports
     * 
     * <p><b>200</b> - OK
     * @param idTerminalOrigin  (required)
     * @return ResponseEntity&lt;GetCommoditiesRoutesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommoditiesRoutesOkResponse> getCommoditiesRoutesByTerminalOriginWithHttpInfo(String idTerminalOrigin) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idTerminalOrigin' is set
        if (idTerminalOrigin == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idTerminalOrigin' when calling getCommoditiesRoutesByTerminalOrigin");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id_terminal_origin", idTerminalOrigin);

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

        ParameterizedTypeReference<GetCommoditiesRoutesOkResponse> localReturnType = new ParameterizedTypeReference<GetCommoditiesRoutesOkResponse>() {};
        return apiClient.invokeAPI("/commodities_routes/id_terminal_origin/{id_terminal_origin}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Obtain a list of inventory states that are displayed at every trading terminal.
     * 
     * <p><b>200</b> - OK
     * @return GetCommoditiesStatusOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCommoditiesStatusOkResponse getCommoditiesStatus() throws RestClientException {
        return getCommoditiesStatusWithHttpInfo().getBody();
    }

    /**
     * Obtain a list of inventory states that are displayed at every trading terminal.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;GetCommoditiesStatusOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCommoditiesStatusOkResponse> getCommoditiesStatusWithHttpInfo() throws RestClientException {
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetCommoditiesStatusOkResponse> localReturnType = new ParameterizedTypeReference<GetCommoditiesStatusOkResponse>() {};
        return apiClient.invokeAPI("/commodities_status/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
