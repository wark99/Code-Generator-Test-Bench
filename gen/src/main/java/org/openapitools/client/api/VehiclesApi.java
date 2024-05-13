package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.math.BigDecimal;
import org.openapitools.client.model.GetVehiclesLoanersOkResponse;
import org.openapitools.client.model.GetVehiclesOkResponse;
import org.openapitools.client.model.GetVehiclesPricesOkResponse;
import org.openapitools.client.model.GetVehiclesPurchasesPricesAllOkResponse;
import org.openapitools.client.model.GetVehiclesPurchasesPricesOkResponse;
import org.openapitools.client.model.GetVehiclesRentalsPricesAllOkResponse;
import org.openapitools.client.model.GetVehiclesRentalsPricesOkResponse;

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
public class VehiclesApi {
    private ApiClient apiClient;

    public VehiclesApi() {
        this(new ApiClient());
    }

    public VehiclesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve a list of Star Citizen vehicles, including spaceships and ground vehicles.
     * 
     * <p><b>200</b> - OK
     * @param idParent  (optional)
     * @return GetVehiclesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetVehiclesOkResponse getVehicles(BigDecimal idParent) throws RestClientException {
        return getVehiclesWithHttpInfo(idParent).getBody();
    }

    /**
     * Retrieve a list of Star Citizen vehicles, including spaceships and ground vehicles.
     * 
     * <p><b>200</b> - OK
     * @param idParent  (optional)
     * @return ResponseEntity&lt;GetVehiclesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetVehiclesOkResponse> getVehiclesWithHttpInfo(BigDecimal idParent) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id_parent", idParent));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetVehiclesOkResponse> localReturnType = new ParameterizedTypeReference<GetVehiclesOkResponse>() {};
        return apiClient.invokeAPI("/vehicles/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of Star Citizen vehicles loaners for a specific vehicle ID
     * 
     * <p><b>200</b> - OK
     * @param idVehicle  (required)
     * @return GetVehiclesLoanersOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetVehiclesLoanersOkResponse getVehiclesLoanersByVehicle(String idVehicle) throws RestClientException {
        return getVehiclesLoanersByVehicleWithHttpInfo(idVehicle).getBody();
    }

    /**
     * Retrieve a list of Star Citizen vehicles loaners for a specific vehicle ID
     * 
     * <p><b>200</b> - OK
     * @param idVehicle  (required)
     * @return ResponseEntity&lt;GetVehiclesLoanersOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetVehiclesLoanersOkResponse> getVehiclesLoanersByVehicleWithHttpInfo(String idVehicle) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idVehicle' is set
        if (idVehicle == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idVehicle' when calling getVehiclesLoanersByVehicle");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id_vehicle", idVehicle);

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

        ParameterizedTypeReference<GetVehiclesLoanersOkResponse> localReturnType = new ParameterizedTypeReference<GetVehiclesLoanersOkResponse>() {};
        return apiClient.invokeAPI("/vehicles_loaners/id_vehicle/{id_vehicle}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Obtain a daily updated list of vehicle prices in CIG&#39;s pledge store, managed either automatically by our bot or manually by the staff.
     * 
     * <p><b>200</b> - OK
     * @param idVehicle  (optional)
     * @return GetVehiclesPricesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetVehiclesPricesOkResponse getVehiclesPrices(BigDecimal idVehicle) throws RestClientException {
        return getVehiclesPricesWithHttpInfo(idVehicle).getBody();
    }

    /**
     * Obtain a daily updated list of vehicle prices in CIG&#39;s pledge store, managed either automatically by our bot or manually by the staff.
     * 
     * <p><b>200</b> - OK
     * @param idVehicle  (optional)
     * @return ResponseEntity&lt;GetVehiclesPricesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetVehiclesPricesOkResponse> getVehiclesPricesWithHttpInfo(BigDecimal idVehicle) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id_vehicle", idVehicle));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetVehiclesPricesOkResponse> localReturnType = new ParameterizedTypeReference<GetVehiclesPricesOkResponse>() {};
        return apiClient.invokeAPI("/vehicles_prices/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of prices for all vehicles purchases in all terminals, all at once
     * 
     * <p><b>200</b> - OK
     * @return GetVehiclesPurchasesPricesAllOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetVehiclesPurchasesPricesAllOkResponse getVehiclesPurchasesPricesAll() throws RestClientException {
        return getVehiclesPurchasesPricesAllWithHttpInfo().getBody();
    }

    /**
     * Retrieve a list of prices for all vehicles purchases in all terminals, all at once
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;GetVehiclesPurchasesPricesAllOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetVehiclesPurchasesPricesAllOkResponse> getVehiclesPurchasesPricesAllWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<GetVehiclesPurchasesPricesAllOkResponse> localReturnType = new ParameterizedTypeReference<GetVehiclesPurchasesPricesAllOkResponse>() {};
        return apiClient.invokeAPI("/vehicles_purchases_prices_all/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of all in-game vehicle purchase prices.
     * 
     * <p><b>200</b> - OK
     * @param idTerminal  (required)
     * @return GetVehiclesPurchasesPricesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetVehiclesPurchasesPricesOkResponse getVehiclesPurchasesPricesByTerminal(String idTerminal) throws RestClientException {
        return getVehiclesPurchasesPricesByTerminalWithHttpInfo(idTerminal).getBody();
    }

    /**
     * Retrieve a list of all in-game vehicle purchase prices.
     * 
     * <p><b>200</b> - OK
     * @param idTerminal  (required)
     * @return ResponseEntity&lt;GetVehiclesPurchasesPricesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetVehiclesPurchasesPricesOkResponse> getVehiclesPurchasesPricesByTerminalWithHttpInfo(String idTerminal) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idTerminal' is set
        if (idTerminal == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idTerminal' when calling getVehiclesPurchasesPricesByTerminal");
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

        ParameterizedTypeReference<GetVehiclesPurchasesPricesOkResponse> localReturnType = new ParameterizedTypeReference<GetVehiclesPurchasesPricesOkResponse>() {};
        return apiClient.invokeAPI("/vehicles_purchases_prices/id_terminal/{id_terminal}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of prices for all vehicles rentals in all terminals, all at once
     * 
     * <p><b>200</b> - OK
     * @return GetVehiclesRentalsPricesAllOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetVehiclesRentalsPricesAllOkResponse getVehiclesRentalsPricesAll() throws RestClientException {
        return getVehiclesRentalsPricesAllWithHttpInfo().getBody();
    }

    /**
     * Retrieve a list of prices for all vehicles rentals in all terminals, all at once
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;GetVehiclesRentalsPricesAllOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetVehiclesRentalsPricesAllOkResponse> getVehiclesRentalsPricesAllWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<GetVehiclesRentalsPricesAllOkResponse> localReturnType = new ParameterizedTypeReference<GetVehiclesRentalsPricesAllOkResponse>() {};
        return apiClient.invokeAPI("/vehicles_rentals_prices_all/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of all in-game vehicle rental prices.
     * 
     * <p><b>200</b> - OK
     * @param idTerminal  (required)
     * @return GetVehiclesRentalsPricesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetVehiclesRentalsPricesOkResponse getVehiclesRentalsPricesByTerminal(String idTerminal) throws RestClientException {
        return getVehiclesRentalsPricesByTerminalWithHttpInfo(idTerminal).getBody();
    }

    /**
     * Retrieve a list of all in-game vehicle rental prices.
     * 
     * <p><b>200</b> - OK
     * @param idTerminal  (required)
     * @return ResponseEntity&lt;GetVehiclesRentalsPricesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetVehiclesRentalsPricesOkResponse> getVehiclesRentalsPricesByTerminalWithHttpInfo(String idTerminal) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'idTerminal' is set
        if (idTerminal == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idTerminal' when calling getVehiclesRentalsPricesByTerminal");
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

        ParameterizedTypeReference<GetVehiclesRentalsPricesOkResponse> localReturnType = new ParameterizedTypeReference<GetVehiclesRentalsPricesOkResponse>() {};
        return apiClient.invokeAPI("/vehicles_rentals_prices/id_terminal/{id_terminal}/", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
