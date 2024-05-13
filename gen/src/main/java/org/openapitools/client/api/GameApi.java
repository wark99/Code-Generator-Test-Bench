package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import java.math.BigDecimal;
import org.openapitools.client.model.GetCitiesOkResponse;
import org.openapitools.client.model.GetCompaniesOkResponse;
import org.openapitools.client.model.GetFactionsOkResponse;
import org.openapitools.client.model.GetGameVersionsOkResponse;
import org.openapitools.client.model.GetItemsOkResponse;
import org.openapitools.client.model.GetMoonsOkResponse;
import org.openapitools.client.model.GetOrbitsOkResponse;
import org.openapitools.client.model.GetOutpostsOkResponse;
import org.openapitools.client.model.GetPlanetsOkResponse;
import org.openapitools.client.model.GetSpaceStationsOkResponse;
import org.openapitools.client.model.GetStarSystemsOkResponse;
import org.openapitools.client.model.GetVehiclesOkResponse;

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
public class GameApi {
    private ApiClient apiClient;

    public GameApi() {
        this(new ApiClient());
    }

    public GameApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Retrieve the list of cities within a star system.
     * 
     * <p><b>200</b> - OK
     * @param idStarSystem  (optional)
     * @return GetCitiesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCitiesOkResponse getCities(BigDecimal idStarSystem) throws RestClientException {
        return getCitiesWithHttpInfo(idStarSystem).getBody();
    }

    /**
     * Retrieve the list of cities within a star system.
     * 
     * <p><b>200</b> - OK
     * @param idStarSystem  (optional)
     * @return ResponseEntity&lt;GetCitiesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCitiesOkResponse> getCitiesWithHttpInfo(BigDecimal idStarSystem) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id_star_system", idStarSystem));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetCitiesOkResponse> localReturnType = new ParameterizedTypeReference<GetCitiesOkResponse>() {};
        return apiClient.invokeAPI("/cities/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of all companies in the Star Citizen universe.
     * 
     * <p><b>200</b> - OK
     * @param isVehicleManufacturer  (optional)
     * @return GetCompaniesOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetCompaniesOkResponse getCompanies(BigDecimal isVehicleManufacturer) throws RestClientException {
        return getCompaniesWithHttpInfo(isVehicleManufacturer).getBody();
    }

    /**
     * Retrieve a list of all companies in the Star Citizen universe.
     * 
     * <p><b>200</b> - OK
     * @param isVehicleManufacturer  (optional)
     * @return ResponseEntity&lt;GetCompaniesOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetCompaniesOkResponse> getCompaniesWithHttpInfo(BigDecimal isVehicleManufacturer) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "is_vehicle_manufacturer", isVehicleManufacturer));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetCompaniesOkResponse> localReturnType = new ParameterizedTypeReference<GetCompaniesOkResponse>() {};
        return apiClient.invokeAPI("/companies/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of all known Star Citizen factions
     * 
     * <p><b>200</b> - OK
     * @return GetFactionsOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetFactionsOkResponse getFactions() throws RestClientException {
        return getFactionsWithHttpInfo().getBody();
    }

    /**
     * Retrieve a list of all known Star Citizen factions
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;GetFactionsOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetFactionsOkResponse> getFactionsWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<GetFactionsOkResponse> localReturnType = new ParameterizedTypeReference<GetFactionsOkResponse>() {};
        return apiClient.invokeAPI("/factions/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Obtain the Star Citizen versions currently operated by UEX. It may be out of sync with Star Citizen releases sometimes.
     * 
     * <p><b>200</b> - OK
     * @return GetGameVersionsOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetGameVersionsOkResponse getGameVersions() throws RestClientException {
        return getGameVersionsWithHttpInfo().getBody();
    }

    /**
     * Obtain the Star Citizen versions currently operated by UEX. It may be out of sync with Star Citizen releases sometimes.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;GetGameVersionsOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetGameVersionsOkResponse> getGameVersionsWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<GetGameVersionsOkResponse> localReturnType = new ParameterizedTypeReference<GetGameVersionsOkResponse>() {};
        return apiClient.invokeAPI("/game_versions/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a comprehensive list of Star Citizen items, including ship components, weapons, and more.
     * 
     * <p><b>200</b> - OK
     * @param idCategory  (optional)
     * @return GetItemsOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetItemsOkResponse getItems(BigDecimal idCategory) throws RestClientException {
        return getItemsWithHttpInfo(idCategory).getBody();
    }

    /**
     * Retrieve a comprehensive list of Star Citizen items, including ship components, weapons, and more.
     * 
     * <p><b>200</b> - OK
     * @param idCategory  (optional)
     * @return ResponseEntity&lt;GetItemsOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetItemsOkResponse> getItemsWithHttpInfo(BigDecimal idCategory) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id_category", idCategory));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetItemsOkResponse> localReturnType = new ParameterizedTypeReference<GetItemsOkResponse>() {};
        return apiClient.invokeAPI("/items/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of all moons within a star system.
     * 
     * <p><b>200</b> - OK
     * @param idStarSystem  (optional)
     * @return GetMoonsOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetMoonsOkResponse getMoons(BigDecimal idStarSystem) throws RestClientException {
        return getMoonsWithHttpInfo(idStarSystem).getBody();
    }

    /**
     * Retrieve a list of all moons within a star system.
     * 
     * <p><b>200</b> - OK
     * @param idStarSystem  (optional)
     * @return ResponseEntity&lt;GetMoonsOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetMoonsOkResponse> getMoonsWithHttpInfo(BigDecimal idStarSystem) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id_star_system", idStarSystem));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetMoonsOkResponse> localReturnType = new ParameterizedTypeReference<GetMoonsOkResponse>() {};
        return apiClient.invokeAPI("/moons/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of all planets, planetoids and lagrange points orbiting a star.
     * 
     * <p><b>200</b> - OK
     * @param idStarSystem  (optional)
     * @return GetOrbitsOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetOrbitsOkResponse getOrbits(BigDecimal idStarSystem) throws RestClientException {
        return getOrbitsWithHttpInfo(idStarSystem).getBody();
    }

    /**
     * Retrieve a list of all planets, planetoids and lagrange points orbiting a star.
     * 
     * <p><b>200</b> - OK
     * @param idStarSystem  (optional)
     * @return ResponseEntity&lt;GetOrbitsOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetOrbitsOkResponse> getOrbitsWithHttpInfo(BigDecimal idStarSystem) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id_star_system", idStarSystem));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetOrbitsOkResponse> localReturnType = new ParameterizedTypeReference<GetOrbitsOkResponse>() {};
        return apiClient.invokeAPI("/orbits/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of all outposts within a star system.
     * 
     * <p><b>200</b> - OK
     * @param idStarSystem  (optional)
     * @return GetOutpostsOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetOutpostsOkResponse getOutposts(BigDecimal idStarSystem) throws RestClientException {
        return getOutpostsWithHttpInfo(idStarSystem).getBody();
    }

    /**
     * Retrieve a list of all outposts within a star system.
     * 
     * <p><b>200</b> - OK
     * @param idStarSystem  (optional)
     * @return ResponseEntity&lt;GetOutpostsOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetOutpostsOkResponse> getOutpostsWithHttpInfo(BigDecimal idStarSystem) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id_star_system", idStarSystem));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetOutpostsOkResponse> localReturnType = new ParameterizedTypeReference<GetOutpostsOkResponse>() {};
        return apiClient.invokeAPI("/outposts/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of all planets within a star system.
     * 
     * <p><b>200</b> - OK
     * @param idStarSystem  (optional)
     * @return GetPlanetsOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetPlanetsOkResponse getPlanets(BigDecimal idStarSystem) throws RestClientException {
        return getPlanetsWithHttpInfo(idStarSystem).getBody();
    }

    /**
     * Retrieve a list of all planets within a star system.
     * 
     * <p><b>200</b> - OK
     * @param idStarSystem  (optional)
     * @return ResponseEntity&lt;GetPlanetsOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetPlanetsOkResponse> getPlanetsWithHttpInfo(BigDecimal idStarSystem) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id_star_system", idStarSystem));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetPlanetsOkResponse> localReturnType = new ParameterizedTypeReference<GetPlanetsOkResponse>() {};
        return apiClient.invokeAPI("/planets/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of all space stations within a star system.
     * 
     * <p><b>200</b> - OK
     * @param idPlanet  (optional)
     * @return GetSpaceStationsOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetSpaceStationsOkResponse getSpaceStations(BigDecimal idPlanet) throws RestClientException {
        return getSpaceStationsWithHttpInfo(idPlanet).getBody();
    }

    /**
     * Retrieve a list of all space stations within a star system.
     * 
     * <p><b>200</b> - OK
     * @param idPlanet  (optional)
     * @return ResponseEntity&lt;GetSpaceStationsOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetSpaceStationsOkResponse> getSpaceStationsWithHttpInfo(BigDecimal idPlanet) throws RestClientException {
        Object localVarPostBody = null;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "id_planet", idPlanet));
        

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<GetSpaceStationsOkResponse> localReturnType = new ParameterizedTypeReference<GetSpaceStationsOkResponse>() {};
        return apiClient.invokeAPI("/space_stations/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * Retrieve a list of all star systems in the Star Citizen universe.
     * 
     * <p><b>200</b> - OK
     * @return GetStarSystemsOkResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetStarSystemsOkResponse getStarSystems() throws RestClientException {
        return getStarSystemsWithHttpInfo().getBody();
    }

    /**
     * Retrieve a list of all star systems in the Star Citizen universe.
     * 
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;GetStarSystemsOkResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetStarSystemsOkResponse> getStarSystemsWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<GetStarSystemsOkResponse> localReturnType = new ParameterizedTypeReference<GetStarSystemsOkResponse>() {};
        return apiClient.invokeAPI("/star_systems/", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
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
}
