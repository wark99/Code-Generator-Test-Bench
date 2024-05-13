package org.openapitools.client.api;

import org.openapitools.client.ApiClient;

import org.openapitools.client.model.AllAreasModel;
import org.openapitools.client.model.AllFactsModel;
import org.openapitools.client.model.AllFrameworkModel;
import org.openapitools.client.model.AllSubAreasModel;
import org.openapitools.client.model.AreaResponseModel;
import org.openapitools.client.model.FactResponseModel;
import org.openapitools.client.model.FrameworkResponseModel;
import org.openapitools.client.model.SubAreaResponseModel;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-13T19:16:04.261563944Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class RetrieveApi {
    private ApiClient apiClient;

    public RetrieveApi() {
        this(new ApiClient());
    }

    public RetrieveApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Endpoint to get all areas
     * <p><b>200</b> - all areas available
     * @param frameworkId ID of a framework (required)
     * @return AllAreasModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AllAreasModel getAllAreas(Integer frameworkId) throws RestClientException {
        return getAllAreasWithHttpInfo(frameworkId).getBody();
    }

    /**
     * 
     * Endpoint to get all areas
     * <p><b>200</b> - all areas available
     * @param frameworkId ID of a framework (required)
     * @return ResponseEntity&lt;AllAreasModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AllAreasModel> getAllAreasWithHttpInfo(Integer frameworkId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'frameworkId' is set
        if (frameworkId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'frameworkId' when calling getAllAreas");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("framework_id", frameworkId);

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

        ParameterizedTypeReference<AllAreasModel> localReturnType = new ParameterizedTypeReference<AllAreasModel>() {};
        return apiClient.invokeAPI("/areas/{framework_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Endpoint to get all facts for a specific nace. If you dont provide nace you will get all the facts
     * <p><b>200</b> - all facts available
     * @param nace nace code. if provided gives all facts for the given nace. otherwise gives you all facts (required)
     * @param subareaId subarea ID (required)
     * @return AllFactsModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AllFactsModel getAllFacts(String nace, String subareaId) throws RestClientException {
        return getAllFactsWithHttpInfo(nace, subareaId).getBody();
    }

    /**
     * 
     * Endpoint to get all facts for a specific nace. If you dont provide nace you will get all the facts
     * <p><b>200</b> - all facts available
     * @param nace nace code. if provided gives all facts for the given nace. otherwise gives you all facts (required)
     * @param subareaId subarea ID (required)
     * @return ResponseEntity&lt;AllFactsModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AllFactsModel> getAllFactsWithHttpInfo(String nace, String subareaId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'nace' is set
        if (nace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'nace' when calling getAllFacts");
        }
        
        // verify the required parameter 'subareaId' is set
        if (subareaId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subareaId' when calling getAllFacts");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("nace", nace);
        uriVariables.put("subarea_id", subareaId);

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

        ParameterizedTypeReference<AllFactsModel> localReturnType = new ParameterizedTypeReference<AllFactsModel>() {};
        return apiClient.invokeAPI("/facts/{subarea_id}/{nace}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Endpoint to get all available framework
     * <p><b>200</b> - all frameworks available
     * @return AllFrameworkModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AllFrameworkModel getAllFrameworks() throws RestClientException {
        return getAllFrameworksWithHttpInfo().getBody();
    }

    /**
     * 
     * Endpoint to get all available framework
     * <p><b>200</b> - all frameworks available
     * @return ResponseEntity&lt;AllFrameworkModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AllFrameworkModel> getAllFrameworksWithHttpInfo() throws RestClientException {
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

        ParameterizedTypeReference<AllFrameworkModel> localReturnType = new ParameterizedTypeReference<AllFrameworkModel>() {};
        return apiClient.invokeAPI("/frameworks", HttpMethod.GET, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Endpoint to get all subareas
     * <p><b>200</b> - all areas available
     * @param areaId ID of a framework (required)
     * @return AllSubAreasModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AllSubAreasModel getAllSubAreas(Integer areaId) throws RestClientException {
        return getAllSubAreasWithHttpInfo(areaId).getBody();
    }

    /**
     * 
     * Endpoint to get all subareas
     * <p><b>200</b> - all areas available
     * @param areaId ID of a framework (required)
     * @return ResponseEntity&lt;AllSubAreasModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AllSubAreasModel> getAllSubAreasWithHttpInfo(Integer areaId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'areaId' is set
        if (areaId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'areaId' when calling getAllSubAreas");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("area_id", areaId);

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

        ParameterizedTypeReference<AllSubAreasModel> localReturnType = new ParameterizedTypeReference<AllSubAreasModel>() {};
        return apiClient.invokeAPI("/subareas/{area_id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Endpoint to get specific area by ID. You find the right ID with previous endpoint
     * <p><b>200</b> - all areas available
     * @param id ID of area. (required)
     * @return AreaResponseModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AreaResponseModel getArea(Integer id) throws RestClientException {
        return getAreaWithHttpInfo(id).getBody();
    }

    /**
     * 
     * Endpoint to get specific area by ID. You find the right ID with previous endpoint
     * <p><b>200</b> - all areas available
     * @param id ID of area. (required)
     * @return ResponseEntity&lt;AreaResponseModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AreaResponseModel> getAreaWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getArea");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<AreaResponseModel> localReturnType = new ParameterizedTypeReference<AreaResponseModel>() {};
        return apiClient.invokeAPI("/area/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Endpoint to get specific fact by ID. You find the right ID with previous endpoint
     * <p><b>200</b> - all areas available
     * @param id ID of fact. (required)
     * @return FactResponseModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FactResponseModel getFact(Integer id) throws RestClientException {
        return getFactWithHttpInfo(id).getBody();
    }

    /**
     * 
     * Endpoint to get specific fact by ID. You find the right ID with previous endpoint
     * <p><b>200</b> - all areas available
     * @param id ID of fact. (required)
     * @return ResponseEntity&lt;FactResponseModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FactResponseModel> getFactWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getFact");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<FactResponseModel> localReturnType = new ParameterizedTypeReference<FactResponseModel>() {};
        return apiClient.invokeAPI("/fact/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Endpoint to get specific framework by ID. You find the right ID with previous endpoint
     * <p><b>200</b> - framework
     * @param id ID of framework. (required)
     * @return FrameworkResponseModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FrameworkResponseModel getFramework(Integer id) throws RestClientException {
        return getFrameworkWithHttpInfo(id).getBody();
    }

    /**
     * 
     * Endpoint to get specific framework by ID. You find the right ID with previous endpoint
     * <p><b>200</b> - framework
     * @param id ID of framework. (required)
     * @return ResponseEntity&lt;FrameworkResponseModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<FrameworkResponseModel> getFrameworkWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getFramework");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<FrameworkResponseModel> localReturnType = new ParameterizedTypeReference<FrameworkResponseModel>() {};
        return apiClient.invokeAPI("/framework/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
    /**
     * 
     * Endpoint to get specific subarea by ID. You find the right ID with previous endpoint
     * <p><b>200</b> - all areas available
     * @param id ID of subarea. (required)
     * @return SubAreaResponseModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubAreaResponseModel getSubArea(Integer id) throws RestClientException {
        return getSubAreaWithHttpInfo(id).getBody();
    }

    /**
     * 
     * Endpoint to get specific subarea by ID. You find the right ID with previous endpoint
     * <p><b>200</b> - all areas available
     * @param id ID of subarea. (required)
     * @return ResponseEntity&lt;SubAreaResponseModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubAreaResponseModel> getSubAreaWithHttpInfo(Integer id) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSubArea");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);

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

        ParameterizedTypeReference<SubAreaResponseModel> localReturnType = new ParameterizedTypeReference<SubAreaResponseModel>() {};
        return apiClient.invokeAPI("/subarea/{id}", HttpMethod.GET, uriVariables, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
